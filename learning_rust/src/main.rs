mod print;
mod vars;
mod types;
mod strings;
mod arrays;
mod tuples;
mod vectors;
mod conditionals;
mod loops;
mod functions;

fn main() {
    print::run();
    vars::run();
    types::run();
    strings::run();
    tuples::run();
    arrays::run();
    vectors::run();
    conditionals::run();
    loops::run();
    functions::run();
}
