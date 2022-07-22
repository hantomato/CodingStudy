// https://school.programmers.co.kr/learn/courses/30/lessons/42748

console.log(solution([1, 5, 2, 6, 3, 7, 4], [[2, 5, 3], [4, 4, 1], [1, 7, 3]]))

// [1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]

function solution(array, commands) {
    return commands.map(x =>
        // array.slice(x[0]-1, x[1]).sort()[x[2]-1]
        array.slice(x[0] - 1, x[1]).sort((a, b) => a - b)[x[2] - 1]
    )
}