package p000;

import android.view.KeyEvent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.RepairType;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0016J\u001a\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0003H\u0016J\u001a\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b0\u0003H\u0016J\u0016\u0010\u0010\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006 "}, m28432d2 = {"LWC4;", "LxE;", "LSC4;", "Lio/reactivex/Observable;", "", "l", "", "I1", "Lkotlin/Pair;", "Lco/bird/android/model/RepairType;", "", "T9", "pl", "", "LH6;", "sections", "b", "Zi", "", "count", "A8", "Li5;", "Li5;", "binding", "LyC4;", "c", "LyC4;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Li5;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: WC4 */
/* loaded from: classes3.dex */
public final class WC4 extends AbstractC30071xE implements SC4 {

    /* renamed from: b */
    public final C23123i5 f40565b;

    /* renamed from: c */
    public final C52066yC4 f40566c;

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"WC4$a", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: WC4$a */
    /* loaded from: classes3.dex */
    public static final class C8954a extends RecyclerView.AbstractC11863t {
        public C8954a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11863t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (i == 1) {
                WC4 wc4 = WC4.this;
                EditText editText = wc4.f40565b.f86708f;
                Intrinsics.checkNotNullExpressionValue(editText, "binding.search");
                wc4.hideKeyboard(editText);
            }
            super.onScrollStateChanged(recyclerView, i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WC4$b */
    /* loaded from: classes3.dex */
    public static final class C8955b extends Lambda implements Function1<CharSequence, String> {

        /* renamed from: g */
        public static final C8955b f40568g = new C8955b();

        public C8955b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WC4(BaseActivity activity, C23123i5 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f40565b = binding;
        C52066yC4 c52066yC4 = new C52066yC4();
        this.f40566c = c52066yC4;
        binding.f86707e.setLayoutManager(new LinearLayoutManager(activity));
        binding.f86707e.setItemAnimator(new C11894g());
        binding.f86707e.setAdapter(c52066yC4);
        binding.f86707e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: TC4
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                WC4.m78722Sl(WC4.this);
            }
        });
        binding.f86707e.addOnScrollListener(new C8954a());
        binding.f86708f.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: UC4
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean m78720Tl;
                m78720Tl = WC4.m78720Tl(WC4.this, textView, i, keyEvent);
                return m78720Tl;
            }
        });
    }

    /* renamed from: Sl */
    public static final void m78722Sl(WC4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C23123i5 c23123i5 = this$0.f40565b;
        c23123i5.f86707e.setTranslationY(-c23123i5.f86706d.getHeight());
    }

    /* renamed from: Tl */
    public static final boolean m78720Tl(WC4 this$0, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 3) {
            EditText editText = this$0.f40565b.f86708f;
            Intrinsics.checkNotNullExpressionValue(editText, "binding.search");
            this$0.hideKeyboard(editText);
            return true;
        }
        return false;
    }

    /* renamed from: Ul */
    public static final String m78719Ul(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    @Override // p000.SC4
    /* renamed from: A8 */
    public void mo78727A8(int i) {
        String string;
        if (i == 0) {
            string = getActivity().getResources().getString(C45871nl4.add);
        } else {
            string = getActivity().getResources().getString(C45871nl4.repair_logger_add_repairs, Integer.valueOf(i));
        }
        Intrinsics.checkNotNullExpressionValue(string, "if (count == 0) {\n      …add_repairs, count)\n    }");
        this.f40565b.f86704b.setText(string);
    }

    @Override // p000.SC4
    /* renamed from: I1 */
    public Observable<String> mo78726I1() {
        EditText editText = this.f40565b.f86708f;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.search");
        AbstractC49595u22<CharSequence> m42643d = C40475ef5.m42643d(editText);
        final C8955b c8955b = C8955b.f40568g;
        Observable map = m42643d.map(new InterfaceC23492o() { // from class: VC4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m78719Ul;
                m78719Ul = WC4.m78719Ul(Function1.this, obj);
                return m78719Ul;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "binding.search.textChanges().map { it.toString() }");
        return map;
    }

    @Override // p000.SC4
    /* renamed from: T9 */
    public Observable<Pair<RepairType, Boolean>> mo78721T9() {
        return this.f40566c.m3851w();
    }

    @Override // p000.SC4
    /* renamed from: Zi */
    public void mo78718Zi() {
        this.f40566c.m3849y(true);
    }

    @Override // p000.SC4
    /* renamed from: b */
    public void mo78717b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f40566c.mo24871u(sections);
    }

    @Override // p000.SC4
    /* renamed from: l */
    public Observable<Unit> mo78716l() {
        Button button = this.f40565b.f86704b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.add");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.SC4
    /* renamed from: pl */
    public Observable<Pair<RepairType, String>> mo78715pl() {
        return this.f40566c.m3850x();
    }
}
