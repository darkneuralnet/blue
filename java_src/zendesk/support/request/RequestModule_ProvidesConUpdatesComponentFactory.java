package zendesk.support.request;

import android.content.Context;
import zendesk.core.ActionHandlerRegistry;
import zendesk.support.requestlist.RequestInfoDataSource;
/* loaded from: classes8.dex */
public final class RequestModule_ProvidesConUpdatesComponentFactory implements InterfaceC48812sj1<ComponentUpdateActionHandlers> {
    private final Y94<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private final Y94<Context> contextProvider;
    private final Y94<RequestInfoDataSource.LocalDataSource> dataSourceProvider;

    public RequestModule_ProvidesConUpdatesComponentFactory(Y94<Context> y94, Y94<ActionHandlerRegistry> y942, Y94<RequestInfoDataSource.LocalDataSource> y943) {
        this.contextProvider = y94;
        this.actionHandlerRegistryProvider = y942;
        this.dataSourceProvider = y943;
    }

    public static RequestModule_ProvidesConUpdatesComponentFactory create(Y94<Context> y94, Y94<ActionHandlerRegistry> y942, Y94<RequestInfoDataSource.LocalDataSource> y943) {
        return new RequestModule_ProvidesConUpdatesComponentFactory(y94, y942, y943);
    }

    public static ComponentUpdateActionHandlers providesConUpdatesComponent(Context context, ActionHandlerRegistry actionHandlerRegistry, RequestInfoDataSource.LocalDataSource localDataSource) {
        return (ComponentUpdateActionHandlers) C51679xZ3.m5002e(RequestModule.providesConUpdatesComponent(context, actionHandlerRegistry, localDataSource));
    }

    @Override // p000.Y94
    public ComponentUpdateActionHandlers get() {
        return providesConUpdatesComponent(this.contextProvider.get(), this.actionHandlerRegistryProvider.get(), this.dataSourceProvider.get());
    }
}
