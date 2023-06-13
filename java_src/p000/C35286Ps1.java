package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"LPs1;", "", "", "doNotShowAgain", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Z", "b", "()Z", "<init>", "(Z)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ps1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35286Ps1 {

    /* renamed from: a */
    public final boolean f29183a;

    public C35286Ps1() {
        this(false, 1, null);
    }

    public static /* synthetic */ C35286Ps1 copy$default(C35286Ps1 c35286Ps1, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c35286Ps1.f29183a;
        }
        return c35286Ps1.m89669a(z);
    }

    /* renamed from: a */
    public final C35286Ps1 m89669a(boolean z) {
        return new C35286Ps1(z);
    }

    /* renamed from: b */
    public final boolean m89668b() {
        return this.f29183a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35286Ps1) && this.f29183a == ((C35286Ps1) obj).f29183a;
    }

    public int hashCode() {
        boolean z = this.f29183a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.f29183a;
        return "FlightSheetQuickCaptureReadyState(doNotShowAgain=" + z + ")";
    }

    public C35286Ps1(boolean z) {
        this.f29183a = z;
    }

    public /* synthetic */ C35286Ps1(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
