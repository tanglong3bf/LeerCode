#include <vector>
#include <unordered_map>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, size_t> m;
        for (size_t i = 0; i < nums.size(); ++i) {
            if (m.find(target - nums[i]) != m.end()) {
                if (i == m[target - nums[i]]) {
                    continue;
                }
                return vector<int>{static_cast<int>(i),
                        static_cast<int>(m[target - nums[i]])};
            }
            m[nums[i]] = i;
        }
        return vector<int>{-1, -1};
    }
};
