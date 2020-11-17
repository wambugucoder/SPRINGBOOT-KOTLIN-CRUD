package com.todo.todo.repository

import com.todo.todo.models.Customer
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepo : CrudRepository<Customer,Long>{
  fun findBySecondName(secondName: String ): Iterable<Customer>


}