import "slices"

func hasDuplicate(nums []int) bool {
    checkedNums := []int{}

    for _, val := range nums {
        if slices.Contains(checkedNums, val){
            return true
        }else{
            checkedNums = append(checkedNums, val)
        }
    }

    return false
}
