package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, m28432d2 = {"LvE1;", "", "", "agreementId", "userGuestId", "email", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "c", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vE1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50302vE1 {

    /* renamed from: a */
    public final String f113712a;

    /* renamed from: b */
    public final String f113713b;

    /* renamed from: c */
    public final String f113714c;

    public C50302vE1(String agreementId, String userGuestId, String email) {
        Intrinsics.checkNotNullParameter(agreementId, "agreementId");
        Intrinsics.checkNotNullParameter(userGuestId, "userGuestId");
        Intrinsics.checkNotNullParameter(email, "email");
        this.f113712a = agreementId;
        this.f113713b = userGuestId;
        this.f113714c = email;
    }

    public static /* synthetic */ C50302vE1 copy$default(C50302vE1 c50302vE1, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c50302vE1.f113712a;
        }
        if ((i & 2) != 0) {
            str2 = c50302vE1.f113713b;
        }
        if ((i & 4) != 0) {
            str3 = c50302vE1.f113714c;
        }
        return c50302vE1.m9000a(str, str2, str3);
    }

    /* renamed from: a */
    public final C50302vE1 m9000a(String agreementId, String userGuestId, String email) {
        Intrinsics.checkNotNullParameter(agreementId, "agreementId");
        Intrinsics.checkNotNullParameter(userGuestId, "userGuestId");
        Intrinsics.checkNotNullParameter(email, "email");
        return new C50302vE1(agreementId, userGuestId, email);
    }

    /* renamed from: b */
    public final String m8999b() {
        return this.f113712a;
    }

    /* renamed from: c */
    public final String m8998c() {
        return this.f113714c;
    }

    /* renamed from: d */
    public final String m8997d() {
        return this.f113713b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C50302vE1) {
            C50302vE1 c50302vE1 = (C50302vE1) obj;
            return Intrinsics.areEqual(this.f113712a, c50302vE1.f113712a) && Intrinsics.areEqual(this.f113713b, c50302vE1.f113713b) && Intrinsics.areEqual(this.f113714c, c50302vE1.f113714c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f113712a.hashCode() * 31) + this.f113713b.hashCode()) * 31) + this.f113714c.hashCode();
    }

    public String toString() {
        String str = this.f113712a;
        String str2 = this.f113713b;
        String str3 = this.f113714c;
        return "GuestAgreeRequest(agreementId=" + str + ", userGuestId=" + str2 + ", email=" + str3 + ")";
    }
}
