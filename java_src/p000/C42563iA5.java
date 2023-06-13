package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"LiA5;", "Luw3;", "", "birdId", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "task-list-v2_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: iA5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42563iA5 extends AbstractC50130uw3 {

    /* renamed from: a */
    public final String f86829a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42563iA5(String birdId) {
        super(null);
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.f86829a = birdId;
    }

    public static /* synthetic */ C42563iA5 copy$default(C42563iA5 c42563iA5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c42563iA5.f86829a;
        }
        return c42563iA5.m34382a(str);
    }

    /* renamed from: a */
    public final C42563iA5 m34382a(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return new C42563iA5(birdId);
    }

    /* renamed from: b */
    public final String m34381b() {
        return this.f86829a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C42563iA5) && Intrinsics.areEqual(this.f86829a, ((C42563iA5) obj).f86829a);
    }

    public int hashCode() {
        return this.f86829a.hashCode();
    }

    public String toString() {
        String str = this.f86829a;
        return "ShowFlightSheet(birdId=" + str + ")";
    }
}
