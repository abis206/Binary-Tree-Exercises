/**
View Problem Here: https://practiceit.cs.washington.edu/problem/view/bjp4/chapter17/e10-doublePositives
*/ 

public void doublePositives() {
    doublePositives(overallRoot);
}

private void doublePositives(IntTreeNode node) {
    if (node == null)
        return;

    if (node.data > 0)
        node.data *= 2;

    doublePositives(node.left);
    doublePositives(node.right);
}
