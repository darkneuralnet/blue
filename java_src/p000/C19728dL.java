package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.Bird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 JE\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006!"}, m28432d2 = {"LdL;", "", "Lco/bird/android/model/persistence/Bird;", "bird", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "battery", "status", "color", "", "solidLabel", C17296a.f69688o, "toString", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lco/bird/android/model/persistence/Bird;", "c", "()Lco/bird/android/model/persistence/Bird;", "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "I", "()I", "g", "e", "f", "Z", "()Z", "<init>", "(Lco/bird/android/model/persistence/Bird;Ljava/lang/String;ILjava/lang/String;IZ)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: dL */
/* loaded from: classes3.dex */
public final class C19728dL {

    /* renamed from: a */
    public final Bird f76450a;

    /* renamed from: b */
    public final String f76451b;

    /* renamed from: c */
    public final int f76452c;

    /* renamed from: d */
    public final String f76453d;

    /* renamed from: e */
    public final int f76454e;

    /* renamed from: f */
    public final boolean f76455f;

    public C19728dL(Bird bird, String code, int i, String status, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f76450a = bird;
        this.f76451b = code;
        this.f76452c = i;
        this.f76453d = status;
        this.f76454e = i2;
        this.f76455f = z;
    }

    public static /* synthetic */ C19728dL copy$default(C19728dL c19728dL, Bird bird, String str, int i, String str2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            bird = c19728dL.f76450a;
        }
        if ((i3 & 2) != 0) {
            str = c19728dL.f76451b;
        }
        String str3 = str;
        if ((i3 & 4) != 0) {
            i = c19728dL.f76452c;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            str2 = c19728dL.f76453d;
        }
        String str4 = str2;
        if ((i3 & 16) != 0) {
            i2 = c19728dL.f76454e;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            z = c19728dL.f76455f;
        }
        return c19728dL.m44397a(bird, str3, i4, str4, i5, z);
    }

    /* renamed from: a */
    public final C19728dL m44397a(Bird bird, String code, int i, String status, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(status, "status");
        return new C19728dL(bird, code, i, status, i2, z);
    }

    /* renamed from: b */
    public final int m44396b() {
        return this.f76452c;
    }

    /* renamed from: c */
    public final Bird m44395c() {
        return this.f76450a;
    }

    /* renamed from: d */
    public final String m44394d() {
        return this.f76451b;
    }

    /* renamed from: e */
    public final int m44393e() {
        return this.f76454e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C19728dL) {
            C19728dL c19728dL = (C19728dL) obj;
            return Intrinsics.areEqual(this.f76450a, c19728dL.f76450a) && Intrinsics.areEqual(this.f76451b, c19728dL.f76451b) && this.f76452c == c19728dL.f76452c && Intrinsics.areEqual(this.f76453d, c19728dL.f76453d) && this.f76454e == c19728dL.f76454e && this.f76455f == c19728dL.f76455f;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m44392f() {
        return this.f76455f;
    }

    /* renamed from: g */
    public final String m44391g() {
        return this.f76453d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.f76450a.hashCode() * 31) + this.f76451b.hashCode()) * 31) + Integer.hashCode(this.f76452c)) * 31) + this.f76453d.hashCode()) * 31) + Integer.hashCode(this.f76454e)) * 31;
        boolean z = this.f76455f;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        Bird bird = this.f76450a;
        String str = this.f76451b;
        int i = this.f76452c;
        String str2 = this.f76453d;
        int i2 = this.f76454e;
        boolean z = this.f76455f;
        return "BirdDetailViewModel(bird=" + bird + ", code=" + str + ", battery=" + i + ", status=" + str2 + ", color=" + i2 + ", solidLabel=" + z + ")";
    }

    public /* synthetic */ C19728dL(Bird bird, String str, int i, String str2, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(bird, str, i, str2, i2, (i3 & 32) != 0 ? false : z);
    }
}
