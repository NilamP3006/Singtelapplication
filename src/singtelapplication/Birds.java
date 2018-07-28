package singtelapplication;



class Birds implements Animals 
{
    @Override
    public void quack() 
    {
        System.out.println("qucak quack");
    }

    @Override
    public void fly() 
    {
        System.out.println("fly");
    }
    
    @Override
    public void walk() {
        System.out.println("walk");
    }
    
    @Override
    public void sing() {
        System.out.println("sing");
    }
    
    @Override
    public void swim() {
        System.out.println("swim");
    }
}    
    
    

