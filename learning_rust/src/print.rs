pub fn run(){
    //Print to console
    println!("Hello from printrs file");

    println!("{}", 1);//for integers

    println!("{} is from {}","Sidharth","India");

    //postional args
    println!("{0} is from {1} and {0} likes to {2}","Sid","India","Code" );

    //named args
    println!("{name} likes to {activity}", name="Sid", activity="learning rust!");

    //placeholder traits
    println!("Binary: {:b} Hex: {:x} Octal: {:o}",10,10,10);

    //placeholder for debug trait
    println!("{:?}", (12,true,"hello"));

    //basic maths
    println!("10 + 10 = {}", 10+10);
}
