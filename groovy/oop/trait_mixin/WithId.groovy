package oop.trait_mixin

trait WithId {
    Integer id

    def validate() {
        id > 0
    }

}