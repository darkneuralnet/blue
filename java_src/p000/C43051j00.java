package p000;

import android.view.View;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"Lj00;", "LOZ;", "Landroid/view/View;", "bottomSheet", "", "newState", C17296a.f69688o, "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Landroid/view/View;", "b", "()Landroid/view/View;", "I", "c", "()I", "<init>", "(Landroid/view/View;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: j00  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43051j00 extends AbstractC6031OZ {

    /* renamed from: a */
    public final View f91994a;

    /* renamed from: b */
    public final int f91995b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43051j00(View bottomSheet, int i) {
        super(null);
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f91994a = bottomSheet;
        this.f91995b = i;
    }

    public static /* synthetic */ C43051j00 copy$default(C43051j00 c43051j00, View view, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            view = c43051j00.f91994a;
        }
        if ((i2 & 2) != 0) {
            i = c43051j00.f91995b;
        }
        return c43051j00.m31277a(view, i);
    }

    /* renamed from: a */
    public final C43051j00 m31277a(View bottomSheet, int i) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        return new C43051j00(bottomSheet, i);
    }

    /* renamed from: b */
    public final View m31276b() {
        return this.f91994a;
    }

    /* renamed from: c */
    public final int m31275c() {
        return this.f91995b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C43051j00) {
            C43051j00 c43051j00 = (C43051j00) obj;
            return Intrinsics.areEqual(this.f91994a, c43051j00.f91994a) && this.f91995b == c43051j00.f91995b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f91994a.hashCode() * 31) + Integer.hashCode(this.f91995b);
    }

    public String toString() {
        View view = this.f91994a;
        int i = this.f91995b;
        return "BottomSheetStateEvent(bottomSheet=" + view + ", newState=" + i + ")";
    }
}
