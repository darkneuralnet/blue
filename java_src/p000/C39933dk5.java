package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.constant.ScanStatus;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001d"}, m28432d2 = {"Ldk5;", "", "", "title", "body", "Lco/bird/android/model/constant/ScanStatus;", "status", "Lco/bird/android/model/constant/ScanMode;", "mode", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "b", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "c", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/constant/ScanStatus;", "()Lco/bird/android/model/constant/ScanStatus;", "Lco/bird/android/model/constant/ScanMode;", "()Lco/bird/android/model/constant/ScanMode;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ScanStatus;Lco/bird/android/model/constant/ScanMode;)V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: dk5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39933dk5 extends Throwable {

    /* renamed from: b */
    public final String f77149b;

    /* renamed from: c */
    public final String f77150c;

    /* renamed from: d */
    public final ScanStatus f77151d;

    /* renamed from: e */
    public final ScanMode f77152e;

    public C39933dk5(String title, String body, ScanStatus scanStatus, ScanMode mode) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f77149b = title;
        this.f77150c = body;
        this.f77151d = scanStatus;
        this.f77152e = mode;
    }

    public static /* synthetic */ C39933dk5 copy$default(C39933dk5 c39933dk5, String str, String str2, ScanStatus scanStatus, ScanMode scanMode, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c39933dk5.f77149b;
        }
        if ((i & 2) != 0) {
            str2 = c39933dk5.f77150c;
        }
        if ((i & 4) != 0) {
            scanStatus = c39933dk5.f77151d;
        }
        if ((i & 8) != 0) {
            scanMode = c39933dk5.f77152e;
        }
        return c39933dk5.m43816a(str, str2, scanStatus, scanMode);
    }

    /* renamed from: a */
    public final C39933dk5 m43816a(String title, String body, ScanStatus scanStatus, ScanMode mode) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new C39933dk5(title, body, scanStatus, mode);
    }

    /* renamed from: b */
    public final String m43815b() {
        return this.f77150c;
    }

    /* renamed from: c */
    public final ScanMode m43814c() {
        return this.f77152e;
    }

    /* renamed from: d */
    public final ScanStatus m43813d() {
        return this.f77151d;
    }

    /* renamed from: e */
    public final String m43812e() {
        return this.f77149b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C39933dk5) {
            C39933dk5 c39933dk5 = (C39933dk5) obj;
            return Intrinsics.areEqual(this.f77149b, c39933dk5.f77149b) && Intrinsics.areEqual(this.f77150c, c39933dk5.f77150c) && this.f77151d == c39933dk5.f77151d && this.f77152e == c39933dk5.f77152e;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f77149b.hashCode() * 31) + this.f77150c.hashCode()) * 31;
        ScanStatus scanStatus = this.f77151d;
        return ((hashCode + (scanStatus == null ? 0 : scanStatus.hashCode())) * 31) + this.f77152e.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        String str = this.f77149b;
        String str2 = this.f77150c;
        ScanStatus scanStatus = this.f77151d;
        ScanMode scanMode = this.f77152e;
        return "ScanException(title=" + str + ", body=" + str2 + ", status=" + scanStatus + ", mode=" + scanMode + ")";
    }
}
