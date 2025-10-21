class Programmers251021 {

    // 미완성
    fun solution1(genres: Array<String>, plays: IntArray): IntArray {

        //속한 노래가 많이 재생된 장르를 먼저 수록합니다.
        //장르 내에서 많이 재생된 노래를 먼저 수록합니다.
        //장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
        //["classic", "pop", "classic", "classic", "pop"]	[500, 600, 150, 800, 2500]	[4, 1, 3, 0]


        val genreMap = hashMapOf<String, Int>()
        val musicMap = hashMapOf<String, HashMap<Int, Int>>()
        genres.forEachIndexed { index, genre ->
            if (genreMap.contains(genre)) {
                genreMap[genre]?.plus(plays[index])
                musicMap[genre]?.put(index, plays[index])
            } else {
                genreMap[genre] = plays[index]
                musicMap[genre] = hashMapOf(index to plays[index])
            }
        }

        val sortedMap = genreMap.toList().sortedByDescending { it.second }.toMap()
        val answer = arrayListOf<Int>()
        sortedMap.forEach { (sortedGenre, v) ->
            val filteredPlayIndex =
                musicMap[sortedGenre]?.toList()?.sortedByDescending { it.second }?.take(2)
                    ?.map { it.first }?.toList()

            answer.addAll(ArrayList(filteredPlayIndex))
        }




//        sortedMap.forEach { (sortedGenre, v) ->
//            val array = arrayListOf<Int>()
//            genres.forEachIndexed { index, genre ->
//                if (genre == sortedGenre) {
//                    array.add(index)
//                }
//            }
//
//            val filteredPlayIndex = plays.asSequence().mapIndexed { index, i -> index to i }
//                .filter { it.first in array }
//                .sortedByDescending { it.second }
//                .take(2)
//                .map { it.first }.toList()
//
//            answer.addAll(filteredPlayIndex)
//        }

        println(answer.toString())

        return answer.toIntArray()
    }

    fun solution2(n: Int): Int {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
        val answer = IntArray(n + 1)
        answer[0] = 0
        answer[1] = 1
        for (i in 2..n) {
            answer[i] = (answer[i-1] + answer[i-2]) % 1234567
        }
        return answer[n]
    }

    fun solution3(brown: Int, yellow: Int): IntArray {
        // 10	2	[4, 3]
        // 8	1	[3, 3]
        // 24	24	[8, 6]

//        var height = 1
//
//        while (true) {
//            if ((((yellow / height) + 2) * 2) + (height * 2) == brown) {
//                break
//            }
//            height++
//        }
//
//        println("${(brown + yellow) / (height+2)}, ${height+2}")
//        return intArrayOf((brown + yellow) / (height+2), height + 2)

        var answer = intArrayOf()
        val area = brown + yellow
        var width = 0
        var height = 0
        for (i in 1..area) {
            width = i
            height = area / i

            if ((width - 2) * (height - 2) == yellow) {
                break
            }
        }

        answer = answer + height
        answer = answer + width
        return answer

    }

}
