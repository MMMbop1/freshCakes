package cakes;

import command.Command;

import java.util.ArrayList;

public class OperaCake extends WhippedCreamCake {
    public void addRaspberryMousse(String raspberryMousse) {
        super.raspBerryJam = raspberryMousse;
    }

    @Override
    public void addPinkMarzipanLod(String pinkMarzipanLod) {
        super.pinkMarzipanLod = pinkMarzipanLod;
    }
}
