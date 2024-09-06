package il.ac.hit.validation

class Valid extends ValidationResult {
  override def isValid: Boolean = true
  override def getReason: Option[String] = None
}

class Invalid extends ValidationResult {
  override def isValid: Boolean = false  // Validation failed
  override def getReason: Option[String] = Some("unknown yet.")  // Provide failure reason
}