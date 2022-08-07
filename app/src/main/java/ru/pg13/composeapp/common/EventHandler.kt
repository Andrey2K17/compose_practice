package ru.pg13.composeapp.common

interface EventHandler<E> {

    fun obtainEvent(event: E)
}