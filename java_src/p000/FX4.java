package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.RidePassView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010#JU\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\t\u0010\u000e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u0016\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b\u001e\u0010!¨\u0006$"}, m28432d2 = {"LFX4;", "", "", "title", "", "isSubscription", "", "subscription", "promoTag", "body", "subscriptionInfo", "Lco/bird/android/model/persistence/RidePassView;", "ridePass", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/CharSequence;", "g", "()Ljava/lang/CharSequence;", "b", "Z", "h", "()Z", "c", "Ljava/lang/String;", "e", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "f", "Lco/bird/android/model/persistence/RidePassView;", "()Lco/bird/android/model/persistence/RidePassView;", "<init>", "(Ljava/lang/CharSequence;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/RidePassView;)V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: FX4 */
/* loaded from: classes3.dex */
public final class FX4 {

    /* renamed from: a */
    public final CharSequence f9602a;

    /* renamed from: b */
    public final boolean f9603b;

    /* renamed from: c */
    public final String f9604c;

    /* renamed from: d */
    public final String f9605d;

    /* renamed from: e */
    public final String f9606e;

    /* renamed from: f */
    public final String f9607f;

    /* renamed from: g */
    public final RidePassView f9608g;

    public FX4(CharSequence title, boolean z, String str, String str2, String body, String str3, RidePassView ridePass) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(ridePass, "ridePass");
        this.f9602a = title;
        this.f9603b = z;
        this.f9604c = str;
        this.f9605d = str2;
        this.f9606e = body;
        this.f9607f = str3;
        this.f9608g = ridePass;
    }

    public static /* synthetic */ FX4 copy$default(FX4 fx4, CharSequence charSequence, boolean z, String str, String str2, String str3, String str4, RidePassView ridePassView, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = fx4.f9602a;
        }
        if ((i & 2) != 0) {
            z = fx4.f9603b;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str = fx4.f9604c;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = fx4.f9605d;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = fx4.f9606e;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = fx4.f9607f;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            ridePassView = fx4.f9608g;
        }
        return fx4.m107027a(charSequence, z2, str5, str6, str7, str8, ridePassView);
    }

    /* renamed from: a */
    public final FX4 m107027a(CharSequence title, boolean z, String str, String str2, String body, String str3, RidePassView ridePass) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(ridePass, "ridePass");
        return new FX4(title, z, str, str2, body, str3, ridePass);
    }

    /* renamed from: b */
    public final String m107026b() {
        return this.f9606e;
    }

    /* renamed from: c */
    public final String m107025c() {
        return this.f9605d;
    }

    /* renamed from: d */
    public final RidePassView m107024d() {
        return this.f9608g;
    }

    /* renamed from: e */
    public final String m107023e() {
        return this.f9604c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FX4) {
            FX4 fx4 = (FX4) obj;
            return Intrinsics.areEqual(this.f9602a, fx4.f9602a) && this.f9603b == fx4.f9603b && Intrinsics.areEqual(this.f9604c, fx4.f9604c) && Intrinsics.areEqual(this.f9605d, fx4.f9605d) && Intrinsics.areEqual(this.f9606e, fx4.f9606e) && Intrinsics.areEqual(this.f9607f, fx4.f9607f) && Intrinsics.areEqual(this.f9608g, fx4.f9608g);
        }
        return false;
    }

    /* renamed from: f */
    public final String m107022f() {
        return this.f9607f;
    }

    /* renamed from: g */
    public final CharSequence m107021g() {
        return this.f9602a;
    }

    /* renamed from: h */
    public final boolean m107020h() {
        return this.f9603b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f9602a.hashCode() * 31;
        boolean z = this.f9603b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.f9604c;
        int hashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9605d;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f9606e.hashCode()) * 31;
        String str3 = this.f9607f;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f9608g.hashCode();
    }

    public String toString() {
        CharSequence charSequence = this.f9602a;
        boolean z = this.f9603b;
        String str = this.f9604c;
        String str2 = this.f9605d;
        String str3 = this.f9606e;
        String str4 = this.f9607f;
        RidePassView ridePassView = this.f9608g;
        return "RidePassViewModel(title=" + ((Object) charSequence) + ", isSubscription=" + z + ", subscription=" + str + ", promoTag=" + str2 + ", body=" + str3 + ", subscriptionInfo=" + str4 + ", ridePass=" + ridePassView + ")";
    }
}
