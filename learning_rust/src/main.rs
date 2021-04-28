mod print;
mod vars;
mod types;
mod strings;
mod arrays;
mod tuples;
mod vectors;
mod conditionals;

fn main() {
    print::run();
    vars::run();
    types::run();
    strings::run();
    tuples::run();
    arrays::run();
    vectors::run();
    conditionals::run();
}
