package p000;

import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.C11925l;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireSuccessfulScannedItem;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010&\u001a\u00020%\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b'\u0010(J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0014\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0010\u0010\u000b\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006)"}, m28432d2 = {"LTC5;", "LxE;", "Lio/reactivex/Observable;", "", "Ql", "", "LH6;", "sections", "", "b", "skuDisplayName", "Tl", "", "unidentifiedScanCount", "Ul", "Sl", "Lf6;", "Lf6;", "binding", "", "c", "Z", "outbound", DateTokenConverter.CONVERTER_KEY, "viewUnidentified", "LI92;", "e", "LI92;", "adapter", "LmX5;", "f", "LmX5;", "swipeToRemoveHelper", "Landroidx/recyclerview/widget/l;", "g", "Landroidx/recyclerview/widget/l;", "itemTouchHelper", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lf6;Lco/bird/android/core/mvp/BaseActivity;ZZ)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: TC5 */
/* loaded from: classes3.dex */
public final class TC5 extends AbstractC30071xE {

    /* renamed from: b */
    public final C20209f6 f34906b;

    /* renamed from: c */
    public final boolean f34907c;

    /* renamed from: d */
    public final boolean f34908d;

    /* renamed from: e */
    public final I92 f34909e;

    /* renamed from: f */
    public final C45142mX5 f34910f;

    /* renamed from: g */
    public final C11925l f34911g;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "position", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSkuScannedDetailsUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuScannedDetailsUi.kt\nco/bird/android/feature/transferorder/sku/scanner/details/SkuScannedDetailsUi$onItemSwiped$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,71:1\n18#2:72\n9#3,4:73\n*S KotlinDebug\n*F\n+ 1 SkuScannedDetailsUi.kt\nco/bird/android/feature/transferorder/sku/scanner/details/SkuScannedDetailsUi$onItemSwiped$1\n*L\n45#1:72\n45#1:73,4\n*E\n"})
    /* renamed from: TC5$a */
    /* loaded from: classes3.dex */
    public static final class C7680a extends Lambda implements Function1<Integer, String> {
        public C7680a() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
            if (r3 != null) goto L12;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String invoke(Integer position) {
            String str;
            Object firstOrNull;
            Intrinsics.checkNotNullParameter(position, "position");
            Object m105816c = TC5.this.f34909e.m94544p(position.intValue()).m105816c();
            if (!(m105816c instanceof G92)) {
                m105816c = null;
            }
            G92 g92 = (G92) m105816c;
            if (g92 == null) {
                return null;
            }
            Collection m105692c = g92.m105692c();
            if (m105692c != null) {
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull(m105692c);
                WireSuccessfulScannedItem wireSuccessfulScannedItem = (WireSuccessfulScannedItem) firstOrNull;
                if (wireSuccessfulScannedItem != null) {
                    str = wireSuccessfulScannedItem.getId();
                }
            }
            str = "";
            return str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TC5(C20209f6 binding, BaseActivity activity, boolean z, boolean z2) {
        super(activity);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f34906b = binding;
        this.f34907c = z;
        this.f34908d = z2;
        I92 i92 = new I92();
        this.f34909e = i92;
        C45142mX5 c45142mX5 = new C45142mX5(activity, 0, null, null, 14, null);
        this.f34910f = c45142mX5;
        C11925l c11925l = new C11925l(c45142mX5);
        this.f34911g = c11925l;
        binding.f79432c.setAdapter(i92);
        binding.f79436g.setText(getString(C45871nl4.sku_scanned_details_unidentified_scan_troubleshoot_tips, new Object[0]));
        if (!z2 && z) {
            c11925l.m66204g(binding.f79432c);
        }
    }

    /* renamed from: Rl */
    public static final String m84215Rl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: Ql */
    public final Observable<String> m84216Ql() {
        Observable<Integer> m25451b = this.f34910f.m25451b();
        final C7680a c7680a = new C7680a();
        Observable map = m25451b.map(new InterfaceC23492o() { // from class: SC5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m84215Rl;
                m84215Rl = TC5.m84215Rl(Function1.this, obj);
                return m84215Rl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "fun onItemSwiped(): Obse… \"\"\n        }\n      }\n  }");
        return map;
    }

    /* renamed from: Sl */
    public final Observable<String> m84214Sl() {
        return this.f34909e.m102851v();
    }

    /* renamed from: Tl */
    public final void m84213Tl(String str) {
        getActivity().setTitle(str);
        TextView textView = this.f34906b.f79433d;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.scanCount");
        C49520tu6.show$default(textView, false, 0, 2, null);
        Group group = this.f34906b.f79435f;
        Intrinsics.checkNotNullExpressionValue(group, "binding.troubleshootingGroup");
        C49520tu6.show$default(group, false, 0, 2, null);
    }

    /* renamed from: Ul */
    public final void m84212Ul(int i) {
        getActivity().setTitle(getString(C45871nl4.hard_count_unidentifiable_scans, new Object[0]));
        TextView textView = this.f34906b.f79433d;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.scanCount");
        C49520tu6.m11233r(textView);
        Group group = this.f34906b.f79435f;
        Intrinsics.checkNotNullExpressionValue(group, "binding.troubleshootingGroup");
        C49520tu6.m11233r(group);
        this.f34906b.f79433d.setText(getActivity().getResources().getQuantityString(C37089Xk4.inventory_scanning_unidentified_scans, i, Integer.valueOf(i)));
        this.f34906b.f79433d.setTextColor(getColor(C32364Df4.birdRed));
    }

    /* renamed from: b */
    public final void m84211b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f34909e.mo24871u(sections);
    }
}
