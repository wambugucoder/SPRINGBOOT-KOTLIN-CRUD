package com.todo.todo.Controller

import com.todo.todo.models.Customer
import com.todo.todo.repository.CustomerRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class Controller{

    @Autowired
    lateinit var repo:CustomerRepo




    @RequestMapping("/save")
    fun saveCustomer():String{
        repo.save(Customer("Jos","Wambugu"))
        repo.save(Customer("IAM","YOU"))
        return "done"


    }
    @RequestMapping("/all")
    fun findAll() =repo.findAll()

    @RequestMapping("/findid/{id}")
    fun findbyid( @PathVariable id :Long): Optional<Customer> {
        return  repo.findById(id)
    }

    @RequestMapping("/find/{secondName}")
    fun findSecond(@PathVariable secondName:String) = repo.findBySecondName(secondName)

}