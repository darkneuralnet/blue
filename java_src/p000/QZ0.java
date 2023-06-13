package p000;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
@SuppressLint({"RestrictedApi"})
/* renamed from: QZ0 */
/* loaded from: classes6.dex */
public class QZ0<V> extends AbstractC22530h1<V> implements ScheduledFuture<V> {

    /* renamed from: i */
    public final ScheduledFuture<?> f30524i;

    /* renamed from: QZ0$a */
    /* loaded from: classes6.dex */
    public class C6800a implements InterfaceC6801b<V> {
        public C6800a() {
        }

        @Override // p000.QZ0.InterfaceC6801b
        /* renamed from: a */
        public void mo88399a(Throwable th) {
            QZ0.this.mo37214q(th);
        }

        @Override // p000.QZ0.InterfaceC6801b
        public void set(V v) {
            QZ0.this.mo37215p(v);
        }
    }

    /* renamed from: QZ0$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC6801b<T> {
        /* renamed from: a */
        void mo88399a(Throwable th);

        void set(T t);
    }

    /* renamed from: QZ0$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC6802c<T> {
        /* renamed from: a */
        ScheduledFuture<?> mo88398a(InterfaceC6801b<T> interfaceC6801b);
    }

    public QZ0(InterfaceC6802c<V> interfaceC6802c) {
        this.f30524i = interfaceC6802c.mo88398a(new C6800a());
    }

    @Override // p000.AbstractC22530h1
    /* renamed from: b */
    public void mo37228b() {
        this.f30524i.cancel(m37212s());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f30524i.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    /* renamed from: v */
    public int compareTo(Delayed delayed) {
        return this.f30524i.compareTo(delayed);
    }
}
