package p000;

import com.facebook.share.internal.C17296a;
import io.reactivex.InterfaceC24578y;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23483f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0015\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0001J\u0015\u0010\n\u001a\u00020\u00072\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\tH\u0096\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u000bH\u0096\u0001J\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0007H\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000bH\u0016R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Lth5;", "T", "Lio/reactivex/y;", "", "e", "Lio/reactivex/functions/f;", "p0", "", C17296a.f69688o, "Lio/reactivex/disposables/c;", "b", "", "c", "value", "onNext", "(Ljava/lang/Object;)V", "onComplete", "error", "onError", "Lio/reactivex/y;", "emitter", "<init>", "(Lio/reactivex/y;)V", "rx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: th5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49389th5<T> implements InterfaceC24578y<T> {

    /* renamed from: b */
    public final InterfaceC24578y<T> f110882b;

    public C49389th5(InterfaceC24578y<T> emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this.f110882b = emitter;
    }

    @Override // io.reactivex.InterfaceC24578y
    /* renamed from: a */
    public void mo11916a(InterfaceC23483f interfaceC23483f) {
        this.f110882b.mo11916a(interfaceC23483f);
    }

    @Override // io.reactivex.InterfaceC24578y
    /* renamed from: b */
    public void mo11915b(InterfaceC23465c interfaceC23465c) {
        this.f110882b.mo11915b(interfaceC23465c);
    }

    @Override // io.reactivex.InterfaceC24578y
    /* renamed from: c */
    public boolean mo11914c(Throwable p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return this.f110882b.mo11914c(p0);
    }

    @Override // io.reactivex.InterfaceC24578y, io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return this.f110882b.mo1769e();
    }

    @Override // io.reactivex.InterfaceC24489j
    public void onComplete() {
        if (!this.f110882b.mo1769e()) {
            this.f110882b.onComplete();
        }
    }

    @Override // io.reactivex.InterfaceC24489j
    public void onError(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (!this.f110882b.mo1769e()) {
            this.f110882b.onError(error);
        }
    }

    @Override // io.reactivex.InterfaceC24489j
    public void onNext(T t) {
        if (!this.f110882b.mo1769e()) {
            this.f110882b.onNext(t);
        }
    }
}
