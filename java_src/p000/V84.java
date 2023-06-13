package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LV84;", "LL14;", "", "error", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Throwable;", "b", "()Ljava/lang/Throwable;", "<init>", "(Ljava/lang/Throwable;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: V84 */
/* loaded from: classes3.dex */
public final class V84 implements L14 {

    /* renamed from: a */
    public final Throwable f38674a;

    public V84(Throwable th) {
        this.f38674a = th;
    }

    public static /* synthetic */ V84 copy$default(V84 v84, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = v84.f38674a;
        }
        return v84.m80321a(th);
    }

    /* renamed from: a */
    public final V84 m80321a(Throwable th) {
        return new V84(th);
    }

    /* renamed from: b */
    public final Throwable m80320b() {
        return this.f38674a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof V84) && Intrinsics.areEqual(this.f38674a, ((V84) obj).f38674a);
    }

    public int hashCode() {
        Throwable th = this.f38674a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public String toString() {
        Throwable th = this.f38674a;
        return "PromptConfirmPurchaseError(error=" + th + ")";
    }
}
