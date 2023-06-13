package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m28432d2 = {"LHa1;", "", "", "h", "(I)Ljava/lang/String;", "", "g", "(I)I", LegacyRepairType.OTHER_KEY, "", "e", "(ILjava/lang/Object;)Z", C17296a.f69688o, "I", "value", DateTokenConverter.CONVERTER_KEY, "b", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
/* renamed from: Ha1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33252Ha1 {

    /* renamed from: b */
    public static final C3167a f13558b = new C3167a(null);

    /* renamed from: c */
    public static final int f13559c = m103713d(0);

    /* renamed from: d */
    public static final int f13560d = m103713d(1);

    /* renamed from: a */
    public final int f13561a;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, m28432d2 = {"LHa1$a;", "", "LHa1;", "Default", "I", C17296a.f69688o, "()I", "None", "b", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Ha1$a */
    /* loaded from: classes.dex */
    public static final class C3167a {
        public /* synthetic */ C3167a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m103707a() {
            return C33252Ha1.f13559c;
        }

        /* renamed from: b */
        public final int m103706b() {
            return C33252Ha1.f13560d;
        }

        private C3167a() {
        }
    }

    public /* synthetic */ C33252Ha1(int i) {
        this.f13561a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ C33252Ha1 m103714c(int i) {
        return new C33252Ha1(i);
    }

    /* renamed from: d */
    public static int m103713d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m103712e(int i, Object obj) {
        return (obj instanceof C33252Ha1) && i == ((C33252Ha1) obj).m103708i();
    }

    /* renamed from: f */
    public static final boolean m103711f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m103710g(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: h */
    public static String m103709h(int i) {
        if (i == f13559c) {
            return "EmojiSupportMatch.Default";
        }
        if (i == f13560d) {
            return "EmojiSupportMatch.None";
        }
        return "Invalid(value=" + i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m103712e(this.f13561a, obj);
    }

    public int hashCode() {
        return m103710g(this.f13561a);
    }

    /* renamed from: i */
    public final /* synthetic */ int m103708i() {
        return this.f13561a;
    }

    public String toString() {
        return m103709h(this.f13561a);
    }
}
