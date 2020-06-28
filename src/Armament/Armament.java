package Armament;

import IDGenerator.IDGenerator;

public class Armament {
    private String IDNumber;
    private TurboLaserCannon[] MainBattery;
    private HeavyIonCannon[] SecondaryBattery;
    private double CostToBuild;

    public Armament(){
        this.IDNumber = IDGenerator.getUniqueID();

        TurboLaserCannon[] turbos = new TurboLaserCannon[20];
        for(int i = 0; i < turbos.length; i++){
            String ID = IDGenerator.getUniqueID();
            turbos[i] = new TurboLaserCannon(ID);
        }
        this.MainBattery = turbos;

        HeavyIonCannon[] heavys = new HeavyIonCannon[40];
        for(int i = 0; i < heavys.length; i++){
            String ID = IDGenerator.getUniqueID();
            heavys[i] = new HeavyIonCannon(ID);
        }
        this.SecondaryBattery = heavys;

        int costHeavy = this.SecondaryBattery[0].getCost();
        int costIon = this.MainBattery[0].getCost();

        this.CostToBuild = (costHeavy * this.SecondaryBattery.length) + (costIon * this.MainBattery.length);
    }

    public double getCost(){
        return this.CostToBuild;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nArmament ID #" + IDNumber);
        sb.append("\nShipyard.Main Battery: " + MainBattery.length + " Turbo Laser Cannons");
        sb.append("\nSecondary Battery: " + SecondaryBattery.length + " Heavy Ion Cannons");
        sb.append("\nCost to build: " + CostToBuild + " Palpatines");
        return sb.toString();
    }

    public void displayArmamentSpecs(){
        System.out.println(this.toString());
    }
}
