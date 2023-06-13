package kotlin.collections;

import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.sequences.Sequence;
@Metadata(m28433d1 = {"kotlin/collections/MapsKt__MapWithDefaultKt", "kotlin/collections/MapsKt__MapsJVMKt", "kotlin/collections/MapsKt__MapsKt", "kotlin/collections/MapsKt___MapsJvmKt", "kotlin/collections/MapsKt___MapsKt"}, m28431k = 4, m28430mv = {1, 8, 0}, m28428xi = 49)
/* loaded from: classes8.dex */
public final class MapsKt extends MapsKt___MapsKt {
    private MapsKt() {
    }

    public static /* bridge */ /* synthetic */ Sequence asSequence(Map map) {
        return MapsKt___MapsKt.asSequence(map);
    }

    @PublishedApi
    public static /* bridge */ /* synthetic */ int mapCapacity(int i) {
        return MapsKt__MapsJVMKt.mapCapacity(i);
    }

    @SinceKotlin(version = "1.1")
    public static /* bridge */ /* synthetic */ Map toMutableMap(Map map) {
        return MapsKt__MapsKt.toMutableMap(map);
    }

    @SinceKotlin(version = "1.1")
    public static /* bridge */ /* synthetic */ Map toMap(Map map) {
        return MapsKt__MapsKt.toMap(map);
    }
}
