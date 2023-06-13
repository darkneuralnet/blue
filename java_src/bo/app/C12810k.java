package bo.app;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"Lbo/app/k;", "Lbo/app/f2;", "", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "", "Lbo/app/u1;", "eventsList", "Ljava/util/Set;", "b", "()Ljava/util/Set;", "isEmpty", "Z", "e", "()Z", "<init>", "(Ljava/util/Set;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.k */
/* loaded from: classes.dex */
public final class C12810k implements InterfaceC12644f2 {

    /* renamed from: b */
    private final Set<InterfaceC13160u1> f58746b;

    /* renamed from: c */
    private final boolean f58747c;

    /* JADX WARN: Multi-variable type inference failed */
    public C12810k(Set<? extends InterfaceC13160u1> eventsList) {
        Intrinsics.checkNotNullParameter(eventsList, "eventsList");
        this.f58746b = eventsList;
        this.f58747c = eventsList.isEmpty();
    }

    /* renamed from: a */
    public final boolean m63468a() {
        boolean z;
        Set<InterfaceC13160u1> set = this.f58746b;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (InterfaceC13160u1 interfaceC13160u1 : set) {
            if (interfaceC13160u1.mo62897j() == EnumC12577d1.SESSION_START) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final Set<InterfaceC13160u1> m63467b() {
        return this.f58746b;
    }

    @Override // bo.app.InterfaceC12644f2
    /* renamed from: e */
    public boolean mo62845e() {
        return this.f58747c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12810k) && Intrinsics.areEqual(this.f58746b, ((C12810k) obj).f58746b);
    }

    public int hashCode() {
        return this.f58746b.hashCode();
    }

    public String toString() {
        return "BrazeEventContainer(eventsList=" + this.f58746b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
