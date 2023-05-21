import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.khomdrake.neetcode150.ArraysAndHashing

class ArrayAndHashingTest {

    @Test
    fun containsDuplicate() {
        Assertions.assertEquals(true, ArraysAndHashing.containsDuplicate(
            intArrayOf(1,2,3,1)
        ))

        Assertions.assertEquals(false, ArraysAndHashing.containsDuplicate(
            intArrayOf(1,2,3,4)
        ))

        Assertions.assertEquals(true, ArraysAndHashing.containsDuplicate(
            intArrayOf(1,1,1,3,3,4,3,2,4,2)
        ))
    }

    @Test
    fun isAnagram() {
        Assertions.assertEquals(true, ArraysAndHashing.isAnagram(
            "anagram", "nagaram"
        ))

        Assertions.assertEquals(false, ArraysAndHashing.isAnagram(
            "rat", "cat"
        ))

        Assertions.assertEquals(false, ArraysAndHashing.isAnagram(
            "aacc", "ccac"
        ))
    }

}