class Solution2525 {

    //"Bulky"(부피가 큰 박스)
    //
    //박스의 어느 한 변이라도 10⁴(=10,000) 이상이거나
    //박스의 부피(=length × width × height)가 10⁹(=1,000,000,000) 이상이면

    //"Heavy"(무거운 박스)
    //
    //박스의 무게(mass) 가 100 이상이면

    //박스의 카테고리 결정
    //둘 다 해당하면 → "Both"
    //둘 다 해당하지 않으면 → "Neither"
    //Bulky만 해당하면 → "Bulky"
    //Heavy만 해당하면 → "Heavy"

    fun categorizeBox(length: Int, width: Int, height: Int, mass: Int): String {
        var isBulky = false
        var isHeavy = false

        if (length >= 10000 || width >= 10000 || height >= 1000 || length * width * height >= 1000000000) {
            isBulky = true
        }
        if (mass >= 100) {
            isHeavy = true
        }

        return if (isBulky && isHeavy) {
            "Both"
        } else if (!isBulky && !isBulky) {
            "Neither"
        } else if (isBulky) {
            "Bulky"
        } else {
            "Heavy"
        }

    }
}