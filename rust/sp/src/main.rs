use std::io;
fn main() {
    println!("Enter the number of rows for the pyramid:");

    let mut input = String::new();

    io::stdin()
        .read_line(&mut input)
        .expect("Failed to read input.");

    let num_rows: u32 = match input.trim().parse() {
        Ok(num) => num,
        Err(_) => {
            println!("Please enter a vaild number.");
            return;
        }
    };
    print_pyramid(num_rows);
}
fn print_pyramid(rows: u32){
    for i in 0..rows {
        for _ in 0..rows - i - 1 {
            print!(" ");
        }

        for _ in 0..2 * i + 1 {
            print!("*")
        }
        println!();
    }
}