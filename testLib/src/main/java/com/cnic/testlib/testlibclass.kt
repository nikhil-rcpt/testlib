package com.cnic.testlib


sealed class TestLibClass(var id : Int = 0){
    object AType : TestLibClass(1)
}