package p000;

import android.os.Bundle;
import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000¨\u0006\u0004"}, m28432d2 = {"", "", "Landroid/os/Bundle;", C17296a.f69688o, "android-sdk-base_release"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: e70  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40156e70 {
    /* renamed from: a */
    public static final Bundle m43273a(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }
}
