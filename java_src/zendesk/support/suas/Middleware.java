package zendesk.support.suas;
/* loaded from: classes8.dex */
public interface Middleware {
    void onAction(Action<?> action, GetState getState, Dispatcher dispatcher, Continuation continuation);
}
