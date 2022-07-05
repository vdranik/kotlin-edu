package kotl.oop.k31_generic_functions_and_lateinit_var

import java.lang.IndexOutOfBoundsException
import java.util.*

class MyArrayList<T> : MyList<T> {
    var array = arrayOfNulls<Any>(10)
    var size = 0

    companion object{  // гибкая функция с передачей элементов в массив (пример listOf())
        fun<E> myListOf(vararg elements: E): MyArrayList<E> {
            val list = MyArrayList<E>()
            for (element in elements){
                list.add(element)
            }
            return list
        }
    }

    override fun get(index: Int): T {
        if (index in 0 until size) {
            array[index]?.let { return it as T}
        }
        throw IndexOutOfBoundsException()
    }

    override fun add(string: T) {
        if (size >= array.size) {
            array = Arrays.copyOf(array, array.size * 2)
        }
        array[size] = string
        size++
    }

    override fun remove(element: T) {
        for ((index, string) in array.withIndex()) {
            if (string == element) {
                removeAt(index)
                return
            }
        }
    }

    override fun removeAt(index: Int) {
        if (index in 0 until size) {
            for (i in index until size - 1) {
                array[i] = array[i + 1]
            }
            size--
        } else {
            throw IndexOutOfBoundsException()
        }
    }

    override fun size(): Int {
        return size
    }
}
