package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0014"}, m28432d2 = {"Ll56;", "", "", "imageUrl", "toggleTitle", "accelerationLevel", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", DateTokenConverter.CONVERTER_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: l56  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C44293l56 {

    /* renamed from: a */
    public final String f95468a;

    /* renamed from: b */
    public final String f95469b;

    /* renamed from: c */
    public final String f95470c;

    public C44293l56(String imageUrl, String toggleTitle, String accelerationLevel) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(toggleTitle, "toggleTitle");
        Intrinsics.checkNotNullParameter(accelerationLevel, "accelerationLevel");
        this.f95468a = imageUrl;
        this.f95469b = toggleTitle;
        this.f95470c = accelerationLevel;
    }

    public static /* synthetic */ C44293l56 copy$default(C44293l56 c44293l56, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c44293l56.f95468a;
        }
        if ((i & 2) != 0) {
            str2 = c44293l56.f95469b;
        }
        if ((i & 4) != 0) {
            str3 = c44293l56.f95470c;
        }
        return c44293l56.m27877a(str, str2, str3);
    }

    /* renamed from: a */
    public final C44293l56 m27877a(String imageUrl, String toggleTitle, String accelerationLevel) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(toggleTitle, "toggleTitle");
        Intrinsics.checkNotNullParameter(accelerationLevel, "accelerationLevel");
        return new C44293l56(imageUrl, toggleTitle, accelerationLevel);
    }

    /* renamed from: b */
    public final String m27876b() {
        return this.f95470c;
    }

    /* renamed from: c */
    public final String m27875c() {
        return this.f95468a;
    }

    /* renamed from: d */
    public final String m27874d() {
        return this.f95469b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44293l56) {
            C44293l56 c44293l56 = (C44293l56) obj;
            return Intrinsics.areEqual(this.f95468a, c44293l56.f95468a) && Intrinsics.areEqual(this.f95469b, c44293l56.f95469b) && Intrinsics.areEqual(this.f95470c, c44293l56.f95470c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f95468a.hashCode() * 31) + this.f95469b.hashCode()) * 31) + this.f95470c.hashCode();
    }

    public String toString() {
        String str = this.f95468a;
        String str2 = this.f95469b;
        String str3 = this.f95470c;
        return "ToggleOption(imageUrl=" + str + ", toggleTitle=" + str2 + ", accelerationLevel=" + str3 + ")";
    }
}
