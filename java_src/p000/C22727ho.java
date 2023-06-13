package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.Area;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\f\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0000¨\u0006\t"}, m28432d2 = {"Lco/bird/android/model/persistence/Area;", "", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "", "b", "c", "Lye0;", "e", "co.bird.android.feature.operator.bottomsheets"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: ho */
/* loaded from: classes3.dex */
public final class C22727ho {
    /* renamed from: a */
    public static final int m35860a(Area area) {
        Intrinsics.checkNotNullParameter(area, "<this>");
        if (area.isReleaseConstrained()) {
            return area.getBorderColor();
        }
        return -1;
    }

    /* renamed from: b */
    public static final String m35859b(Area area) {
        Intrinsics.checkNotNullParameter(area, "<this>");
        if (area.isReleaseConstrained() && area.getReleaseCapacity() != null) {
            return area.getLabel();
        }
        return area.getNotes();
    }

    /* renamed from: c */
    public static final int m35858c(Area area) {
        Intrinsics.checkNotNullParameter(area, "<this>");
        if (area.isReleaseConstrained() && area.getReleaseCapacity() != null) {
            return C32184Cl4.TextAppearance_Headline2;
        }
        return C32184Cl4.TextAppearance_Body;
    }

    /* renamed from: d */
    public static final int m35857d(Area area) {
        Intrinsics.checkNotNullParameter(area, "<this>");
        if (area.isReleaseConstrained()) {
            Integer releaseCapacity = area.getReleaseCapacity();
            if (releaseCapacity != null) {
                releaseCapacity.intValue();
                return C45871nl4.restricted_cap_zone_sheet_title;
            } else if (area.title() != null) {
                return C46464ol4.empty;
            } else {
                return C45871nl4.restricted_cap_zone_sheet_no_drop_zone_title;
            }
        }
        return C46464ol4.empty;
    }

    /* renamed from: e */
    public static final EnumC52318ye0 m35856e(Area area) {
        EnumC52318ye0 enumC52318ye0;
        Intrinsics.checkNotNullParameter(area, "<this>");
        if (area.isReleaseConstrained()) {
            Integer releaseCapacity = area.getReleaseCapacity();
            if (releaseCapacity != null) {
                if (releaseCapacity.intValue() > 0) {
                    enumC52318ye0 = EnumC52318ye0.LIMITED;
                } else {
                    enumC52318ye0 = EnumC52318ye0.LOCKED;
                }
                if (enumC52318ye0 != null) {
                    return enumC52318ye0;
                }
            }
            return EnumC52318ye0.NO_DROPS;
        }
        return EnumC52318ye0.UNKNOWN;
    }
}
