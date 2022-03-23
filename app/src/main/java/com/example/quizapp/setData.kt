package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
           1,
           "1. OSI Layer มีทั้งหมดกี่ Layer",

           "5 Layer",
           "6 Layer",
           "7 Layer",
           "8 Layer",
           3
       )
       var question2 = QuestionData(
           2,
           "2. จงเรียงลำดับขนาดของเครือข่าย",

           "LAN MAN WAN",
           "LAN WAN MAN",
           "WAN MAN LAN",
           "WAN LAN MAN",
           1 and 3
       )
       var question3 = QuestionData(
           3,
           "3. Address ของ IPv4 กับ IPv6 แตกต่างกันเท่าไหร่",

           "1 เท่า",
           "2 เท่า",
           "3 เท่า",
           "4 เท่า",
           4
       )
       var question4 = QuestionData(
           4,
           "4. 1 + 2 x 3 - 4 ÷ 4 = ?",

           "4",
           "5",
           "6",
           "7",
           3
       )

       var question5 = QuestionData(
           5,
           "5. IP Address 192.168.1.21/24 จัดเป็น IP คลาสใด",

           "Class A",
           "Class B",
           "Class C",
           "Class D",
           3
       )

       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       return que
   }
}