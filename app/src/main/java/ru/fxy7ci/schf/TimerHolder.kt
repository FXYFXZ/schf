package ru.fxy7ci.schf

class TimerHolder (// Заданная температура
    var temperature: Byte = 20, // заданная температура
    var timeDecMins: Byte = 10) {
    var downCounter: Int = 0
}