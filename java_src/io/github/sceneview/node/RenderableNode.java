package io.github.sceneview.node;

import com.google.android.filament.MaterialInstance;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B3\b\u0017\u0012\f\b\u0002\u0010\u000f\u001a\u00060\rj\u0002`\u000e\u0012\f\b\u0002\u0010\u0011\u001a\u00060\rj\u0002`\u0010\u0012\f\b\u0002\u0010\u0013\u001a\u00060\rj\u0002`\u0012¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\t\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u0016"}, m28432d2 = {"Lio/github/sceneview/node/RenderableNode;", "Lio/github/sceneview/node/Node;", "", "", "Lio/github/sceneview/renderable/Renderable;", "K", "Ljava/util/List;", "P0", "()Ljava/util/List;", "renderables", "Lcom/google/android/filament/MaterialInstance;", "O0", "materialInstances", "Lhu1;", "Lio/github/sceneview/math/Position;", "position", "Lio/github/sceneview/math/Rotation;", "rotation", "Lio/github/sceneview/math/Scale;", "scale", "<init>", "(Lhu1;Lhu1;Lhu1;)V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes6.dex */
public class RenderableNode extends Node {

    /* renamed from: K */
    public final List<Integer> f88173K;

    @JvmOverloads
    public RenderableNode() {
        this(null, null, null, 7, null);
    }

    /* renamed from: O0 */
    public final List<MaterialInstance> m33182O0() {
        int collectionSizeOrDefault;
        List<Integer> mo33181P0 = mo33181P0();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(mo33181P0, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Number number : mo33181P0) {
            arrayList.add(C47177px4.m18392d(number.intValue(), 0, 1, null));
        }
        return arrayList;
    }

    /* renamed from: P0 */
    public List<Integer> mo33181P0() {
        return this.f88173K;
    }

    public /* synthetic */ RenderableNode(C42400hu1 c42400hu1, C42400hu1 c42400hu12, C42400hu1 c42400hu13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Node.f88136H.m33187a() : c42400hu1, (i & 2) != 0 ? Node.f88136H.m33185c() : c42400hu12, (i & 4) != 0 ? Node.f88136H.m33184d() : c42400hu13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RenderableNode(C42400hu1 position, C42400hu1 rotation, C42400hu1 scale) {
        super(position, rotation, scale);
        List<Integer> emptyList;
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(rotation, "rotation");
        Intrinsics.checkNotNullParameter(scale, "scale");
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f88173K = emptyList;
    }
}
