package com.todo.repository

import com.todo.models.Customer
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepo : CrudRepository<Customer,Long>{
   fun findbySecondName(secondname:String): Iterable<Customer>
}