package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, m28432d2 = {"", "", "digits", "", C17296a.f69688o, "ui-geometry_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: hC1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41984hC1 {
    /* renamed from: a */
    public static final String m36629a(float f, int i) {
        int max = Math.max(i, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f2 = f * pow;
        int i2 = (int) f2;
        if (f2 - i2 >= 0.5f) {
            i2++;
        }
        float f3 = i2 / pow;
        if (max > 0) {
            return String.valueOf(f3);
        }
        return String.valueOf((int) f3);
    }
}
