package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.feature.configurabletutorial.ConfigurableTutorialsActivity;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001FB\u0007¢\u0006\u0004\bC\u0010DJ&\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R.\u00105\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000201 2*\n\u0012\u0004\u0012\u000201\u0018\u000100000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R&\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020100068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R!\u0010?\u001a\b\u0012\u0004\u0012\u000201068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010:R!\u0010B\u001a\b\u0012\u0004\u0012\u00020\f068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\bA\u0010:¨\u0006G"}, m28432d2 = {"LXv0;", "Landroidx/fragment/app/Fragment;", "Liw0;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Lio/reactivex/h;", "T0", "Ljw0;", TransferTable.COLUMN_STATE, "A9", "Lhw0;", "b", "Lhw0;", "t8", "()Lhw0;", "setPresenter", "(Lhw0;)V", "presenter", "LWv0;", "c", "LWv0;", "a5", "()LWv0;", "setAdapter", "(LWv0;)V", "adapter", "LPv0;", DateTokenConverter.CONVERTER_KEY, "LPv0;", "N6", "()LPv0;", "setConverter", "(LPv0;)V", "converter", "Lay1;", "e", "Lay1;", "binding", "Lio/reactivex/subjects/d;", "", "", "kotlin.jvm.PlatformType", "f", "Lio/reactivex/subjects/d;", "tutorialsSubject", "Lio/reactivex/Observable;", "g", "Lio/reactivex/Observable;", "g1", "()Lio/reactivex/Observable;", "tutorialIds", "h", "Lkotlin/Lazy;", "K7", "tutorialClicks", "i", "L", "skipClicks", "<init>", "()V", "j", C17296a.f69688o, "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConfigurableTutorialGroupFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialGroupFragment.kt\nco/bird/android/feature/configurabletutorial/group/ConfigurableTutorialGroupFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,87:1\n1#2:88\n64#3:89\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialGroupFragment.kt\nco/bird/android/feature/configurabletutorial/group/ConfigurableTutorialGroupFragment\n*L\n73#1:89\n*E\n"})
/* renamed from: Xv0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37184Xv0 extends Fragment implements InterfaceC43012iw0 {

    /* renamed from: j */
    public static final C9549a f44218j = new C9549a(null);

    /* renamed from: b */
    public C42419hw0 f44219b;

    /* renamed from: c */
    public C36950Wv0 f44220c;

    /* renamed from: d */
    public C35312Pv0 f44221d;

    /* renamed from: e */
    public C38272ay1 f44222e;

    /* renamed from: f */
    public final C24558d<List<String>> f44223f;

    /* renamed from: g */
    public final Observable<List<String>> f44224g;

    /* renamed from: h */
    public final Lazy f44225h;

    /* renamed from: i */
    public final Lazy f44226i;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"LXv0$a;", "", "", "", "tutorialIds", "LXv0;", C17296a.f69688o, "TUTORIAL_IDS", "Ljava/lang/String;", "<init>", "()V", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Xv0$a */
    /* loaded from: classes3.dex */
    public static final class C9549a {
        public /* synthetic */ C9549a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C37184Xv0 m76104a(List<String> tutorialIds) {
            Intrinsics.checkNotNullParameter(tutorialIds, "tutorialIds");
            C37184Xv0 c37184Xv0 = new C37184Xv0();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("tutorial_ids", C44691lm0.m26849a(tutorialIds));
            c37184Xv0.setArguments(bundle);
            return c37184Xv0;
        }

        private C9549a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Xv0$b */
    /* loaded from: classes3.dex */
    public static final class C9550b extends Lambda implements Function0<Observable<Unit>> {
        public C9550b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Unit> invoke() {
            C38272ay1 c38272ay1 = C37184Xv0.this.f44222e;
            if (c38272ay1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c38272ay1 = null;
            }
            Button button = c38272ay1.f56687d;
            Intrinsics.checkNotNullExpressionValue(button, "binding.skipHowTo");
            return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Xv0$c */
    /* loaded from: classes3.dex */
    public static final class C9551c extends Lambda implements Function0<Observable<String>> {
        public C9551c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<String> invoke() {
            return C37184Xv0.this.m76106a5().m77712v();
        }
    }

    public C37184Xv0() {
        Lazy lazy;
        Lazy lazy2;
        C24558d<List<String>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<List<String>>()");
        this.f44223f = m31902e;
        Observable<List<String>> hide = m31902e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "tutorialsSubject.hide()");
        this.f44224g = hide;
        lazy = LazyKt__LazyJVMKt.lazy(new C9551c());
        this.f44225h = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C9550b());
        this.f44226i = lazy2;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: A9 */
    public void render(InterfaceC43605jw0 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof C48114rY3) {
            m76106a5().mo24871u(m76107N6().m89425e(((C48114rY3) state).m15770a()));
        } else if (state instanceof C36487Uv5) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.setTitle(((C36487Uv5) state).m80615a());
            }
        } else {
            C38272ay1 c38272ay1 = null;
            if (state instanceof C36955Wv5) {
                C38272ay1 c38272ay12 = this.f44222e;
                if (c38272ay12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    c38272ay1 = c38272ay12;
                }
                c38272ay1.f56688e.setText(((C36955Wv5) state).m77706a());
            } else if (state instanceof C36721Vv5) {
                C38272ay1 c38272ay13 = this.f44222e;
                if (c38272ay13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    c38272ay1 = c38272ay13;
                }
                c38272ay1.f56685b.setText(((C36721Vv5) state).m79228a());
            } else if (state instanceof C36253Tv5) {
                C38272ay1 c38272ay14 = this.f44222e;
                if (c38272ay14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    c38272ay1 = c38272ay14;
                }
                c38272ay1.f56687d.setText(((C36253Tv5) state).m82242a());
            }
        }
    }

    @Override // p000.InterfaceC43012iw0
    /* renamed from: K7 */
    public Observable<String> mo31600K7() {
        return (Observable) this.f44225h.getValue();
    }

    @Override // p000.InterfaceC43012iw0
    /* renamed from: L */
    public Observable<Unit> mo31599L() {
        return (Observable) this.f44226i.getValue();
    }

    /* renamed from: N6 */
    public final C35312Pv0 m76107N6() {
        C35312Pv0 c35312Pv0 = this.f44221d;
        if (c35312Pv0 != null) {
            return c35312Pv0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("converter");
        return null;
    }

    @Override // com.uber.autodispose.ScopeProvider
    /* renamed from: T0 */
    public InterfaceC23496h mo231T0() {
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        InterfaceC23496h mo231T0 = m45195i.mo231T0();
        Intrinsics.checkNotNullExpressionValue(mo231T0, "scope(FragmentLifecycleResolver).requestScope()");
        return mo231T0;
    }

    /* renamed from: a5 */
    public final C36950Wv0 m76106a5() {
        C36950Wv0 c36950Wv0 = this.f44220c;
        if (c36950Wv0 != null) {
            return c36950Wv0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    @Override // p000.InterfaceC43012iw0
    /* renamed from: g1 */
    public Observable<List<String>> mo31598g1() {
        return this.f44224g;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return C38272ay1.m65195c(inflater, viewGroup, false).getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ConfigurableTutorialsActivity configurableTutorialsActivity;
        ArrayList<String> stringArrayList;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C38272ay1 m65197a = C38272ay1.m65197a(view);
        Intrinsics.checkNotNullExpressionValue(m65197a, "bind(view)");
        this.f44222e = m65197a;
        FragmentActivity activity = getActivity();
        C38272ay1 c38272ay1 = null;
        if (activity instanceof ConfigurableTutorialsActivity) {
            configurableTutorialsActivity = (ConfigurableTutorialsActivity) activity;
        } else {
            configurableTutorialsActivity = null;
        }
        if (configurableTutorialsActivity == null) {
            return;
        }
        configurableTutorialsActivity.m58406P().mo58402a(this);
        C38272ay1 c38272ay12 = this.f44222e;
        if (c38272ay12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c38272ay1 = c38272ay12;
        }
        c38272ay1.f56686c.setAdapter(m76106a5());
        m76105t8().consume(this);
        Bundle arguments = getArguments();
        if (arguments != null && (stringArrayList = arguments.getStringArrayList("tutorial_ids")) != null) {
            this.f44223f.onNext(stringArrayList);
        }
    }

    /* renamed from: t8 */
    public final C42419hw0 m76105t8() {
        C42419hw0 c42419hw0 = this.f44219b;
        if (c42419hw0 != null) {
            return c42419hw0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }
}
