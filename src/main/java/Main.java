public class Main {
    public static void main(String[]args)
    {
        Customer cust1=new Customer(100,"Smriti",10000);
        System.out.println(cust1);
        Customer cust2=new Customer();
        cust2.setCustId(200);
        cust2.setCustName("charan");
        cust2.setBalance(100000);
        System.out.println(cust2.getCustName()+" "+cust2.getBalance());

        Person person=new Person();
        person.setpId(100);
        person.setName("Mythili");
        System.out.println(person);
    }
}
