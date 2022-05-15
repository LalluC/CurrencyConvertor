package com.example.currencyconverter.model


data class ApiResponse(
    val amount: String,
    val base_currency_code: String,
    val base_currency_name: String,
   var rates: HashMap<String, Rates> = HashMap(),
    val status: String,
    val updated_date: String

//    val amount: String,
//    val date: String,
//    val result: String,
//    var query: HashMap<String, Rates> = HashMap(),
//    val success: String,
//    var info: HashMap<String, Info> = HashMap()
)