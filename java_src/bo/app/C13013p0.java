package bo.app;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u000e"}, m28432d2 = {"Lbo/app/p0;", "", "Lbo/app/z1;", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "request", "<init>", "(Lbo/app/z1;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.p0 */
/* loaded from: classes.dex */
public final class C13013p0 {

    /* renamed from: a */
    private final InterfaceC13280z1 f59080a;

    public C13013p0(InterfaceC13280z1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f59080a = request;
    }

    /* renamed from: a */
    public final InterfaceC13280z1 m63158a() {
        return this.f59080a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13013p0) && Intrinsics.areEqual(this.f59080a, ((C13013p0) obj).f59080a);
    }

    public int hashCode() {
        return this.f59080a.hashCode();
    }

    public String toString() {
        return "DispatchSucceededEvent(request=" + this.f59080a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
