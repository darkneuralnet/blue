package zendesk.support.request;

import android.content.Context;
import zendesk.core.ActionHandlerRegistry;
import zendesk.support.suas.Dispatcher;
/* loaded from: classes8.dex */
public final class RequestModule_ProvidesMessageFactoryFactory implements InterfaceC48812sj1<CellFactory> {
    private final Y94<ActionFactory> actionFactoryProvider;
    private final Y94<C32054Bx0> configHelperProvider;
    private final Y94<Context> contextProvider;
    private final Y94<Dispatcher> dispatcherProvider;
    private final RequestModule module;
    private final Y94<C42732iT3> picassoProvider;
    private final Y94<ActionHandlerRegistry> registryProvider;

    public RequestModule_ProvidesMessageFactoryFactory(RequestModule requestModule, Y94<Context> y94, Y94<C42732iT3> y942, Y94<ActionFactory> y943, Y94<Dispatcher> y944, Y94<ActionHandlerRegistry> y945, Y94<C32054Bx0> y946) {
        this.module = requestModule;
        this.contextProvider = y94;
        this.picassoProvider = y942;
        this.actionFactoryProvider = y943;
        this.dispatcherProvider = y944;
        this.registryProvider = y945;
        this.configHelperProvider = y946;
    }

    public static RequestModule_ProvidesMessageFactoryFactory create(RequestModule requestModule, Y94<Context> y94, Y94<C42732iT3> y942, Y94<ActionFactory> y943, Y94<Dispatcher> y944, Y94<ActionHandlerRegistry> y945, Y94<C32054Bx0> y946) {
        return new RequestModule_ProvidesMessageFactoryFactory(requestModule, y94, y942, y943, y944, y945, y946);
    }

    public static CellFactory providesMessageFactory(RequestModule requestModule, Context context, C42732iT3 c42732iT3, Object obj, Dispatcher dispatcher, ActionHandlerRegistry actionHandlerRegistry, C32054Bx0 c32054Bx0) {
        return (CellFactory) C51679xZ3.m5002e(requestModule.providesMessageFactory(context, c42732iT3, (ActionFactory) obj, dispatcher, actionHandlerRegistry, c32054Bx0));
    }

    @Override // p000.Y94
    public CellFactory get() {
        return providesMessageFactory(this.module, this.contextProvider.get(), this.picassoProvider.get(), this.actionFactoryProvider.get(), this.dispatcherProvider.get(), this.registryProvider.get(), this.configHelperProvider.get());
    }
}
