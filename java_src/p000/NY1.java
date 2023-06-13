package p000;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.common.util.concurrent.ListenableFuture;
/* renamed from: NY1 */
/* loaded from: classes.dex */
public final class NY1 extends DeferrableSurface {

    /* renamed from: m */
    public final Surface f24758m;

    public NY1(Surface surface, Size size, int i) {
        super(size, i);
        this.f24758m = surface;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    /* renamed from: o */
    public ListenableFuture<Surface> mo112o() {
        return IA1.m102836h(this.f24758m);
    }

    public NY1(Surface surface) {
        this.f24758m = surface;
    }
}
