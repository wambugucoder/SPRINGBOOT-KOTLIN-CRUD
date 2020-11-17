package com.todo.Controller

import com.todo.models.Customer
import com.todo.repository.CustomerRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller{

    @Autowired
    lateinit var repo:CustomerRepo

    @GetMapping("/hello/{name}")
    fun get(@PathVariable name: String) = "Hello, $name"


    @RequestMapping("/save")
    fun saveCustomer():String{
        repo.save(Customer("Jos","Wambugu"))
        repo.save(Customer("IAM","YOU"))
        return "done"


    }
    @RequestMapping("/all")
    fun findAll() =repo.findAll()

    @RequestMapping("/find/{id}")
    fun findbyid( @PathVariable id :Long) =repo.findById(id)

    @RequestMapping("/find/{secondname}")
    fun findSecond(@PathVariable secondname:String) = repo.findbySecondName(secondname)

}