package p000;

import co.bird.android.widget.adapter.ViewHolderSupplier;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.C45672nQ5;
import p000.FQ5;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0006"}, m28432d2 = {"LsC4;", "LKD;", "LFQ5;", "Lio/reactivex/Observable;", "", "c9", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: sC4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC48509sC4 extends InterfaceC4380KD, FQ5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: sC4$a */
    /* loaded from: classes3.dex */
    public static final class C28234a {
        /* renamed from: a */
        public static void m14566a(InterfaceC48509sC4 interfaceC48509sC4, List<C3023H6> sections) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            FQ5.C2274a.m107149c(interfaceC48509sC4, sections);
        }

        /* renamed from: b */
        public static void m14565b(InterfaceC48509sC4 interfaceC48509sC4, List<C3023H6> sections) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            FQ5.C2274a.m107148d(interfaceC48509sC4, sections);
        }

        /* renamed from: c */
        public static Observable<C45672nQ5.EnumC26504b> m14564c(InterfaceC48509sC4 interfaceC48509sC4, ViewHolderSupplier<AbstractC40357eT0> viewHolderSupplier) {
            Intrinsics.checkNotNullParameter(viewHolderSupplier, "viewHolderSupplier");
            return FQ5.C2274a.m107147e(interfaceC48509sC4, viewHolderSupplier);
        }
    }

    /* renamed from: c9 */
    Observable<Unit> mo12608c9();
}
