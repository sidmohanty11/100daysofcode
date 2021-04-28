//str and String

pub fn run(){
    let hello = "hello";
    //or if mutable
    let mut hi = String::from("hi lololol ");
    hi.push_str(" Sid!");//push on string

    //is_empty(), contains(), capacity(), replace(arg1,arg2)
    println!("{}, {}, len{}, len{}",hello,hi,hello.len(),hi.len());

    //loop through strings
    for word in hi.split_whitespace(){
        println!("{}",word);
    }
    //capacity
    let mut s = String::with_capacity(10);
    s.push('a');
    s.push('b');

    println!("{}",s);

    //assertion testing
    assert_eq!(2,s.len());//or it will fail
}
