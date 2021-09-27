**Задание 2**

Reflection API.

Создать свой класс Person с полями:
    
    firstName
    lastName
    age
    dateOfBirth

Добавить класс User, который наследуется от 
Person, с полями:

    login
    password
    email

Добавить гетеры, сетеры. Добавить метод
printUserInfo в User. Вывести с помощью рефлексии
все поля и методы, сначала через:

    getMethod("name")
    getMethods()
    getField("name"),
    getFields()

а затем через:

    getDeclaredMethod("name")
    getDeclaredMethods()
    getDeclaredField("name")
    getDeclaredFields()

Посмотреть разницу. Просетать все значения через
Reflection (set метод класса Field). Вывести значения
полей через Reflection (get метод класса Field). Вызвать
toString через invoke.