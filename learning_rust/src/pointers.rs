pub fn run(){
    let arr1 = [1,2,3];
    let arr2 = arr1;
    println!("Array {:?}", (arr1,arr2));

    //for vectors

    let vec1 = vec![1,2,3];
    let vec2 = &vec1;
    println!("vectors {:?}", (&vec1,vec2));
}
