package p000;

import com.facebook.share.internal.C17296a;
import io.reactivex.InterfaceC23444H;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23483f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0015\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0001J\u0015\u0010\n\u001a\u00020\u00072\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\tH\u0096\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u000bH\u0096\u0001J\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bH\u0016R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"Lxh5;", "T", "Lio/reactivex/H;", "", "e", "Lio/reactivex/functions/f;", "p0", "", C17296a.f69688o, "Lio/reactivex/disposables/c;", "b", "", "c", "value", "onSuccess", "(Ljava/lang/Object;)V", "error", "onError", "Lio/reactivex/H;", "emitter", "<init>", "(Lio/reactivex/H;)V", "rx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xh5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51760xh5<T> implements InterfaceC23444H<T> {

    /* renamed from: b */
    public final InterfaceC23444H<T> f117978b;

    public C51760xh5(InterfaceC23444H<T> emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this.f117978b = emitter;
    }

    @Override // io.reactivex.InterfaceC23444H
    /* renamed from: a */
    public void mo4878a(InterfaceC23483f interfaceC23483f) {
        this.f117978b.mo4878a(interfaceC23483f);
    }

    @Override // io.reactivex.InterfaceC23444H
    /* renamed from: b */
    public void mo4877b(InterfaceC23465c interfaceC23465c) {
        this.f117978b.mo4877b(interfaceC23465c);
    }

    @Override // io.reactivex.InterfaceC23444H
    /* renamed from: c */
    public boolean mo4876c(Throwable p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return this.f117978b.mo4876c(p0);
    }

    @Override // io.reactivex.InterfaceC23444H, io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return this.f117978b.mo1769e();
    }

    @Override // io.reactivex.InterfaceC23444H
    public void onError(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (!this.f117978b.mo1769e()) {
            this.f117978b.onError(error);
        }
    }

    @Override // io.reactivex.InterfaceC23444H
    public void onSuccess(T t) {
        if (!this.f117978b.mo1769e()) {
            this.f117978b.onSuccess(t);
        }
    }
}
