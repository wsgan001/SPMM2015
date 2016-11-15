package org.cheetahplatform.modeler.bpmn;

import org.cheetahplatform.modeler.EditorRegistry;
import org.cheetahplatform.modeler.bpmn.figure.AndGatewayFigure;
import org.cheetahplatform.modeler.configuration.CheetahPlatformConfigurator;
import org.cheetahplatform.modeler.configuration.IConfiguration;
import org.cheetahplatform.modeler.generic.figure.IGraphElementFigure;
import org.cheetahplatform.modeler.graph.model.GraphElement;
import org.eclipse.draw2d.geometry.Point;

import com.swtdesigner.SWTResourceManager;

public class AndGatewayDescriptor extends ConnectorDescriptor {

	public AndGatewayDescriptor() {
		super("img/bpmn/and.png", "AND", EditorRegistry.BPMN_AND_GATEWAY);
	}

	@Override
	public IGraphElementFigure createFigure(GraphElement element) {
		String name = null;
		if (CheetahPlatformConfigurator.getBoolean(IConfiguration.SHOW_ID_NOT_TASK_NAME)
				|| CheetahPlatformConfigurator.getBoolean(IConfiguration.SHOW_ID_AND_TASK_NAME)) {
			name = Long.toString(element.getId());
		}
		AndGatewayFigure gateway = new AndGatewayFigure(name);
		gateway.setBackgroundColor(SWTResourceManager.getColor(255, 255, 255));
		gateway.setCrossColor(SWTResourceManager.getColor(0, 0, 0));
		return gateway;
	}

	@Override
	public Point getInitialSize() {
		return (Point) CheetahPlatformConfigurator.getObject(IConfiguration.INITIAL_GATEWAY_SIZE);
	}

}