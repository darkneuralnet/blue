package p000;

import android.view.KeyEvent;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBatch;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23492o;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H\u0016R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, m28432d2 = {"LY7;", "LxE;", "LU7;", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireBatch;", "j1", "Lio/reactivex/k;", "", "eg", "", "LH6;", "sections", "o", "", "H", "LP2;", "b", "LP2;", "binding", "LB7;", "c", "LB7;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LP2;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Y7 */
/* loaded from: classes3.dex */
public final class C9636Y7 extends AbstractC30071xE implements InterfaceC8198U7 {

    /* renamed from: b */
    public final C6231P2 f44570b;

    /* renamed from: c */
    public final C0522B7 f44571c;

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"Y7$a", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Y7$a */
    /* loaded from: classes3.dex */
    public static final class C9637a extends RecyclerView.AbstractC11863t {
        public C9637a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11863t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (i == 1) {
                C9636Y7 c9636y7 = C9636Y7.this;
                EditText editText = c9636y7.f44570b.f27769e;
                Intrinsics.checkNotNullExpressionValue(editText, "binding.search");
                c9636y7.hideKeyboard(editText);
            }
            super.onScrollStateChanged(recyclerView, i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Y7$b */
    /* loaded from: classes3.dex */
    public static final class C9638b extends Lambda implements Function1<CharSequence, String> {

        /* renamed from: g */
        public static final C9638b f44573g = new C9638b();

        public C9638b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9636Y7(BaseActivity activity, C6231P2 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f44570b = binding;
        C0522B7 c0522b7 = new C0522B7();
        this.f44571c = c0522b7;
        binding.f27768d.setAdapter(c0522b7);
        binding.f27768d.setLayoutManager(new LinearLayoutManager(activity));
        binding.f27768d.setItemAnimator(new C11894g());
        binding.f27768d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: V7
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C9636Y7.m75673Sl(C9636Y7.this);
            }
        });
        binding.f27768d.addOnScrollListener(new C9637a());
        binding.f27769e.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: W7
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean m75672Tl;
                m75672Tl = C9636Y7.m75672Tl(C9636Y7.this, textView, i, keyEvent);
                return m75672Tl;
            }
        });
    }

    /* renamed from: Sl */
    public static final void m75673Sl(C9636Y7 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C6231P2 c6231p2 = this$0.f44570b;
        c6231p2.f27768d.setTranslationY(-c6231p2.f27766b.getHeight());
    }

    /* renamed from: Tl */
    public static final boolean m75672Tl(C9636Y7 this$0, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 3) {
            EditText editText = this$0.f44570b.f27769e;
            Intrinsics.checkNotNullExpressionValue(editText, "binding.search");
            this$0.hideKeyboard(editText);
            return true;
        }
        return false;
    }

    /* renamed from: Ul */
    public static final String m75671Ul(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC8198U7
    /* renamed from: H */
    public Observable<String> mo75677H() {
        EditText editText = this.f44570b.f27769e;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.search");
        AbstractC49595u22<CharSequence> m42643d = C40475ef5.m42643d(editText);
        final C9638b c9638b = C9638b.f44573g;
        Observable<String> startWith = m42643d.map(new InterfaceC23492o() { // from class: X7
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m75671Ul;
                m75671Ul = C9636Y7.m75671Ul(Function1.this, obj);
                return m75671Ul;
            }
        }).startWith((Observable<R>) "");
        Intrinsics.checkNotNullExpressionValue(startWith, "binding.search.textChang…oString() }.startWith(\"\")");
        return startWith;
    }

    @Override // p000.InterfaceC8198U7
    /* renamed from: eg */
    public AbstractC24490k<Unit> mo75670eg() {
        AbstractC24490k<Unit> m32108t0 = this.f44571c.m114352w().toFlowable(EnumC23460b.DROP).m32108t0(C23454a.m33087a(), false, 1);
        Intrinsics.checkNotNullExpressionValue(m32108t0, "adapter.createBatchClick…s.mainThread(), false, 1)");
        return m32108t0;
    }

    @Override // p000.InterfaceC8198U7
    /* renamed from: j1 */
    public Observable<WireBatch> mo75669j1() {
        return this.f44571c.m114353v();
    }

    @Override // p000.InterfaceC8198U7
    /* renamed from: o */
    public void mo75668o(Collection<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f44571c.mo24871u(sections);
    }
}
