package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.OperatorTaskBanner;
import co.bird.android.model.persistence.OperatorTaskGroup;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m28432d2 = {"Lz22;", "Luw3;", "Lco/bird/android/model/persistence/OperatorTaskBanner;", "banner", "", "Lco/bird/android/model/persistence/OperatorTaskGroup;", "taskGroups", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/persistence/OperatorTaskBanner;", "b", "()Lco/bird/android/model/persistence/OperatorTaskBanner;", "Ljava/util/List;", "c", "()Ljava/util/List;", "<init>", "(Lco/bird/android/model/persistence/OperatorTaskBanner;Ljava/util/List;)V", "task-list-v2_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: z22  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52559z22 extends AbstractC50130uw3 {

    /* renamed from: a */
    public final OperatorTaskBanner f120663a;

    /* renamed from: b */
    public final List<OperatorTaskGroup> f120664b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52559z22(OperatorTaskBanner operatorTaskBanner, List<OperatorTaskGroup> taskGroups) {
        super(null);
        Intrinsics.checkNotNullParameter(taskGroups, "taskGroups");
        this.f120663a = operatorTaskBanner;
        this.f120664b = taskGroups;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C52559z22 copy$default(C52559z22 c52559z22, OperatorTaskBanner operatorTaskBanner, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            operatorTaskBanner = c52559z22.f120663a;
        }
        if ((i & 2) != 0) {
            list = c52559z22.f120664b;
        }
        return c52559z22.m1935a(operatorTaskBanner, list);
    }

    /* renamed from: a */
    public final C52559z22 m1935a(OperatorTaskBanner operatorTaskBanner, List<OperatorTaskGroup> taskGroups) {
        Intrinsics.checkNotNullParameter(taskGroups, "taskGroups");
        return new C52559z22(operatorTaskBanner, taskGroups);
    }

    /* renamed from: b */
    public final OperatorTaskBanner m1934b() {
        return this.f120663a;
    }

    /* renamed from: c */
    public final List<OperatorTaskGroup> m1933c() {
        return this.f120664b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C52559z22) {
            C52559z22 c52559z22 = (C52559z22) obj;
            return Intrinsics.areEqual(this.f120663a, c52559z22.f120663a) && Intrinsics.areEqual(this.f120664b, c52559z22.f120664b);
        }
        return false;
    }

    public int hashCode() {
        OperatorTaskBanner operatorTaskBanner = this.f120663a;
        return ((operatorTaskBanner == null ? 0 : operatorTaskBanner.hashCode()) * 31) + this.f120664b.hashCode();
    }

    public String toString() {
        OperatorTaskBanner operatorTaskBanner = this.f120663a;
        List<OperatorTaskGroup> list = this.f120664b;
        return "Initialize(banner=" + operatorTaskBanner + ", taskGroups=" + list + ")";
    }
}
