package p000;

import co.bird.android.model.wire.WireBird;
import co.bird.android.widget.adapter.ViewHolderSupplier;
import io.reactivex.AbstractC24490k;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.C45672nQ5;
import p000.FQ5;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u0016\u0010\u0010\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&J\b\u0010\u0013\u001a\u00020\u0007H&¨\u0006\u0014"}, m28432d2 = {"LzB4;", "LaM5;", "LH31;", "LS74;", "LLo6;", "LFQ5;", "Lio/reactivex/k;", "", "F1", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireBird;", "j0", "", "LH6;", "Yj", "sections", "Qb", "", "b5", "G5", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: zB4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC52650zB4 extends InterfaceC37910aM5, H31, S74, InterfaceC34319Lo6, FQ5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zB4$a */
    /* loaded from: classes3.dex */
    public static final class C30926a {
        /* renamed from: a */
        public static S74 m1695a(InterfaceC52650zB4 interfaceC52650zB4) {
            return FQ5.C2274a.m107150b(interfaceC52650zB4);
        }

        /* renamed from: b */
        public static void m1694b(InterfaceC52650zB4 interfaceC52650zB4, List<C3023H6> sections) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            FQ5.C2274a.m107149c(interfaceC52650zB4, sections);
        }

        /* renamed from: c */
        public static void m1693c(InterfaceC52650zB4 interfaceC52650zB4, List<C3023H6> sections) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            FQ5.C2274a.m107148d(interfaceC52650zB4, sections);
        }

        /* renamed from: d */
        public static Observable<C45672nQ5.EnumC26504b> m1692d(InterfaceC52650zB4 interfaceC52650zB4, ViewHolderSupplier<AbstractC40357eT0> viewHolderSupplier) {
            Intrinsics.checkNotNullParameter(viewHolderSupplier, "viewHolderSupplier");
            return FQ5.C2274a.m107147e(interfaceC52650zB4, viewHolderSupplier);
        }
    }

    /* renamed from: F1 */
    AbstractC24490k<Unit> mo1701F1();

    /* renamed from: G5 */
    void mo1700G5();

    /* renamed from: Qb */
    void mo1699Qb(List<C3023H6> list);

    /* renamed from: Yj */
    List<C3023H6> mo1698Yj();

    /* renamed from: b5 */
    String mo1697b5();

    /* renamed from: j0 */
    Observable<WireBird> mo1696j0();
}
