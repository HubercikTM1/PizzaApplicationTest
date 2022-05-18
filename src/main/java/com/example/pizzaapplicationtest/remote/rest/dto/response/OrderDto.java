package com.example.pizzaapplicationtest.remote.rest.dto.response;

import com.example.pizzaapplicationtest.domain.model.OrderStatusType;
import com.example.pizzaapplicationtest.remote.rest.dto.request.PersonOrderDto;
import com.example.pizzaapplicationtest.remote.rest.dto.request.PizzaOrderDto;

import java.util.List;

public class OrderDto {

    private Integer id;
    private OrderStatusType status;
    private List<PizzaOrderDto> pizzas;
    private PersonOrderDto person;

    public OrderDto() {
    }

    public OrderDto(Integer id, OrderStatusType status, List<PizzaOrderDto> pizzas, PersonOrderDto person) {
        this.id = id;
        this.status = status;
        this.pizzas = pizzas;
        this.person = person;
    }

}
