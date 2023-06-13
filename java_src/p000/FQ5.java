package p000;

import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.statusdialog.adapters.StatusViewHolderSupplier;
import co.bird.android.widget.adapter.ViewHolderSupplier;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.C45672nQ5;
import p000.S74;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010\r\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00158&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m28432d2 = {"LFQ5;", "", "Lco/bird/android/widget/adapter/ViewHolderSupplier;", "LeT0;", "viewHolderSupplier", "Lio/reactivex/Observable;", "LnQ5$b;", "ig", "", "LH6;", "sections", "", "b1", "g1", "LS74;", "sh", "Td", "Lco/bird/android/core/mvp/BaseActivity;", "getActivity", "()Lco/bird/android/core/mvp/BaseActivity;", "activity", "LnQ5;", "oc", "()LnQ5;", "x7", "(LnQ5;)V", "dialog", "status-dialog_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: FQ5 */
/* loaded from: classes4.dex */
public interface FQ5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FQ5$a */
    /* loaded from: classes4.dex */
    public static final class C2274a {
        /* renamed from: a */
        public static void m107151a(FQ5 fq5) {
            C45672nQ5 mo12605oc = fq5.mo12605oc();
            if (mo12605oc != null) {
                mo12605oc.dismiss();
            }
            fq5.mo12602x7(null);
        }

        /* renamed from: b */
        public static S74 m107150b(FQ5 fq5) {
            return fq5.mo12605oc();
        }

        /* renamed from: c */
        public static void m107149c(FQ5 fq5, List<C3023H6> sections) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            C45672nQ5 mo12605oc = fq5.mo12605oc();
            if (mo12605oc != null) {
                mo12605oc.m23791t8(sections);
            }
        }

        /* renamed from: d */
        public static void m107148d(FQ5 fq5, List<C3023H6> sections) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            C45672nQ5 mo12605oc = fq5.mo12605oc();
            if (mo12605oc != null) {
                mo12605oc.m23795A9(sections);
            }
        }

        /* renamed from: e */
        public static Observable<C45672nQ5.EnumC26504b> m107147e(FQ5 fq5, ViewHolderSupplier<AbstractC40357eT0> viewHolderSupplier) {
            Intrinsics.checkNotNullParameter(viewHolderSupplier, "viewHolderSupplier");
            C45672nQ5 mo12605oc = fq5.mo12605oc();
            if (mo12605oc == null) {
                mo12605oc = C45672nQ5.f99920f.m23790a(viewHolderSupplier);
            }
            if (!Intrinsics.areEqual(fq5.mo12605oc(), mo12605oc)) {
                mo12605oc.show(fq5.getActivity().getSupportFragmentManager(), "full_screen_status_dialog");
            }
            fq5.mo12602x7(mo12605oc);
            S74.C7343a.showProgress$default(mo12605oc, true, 0, 2, null);
            return mo12605oc.m23792a5();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Observable showStatusDialog$default(FQ5 fq5, ViewHolderSupplier viewHolderSupplier, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    viewHolderSupplier = new StatusViewHolderSupplier();
                }
                return fq5.mo12606ig(viewHolderSupplier);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showStatusDialog");
        }
    }

    /* renamed from: Td */
    void mo80452Td();

    /* renamed from: b1 */
    void mo12610b1(List<C3023H6> list);

    /* renamed from: g1 */
    void mo12607g1(List<C3023H6> list);

    BaseActivity getActivity();

    /* renamed from: ig */
    Observable<C45672nQ5.EnumC26504b> mo12606ig(ViewHolderSupplier<AbstractC40357eT0> viewHolderSupplier);

    /* renamed from: oc */
    C45672nQ5 mo12605oc();

    /* renamed from: sh */
    S74 mo107152sh();

    /* renamed from: x7 */
    void mo12602x7(C45672nQ5 c45672nQ5);
}
