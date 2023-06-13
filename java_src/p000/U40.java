package p000;

import co.bird.android.widget.adapter.ViewHolderSupplier;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.C45672nQ5;
import p000.FQ5;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m28432d2 = {"LU40;", "LH60;", "LFQ5;", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: U40 */
/* loaded from: classes3.dex */
public interface U40 extends H60, FQ5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: U40$a */
    /* loaded from: classes3.dex */
    public static final class C8188a {
        /* renamed from: a */
        public static void m82018a(U40 u40) {
            FQ5.C2274a.m107151a(u40);
        }

        /* renamed from: b */
        public static void m82017b(U40 u40, List<C3023H6> sections) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            FQ5.C2274a.m107149c(u40, sections);
        }

        /* renamed from: c */
        public static Observable<C45672nQ5.EnumC26504b> m82016c(U40 u40, ViewHolderSupplier<AbstractC40357eT0> viewHolderSupplier) {
            Intrinsics.checkNotNullParameter(viewHolderSupplier, "viewHolderSupplier");
            return FQ5.C2274a.m107147e(u40, viewHolderSupplier);
        }
    }
}
