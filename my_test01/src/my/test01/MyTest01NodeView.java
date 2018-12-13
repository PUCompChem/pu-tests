package my.test01;

import org.knime.core.node.NodeView;

/**
 * <code>NodeView</code> for the "MyTest01" Node.
 * 
 *
 * @author NK
 */
public class MyTest01NodeView extends NodeView<MyTest01NodeModel> {

    /**
     * Creates a new view.
     * 
     * @param nodeModel The model (class: {@link MyTest01NodeModel})
     */
    protected MyTest01NodeView(final MyTest01NodeModel nodeModel) {
        super(nodeModel);

        // TODO instantiate the components of the view here.

    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void modelChanged() {

        // TODO retrieve the new model from your nodemodel and 
        // update the view.
        MyTest01NodeModel nodeModel = 
            (MyTest01NodeModel)getNodeModel();
        assert nodeModel != null;
        
        // be aware of a possibly not executed nodeModel! The data you retrieve
        // from your nodemodel could be null, emtpy, or invalid in any kind.
        
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onClose() {
    
        // TODO things to do when closing the view
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onOpen() {

        // TODO things to do when opening the view
    }

}

