package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.RepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J1\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0011\u0010\u001b¨\u0006!"}, m28432d2 = {"LTD4;", "Lqi0;", "Lco/bird/android/model/RepairType;", "e", "repairType", "", "checked", "enabled", "showNotes", "f", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "b", "Lco/bird/android/model/RepairType;", "getRepairType", "()Lco/bird/android/model/RepairType;", "c", "Z", C17296a.f69688o, "()Z", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "()Ljava/lang/String;", "title", "g", "details", "<init>", "(Lco/bird/android/model/RepairType;ZZZ)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: TD4 */
/* loaded from: classes3.dex */
public final class TD4 extends AbstractC47616qi0 {

    /* renamed from: b */
    public final RepairType f34933b;

    /* renamed from: c */
    public final boolean f34934c;

    /* renamed from: d */
    public final boolean f34935d;

    /* renamed from: e */
    public final boolean f34936e;

    /* renamed from: f */
    public final String f34937f;

    /* renamed from: g */
    public final String f34938g;

    public /* synthetic */ TD4(RepairType repairType, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(repairType, z, z2, (i & 8) != 0 ? false : z3);
    }

    public static /* synthetic */ TD4 copy$default(TD4 td4, RepairType repairType, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            repairType = td4.f34933b;
        }
        if ((i & 2) != 0) {
            z = td4.f34934c;
        }
        if ((i & 4) != 0) {
            z2 = td4.f34935d;
        }
        if ((i & 8) != 0) {
            z3 = td4.f34936e;
        }
        return td4.m84184f(repairType, z, z2, z3);
    }

    @Override // p000.AbstractC47616qi0
    /* renamed from: a */
    public boolean mo3250a() {
        return this.f34934c;
    }

    @Override // p000.AbstractC47616qi0
    /* renamed from: b */
    public String mo3249b() {
        return this.f34938g;
    }

    @Override // p000.AbstractC47616qi0
    /* renamed from: c */
    public boolean mo3248c() {
        return this.f34935d;
    }

    @Override // p000.AbstractC47616qi0
    /* renamed from: d */
    public String mo3247d() {
        return this.f34937f;
    }

    /* renamed from: e */
    public final RepairType m84185e() {
        return this.f34933b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TD4) {
            TD4 td4 = (TD4) obj;
            return Intrinsics.areEqual(this.f34933b, td4.f34933b) && this.f34934c == td4.f34934c && this.f34935d == td4.f34935d && this.f34936e == td4.f34936e;
        }
        return false;
    }

    /* renamed from: f */
    public final TD4 m84184f(RepairType repairType, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(repairType, "repairType");
        return new TD4(repairType, z, z2, z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f34933b.hashCode() * 31;
        boolean z = this.f34934c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f34935d;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f34936e;
        return i4 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public String toString() {
        RepairType repairType = this.f34933b;
        boolean z = this.f34934c;
        boolean z2 = this.f34935d;
        boolean z3 = this.f34936e;
        return "RepairTypeViewModel(repairType=" + repairType + ", checked=" + z + ", enabled=" + z2 + ", showNotes=" + z3 + ")";
    }

    public TD4(RepairType repairType, boolean z, boolean z2, boolean z3) {
        String str;
        Intrinsics.checkNotNullParameter(repairType, "repairType");
        this.f34933b = repairType;
        this.f34934c = z;
        this.f34935d = z2;
        this.f34936e = z3;
        if (repairType.getNotes() != null && z3) {
            str = "• " + repairType.getDisplay() + ": " + repairType.getNotes();
        } else {
            str = "• " + repairType.getDisplay();
        }
        this.f34937f = str;
    }
}
