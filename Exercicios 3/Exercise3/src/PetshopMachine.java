public class PetshopMachine {
    private boolean petClean;
    private boolean petShowering;
    private boolean petInPosition;
    private int water;
    private int shampoo;
    private boolean machineClean;

    String string;
    boolean flag;

    // constructor ------------------------------------------

    public PetshopMachine() {
        this.petClean = false;
        this.petShowering = false;
        this.petInPosition = false;
        this.water = 30;
        this.shampoo = 10;
        this.machineClean = true;
    }


    // Getters and Setters ----------------------------------


    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    private int getShampoo() {
        return shampoo;
    }

    private void setShampoo(int shampoo) {
        this.shampoo = shampoo;
    }

    private int getWater() {
        return water;
    }

    private void setWater(int water) {
        this.water = water;
    }

    private boolean isPetClean() {
        return petClean;
    }

    private void setPetClean(boolean petClean) {
        this.petClean = petClean;
    }

    private boolean isPetShowering() {
        return petShowering;
    }

    private void setPetShowering(boolean petShowering) {
        this.petShowering = petShowering;
    }

    private boolean isPetInPosition() {
        return petInPosition;
    }

    private void setPetInPosition(boolean petInPosition) {
        this.petInPosition = petInPosition;
    }


    private boolean isMachineClean() {
        return machineClean;
    }

    private void setMachineClean(boolean machineClean) {
        this.machineClean = machineClean;
    }


    // functions -------------------------------------------

    public String showerPet() {
        if (isPetShowering()) {
            string = ("There is already a pet showering. Wait for your turn!\n");
        }
        if (!isPetInPosition()) {
            string = ("First put pet in position to shower on the machine.\n");
        }
        if (isPetInPosition() && !isPetShowering()) {
            if (!isFlag()) {
                if (getWater() > 10 && getShampoo() > 2) {
                    if (isMachineClean()) {
                        setPetShowering(true);
                        System.out.println("The shower has started.. \n");
                        setWater(getWater() - 10);
                        setShampoo(getShampoo() - 2);
                        setMachineClean(false);

                        string = String.format("[Finished] Pet was cleaned!       -10 water liters \n" +
                                "                                  -2 shampoo liters. \n");
                        setPetShowering(false);
                        setMachineClean(false);
                        setFlag(true);
                    } else {
                        string = "The machine needs to be clean before put a new pet on it.\n";
                    }
                } else {
                    string = String.format("The machine doesn't has enough properties to work. \n" +
                            "water: %s (10 liters needed) \n" +
                            "shampoo : %s (2 liters needed)\n", getWater(), getShampoo());
                }
            } else {
                string = "First you need to remove the pet from the machine.\n";
            }
        }
        return string;
    }

    public String verifyWaterLevel() {
        string = String.format("Water level is %s.     (max 30 liters.)\n", getWater());
        return string;
    }

    public String verifyShampooLevel() {
        string = String.format("Shampoo level is %s.     (max 10 liters.)\n", getShampoo());
        return string;
    }

    public String supplyWater() {
        if (getWater() >= 30) {
            string = "The water tank is full.\n";
        } else {
            setWater(getWater() + 2);
            string = "The tank was supplied with 2 water liters.\n";
        }
        return string;
    }

    public String supplyShampoo() {
        if (getShampoo() >= 10) {
            string = "The shampoo tank is full.\n";
        } else {
            setShampoo(getShampoo() + 2);
            string = "The tank was supplied with 2 shampoo liters.\n";
        }
        return string;
    }

    public String verifyPetShowering() {
        if (isPetShowering()) {
            string = "Pet is showering.\n";
        } else {
            string = "There is no pet showering in this moment.\n";
            if (isPetInPosition()) {
                System.out.println("There is one pet in position for shower.\n");
            }
        }
        return string;
    }

    public String putPetInPosition() {
        if (isMachineClean()) {
            if (!isPetInPosition()) {
                string = "Pet is now positioned on the machine.\n";
                setPetInPosition(true);
            } else {
                string = "Pet is already in position.\n";
            }
        } else {
            string = "The machine needs to be clean before put a pet on it. \n";
        }
        return string;
    }

    public String removePetPosition() {
        if (isPetInPosition() && !isPetShowering() && isFlag()) {
            string = "Pet was removed of position. \n";
            setPetInPosition(false);
            setFlag(false);
        }
        if (isPetInPosition() && !isPetShowering() && !isFlag()) {
            string = "Pet was removed of position. \n";
            setPetInPosition(false);
            setFlag(false);
            setMachineClean(false);
            return string;
        }
        if (!isPetInPosition() && !isPetShowering() && !isFlag()) {
            string = "Pet was already removed.\n";
            setPetInPosition(false);
        }
        if (isPetInPosition() && isPetShowering()) {
            string = "Pet is taking shower. Wait for removal. \n";
        }
        return string;
    }

    public String clearMachine() {
        if (isMachineClean()) {
            string = "The machine is already clean. \n";
        } else {
            string = "The machine was cleaned!     -3 water liters.\n" +
                    "                             -1 shampoo liter.\n";
            setWater(getWater() - 3);
            setShampoo(getShampoo() - 1);
            setMachineClean(true);
        }
        return string;
    }


    @Override
    public String toString() {
        return "PetshopMachine {---------- \n" +
                " cleanPet = " + isPetClean() +
                "\n petShowering = " + isPetShowering() +
                "\n petInPosition = " + isPetInPosition() +
                "\n water = " + getWater() +
                "\n shampoo = " + getShampoo() +
                "\n machineClean = " + isMachineClean() +
                "\n -----------} \n";
    }
}



