//  **************************************************************************  //
//                                                                              //
//                                                       :::    :::    :::      //
//     Problem Number: 1002                             :+:    :+:      :+:     //
//                                                     +:+    +:+        +:+    //
//     By: magenta1223 <boj.kr/u/magenta1223>         +#+    +#+          +#+   //
//                                                   +#+      +#+        +#+    //
//     https://boj.kr/1002                          #+#        #+#      #+#     //
//     Solved: 2025-01-15 02:08:59 by magenta1223  ###          ###   ##.kr     //
//                                                                              //
//  **************************************************************************  //



import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    repeat(n) {
        val input = StringTokenizer(readLine()).run { LongArray(6) { nextToken().toLong() } }
        bw.write("${calc(input)}\n")
    }
    bw.close()
}

private fun calc(l: LongArray): Int {
    val x1 = l[0]
    val y1 = l[1]
    val r1 = l[2]
    val x2 = l[3]
    val y2 = l[4]
    val r2 = l[5]

    // 두 원의 관계를 파악하는 것
    val dist:Long = (x1-x2).pow() + (y1-y2).pow()
    val crit1:Long = (r1+r2).pow()
    val crit2:Long = (r1-r2).pow()

    val result = when {
        dist == 0L && r1==r2 && r1 != 0L -> -1
        dist > crit1 || dist < crit2 || (dist == 0L && r1 != r2) -> 0
        dist == crit1 || dist == crit2 -> 1
        else -> 2
    }
    return result
//    if (dist == 0L && r1==r2 && r1 != 0L) { // 두 원이 일치하는 경우. numerical precision issue?
//        return -1
//    } else if ( dist > crit1 || dist < crit2 || (dist == 0L && r1 != r2)  ){ // 두 점에서 만나는 경우
//        return 0
//    } else if (dist == crit1 || dist == crit2){ // 한 점에서 만나는 경우
//        return 1
//    } else{ // 만나지 않는 경우
//        return 2
//    }
}

private fun Long.pow() = this * this



