package pp_10_01_Rendezvous.io.dama.par.rendezvous;

/*-

package main
import "fmt"
func tasker (c, r chan int, d chan bool) {
    c <- 1; c <- 2
    fmt.Println (<-r); d <- true
}
func add (c, r chan int) {
    r <- <-c + <-c
}
func main () {
    c, r:= make(chan int), make(chan int)
    done:= make(chan bool)
    go tasker (c, r, done)
    go add (c, r)
    <-done
}

 */

class Addierer {

}
