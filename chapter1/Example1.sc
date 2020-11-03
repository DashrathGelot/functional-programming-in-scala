object Example1 {

  def abs(x: Double): Double = if (x < 0) -x else x

def sqrt(x: Double): Double = {
  def loop(x: Double, guess: Double): Double = {
    if (isGoodEnough(guess, x)) guess
    else loop(x, improveGuess(x, guess))
  }
  loop(x, 0.001)
}

  def isGoodEnough(guess: Double, x: Double) = abs(guess * guess - x) / x < 0.001

  def improveGuess(x: Double, guess: Double): Double = (guess + x/guess)/2

}
println(Example1.sqrt(4))