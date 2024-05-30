package demo;

import java.util.Scanner;

public class Stack_Two {
    int MaxSize, tos1, tos2, stack[];

    void create_Stack(int size) {
        MaxSize = size;
        tos1 = -1;
        tos2 = MaxSize;
        stack = new int[MaxSize];
    }

    void push(int e, int stacknum) {
        if (stacknum == 1) {
            if (!isFull(stacknum)) {
                tos1++;
                stack[tos1] = e;
            } else {
                System.out.println("Stack " + stacknum + " is full..");
            }
        } else if (stacknum == 2) {
            if (!isFull(stacknum)) {
                tos2--;
                stack[tos2] = e;
            } else {
                System.out.println("Stack " + stacknum + " is full..");
            }
        } else {
            System.out.println("Invalid stack number.");
        }
    }

    boolean isFull(int stacknum) {
        if (stacknum == 1) {
            return tos1 == MaxSize / 2 - 1;
        } else if (stacknum == 2) {
            return tos2 == MaxSize / 2;
        } else {
            return false;
        }
    }

    int pop(int stacknum) {
        if (stacknum == 1) {
            if (!isEmpty(stacknum)) {
                int temp = stack[tos1];
                tos1--;
                return temp;
            } else {
                System.out.println("Stack " + stacknum + " is Empty..");
                return -1;
            }
        } else if (stacknum == 2) {
            if (!isEmpty(stacknum)) {
                int temp = stack[tos2];
                tos2++;
                return temp;
            } else {
                System.out.println("Stack " + stacknum + " is Empty..");
                return -1;
            }
        } else {
            System.out.println("Invalid stack number.");
            return -1;
        }
    }

    int peek(int stacknum) {
        if (stacknum == 1) {
            return stack[tos1];
        } else if (stacknum == 2) {
            return stack[tos2];
        } else {
            System.out.println("Invalid stack number.");
            return -1;
        }
    }

    boolean isEmpty(int stacknum) {
        if (stacknum == 1) {
            return tos1 == -1;
        } else if (stacknum == 2) {
            return tos2 == MaxSize;
        } else {
            return true;
        }
    }

    void print_Stack(int stacknum) {
        if (stacknum == 1) {
            for (int i = tos1; i > -1; i--) {
                System.out.println(stack[i]);
            }
        } else if (stacknum == 2) {
            for (int i = tos2; i < MaxSize; i++) {
                System.out.println(stack[i]);
            }
        } else {
            System.out.println("Invalid stack number.");
        }
    }

    public static void main(String args[]) {
        int size, element, choice, stacknum;
        Stack_Two obj = new Stack_Two();
        System.out.println("Enter size of stack:");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        obj.create_Stack(size);
        do {
            System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print Stack\n0.Exit\n:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter stack number (1 or 2):");
                    stacknum = sc.nextInt();
                    System.out.println("Enter an element:");
                    element = sc.nextInt();
                    obj.push(element, stacknum);
                    break;
                case 2:
                    System.out.println("Enter stack number (1 or 2):");
                    stacknum = sc.nextInt();
                    System.out.println("Element Popped:" + obj.pop(stacknum));
                    break;
                case 3:
                    System.out.println("Enter stack number (1 or 2):");
                    stacknum = sc.nextInt();
                    System.out.println("Element at Top:" + obj.peek(stacknum));
                    break;
                case 4:
                    System.out.println("Enter stack number (1 or 2):");
                    stacknum = sc.nextInt();
                    System.out.println("Elements in stack " + stacknum + " are:");
                    obj.print_Stack(stacknum);
                    break;
                case 0:
                    System.out.println("Thanks for using the code..");
                    break;
                default:
                    System.out.println("Wrong option selected..");
                    break;
            }

        } while (choice != 0);
    }
}
