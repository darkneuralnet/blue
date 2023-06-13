package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.OperatorFilter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m28432d2 = {"LnY3;", "Lel3;", "", "Lco/bird/android/model/persistence/OperatorFilter;", "filters", "", "diffCount", "", "forceNotify", C17296a.f69688o, "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "I", "()I", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "<init>", "(Ljava/util/List;IZ)V", "filters_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nY3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45742nY3 implements InterfaceC40533el3 {

    /* renamed from: a */
    public final List<OperatorFilter> f100110a;

    /* renamed from: b */
    public final int f100111b;

    /* renamed from: c */
    public final boolean f100112c;

    /* JADX WARN: Multi-variable type inference failed */
    public C45742nY3(List<? extends OperatorFilter> filters, int i, boolean z) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f100110a = filters;
        this.f100111b = i;
        this.f100112c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C45742nY3 copy$default(C45742nY3 c45742nY3, List list, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = c45742nY3.f100110a;
        }
        if ((i2 & 2) != 0) {
            i = c45742nY3.f100111b;
        }
        if ((i2 & 4) != 0) {
            z = c45742nY3.f100112c;
        }
        return c45742nY3.m23552a(list, i, z);
    }

    /* renamed from: a */
    public final C45742nY3 m23552a(List<? extends OperatorFilter> filters, int i, boolean z) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        return new C45742nY3(filters, i, z);
    }

    /* renamed from: b */
    public final int m23551b() {
        return this.f100111b;
    }

    /* renamed from: c */
    public final List<OperatorFilter> m23550c() {
        return this.f100110a;
    }

    /* renamed from: d */
    public final boolean m23549d() {
        return this.f100112c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C45742nY3) {
            C45742nY3 c45742nY3 = (C45742nY3) obj;
            return Intrinsics.areEqual(this.f100110a, c45742nY3.f100110a) && this.f100111b == c45742nY3.f100111b && this.f100112c == c45742nY3.f100112c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f100110a.hashCode() * 31) + Integer.hashCode(this.f100111b)) * 31;
        boolean z = this.f100112c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        List<OperatorFilter> list = this.f100110a;
        int i = this.f100111b;
        boolean z = this.f100112c;
        return "PopulateAdapter(filters=" + list + ", diffCount=" + i + ", forceNotify=" + z + ")";
    }
}
