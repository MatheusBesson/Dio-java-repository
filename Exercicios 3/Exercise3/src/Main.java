public class Main {
    public static void main(String[] args) {

        PetshopMachine petshopMachine = new PetshopMachine();

        // testing errors
        System.out.println(petshopMachine.showerPet());
        // shampoo tank full
        System.out.println(petshopMachine.supplyShampoo());
        //water tank full
        System.out.println(petshopMachine.supplyWater());

        // putting pet in position to shower
        System.out.println(petshopMachine.putPetInPosition());
        // twice (already at position)
        System.out.println(petshopMachine.putPetInPosition());

        // starting shower
        System.out.println(petshopMachine.showerPet());
        // again (put pet on the machine)
        System.out.println(petshopMachine.showerPet());

        // all machine properties
        System.out.println(petshopMachine.toString());

        // verifying water level
        System.out.println(petshopMachine.verifyWaterLevel());

        // verifying shampoo level
        System.out.println(petshopMachine.verifyShampooLevel());

        // supplying water
        System.out.println(petshopMachine.supplyWater());
        System.out.println(petshopMachine.verifyWaterLevel());

        // supplying shampoo
        System.out.println(petshopMachine.supplyShampoo());
        System.out.println(petshopMachine.verifyShampooLevel());
        // oversupplying (shampoo tank is full)
        System.out.println(petshopMachine.supplyShampoo());

        // verifying if there is a pet showering (false always, because pet can stay positioned until function removePetPosition, but the function showerPet is finished before calling next code line.)
        System.out.println(petshopMachine.verifyPetShowering());
        //shower with verify
        System.out.println(petshopMachine.removePetPosition());
        System.out.println(petshopMachine.verifyPetShowering());

        // removing pet of machine
        System.out.println(petshopMachine.clearMachine());
        System.out.println(petshopMachine.putPetInPosition());
        System.out.println(petshopMachine.removePetPosition());

        // putting pet on machine twice
        System.out.println(petshopMachine.clearMachine());
        System.out.println(petshopMachine.putPetInPosition());
        System.out.println(petshopMachine.putPetInPosition());

        // checkeing if clear machine function correctly subtract 3 water liters and 1 shampoo liter.
        System.out.println(petshopMachine.toString());

        // cleaning machine
        System.out.println(petshopMachine.clearMachine());
        System.out.println(petshopMachine.clearMachine());
    }
}
