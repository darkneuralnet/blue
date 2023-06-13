package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0088\u0001\u0010\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m28432d2 = {"Luc2;", "", "", "f", "(I)Ljava/lang/String;", "", "e", "(I)I", LegacyRepairType.OTHER_KEY, "", "c", "(ILjava/lang/Object;)Z", C17296a.f69688o, "I", "getValue", "()I", "value", "b", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
/* renamed from: uc2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49929uc2 {

    /* renamed from: a */
    public final int f112665a;

    public /* synthetic */ C49929uc2(int i) {
        this.f112665a = i;
    }

    /* renamed from: a */
    public static final /* synthetic */ C49929uc2 m9975a(int i) {
        return new C49929uc2(i);
    }

    /* renamed from: b */
    public static int m9974b(int i) {
        return i;
    }

    /* renamed from: c */
    public static boolean m9973c(int i, Object obj) {
        return (obj instanceof C49929uc2) && i == ((C49929uc2) obj).m9969g();
    }

    /* renamed from: d */
    public static final boolean m9972d(int i, int i2) {
        return i == i2;
    }

    /* renamed from: e */
    public static int m9971e(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: f */
    public static String m9970f(int i) {
        return "ItemIndex(value=" + i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m9973c(this.f112665a, obj);
    }

    /* renamed from: g */
    public final /* synthetic */ int m9969g() {
        return this.f112665a;
    }

    public int hashCode() {
        return m9971e(this.f112665a);
    }

    public String toString() {
        return m9970f(this.f112665a);
    }
}
