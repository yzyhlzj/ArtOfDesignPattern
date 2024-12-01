package IteratorPattern;

import java.util.List;

public class ProductIterator implements AbstractIterator{
    /**
     * 商品迭代器：具体迭代器
     */
    private ProductList productList;
    private List products;
    private int cursor1;
    private int cursor2;

    public ProductIterator(ProductList list){
        this.productList = list;
        this.products = list.getObjects(); //获取集合对象
        cursor1=0;//设置正向遍历游标的初始值
        cursor2=products.size()-1;//设置逆向遍历游标的初始值
    }
    @Override
    public void next() {
        if(cursor1 < products.size()){
            cursor1++;
        }
    }

    /**
     * @return
     */
    @Override
    public boolean isLast() {
        return (cursor1==products.size());
    }

    /**
     *
     */
    @Override
    public void previous() {
        if(cursor2 > -1){
            cursor2--;
        }
    }

    /**
     * @return
     */
    @Override
    public boolean isFirst() {
        return (cursor2==-1);
    }

    /**
     * @return
     */
    @Override
    public Object getNextItem() {
        return products.get(cursor1);
    }

    /**
     * @return
     */
    @Override
    public Object getPreviousItem() {
        return products.get(cursor2);
    }
}
