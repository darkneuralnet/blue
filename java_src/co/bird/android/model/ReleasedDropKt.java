package co.bird.android.model;

import co.bird.android.model.wire.WireDrop;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, m28432d2 = {"toReleasedDrop", "Lco/bird/android/model/ReleasedDrop;", "Lco/bird/android/model/wire/WireDrop;", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ReleasedDropKt {
    public static final ReleasedDrop toReleasedDrop(WireDrop wireDrop) {
        Intrinsics.checkNotNullParameter(wireDrop, "<this>");
        DateTime releasedAt = wireDrop.getReleasedAt();
        if (releasedAt != null) {
            return new ReleasedDrop(wireDrop.getId(), wireDrop.getQuantity(), wireDrop.getPhotoUrl(), releasedAt, wireDrop.getAddress());
        }
        return null;
    }
}
