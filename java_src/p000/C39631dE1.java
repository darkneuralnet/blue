package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0087@\u0018\u00002\u00020\u0001B\u0014\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0010\u0010\u0007\u0088\u0001\u000f\u0092\u0001\u00020\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"LdE1;", "", "", "f", "(J)Ljava/lang/String;", "", "e", "(J)I", LegacyRepairType.OTHER_KEY, "", "c", "(JLjava/lang/Object;)Z", "", C17296a.f69688o, "J", "packedValue", DateTokenConverter.CONVERTER_KEY, "getCurrentLineSpan$annotations", "()V", "currentLineSpan", "b", "(J)J", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
/* renamed from: dE1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39631dE1 {

    /* renamed from: a */
    public final long f76288a;

    public /* synthetic */ C39631dE1(long j) {
        this.f76288a = j;
    }

    /* renamed from: a */
    public static final /* synthetic */ C39631dE1 m44518a(long j) {
        return new C39631dE1(j);
    }

    /* renamed from: b */
    public static long m44517b(long j) {
        return j;
    }

    /* renamed from: c */
    public static boolean m44516c(long j, Object obj) {
        return (obj instanceof C39631dE1) && j == ((C39631dE1) obj).m44512g();
    }

    /* renamed from: d */
    public static final int m44515d(long j) {
        return (int) j;
    }

    /* renamed from: e */
    public static int m44514e(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: f */
    public static String m44513f(long j) {
        return "GridItemSpan(packedValue=" + j + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m44516c(this.f76288a, obj);
    }

    /* renamed from: g */
    public final /* synthetic */ long m44512g() {
        return this.f76288a;
    }

    public int hashCode() {
        return m44514e(this.f76288a);
    }

    public String toString() {
        return m44513f(this.f76288a);
    }
}
