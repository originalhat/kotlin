import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Month

class Gigasecond {
  val date: LocalDateTime

  constructor(time: LocalDate) {
    date = LocalDateTime.of(time.getYear(), time.getMonth(), time.getDayOfMonth(), 0, 0, 0).plusSeconds(1000000000)
  }

  constructor(time: LocalDateTime) {
    date = LocalDateTime.of(time.getYear(), time.getMonth(), time.getDayOfMonth(), time.getHour(), time.getMinute(), time.getSecond()).plusSeconds(1000000000)
  }
}