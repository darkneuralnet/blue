package zendesk.support.guide;

import zendesk.core.ActionHandler;
/* loaded from: classes8.dex */
public final class GuideSdkModule_ViewArticleActionHandlerFactory implements InterfaceC48812sj1<ActionHandler> {

    /* loaded from: classes8.dex */
    public static final class InstanceHolder {
        private static final GuideSdkModule_ViewArticleActionHandlerFactory INSTANCE = new GuideSdkModule_ViewArticleActionHandlerFactory();

        private InstanceHolder() {
        }
    }

    public static GuideSdkModule_ViewArticleActionHandlerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ActionHandler viewArticleActionHandler() {
        return (ActionHandler) C51679xZ3.m5002e(GuideSdkModule.viewArticleActionHandler());
    }

    @Override // p000.Y94
    public ActionHandler get() {
        return viewArticleActionHandler();
    }
}
