package zendesk.support.guide;

import android.annotation.SuppressLint;
import java.util.UUID;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.Zendesk;
import zendesk.support.Guide;
import zendesk.support.GuideModule;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public enum GuideSdkDependencyProvider {
    INSTANCE;
    
    public static final String NOT_INITIALIZED_LOG = "Zendesk is not initialized or no identity was set. Make sure Zendesk.INSTANCE.init(...), Zendesk.INSTANCE.setIdentity(...), Guide.INSTANCE.init(...) was called ";
    ActionHandler actionHandler;
    private GuideSdkComponent guideSdkComponent;

    /* renamed from: id */
    private UUID f121965id;
    ActionHandlerRegistry registry;

    public void initForTesting(GuideSdkComponent guideSdkComponent, UUID uuid) {
        this.guideSdkComponent = guideSdkComponent;
        this.f121965id = uuid;
    }

    public boolean isInitialized() {
        if (Zendesk.INSTANCE.isInitialized() && Guide.INSTANCE.isInitialized()) {
            return true;
        }
        return false;
    }

    @SuppressLint({"RestrictedApi"})
    public GuideSdkComponent provideGuideSdkComponent() {
        GuideModule guideModule = Guide.INSTANCE.guideModule();
        if (!guideModule.getId().equals(this.f121965id)) {
            this.guideSdkComponent = DaggerGuideSdkComponent.builder().coreModule(Zendesk.INSTANCE.coreModule()).guideModule(guideModule).build();
            this.f121965id = guideModule.getId();
            this.guideSdkComponent.inject(this);
            this.registry.add(this.actionHandler);
        }
        return this.guideSdkComponent;
    }
}
