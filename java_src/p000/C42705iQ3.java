package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import p000.O80;
/* renamed from: iQ3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C42705iQ3<T> {

    /* renamed from: a */
    public T f87270a;

    /* renamed from: b */
    public ListenableFuture<Void> f87271b;

    /* renamed from: c */
    public O80.C5832a<Void> f87272c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Object m33999b(Object obj, O80.C5832a c5832a) throws Exception {
        this.f87272c = c5832a;
        return "PendingValue " + obj;
    }

    /* renamed from: c */
    public void m33998c(InterfaceC51452xA1<T, ListenableFuture<Void>> interfaceC51452xA1) {
        O36.m92961a();
        T t = this.f87270a;
        if (t != null) {
            O80.C5832a<Void> c5832a = this.f87272c;
            Objects.requireNonNull(c5832a);
            IA1.m102833k(interfaceC51452xA1.apply(t), c5832a);
        }
    }

    /* renamed from: d */
    public ListenableFuture<Void> m33997d(final T t) {
        O36.m92961a();
        ListenableFuture<Void> listenableFuture = this.f87271b;
        if (listenableFuture != null) {
            HZ3.m103728j(!listenableFuture.isDone(), "#setValue() is called after the value is propagated.");
            this.f87271b.cancel(false);
        }
        this.f87270a = t;
        ListenableFuture<Void> m92864a = O80.m92864a(new O80.InterfaceC5834c() { // from class: hQ3
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m33999b;
                m33999b = C42705iQ3.this.m33999b(t, c5832a);
                return m33999b;
            }
        });
        this.f87271b = m92864a;
        return m92864a;
    }
}
