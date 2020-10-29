fun main () {

    val cord = point ()
        cord.ordinate = 4F
        cord.abscissa = 3F

        println(cord.toString())
        println(cord.abscissa == cord.ordinate)

        val info = point.Triangle(height = cord.ordinate, base = cord.abscissa)
        println(info.getArea())


}
interface IFigure{
    fun getArea():Float
}


class point {

    var abscissa: Float = 1F
    var ordinate: Float = 2F

    override fun equals(other: Any?): Boolean {
        if (other is point)
            if (abscissa == this.ordinate) {
                return true

            }
        return false
    }


    override fun toString(): String {
        return "X=${abscissa},Y=${ordinate}"
    }

    class Triangle(private val height: Float, private val base: Float) : IFigure {
        override fun getArea(): Float {
            return height * base / 2
        }
    }
}


