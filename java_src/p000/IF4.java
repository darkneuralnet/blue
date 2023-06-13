package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.Repair;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LIF4;", "", "Lco/bird/android/model/Repair;", "repair", "", "selected", "mutable", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lco/bird/android/model/Repair;", DateTokenConverter.CONVERTER_KEY, "()Lco/bird/android/model/Repair;", "b", "Z", "e", "()Z", "c", "()Ljava/lang/String;", "display", "<init>", "(Lco/bird/android/model/Repair;ZZ)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: IF4 */
/* loaded from: classes3.dex */
public final class IF4 {

    /* renamed from: a */
    public final Repair f14940a;

    /* renamed from: b */
    public final boolean f14941b;

    /* renamed from: c */
    public final boolean f14942c;

    public IF4(Repair repair, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(repair, "repair");
        this.f14940a = repair;
        this.f14941b = z;
        this.f14942c = z2;
    }

    public static /* synthetic */ IF4 copy$default(IF4 if4, Repair repair, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            repair = if4.f14940a;
        }
        if ((i & 2) != 0) {
            z = if4.f14941b;
        }
        if ((i & 4) != 0) {
            z2 = if4.f14942c;
        }
        return if4.m102669a(repair, z, z2);
    }

    /* renamed from: a */
    public final IF4 m102669a(Repair repair, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(repair, "repair");
        return new IF4(repair, z, z2);
    }

    /* renamed from: b */
    public final String m102668b() {
        return this.f14940a.getDisplay();
    }

    /* renamed from: c */
    public final boolean m102667c() {
        return this.f14942c;
    }

    /* renamed from: d */
    public final Repair m102666d() {
        return this.f14940a;
    }

    /* renamed from: e */
    public final boolean m102665e() {
        return this.f14941b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IF4) {
            IF4 if4 = (IF4) obj;
            return Intrinsics.areEqual(this.f14940a, if4.f14940a) && this.f14941b == if4.f14941b && this.f14942c == if4.f14942c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f14940a.hashCode() * 31;
        boolean z = this.f14941b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f14942c;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        Repair repair = this.f14940a;
        boolean z = this.f14941b;
        boolean z2 = this.f14942c;
        return "RepairViewModel(repair=" + repair + ", selected=" + z + ", mutable=" + z2 + ")";
    }
}
