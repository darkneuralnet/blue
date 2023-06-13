package co.bird.android.app.feature.map.cluster.bird;

import co.bird.android.model.wire.WireBird;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "clusterBird", "Lco/bird/android/model/wire/WireBird;", "invoke", "(Lco/bird/android/model/wire/WireBird;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class BirdClusterManager$reset$1 extends Lambda implements Function1<WireBird, Boolean> {
    final /* synthetic */ WireBird $marker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirdClusterManager$reset$1(WireBird wireBird) {
        super(1);
        this.$marker = wireBird;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(WireBird clusterBird) {
        Intrinsics.checkNotNullParameter(clusterBird, "clusterBird");
        return Boolean.valueOf(clusterBird.isSame(this.$marker));
    }
}
