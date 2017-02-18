import smtplib
import RPi.GPIO as GPIO
import time
import os
from email.mime.text import MIMEText
from email.mime.image import MIMEImage
from email.mime.multipart import MIMEMultipart
import pygame

GPIO.setwarnings(False)
GPIO.setmode(GPIO.BOARD)
GPIO.setup(7,GPIO.OUT)
GPIO.setup(11,GPIO.IN)
fromaddr = 'jay.mohta@gmail.com'
toaddrs  = 'himolshah98@gmail.com'



# Credentials (if needed)
username = 'jay.mohta@gmail.com'
password = 'jay11#mohta'
i=0
j=0
while True:
    j=i
    i=GPIO.input(11)
    if(j==0):
        if(i==1):
            GPIO.output(7,1)
            pygame.mixer.init()
            pygame.mixer.music.load()
            pygame.mixer.music.play("tone.mp3")
            os.system("fswebcam -r 1280*720 image.jpg")
            img_data=open('image.jpg','rb').read()
            msg=MIMEMultipart()
            msg['Subject']='Security Breach At Room400'
            msg['From']='jay.mohta@gmail.com'
            msg['To']='rupa.mohta@gmail.com'
            text=MIMEText('There was a Drashti Lotia at your plce')
            msg.attach(text)
            image=MIMEImage(img_data,name=os.path.basename('image.jpg'))
            msg.attach(image)
            
            server = smtplib.SMTP('smtp.gmail.com:25')
            server.starttls()
            server.login(username,password)
            server.sendmail(fromaddr, toaddrs, msg.as_string())
            server.quit()
            
            time.sleep(0.1)
        elif(i==0):
            GPIO.output(7,0)
    elif(j==1):
        if(i==1):
            GPIO.output(7,1)
        elif(i==0):
            GPIO.output(7,0)