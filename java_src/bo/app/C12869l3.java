package bo.app;

import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B3\b\u0017\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R(\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"Lbo/app/l3;", "Lbo/app/d5;", "", "A", "", "toString", "", "value", "w", "()Ljava/lang/Double;", C17296a.f69688o, "(Ljava/lang/Double;)V", "endTime", "Lbo/app/f5;", "sessionId", "startTimeSeconds", "endTimeSeconds", "", "sealed", "<init>", "(Lbo/app/f5;DLjava/lang/Double;Z)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.l3 */
/* loaded from: classes.dex */
public final class C12869l3 extends C12584d5 {
    public /* synthetic */ C12869l3(C12648f5 c12648f5, double d, Double d2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C12648f5.f58467d.m63733a() : c12648f5, (i & 2) != 0 ? C46287oT0.m21026j() : d, (i & 4) != 0 ? null : d2, (i & 8) != 0 ? false : z);
    }

    /* renamed from: A */
    public final void m63366A() {
        m63841a(true);
        mo63365a(Double.valueOf(C46287oT0.m21026j()));
    }

    @Override // bo.app.C12584d5
    /* renamed from: a */
    public void mo63365a(Double d) {
        super.mo63365a(d);
    }

    @Override // bo.app.C12584d5
    public String toString() {
        return "\nMutableSession(sessionId=" + m63839n() + ", startTime=" + m63837x() + ", endTime=" + mo63364w() + ", isSealed=" + m63836y() + ", duration=" + m63838v() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // bo.app.C12584d5
    /* renamed from: w */
    public Double mo63364w() {
        return super.mo63364w();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12869l3(C12648f5 sessionId, double d, Double d2, boolean z) {
        super(sessionId, d, d2, z);
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
    }
}
