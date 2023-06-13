package p000;

import android.content.res.Resources;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u001a\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¨\u0006\u000e"}, m28432d2 = {"LBM4;", "", "Landroid/content/res/Resources;", "r", "", "resourceId", "", "c", "b", C17296a.f69688o, "id", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: BM4 */
/* loaded from: classes5.dex */
public final class BM4 {

    /* renamed from: a */
    public static final BM4 f2229a = new BM4();

    private BM4() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m114078b(Resources resources, int i) throws Resources.NotFoundException {
        String str;
        String str2;
        if (resources == null) {
            return f2229a.m114079a(i);
        }
        if (f2229a.m114076d(i) != 127) {
            str = resources.getResourcePackageName(i);
            Intrinsics.checkNotNullExpressionValue(str, "r.getResourcePackageName(resourceId)");
            str2 = ":";
        } else {
            str = "";
            str2 = "";
        }
        String resourceTypeName = resources.getResourceTypeName(i);
        String resourceEntryName = resources.getResourceEntryName(i);
        StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length() + resourceTypeName.length() + 1 + resourceEntryName.length());
        sb.append("@");
        sb.append(str);
        sb.append(str2);
        sb.append(resourceTypeName);
        sb.append("/");
        sb.append(resourceEntryName);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    @JvmStatic
    /* renamed from: c */
    public static final String m114077c(Resources resources, int i) {
        try {
            return m114078b(resources, i);
        } catch (Resources.NotFoundException unused) {
            return f2229a.m114079a(i);
        }
    }

    /* renamed from: a */
    public final String m114079a(int i) {
        return "#" + Integer.toHexString(i);
    }

    /* renamed from: d */
    public final int m114076d(int i) {
        return (i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
    }
}
