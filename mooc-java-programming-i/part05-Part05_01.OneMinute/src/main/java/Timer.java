public class Timer {
    private int valueCents;
    private int valueSeconds;

    public Timer() {
        this.valueCents = 0;
        this.valueSeconds = 0;
    }

    public void advance() {
        this.valueCents++;
        if (this.valueCents >= 100) {
            this.valueCents = 0;
            this.valueSeconds++;
        }if (this.valueSeconds >= 60) {
            this.valueSeconds = 0;
        }
    }

    public String toString() {
        if(valueCents < 10) {
            if (valueSeconds < 10) {
                return "0" + this.valueSeconds + ":0" + this.valueCents;
            }else{
                return this.valueSeconds + ":0" + this.valueCents;
            }
        }else {
            if (valueSeconds < 10) {
                return "0" + this.valueSeconds + ":" + this.valueCents;
            }else{
                return this.valueSeconds + ":" + this.valueCents;
            }
        }
    }


}
