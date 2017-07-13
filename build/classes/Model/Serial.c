#include <string.h>
#include <stdlib.h> 
#include <stdio.h>
#include <unistd.h>
#include <fcntl.h>
#include <termios.h>
#include "Serial.h"	
	
struct termios tio;
struct termios stdio;
int tty_fd; 
fd_set rdset;
unsigned char c = 'D';

	JNIEXPORT jint JNICALL Java_Serial_openPort (JNIEnv *env, jobject obj){
  			stdio.c_iflag = 0;
        stdio.c_oflag = 0;
        stdio.c_cflag = 0;
        stdio.c_lflag = 0;
        stdio.c_cc [VMIN] = 1;
        stdio.c_cc [VTIME] = 0;
        tcsetattr(STDOUT_FILENO, TCSANOW, &stdio);
        tcsetattr(STDOUT_FILENO, TCSAFLUSH, &stdio);
        fcntl(STDIN_FILENO, F_SETFL, O_NONBLOCK); 
 
        memset (&tio, 0, sizeof (tio)); 
        tio.c_iflag = 0;
        tio.c_oflag = 0;
        tio.c_cflag = CS8 | CREAD | CLOCAL; // 8n1, see termios.h for more information
        tio.c_lflag = 0;
        tio.c_cc [VMIN] = 1; 
        tio.c_cc [VTIME] = 5;
 
        tty_fd = open ("/dev/ttyUSB0", O_RDWR | O_NONBLOCK);
        if (tty_fd < 0){
        	return -1;
        }
        cfsetospeed (&tio, B115200); // 115200 baud
        cfsetispeed (&tio, B115200); // 115200 baud
 
        tcsetattr (tty_fd, TCSANOW, &tio); 
        
        
        return tty_fd;
        
  }
  
  JNIEXPORT void JNICALL Java_Serial_write  (JNIEnv *env, jobject obj, jbyteArray msg){
  	int i = 0;
  	jsize len = (*env)->GetArrayLength(env,msg);
  	jbyte *body = (*env)->GetByteArrayElements(env,msg,0);
  	for (i;i <len;i++)
  	{
  		c = body[i];
  		if (c != 'q')
  			write(tty_fd,&c,1);
  	}
  }
  
  JNIEXPORT jbyteArray JNICALL Java_Serial_read  (JNIEnv *env, jobject obj){
		jbyteArray msg = (*env)->NewByteArray(env,4);
		size_t i;
		 
    
			for (i=0; i < 4; )
			{
    				if (read(tty_fd,&c,1)>0) 
    				{
    					(*env)->SetByteArrayRegion(env,msg, i,1,&c );
    					++i;
    				}
			}
    
    
    return msg;
  }
  
  JNIEXPORT void JNICALL Java_Serial_closePort
  (JNIEnv *env, jobject obj){
  	close(tty_fd);
  }
  
  void main (){}
