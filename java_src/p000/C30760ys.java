package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.Balance;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.configs.RideConfig;
import co.bird.api.response.ReloadConfigResponse;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0082\b\u0018\u0000 \"2\u00020\u0001:\u0001\u0003B-\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, m28432d2 = {"Lys;", "", "Lco/bird/android/model/Balance;", C17296a.f69688o, "Lco/bird/android/model/wire/configs/RideConfig;", "b", "", "c", "Lco/bird/android/buava/Optional;", "Lco/bird/api/response/ReloadConfigResponse;", DateTokenConverter.CONVERTER_KEY, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lco/bird/android/model/Balance;", "getBalance", "()Lco/bird/android/model/Balance;", "balance", "Lco/bird/android/model/wire/configs/RideConfig;", "getRideConfig", "()Lco/bird/android/model/wire/configs/RideConfig;", "rideConfig", "Z", "isAutoPayV2", "()Z", "Lco/bird/android/buava/Optional;", "getReloadConfig", "()Lco/bird/android/buava/Optional;", "reloadConfig", "<init>", "(Lco/bird/android/model/Balance;Lco/bird/android/model/wire/configs/RideConfig;ZLco/bird/android/buava/Optional;)V", "e", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ys */
/* loaded from: classes2.dex */
public final class C30760ys {

    /* renamed from: e */
    public static final C30761a f120346e = new C30761a(null);

    /* renamed from: a */
    public final Balance f120347a;

    /* renamed from: b */
    public final RideConfig f120348b;

    /* renamed from: c */
    public final boolean f120349c;

    /* renamed from: d */
    public final Optional<ReloadConfigResponse> f120350d;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¨\u0006\u000f"}, m28432d2 = {"Lys$a;", "", "Lco/bird/android/model/Balance;", "balance", "Lco/bird/android/model/wire/configs/RideConfig;", "rideConfig", "", "isAutoPayV2", "Lco/bird/android/buava/Optional;", "Lco/bird/api/response/ReloadConfigResponse;", "reloadConfig", "Lys;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ys$a */
    /* loaded from: classes2.dex */
    public static final class C30761a {
        public /* synthetic */ C30761a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C30760ys m2379a(Balance balance, RideConfig rideConfig, boolean z, Optional<ReloadConfigResponse> reloadConfig) {
            Intrinsics.checkNotNullParameter(balance, "balance");
            Intrinsics.checkNotNullParameter(rideConfig, "rideConfig");
            Intrinsics.checkNotNullParameter(reloadConfig, "reloadConfig");
            return new C30760ys(balance, rideConfig, z, reloadConfig);
        }

        private C30761a() {
        }
    }

    public C30760ys(Balance balance, RideConfig rideConfig, boolean z, Optional<ReloadConfigResponse> reloadConfig) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(rideConfig, "rideConfig");
        Intrinsics.checkNotNullParameter(reloadConfig, "reloadConfig");
        this.f120347a = balance;
        this.f120348b = rideConfig;
        this.f120349c = z;
        this.f120350d = reloadConfig;
    }

    /* renamed from: a */
    public final Balance m2383a() {
        return this.f120347a;
    }

    /* renamed from: b */
    public final RideConfig m2382b() {
        return this.f120348b;
    }

    /* renamed from: c */
    public final boolean m2381c() {
        return this.f120349c;
    }

    /* renamed from: d */
    public final Optional<ReloadConfigResponse> m2380d() {
        return this.f120350d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C30760ys) {
            C30760ys c30760ys = (C30760ys) obj;
            return Intrinsics.areEqual(this.f120347a, c30760ys.f120347a) && Intrinsics.areEqual(this.f120348b, c30760ys.f120348b) && this.f120349c == c30760ys.f120349c && Intrinsics.areEqual(this.f120350d, c30760ys.f120350d);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f120347a.hashCode() * 31) + this.f120348b.hashCode()) * 31;
        boolean z = this.f120349c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.f120350d.hashCode();
    }

    public String toString() {
        Balance balance = this.f120347a;
        RideConfig rideConfig = this.f120348b;
        boolean z = this.f120349c;
        Optional<ReloadConfigResponse> optional = this.f120350d;
        return "AutoReloadConfig(balance=" + balance + ", rideConfig=" + rideConfig + ", isAutoPayV2=" + z + ", reloadConfig=" + optional + ")";
    }
}
