package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"Lrg1;", "LXs;", "", "messageResId", C17296a.f69688o, "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "I", "b", "()I", "<init>", "(I)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rg1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48190rg1 implements InterfaceC9534Xs {

    /* renamed from: a */
    public final int f107472a;

    public C48190rg1(int i) {
        this.f107472a = i;
    }

    public static /* synthetic */ C48190rg1 copy$default(C48190rg1 c48190rg1, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c48190rg1.f107472a;
        }
        return c48190rg1.m15585a(i);
    }

    /* renamed from: a */
    public final C48190rg1 m15585a(int i) {
        return new C48190rg1(i);
    }

    /* renamed from: b */
    public final int m15584b() {
        return this.f107472a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C48190rg1) && this.f107472a == ((C48190rg1) obj).f107472a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f107472a);
    }

    public String toString() {
        int i = this.f107472a;
        return "ErrorResId(messageResId=" + i + ")";
    }
}
