//fixed list
use std::mem;

pub fn run(){
    let mut numbers: Vec<i32> = vec![1,2,3,4,5];
//whole vector
    println!("{:?}",numbers);

    //single value
    println!("{}", numbers[0]);

    //re-assgin value use "mut"
    numbers[0] = 200;
    println!("{:?}",numbers );

    //vector length -> numbers.len();

    //arrays are stack allocated
    println!("Vector occupies {} bytes", mem::size_of_val(&numbers));

    //get slice
    let slice: &[i32] = &numbers[1..2];
    println!("Slice {:?}",slice);

    numbers.push(7);
    println!("{:?}",numbers );

    //loop through vector values
    for x in numbers.iter(){
        println!("{}", x);
    }

    //loop and mutate values
    for x in numbers.iter_mut(){
        *x *= 2;
    }
    println!("{:?}",numbers );
}
