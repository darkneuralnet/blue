package p000;

import co.bird.android.model.wire.WireLocation;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\u0000*\n\u0010\u0005\"\u00020\u00032\u00020\u0003¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireLocation;", "", "b", "", C17296a.f69688o, "PartnerId", "config_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: hl */
/* loaded from: classes2.dex */
public final class C22719hl {
    /* renamed from: a */
    public static final String m35900a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return "one_time_" + str;
    }

    /* renamed from: b */
    public static final boolean m35899b(WireLocation wireLocation) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(wireLocation, "<this>");
        if (wireLocation.getLatitude() == 0.0d) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (wireLocation.getLongitude() == 0.0d) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return true;
            }
        }
        return false;
    }
}
