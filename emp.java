public class emp {
    public static void main(String[] args) {
        StateBank s = new StateBank(50000, 1, 10);
        BankOfBaroda b = new BankOfBaroda(15000, 5, 6.5);
        IndianOversisBank i = new IndianOversisBank(8000, 3, 4.5);

        s.getRateOfInterest();
        b.getRateOfInterest();
        i.getRateOfInterest();
    }
}

abstract class Bank {
    abstract void getRateOfInterest();
}

class StateBank extends Bank {
    double amount;
    double timrPeriod;
    double roi;

    StateBank(double amount, double timrPeriod, double roi) {
        this.amount = amount;
        this.timrPeriod = timrPeriod;
        this.roi = roi;
    }

    void getRateOfInterest() {
        double ans = 0;
        ans = (amount * timrPeriod * roi) / 100;
        System.out.println("Rate of interest in State Bank of India is :" + ans);
    }
}

class BankOfBaroda extends Bank {
    double amount;
    double timrPeriod;
    double roi;

    BankOfBaroda(double amount, double timrPeriod, double roi) {
        this.amount = amount;
        this.timrPeriod = timrPeriod;
        this.roi = roi;
    }

    void getRateOfInterest() {
        double ans = 0;
        ans = (amount * timrPeriod * roi) / 100;
        System.out.println("Rate of interest in BOB is :" + ans);
    }
}

class IndianOversisBank extends Bank {
    double amount;
    double timrPeriod;
    double roi;

    IndianOversisBank(double amount, double timrPeriod, double roi) {
        this.amount = amount;
        this.timrPeriod = timrPeriod;
        this.roi = roi;
    }

    void getRateOfInterest() {
        double ans = 0;
        ans = (amount * timrPeriod * roi) / 100;
        System.out.println("Rate of interest in IOB is :" + ans);
    }
}