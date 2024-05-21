
1) Створюємо Maven-проект.

2) В pom.xml підтягуємо залежності.

3) В org/example/server
формуємо пакети, класи.

4) Запускаємо (для генерування WSDL-файлу)
org.example.server.ServerApp

5) Генеруємо WSDL-файл.

Варіант 1. В браузері запускаємо
http://localhost:8080/ws/data
Маємо отримати:
1) INFO/img_01.png
2) INFO/img_02.png

WSDL-файл INFO/WSDL.xml

Варіант 2. В Postman (https://www.postman.com/),
через GET-запит, запустити
http://localhost:8080/ws/data

6) В org/example/client
формуємо пакети, класи.

7) Запускаємо
org.example.client.ClientApp

8) Перевіряємо роботу програми.
Робимо відповідний запит с клієнта на сервер.
За відповідного запиту, клієнт отримує певну
відповідь сервера.


РЕСУРСИ
https://javaee.github.io/metro-jax-ws/
https://www.baeldung.com/jax-ws
