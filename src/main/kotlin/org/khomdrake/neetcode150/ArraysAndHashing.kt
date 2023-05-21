package org.khomdrake.neetcode150

object ArraysAndHashing {

    fun containsDuplicate(nums: IntArray): Boolean {
        val hashSet = hashSetOf<Int>()

        nums.forEach {
            if(hashSet.contains(it)) {
                return true
            }

            hashSet.add(it)
        }

        return false
    }

    fun isAnagram(s: String, t: String): Boolean {
        val a = s.toCharArray().sortedArray()
        val b = t.toCharArray().sortedArray()

        return a.contentEquals(b)
    }

}
