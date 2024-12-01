package IteratorPattern;
/*
抽象迭代器
* */
public interface AbstractIterator {
    //public void first();   //将游标指向第一个元素
    public void next();    //将游标指向下一个元素
    public boolean isLast(); //判断是否为最后一个元素
    public void previous(); //移至上一个元素
    public boolean isFirst(); //判断是否为第一个元素
    public Object getNextItem(); //获取下一个元素
    public Object getPreviousItem();//获取上一个元素
}
