package p000;

import android.location.Address;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¨\u0006\u0005"}, m28432d2 = {"", "Landroid/location/Address;", "addresses", "", C17296a.f69688o, "location_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Dr4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32472Dr4 {
    /* renamed from: a */
    public static final String m109850a(List<? extends Address> list) {
        if (list != null && (!list.isEmpty())) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            Address address = list.get(0);
            int maxAddressLineIndex = address.getMaxAddressLineIndex();
            if (maxAddressLineIndex >= 0) {
                while (true) {
                    sb.append(address.getAddressLine(i));
                    if (i == maxAddressLineIndex) {
                        break;
                    }
                    i++;
                }
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "{\n    val sb = StringBui…  }\n    sb.toString()\n  }");
            return sb2;
        }
        return "";
    }
}
