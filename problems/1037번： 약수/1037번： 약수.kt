//  **************************************************************************  //
//                                                                              //
//                                                       :::    :::    :::      //
//     Problem Number: 1037                             :+:    :+:      :+:     //
//                                                     +:+    +:+        +:+    //
//     By: magenta1223 <boj.kr/u/magenta1223>         +#+    +#+          +#+   //
//                                                   +#+      +#+        +#+    //
//     https://boj.kr/1037                          #+#        #+#      #+#     //
//     Solved: 2025-01-15 01:17:34 by magenta1223  ###          ###   ##.kr     //
//                                                                              //
//  **************************************************************************  //

fun main() {
    val nDivisor:Int = readln().trim().toInt()
    val divisiors:List<Int> = readln().trim().split(" ").map({it.toInt()})
    println(divisiors.min() * divisiors.max())
}