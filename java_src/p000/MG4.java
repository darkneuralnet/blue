package p000;

import android.widget.Button;
import android.widget.EditText;
import androidx.recyclerview.widget.C11925l;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\r"}, m28432d2 = {"LMG4;", "LxE;", "LIG4;", "Lp5;", "binding", "LEG4;", "presenter", "", "i9", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: MG4 */
/* loaded from: classes2.dex */
public final class MG4 extends AbstractC30071xE implements IG4 {

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: MG4$a */
    /* loaded from: classes2.dex */
    public static final class C5261a extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C27138p5 f22933g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5261a(C27138p5 c27138p5) {
            super(1);
            this.f22933g = c27138p5;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean it) {
            Button button = this.f22933g.f103114c;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            button.setEnabled(it.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: MG4$b */
    /* loaded from: classes2.dex */
    public static final class C5262b extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public final /* synthetic */ EG4 f22934g;

        /* renamed from: h */
        public final /* synthetic */ C27138p5 f22935h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5262b(EG4 eg4, C27138p5 c27138p5) {
            super(1);
            this.f22934g = eg4;
            this.f22935h = c27138p5;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            this.f22934g.mo104086g(this.f22935h.f103113b.getText().toString());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: MG4$c */
    /* loaded from: classes2.dex */
    public static final class C5263c extends Lambda implements Function1<String, Boolean> {

        /* renamed from: g */
        public static final C5263c f22936g = new C5263c();

        public C5263c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String it) {
            CharSequence trim;
            Intrinsics.checkNotNullParameter(it, "it");
            trim = StringsKt__StringsKt.trim((CharSequence) it);
            return Boolean.valueOf(trim.toString().length() > 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MG4(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    /* renamed from: Sl */
    public static final Boolean m95462Sl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: Tl */
    public static final void m95461Tl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Ul */
    public static final void m95460Ul(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.IG4
    /* renamed from: i9 */
    public void mo95459i9(C27138p5 binding, EG4 presenter) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        binding.f103114c.setEnabled(false);
        EditText editText = binding.f103113b;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.feedback");
        Observable textChanges$default = C44626lf5.textChanges$default(editText, C11925l.AbstractC11930e.DEFAULT_SWIPE_ANIMATION_DURATION, false, 2, null);
        final C5263c c5263c = C5263c.f22936g;
        Observable map = textChanges$default.map(new InterfaceC23492o() { // from class: JG4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m95462Sl;
                m95462Sl = MG4.m95462Sl(Function1.this, obj);
                return m95462Sl;
            }
        });
        final C5261a c5261a = new C5261a(binding);
        map.subscribe(new InterfaceC23484g() { // from class: KG4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MG4.m95461Tl(Function1.this, obj);
            }
        });
        Button button = binding.f103114c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.submitButton");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        final C5262b c5262b = new C5262b(presenter, binding);
        clicksThrottle$default.subscribe(new InterfaceC23484g() { // from class: LG4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MG4.m95460Ul(Function1.this, obj);
            }
        });
    }
}
