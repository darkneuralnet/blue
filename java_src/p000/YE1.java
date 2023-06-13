package p000;

import co.bird.android.model.LegacyRepairType;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010B\u001f\b\u0016\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u000f\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m28432d2 = {"LYE1;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lkx2;", C17296a.f69688o, "Lkx2;", "getLog", "()Lkx2;", "log", "<init>", "(Lkx2;)V", "", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transactions", "LGE0;", "creator", "(Ljava/util/List;LGE0;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: YE1 */
/* loaded from: classes5.dex */
public final class YE1 {
    @InterfaceC41208ft5("log")

    /* renamed from: a */
    public final C44210kx2 f44857a;

    public YE1(C44210kx2 log) {
        Intrinsics.checkNotNullParameter(log, "log");
        this.f44857a = log;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof YE1) && Intrinsics.areEqual(this.f44857a, ((YE1) obj).f44857a);
    }

    public int hashCode() {
        return this.f44857a.hashCode();
    }

    public String toString() {
        C44210kx2 c44210kx2 = this.f44857a;
        return "Har(log=" + c44210kx2 + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YE1(List<HttpTransaction> transactions, GE0 creator) {
        this(new C44210kx2(transactions, creator));
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(creator, "creator");
    }
}
