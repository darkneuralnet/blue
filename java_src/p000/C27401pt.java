package p000;

import android.os.Handler;
import java.util.concurrent.Executor;
/* renamed from: pt */
/* loaded from: classes.dex */
public final class C27401pt extends AbstractC46370oc0 {

    /* renamed from: a */
    public final Executor f104214a;

    /* renamed from: b */
    public final Handler f104215b;

    public C27401pt(Executor executor, Handler handler) {
        if (executor != null) {
            this.f104214a = executor;
            if (handler != null) {
                this.f104215b = handler;
                return;
            }
            throw new NullPointerException("Null schedulerHandler");
        }
        throw new NullPointerException("Null cameraExecutor");
    }

    @Override // p000.AbstractC46370oc0
    /* renamed from: b */
    public Executor mo18568b() {
        return this.f104214a;
    }

    @Override // p000.AbstractC46370oc0
    /* renamed from: c */
    public Handler mo18567c() {
        return this.f104215b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC46370oc0)) {
            return false;
        }
        AbstractC46370oc0 abstractC46370oc0 = (AbstractC46370oc0) obj;
        if (this.f104214a.equals(abstractC46370oc0.mo18568b()) && this.f104215b.equals(abstractC46370oc0.mo18567c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f104214a.hashCode() ^ 1000003) * 1000003) ^ this.f104215b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f104214a + ", schedulerHandler=" + this.f104215b + "}";
    }
}
