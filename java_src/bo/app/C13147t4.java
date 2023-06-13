package bo.app;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u001a"}, m28432d2 = {"Lbo/app/t4;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lbo/app/z1;", "originalRequest", "Lbo/app/z1;", "b", "()Lbo/app/z1;", "sdkAuthErrorCode", "I", "c", "()I", "sdkAuthErrorReason", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "errorMessage", C17296a.f69688o, "<init>", "(Lbo/app/z1;ILjava/lang/String;Ljava/lang/String;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.t4 */
/* loaded from: classes.dex */
public final class C13147t4 implements InterfaceC12918n2 {

    /* renamed from: a */
    private final InterfaceC13280z1 f59330a;

    /* renamed from: b */
    private final int f59331b;

    /* renamed from: c */
    private final String f59332c;

    /* renamed from: d */
    private final String f59333d;

    public C13147t4(InterfaceC13280z1 originalRequest, int i, String str, String str2) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f59330a = originalRequest;
        this.f59331b = i;
        this.f59332c = str;
        this.f59333d = str2;
    }

    @Override // bo.app.InterfaceC12918n2
    /* renamed from: a */
    public String mo62921a() {
        return this.f59333d;
    }

    /* renamed from: b */
    public InterfaceC13280z1 m62920b() {
        return this.f59330a;
    }

    /* renamed from: c */
    public int m62919c() {
        return this.f59331b;
    }

    /* renamed from: d */
    public String m62918d() {
        return this.f59332c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13147t4) {
            C13147t4 c13147t4 = (C13147t4) obj;
            return Intrinsics.areEqual(m62920b(), c13147t4.m62920b()) && m62919c() == c13147t4.m62919c() && Intrinsics.areEqual(m62918d(), c13147t4.m62918d()) && Intrinsics.areEqual(mo62921a(), c13147t4.mo62921a());
        }
        return false;
    }

    public int hashCode() {
        return (((((m62920b().hashCode() * 31) + Integer.hashCode(m62919c())) * 31) + (m62918d() == null ? 0 : m62918d().hashCode())) * 31) + (mo62921a() != null ? mo62921a().hashCode() : 0);
    }

    public String toString() {
        return "{code = " + m62919c() + ", reason = " + ((Object) m62918d()) + ", message = " + ((Object) mo62921a()) + CoreConstants.CURLY_RIGHT;
    }
}
