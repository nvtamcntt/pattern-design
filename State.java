// interface cho trang thai radio

public interface RadioState {
    void execute(Radio radio) 
}

public class Radio {
    private boolean on
    private RadioState state

    public Radio(RadioState rate){
        this.state = state
    }

    public void execute(){
        state.execute(this)
    }

    public void setState(RadioState state){
        this.state = state
    }

    public void setOn(boolean on){
        this.on = on
    }

    public boolean isOn() {
        return on
    }

    public boolean isOff(){
        return !on
    }
}


public class OnRadioState implements RadioState {
    public void execute(Radio Radio){
        //throws exception if radio is already on
        radio.setOn(true)
    }
}

public class OffRadioState implements RadioState {
    public void execute(Radio radio){
        //throws exception if radio is already off
        radio.setOn(false);
    }
}

// khi thuc thi

Radio radio = new Radio(new OffRadioState())
radio.setState(new OnRadioState())
radio.execute() // on
radio.setState(new OffRadioState())
radio.execute() // off