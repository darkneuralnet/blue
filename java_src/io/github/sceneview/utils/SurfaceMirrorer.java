package io.github.sceneview.utils;

import android.view.Surface;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.google.android.filament.Renderer;
import com.google.android.filament.SwapChain;
import com.google.android.filament.Viewport;
import io.github.sceneview.SceneView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC48254rm5;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"Lio/github/sceneview/utils/SurfaceMirrorer;", "Lrm5;", "LPy1;", "frameTime", "", "g", "Lcom/google/android/filament/Viewport;", "srcViewport", "destViewport", C17296a.f69688o, "Lqm5;", "b", "Lqm5;", "lifecycle", "", "Lio/github/sceneview/utils/SurfaceMirrorer$a;", "c", "Ljava/util/List;", "surfaceMirrors", "Lio/github/sceneview/SceneView;", "()Lio/github/sceneview/SceneView;", "sceneView", "<init>", "(Lqm5;)V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes6.dex */
public final class SurfaceMirrorer implements InterfaceC48254rm5 {

    /* renamed from: b */
    public final C47661qm5 f88185b;

    /* renamed from: c */
    public final List<C23432a> f88186c;

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019¨\u0006\u001b"}, m28432d2 = {"Lio/github/sceneview/utils/SurfaceMirrorer$a;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Landroid/view/Surface;", C17296a.f69688o, "Landroid/view/Surface;", "getSurface", "()Landroid/view/Surface;", "surface", "Lcom/google/android/filament/SwapChain;", "b", "Lcom/google/android/filament/SwapChain;", "()Lcom/google/android/filament/SwapChain;", "setSwapChain", "(Lcom/google/android/filament/SwapChain;)V", "swapChain", "Lcom/google/android/filament/Viewport;", "c", "Lcom/google/android/filament/Viewport;", "()Lcom/google/android/filament/Viewport;", "viewport", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.utils.SurfaceMirrorer$a */
    /* loaded from: classes6.dex */
    public static final class C23432a {

        /* renamed from: a */
        public final Surface f88187a;

        /* renamed from: b */
        public SwapChain f88188b;

        /* renamed from: c */
        public final Viewport f88189c;

        /* renamed from: a */
        public final SwapChain m33171a() {
            return this.f88188b;
        }

        /* renamed from: b */
        public final Viewport m33170b() {
            return this.f88189c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C23432a) {
                C23432a c23432a = (C23432a) obj;
                return Intrinsics.areEqual(this.f88187a, c23432a.f88187a) && Intrinsics.areEqual(this.f88188b, c23432a.f88188b) && Intrinsics.areEqual(this.f88189c, c23432a.f88189c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f88187a.hashCode() * 31;
            SwapChain swapChain = this.f88188b;
            return ((hashCode + (swapChain == null ? 0 : swapChain.hashCode())) * 31) + this.f88189c.hashCode();
        }

        public String toString() {
            return "SurfaceMirror(surface=" + this.f88187a + ", swapChain=" + this.f88188b + ", viewport=" + this.f88189c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public SurfaceMirrorer(C47661qm5 lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.f88185b = lifecycle;
        this.f88186c = new ArrayList();
        lifecycle.mo67008a(this);
    }

    @Override // p000.InterfaceC48254rm5
    /* renamed from: I */
    public void mo15405I(int i, int i2) {
        InterfaceC48254rm5.C27996a.m15402b(this, i, i2);
    }

    /* renamed from: a */
    public final Viewport m33173a(Viewport viewport, Viewport viewport2) {
        float f;
        float f2;
        int i = viewport2.width;
        int i2 = viewport2.height;
        float f3 = i / i2;
        int i3 = viewport.width;
        int i4 = viewport.height;
        if (f3 > i3 / i4) {
            f = i2;
            f2 = i4;
        } else {
            f = i;
            f2 = i3;
        }
        float f4 = f / f2;
        int i5 = (int) (i3 * f4);
        int i6 = (int) (i4 * f4);
        return new Viewport((i - i5) / 2, (i2 - i6) / 2, i5, i6);
    }

    /* renamed from: b */
    public final SceneView m33172b() {
        return this.f88185b.mo17097r();
    }

    @Override // p000.InterfaceC48254rm5
    /* renamed from: g */
    public void mo15404g(C35340Py1 frameTime) {
        Intrinsics.checkNotNullParameter(frameTime, "frameTime");
        InterfaceC48254rm5.C27996a.m15403a(this, frameTime);
        for (C23432a c23432a : this.f88186c) {
            if (c23432a.m33171a() != null) {
                Renderer m33463X = m33172b().m33463X();
                SwapChain m33171a = c23432a.m33171a();
                Intrinsics.checkNotNull(m33171a);
                Viewport viewport = m33172b().m33457d0().getViewport();
                Intrinsics.checkNotNullExpressionValue(viewport, "sceneView.view.viewport");
                m33463X.copyFrame(m33171a, m33173a(viewport, c23432a.m33170b()), m33172b().m33457d0().getViewport(), 7);
            }
        }
    }
}
