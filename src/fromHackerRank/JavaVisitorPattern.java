package fromHackerRank;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.Scanner;


public class JavaVisitorPattern {

    enum Color {
        RED, GREEN
    }

    abstract class Tree {

        private int value;
        private Color color;
        private int depth;

        public Tree(int value, Color color, int depth) {
            this.value = value;
            this.color = color;
            this.depth = depth;
        }

        public int getValue() {
            return value;
        }

        public Color getColor() {
            return color;
        }

        public int getDepth() {
            return depth;
        }

        public abstract void accept(TreeVis visitor);
    }

    class TreeNode extends Tree {

        private ArrayList<Tree> children = new ArrayList<>();

        public TreeNode(int value, Color color, int depth) {
            super(value, color, depth);
        }

        public void accept(TreeVis visitor) {
            visitor.visitNode(this);

            for (Tree child : children) {
                child.accept(visitor);
            }
        }

        public void addChild(Tree child) {
            children.add(child);
        }
    }

    class TreeLeaf extends Tree {

        public TreeLeaf(int value, Color color, int depth) {
            super(value, color, depth);
        }

        public void accept(TreeVis visitor) {
            visitor.visitLeaf(this);
        }
    }

    abstract class TreeVis
    {
        public abstract int getResult();
        public abstract void visitNode(TreeNode node);
        public abstract void visitLeaf(TreeLeaf leaf);

    }

    class SumInLeavesVisitor extends TreeVis {
        private int result = 0;
        public int getResult() {
            //implement this
            return result;
        }

        public void visitNode(TreeNode node) {
            //implement this
        }

        public void visitLeaf(TreeLeaf leaf) {
            //implement this
            result += leaf.getValue();
        }
    }

    class ProductOfRedNodesVisitor extends TreeVis {
        private long result = 1;
        private final int M = 1000000007;
        public int getResult() {
            //implement this
            return (int) result;
        }

        public void visitNode(TreeNode node) {
            //implement this
            if (node.getColor() == Color.RED) {
                result = (result * node.getValue()) % M;
            }
        }

        public void visitLeaf(TreeLeaf leaf) {
            //implement this
            if (leaf.getColor() == Color.RED) {
                result = (result * leaf.getValue()) % M;
            }
        }
    }

    class FancyVisitor extends TreeVis {
        private int nonLeafEvenDepthSum = 0;
        private int greenLeavesSum = 0;
        public int getResult() {
            //implement this
            return Math.abs(nonLeafEvenDepthSum - greenLeavesSum);
        }

        public void visitNode(TreeNode node) {
            //implement this
            if (node.getDepth() % 2 == 0) {
                nonLeafEvenDepthSum += node.getValue();
            }
        }

        public void visitLeaf(TreeLeaf leaf) {
            //implement this
            if (leaf.getColor() == Color.GREEN) {
                greenLeavesSum += leaf.getValue();
            }
        }
    }

        static int[] values;
        static Color[] colors;
        static ArrayList<Integer>[] edges;

        @SuppressWarning("unchecked")

    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function
        int n;
        TreeNode root;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        values = new int[n];
        colors = new Color[n];
        for (int i = 0; i < n; i++){
            values[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            colors[i] = sc.nextInt() == 0?Color.RED:Color.GREEN;
        }
        edges = (ArrayList<Integer>[] new ArrayList[n+1]);
        for (int i = 1; i <= n; i++) {
            edges[i] = new ArrayList<Integer>();
            for (int i = 0; i < n-1; i++) {
                int edgeNode1 = sc.nextInt();
                int edgeNode2 = sc.nextInt();
                edges[edgeNode1].add(edgeNode2);
                edges[edgeNode2].add(edgeNode1);
            }
            sc.close();
            root = new TreeNode(values[0], colors[0], 0);
            addchildren(root, 1);

            return root;
        }
        public static void addChildren(Tree node, Integer nodeNumber) {
            for (Integer otherNodeNumber:edges[nodeNumber]) {
                Tree otherNode;
                if (edges[otherNodeNumber].size() > 1) {
                    otherNode = new TreeNode(values[otherNodeNumber - 1], colors[otherNodeNumber - 1], node.getDepth() + 1);
                } else {
                    otherNode = new TreeLeaf(values[otherNodeNumber - 1], colors[otherNodeNumber - 1], node.getDepth() + 1);
                    ((TreeNode) node).addChild(otherNode);
                    edges[otherNodeNumber].remove(nodeNumber);
                    if (otherNode instanceof TreeNode) {
                        addChildren(otherNode, otherNodeNumber);
                    }
                }

            }
        }
    }


