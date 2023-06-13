package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.OperatorOrderViewType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ;\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001c"}, m28432d2 = {"Llx5;", "Lmp3;", "Lco/bird/android/model/constant/OperatorOrderViewType;", "type", "", "new", "enableScan", "bolUploaded", "uploadBolEnabled", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Lco/bird/android/model/constant/OperatorOrderViewType;", "e", "()Lco/bird/android/model/constant/OperatorOrderViewType;", "b", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "c", "f", "<init>", "(Lco/bird/android/model/constant/OperatorOrderViewType;ZZZZ)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lx5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44806lx5 extends AbstractC45317mp3 {

    /* renamed from: a */
    public final OperatorOrderViewType f97006a;

    /* renamed from: b */
    public final boolean f97007b;

    /* renamed from: c */
    public final boolean f97008c;

    /* renamed from: d */
    public final boolean f97009d;

    /* renamed from: e */
    public final boolean f97010e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44806lx5(OperatorOrderViewType type, boolean z, boolean z2, boolean z3, boolean z4) {
        super(null);
        Intrinsics.checkNotNullParameter(type, "type");
        this.f97006a = type;
        this.f97007b = z;
        this.f97008c = z2;
        this.f97009d = z3;
        this.f97010e = z4;
    }

    public static /* synthetic */ C44806lx5 copy$default(C44806lx5 c44806lx5, OperatorOrderViewType operatorOrderViewType, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            operatorOrderViewType = c44806lx5.f97006a;
        }
        if ((i & 2) != 0) {
            z = c44806lx5.f97007b;
        }
        boolean z5 = z;
        if ((i & 4) != 0) {
            z2 = c44806lx5.f97008c;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            z3 = c44806lx5.f97009d;
        }
        boolean z7 = z3;
        if ((i & 16) != 0) {
            z4 = c44806lx5.f97010e;
        }
        return c44806lx5.m26599a(operatorOrderViewType, z5, z6, z7, z4);
    }

    /* renamed from: a */
    public final C44806lx5 m26599a(OperatorOrderViewType type, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new C44806lx5(type, z, z2, z3, z4);
    }

    /* renamed from: b */
    public final boolean m26598b() {
        return this.f97009d;
    }

    /* renamed from: c */
    public final boolean m26597c() {
        return this.f97008c;
    }

    /* renamed from: d */
    public final boolean m26596d() {
        return this.f97007b;
    }

    /* renamed from: e */
    public final OperatorOrderViewType m26595e() {
        return this.f97006a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44806lx5) {
            C44806lx5 c44806lx5 = (C44806lx5) obj;
            return this.f97006a == c44806lx5.f97006a && this.f97007b == c44806lx5.f97007b && this.f97008c == c44806lx5.f97008c && this.f97009d == c44806lx5.f97009d && this.f97010e == c44806lx5.f97010e;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m26594f() {
        return this.f97010e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f97006a.hashCode() * 31;
        boolean z = this.f97007b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f97008c;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f97009d;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.f97010e;
        return i6 + (z4 ? 1 : z4 ? 1 : 0);
    }

    public String toString() {
        OperatorOrderViewType operatorOrderViewType = this.f97006a;
        boolean z = this.f97007b;
        boolean z2 = this.f97008c;
        boolean z3 = this.f97009d;
        boolean z4 = this.f97010e;
        return "Setup(type=" + operatorOrderViewType + ", new=" + z + ", enableScan=" + z2 + ", bolUploaded=" + z3 + ", uploadBolEnabled=" + z4 + ")";
    }
}
