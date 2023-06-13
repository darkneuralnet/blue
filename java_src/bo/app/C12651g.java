package bo.app;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"Lbo/app/g;", "Lbo/app/n2;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "errorMessage", "Ljava/lang/String;", C17296a.f69688o, "()Ljava/lang/String;", "Lbo/app/z1;", "originalRequest", "Lbo/app/z1;", "b", "()Lbo/app/z1;", "<init>", "(Ljava/lang/String;Lbo/app/z1;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.g */
/* loaded from: classes.dex */
public final class C12651g implements InterfaceC12918n2 {

    /* renamed from: a */
    private final String f58471a;

    /* renamed from: b */
    private final InterfaceC13280z1 f58472b;

    public C12651g(String str, InterfaceC13280z1 originalRequest) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f58471a = str;
        this.f58472b = originalRequest;
    }

    @Override // bo.app.InterfaceC12918n2
    /* renamed from: a */
    public String mo62921a() {
        return this.f58471a;
    }

    /* renamed from: b */
    public InterfaceC13280z1 m63731b() {
        return this.f58472b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12651g) {
            C12651g c12651g = (C12651g) obj;
            return Intrinsics.areEqual(mo62921a(), c12651g.mo62921a()) && Intrinsics.areEqual(m63731b(), c12651g.m63731b());
        }
        return false;
    }

    public int hashCode() {
        return ((mo62921a() == null ? 0 : mo62921a().hashCode()) * 31) + m63731b().hashCode();
    }

    public String toString() {
        return "BasicResponseError(errorMessage=" + ((Object) mo62921a()) + ", originalRequest=" + m63731b() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
