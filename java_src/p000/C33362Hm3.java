package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0016\u0010\u0017JI\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0018"}, m28432d2 = {"LHm3;", "", "", "LFm3;", "enabledMultiSelect", "disabledMultiSelect", "enabledRangeSelect", "disabledRangeSelect", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "b", "c", "e", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Hm3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33362Hm3 {

    /* renamed from: a */
    public final List<C32894Fm3> f13873a;

    /* renamed from: b */
    public final List<C32894Fm3> f13874b;

    /* renamed from: c */
    public final List<C32894Fm3> f13875c;

    /* renamed from: d */
    public final List<C32894Fm3> f13876d;

    public C33362Hm3() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C33362Hm3 copy$default(C33362Hm3 c33362Hm3, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c33362Hm3.f13873a;
        }
        if ((i & 2) != 0) {
            list2 = c33362Hm3.f13874b;
        }
        if ((i & 4) != 0) {
            list3 = c33362Hm3.f13875c;
        }
        if ((i & 8) != 0) {
            list4 = c33362Hm3.f13876d;
        }
        return c33362Hm3.m103440a(list, list2, list3, list4);
    }

    /* renamed from: a */
    public final C33362Hm3 m103440a(List<C32894Fm3> enabledMultiSelect, List<C32894Fm3> disabledMultiSelect, List<C32894Fm3> enabledRangeSelect, List<C32894Fm3> disabledRangeSelect) {
        Intrinsics.checkNotNullParameter(enabledMultiSelect, "enabledMultiSelect");
        Intrinsics.checkNotNullParameter(disabledMultiSelect, "disabledMultiSelect");
        Intrinsics.checkNotNullParameter(enabledRangeSelect, "enabledRangeSelect");
        Intrinsics.checkNotNullParameter(disabledRangeSelect, "disabledRangeSelect");
        return new C33362Hm3(enabledMultiSelect, disabledMultiSelect, enabledRangeSelect, disabledRangeSelect);
    }

    /* renamed from: b */
    public final List<C32894Fm3> m103439b() {
        return this.f13874b;
    }

    /* renamed from: c */
    public final List<C32894Fm3> m103438c() {
        return this.f13876d;
    }

    /* renamed from: d */
    public final List<C32894Fm3> m103437d() {
        return this.f13873a;
    }

    /* renamed from: e */
    public final List<C32894Fm3> m103436e() {
        return this.f13875c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C33362Hm3) {
            C33362Hm3 c33362Hm3 = (C33362Hm3) obj;
            return Intrinsics.areEqual(this.f13873a, c33362Hm3.f13873a) && Intrinsics.areEqual(this.f13874b, c33362Hm3.f13874b) && Intrinsics.areEqual(this.f13875c, c33362Hm3.f13875c) && Intrinsics.areEqual(this.f13876d, c33362Hm3.f13876d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f13873a.hashCode() * 31) + this.f13874b.hashCode()) * 31) + this.f13875c.hashCode()) * 31) + this.f13876d.hashCode();
    }

    public String toString() {
        List<C32894Fm3> list = this.f13873a;
        List<C32894Fm3> list2 = this.f13874b;
        List<C32894Fm3> list3 = this.f13875c;
        List<C32894Fm3> list4 = this.f13876d;
        return "OperatorMapFilterGrouping(enabledMultiSelect=" + list + ", disabledMultiSelect=" + list2 + ", enabledRangeSelect=" + list3 + ", disabledRangeSelect=" + list4 + ")";
    }

    public C33362Hm3(List<C32894Fm3> enabledMultiSelect, List<C32894Fm3> disabledMultiSelect, List<C32894Fm3> enabledRangeSelect, List<C32894Fm3> disabledRangeSelect) {
        Intrinsics.checkNotNullParameter(enabledMultiSelect, "enabledMultiSelect");
        Intrinsics.checkNotNullParameter(disabledMultiSelect, "disabledMultiSelect");
        Intrinsics.checkNotNullParameter(enabledRangeSelect, "enabledRangeSelect");
        Intrinsics.checkNotNullParameter(disabledRangeSelect, "disabledRangeSelect");
        this.f13873a = enabledMultiSelect;
        this.f13874b = disabledMultiSelect;
        this.f13875c = enabledRangeSelect;
        this.f13876d = disabledRangeSelect;
    }

    public /* synthetic */ C33362Hm3(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2, (i & 4) != 0 ? new ArrayList() : list3, (i & 8) != 0 ? new ArrayList() : list4);
    }
}
