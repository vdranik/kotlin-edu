package kotl.oop.k30_generics

import java.lang.IndexOutOfBoundsException
import java.util.*

class MyArrayList<T> : MyList<T> {          // реализует интерфейс
    var array = arrayOfNulls<Any>(10)  // основан на массиве типа Any (нельзя написать <T>, т.к. при создании массива нужно выделить памяти)
    var size = 0                            // кол. хранимых элементов

    override fun get(index: Int): T {
        if (index in 0 until size) {  // проверка индекса в допустимых пределах от 0 до 10
            array[index]?.let { return it as  T}  // нужно явно привести к типу ЕТ
        }
        throw IndexOutOfBoundsException()
    }

    override fun add(string: T) {
        if (size >= array.size) {
            array = Arrays.copyOf(array, array.size * 2) // создаем новый массив в 2 раза больше с копией старых элементов
        }
        array[size] = string
        size++
    }

    override fun remove(element: T) {
        for ((index, string) in array.withIndex()) { // нужно найти индекс удаляемого элемента
            if (string == element) {
                removeAt(index)
                return
            }
        }
    }

    override fun removeAt(index: Int) {             // например, хотим удалить элемент с индексом 6
        if (index in 0 until size) {          // проверка на допустимость пределов
            for (i in index until size - 1) { // пройдемся по всем индексам начиная с индекса 6, и элементу с индексом 6 присвоим значение из индекса 7, таким способом сдвинем все элементы (правую часть) на 1 позицию
                array[i] = array[i + 1]
            }
            size--                                  // уменьшаем size на 1
        } else {
            throw IndexOutOfBoundsException()
        }
    }

    override fun size(): Int {
        return size
    }
}
