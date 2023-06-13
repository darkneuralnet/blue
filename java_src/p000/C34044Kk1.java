package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m28432d2 = {"LKk1;", "", "Ltg1;", "errorResponse", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "b", "Ltg1;", "getErrorResponse", "()Ltg1;", "<init>", "(Ltg1;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Kk1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C34044Kk1 extends Throwable {

    /* renamed from: b */
    public final C49375tg1 f20166b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34044Kk1(C49375tg1 errorResponse) {
        super(errorResponse.toString());
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        this.f20166b = errorResponse;
    }

    public static /* synthetic */ C34044Kk1 copy$default(C34044Kk1 c34044Kk1, C49375tg1 c49375tg1, int i, Object obj) {
        if ((i & 1) != 0) {
            c49375tg1 = c34044Kk1.f20166b;
        }
        return c34044Kk1.m98337a(c49375tg1);
    }

    /* renamed from: a */
    public final C34044Kk1 m98337a(C49375tg1 errorResponse) {
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        return new C34044Kk1(errorResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34044Kk1) && Intrinsics.areEqual(this.f20166b, ((C34044Kk1) obj).f20166b);
    }

    public int hashCode() {
        return this.f20166b.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        C49375tg1 c49375tg1 = this.f20166b;
        return "FetchPartnerError(errorResponse=" + c49375tg1 + ")";
    }
}
