package p000;

import co.bird.android.model.constant.OwnershipKind;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.nestedstructures.PrivateBird;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePrivateBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u001e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\b¨\u0006\n"}, m28432d2 = {"Ldg6;", "action", "Leg6;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lco/bird/android/model/wire/WireBird;", "bird", "Lcg6;", "b", "Lco/bird/android/model/persistence/Bird;", C17296a.f69688o, "model-analytics_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: fg6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41079fg6 {
    /* renamed from: a */
    public static final C39283cg6 m41039a(EnumC39894dg6 action, EnumC40486eg6 source, Bird bird) {
        boolean z;
        OwnershipKind ownershipKind;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(bird, "bird");
        String enumC39894dg6 = action.toString();
        String enumC40486eg6 = source.toString();
        String id = bird.getId();
        if (bird.getPrivateBird() != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        PrivateBird privateBird = bird.getPrivateBird();
        return new C39283cg6(null, null, null, id, z2, (privateBird == null || (ownershipKind = privateBird.getOwnershipKind()) == null || (r12 = ownershipKind.toString()) == null) ? "" : "", enumC39894dg6, enumC40486eg6, 7, null);
    }

    /* renamed from: b */
    public static final C39283cg6 m41038b(EnumC39894dg6 action, EnumC40486eg6 source, WireBird bird) {
        boolean z;
        OwnershipKind ownershipKind;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(bird, "bird");
        String enumC39894dg6 = action.toString();
        String enumC40486eg6 = source.toString();
        String id = bird.getId();
        if (bird.getPrivateBird() != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        WirePrivateBird privateBird = bird.getPrivateBird();
        return new C39283cg6(null, null, null, id, z2, (privateBird == null || (ownershipKind = privateBird.getOwnershipKind()) == null || (r12 = ownershipKind.toString()) == null) ? "" : "", enumC39894dg6, enumC40486eg6, 7, null);
    }
}
