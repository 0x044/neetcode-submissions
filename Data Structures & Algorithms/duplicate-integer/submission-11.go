func hasDuplicate(nums []int) bool {
    seenMap := make(map[int]bool)

    for _, num := range nums {
        seen := seenMap[num]
        if(seen){
            return true
        }
        seenMap[num] = true
    }
    return false
}
