// 206. Reverse Linked List 
class Solution { 
public: 
    ListNode* reverseList(ListNode* head) { 
        ListNode* temp=head; 
        ListNode* prev=NULL; 
        while(temp!=NULL) { 
            ListNode* front=temp-
            temp-=prev; 
            prev=temp; 
            temp=front; 
        } 
        return prev; 
    } 
}; 
