pub fn run(){
    let name = "Sidharth";
    let mut age = 19;

    //march 10 2022
    age = 20;

    println!("My name is {} and my age is {}", name,age);

    //Define const
    const ID: i32 = 001;
    println!("ID: {}", ID);

    //assign multiple vars
    let (my_name,my_age) = ("Sid",19);
    println!("{} is {}",my_name,my_age );
}
