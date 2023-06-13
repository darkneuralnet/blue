package zendesk.support;
/* loaded from: classes8.dex */
abstract class ZendeskCallbackSuccess<E> extends AbstractC44415lI6<E> {
    private final AbstractC44415lI6 callback;

    public ZendeskCallbackSuccess(AbstractC44415lI6 abstractC44415lI6) {
        this.callback = abstractC44415lI6;
    }

    @Override // p000.AbstractC44415lI6
    public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
        AbstractC44415lI6 abstractC44415lI6 = this.callback;
        if (abstractC44415lI6 != null) {
            abstractC44415lI6.onError(interfaceC48782sg1);
        }
    }

    @Override // p000.AbstractC44415lI6
    public abstract void onSuccess(E e);
}
