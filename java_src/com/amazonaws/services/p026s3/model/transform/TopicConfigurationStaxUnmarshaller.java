package com.amazonaws.services.p026s3.model.transform;

import com.amazonaws.services.p026s3.model.TopicConfiguration;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers;
import com.amazonaws.transform.StaxUnmarshallerContext;
/* renamed from: com.amazonaws.services.s3.model.transform.TopicConfigurationStaxUnmarshaller */
/* loaded from: classes3.dex */
class TopicConfigurationStaxUnmarshaller extends NotificationConfigurationStaxUnmarshaller<TopicConfiguration> {
    private static TopicConfigurationStaxUnmarshaller instance = new TopicConfigurationStaxUnmarshaller();

    private TopicConfigurationStaxUnmarshaller() {
    }

    public static TopicConfigurationStaxUnmarshaller getInstance() {
        return instance;
    }

    @Override // com.amazonaws.services.p026s3.model.transform.NotificationConfigurationStaxUnmarshaller
    public TopicConfiguration createConfiguration() {
        return new TopicConfiguration();
    }

    @Override // com.amazonaws.services.p026s3.model.transform.NotificationConfigurationStaxUnmarshaller
    public boolean handleXmlEvent(TopicConfiguration topicConfiguration, StaxUnmarshallerContext staxUnmarshallerContext, int i) throws Exception {
        if (staxUnmarshallerContext.testExpression("Topic", i)) {
            topicConfiguration.setTopicARN(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext));
            return true;
        }
        return false;
    }
}
