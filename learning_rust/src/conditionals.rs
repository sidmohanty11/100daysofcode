pub fn run(){
    let age = 18;
    let check_id: bool = true;
    let knows_person: bool = false;
    if age >= 21 && check_id || knows_person{
        println!("You can drink!");
    }else if age<21 && check_id{
        println!("Get out little guy!", );
    }else{
        println!("I need to check your id.", );
    }

    //shorthand if
    let is_of_age = if age>=21 {true} else {false};//like ternary operators
}
