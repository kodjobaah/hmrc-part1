package com.shop

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by kodjobaah on 25/10/2015.
 */
class CheckoutSystemSpec  extends FlatSpec with Matchers {

  val checkoutSystem = new CheckoutSystem()

  "if list is empty" should "return £0.00 " in {

    val items: List[String] = List()

    val price = checkoutSystem.checkout(items)
    price should be === "£0.00"
  }

  "if list contains one apple" should "return £0.60 " in {

    val items: List[String] = List("Apple")

    val price = checkoutSystem.checkout(items)
    price should be === "£0.60"

  }

  "if list contains Two apples" should "return £0.60 " in {

    val items: List[String] = List("Apple","Apple")

    val price = checkoutSystem.checkout(items)
    price should be === "£0.60"

  }

  "if list contains Thee apples" should "return £1.20 " in {

    val items: List[String] = List("Apple","Apple","Apple")

    val price = checkoutSystem.checkout(items)
    price should be === "£1.20"

  }

  "if list contains one orange" should "return £0.25" in {

    val items: List[String] = List("Orange")

    val price = checkoutSystem.checkout(items)
    price should be === "£0.25"
  }

  "if list contains two oranges" should "return £0.50" in {

    val items: List[String] = List("Orange","Orange")

    val price = checkoutSystem.checkout(items)
    price should be === "£0.50"
  }

  "if list contains three oranges" should "return £0.50" in {
    val items: List[String] = List("Orange","Orange","Orange")
    val price = checkoutSystem.checkout(items)
    price should be === "£0.50"
  }

  "if list contains Four oranges" should "return £0.75" in {
    val items: List[String] = List("Orange","Orange","Orange","Orange")
    val price = checkoutSystem.checkout(items)
    price should be === "£0.75"
  }

  "if list contains 3 apples and one orange" should "return £1.45" in {
    val items: List[String] = List("Apple","Apple","Orange","Apple")
    val price = checkoutSystem.checkout(items)
    price should be === "£1.45"
  }
}

