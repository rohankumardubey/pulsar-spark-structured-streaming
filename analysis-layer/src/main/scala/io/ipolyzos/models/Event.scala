package io.ipolyzos.models

import java.sql.Timestamp

case class Event(userid: String,
                 eventTime: Long,
                 eventType: String,
                 productId: String,
                 categoryId: String,
                 categoryCode: String,
                 brand: String,
                 price: Double,
                 userSession: String)

case class AnalysisEvent(userSession: String, userId: String, eventTime: Timestamp, eventType: String)

object Event {
  def emptyEvent(): Event = Event("", 0L, "" , "", "", "", "", 0.0, "")
}
