package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"Lra1;", "", "", "email", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "auth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ra1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48130ra1 {
    @JsonProperty("email")
    @InterfaceC41208ft5("email")
    private final String email;

    public C48130ra1() {
        this(null, 1, null);
    }

    public static /* synthetic */ C48130ra1 copy$default(C48130ra1 c48130ra1, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c48130ra1.email;
        }
        return c48130ra1.m15752a(str);
    }

    /* renamed from: a */
    public final C48130ra1 m15752a(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        return new C48130ra1(email);
    }

    /* renamed from: b */
    public final String m15751b() {
        return this.email;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C48130ra1) && Intrinsics.areEqual(this.email, ((C48130ra1) obj).email);
    }

    public int hashCode() {
        return this.email.hashCode();
    }

    public String toString() {
        String str = this.email;
        return "EmailMagicLinkRequest(email=" + str + ")";
    }

    public C48130ra1(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.email = email;
    }

    public /* synthetic */ C48130ra1(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
