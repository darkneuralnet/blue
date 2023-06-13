package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"LhA5;", "", "", "scannedCount", C17296a.f69688o, "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "I", "b", "()I", "<init>", "(I)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hA5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41970hA5 {

    /* renamed from: a */
    public final int f84770a;

    public C41970hA5(int i) {
        this.f84770a = i;
    }

    public static /* synthetic */ C41970hA5 copy$default(C41970hA5 c41970hA5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c41970hA5.f84770a;
        }
        return c41970hA5.m36766a(i);
    }

    /* renamed from: a */
    public final C41970hA5 m36766a(int i) {
        return new C41970hA5(i);
    }

    /* renamed from: b */
    public final int m36765b() {
        return this.f84770a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41970hA5) && this.f84770a == ((C41970hA5) obj).f84770a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f84770a);
    }

    public String toString() {
        int i = this.f84770a;
        return "ShowExitConfirmation(scannedCount=" + i + ")";
    }
}
