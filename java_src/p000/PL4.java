package p000;

import android.content.Intent;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"LPL4;", "", "LcW0;", C17296a.f69688o, "LMV0;", "b", "Landroid/content/Intent;", "c", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "LcW0;", "getDeepLinkResult", "()LcW0;", "deepLinkResult", "LMV0;", "getDeepLinkNavigator", "()LMV0;", "deepLinkNavigator", "Landroid/content/Intent;", "getResolvedIntent", "()Landroid/content/Intent;", "resolvedIntent", "<init>", "(LcW0;LMV0;Landroid/content/Intent;)V", "deeplink_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: PL4 */
/* loaded from: classes3.dex */
public final class PL4 {

    /* renamed from: a */
    public final AbstractC39181cW0 f28290a;

    /* renamed from: b */
    public final MV0 f28291b;

    /* renamed from: c */
    public final Intent f28292c;

    public PL4(AbstractC39181cW0 deepLinkResult, MV0 mv0, Intent resolvedIntent) {
        Intrinsics.checkNotNullParameter(deepLinkResult, "deepLinkResult");
        Intrinsics.checkNotNullParameter(resolvedIntent, "resolvedIntent");
        this.f28290a = deepLinkResult;
        this.f28291b = mv0;
        this.f28292c = resolvedIntent;
    }

    /* renamed from: a */
    public final AbstractC39181cW0 m90449a() {
        return this.f28290a;
    }

    /* renamed from: b */
    public final MV0 m90448b() {
        return this.f28291b;
    }

    /* renamed from: c */
    public final Intent m90447c() {
        return this.f28292c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PL4) {
            PL4 pl4 = (PL4) obj;
            return Intrinsics.areEqual(this.f28290a, pl4.f28290a) && Intrinsics.areEqual(this.f28291b, pl4.f28291b) && Intrinsics.areEqual(this.f28292c, pl4.f28292c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f28290a.hashCode() * 31;
        MV0 mv0 = this.f28291b;
        return ((hashCode + (mv0 == null ? 0 : mv0.hashCode())) * 31) + this.f28292c.hashCode();
    }

    public String toString() {
        AbstractC39181cW0 abstractC39181cW0 = this.f28290a;
        MV0 mv0 = this.f28291b;
        Intent intent = this.f28292c;
        return "ResolvedDeepLinkNavigation(deepLinkResult=" + abstractC39181cW0 + ", deepLinkNavigator=" + mv0 + ", resolvedIntent=" + intent + ")";
    }
}
