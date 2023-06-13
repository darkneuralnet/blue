package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"Lpg1;", "Lz04;", "", "messageResId", C17296a.f69688o, "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "I", "b", "()I", "<init>", "(I)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pg1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47004pg1 implements InterfaceC52541z04 {

    /* renamed from: a */
    public final int f103902a;

    public C47004pg1(int i) {
        this.f103902a = i;
    }

    public static /* synthetic */ C47004pg1 copy$default(C47004pg1 c47004pg1, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c47004pg1.f103902a;
        }
        return c47004pg1.m19000a(i);
    }

    /* renamed from: a */
    public final C47004pg1 m19000a(int i) {
        return new C47004pg1(i);
    }

    /* renamed from: b */
    public final int m18999b() {
        return this.f103902a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C47004pg1) && this.f103902a == ((C47004pg1) obj).f103902a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f103902a);
    }

    public String toString() {
        int i = this.f103902a;
        return "ErrorResId(messageResId=" + i + ")";
    }
}
