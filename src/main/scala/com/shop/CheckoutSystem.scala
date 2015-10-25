package com.shop

import scala.collection.immutable.HashMap

/**
 * Created by kodjobaah on 25/10/2015.
 */
class CheckoutSystem {

  val CostOfApple = 0.6
  val CostOfOrange = 0.25
  def checkout(items: List[String]) : String = {


    val itemsCount: Map[String,Int] = countItems(items)
    val total: Double = calcTotal(itemsCount)
    return "£%.2f".format(total)
  }

  private def calcTotal(items: Map[String,Int]): Double = {
    var total = 0.0

    for((item,count) <- items) {
      val cost =  item match {
        case "Apple" =>
          count * CostOfApple
        case "Orange" =>
            count * CostOfOrange
        case _ => 0.0
      }
      total = total + cost
    }
    total
  }

  private def countItems(items: List[String]): Map[String,Int] = {

    val countOfItems = new scala.collection.mutable.HashMap[String, Int]

    for(item <- items) {
      val count = countOfItems get item
      val curCount = count.getOrElse(0) + 1
      countOfItems += item -> curCount
    }

    countOfItems.toMap
  }
}
