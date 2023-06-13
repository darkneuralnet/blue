package p000;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
/* renamed from: vf0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C50549vf0 {

    /* renamed from: a */
    public final Executor f114453a;

    /* renamed from: b */
    public final Object f114454b = new Object();

    /* renamed from: c */
    public final Set<DX5> f114455c = new LinkedHashSet();

    /* renamed from: d */
    public final Set<DX5> f114456d = new LinkedHashSet();

    /* renamed from: e */
    public final Set<DX5> f114457e = new LinkedHashSet();

    /* renamed from: f */
    public final CameraDevice.StateCallback f114458f = new C29608a();

    /* renamed from: vf0$a */
    /* loaded from: classes.dex */
    public class C29608a extends CameraDevice.StateCallback {
        public C29608a() {
        }

        /* renamed from: b */
        public final void m8278b() {
            List<DX5> m8285g;
            synchronized (C50549vf0.this.f114454b) {
                m8285g = C50549vf0.this.m8285g();
                C50549vf0.this.f114457e.clear();
                C50549vf0.this.f114455c.clear();
                C50549vf0.this.f114456d.clear();
            }
            for (DX5 dx5 : m8285g) {
                dx5.mo100279i();
            }
        }

        /* renamed from: c */
        public final void m8277c() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C50549vf0.this.f114454b) {
                linkedHashSet.addAll(C50549vf0.this.f114457e);
                linkedHashSet.addAll(C50549vf0.this.f114455c);
            }
            C50549vf0.this.f114453a.execute(new Runnable() { // from class: uf0
                @Override // java.lang.Runnable
                public final void run() {
                    C50549vf0.m8290b(linkedHashSet);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            m8278b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            m8277c();
            m8278b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            m8277c();
            m8278b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    public C50549vf0(Executor executor) {
        this.f114453a = executor;
    }

    /* renamed from: b */
    public static void m8290b(Set<DX5> set) {
        for (DX5 dx5 : set) {
            dx5.mo100284c().mo88420o(dx5);
        }
    }

    /* renamed from: a */
    public final void m8291a(DX5 dx5) {
        DX5 next;
        Iterator<DX5> it = m8285g().iterator();
        while (it.hasNext() && (next = it.next()) != dx5) {
            next.mo100279i();
        }
    }

    /* renamed from: c */
    public CameraDevice.StateCallback m8289c() {
        return this.f114458f;
    }

    /* renamed from: d */
    public List<DX5> m8288d() {
        ArrayList arrayList;
        synchronized (this.f114454b) {
            arrayList = new ArrayList(this.f114455c);
        }
        return arrayList;
    }

    /* renamed from: e */
    public List<DX5> m8287e() {
        ArrayList arrayList;
        synchronized (this.f114454b) {
            arrayList = new ArrayList(this.f114456d);
        }
        return arrayList;
    }

    /* renamed from: f */
    public List<DX5> m8286f() {
        ArrayList arrayList;
        synchronized (this.f114454b) {
            arrayList = new ArrayList(this.f114457e);
        }
        return arrayList;
    }

    /* renamed from: g */
    public List<DX5> m8285g() {
        ArrayList arrayList;
        synchronized (this.f114454b) {
            arrayList = new ArrayList();
            arrayList.addAll(m8288d());
            arrayList.addAll(m8286f());
        }
        return arrayList;
    }

    /* renamed from: h */
    public void m8284h(DX5 dx5) {
        synchronized (this.f114454b) {
            this.f114455c.remove(dx5);
            this.f114456d.remove(dx5);
        }
    }

    /* renamed from: i */
    public void m8283i(DX5 dx5) {
        synchronized (this.f114454b) {
            this.f114456d.add(dx5);
        }
    }

    /* renamed from: j */
    public void m8282j(DX5 dx5) {
        m8291a(dx5);
        synchronized (this.f114454b) {
            this.f114457e.remove(dx5);
        }
    }

    /* renamed from: k */
    public void m8281k(DX5 dx5) {
        synchronized (this.f114454b) {
            this.f114455c.add(dx5);
            this.f114457e.remove(dx5);
        }
        m8291a(dx5);
    }

    /* renamed from: l */
    public void m8280l(DX5 dx5) {
        synchronized (this.f114454b) {
            this.f114457e.add(dx5);
        }
    }
}
