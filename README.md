# Домашнее задание к занятию 3.2: Volatile, threadlocal atomics
## Задача 2: Отчет для налоговой

### Описание
У вас есть 3 магазина в городе, которые продают продукты. Вам нужно каждый день при закрытии кассы подавать общий отчет в налоговую службу по своим магазинам. Так как магазины закрываются одновременно - выручка тоже считается одновременно по всем магазинам.

### Работа программы
1. Генерация 3 массивов целых положительных чисел
2. Создание трех потоков, которые суммируют выручку (каждый по своему массиву) в общий отчет
3. Главный поток ждет завершения всех рассчетов и печатает общий итог в консоль
