package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"Lsv1;", "Lrv1;", "", "message", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: sv1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48932sv1 extends AbstractC48340rv1 {

    /* renamed from: a */
    public final String f109569a;

    public C48932sv1(String str) {
        super(null);
        this.f109569a = str;
    }

    public static /* synthetic */ C48932sv1 copy$default(C48932sv1 c48932sv1, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c48932sv1.f109569a;
        }
        return c48932sv1.m13390a(str);
    }

    /* renamed from: a */
    public final C48932sv1 m13390a(String str) {
        return new C48932sv1(str);
    }

    /* renamed from: b */
    public final String m13389b() {
        return this.f109569a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C48932sv1) && Intrinsics.areEqual(this.f109569a, ((C48932sv1) obj).f109569a);
    }

    public int hashCode() {
        String str = this.f109569a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.f109569a;
        return "FmAllocationError(message=" + str + ")";
    }
}
