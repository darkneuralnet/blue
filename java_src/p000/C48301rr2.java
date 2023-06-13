package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0088\u0001\u0010\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m28432d2 = {"Lrr2;", "", "", "f", "(I)Ljava/lang/String;", "", "e", "(I)I", LegacyRepairType.OTHER_KEY, "", "c", "(ILjava/lang/Object;)Z", C17296a.f69688o, "I", "getValue", "()I", "value", "b", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
/* renamed from: rr2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48301rr2 {

    /* renamed from: a */
    public final int f107782a;

    public /* synthetic */ C48301rr2(int i) {
        this.f107782a = i;
    }

    /* renamed from: a */
    public static final /* synthetic */ C48301rr2 m15182a(int i) {
        return new C48301rr2(i);
    }

    /* renamed from: b */
    public static int m15181b(int i) {
        return i;
    }

    /* renamed from: c */
    public static boolean m15180c(int i, Object obj) {
        return (obj instanceof C48301rr2) && i == ((C48301rr2) obj).m15176g();
    }

    /* renamed from: d */
    public static final boolean m15179d(int i, int i2) {
        return i == i2;
    }

    /* renamed from: e */
    public static int m15178e(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: f */
    public static String m15177f(int i) {
        return "LineIndex(value=" + i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m15180c(this.f107782a, obj);
    }

    /* renamed from: g */
    public final /* synthetic */ int m15176g() {
        return this.f107782a;
    }

    public int hashCode() {
        return m15178e(this.f107782a);
    }

    public String toString() {
        return m15177f(this.f107782a);
    }
}
