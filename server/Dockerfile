# Указываем базовый образ с JDK 17
FROM openjdk:17-jdk-slim

# Устанавливаем рабочую директорию в контейнере
WORKDIR /app

# Копируем исполняемый JAR-файл приложения в контейнер
COPY target/server-1.0-SNAPSHOT.jar server.jar

# Указываем порт, на котором будет работать приложение
EXPOSE 8082

# Команда для запуска приложения
ENTRYPOINT ["java", "-jar", "server.jar"]

