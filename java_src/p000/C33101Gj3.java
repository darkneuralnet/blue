package p000;

import co.bird.android.model.constant.AreaKind;
import co.bird.android.model.constant.OperatorFilterType;
import co.bird.android.model.persistence.nestedstructures.OperatorFilterOption;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/constant/AreaKind;", "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;", C17296a.f69688o, "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Gj3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33101Gj3 {
    /* renamed from: a */
    public static final OperatorFilterOption m104825a(AreaKind areaKind) {
        Intrinsics.checkNotNullParameter(areaKind, "<this>");
        return new OperatorFilterOption(areaKind.getAreaName(), OperatorFilterType.MULTI_SELECT, areaKind.getAreaValue(), false, null, null, 56, null);
    }
}
