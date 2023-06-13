package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0014\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0088\u0001\b\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m28432d2 = {"Ln26;", "", "", "g", "(I)Ljava/lang/String;", "", "f", "(I)I", "value", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
/* renamed from: n26  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45449n26 {

    /* renamed from: a */
    public static final C26354a f99264a = new C26354a(null);

    /* renamed from: b */
    public static final int f99265b = m24544d(1);

    /* renamed from: c */
    public static final int f99266c = m24544d(2);

    /* renamed from: d */
    public static final int f99267d = m24544d(3);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\bR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R)\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R)\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, m28432d2 = {"Ln26$a;", "", "Ln26;", "Clip", "I", C17296a.f69688o, "()I", "getClip-gIe3tQ8$annotations", "()V", "Ellipsis", "b", "getEllipsis-gIe3tQ8$annotations", "Visible", "c", "getVisible-gIe3tQ8$annotations", "<init>", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: n26$a */
    /* loaded from: classes.dex */
    public static final class C26354a {
        public /* synthetic */ C26354a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m24540a() {
            return C45449n26.f99265b;
        }

        /* renamed from: b */
        public final int m24539b() {
            return C45449n26.f99266c;
        }

        /* renamed from: c */
        public final int m24538c() {
            return C45449n26.f99267d;
        }

        private C26354a() {
        }
    }

    /* renamed from: d */
    public static int m24544d(int i) {
        return i;
    }

    /* renamed from: e */
    public static final boolean m24543e(int i, int i2) {
        return i == i2;
    }

    /* renamed from: f */
    public static int m24542f(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: g */
    public static String m24541g(int i) {
        if (m24543e(i, f99265b)) {
            return "Clip";
        }
        if (m24543e(i, f99266c)) {
            return "Ellipsis";
        }
        if (m24543e(i, f99267d)) {
            return "Visible";
        }
        return "Invalid";
    }
}
