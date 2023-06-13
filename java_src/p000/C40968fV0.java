package p000;

import android.telephony.PhoneNumberFormattingTextWatcher;
import android.widget.Button;
import androidx.recyclerview.widget.C11925l;
import co.bird.android.core.mvp.BaseActivity;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.input.DialogInputExtKt;
import com.afollestad.materialdialogs.list.DialogSingleChoiceExtKt;
import com.facebook.share.internal.C17296a;
import com.google.android.material.textfield.TextInputEditText;
import com.stripe.android.financialconnections.domain.Entry;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.rxkotlin.C24523e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u001c\u0010\t\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J2\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u0006H\u0016J,\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, m28432d2 = {"LfV0;", "LxE;", "LeV0;", "Lio/reactivex/Observable;", "", "Dg", "Lkotlin/Function1;", "", "callback", "sd", "Mk", "", "title", "", "selections", "kk", "hint", "oa", "LSU0;", "presenter", "Pl", "Lc6;", "b", "Lc6;", "binding", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lc6;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDebugUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugUi.kt\nco/bird/android/app/feature/settings/settings/DebugUiImpl\n+ 2 Observables.kt\nio/reactivex/rxkotlin/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,97:1\n41#2,2:98\n180#3:100\n*S KotlinDebug\n*F\n+ 1 DebugUi.kt\nco/bird/android/app/feature/settings/settings/DebugUiImpl\n*L\n86#1:98,2\n93#1:100\n*E\n"})
/* renamed from: fV0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40968fV0 extends AbstractC30071xE implements InterfaceC40375eV0 {

    /* renamed from: b */
    public final C13392c6 f80213b;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\n\u0010\n\u001a\u00028\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "T1", "T2", "T3", "R", "t1", "t2", "t3", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$3\n+ 2 DebugUi.kt\nco/bird/android/app/feature/settings/settings/DebugUiImpl\n*L\n1#1,304:1\n91#2:305\n*E\n"})
    /* renamed from: fV0$a */
    /* loaded from: classes2.dex */
    public static final class C20428a<T1, T2, T3, R> implements InterfaceC23485h<T1, T2, T3, R> {
        @Override // io.reactivex.functions.InterfaceC23485h
        public final R apply(T1 t1, T2 t2, T3 t3) {
            return (R) new Triple((String) t1, (String) t2, (String) t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lcom/afollestad/materialdialogs/MaterialDialog;", "<anonymous parameter 0>", "", "input", "", C17296a.f69688o, "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/CharSequence;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fV0$b */
    /* loaded from: classes2.dex */
    public static final class C20429b extends Lambda implements Function2<MaterialDialog, CharSequence, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1<String, Unit> f80214g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20429b(Function1<? super String, Unit> function1) {
            super(2);
            this.f80214g = function1;
        }

        /* renamed from: a */
        public final void m41283a(MaterialDialog materialDialog, CharSequence input) {
            Intrinsics.checkNotNullParameter(materialDialog, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(input, "input");
            this.f80214g.invoke(input.toString());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog, CharSequence charSequence) {
            m41283a(materialDialog, charSequence);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lcom/afollestad/materialdialogs/MaterialDialog;", "dialog", "", "which", "", Entry.TYPE_TEXT, "", C17296a.f69688o, "(Lcom/afollestad/materialdialogs/MaterialDialog;ILjava/lang/CharSequence;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fV0$c */
    /* loaded from: classes2.dex */
    public static final class C20430c extends Lambda implements Function3<MaterialDialog, Integer, CharSequence, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1<Integer, Unit> f80215g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20430c(Function1<? super Integer, Unit> function1) {
            super(3);
            this.f80215g = function1;
        }

        /* renamed from: a */
        public final void m41282a(MaterialDialog dialog, int i, CharSequence text) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            Intrinsics.checkNotNullParameter(text, "text");
            this.f80215g.invoke(Integer.valueOf(i));
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog, Integer num, CharSequence charSequence) {
            m41282a(materialDialog, num.intValue(), charSequence);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lcom/afollestad/materialdialogs/MaterialDialog;", "<anonymous parameter 0>", "", "input", "", C17296a.f69688o, "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/CharSequence;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fV0$d */
    /* loaded from: classes2.dex */
    public static final class C20431d extends Lambda implements Function2<MaterialDialog, CharSequence, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1<String, Unit> f80216g;

        /* renamed from: h */
        public final /* synthetic */ C40968fV0 f80217h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20431d(Function1<? super String, Unit> function1, C40968fV0 c40968fV0) {
            super(2);
            this.f80216g = function1;
            this.f80217h = c40968fV0;
        }

        /* renamed from: a */
        public final void m41281a(MaterialDialog materialDialog, CharSequence input) {
            Intrinsics.checkNotNullParameter(materialDialog, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(input, "input");
            String obj = input.toString();
            if (C45097mS5.m25597i(obj)) {
                this.f80216g.invoke(obj);
            } else {
                C40968fV0.super.error("URL is invalid");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog, CharSequence charSequence) {
            m41281a(materialDialog, charSequence);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40968fV0(BaseActivity activity, C13392c6 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f80213b = binding;
        binding.f60103r.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
    }

    @Override // p000.InterfaceC40375eV0
    /* renamed from: Dg */
    public Observable<Unit> mo41289Dg() {
        Button button = this.f80213b.f60097l;
        Intrinsics.checkNotNullExpressionValue(button, "binding.environment");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC40375eV0
    /* renamed from: Mk */
    public void mo41288Mk() {
        new C36241Tu2().show(getActivity().getSupportFragmentManager(), "LocalHostBottomSheet");
    }

    /* renamed from: Pl */
    public void m41287Pl(SU0 presenter) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        C24523e c24523e = C24523e.f91168a;
        TextInputEditText textInputEditText = this.f80213b.f60099n;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "binding.name");
        Observable textChanges$default = C44626lf5.textChanges$default(textInputEditText, C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, false, 2, null);
        TextInputEditText textInputEditText2 = this.f80213b.f60095j;
        Intrinsics.checkNotNullExpressionValue(textInputEditText2, "binding.email");
        Observable textChanges$default2 = C44626lf5.textChanges$default(textInputEditText2, C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, false, 2, null);
        TextInputEditText textInputEditText3 = this.f80213b.f60103r;
        Intrinsics.checkNotNullExpressionValue(textInputEditText3, "binding.phone");
        Observable combineLatest = Observable.combineLatest(textChanges$default, textChanges$default2, C44626lf5.textChanges$default(textInputEditText3, C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, false, 2, null), new C20428a());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…neFunction(t1, t2, t3) })");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = combineLatest.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe(presenter.mo78338b());
    }

    @Override // p000.InterfaceC40375eV0
    /* renamed from: kk */
    public void mo41286kk(int i, List<String> selections, Function1<? super Integer, Unit> callback) {
        Intrinsics.checkNotNullParameter(selections, "selections");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!getActivity().isFinishing()) {
            DialogSingleChoiceExtKt.listItemsSingleChoice$default(MaterialDialog.title$default(new MaterialDialog(getActivity(), null, 2, null), Integer.valueOf(i), null, 2, null), null, selections, null, 0, false, new C20430c(callback), 29, null).show();
        }
    }

    @Override // p000.InterfaceC40375eV0
    /* renamed from: oa */
    public void mo41285oa(int i, int i2, Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!getActivity().isFinishing()) {
            DialogInputExtKt.input$default(MaterialDialog.title$default(new MaterialDialog(getActivity(), null, 2, null), Integer.valueOf(i), null, 2, null), getActivity().getText(i2).toString(), null, "", null, 1, null, false, false, new C20429b(callback), 234, null).show();
        }
    }

    @Override // p000.InterfaceC40375eV0
    /* renamed from: sd */
    public void mo41284sd(Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        DialogInputExtKt.input$default(MaterialDialog.title$default(new MaterialDialog(getActivity(), null, 2, null), null, "Enter local url", 1, null), "http://name:8080", null, "http://", null, 0, null, false, false, new C20431d(callback, this), C11925l.AbstractC11930e.DEFAULT_SWIPE_ANIMATION_DURATION, null).show();
    }
}
