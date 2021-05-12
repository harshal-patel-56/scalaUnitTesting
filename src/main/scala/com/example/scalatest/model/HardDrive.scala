package com.example.scalatest.model

class HardDrive(
                 var name: String = "",
                 var totalSize: Double = 0,
                 var occupiedSize: Double = 0,
                 var currentRpm: Double = 0,
                 var maxRpm: Double = 0
               ) {

  def startHardDrive(rpm: Double): Unit = {
    if(rpm <= maxRpm) {
      this.currentRpm = rpm
    }
  }

  def writeData(dataSize: Double): Boolean = {
    if (occupiedSize + dataSize <= totalSize) {
      occupiedSize += dataSize
      return true
    }
    false
  }

  def readData(): Double = {
    occupiedSize
  }

  override def toString = s"HardDrive($name, $totalSize TB, $occupiedSize TB, $currentRpm, $maxRpm)"
}
