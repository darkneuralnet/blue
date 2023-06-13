package p000;

import co.bird.android.widget.adapter.ViewHolderSupplier;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.C45672nQ5;
import p000.FQ5;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&JH\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H&J \u0010\u001d\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH&¨\u0006\u001e"}, m28432d2 = {"LA82;", "LaM5;", "Lh56;", "Ldl2;", "LS74;", "LFQ5;", "LH31;", "Lio/reactivex/Observable;", "", "l", "ee", "m0", "w2", "", "warehouseName", "name", "sku", "binSize", "", "binQuantity", "binCount", "excessInventoryQuantity", "", "binWeight", "U9", "newCount", "", "addEnabled", "subtractEnabled", "q7", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: A82 */
/* loaded from: classes3.dex */
public interface A82 extends InterfaceC37910aM5, InterfaceC41921h56, InterfaceC39940dl2, S74, FQ5, H31 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: A82$a */
    /* loaded from: classes3.dex */
    public static final class C0040a {
        /* renamed from: a */
        public static void m116069a(A82 a82, List<C3023H6> sections) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            FQ5.C2274a.m107149c(a82, sections);
        }

        /* renamed from: b */
        public static void m116068b(A82 a82, List<C3023H6> sections) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            FQ5.C2274a.m107148d(a82, sections);
        }

        /* renamed from: c */
        public static Observable<C45672nQ5.EnumC26504b> m116067c(A82 a82, ViewHolderSupplier<AbstractC40357eT0> viewHolderSupplier) {
            Intrinsics.checkNotNullParameter(viewHolderSupplier, "viewHolderSupplier");
            return FQ5.C2274a.m107147e(a82, viewHolderSupplier);
        }
    }

    /* renamed from: U9 */
    void mo114334U9(String str, String str2, String str3, String str4, int i, int i2, int i3, float f);

    /* renamed from: ee */
    Observable<Unit> mo114333ee();

    /* renamed from: l */
    Observable<Unit> mo114332l();

    /* renamed from: m0 */
    Observable<Unit> mo114331m0();

    /* renamed from: q7 */
    void mo114330q7(int i, boolean z, boolean z2);

    /* renamed from: w2 */
    Observable<Unit> mo114329w2();
}
