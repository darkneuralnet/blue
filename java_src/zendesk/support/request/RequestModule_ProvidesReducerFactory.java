package zendesk.support.request;

import java.util.List;
import zendesk.support.suas.Reducer;
/* loaded from: classes8.dex */
public final class RequestModule_ProvidesReducerFactory implements InterfaceC48812sj1<List<Reducer>> {

    /* loaded from: classes8.dex */
    public static final class InstanceHolder {
        private static final RequestModule_ProvidesReducerFactory INSTANCE = new RequestModule_ProvidesReducerFactory();

        private InstanceHolder() {
        }
    }

    public static RequestModule_ProvidesReducerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static List<Reducer> providesReducer() {
        return (List) C51679xZ3.m5002e(RequestModule.providesReducer());
    }

    @Override // p000.Y94
    public List<Reducer> get() {
        return providesReducer();
    }
}
