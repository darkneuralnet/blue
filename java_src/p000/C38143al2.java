package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0014\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0088\u0001\b\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m28432d2 = {"Lal2;", "", "", "h", "(I)Ljava/lang/String;", "", "g", "(I)I", "value", "e", C17296a.f69688o, "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
/* renamed from: al2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38143al2 {

    /* renamed from: a */
    public static final C10851a f51187a = new C10851a(null);

    /* renamed from: b */
    public static final int f51188b = m70788e(0);

    /* renamed from: c */
    public static final int f51189c = m70788e(1);

    /* renamed from: d */
    public static final int f51190d = m70788e(2);

    /* renamed from: e */
    public static final int f51191e = m70788e(3);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\bR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R)\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R)\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R)\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u0012\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, m28432d2 = {"Lal2$a;", "", "Lal2;", "None", "I", "b", "()I", "getNone-IUNYP9k$annotations", "()V", "Characters", C17296a.f69688o, "getCharacters-IUNYP9k$annotations", "Words", DateTokenConverter.CONVERTER_KEY, "getWords-IUNYP9k$annotations", "Sentences", "c", "getSentences-IUNYP9k$annotations", "<init>", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: al2$a */
    /* loaded from: classes.dex */
    public static final class C10851a {
        public /* synthetic */ C10851a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m70784a() {
            return C38143al2.f51189c;
        }

        /* renamed from: b */
        public final int m70783b() {
            return C38143al2.f51188b;
        }

        /* renamed from: c */
        public final int m70782c() {
            return C38143al2.f51191e;
        }

        /* renamed from: d */
        public final int m70781d() {
            return C38143al2.f51190d;
        }

        private C10851a() {
        }
    }

    /* renamed from: e */
    public static int m70788e(int i) {
        return i;
    }

    /* renamed from: f */
    public static final boolean m70787f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m70786g(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: h */
    public static String m70785h(int i) {
        if (m70787f(i, f51188b)) {
            return "None";
        }
        if (m70787f(i, f51189c)) {
            return "Characters";
        }
        if (m70787f(i, f51190d)) {
            return "Words";
        }
        if (m70787f(i, f51191e)) {
            return "Sentences";
        }
        return "Invalid";
    }
}
