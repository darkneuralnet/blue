package androidx.camera.core.impl;

import android.view.Surface;
import androidx.camera.core.impl.C11201g;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.O80;
/* renamed from: androidx.camera.core.impl.g */
/* loaded from: classes.dex */
public final class C11201g {

    /* renamed from: androidx.camera.core.impl.g$a */
    /* loaded from: classes.dex */
    public class C11202a implements CA1<List<Surface>> {

        /* renamed from: a */
        public final /* synthetic */ boolean f52605a;

        /* renamed from: b */
        public final /* synthetic */ O80.C5832a f52606b;

        /* renamed from: c */
        public final /* synthetic */ ScheduledFuture f52607c;

        public C11202a(boolean z, O80.C5832a c5832a, ScheduledFuture scheduledFuture) {
            this.f52605a = z;
            this.f52606b = c5832a;
            this.f52607c = scheduledFuture;
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(List<Surface> list) {
            ArrayList arrayList = new ArrayList(list);
            if (this.f52605a) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.f52606b.m92861c(arrayList);
            this.f52607c.cancel(true);
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            this.f52606b.m92861c(Collections.unmodifiableList(Collections.emptyList()));
            this.f52607c.cancel(true);
        }
    }

    private C11201g() {
    }

    /* renamed from: e */
    public static void m69410e(List<DeferrableSurface> list) {
        for (DeferrableSurface deferrableSurface : list) {
            deferrableSurface.m69469d();
        }
    }

    /* renamed from: f */
    public static void m69409f(List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        if (!list.isEmpty()) {
            int i = 0;
            do {
                try {
                    list.get(i).m69463j();
                    i++;
                } catch (DeferrableSurface.SurfaceClosedException e) {
                    for (int i2 = i - 1; i2 >= 0; i2--) {
                        list.get(i2).m69469d();
                    }
                    throw e;
                }
            } while (i < list.size());
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m69408g(ListenableFuture listenableFuture, O80.C5832a c5832a, long j) {
        if (!listenableFuture.isDone()) {
            c5832a.m92858f(new TimeoutException("Cannot complete surfaceList within " + j));
            listenableFuture.cancel(true);
        }
    }

    /* renamed from: h */
    public static /* synthetic */ void m69407h(Executor executor, final ListenableFuture listenableFuture, final O80.C5832a c5832a, final long j) {
        executor.execute(new Runnable() { // from class: fZ0
            @Override // java.lang.Runnable
            public final void run() {
                C11201g.m69408g(ListenableFuture.this, c5832a, j);
            }
        });
    }

    /* renamed from: j */
    public static /* synthetic */ Object m69405j(List list, ScheduledExecutorService scheduledExecutorService, final Executor executor, final long j, boolean z, final O80.C5832a c5832a) throws Exception {
        final ListenableFuture m102830n = IA1.m102830n(list);
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: dZ0
            @Override // java.lang.Runnable
            public final void run() {
                C11201g.m69407h(executor, m102830n, c5832a, j);
            }
        }, j, TimeUnit.MILLISECONDS);
        c5832a.m92863a(new Runnable() { // from class: eZ0
            @Override // java.lang.Runnable
            public final void run() {
                ListenableFuture.this.cancel(true);
            }
        }, executor);
        IA1.m102842b(m102830n, new C11202a(z, c5832a, schedule), executor);
        return "surfaceList";
    }

    /* renamed from: k */
    public static ListenableFuture<List<Surface>> m69404k(Collection<DeferrableSurface> collection, final boolean z, final long j, final Executor executor, final ScheduledExecutorService scheduledExecutorService) {
        final ArrayList arrayList = new ArrayList();
        for (DeferrableSurface deferrableSurface : collection) {
            arrayList.add(IA1.m102834j(deferrableSurface.m69465h()));
        }
        return O80.m92864a(new O80.InterfaceC5834c() { // from class: cZ0
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m69405j;
                m69405j = C11201g.m69405j(arrayList, scheduledExecutorService, executor, j, z, c5832a);
                return m69405j;
            }
        });
    }
}
