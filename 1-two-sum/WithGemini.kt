import java.util.LinkedList
import java.util.Queue
import kotlin.math.max

class WithGemini {

    // interval
    fun solution1(intervals: Array<IntArray>): Array<IntArray> {
        val sortedIntervals = intervals.sortedBy { it[0] }
        val result = arrayListOf<IntArray>()

        result.add(sortedIntervals[0])
        for (i in 1 until sortedIntervals.size) {
            val lastAdded = result.last()
            val current = sortedIntervals[i]

            if (lastAdded[1] >= current[0]) {
                val maxEndTime = max(lastAdded[1], current[1])
                lastAdded[1] = maxEndTime
            } else {
                result.add(current)
            }
        }
        return result.toTypedArray()
    }

    // string
    fun solution2(strs: Array<String>) : String {
        if (strs.isEmpty()) return ""
        var prefix  = strs[0]
        for (i in 1 until strs.size) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.dropLast(1)

                if (prefix.isEmpty()) return ""
            }
        }
        return prefix
    }

    // BFS 최단 거리
    fun solution3() {
        val n = 5
        val m = 6
        val maze = arrayOf(
            intArrayOf(1, 0, 1, 0, 1, 0),
            intArrayOf(1, 1, 1, 1, 1, 1),
            intArrayOf(0, 0, 0, 0, 0, 1),
            intArrayOf(1, 1, 1, 1, 1, 1),
            intArrayOf(1, 1, 1, 1, 1, 1)
        )

        // 이동할 네 방향 (상, 하, 좌, 우)
        val dx = intArrayOf(-1, 1, 0, 0)
        val dy = intArrayOf(0, 0, -1, 1)

        //큐 생성 (x, y, 좌표를 담음)
        val queue: Queue<Pair<Int, Int>> = LinkedList()
        queue.offer(Pair(0, 0))

        while (queue.isNotEmpty()) {
            val (x, y) = queue.poll()

            // 현재 위치에서 4방향 확인
            for (i in 0 until 4) {
                val nx = x + dx[i]
                val ny = y + dy[i]

                // 미로 범위를 벗어나면 무시
                if (nx !in 0 until n || ny !in 0 until m) continue
                // 괴물(0)이 있으면 무시
                if (maze[nx][ny] == 0) continue

                // 처음 방문하는 길이라면? (값이 1인 경우)
                if (maze[nx][ny] == 1) {
                    // 이전 칸의 거리 + 1을 저장 (거리를 기록하는 방식)
                    maze[nx][ny] = maze[x][y] + 1
                    queue.offer(Pair(nx, ny))
                }
            }
        }

        //우측 하단(출구)까지의 최단 거리 출력
        println(maze[n - 1][m - 1])
    }

    fun solution4(array: IntArray, target: Int) {



    }

    fun dfs(index: Int, sum: Int) {

    }
}