package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.EnumSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\t\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m28432d2 = {"LDF5;", "", "", "b", "J", "()J", "value", "<init>", "(Ljava/lang/String;IJ)V", "h", C17296a.f69688o, "c", DateTokenConverter.CONVERTER_KEY, "e", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: DF5 */
/* loaded from: classes5.dex */
public enum DF5 {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    

    /* renamed from: g */
    public static final EnumSet<DF5> f5446g;

    /* renamed from: h */
    public static final C1437a f5447h = new C1437a(null);

    /* renamed from: b */
    public final long f5448b;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"LDF5$a;", "", "", "bitmask", "Ljava/util/EnumSet;", "LDF5;", C17296a.f69688o, "ALL", "Ljava/util/EnumSet;", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: DF5$a */
    /* loaded from: classes5.dex */
    public static final class C1437a {
        private C1437a() {
        }

        @JvmStatic
        /* renamed from: a */
        public final EnumSet<DF5> m110640a(long j) {
            EnumSet<DF5> result = EnumSet.noneOf(DF5.class);
            Iterator it = DF5.f5446g.iterator();
            while (it.hasNext()) {
                DF5 df5 = (DF5) it.next();
                if ((df5.m110641b() & j) != 0) {
                    result.add(df5);
                }
            }
            Intrinsics.checkNotNullExpressionValue(result, "result");
            return result;
        }

        public /* synthetic */ C1437a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        EnumSet<DF5> allOf = EnumSet.allOf(DF5.class);
        Intrinsics.checkNotNullExpressionValue(allOf, "EnumSet.allOf(SmartLoginOption::class.java)");
        f5446g = allOf;
    }

    DF5(long j) {
        this.f5448b = j;
    }

    /* renamed from: b */
    public final long m110641b() {
        return this.f5448b;
    }
}
