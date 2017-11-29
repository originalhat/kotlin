import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Month

class Gigasecond(ld: LocalDate) {
  val date = LocalDateTime.of(ld.getYear(), ld.getMonth(), ld.getDayOfMonth(), 0, 0, 0).plusSeconds(1000000000)
}