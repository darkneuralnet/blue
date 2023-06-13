package p000;

import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.Iterator;
import java.util.List;
/* renamed from: i37  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42495i37 {
    /* renamed from: a */
    public static String m34509a(List list) {
        Iterator it = list.iterator();
        float f = 0.0f;
        String str = RequestHeadersFactory.UNDETERMINED_LANGUAGE;
        while (it.hasNext()) {
            C48054rR6 c48054rR6 = (C48054rR6) it.next();
            if (f < c48054rR6.m15945E()) {
                f = c48054rR6.m15945E();
                str = c48054rR6.m15943G();
            }
        }
        return str;
    }
}
