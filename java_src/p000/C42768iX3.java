package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0011\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u00020\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m28432d2 = {"LiX3;", "", "", "f", "(J)Ljava/lang/String;", "", "e", "(J)I", LegacyRepairType.OTHER_KEY, "", "c", "(JLjava/lang/Object;)Z", "", C17296a.f69688o, "J", "getValue", "()J", "value", "b", "(J)J", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
/* renamed from: iX3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42768iX3 {

    /* renamed from: a */
    public final long f87451a;

    public /* synthetic */ C42768iX3(long j) {
        this.f87451a = j;
    }

    /* renamed from: a */
    public static final /* synthetic */ C42768iX3 m33837a(long j) {
        return new C42768iX3(j);
    }

    /* renamed from: b */
    public static long m33836b(long j) {
        return j;
    }

    /* renamed from: c */
    public static boolean m33835c(long j, Object obj) {
        return (obj instanceof C42768iX3) && j == ((C42768iX3) obj).m33831g();
    }

    /* renamed from: d */
    public static final boolean m33834d(long j, long j2) {
        return j == j2;
    }

    /* renamed from: e */
    public static int m33833e(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: f */
    public static String m33832f(long j) {
        return "PointerId(value=" + j + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m33835c(this.f87451a, obj);
    }

    /* renamed from: g */
    public final /* synthetic */ long m33831g() {
        return this.f87451a;
    }

    public int hashCode() {
        return m33833e(this.f87451a);
    }

    public String toString() {
        return m33832f(this.f87451a);
    }
}
