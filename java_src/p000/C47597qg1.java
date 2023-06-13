package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"Lqg1;", "LL14;", "", "messageResId", C17296a.f69688o, "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "I", "b", "()I", "<init>", "(I)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qg1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47597qg1 implements L14 {

    /* renamed from: a */
    public final int f105597a;

    public C47597qg1(int i) {
        this.f105597a = i;
    }

    public static /* synthetic */ C47597qg1 copy$default(C47597qg1 c47597qg1, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c47597qg1.f105597a;
        }
        return c47597qg1.m17255a(i);
    }

    /* renamed from: a */
    public final C47597qg1 m17255a(int i) {
        return new C47597qg1(i);
    }

    /* renamed from: b */
    public final int m17254b() {
        return this.f105597a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C47597qg1) && this.f105597a == ((C47597qg1) obj).f105597a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f105597a);
    }

    public String toString() {
        int i = this.f105597a;
        return "ErrorResId(messageResId=" + i + ")";
    }
}
