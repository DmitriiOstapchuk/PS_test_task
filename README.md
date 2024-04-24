Инструкция по запуску:
1. Создать контейнер с БД. Команда для контейнеризации базы данных: docker run --name testDB -p 5434:5432 -e POSTGRES_USER=phoenix -e POSTGRES_PASSWORD=software -d postgres:11 
2. Запустить приложение (базовый URL - localhost:8080)