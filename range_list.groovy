// Range
Range r = 1..10
println r.from

println r.to
println r.contains(3)

// List

List nums = [3,1,4,1,5,9,2,6,5]
println nums
println nums.class.name
nums.drop(4)

List nums2 = [3, [1, [4, [1, [5, 9], 2,], 6], 5]]
numsF = nums2.flatten()
numsF -1

numsF + [3, 5]
numsF << 88
