package p000;

import co.bird.android.model.wire.WireBird;
import co.bird.android.widget.adapter.ViewHolderSupplier;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.C45672nQ5;
import p000.FQ5;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0006"}, m28432d2 = {"Lbv5;", "LlE;", "LFQ5;", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireBird;", "j0", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bv5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC38839bv5 extends InterfaceC25660lE, FQ5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bv5$a */
    /* loaded from: classes3.dex */
    public static final class C13341a {
        /* renamed from: a */
        public static void m62133a(InterfaceC38839bv5 interfaceC38839bv5, List<C3023H6> sections) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            FQ5.C2274a.m107149c(interfaceC38839bv5, sections);
        }

        /* renamed from: b */
        public static void m62132b(InterfaceC38839bv5 interfaceC38839bv5, List<C3023H6> sections) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            FQ5.C2274a.m107148d(interfaceC38839bv5, sections);
        }

        /* renamed from: c */
        public static Observable<C45672nQ5.EnumC26504b> m62131c(InterfaceC38839bv5 interfaceC38839bv5, ViewHolderSupplier<AbstractC40357eT0> viewHolderSupplier) {
            Intrinsics.checkNotNullParameter(viewHolderSupplier, "viewHolderSupplier");
            return FQ5.C2274a.m107147e(interfaceC38839bv5, viewHolderSupplier);
        }
    }

    /* renamed from: j0 */
    Observable<WireBird> mo44815j0();
}
