//Primitive types--
//Integers : u8,i8,u16,i16,u32,i32,u64,i64,u128,i128 (number of bits)
//floats: f32, f64
//boolean (bool)
//characters (char)
//tuples
//arrays

pub fn run(){
    //default is i32
    let x =1;
    //default is f64
    let y = 2.5;
    //add explicit type
    let z: i64 = 352875297598;

    //find max size
    println!("Max i32 is {}",std::i32::MAX);
    println!("Max i64 is {}",std::i64::MAX);

    //boolean
    let is_active:bool = true;

    println!("{:?}",(x,y,z,is_active));

    //boolean from the expression
    let is_greater = 10 < 5;
    println!("{:?}",(x,y,z,is_active,is_greater));


    //characters
    let a1 = 'a';
    let face = '\u{1F600}';
    println!("{:?}",(x,y,z,is_active,is_greater,a1,face));
}
