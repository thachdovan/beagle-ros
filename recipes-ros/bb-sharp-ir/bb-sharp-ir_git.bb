DESCRIPTION = "ROS package for the BeagleBone that processes the Sharp IR sensor data and publishes it to a topic."
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "rospy std-msgs"

SRC_URI = "git://github.com/vmayoral/bb_sharp_ir"

SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

inherit catkin
