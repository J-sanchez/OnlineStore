public class OnlineAccount {
    private Long id;
    private String name;
    private String address;
    private Long budget;
    private Long discountRate;

    //Creating 'Builder' from "Builder" Pattern Diagram
    public static class Builder {
        private Long id;
        private String name;
        private String address;
        private Long budget;
        private Long discountRate;

        //Setters to return the object within the constructor

        public Builder(Long id) {
            this.id = id; 
        }

        public Builder withName(String name){
            this.name = name; 

            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            
            return this;
        }

        public Builder withBudget(Long budget){
            this.budget = budget; 

            return this;
        }

        public Builder withDiscount(Long discountRate){
            this.discountRate = discountRate; 

            return this; 
        }

        public OnlineAccount build() {
            OnlineAccount onlineAccount = new OnlineAccount();
            onlineAccount.id = this.id;
            onlineAccount.name = this.name; 
            onlineAccount.address = this.address;
            onlineAccount.budget = this.budget; 
            onlineAccount.discountRate = this.discountRate; 

            return onlineAccount; 
        }


    
    }


    private OnlineAccount() {

    }

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public Long getBudget() {
        return budget;
    }

    public void setBudget(Long budget) {
        this.budget = budget;
    }

    public Long getDiscount() {
        return discountRate;
    }

    public void setDisctount(Long discoutRate) {
        this.discountRate = discoutRate;
    }
    
    
    // public OnlineAccount(Long id, String name, String address, Long budget, Long discountRate){
    //     this.id = id;
    //     this.name = name;
    //     this.address = address;
    //     this.discountRate = discountRate;

    // }
}
