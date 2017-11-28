class Hamming {
  companion object {
    fun compute(firstSeqeunce: String, secondSequence: String): Int {
      if (firstSeqeunce.length != secondSequence.length) {
        throw IllegalArgumentException("left and right strands must be of equal length.")
      }

      return firstSeqeunce.zip(secondSequence).filter { it.first != it.second }.count()
    }
  }
}
