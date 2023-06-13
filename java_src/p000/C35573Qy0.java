package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p000.InterfaceC37493Zd3;
/* renamed from: Qy0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35573Qy0<T> implements InterfaceC37493Zd3<T> {

    /* renamed from: b */
    public static final C35573Qy0<Object> f31317b = new C35573Qy0<>(null);

    /* renamed from: a */
    public final ListenableFuture<T> f31318a;

    public C35573Qy0(T t) {
        this.f31318a = IA1.m102836h(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m87496e(InterfaceC37493Zd3.InterfaceC10303a interfaceC10303a) {
        try {
            interfaceC10303a.mo68963a(this.f31318a.get());
        } catch (InterruptedException | ExecutionException e) {
            interfaceC10303a.onError(e);
        }
    }

    /* renamed from: f */
    public static <U> InterfaceC37493Zd3<U> m87495f(U u) {
        if (u == null) {
            return f31317b;
        }
        return new C35573Qy0(u);
    }

    @Override // p000.InterfaceC37493Zd3
    /* renamed from: b */
    public void mo72844b(InterfaceC37493Zd3.InterfaceC10303a<? super T> interfaceC10303a) {
    }

    @Override // p000.InterfaceC37493Zd3
    /* renamed from: c */
    public void mo72843c(Executor executor, final InterfaceC37493Zd3.InterfaceC10303a<? super T> interfaceC10303a) {
        this.f31318a.addListener(new Runnable() { // from class: Py0
            @Override // java.lang.Runnable
            public final void run() {
                C35573Qy0.this.m87496e(interfaceC10303a);
            }
        }, executor);
    }

    @Override // p000.InterfaceC37493Zd3
    /* renamed from: d */
    public ListenableFuture<T> mo72842d() {
        return this.f31318a;
    }
}
