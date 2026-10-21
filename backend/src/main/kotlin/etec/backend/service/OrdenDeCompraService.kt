package etec.backend.service

data class Item(val item: String, val precio: Int)
class OrdenDeCompra() {
    fun agregarItem(unItem: Item) {
        this.items.add(unItem)
    }
}
