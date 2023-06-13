package bo.app;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m28432d2 = {"Lbo/app/k4;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lbo/app/l4;", "pathType", "Lbo/app/l4;", C17296a.f69688o, "()Lbo/app/l4;", "remoteUrl", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "(Lbo/app/l4;Ljava/lang/String;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.k4 */
/* loaded from: classes.dex */
public final class C12820k4 {

    /* renamed from: a */
    private final EnumC12870l4 f58757a;

    /* renamed from: b */
    private final String f58758b;

    public C12820k4(EnumC12870l4 pathType, String remoteUrl) {
        Intrinsics.checkNotNullParameter(pathType, "pathType");
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        this.f58757a = pathType;
        this.f58758b = remoteUrl;
    }

    /* renamed from: a */
    public final EnumC12870l4 m63458a() {
        return this.f58757a;
    }

    /* renamed from: b */
    public final String m63457b() {
        return this.f58758b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12820k4) {
            C12820k4 c12820k4 = (C12820k4) obj;
            return this.f58757a == c12820k4.f58757a && Intrinsics.areEqual(this.f58758b, c12820k4.f58758b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f58757a.hashCode() * 31) + this.f58758b.hashCode();
    }

    public String toString() {
        return "RemotePath(pathType=" + this.f58757a + ", remoteUrl=" + this.f58758b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
