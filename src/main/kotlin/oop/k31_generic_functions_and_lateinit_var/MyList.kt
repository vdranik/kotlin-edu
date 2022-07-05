package kotl.oop.k31_generic_functions_and_lateinit_var

interface MyList<T>{
    fun get(index: Int): T
    fun add(string: T)
    fun remove(element: T)
    fun removeAt(index: Int)
    fun size(): Int
}