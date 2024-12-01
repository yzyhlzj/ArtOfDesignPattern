package IteratorPattern;

import java.util.List;

public class ProductList extends AbstractObjectList{
    /**
     * @return
     */
    public ProductList(List products){
        super(products);
    }
    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
