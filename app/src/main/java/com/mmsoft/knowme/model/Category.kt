package com.mmsoft.knowme.model

class Category {

    var id=""
    var tittle=""
    var desc=""
    var imagePath=""


    constructor(id: String, tittle: String, desc: String, imagePath: String) {
        this.id = id
        this.tittle = tittle
        this.desc = desc
        this.imagePath = imagePath
    }
}