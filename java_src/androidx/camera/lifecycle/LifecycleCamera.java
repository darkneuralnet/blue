package androidx.camera.lifecycle;

import androidx.camera.core.AbstractC11253p;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.InterfaceC11191c;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11733l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
final class LifecycleCamera implements InterfaceC32929Fq2, InterfaceC45757na0 {

    /* renamed from: c */
    public final LifecycleOwner f52800c;

    /* renamed from: d */
    public final CameraUseCaseAdapter f52801d;

    /* renamed from: b */
    public final Object f52799b = new Object();

    /* renamed from: e */
    public volatile boolean f52802e = false;

    /* renamed from: f */
    public boolean f52803f = false;

    /* renamed from: g */
    public boolean f52804g = false;

    public LifecycleCamera(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.f52800c = lifecycleOwner;
        this.f52801d = cameraUseCaseAdapter;
        if (lifecycleOwner.getLifecycle().mo67007b().m67013b(AbstractC11719f.EnumC11724b.STARTED)) {
            cameraUseCaseAdapter.m69241i();
        } else {
            cameraUseCaseAdapter.m69231y();
        }
        lifecycleOwner.getLifecycle().mo67008a(this);
    }

    /* renamed from: A */
    public void m69040A() {
        synchronized (this.f52799b) {
            if (!this.f52803f) {
                return;
            }
            this.f52803f = false;
            if (this.f52800c.getLifecycle().mo67007b().m67013b(AbstractC11719f.EnumC11724b.STARTED)) {
                onStart(this.f52800c);
            }
        }
    }

    @Override // p000.InterfaceC45757na0
    /* renamed from: a */
    public CameraControl mo23506a() {
        return this.f52801d.mo23506a();
    }

    @Override // p000.InterfaceC45757na0
    /* renamed from: b */
    public InterfaceC33728Jb0 mo23505b() {
        return this.f52801d.mo23505b();
    }

    /* renamed from: f */
    public void m69039f(InterfaceC11191c interfaceC11191c) {
        this.f52801d.m69244f(interfaceC11191c);
    }

    @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_DESTROY)
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        synchronized (this.f52799b) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f52801d;
            cameraUseCaseAdapter.m69254O(cameraUseCaseAdapter.m69264E());
        }
    }

    @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_PAUSE)
    public void onPause(LifecycleOwner lifecycleOwner) {
        this.f52801d.m69239n(false);
    }

    @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_RESUME)
    public void onResume(LifecycleOwner lifecycleOwner) {
        this.f52801d.m69239n(true);
    }

    @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_START)
    public void onStart(LifecycleOwner lifecycleOwner) {
        synchronized (this.f52799b) {
            if (!this.f52803f && !this.f52804g) {
                this.f52801d.m69241i();
                this.f52802e = true;
            }
        }
    }

    @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        synchronized (this.f52799b) {
            if (!this.f52803f && !this.f52804g) {
                this.f52801d.m69231y();
                this.f52802e = false;
            }
        }
    }

    /* renamed from: s */
    public void m69038s(Collection<AbstractC11253p> collection) throws CameraUseCaseAdapter.CameraException {
        synchronized (this.f52799b) {
            this.f52801d.m69242h(collection);
        }
    }

    /* renamed from: t */
    public CameraUseCaseAdapter m69037t() {
        return this.f52801d;
    }

    /* renamed from: u */
    public LifecycleOwner m69036u() {
        LifecycleOwner lifecycleOwner;
        synchronized (this.f52799b) {
            lifecycleOwner = this.f52800c;
        }
        return lifecycleOwner;
    }

    /* renamed from: v */
    public List<AbstractC11253p> m69035v() {
        List<AbstractC11253p> unmodifiableList;
        synchronized (this.f52799b) {
            unmodifiableList = Collections.unmodifiableList(this.f52801d.m69264E());
        }
        return unmodifiableList;
    }

    /* renamed from: w */
    public boolean m69034w(AbstractC11253p abstractC11253p) {
        boolean contains;
        synchronized (this.f52799b) {
            contains = this.f52801d.m69264E().contains(abstractC11253p);
        }
        return contains;
    }

    /* renamed from: x */
    public void m69033x() {
        synchronized (this.f52799b) {
            if (this.f52803f) {
                return;
            }
            onStop(this.f52800c);
            this.f52803f = true;
        }
    }

    /* renamed from: y */
    public void m69032y(Collection<AbstractC11253p> collection) {
        synchronized (this.f52799b) {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.retainAll(this.f52801d.m69264E());
            this.f52801d.m69254O(arrayList);
        }
    }

    /* renamed from: z */
    public void m69031z() {
        synchronized (this.f52799b) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f52801d;
            cameraUseCaseAdapter.m69254O(cameraUseCaseAdapter.m69264E());
        }
    }
}
