DESCRIPTION = "ROS package that publishes the Invensense MPU-9150 data into a topic"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "roscpp rospy std-msgs"

SRC_URI = "git://github.com/vmayoral/ros-mpu9150"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit catkin
