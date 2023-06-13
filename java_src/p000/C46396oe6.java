package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireSmartlock;
import com.facebook.share.internal.C17296a;
import com.polidea.rxandroidble2.exceptions.BleScanException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u001f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018¨\u0006\""}, m28432d2 = {"Loe6;", "", "Lco/bird/android/model/wire/WireSmartlock;", "lock", "", "throwable", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/wire/WireSmartlock;", "c", "()Lco/bird/android/model/wire/WireSmartlock;", "b", "Ljava/lang/Throwable;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Throwable;", "()Ljava/lang/Integer;", "bleScanReason", "f", "()Z", "isBluetoothDisabled", "h", "isLocationPermissionDenied", "g", "isLocationDisabled", "e", "isAppRegistrationFailed", "<init>", "(Lco/bird/android/model/wire/WireSmartlock;Ljava/lang/Throwable;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: oe6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C46396oe6 {

    /* renamed from: a */
    public final WireSmartlock f102270a;

    /* renamed from: b */
    public final Throwable f102271b;

    public C46396oe6(WireSmartlock lock, Throwable throwable) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f102270a = lock;
        this.f102271b = throwable;
    }

    public static /* synthetic */ C46396oe6 copy$default(C46396oe6 c46396oe6, WireSmartlock wireSmartlock, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            wireSmartlock = c46396oe6.f102270a;
        }
        if ((i & 2) != 0) {
            th = c46396oe6.f102271b;
        }
        return c46396oe6.m20710a(wireSmartlock, th);
    }

    /* renamed from: a */
    public final C46396oe6 m20710a(WireSmartlock lock, Throwable throwable) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return new C46396oe6(lock, throwable);
    }

    /* renamed from: b */
    public final Integer m20709b() {
        Throwable th = this.f102271b;
        BleScanException bleScanException = th instanceof BleScanException ? (BleScanException) th : null;
        if (bleScanException != null) {
            return Integer.valueOf(bleScanException.m45866b());
        }
        return null;
    }

    /* renamed from: c */
    public final WireSmartlock m20708c() {
        return this.f102270a;
    }

    /* renamed from: d */
    public final Throwable m20707d() {
        return this.f102271b;
    }

    /* renamed from: e */
    public final boolean m20706e() {
        Integer m20709b = m20709b();
        return m20709b != null && m20709b.intValue() == 6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C46396oe6) {
            C46396oe6 c46396oe6 = (C46396oe6) obj;
            return Intrinsics.areEqual(this.f102270a, c46396oe6.f102270a) && Intrinsics.areEqual(this.f102271b, c46396oe6.f102271b);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m20705f() {
        Integer m20709b = m20709b();
        return m20709b != null && m20709b.intValue() == 1;
    }

    /* renamed from: g */
    public final boolean m20704g() {
        Integer m20709b = m20709b();
        return m20709b != null && m20709b.intValue() == 4;
    }

    /* renamed from: h */
    public final boolean m20703h() {
        Integer m20709b = m20709b();
        return m20709b != null && m20709b.intValue() == 3;
    }

    public int hashCode() {
        return (this.f102270a.hashCode() * 31) + this.f102271b.hashCode();
    }

    public String toString() {
        WireSmartlock wireSmartlock = this.f102270a;
        Throwable th = this.f102271b;
        return "UnlockError(lock=" + wireSmartlock + ", throwable=" + th + ")";
    }
}
