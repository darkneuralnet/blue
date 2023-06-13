package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b \u0010!J^\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\""}, m28432d2 = {"LDs;", "", "", "optionId", "", "amount", "amountString", "promoString", "", "selected", "incentiveTag", "incentiveTagColor", C17296a.f69688o, "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Long;)LDs;", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "Ljava/lang/Long;", "getAmount", "()Ljava/lang/Long;", "c", DateTokenConverter.CONVERTER_KEY, "f", "Z", "g", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Long;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ds */
/* loaded from: classes3.dex */
public final class C1630Ds {

    /* renamed from: a */
    public final String f6440a;

    /* renamed from: b */
    public final Long f6441b;

    /* renamed from: c */
    public final String f6442c;

    /* renamed from: d */
    public final String f6443d;

    /* renamed from: e */
    public final boolean f6444e;

    /* renamed from: f */
    public final String f6445f;

    /* renamed from: g */
    public final Long f6446g;

    public C1630Ds(String optionId, Long l, String amountString, String str, boolean z, String str2, Long l2) {
        Intrinsics.checkNotNullParameter(optionId, "optionId");
        Intrinsics.checkNotNullParameter(amountString, "amountString");
        this.f6440a = optionId;
        this.f6441b = l;
        this.f6442c = amountString;
        this.f6443d = str;
        this.f6444e = z;
        this.f6445f = str2;
        this.f6446g = l2;
    }

    public static /* synthetic */ C1630Ds copy$default(C1630Ds c1630Ds, String str, Long l, String str2, String str3, boolean z, String str4, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c1630Ds.f6440a;
        }
        if ((i & 2) != 0) {
            l = c1630Ds.f6441b;
        }
        Long l3 = l;
        if ((i & 4) != 0) {
            str2 = c1630Ds.f6442c;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = c1630Ds.f6443d;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            z = c1630Ds.f6444e;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str4 = c1630Ds.f6445f;
        }
        String str7 = str4;
        if ((i & 64) != 0) {
            l2 = c1630Ds.f6446g;
        }
        return c1630Ds.m109844a(str, l3, str5, str6, z2, str7, l2);
    }

    /* renamed from: a */
    public final C1630Ds m109844a(String optionId, Long l, String amountString, String str, boolean z, String str2, Long l2) {
        Intrinsics.checkNotNullParameter(optionId, "optionId");
        Intrinsics.checkNotNullParameter(amountString, "amountString");
        return new C1630Ds(optionId, l, amountString, str, z, str2, l2);
    }

    /* renamed from: b */
    public final String m109843b() {
        return this.f6442c;
    }

    /* renamed from: c */
    public final String m109842c() {
        return this.f6445f;
    }

    /* renamed from: d */
    public final Long m109841d() {
        return this.f6446g;
    }

    /* renamed from: e */
    public final String m109840e() {
        return this.f6440a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1630Ds) {
            C1630Ds c1630Ds = (C1630Ds) obj;
            return Intrinsics.areEqual(this.f6440a, c1630Ds.f6440a) && Intrinsics.areEqual(this.f6441b, c1630Ds.f6441b) && Intrinsics.areEqual(this.f6442c, c1630Ds.f6442c) && Intrinsics.areEqual(this.f6443d, c1630Ds.f6443d) && this.f6444e == c1630Ds.f6444e && Intrinsics.areEqual(this.f6445f, c1630Ds.f6445f) && Intrinsics.areEqual(this.f6446g, c1630Ds.f6446g);
        }
        return false;
    }

    /* renamed from: f */
    public final String m109839f() {
        return this.f6443d;
    }

    /* renamed from: g */
    public final boolean m109838g() {
        return this.f6444e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f6440a.hashCode() * 31;
        Long l = this.f6441b;
        int hashCode2 = (((hashCode + (l == null ? 0 : l.hashCode())) * 31) + this.f6442c.hashCode()) * 31;
        String str = this.f6443d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f6444e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        String str2 = this.f6445f;
        int hashCode4 = (i2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.f6446g;
        return hashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f6440a;
        Long l = this.f6441b;
        String str2 = this.f6442c;
        String str3 = this.f6443d;
        boolean z = this.f6444e;
        String str4 = this.f6445f;
        Long l2 = this.f6446g;
        return "AutoReloadV2OptionViewModel(optionId=" + str + ", amount=" + l + ", amountString=" + str2 + ", promoString=" + str3 + ", selected=" + z + ", incentiveTag=" + str4 + ", incentiveTagColor=" + l2 + ")";
    }

    public /* synthetic */ C1630Ds(String str, Long l, String str2, String str3, boolean z, String str4, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l, str2, (i & 8) != 0 ? null : str3, z, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : l2);
    }
}
