package my.test01;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "MyTest01" Node.
 * 
 *
 * @author NK
 */
public class MyTest01NodeFactory 
        extends NodeFactory<MyTest01NodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public MyTest01NodeModel createNodeModel() {
        return new MyTest01NodeModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getNrNodeViews() {
        return 1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeView<MyTest01NodeModel> createNodeView(final int viewIndex,
            final MyTest01NodeModel nodeModel) {
        return new MyTest01NodeView(nodeModel);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasDialog() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeDialogPane createNodeDialogPane() {
        return new MyTest01NodeDialog();
    }

}

