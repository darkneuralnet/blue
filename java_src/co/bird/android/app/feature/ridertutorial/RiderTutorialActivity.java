package co.bird.android.app.feature.ridertutorial;

import android.os.Bundle;
import co.bird.android.app.feature.ridertutorial.RiderTutorialActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.ridertutorial.TutorialKind;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC34894Oa5;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/app/feature/ridertutorial/RiderTutorialActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LVa5;", "B", "LVa5;", "k0", "()LVa5;", "setPresenterFactory", "(LVa5;)V", "presenterFactory", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRiderTutorialActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderTutorialActivity.kt\nco/bird/android/app/feature/ridertutorial/RiderTutorialActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,40:1\n180#2:41\n*S KotlinDebug\n*F\n+ 1 RiderTutorialActivity.kt\nco/bird/android/app/feature/ridertutorial/RiderTutorialActivity\n*L\n36#1:41\n*E\n"})
/* loaded from: classes2.dex */
public final class RiderTutorialActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC36532Va5 f62715B;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.ridertutorial.RiderTutorialActivity$a */
    /* loaded from: classes2.dex */
    public static final class C14305a extends Lambda implements Function1<Unit, Unit> {
        public C14305a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            RiderTutorialActivity.this.mo58957w().close();
        }
    }

    public RiderTutorialActivity() {
        super(false, null, null, 7, null);
    }

    public static final void onCreate$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public final InterfaceC36532Va5 m59416k0() {
        InterfaceC36532Va5 interfaceC36532Va5 = this.f62715B;
        if (interfaceC36532Va5 != null) {
            return interfaceC36532Va5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenterFactory");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        H22.f12748a.mo24038o1(this);
        super.onCreate(bundle);
        setContentView(C39311cj4.rider_tutorial_dark);
        TutorialKind tutorialKind = TutorialKind.CLASS_SCOOTER;
        if (getIntent().hasExtra("tutorial_type")) {
            TutorialKind.Companion companion = TutorialKind.Companion;
            String stringExtra = getIntent().getStringExtra("tutorial_type");
            Intrinsics.checkNotNull(stringExtra);
            tutorialKind = companion.from(stringExtra);
        }
        C36298Ua5 mo78168a = m59416k0().mo78168a(m58963Z(), new C39843db5(this, null, 2, null), null);
        InterfaceC34894Oa5.C6033a.onCreate$default(mo78168a, tutorialKind, null, 2, null);
        Object m33094as = mo78168a.observeDone().m33094as(AutoDispose.m45239a(m58963Z()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14305a c14305a = new C14305a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Ia5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                RiderTutorialActivity.onCreate$lambda$0(Function1.this, obj);
            }
        });
    }
}
