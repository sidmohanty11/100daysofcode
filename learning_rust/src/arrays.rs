//fixed list
use std::mem;

pub fn run(){
    let mut numbers: [i32;5] = [1,2,3,4,5];
//whole array
    println!("{:?}",numbers);

    //single value
    println!("{}", numbers[0]);

    //re-assgin value use "mut"
    numbers[0] = 200;
    println!("{:?}",numbers );

    //array length -> numbers.len();

    //arrays are stack allocated
    println!("Array occupies {} bytes", mem::size_of_val(&numbers));

    //get slice
    let slice: &[i32] = &numbers[1..2];
    println!("Slice {:?}",slice);
}
