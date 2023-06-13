package androidx.camera.lifecycle;

import android.content.Context;
import androidx.camera.core.AbstractC11253p;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.impl.InterfaceC11191c;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.lifecycle.C11260b;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p000.C42812ic0;
import p000.C52891zc0;
import p000.O80;
/* renamed from: androidx.camera.lifecycle.b */
/* loaded from: classes.dex */
public final class C11260b {

    /* renamed from: h */
    public static final C11260b f52814h = new C11260b();

    /* renamed from: c */
    public ListenableFuture<C52298yc0> f52817c;

    /* renamed from: f */
    public C52298yc0 f52820f;

    /* renamed from: g */
    public Context f52821g;

    /* renamed from: a */
    public final Object f52815a = new Object();

    /* renamed from: b */
    public C52891zc0.InterfaceC31059b f52816b = null;

    /* renamed from: d */
    public ListenableFuture<Void> f52818d = IA1.m102836h(null);

    /* renamed from: e */
    public final LifecycleCameraRepository f52819e = new LifecycleCameraRepository();

    /* renamed from: androidx.camera.lifecycle.b$a */
    /* loaded from: classes.dex */
    public class C11261a implements CA1<Void> {

        /* renamed from: a */
        public final /* synthetic */ O80.C5832a f52822a;

        /* renamed from: b */
        public final /* synthetic */ C52298yc0 f52823b;

        public C11261a(O80.C5832a c5832a, C52298yc0 c52298yc0) {
            this.f52822a = c5832a;
            this.f52823b = c52298yc0;
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(Void r2) {
            this.f52822a.m92861c(this.f52823b);
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            this.f52822a.m92858f(th);
        }
    }

    private C11260b() {
    }

    /* renamed from: h */
    public static ListenableFuture<C11260b> m69005h(final Context context) {
        HZ3.m103731g(context);
        return IA1.m102829o(f52814h.m69004i(context), new InterfaceC51452xA1() { // from class: n64
            @Override // p000.InterfaceC51452xA1
            public final Object apply(Object obj) {
                C11260b m69002k;
                m69002k = C11260b.m69002k(context, (C52298yc0) obj);
                return m69002k;
            }
        }, C31631Ac0.m115449a());
    }

    /* renamed from: k */
    public static /* synthetic */ C11260b m69002k(Context context, C52298yc0 c52298yc0) {
        C11260b c11260b = f52814h;
        c11260b.m68998o(c52298yc0);
        c11260b.m68997p(C39603dB0.m44549a(context));
        return c11260b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Object m69000m(final C52298yc0 c52298yc0, O80.C5832a c5832a) throws Exception {
        synchronized (this.f52815a) {
            IA1.m102842b(DA1.m110820a(this.f52818d).m110816e(new InterfaceC20537fp() { // from class: p64
                @Override // p000.InterfaceC20537fp
                public final ListenableFuture apply(Object obj) {
                    ListenableFuture m3182i;
                    Void r2 = (Void) obj;
                    m3182i = C52298yc0.this.m3182i();
                    return m3182i;
                }
            }, C31631Ac0.m115449a()), new C11261a(c5832a, c52298yc0), C31631Ac0.m115449a());
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    /* renamed from: d */
    public InterfaceC45757na0 m69009d(LifecycleOwner lifecycleOwner, C42812ic0 c42812ic0, C37280Yf6 c37280Yf6) {
        if (m69006g() != 2) {
            m68999n(1);
            return m69008e(lifecycleOwner, c42812ic0, c37280Yf6.m74488c(), c37280Yf6.m74490a(), (AbstractC11253p[]) c37280Yf6.m74489b().toArray(new AbstractC11253p[0]));
        }
        throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
    }

    /* renamed from: e */
    public InterfaceC45757na0 m69008e(LifecycleOwner lifecycleOwner, C42812ic0 c42812ic0, C32717Es6 c32717Es6, List<AbstractC52288yb0> list, AbstractC11253p... abstractC11253pArr) {
        InterfaceC11191c interfaceC11191c;
        InterfaceC11191c mo71178b;
        O36.m92961a();
        C42812ic0.C23290a m33757c = C42812ic0.C23290a.m33757c(c42812ic0);
        int length = abstractC11253pArr.length;
        int i = 0;
        while (true) {
            interfaceC11191c = null;
            if (i >= length) {
                break;
            }
            C42812ic0 m69269w = abstractC11253pArr[i].m69058i().m69269w(null);
            if (m69269w != null) {
                Iterator<InterfaceC33026Gb0> it = m69269w.m33762c().iterator();
                while (it.hasNext()) {
                    m33757c.m33759a(it.next());
                }
            }
            i++;
        }
        LinkedHashSet<InterfaceC34196Lb0> m33764a = m33757c.m33758b().m33764a(this.f52820f.m3185f().m41120a());
        if (!m33764a.isEmpty()) {
            LifecycleCamera m69028c = this.f52819e.m69028c(lifecycleOwner, CameraUseCaseAdapter.m69230z(m33764a));
            Collection<LifecycleCamera> m69026e = this.f52819e.m69026e();
            for (AbstractC11253p abstractC11253p : abstractC11253pArr) {
                for (LifecycleCamera lifecycleCamera : m69026e) {
                    if (lifecycleCamera.m69034w(abstractC11253p) && lifecycleCamera != m69028c) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", abstractC11253p));
                    }
                }
            }
            if (m69028c == null) {
                m69028c = this.f52819e.m69029b(lifecycleOwner, new CameraUseCaseAdapter(m33764a, this.f52820f.m3186e().mo10788c(), this.f52820f.m3187d(), this.f52820f.m3183h()));
            }
            Iterator<InterfaceC33026Gb0> it2 = c42812ic0.m33762c().iterator();
            while (it2.hasNext()) {
                InterfaceC33026Gb0 next = it2.next();
                if (next.getIdentifier() != InterfaceC33026Gb0.f12123a && (mo71178b = C32622Ei1.m108568a(next.getIdentifier()).mo71178b(m69028c.mo23505b(), this.f52821g)) != null) {
                    if (interfaceC11191c == null) {
                        interfaceC11191c = mo71178b;
                    } else {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                }
            }
            m69028c.m69039f(interfaceC11191c);
            if (abstractC11253pArr.length == 0) {
                return m69028c;
            }
            this.f52819e.m69030a(m69028c, c32717Es6, list, Arrays.asList(abstractC11253pArr), this.f52820f.m3186e().mo10788c());
            return m69028c;
        }
        throw new IllegalArgumentException("Provided camera selector unable to resolve a camera for the given use case");
    }

    /* renamed from: f */
    public InterfaceC45757na0 m69007f(LifecycleOwner lifecycleOwner, C42812ic0 c42812ic0, AbstractC11253p... abstractC11253pArr) {
        if (m69006g() != 2) {
            m68999n(1);
            return m69008e(lifecycleOwner, c42812ic0, null, Collections.emptyList(), abstractC11253pArr);
        }
        throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
    }

    /* renamed from: g */
    public final int m69006g() {
        C52298yc0 c52298yc0 = this.f52820f;
        if (c52298yc0 == null) {
            return 0;
        }
        return c52298yc0.m3186e().mo10788c().mo13004c();
    }

    /* renamed from: i */
    public final ListenableFuture<C52298yc0> m69004i(Context context) {
        synchronized (this.f52815a) {
            ListenableFuture<C52298yc0> listenableFuture = this.f52817c;
            if (listenableFuture != null) {
                return listenableFuture;
            }
            final C52298yc0 c52298yc0 = new C52298yc0(context, this.f52816b);
            ListenableFuture<C52298yc0> m92864a = O80.m92864a(new O80.InterfaceC5834c() { // from class: o64
                @Override // p000.O80.InterfaceC5834c
                /* renamed from: a */
                public final Object mo3207a(O80.C5832a c5832a) {
                    Object m69000m;
                    m69000m = C11260b.this.m69000m(c52298yc0, c5832a);
                    return m69000m;
                }
            });
            this.f52817c = m92864a;
            return m92864a;
        }
    }

    /* renamed from: j */
    public boolean m69003j(C42812ic0 c42812ic0) throws CameraInfoUnavailableException {
        try {
            c42812ic0.m33760e(this.f52820f.m3185f().m41120a());
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* renamed from: n */
    public final void m68999n(int i) {
        C52298yc0 c52298yc0 = this.f52820f;
        if (c52298yc0 == null) {
            return;
        }
        c52298yc0.m3186e().mo10788c().mo13003d(i);
    }

    /* renamed from: o */
    public final void m68998o(C52298yc0 c52298yc0) {
        this.f52820f = c52298yc0;
    }

    /* renamed from: p */
    public final void m68997p(Context context) {
        this.f52821g = context;
    }

    /* renamed from: q */
    public void m68996q(AbstractC11253p... abstractC11253pArr) {
        O36.m92961a();
        if (m69006g() != 2) {
            this.f52819e.m69020k(Arrays.asList(abstractC11253pArr));
            return;
        }
        throw new UnsupportedOperationException("unbind usecase is not supported in concurrent camera mode, call unbindAll() first");
    }

    /* renamed from: r */
    public void m68995r() {
        O36.m92961a();
        m68999n(0);
        this.f52819e.m69019l();
    }
}
