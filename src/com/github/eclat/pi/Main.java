package com.github.eclat.pi;

import oshi.SystemInfo;
import oshi.hardware.GraphicsCard;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.util.FormatUtil;

public class Main {

    public static void main(String[] args) {
        SystemInfo sys = new SystemInfo();
        HardwareAbstractionLayer hard = sys.getHardware();
        System.out.println("OS: " + sys.getOperatingSystem());
        System.out.println("CPU: " + hard.getProcessor());
        System.out.println("Mem: " + FormatUtil.formatBytes(hard.getMemory().getTotal()));
        int c = 0;
        for (GraphicsCard gpu : hard.getGraphicsCards()) {
            System.out.println("GPU#" + c + ": " + gpu.getName());
            c++;
        }
    }
}
