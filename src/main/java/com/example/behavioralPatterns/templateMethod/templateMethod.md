Паттерн "Шаблонный метод" определяет структуру алгоритма, но делегирует некоторые шаги подклассам.
Таким образом, он позволяет подклассам переопределять определенные шаги без изменения структуры
Т.е. шаблонный метод определяет структуру (шаблон), где некоторые шаги могут изменяться подклассами.

### Структура:
1. Абстрактный класс. Определяет скелет алгоритма в виде шаблонного метода
2. Конкретный класс. Реализует конкретные шаги алгоритма, которые нужны для этого подкласса