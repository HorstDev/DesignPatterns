Паттерн "Цепочка обязанностей" позволяет передавать запросы последовательно по цепочке обработчиков.
Каждый обработчик решает, может ли он обработать запрос, и либо обрабатывает его, либо передает следующему обработчику в цепочке.

### Структура
1. Обработчик. Определяет интерфейс для обработки запроса и содержит ссылку на следующий обработчик
2. Конкретный обработчик. Реализует интерфейс и решает, может ли он обработать запрос. Если не может, передает его следующему
3. Клиент. Отправляет запрос обработчику в цепочке

Причины использования паттерна:
1. Избегание жесткой зависимости между отправителем запроса и получателем (отправитель не знает, какой обработчик обработает его запрос)
2. Гибкость: Цепочка обработчиков легко расширяется и модифицируется
3. Соблюдается принцип open-closed
4. Разделение обязанностей: у каждого обработчика есть свои обязанности, и в зависимости от обязанностей обрабатывается запрос