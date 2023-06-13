package bo.app;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u000e"}, m28432d2 = {"Lbo/app/z4;", "", "Lbo/app/y4;", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "serverConfig", "<init>", "(Lbo/app/y4;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.z4 */
/* loaded from: classes.dex */
public final class C13283z4 {

    /* renamed from: a */
    private final C13235y4 f59552a;

    public C13283z4(C13235y4 serverConfig) {
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        this.f59552a = serverConfig;
    }

    /* renamed from: a */
    public final C13235y4 m62578a() {
        return this.f59552a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13283z4) && Intrinsics.areEqual(this.f59552a, ((C13283z4) obj).f59552a);
    }

    public int hashCode() {
        return this.f59552a.hashCode();
    }

    public String toString() {
        return "ServerConfigReceivedEvent(serverConfig=" + this.f59552a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
