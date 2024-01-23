package com.example.quizapp

object Constants {
    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTION:String="total_answer"
    const val CORRECT_ANSWERS:String="correct_answer"
    fun getQuestion():ArrayList<Question>{
        val questionsList=ArrayList<Question>()
        val que1=Question(
            1,"What anime does this image belong to?",
            R.drawable.jjk,"Jujutsu kaisen","Hunter x hunter","Naruto",
            "Onepiece",1
        )
        questionsList.add(que1)

        val que2=Question(
            2,"What anime does this image belong to?",
            R.drawable.hxh,"Attack on titan","Hunter x hunter","One Piece",
            "Demon slayer",2
        )
        questionsList.add(que2)

        val que3=Question(
            3,"What anime does this image belong to?",
            R.drawable.naruto,"Jujutsu kaisen","One Punch Man","Naruto",
            "Death note",3
        )
        questionsList.add(que3)

        val que4=Question(
            4,"What anime does this image belong to?",
            R.drawable.onepiece,"Hero Academia","Vinland saga","Code Geass",
            "Onepiece",4
        )
        questionsList.add(que4)

        val que5=Question(
            5,"What anime does this image belong to?",
            R.drawable.demon_slayer,"Chainsaw man","Demon slayer","Solo levelling",
            "Onepiece",2
        )
        questionsList.add(que5)

        val que6=Question(
            6,"What anime does this image belong to?",
            R.drawable.hero_academia,"Bleach","Seven Deadly sins","Full Metal Alchemist",
            "Hero Academia",4
        )
        questionsList.add(que6)

        val que7=Question(
            7,"What anime does this image belong to?",
            R.drawable.death_note,"Jujutsu kaisen","Death note","Naruto",
            "Onepiece",2
        )
        questionsList.add(que7)

        val que8=Question(
            8,"What anime does this image belong to?",
            R.drawable.one_punch_man,"One Punch man","Bleach","Seven deadly sins",
            "Demon slayer",1
        )
        questionsList.add(que8)

        val que9=Question(
            9,"What anime does this image belong to?",
            R.drawable.chain_saw_man,"Neon geneics","Vinland saga","Chain saw man",
            "Hero Academia",3
        )
        questionsList.add(que9)

        val que10=Question(
            10,"What anime does this image belong to?",
            R.drawable.attack_on_titan,"One piece","Hunter x hunter","Jujutsu kaisen",
            "Attack on titan",4
        )
        questionsList.add(que10)

        return questionsList
    }
}