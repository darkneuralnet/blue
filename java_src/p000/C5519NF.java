package p000;

import android.view.KeyEvent;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBatch;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24558d;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b \u0010!J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\t0\t0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\""}, m28432d2 = {"LNF;", "LxE;", "LJF;", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireBatch;", "j1", "", "LH6;", "sections", "", "o", "", "H", "k7", "Mg", "", "Yk", "LY2;", "b", "LY2;", "binding", "LlF;", "c", "LlF;", "adapter", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/d;", "searchClicks", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LY2;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: NF */
/* loaded from: classes3.dex */
public final class C5519NF extends AbstractC30071xE implements InterfaceC3940JF {

    /* renamed from: b */
    public final C9603Y2 f24324b;

    /* renamed from: c */
    public final C25663lF f24325c;

    /* renamed from: d */
    public final C24558d<Unit> f24326d;

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"NF$a", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: NF$a */
    /* loaded from: classes3.dex */
    public static final class C5520a extends RecyclerView.AbstractC11863t {
        public C5520a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11863t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (i == 1) {
                C5519NF c5519nf = C5519NF.this;
                EditText editText = c5519nf.f24324b.f44462e;
                Intrinsics.checkNotNullExpressionValue(editText, "binding.search");
                c5519nf.hideKeyboard(editText);
            }
            super.onScrollStateChanged(recyclerView, i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: NF$b */
    /* loaded from: classes3.dex */
    public static final class C5521b extends Lambda implements Function1<CharSequence, String> {

        /* renamed from: g */
        public static final C5521b f24328g = new C5521b();

        public C5521b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5519NF(BaseActivity activity, C9603Y2 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f24324b = binding;
        C25663lF c25663lF = new C25663lF();
        this.f24325c = c25663lF;
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f24326d = m31902e;
        binding.f44461d.setAdapter(c25663lF);
        binding.f44461d.setLayoutManager(new LinearLayoutManager(activity));
        binding.f44461d.setItemAnimator(new C11894g());
        binding.f44461d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: KF
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C5519NF.m94158Sl(C5519NF.this);
            }
        });
        binding.f44461d.addOnScrollListener(new C5520a());
        binding.f44462e.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: LF
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean m94157Tl;
                m94157Tl = C5519NF.m94157Tl(C5519NF.this, textView, i, keyEvent);
                return m94157Tl;
            }
        });
    }

    /* renamed from: Sl */
    public static final void m94158Sl(C5519NF this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C9603Y2 c9603y2 = this$0.f24324b;
        c9603y2.f44461d.setTranslationY(-c9603y2.f44459b.getHeight());
    }

    /* renamed from: Tl */
    public static final boolean m94157Tl(C5519NF this$0, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 3) {
            EditText editText = this$0.f24324b.f44462e;
            Intrinsics.checkNotNullExpressionValue(editText, "binding.search");
            this$0.hideKeyboard(editText);
            this$0.f24326d.onNext(Unit.INSTANCE);
            return true;
        }
        return false;
    }

    /* renamed from: Ul */
    public static final String m94156Ul(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC3940JF
    /* renamed from: H */
    public Observable<String> mo94163H() {
        EditText editText = this.f24324b.f44462e;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.search");
        AbstractC49595u22<CharSequence> m42643d = C40475ef5.m42643d(editText);
        final C5521b c5521b = C5521b.f24328g;
        Observable map = m42643d.map(new InterfaceC23492o() { // from class: MF
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m94156Ul;
                m94156Ul = C5519NF.m94156Ul(Function1.this, obj);
                return m94156Ul;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "binding.search.textChanges().map { it.toString() }");
        return map;
    }

    @Override // p000.InterfaceC3940JF
    /* renamed from: Mg */
    public Observable<Unit> mo94162Mg() {
        return this.f24325c.m27634w();
    }

    @Override // p000.InterfaceC3940JF
    /* renamed from: Yk */
    public Observable<Integer> mo94155Yk() {
        return this.f24325c.m27633x();
    }

    @Override // p000.InterfaceC3940JF
    /* renamed from: j1 */
    public Observable<WireBatch> mo94154j1() {
        return this.f24325c.m27635v();
    }

    @Override // p000.InterfaceC3940JF
    /* renamed from: k7 */
    public Observable<Unit> mo94153k7() {
        Observable<Unit> hide = this.f24326d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "searchClicks.hide()");
        return hide;
    }

    @Override // p000.InterfaceC3940JF
    /* renamed from: o */
    public void mo94152o(Collection<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f24325c.mo24871u(sections);
    }
}
