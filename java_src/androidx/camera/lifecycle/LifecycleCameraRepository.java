package androidx.camera.lifecycle;

import androidx.camera.core.AbstractC11253p;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11733l;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class LifecycleCameraRepository {

    /* renamed from: a */
    public final Object f52805a = new Object();

    /* renamed from: b */
    public final Map<AbstractC11258a, LifecycleCamera> f52806b = new HashMap();

    /* renamed from: c */
    public final Map<LifecycleCameraRepositoryObserver, Set<AbstractC11258a>> f52807c = new HashMap();

    /* renamed from: d */
    public final ArrayDeque<LifecycleOwner> f52808d = new ArrayDeque<>();

    /* renamed from: e */
    public InterfaceC43988kb0 f52809e;

    /* loaded from: classes.dex */
    public static class LifecycleCameraRepositoryObserver implements InterfaceC32929Fq2 {

        /* renamed from: b */
        public final LifecycleCameraRepository f52810b;

        /* renamed from: c */
        public final LifecycleOwner f52811c;

        public LifecycleCameraRepositoryObserver(LifecycleOwner lifecycleOwner, LifecycleCameraRepository lifecycleCameraRepository) {
            this.f52811c = lifecycleOwner;
            this.f52810b = lifecycleCameraRepository;
        }

        /* renamed from: a */
        public LifecycleOwner m69016a() {
            return this.f52811c;
        }

        @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_DESTROY)
        public void onDestroy(LifecycleOwner lifecycleOwner) {
            this.f52810b.m69018m(lifecycleOwner);
        }

        @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_START)
        public void onStart(LifecycleOwner lifecycleOwner) {
            this.f52810b.m69023h(lifecycleOwner);
        }

        @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_STOP)
        public void onStop(LifecycleOwner lifecycleOwner) {
            this.f52810b.m69022i(lifecycleOwner);
        }
    }

    /* renamed from: androidx.camera.lifecycle.LifecycleCameraRepository$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11258a {
        /* renamed from: a */
        public static AbstractC11258a m69015a(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter.C11227a c11227a) {
            return new C11259a(lifecycleOwner, c11227a);
        }

        /* renamed from: b */
        public abstract CameraUseCaseAdapter.C11227a mo69014b();

        /* renamed from: c */
        public abstract LifecycleOwner mo69013c();
    }

    /* renamed from: a */
    public void m69030a(LifecycleCamera lifecycleCamera, C32717Es6 c32717Es6, List<AbstractC52288yb0> list, Collection<AbstractC11253p> collection, InterfaceC43988kb0 interfaceC43988kb0) {
        boolean z;
        synchronized (this.f52805a) {
            if (!collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            HZ3.m103737a(z);
            this.f52809e = interfaceC43988kb0;
            LifecycleOwner m69036u = lifecycleCamera.m69036u();
            Set<AbstractC11258a> set = this.f52807c.get(m69027d(m69036u));
            InterfaceC43988kb0 interfaceC43988kb02 = this.f52809e;
            if (interfaceC43988kb02 == null || interfaceC43988kb02.mo13004c() != 2) {
                for (AbstractC11258a abstractC11258a : set) {
                    LifecycleCamera lifecycleCamera2 = (LifecycleCamera) HZ3.m103731g(this.f52806b.get(abstractC11258a));
                    if (!lifecycleCamera2.equals(lifecycleCamera) && !lifecycleCamera2.m69035v().isEmpty()) {
                        throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                    }
                }
            }
            try {
                lifecycleCamera.m69037t().m69250S(c32717Es6);
                lifecycleCamera.m69037t().m69252Q(list);
                lifecycleCamera.m69038s(collection);
                if (m69036u.getLifecycle().mo67007b().m67013b(AbstractC11719f.EnumC11724b.STARTED)) {
                    m69023h(m69036u);
                }
            } catch (CameraUseCaseAdapter.CameraException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public LifecycleCamera m69029b(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter cameraUseCaseAdapter) {
        boolean z;
        LifecycleCamera lifecycleCamera;
        synchronized (this.f52805a) {
            if (this.f52806b.get(AbstractC11258a.m69015a(lifecycleOwner, cameraUseCaseAdapter.m69268A())) == null) {
                z = true;
            } else {
                z = false;
            }
            HZ3.m103736b(z, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
            if (lifecycleOwner.getLifecycle().mo67007b() != AbstractC11719f.EnumC11724b.DESTROYED) {
                lifecycleCamera = new LifecycleCamera(lifecycleOwner, cameraUseCaseAdapter);
                if (cameraUseCaseAdapter.m69264E().isEmpty()) {
                    lifecycleCamera.m69033x();
                }
                m69024g(lifecycleCamera);
            } else {
                throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
            }
        }
        return lifecycleCamera;
    }

    /* renamed from: c */
    public LifecycleCamera m69028c(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter.C11227a c11227a) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.f52805a) {
            lifecycleCamera = this.f52806b.get(AbstractC11258a.m69015a(lifecycleOwner, c11227a));
        }
        return lifecycleCamera;
    }

    /* renamed from: d */
    public final LifecycleCameraRepositoryObserver m69027d(LifecycleOwner lifecycleOwner) {
        synchronized (this.f52805a) {
            for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.f52807c.keySet()) {
                if (lifecycleOwner.equals(lifecycleCameraRepositoryObserver.m69016a())) {
                    return lifecycleCameraRepositoryObserver;
                }
            }
            return null;
        }
    }

    /* renamed from: e */
    public Collection<LifecycleCamera> m69026e() {
        Collection<LifecycleCamera> unmodifiableCollection;
        synchronized (this.f52805a) {
            unmodifiableCollection = Collections.unmodifiableCollection(this.f52806b.values());
        }
        return unmodifiableCollection;
    }

    /* renamed from: f */
    public final boolean m69025f(LifecycleOwner lifecycleOwner) {
        synchronized (this.f52805a) {
            LifecycleCameraRepositoryObserver m69027d = m69027d(lifecycleOwner);
            if (m69027d == null) {
                return false;
            }
            for (AbstractC11258a abstractC11258a : this.f52807c.get(m69027d)) {
                if (!((LifecycleCamera) HZ3.m103731g(this.f52806b.get(abstractC11258a))).m69035v().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: g */
    public final void m69024g(LifecycleCamera lifecycleCamera) {
        Set<AbstractC11258a> hashSet;
        synchronized (this.f52805a) {
            LifecycleOwner m69036u = lifecycleCamera.m69036u();
            AbstractC11258a m69015a = AbstractC11258a.m69015a(m69036u, lifecycleCamera.m69037t().m69268A());
            LifecycleCameraRepositoryObserver m69027d = m69027d(m69036u);
            if (m69027d != null) {
                hashSet = this.f52807c.get(m69027d);
            } else {
                hashSet = new HashSet<>();
            }
            hashSet.add(m69015a);
            this.f52806b.put(m69015a, lifecycleCamera);
            if (m69027d == null) {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = new LifecycleCameraRepositoryObserver(m69036u, this);
                this.f52807c.put(lifecycleCameraRepositoryObserver, hashSet);
                m69036u.getLifecycle().mo67008a(lifecycleCameraRepositoryObserver);
            }
        }
    }

    /* renamed from: h */
    public void m69023h(LifecycleOwner lifecycleOwner) {
        synchronized (this.f52805a) {
            if (!m69025f(lifecycleOwner)) {
                return;
            }
            if (this.f52808d.isEmpty()) {
                this.f52808d.push(lifecycleOwner);
            } else {
                InterfaceC43988kb0 interfaceC43988kb0 = this.f52809e;
                if (interfaceC43988kb0 == null || interfaceC43988kb0.mo13004c() != 2) {
                    LifecycleOwner peek = this.f52808d.peek();
                    if (!lifecycleOwner.equals(peek)) {
                        m69021j(peek);
                        this.f52808d.remove(lifecycleOwner);
                        this.f52808d.push(lifecycleOwner);
                    }
                }
            }
            m69017n(lifecycleOwner);
        }
    }

    /* renamed from: i */
    public void m69022i(LifecycleOwner lifecycleOwner) {
        synchronized (this.f52805a) {
            this.f52808d.remove(lifecycleOwner);
            m69021j(lifecycleOwner);
            if (!this.f52808d.isEmpty()) {
                m69017n(this.f52808d.peek());
            }
        }
    }

    /* renamed from: j */
    public final void m69021j(LifecycleOwner lifecycleOwner) {
        synchronized (this.f52805a) {
            LifecycleCameraRepositoryObserver m69027d = m69027d(lifecycleOwner);
            if (m69027d == null) {
                return;
            }
            for (AbstractC11258a abstractC11258a : this.f52807c.get(m69027d)) {
                ((LifecycleCamera) HZ3.m103731g(this.f52806b.get(abstractC11258a))).m69033x();
            }
        }
    }

    /* renamed from: k */
    public void m69020k(Collection<AbstractC11253p> collection) {
        boolean z;
        synchronized (this.f52805a) {
            for (AbstractC11258a abstractC11258a : this.f52806b.keySet()) {
                LifecycleCamera lifecycleCamera = this.f52806b.get(abstractC11258a);
                if (!lifecycleCamera.m69035v().isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                lifecycleCamera.m69032y(collection);
                if (z && lifecycleCamera.m69035v().isEmpty()) {
                    m69022i(lifecycleCamera.m69036u());
                }
            }
        }
    }

    /* renamed from: l */
    public void m69019l() {
        synchronized (this.f52805a) {
            for (AbstractC11258a abstractC11258a : this.f52806b.keySet()) {
                LifecycleCamera lifecycleCamera = this.f52806b.get(abstractC11258a);
                lifecycleCamera.m69031z();
                m69022i(lifecycleCamera.m69036u());
            }
        }
    }

    /* renamed from: m */
    public void m69018m(LifecycleOwner lifecycleOwner) {
        synchronized (this.f52805a) {
            LifecycleCameraRepositoryObserver m69027d = m69027d(lifecycleOwner);
            if (m69027d == null) {
                return;
            }
            m69022i(lifecycleOwner);
            for (AbstractC11258a abstractC11258a : this.f52807c.get(m69027d)) {
                this.f52806b.remove(abstractC11258a);
            }
            this.f52807c.remove(m69027d);
            m69027d.m69016a().getLifecycle().mo67006d(m69027d);
        }
    }

    /* renamed from: n */
    public final void m69017n(LifecycleOwner lifecycleOwner) {
        synchronized (this.f52805a) {
            for (AbstractC11258a abstractC11258a : this.f52807c.get(m69027d(lifecycleOwner))) {
                LifecycleCamera lifecycleCamera = this.f52806b.get(abstractC11258a);
                if (!((LifecycleCamera) HZ3.m103731g(lifecycleCamera)).m69035v().isEmpty()) {
                    lifecycleCamera.m69040A();
                }
            }
        }
    }
}
