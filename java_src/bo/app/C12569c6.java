package bo.app;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m28432d2 = {"Lbo/app/c6;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "campaignId", "Ljava/lang/String;", C17296a.f69688o, "()Ljava/lang/String;", "Lbo/app/u1;", "pushClickEvent", "Lbo/app/u1;", "b", "()Lbo/app/u1;", "<init>", "(Ljava/lang/String;Lbo/app/u1;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.c6 */
/* loaded from: classes.dex */
public final class C12569c6 {

    /* renamed from: a */
    private final String f58292a;

    /* renamed from: b */
    private final InterfaceC13160u1 f58293b;

    public C12569c6(String campaignId, InterfaceC13160u1 pushClickEvent) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(pushClickEvent, "pushClickEvent");
        this.f58292a = campaignId;
        this.f58293b = pushClickEvent;
    }

    /* renamed from: a */
    public final String m63869a() {
        return this.f58292a;
    }

    /* renamed from: b */
    public final InterfaceC13160u1 m63868b() {
        return this.f58293b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12569c6) {
            C12569c6 c12569c6 = (C12569c6) obj;
            return Intrinsics.areEqual(this.f58292a, c12569c6.f58292a) && Intrinsics.areEqual(this.f58293b, c12569c6.f58293b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f58292a.hashCode() * 31) + this.f58293b.hashCode();
    }

    public String toString() {
        return "TriggerEligiblePushClickEvent(campaignId=" + this.f58292a + ", pushClickEvent=" + this.f58293b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
