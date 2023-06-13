package p000;

import com.facebook.share.internal.C17296a;
import io.reactivex.InterfaceC24516r;
import io.reactivex.functions.InterfaceC23483f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0015\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0001J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"Lsh5;", "T", "Lio/reactivex/r;", "", "e", "Lio/reactivex/functions/f;", "p0", "", C17296a.f69688o, "value", "onSuccess", "(Ljava/lang/Object;)V", "onComplete", "", "error", "onError", "b", "Lio/reactivex/r;", "emitter", "<init>", "(Lio/reactivex/r;)V", "rx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: sh5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48796sh5<T> implements InterfaceC24516r<T> {

    /* renamed from: b */
    public final InterfaceC24516r<T> f109124b;

    public C48796sh5(InterfaceC24516r<T> emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this.f109124b = emitter;
    }

    @Override // io.reactivex.InterfaceC24516r
    /* renamed from: a */
    public void mo13821a(InterfaceC23483f interfaceC23483f) {
        this.f109124b.mo13821a(interfaceC23483f);
    }

    @Override // io.reactivex.InterfaceC24516r, io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return this.f109124b.mo1769e();
    }

    @Override // io.reactivex.InterfaceC24516r
    public void onComplete() {
        if (!this.f109124b.mo1769e()) {
            this.f109124b.onComplete();
        }
    }

    @Override // io.reactivex.InterfaceC24516r
    public void onError(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (!this.f109124b.mo1769e()) {
            this.f109124b.onError(error);
        }
    }

    @Override // io.reactivex.InterfaceC24516r
    public void onSuccess(T t) {
        if (!this.f109124b.mo1769e()) {
            this.f109124b.onSuccess(t);
        }
    }
}
