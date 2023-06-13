package p000;

import com.facebook.share.internal.C17296a;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\tB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0003H\u0014J\u0018\u0010\u0007\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0003H$J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002R\u0014\u0010\u000b\u001a\u00028\u00008$X¤\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"Lu22;", "T", "Lio/reactivex/Observable;", "Lio/reactivex/D;", "observer", "", "subscribeActual", "e", "c", C17296a.f69688o, "()Ljava/lang/Object;", "initialValue", "<init>", "()V", "rxbinding_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: u22  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC49595u22<T> extends Observable<T> {

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0002H\u0014¨\u0006\b"}, m28432d2 = {"Lu22$a;", "Lio/reactivex/Observable;", "Lio/reactivex/D;", "observer", "", "subscribeActual", "<init>", "(Lu22;)V", "rxbinding_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: u22$a */
    /* loaded from: classes6.dex */
    public final class C29006a extends Observable<T> {
        public C29006a() {
        }

        @Override // io.reactivex.Observable
        public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
            AbstractC49595u22.this.mo11037e(interfaceC23436D);
        }
    }

    /* renamed from: a */
    public abstract T mo11039a();

    /* renamed from: c */
    public final Observable<T> m11038c() {
        return new C29006a();
    }

    /* renamed from: e */
    public abstract void mo11037e(InterfaceC23436D<? super T> interfaceC23436D);

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        mo11037e(interfaceC23436D);
        interfaceC23436D.onNext(mo11039a());
    }
}
