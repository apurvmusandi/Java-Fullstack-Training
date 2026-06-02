interface RemoteControl {
    void powerOn();
    void powerOff();
}

class TV implements RemoteControl {
    @Override
    public void powerOn() {
        System.out.println("TV is now ON. Screen is glowing.");
    }

    @Override
    public void powerOff() {
        System.out.println("TV is now OFF. Screen went black.");
    }
}

class AirConditioner implements RemoteControl {
    @Override
    public void powerOn() {
        System.out.println("AC is now ON. Cooling started.");
    }

    @Override
    public void powerOff() {
        System.out.println("AC is now OFF. Fans stopped.");
    }
}

public class last4 {
    public static void main(String[] args) {
        RemoteControl tvRemote = new TV();
        RemoteControl acRemote = new AirConditioner();

        tvRemote.powerOn();
        tvRemote.powerOff();

        System.out.println();

        acRemote.powerOn();
        acRemote.powerOff();
    }
}
