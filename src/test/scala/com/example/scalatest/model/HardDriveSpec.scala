package com.example.scalatest.model

import org.scalatest.FlatSpec

class HardDriveSpec extends FlatSpec {

  var hardDrive = new HardDrive(
    name = "test",
    totalSize = 1,
    maxRpm = 1000
  )

  behavior of "HardDrive"

  it should "not have occupiedSize and should have totalSize > 0" in {
    assert(hardDrive.occupiedSize === 0)
    assert(hardDrive.totalSize > 0)
  }

  it should "should have maxRpm > 0" in {
    assert(hardDrive.maxRpm > 0)
  }

  it should "start the hard drive if running rpm are less than maxRpm" in {
    hardDrive.startHardDrive(1000)
    assert(hardDrive.currentRpm > 0)
    hardDrive.startHardDrive(1000)
    assert(hardDrive.currentRpm > 0)
  }

  it should "read/write data" in {
    assert(hardDrive.writeData(0.5))
    assert(hardDrive.readData() === 0.5)
    assert(!hardDrive.writeData(0.51))
  }

}
