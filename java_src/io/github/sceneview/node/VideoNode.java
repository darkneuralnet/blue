package io.github.sceneview.node;

import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.gltfio.FilamentAsset;
import com.stripe.android.core.networking.RequestHeadersFactory;
import io.github.sceneview.SceneView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR,\u0010\u0017\u001a\u00060\u0010j\u0002`\u00112\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00118\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00188\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m28432d2 = {"Lio/github/sceneview/node/VideoNode;", "Lio/github/sceneview/node/ModelNode;", "LPy1;", "frameTime", "", "g", "LLifecycleOwner;", "owner", "onDestroy", "", "w0", "Z", "isAlwaysLookAtCamera", "()Z", "setAlwaysLookAtCamera", "(Z)V", "Lcom/google/android/filament/gltfio/FilamentAsset;", "Lio/github/sceneview/model/Model;", "<set-?>", "x0", "Lcom/google/android/filament/gltfio/FilamentAsset;", "m1", "()Lcom/google/android/filament/gltfio/FilamentAsset;", RequestHeadersFactory.MODEL, "Lcom/google/android/filament/Material;", "y0", "Lcom/google/android/filament/Material;", "l1", "()Lcom/google/android/filament/Material;", "material", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes6.dex */
public class VideoNode extends ModelNode {

    /* renamed from: w0 */
    public boolean f88174w0;

    /* renamed from: x0 */
    public FilamentAsset f88175x0;

    /* renamed from: y0 */
    public Material f88176y0;

    @Override // io.github.sceneview.node.ModelNode, io.github.sceneview.node.Node, p000.InterfaceC48254rm5
    /* renamed from: g */
    public void mo15404g(C35340Py1 frameTime) {
        Intrinsics.checkNotNullParameter(frameTime, "frameTime");
        super.mo15404g(frameTime);
        if (this.f88174w0 && mo33227b0() != null) {
            SceneView mo33227b0 = mo33227b0();
            Intrinsics.checkNotNull(mo33227b0);
            C36549Vc4 lookRotation = C36549Vc4.m79657d(C35444Qj6.m88120v(C41491gN2.m39548q(mo33227b0.getCameraNode().m33219g0()), C41491gN2.m39548q(m33219g0())), C35444Qj6.m88119w());
            Intrinsics.checkNotNullExpressionValue(lookRotation, "lookRotation");
            m33266A0(C41491gN2.m39550o(lookRotation));
        }
    }

    /* renamed from: l1 */
    public final Material m33180l1() {
        Material material = this.f88176y0;
        if (material != null) {
            return material;
        }
        Intrinsics.throwUninitializedPropertyAccessException("material");
        return null;
    }

    /* renamed from: m1 */
    public final FilamentAsset m33179m1() {
        FilamentAsset filamentAsset = this.f88175x0;
        if (filamentAsset != null) {
            return filamentAsset;
        }
        Intrinsics.throwUninitializedPropertyAccessException(RequestHeadersFactory.MODEL);
        return null;
    }

    @Override // io.github.sceneview.node.Node, p000.VX0
    public void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        VU2.m79846a(m33179m1());
        KM2.m98975b(m33180l1());
        for (MaterialInstance materialInstance : m33182O0()) {
            JM2.m100657a(materialInstance);
        }
    }
}
