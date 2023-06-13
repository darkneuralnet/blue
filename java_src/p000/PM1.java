package p000;

import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, m28432d2 = {"LPM1;", "", "", "toString", "", C17296a.f69688o, "J", "b", "()J", "uptimeMillis", "LCe3;", "position", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: PM1 */
/* loaded from: classes.dex */
public final class PM1 {

    /* renamed from: a */
    public final long f28295a;

    /* renamed from: b */
    public final long f28296b;

    public /* synthetic */ PM1(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: a */
    public final long m90444a() {
        return this.f28296b;
    }

    /* renamed from: b */
    public final long m90443b() {
        return this.f28295a;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f28295a + ", position=" + ((Object) C32120Ce3.m111937v(this.f28296b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public PM1(long j, long j2) {
        this.f28295a = j;
        this.f28296b = j2;
    }
}
