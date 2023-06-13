package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¨\u0006\u000e"}, m28432d2 = {"LMC6;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", DateTokenConverter.CONVERTER_KEY, "", "Ljava/io/File;", "e", "b", C17296a.f69688o, "c", "<init>", "()V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: MC6 */
/* loaded from: classes.dex */
public final class MC6 {

    /* renamed from: a */
    public static final MC6 f22808a = new MC6();

    private MC6() {
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m95577d(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(context, "context");
        MC6 mc6 = f22808a;
        if (mc6.m95579b(context).exists()) {
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            str = NC6.f24277a;
            m113272e.mo113269a(str, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry<File, File> entry : mc6.m95576e(context).entrySet()) {
                File key = entry.getKey();
                File value = entry.getValue();
                if (key.exists()) {
                    if (value.exists()) {
                        AbstractC32056Bx2 m113272e2 = AbstractC32056Bx2.m113272e();
                        str4 = NC6.f24277a;
                        m113272e2.mo113262k(str4, "Over-writing contents of " + value);
                    }
                    if (key.renameTo(value)) {
                        str2 = "Migrated " + key + "to " + value;
                    } else {
                        str2 = "Renaming " + key + " to " + value + " failed";
                    }
                    AbstractC32056Bx2 m113272e3 = AbstractC32056Bx2.m113272e();
                    str3 = NC6.f24277a;
                    m113272e3.mo113269a(str3, str2);
                }
            }
        }
    }

    /* renamed from: a */
    public final File m95580a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return m95578c(context);
    }

    /* renamed from: b */
    public final File m95579b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        Intrinsics.checkNotNullExpressionValue(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    /* renamed from: c */
    public final File m95578c(Context context) {
        return new File(C0677Bg.f2641a.m113724a(context), "androidx.work.workdb");
    }

    /* renamed from: e */
    public final Map<File, File> m95576e(Context context) {
        String[] strArr;
        int mapCapacity;
        int coerceAtLeast;
        Map<File, File> plus;
        Intrinsics.checkNotNullParameter(context, "context");
        File m95579b = m95579b(context);
        File m95580a = m95580a(context);
        strArr = NC6.f24278b;
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(strArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (String str : strArr) {
            Pair m28425to = TuplesKt.m28425to(new File(m95579b.getPath() + str), new File(m95580a.getPath() + str));
            linkedHashMap.put(m28425to.getFirst(), m28425to.getSecond());
        }
        plus = MapsKt__MapsKt.plus(linkedHashMap, TuplesKt.m28425to(m95579b, m95580a));
        return plus;
    }
}
