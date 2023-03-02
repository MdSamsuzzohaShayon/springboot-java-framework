package com.tss.shayon.orderservice.controller;

import com.tss.shayon.orderservice.dto.OrderRequest;
import com.tss.shayon.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/*
 * ===========================================================
 * ALL API ENDPOINTS
 * */
@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        orderService.placeOrder(orderRequest);
        return  "Order placed successfully";
    }
}