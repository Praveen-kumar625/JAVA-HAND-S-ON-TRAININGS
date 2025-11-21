// KYA HAI INCAPSULATION ?
// INCAPSULATION KA MATLAB HAI DATA HIDING. JAB HUM APNE CLASS KE DATA MEMBERS KO PRIVATE DECLARE KARTE HAIN TAAKI WOH CLASS KE BAHAR SE ACCESS NA HO SAKEN. ISSE HUM APNE DATA KO PROTECT KAR SAKTE HAIN AUR SIRF CLASS KE METHODS KE THROUGH HI USSE ACCESS KAR SAKTE HAIN.

// INCAPSULATION KE FAAYDE:
// 1. DATA HIDING: INCAPSULATION SE HUM APNE DATA KO BAHAR KE ACCESS SE PROTECT KAR SAKTE HAIN.
// 2. CONTROLLED ACCESS: HUM GETTERS AUR SETTERS METHODS KE THROUGH DATA MEMBERS KO CONTROL KAR SAKTE HAIN.
// 3. MAINTAINABILITY: INCAPSULATION SE HUM APNE CODE KO AUR BHI MAINTAINABLE AUR READABLE BANAA SAKTE HAIN.
// 4. FLEXIBILITY: HUM APNE CLASS KE IMPLEMENTATION KO CHANGE KAR SAKTE HAIN BINA USKE USERS KO AFFECT KIYE BINAA.  
// 5. SECURITY: INCAPSULATION SE HUM APNE DATA KO UNAUTHORIZED ACCESS SE BACHAA SAKTE HAIN.

/* 
class Atm{
    private int totalBalance=100000;
    private String pin="1234";
    public int getTotalBalance(){
        System.out.println(" total balance");
        return totalBalance;

}
    public void setPin(String newPin){
        pin=newPin;
        System.out.println(" pin changed successfully");
    }
}
public void setbalance(int amount){
    if(amount>=0){
        totalBalance=amount;
        System.out.println(" balance updated successfully");
    }else{
        System.out.println(" invalid amount");
    }
}
public void withdraw(int amount){
    if(amount>=0 && amount<=totalBalance){
        totalBalance-=amount;
        System.out.println(" withdraw successfully");
    }else{
        System.out.println(" invalid amount");
    }
}
public void deposit(int amount){
    if(amount>=0){
        totalBalance+=amount;
        System.out.println(" deposit successfully");
    }else{
        System.out.println(" invalid amount");
    }
}
int main(){
    Atm myAtm=new Atm();
    System.out.println(" initial balance: "+myAtm.getTotalBalance());
    myAtm.deposit(5000);
    System.out.println(" balance after deposit: "+myAtm.getTotalBalance());
    myAtm.withdraw(2000);
    System.out.println(" balance after withdraw: "+myAtm.getTotalBalance());
    myAtm.setPin("5678");
    return 0;
}
}

*/
// BHAI PRAVEEN DHYAN RAHE KI INCAPSULATION MAIN HUM APNE CLASS KE DATA MEMBERS KO PRIVATE DECLARE KARTE HAIN AUR PUBLIC METHODS KE THROUGH HI UNHE ACCESS KARTE HAIN. ISSE HUM APNE DATA KO PROTECT KAR SAKTE HAIN AUR USKE UPPER CONTROL RAKH SAKTE HAIN.
// CHALO AB IS PROGRAM KO BREAK DOWN KARTE HAIN:
// 1. HUMNE EK CLASS 'Atm' BANAI HAI JISKE ANDAR DO PRIVATE DATA MEMBERS HAIN: 'totalBalance' AUR 'pin'. YE DATA MEMBERS CLASS KE BAHAR SE DIRECT ACCESS NAHI KIYE JA SAKTE.
// 2. HUMNE PUBLIC METHODS 'getTotalBalance', 'setPin', 'setbalance', 'withdraw', AUR 'deposit' BANAI HAIN JINKE THROUGH HUM APNE PRIVATE DATA MEMBERS KO ACCESS AUR MODIFY KAR SAKTE HAIN.
// 3. 'getTotalBalance' METHOD TOTAL BALANCE KO RETURN KARTA HAI AUR EK MESSAGE PRINT KARTA HAI.
// 4. 'setPin' METHOD NAYA PIN SET KARTA HAI AUR SUCCESS MESSAGE PRINT KARTA HAI.
// 5. 'setbalance' METHOD TOTAL BALANCE KO UPDATE KARTA HAI AGAR AMOUNT VALID HAI TOH.
// 6. 'withdraw' METHOD SPECIFIED AMOUNT KO TOTAL BALANCE SE KATTA HAI AGAR AMOUNT VALID HAI TOH.
// 7. 'deposit' METHOD SPECIFIED AMOUNT KO TOTAL BALANCE MAIN JODTA HAI AGAR AMOUNT VALID HAI TOH.
// 8. HUMNE EK MAIN METHOD BANAI HAI JISME HUM 'Atm' CLASS KA OBJECT CREATE KARTE HAIN AUR USKE METHODS KO CALL KARTE HAIN TOH DEKH SAKTE HAIN KI INCAPSULATION KAISE KAAM KARTA HAI.
// IS TARAH SE HUM INCAPSULATION KA USE KARKE APNE DATA KO PROTECT KAR SAKTE HAIN AUR USKE UPPER CONTROL RAKH SAKTE HAIN.

// PRAVEEN KUMAR JAYSWAL AB DHYAN DENA KI GALTI KYA HO SAKTI HAI IS CODE MAIN:
// 1. HUMNE 'setbalance' METHOD KO CLASS KE ANDAR DEFINE NAHI KIYA HAI. ISSE HUM CLASS KE ANDAR HI DEFINE KARNA HOGA.
// 2. HUMNE 'main' METHOD KO CLASS KE ANDAR DEFINE NAHI KIYA HAI. ISSE HUM CLASS KE ANDAR HI DEFINE KARNA HOGA.
// 3. HUMNE 'main' METHOD KO 'public static void main(String[] args)' KI TARAH DEFINE NAHI KIYA HAI. ISSE HUM 'public static void main(String[] args)' KI TARAH HI DEFINE KARNA HOGA.
// 4. HUMNE 'main' METHOD KE RETURN TYPE KO 'int' KI TARAH DEFINE KIYA HAI. ISSE HUM 'void' KI TARAH HI DEFINE KARNA HOGA.
// 5. HUMNE 'main' METHOD KE ANDAR 'return 0;' LINE KO INCLUDE KIYA HAI. ISSE HUM 'main' METHOD KE ANDAR NAHI RAKH SAKTE.
// IN SABHI GALTIYON KO SUDHARNE KE BAAD HI HUMARA CODE Sahi Se KAAM KAREGA.


/*


class Atm{
    private int totalBalance=100000;
    private String pin="1234";
    public int getTotalBalance(){
        System.out.println(" total balance");
        return totalBalance;
    }
    public void setPin(String newPin){
        pin=newPin;
        System.out.println(" pin changed successfully");
    }
    public void setbalance(int amount){
        if(amount>=0){
            totalBalance=amount;
            System.out.println(" balance updated successfully");
        }else{
            System.out.println(" invalid amount");
        }
    }
    public void withdraw(int amount){
        if(amount>=0 && amount<=totalBalance){
            totalBalance-=amount;
            System.out.println(" withdraw successfully");
        }else{
            System.out.println(" invalid amount");
        }
    }
    public void deposit(int amount){
        if(amount>=0){
            totalBalance+=amount;
            System.out.println(" deposit successfully");
        }else{
            System.out.println(" invalid amount");
        }
    }
    public static void main(String[] args){
        Atm myAtm=new Atm();
        System.out.println(" initial balance: "+myAtm.getTotalBalance());
        myAtm.deposit(5000);
        System.out.println(" balance after deposit: "+myAtm.getTotalBalance());
        myAtm.withdraw(2000);
        System.out.println(" balance after withdraw: "+myAtm.getTotalBalance());
        myAtm.setPin("5678");
    }
}
    */