package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Lx02;", "", "", "acceptedQuantity", "", "showAcceptDelivery", "enableAcceptDelivery", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/CharSequence;", "b", "()Ljava/lang/CharSequence;", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "c", "<init>", "(Ljava/lang/CharSequence;ZZ)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: x02  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51353x02 {

    /* renamed from: a */
    public final CharSequence f116964a;

    /* renamed from: b */
    public final boolean f116965b;

    /* renamed from: c */
    public final boolean f116966c;

    public C51353x02(CharSequence acceptedQuantity, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(acceptedQuantity, "acceptedQuantity");
        this.f116964a = acceptedQuantity;
        this.f116965b = z;
        this.f116966c = z2;
    }

    public static /* synthetic */ C51353x02 copy$default(C51353x02 c51353x02, CharSequence charSequence, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = c51353x02.f116964a;
        }
        if ((i & 2) != 0) {
            z = c51353x02.f116965b;
        }
        if ((i & 4) != 0) {
            z2 = c51353x02.f116966c;
        }
        return c51353x02.m6001a(charSequence, z, z2);
    }

    /* renamed from: a */
    public final C51353x02 m6001a(CharSequence acceptedQuantity, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(acceptedQuantity, "acceptedQuantity");
        return new C51353x02(acceptedQuantity, z, z2);
    }

    /* renamed from: b */
    public final CharSequence m6000b() {
        return this.f116964a;
    }

    /* renamed from: c */
    public final boolean m5999c() {
        return this.f116966c;
    }

    /* renamed from: d */
    public final boolean m5998d() {
        return this.f116965b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C51353x02) {
            C51353x02 c51353x02 = (C51353x02) obj;
            return Intrinsics.areEqual(this.f116964a, c51353x02.f116964a) && this.f116965b == c51353x02.f116965b && this.f116966c == c51353x02.f116966c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f116964a.hashCode() * 31;
        boolean z = this.f116965b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f116966c;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        CharSequence charSequence = this.f116964a;
        boolean z = this.f116965b;
        boolean z2 = this.f116966c;
        return "InboundScanHeaderViewModel(acceptedQuantity=" + ((Object) charSequence) + ", showAcceptDelivery=" + z + ", enableAcceptDelivery=" + z2 + ")";
    }
}
