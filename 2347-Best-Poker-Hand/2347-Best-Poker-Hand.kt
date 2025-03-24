class Solution2347 {

    //ranks: 각 카드의 숫자를 나타내는 리스트
    //suits: 각 카드의 무늬를 나타내는 리스트
    //
    //"Flush": 모든 카드(5장)가 같은 무늬(suit)일 때
    //"Three of a Kind": 같은 숫자(rank)의 카드가 3장일 때
    //"Pair": 같은 숫자의 카드가 2장일 때
    //"High Card": 위 조건을 모두 만족하지 않으면

    fun bestHand(ranks: IntArray, suits: CharArray): String {
        if (suits.distinct().size == 1) return "Flush"
        val rankCount = ranks.distinct().maxOf { num -> ranks.count { it == num } }

        return when {
            rankCount >= 3 -> "Three of a Kind"
            rankCount == 2 -> "Pair"
            else -> "High Card"
        }
    }
}