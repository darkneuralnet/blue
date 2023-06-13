package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u001a"}, m28432d2 = {"LgN1;", "", "LfN1;", "host", "", "port", "", "enabled", C17296a.f69688o, "(LfN1;Ljava/lang/Integer;Z)LgN1;", "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "LfN1;", "c", "()LfN1;", "b", "Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Integer;", "Z", "()Z", "<init>", "(LfN1;Ljava/lang/Integer;Z)V", "co.bird.android.feature.localhost"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: gN1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41490gN1 {

    /* renamed from: a */
    public final EnumC40897fN1 f82077a;

    /* renamed from: b */
    public final Integer f82078b;

    /* renamed from: c */
    public final boolean f82079c;

    public C41490gN1(EnumC40897fN1 host, Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.f82077a = host;
        this.f82078b = num;
        this.f82079c = z;
    }

    public static /* synthetic */ C41490gN1 copy$default(C41490gN1 c41490gN1, EnumC40897fN1 enumC40897fN1, Integer num, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC40897fN1 = c41490gN1.f82077a;
        }
        if ((i & 2) != 0) {
            num = c41490gN1.f82078b;
        }
        if ((i & 4) != 0) {
            z = c41490gN1.f82079c;
        }
        return c41490gN1.m39568a(enumC40897fN1, num, z);
    }

    /* renamed from: a */
    public final C41490gN1 m39568a(EnumC40897fN1 host, Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(host, "host");
        return new C41490gN1(host, num, z);
    }

    /* renamed from: b */
    public final boolean m39567b() {
        return this.f82079c;
    }

    /* renamed from: c */
    public final EnumC40897fN1 m39566c() {
        return this.f82077a;
    }

    /* renamed from: d */
    public final Integer m39565d() {
        return this.f82078b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C41490gN1) {
            C41490gN1 c41490gN1 = (C41490gN1) obj;
            return this.f82077a == c41490gN1.f82077a && Intrinsics.areEqual(this.f82078b, c41490gN1.f82078b) && this.f82079c == c41490gN1.f82079c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f82077a.hashCode() * 31;
        Integer num = this.f82078b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.f82079c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public String toString() {
        EnumC40897fN1 enumC40897fN1 = this.f82077a;
        Integer num = this.f82078b;
        boolean z = this.f82079c;
        return "HostViewModel(host=" + enumC40897fN1 + ", port=" + num + ", enabled=" + z + ")";
    }
}
