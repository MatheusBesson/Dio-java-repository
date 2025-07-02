public class Car {
    // properties
    boolean isOn;
    int speed;
    String direction;
    int gear;

    // contructor
    public Car() {
        this.isOn = false;
        this.speed = 0;
        this.gear = 0;
    }

    // getters and setters


    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    // car functions ------------------------------------------------
    String stringMain = "";
    String stringVelo = "";
    String stringGear = "";

    public String startAuto() {
        if (isOn()) {
            stringMain = String.format("The car is already ON.\n");
        } else {
            setOn(true);
            stringMain = String.format("The car engine is ON, you can start driving now!\n");
        }
        return stringMain;

    }

    public String turnOffCar() {
        if (!isOn()) {
            stringMain = "The car engine is already OFF.\n";
        } else {
            setOn(false);
            stringMain = String.format("You turned OFF the car engine.\n");
        }
        return stringMain;
    }

    public String accelerate() {
        if (!isOn()) {
            stringVelo = "The car engine is off, start the car to do any action!\n";
        } else if (getGear() == 0) {
            stringVelo = "You can't accelerate in neutral gear (0). \nPutting car into gear 1..\n";
            setGear(1);
        } else if (getSpeed() >= 120) {
            stringVelo = "You have reached the speed limit (120 km/h).\n";
        } else {
            setSpeed(getSpeed() + 5);
            // forcing speed to 120 km/h if it tries to go further
            if (getSpeed() > 120) {
                setSpeed(120);
                accelerate();
            }

            if (getSpeed() > 20) {
                changeGear(2);
            }
            if (getSpeed() > 40) {
                changeGear(3);
            }
            if (getSpeed() > 60) {
                changeGear(4);
            }
            if (getSpeed() > 80) {
                changeGear(5);
            }
            if (getSpeed() > 100) {
                changeGear(6);
            }

            stringVelo = String.format("Accelerating.. \n" +
                    "You are going %s km/h. (On gear %s) \n", getSpeed(), getGear());
        }
        return stringVelo;
    }

    public String decreaseSpeed() {
        if (!isOn()) {
            stringVelo = "The car engine is off, start the car to do any action!\n";
        }
        if (getSpeed() >= 0) {
            setSpeed(getSpeed() - 5);
        }
        if (getSpeed() >= 120) {
            changeGear(6);
        }
        if (getSpeed() > 100) {
            changeGear(6);
        }
        if (getSpeed() > 80) {
            changeGear(5);
        }
        if (getSpeed() > 60) {
            changeGear(4);
        }
        if (getSpeed() > 40) {
            changeGear(3);
        }
        if (getSpeed() > 20) {
            changeGear(2);
        }
        if (getSpeed() < 20) {
            changeGear(1);
        }
        if (getSpeed() <= 0) {
            changeGear(0);
        }

        stringVelo = String.format("Slowing down.. \n" +
                "You are going %s km/h. (On gear %s) \n", getSpeed(), getGear());

        if (getSpeed() < 0) {
            stringVelo = "The car already stopped.\n";
            setSpeed(0);
        }
        return stringVelo;
    }


    public String turnLeft() {
        if (!isOn()) {
            stringMain = "The car engine is off, start the car to do any action!\n";
        }
        if (getSpeed() == 0) {
            stringMain = "You need to get some speed before turning.. \n";
        }
        if (getSpeed() >= 1 && getSpeed() <= 40) {
            stringMain = String.format("You turned left.   <--\n");
        } else {
            stringMain = String.format("[WARNING] Slow down!" +
                    "\nYou can only turn safe if you are between [1 km/h] and [40 km/h].\n");
        }
        return stringMain;
    }

    public String turnRight() {
        if (!isOn()) {
            stringMain = "The car engine is off, start the car to do any action!\n";
        }
        if (getSpeed() == 0) {
            stringMain = "You need to get some speed before turning.. \n";
        }
        if (getSpeed() >= 1 && getSpeed() <= 40) {
            stringMain = String.format("You turned right.   -->\n");
        }
        return stringMain;
    }

    public String checkVelo() {
        if (getSpeed() == 0) {
            stringVelo = String.format("The car is stopped\n");
        } else {
            stringVelo = String.format("The car velocity is %s km/h.\n", getSpeed());
        }
        return stringVelo;
    }

    public int changeGear(int num) {
        if (!isOn()) {
            System.out.println("The car engine is off, start the car to do any action!\n");
        } else {
            if (getGear() == 0) {
                setGear(0);
            } else if (getSpeed() <= 20) {
                setGear(1);
            } else if (getSpeed() <= 40) {
                setGear(2);
            } else if (getSpeed() <= 60) {
                setGear(3);
            } else if (getSpeed() <= 80) {
                setGear(4);
            } else if (getSpeed() <= 100) {
                setGear(5);
            } else if (getSpeed() <= 120) {
                setGear(6);
            }
        }
        return getGear();
    }
}



