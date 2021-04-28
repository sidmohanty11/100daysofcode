pub fn run(){
    greet("Hi","Sid");
    let get_sum = add(5,5);
    println!("{}", get_sum);

    //closures
    let add_nums = |n1:i32, n2:i32| n1+n2;
    println!("closure sum, {}", add_nums(3,3));
}

fn greet(greeting: &str, name: &str){
    println!("{} {}, nice to meet you!", greeting,name);
}

fn add(n1:i32,n2:i32) -> i32{//to return arrows
    n1+n2 //return no ;
}
