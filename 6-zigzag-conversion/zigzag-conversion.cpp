class Solution {
public:
    string convert(string s, int numRows) {
        if(numRows==1) return s;
        string result;
        int increment=2*(numRows-1);

        for(int i=0; i<numRows; i++){
            for(int j=0; j+i<s.size(); j+=increment){
                result.push_back(s[j+i]);
                if(i>0 && i<numRows-1 && j+increment-i < s.size()){
                    result.push_back(s[j+increment-i]);
                }
            }
        }
        return result;
    }
};