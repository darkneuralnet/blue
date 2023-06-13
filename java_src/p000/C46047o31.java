package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u0015"}, m28432d2 = {"Lo31;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "title", "b", "message", "c", "positiveButtonText", "negativeButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: o31  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46047o31 {

    /* renamed from: a */
    public final String f101261a;

    /* renamed from: b */
    public final String f101262b;

    /* renamed from: c */
    public final String f101263c;

    /* renamed from: d */
    public final String f101264d;

    public C46047o31(String title, String message, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f101261a = title;
        this.f101262b = message;
        this.f101263c = str;
        this.f101264d = str2;
    }

    /* renamed from: a */
    public final String m21927a() {
        return this.f101262b;
    }

    /* renamed from: b */
    public final String m21926b() {
        return this.f101264d;
    }

    /* renamed from: c */
    public final String m21925c() {
        return this.f101263c;
    }

    /* renamed from: d */
    public final String m21924d() {
        return this.f101261a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C46047o31) {
            C46047o31 c46047o31 = (C46047o31) obj;
            return Intrinsics.areEqual(this.f101261a, c46047o31.f101261a) && Intrinsics.areEqual(this.f101262b, c46047o31.f101262b) && Intrinsics.areEqual(this.f101263c, c46047o31.f101263c) && Intrinsics.areEqual(this.f101264d, c46047o31.f101264d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f101261a.hashCode() * 31) + this.f101262b.hashCode()) * 31;
        String str = this.f101263c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f101264d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f101261a;
        String str2 = this.f101262b;
        String str3 = this.f101263c;
        String str4 = this.f101264d;
        return "DialogData(title=" + str + ", message=" + str2 + ", positiveButtonText=" + str3 + ", negativeButtonText=" + str4 + ")";
    }
}
