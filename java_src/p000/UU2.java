package p000;

import com.facebook.share.internal.C17296a;
import com.google.android.filament.gltfio.FilamentAsset;
import com.google.android.filament.gltfio.FilamentInstance;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\"#\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002*\u00060\u0000j\u0002`\u00018F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0019\u0010\u000b\u001a\u00020\b*\u00060\u0000j\u0002`\u00018F¢\u0006\u0006\u001a\u0004\b\t\u0010\n*\n\u0010\f\"\u00020\u00002\u00020\u0000¨\u0006\r"}, m28432d2 = {"Lcom/google/android/filament/gltfio/FilamentInstance;", "Lio/github/sceneview/model/ModelInstance;", "", "", "Lio/github/sceneview/renderable/Renderable;", "b", "(Lcom/google/android/filament/gltfio/FilamentInstance;)Ljava/util/List;", "renderables", "Lcom/google/android/filament/gltfio/FilamentAsset;", C17296a.f69688o, "(Lcom/google/android/filament/gltfio/FilamentInstance;)Lcom/google/android/filament/gltfio/FilamentAsset;", RequestHeadersFactory.MODEL, "ModelInstance", "sceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: UU2 */
/* loaded from: classes6.dex */
public final class UU2 {
    /* renamed from: a */
    public static final FilamentAsset m81468a(FilamentInstance filamentInstance) {
        Intrinsics.checkNotNullParameter(filamentInstance, "<this>");
        FilamentAsset asset = filamentInstance.getAsset();
        Intrinsics.checkNotNullExpressionValue(asset, "asset");
        return asset;
    }

    /* renamed from: b */
    public static final List<Integer> m81467b(FilamentInstance filamentInstance) {
        Intrinsics.checkNotNullParameter(filamentInstance, "<this>");
        int[] entities = filamentInstance.getEntities();
        Intrinsics.checkNotNullExpressionValue(entities, "entities");
        ArrayList arrayList = new ArrayList();
        for (int i : entities) {
            if (C39939dl1.m43779h().hasComponent(i)) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList;
    }
}
