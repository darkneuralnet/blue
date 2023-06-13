package p000;

import com.facebook.share.internal.C17296a;
import com.google.android.filament.gltfio.AssetLoader;
import com.google.android.filament.gltfio.FilamentAsset;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001*\n\u0010\u0004\"\u00020\u00002\u00020\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/google/android/filament/gltfio/FilamentAsset;", "Lio/github/sceneview/model/Model;", "", C17296a.f69688o, "Model", "sceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: VU2 */
/* loaded from: classes6.dex */
public final class VU2 {
    /* renamed from: a */
    public static final void m79846a(FilamentAsset filamentAsset) {
        Unit unit;
        Intrinsics.checkNotNullParameter(filamentAsset, "<this>");
        try {
            Result.Companion companion = Result.Companion;
            AssetLoader m43785b = C39939dl1.m43785b();
            if (m43785b != null) {
                m43785b.destroyAsset(filamentAsset);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m116783constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
    }
}
