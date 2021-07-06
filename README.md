# spring-boot-sms-notification<br/><br/>
This project based on **Spring Boot Maven** to send free **SMS Notification** using **Twillo**.<br/><br/> 
Twillo is a third party tool that provides features like **making a voice call** and **sending SMS**. At first you need to **Sing Up** an account in [Twillo](https://www.twilio.com/try-twilio). After completing sing up, Go to the Twillo **Dashboard** and get your credentials such as **Accont SID** and **Authentication Token**.<br/><br/>

![Twillo Dashboard](https://user-images.githubusercontent.com/27615818/124633736-67f5d180-dea7-11eb-9784-92b2a563078a.jpg) <br/><br/><br/>


You need to verify a cell-phone so that the message from Twillo can be received. Also get your **Twillo Generated Number**. After getting all these, put these to the  **SMSServiceImpl** class and specified the message you want to send.<br/><br/>
Import this **Maven** project any IDE and run. The projec is running on default Spring Boot port on **localhost** is **8080**. Hit the url  `http://localhost:8080/sendSMS` and the specified message is send to your cell phone and you will get this response in **postman**.<br/>

![sms_postman_response](https://user-images.githubusercontent.com/27615818/124635591-6cbb8500-dea9-11eb-82ef-594a50060015.jpg)

