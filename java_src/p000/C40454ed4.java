package p000;

import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC24578y;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23483f;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: ed4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C40454ed4<T> implements InterfaceC23436D<T>, InterfaceC23483f {

    /* renamed from: b */
    public final AtomicBoolean f78621b = new AtomicBoolean(false);

    /* renamed from: c */
    public final InterfaceC24578y<T> f78622c;

    /* renamed from: d */
    public final InterfaceC39862dd4 f78623d;

    public C40454ed4(InterfaceC24578y<T> interfaceC24578y, InterfaceC39862dd4 interfaceC39862dd4) {
        this.f78622c = interfaceC24578y;
        this.f78623d = interfaceC39862dd4;
        interfaceC24578y.mo11916a(this);
    }

    @Override // io.reactivex.functions.InterfaceC23483f
    public synchronized void cancel() {
        this.f78621b.set(true);
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onComplete() {
        this.f78623d.release();
        this.f78622c.onComplete();
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onError(Throwable th) {
        this.f78623d.release();
        this.f78622c.mo11914c(th);
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onNext(T t) {
        this.f78622c.onNext(t);
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
    }
}
