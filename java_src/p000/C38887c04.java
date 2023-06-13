package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Lc04;", "", "", "amount", "", "currency", "label", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "J", "b", "()J", "Ljava/lang/String;", "getCurrency", "()Ljava/lang/String;", "c", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: c04  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38887c04 {

    /* renamed from: a */
    public final long f59879a;

    /* renamed from: b */
    public final String f59880b;

    /* renamed from: c */
    public final String f59881c;

    public C38887c04(long j, String currency, String label) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f59879a = j;
        this.f59880b = currency;
        this.f59881c = label;
    }

    public static /* synthetic */ C38887c04 copy$default(C38887c04 c38887c04, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c38887c04.f59879a;
        }
        if ((i & 2) != 0) {
            str = c38887c04.f59880b;
        }
        if ((i & 4) != 0) {
            str2 = c38887c04.f59881c;
        }
        return c38887c04.m62038a(j, str, str2);
    }

    /* renamed from: a */
    public final C38887c04 m62038a(long j, String currency, String label) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(label, "label");
        return new C38887c04(j, currency, label);
    }

    /* renamed from: b */
    public final long m62037b() {
        return this.f59879a;
    }

    /* renamed from: c */
    public final String m62036c() {
        return this.f59881c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C38887c04) {
            C38887c04 c38887c04 = (C38887c04) obj;
            return this.f59879a == c38887c04.f59879a && Intrinsics.areEqual(this.f59880b, c38887c04.f59880b) && Intrinsics.areEqual(this.f59881c, c38887c04.f59881c);
        }
        return false;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f59879a) * 31) + this.f59880b.hashCode()) * 31) + this.f59881c.hashCode();
    }

    public String toString() {
        long j = this.f59879a;
        String str = this.f59880b;
        String str2 = this.f59881c;
        return "PreloadAmountViewModel(amount=" + j + ", currency=" + str + ", label=" + str2 + ")";
    }
}
