package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LWf1;", "LiN5;", "", "e", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Throwable;", "getE", "()Ljava/lang/Throwable;", "<init>", "(Ljava/lang/Throwable;)V", "sober_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Wf1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36807Wf1 extends AbstractC42680iN5 {

    /* renamed from: a */
    public final Throwable f41481a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36807Wf1(Throwable e) {
        super(null);
        Intrinsics.checkNotNullParameter(e, "e");
        this.f41481a = e;
    }

    public static /* synthetic */ C36807Wf1 copy$default(C36807Wf1 c36807Wf1, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = c36807Wf1.f41481a;
        }
        return c36807Wf1.m78028a(th);
    }

    /* renamed from: a */
    public final C36807Wf1 m78028a(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return new C36807Wf1(e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36807Wf1) && Intrinsics.areEqual(this.f41481a, ((C36807Wf1) obj).f41481a);
    }

    public int hashCode() {
        return this.f41481a.hashCode();
    }

    public String toString() {
        Throwable th = this.f41481a;
        return "Error(e=" + th + ")";
    }
}
