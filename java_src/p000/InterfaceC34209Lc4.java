package p000;

import co.bird.android.widget.adapter.ViewHolderSupplier;
import io.reactivex.AbstractC24490k;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.C45672nQ5;
import p000.FQ5;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H&J\u0016\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\fH&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\fH&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\fH&¨\u0006\u0011"}, m28432d2 = {"LLc4;", "LaM5;", "LS74;", "LFQ5;", "", "titleRes", "", "Y", "", "LH6;", "sections", "b", "Lio/reactivex/k;", "i1", "p2", "Og", "a8", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Lc4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC34209Lc4 extends InterfaceC37910aM5, S74, FQ5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Lc4$a */
    /* loaded from: classes4.dex */
    public static final class C5036a {
        /* renamed from: a */
        public static void m96586a(InterfaceC34209Lc4 interfaceC34209Lc4, List<C3023H6> sections) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            FQ5.C2274a.m107149c(interfaceC34209Lc4, sections);
        }

        /* renamed from: b */
        public static void m96585b(InterfaceC34209Lc4 interfaceC34209Lc4, List<C3023H6> sections) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            FQ5.C2274a.m107148d(interfaceC34209Lc4, sections);
        }

        /* renamed from: c */
        public static Observable<C45672nQ5.EnumC26504b> m96584c(InterfaceC34209Lc4 interfaceC34209Lc4, ViewHolderSupplier<AbstractC40357eT0> viewHolderSupplier) {
            Intrinsics.checkNotNullParameter(viewHolderSupplier, "viewHolderSupplier");
            return FQ5.C2274a.m107147e(interfaceC34209Lc4, viewHolderSupplier);
        }
    }

    /* renamed from: Og */
    AbstractC24490k<Unit> mo95130Og();

    /* renamed from: Y */
    void mo95129Y(int i);

    /* renamed from: a8 */
    AbstractC24490k<Unit> mo95128a8();

    /* renamed from: b */
    void mo95127b(List<C3023H6> list);

    /* renamed from: i1 */
    AbstractC24490k<Unit> mo95126i1();

    /* renamed from: p2 */
    AbstractC24490k<Unit> mo95125p2();
}
