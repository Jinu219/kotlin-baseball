package domain

import baseball.domain.numbergenerator.RandomNumberGenerator
import org.junit.jupiter.api.Test

class GameTest {
    @Test
    fun `컴퓨터는 서로 다른 3개의 수를 선택한다`(){
        for(i in 1..100){
            println(getNumber())
        }
    }
    private fun getNumber():MutableList<Int>{
        var randomNumber = mutableListOf<Int>()
        randomNumber = (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).shuffled().take(MAX_GAME_SIZE).distinct().toMutableList()

        if (randomNumber[FIRST_DIGIT_NUMBER] == 0) return getNumber()
        return randomNumber
    }
    companion object {
        private const val MAX_RANDOM_NUMBER = 9
        private const val MIN_RANDOM_NUMBER = 0
        private const val MAX_GAME_SIZE = 3
        private const val FIRST_DIGIT_NUMBER = 0
    }
}