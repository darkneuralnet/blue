package p000;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
/* renamed from: rM4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48007rM4<T> implements InterfaceC43263jM4 {

    /* renamed from: a */
    public final Object f106894a = new Object();

    /* renamed from: b */
    public final Map<Object, WeakReference<T>> f106895b = new HashMap();

    /* renamed from: c */
    public final Map<Object, CompletableFuture<T>> f106896c = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Void m16039d(Object obj, CompletableFuture completableFuture, Object obj2, Throwable th) {
        synchronized (this) {
            synchronized (this.f106894a) {
                if (this.f106896c.get(obj) == completableFuture) {
                    this.f106896c.remove(obj);
                    if (th == null) {
                        this.f106895b.put(obj, new WeakReference<>(obj2));
                    }
                }
            }
        }
        return null;
    }

    @Override // p000.InterfaceC43263jM4
    /* renamed from: a */
    public void mo16042a() {
        synchronized (this.f106894a) {
            Iterator<Map.Entry<Object, CompletableFuture<T>>> it = this.f106896c.entrySet().iterator();
            while (it.hasNext()) {
                it.remove();
                CompletableFuture<T> value = it.next().getValue();
                if (!value.isDone()) {
                    value.cancel(true);
                }
            }
            this.f106895b.clear();
        }
    }

    /* renamed from: c */
    public CompletableFuture<T> m16040c(Object obj) {
        DZ3.m110173d(obj, "Parameter 'id' was null.");
        synchronized (this.f106894a) {
            WeakReference<T> weakReference = this.f106895b.get(obj);
            if (weakReference != null) {
                T t = weakReference.get();
                if (t != null) {
                    return CompletableFuture.completedFuture(t);
                }
                this.f106895b.remove(obj);
            }
            return this.f106896c.get(obj);
        }
    }

    /* renamed from: e */
    public void m16038e(final Object obj, final CompletableFuture<T> completableFuture) {
        DZ3.m110173d(obj, "Parameter 'id' was null.");
        DZ3.m110173d(completableFuture, "Parameter 'futureResource' was null.");
        if (completableFuture.isDone()) {
            if (completableFuture.isCompletedExceptionally()) {
                return;
            }
            Object m110174c = DZ3.m110174c(completableFuture.getNow(null));
            synchronized (this.f106894a) {
                this.f106895b.put(obj, new WeakReference<>(m110174c));
                this.f106896c.remove(obj);
            }
            return;
        }
        synchronized (this.f106894a) {
            this.f106896c.put(obj, completableFuture);
            this.f106895b.remove(obj);
        }
        completableFuture.handle((BiFunction) new BiFunction() { // from class: qM4
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj2, Object obj3) {
                Void m16039d;
                m16039d = C48007rM4.this.m16039d(obj, completableFuture, obj2, (Throwable) obj3);
                return m16039d;
            }
        });
    }
}
