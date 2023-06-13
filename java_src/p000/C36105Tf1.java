package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LTf1;", "Lel3;", "", "throwable", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Throwable;", "b", "()Ljava/lang/Throwable;", "<init>", "(Ljava/lang/Throwable;)V", "filters_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Tf1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36105Tf1 implements InterfaceC40533el3 {

    /* renamed from: a */
    public final Throwable f35836a;

    public C36105Tf1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f35836a = throwable;
    }

    public static /* synthetic */ C36105Tf1 copy$default(C36105Tf1 c36105Tf1, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = c36105Tf1.f35836a;
        }
        return c36105Tf1.m83228a(th);
    }

    /* renamed from: a */
    public final C36105Tf1 m83228a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return new C36105Tf1(throwable);
    }

    /* renamed from: b */
    public final Throwable m83227b() {
        return this.f35836a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36105Tf1) && Intrinsics.areEqual(this.f35836a, ((C36105Tf1) obj).f35836a);
    }

    public int hashCode() {
        return this.f35836a.hashCode();
    }

    public String toString() {
        Throwable th = this.f35836a;
        return "Error(throwable=" + th + ")";
    }
}
