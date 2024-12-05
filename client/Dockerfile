# Указываем базовый образ с JDK 17
FROM openjdk:17-jdk-slim

# Устанавливаем рабочую директорию
WORKDIR /app

# Копируем исполняемый JAR-файл клиента
COPY target/client-1.0-SNAPSHOT.jar client.jar

# Указываем порт, если требуется (например, для будущих настроек)
# EXPOSE 9090 (по необходимости, если клиент имеет свои REST-сервисы)

# Команда для запуска клиента
ENTRYPOINT ["java", "-jar", "client.jar"]

