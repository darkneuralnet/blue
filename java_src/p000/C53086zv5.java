package p000;

import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.common.util.concurrent.ListenableFuture;
/* renamed from: zv5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C53086zv5 extends DeferrableSurface {

    /* renamed from: m */
    public final Surface f122487m;

    @Override // androidx.camera.core.impl.DeferrableSurface
    /* renamed from: o */
    public ListenableFuture<Surface> mo112o() {
        return IA1.m102836h(this.f122487m);
    }
}
