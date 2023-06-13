package p000;

import android.view.View;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m28432d2 = {"Li00;", "LOZ;", "Landroid/view/View;", "bottomSheet", "", "slideOffset", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Landroid/view/View;", "getBottomSheet", "()Landroid/view/View;", "b", "F", "getSlideOffset", "()F", "<init>", "(Landroid/view/View;F)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: i00  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42458i00 extends AbstractC6031OZ {

    /* renamed from: a */
    public final View f86265a;

    /* renamed from: b */
    public final float f86266b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42458i00(View bottomSheet, float f) {
        super(null);
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f86265a = bottomSheet;
        this.f86266b = f;
    }

    public static /* synthetic */ C42458i00 copy$default(C42458i00 c42458i00, View view, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            view = c42458i00.f86265a;
        }
        if ((i & 2) != 0) {
            f = c42458i00.f86266b;
        }
        return c42458i00.m35406a(view, f);
    }

    /* renamed from: a */
    public final C42458i00 m35406a(View bottomSheet, float f) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        return new C42458i00(bottomSheet, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42458i00) {
            C42458i00 c42458i00 = (C42458i00) obj;
            return Intrinsics.areEqual(this.f86265a, c42458i00.f86265a) && Float.compare(this.f86266b, c42458i00.f86266b) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (this.f86265a.hashCode() * 31) + Float.hashCode(this.f86266b);
    }

    public String toString() {
        View view = this.f86265a;
        float f = this.f86266b;
        return "BottomSheetSlideEvent(bottomSheet=" + view + ", slideOffset=" + f + ")";
    }
}
