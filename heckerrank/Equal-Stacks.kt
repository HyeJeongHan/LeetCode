class EqualStacks {
    fun equalStacks(h1: Array<Int>, h2: Array<Int>, h3: Array<Int>): Int {
        val stack1 = Stack<Int>()
        val stack2 = Stack<Int>()
        val stack3 = Stack<Int>()

        stack1.addAll(h1.reversed())
        stack2.addAll(h2.reversed())
        stack3.addAll(h3.reversed())

        val stackList = listOf(stack1, stack2, stack3)
        val stackSumList = arrayListOf(stack1.sum(), stack2.sum(), stack3.sum())

        while (true) {
            if (stackSumList[0] == stackSumList[1] && stackSumList[1] == stackSumList[2])
                return stackSumList[0]

            val maxStackIndex = stackSumList.indexOf(stackSumList.max())
            val element = stackList[maxStackIndex].pop()
            stackSumList[maxStackIndex] -= element

        }
    }
}