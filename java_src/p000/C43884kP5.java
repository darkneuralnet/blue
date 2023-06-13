package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LkP5;", "Lm66;", "Lk66;", "trackedBird", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lk66;", "b", "()Lk66;", "<init>", "(Lk66;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: kP5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C43884kP5 extends AbstractC44896m66 {

    /* renamed from: a */
    public final C43710k66 f94353a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43884kP5(C43710k66 trackedBird) {
        super(null);
        Intrinsics.checkNotNullParameter(trackedBird, "trackedBird");
        this.f94353a = trackedBird;
    }

    public static /* synthetic */ C43884kP5 copy$default(C43884kP5 c43884kP5, C43710k66 c43710k66, int i, Object obj) {
        if ((i & 1) != 0) {
            c43710k66 = c43884kP5.f94353a;
        }
        return c43884kP5.m29016a(c43710k66);
    }

    /* renamed from: a */
    public final C43884kP5 m29016a(C43710k66 trackedBird) {
        Intrinsics.checkNotNullParameter(trackedBird, "trackedBird");
        return new C43884kP5(trackedBird);
    }

    /* renamed from: b */
    public final C43710k66 m29015b() {
        return this.f94353a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C43884kP5) && Intrinsics.areEqual(this.f94353a, ((C43884kP5) obj).f94353a);
    }

    public int hashCode() {
        return this.f94353a.hashCode();
    }

    public String toString() {
        C43710k66 c43710k66 = this.f94353a;
        return "StartTrackingOperation(trackedBird=" + c43710k66 + ")";
    }
}
