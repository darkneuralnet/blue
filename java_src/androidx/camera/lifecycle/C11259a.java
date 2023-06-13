package androidx.camera.lifecycle;

import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.lifecycle.LifecycleCameraRepository;
/* renamed from: androidx.camera.lifecycle.a */
/* loaded from: classes.dex */
public final class C11259a extends LifecycleCameraRepository.AbstractC11258a {

    /* renamed from: a */
    public final LifecycleOwner f52812a;

    /* renamed from: b */
    public final CameraUseCaseAdapter.C11227a f52813b;

    public C11259a(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter.C11227a c11227a) {
        if (lifecycleOwner != null) {
            this.f52812a = lifecycleOwner;
            if (c11227a != null) {
                this.f52813b = c11227a;
                return;
            }
            throw new NullPointerException("Null cameraId");
        }
        throw new NullPointerException("Null lifecycleOwner");
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.AbstractC11258a
    /* renamed from: b */
    public CameraUseCaseAdapter.C11227a mo69014b() {
        return this.f52813b;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.AbstractC11258a
    /* renamed from: c */
    public LifecycleOwner mo69013c() {
        return this.f52812a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LifecycleCameraRepository.AbstractC11258a)) {
            return false;
        }
        LifecycleCameraRepository.AbstractC11258a abstractC11258a = (LifecycleCameraRepository.AbstractC11258a) obj;
        if (this.f52812a.equals(abstractC11258a.mo69013c()) && this.f52813b.equals(abstractC11258a.mo69014b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f52812a.hashCode() ^ 1000003) * 1000003) ^ this.f52813b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.f52812a + ", cameraId=" + this.f52813b + "}";
    }
}
