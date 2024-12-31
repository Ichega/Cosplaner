package ru.yatsevyukcompany.testrecycle.Repository

import ru.yatsevyukcompany.testrecycle.Domain.OngoingDomain

class MainRepository {
    val items = listOf(
        OngoingDomain("Лайтер", 100,"pin"),
        OngoingDomain("Мияби", 50,"pin1"),
        OngoingDomain("Джейн Доу",70,"pin2"),
        OngoingDomain("Бёрнис", 20,"pin3"),
        OngoingDomain("Авантюрин",10,"pin4")
    )
}