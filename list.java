package com.company;

public class list {

    protected node head;

    public list() {
        head = null;
    }


    public void insert(String N, int D) {
        node new_node = new node(N, D, null, null);

        if (head == null) {
            head = new_node;
            return;
        }
        if (head.next == null) {

            if (new_node.get_data() > head.get_data()) {
                head.set_next(new_node);
                new_node.set_previous(head);
            } else {
                head.set_previous(new_node);
                new_node.set_next(head);
                head = new_node;
            }
            return;
        }
        insert(new_node, head);
    }

    private void insert(node new_node, node head) {

        if (head.next == null) {
            head.set_next(new_node);
            new_node.set_previous(head);
            return;
        }
        if (head.get_data() > new_node.get_data()) {

            if (head.previous == null) {

                new_node.set_next(this.head);
                this.head.set_previous(new_node);
                this.head = new_node;
            } else {

                node temp = head.previous;

                new_node.set_next(head);
                head.set_previous(new_node);

                temp.set_next(new_node);
                new_node.set_previous(temp);
            }
            return;

        }
        insert(new_node, head.next);
    }

    public void display() {
        if (head == null) {
            return;
        } else {
            display(head);
        }
    }

    private void display(node head) {
        if (head == null) {
            return;
        } else {
            System.out.println("Name: " + head.get_name());
            System.out.println("Date: " + head.get_data());

            display(head.next);

        }
    }

    public void change_node_name(String old_name, String new_name) {

        change_node_name(head, old_name, new_name);
    }

    private void change_node_name(node head, String old_name, String new_name) {

        int value;
        value = head.get_name().compareTo(old_name);

        if (value == 0) {
            head.change_name(new_name);
        } else {
            change_node_name(head.next, old_name, new_name);
        }
        return;
    }

    public String remove_node(String old_name) {

        if (head == null) {
            return "none";
        }
        int value;
        value = head.get_name().compareTo(old_name);

        if (value == 0) {
            String temp;
            temp = head.get_name();
            head.set_next(head.get_next());
            return temp;

        } else {
            return remove_node(head, old_name);
        }
    }

    private String remove_node(node head, String old_name) {
        if (head == null) {
            return "no list";
        }
        int val;
        val = head.get_name().compareTo(old_name);

        if (val == 0) {

            if (head.get_next() != null && head.get_previous() != null) {
                String temp;
                temp = head.get_name();

                head.get_next().set_previous(head.get_previous());
                head.get_previous().set_next(head.get_next());//????

                return temp;
            }
            if (head.get_next() == null) {
                String temp;
                temp = head.get_name();
                head.get_previous().set_next(null);//needed, unsure why
                head = null;
                return temp;
            }

        } else {
            return remove_node(head.next, old_name);
        }

        return "error";
    }
}
