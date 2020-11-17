package com.todo.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Customer(
        val firstname:String,
        val secondname:String,
        @Id @GeneratedValue(strategy=GenerationType.AUTO)
        val id:Long=-1,
) {


    private constructor():this("","")
}