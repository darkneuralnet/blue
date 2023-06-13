package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"Lcn0;", "LRB4;", "", Entry.TYPE_TEXT, "b", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/String;", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cn0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39347cn0 extends RB4 {

    /* renamed from: a */
    public final String f61233a;

    public C39347cn0(String str) {
        super(null);
        this.f61233a = str;
    }

    public static /* synthetic */ C39347cn0 copy$default(C39347cn0 c39347cn0, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c39347cn0.f61233a;
        }
        return c39347cn0.m60880b(str);
    }

    @Override // p000.RB4
    /* renamed from: a */
    public String mo13042a() {
        return this.f61233a;
    }

    /* renamed from: b */
    public final C39347cn0 m60880b(String str) {
        return new C39347cn0(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39347cn0) && Intrinsics.areEqual(this.f61233a, ((C39347cn0) obj).f61233a);
    }

    public int hashCode() {
        String str = this.f61233a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.f61233a;
        return "CommandButton(text=" + str + ")";
    }
}
