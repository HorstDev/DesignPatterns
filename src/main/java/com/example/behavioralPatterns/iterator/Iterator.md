Паттерн "Итератор" предоставляет интерфейс для последовательного доступа к элементам объекта-агрегата
без раскрытия его внутренней структуры. Позволяет обходить элементы коллекции, не раскрывая подробности реализации.

### Структура:
1. Итератор. Определяет интерфейс для доступа и перебора элементов коллекции
2. Конкретный итератор. Предоставляет конкретную реализацию методов для обхода коллекции
3. Агрегат. Определяет интерфейс для создания объекта-итератора.
4. Конкретный агрегат. Реализует интерфейс агрегата, возвращая конкретный итератор для обхода элементов коллекции.

### Почему бы не использовать foreach?
* Дополнительные операции: итератор может предоставлять дополнительные методы кроме MoveNext и Current, например, Remove()
* Ручной контроль: можно управлять временем начала, остановки или сброса обхода
* Итератор может хранить свое состояние внутри, что позволяет продолжить обход с того момента, где он был приостановлен при следующем вызове MoveNext.
  Короче итератор вместо foreach применяем, когда требуется больше гибкости