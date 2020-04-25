/**
View Problem Here: https://practiceit.cs.washington.edu/problem/view/bjp4/chapter17/e9-equals
*/ 

public boolean equals2(IntTree root) {
    return equals2(overallRoot, root.overallRoot);
}

private boolean equals2(IntTreeNode node1, IntTreeNode node2) {
    if (node1 == null && node2 == null) {
        return true;
    } else if (node1.data != node2.data) {
        return false;
    } else {
        return equals2(node1.left, node2.left) && equals(node1.right, node2.right);
    }
}
