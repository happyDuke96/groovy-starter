package DSL

import groovy.transform.ToString

@ToString
class BodySpecification {
    String text
    List<String> images = []


    def text(String text) {
        this.text = text
    }

    def images(String... images) {
        this.images(images)
    }

    def images(List<String> images) {
        this.images += images
    }

    def image(String image) {
        this.images << image
    }
}
