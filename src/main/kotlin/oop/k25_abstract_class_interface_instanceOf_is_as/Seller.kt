package kotl.oop.k25_abstract_class_interface_instanceOf_is_as

// продавца наделили способностью убирать
class Seller(name: String, age: Int) : Worker(name, age), Cleaner {

    override fun breakTime() {
        println("Drinking alcohol")
    }

    override fun clean() {
        println("Seller cleaning...")
    }
}
