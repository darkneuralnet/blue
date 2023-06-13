package p000;

import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
/* renamed from: Zt4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37638Zt4<T> extends Observable<T> implements InterfaceC23484g<T> {
    /* renamed from: a */
    public abstract boolean mo25411a();

    public abstract void accept(T t);

    /* renamed from: c */
    public final AbstractC37638Zt4<T> m72348c() {
        if (this instanceof C41801gt5) {
            return this;
        }
        return new C41801gt5(this);
    }
}
