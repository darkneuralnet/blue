package bo.app;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007¨\u0006\n"}, m28432d2 = {"Lbo/app/g3;", "", "", "lat1", "lon1", "lat2", "lon2", C17296a.f69688o, "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.g3 */
/* loaded from: classes.dex */
public final class C12659g3 {

    /* renamed from: a */
    public static final C12659g3 f58489a = new C12659g3();

    private C12659g3() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final double m63712a(double d, double d2, double d3, double d4) {
        double radians = Math.toRadians(d3 - d);
        double radians2 = Math.toRadians(d4 - d2);
        double d5 = 2;
        return 6371000.0d * d5 * Math.asin(Math.sqrt(Math.pow(Math.sin(radians / d5), 2.0d) + (Math.pow(Math.sin(radians2 / d5), 2.0d) * Math.cos(Math.toRadians(d)) * Math.cos(Math.toRadians(d3)))));
    }
}
