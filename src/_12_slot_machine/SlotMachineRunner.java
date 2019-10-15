package _12_slot_machine;

import java.net.MalformedURLException;

public class SlotMachineRunner {
public static void main(String[] args) {
	try {
		new SlotMachine().run();
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
