package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m28432d2 = {"LHQ5;", "", "", Entry.TYPE_TEXT, "", "textColor", "actionText", C17296a.f69688o, "(Ljava/lang/String;ILjava/lang/Integer;)LHQ5;", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "I", "c", "()I", "Ljava/lang/Integer;", "getActionText", "()Ljava/lang/Integer;", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: HQ5 */
/* loaded from: classes3.dex */
public final class HQ5 {

    /* renamed from: a */
    public final String f13378a;

    /* renamed from: b */
    public final int f13379b;

    /* renamed from: c */
    public final Integer f13380c;

    public HQ5(String text, int i, Integer num) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f13378a = text;
        this.f13379b = i;
        this.f13380c = num;
    }

    public static /* synthetic */ HQ5 copy$default(HQ5 hq5, String str, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = hq5.f13378a;
        }
        if ((i2 & 2) != 0) {
            i = hq5.f13379b;
        }
        if ((i2 & 4) != 0) {
            num = hq5.f13380c;
        }
        return hq5.m103901a(str, i, num);
    }

    /* renamed from: a */
    public final HQ5 m103901a(String text, int i, Integer num) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new HQ5(text, i, num);
    }

    /* renamed from: b */
    public final String m103900b() {
        return this.f13378a;
    }

    /* renamed from: c */
    public final int m103899c() {
        return this.f13379b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HQ5) {
            HQ5 hq5 = (HQ5) obj;
            return Intrinsics.areEqual(this.f13378a, hq5.f13378a) && this.f13379b == hq5.f13379b && Intrinsics.areEqual(this.f13380c, hq5.f13380c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f13378a.hashCode() * 31) + Integer.hashCode(this.f13379b)) * 31;
        Integer num = this.f13380c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        String str = this.f13378a;
        int i = this.f13379b;
        Integer num = this.f13380c;
        return "StatusViewModel(text=" + str + ", textColor=" + i + ", actionText=" + num + ")";
    }

    public /* synthetic */ HQ5(String str, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? null : num);
    }
}
