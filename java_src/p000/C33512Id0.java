package p000;

import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC33980Kd0;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001<B\u0007¢\u0006\u0004\b9\u0010:J$\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u00101\u001a\u0004\u0018\u00010,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\"\u00106\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010\u00150\u0015028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\"\u00108\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010\u00150\u0015028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105¨\u0006="}, m28432d2 = {"LId0;", "Lhc5;", "LUd0;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "onStart", "Lio/reactivex/h;", "T0", "LVd0;", TransferTable.COLUMN_STATE, "t8", "Lio/reactivex/Observable;", "", "K8", "Z3", "LTd0;", "e", "LTd0;", "N6", "()LTd0;", "setPresenter", "(LTd0;)V", "presenter", "LIZ;", "f", "LIZ;", "binding", "LHd0;", "g", "LHd0;", "adapter", "LLd0;", "h", "LLd0;", "converter", "Lsx4;", "i", "Lkotlin/Lazy;", "a5", "()Lsx4;", "delegate", "Lma4;", "kotlin.jvm.PlatformType", "j", "Lma4;", "imageClicksRelay", "k", "birdIdRelay", "<init>", "()V", "l", C17296a.f69688o, "co.bird.android.feature.cannotaccess"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCannotAccessReportsBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CannotAccessReportsBottomSheet.kt\nco/bird/android/feature/cannotaccess/reports/CannotAccessReportsBottomSheet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,118:1\n1#2:119\n64#3:120\n*S KotlinDebug\n*F\n+ 1 CannotAccessReportsBottomSheet.kt\nco/bird/android/feature/cannotaccess/reports/CannotAccessReportsBottomSheet\n*L\n91#1:120\n*E\n"})
/* renamed from: Id0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33512Id0 extends AbstractC42224hc5 implements InterfaceC36320Ud0 {

    /* renamed from: l */
    public static final C3718a f15943l = new C3718a(null);

    /* renamed from: e */
    public C36086Td0 f15944e;

    /* renamed from: f */
    public C3707IZ f15945f;

    /* renamed from: g */
    public final C33278Hd0 f15946g = new C33278Hd0();

    /* renamed from: h */
    public final C34214Ld0 f15947h = new C34214Ld0();

    /* renamed from: i */
    public final Lazy f15948i;

    /* renamed from: j */
    public final C45168ma4<String> f15949j;

    /* renamed from: k */
    public final C45168ma4<String> f15950k;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"LId0$a;", "", "", "birdId", "LId0;", C17296a.f69688o, "TAG", "Ljava/lang/String;", "<init>", "()V", "co.bird.android.feature.cannotaccess"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Id0$a */
    /* loaded from: classes3.dex */
    public static final class C3718a {
        public /* synthetic */ C3718a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C33512Id0 m101879a(String birdId) {
            Intrinsics.checkNotNullParameter(birdId, "birdId");
            C33512Id0 c33512Id0 = new C33512Id0();
            Bundle bundle = new Bundle();
            bundle.putString("bird_id", birdId);
            c33512Id0.setArguments(bundle);
            return c33512Id0;
        }

        private C3718a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lsx4;", "b", "()Lsx4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCannotAccessReportsBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CannotAccessReportsBottomSheet.kt\nco/bird/android/feature/cannotaccess/reports/CannotAccessReportsBottomSheet$delegate$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
    /* renamed from: Id0$b */
    /* loaded from: classes3.dex */
    public static final class C3719b extends Lambda implements Function0<C48955sx4> {
        public C3719b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C48955sx4 invoke() {
            FragmentActivity activity = C33512Id0.this.getActivity();
            AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
            if (appCompatActivity != null) {
                return new C48955sx4(appCompatActivity);
            }
            return null;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Id0$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3720c extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C3720c(Object obj) {
            super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45168ma4) this.receiver).accept(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Id0$d */
    /* loaded from: classes3.dex */
    public static final class C3721d extends Lambda implements Function1<View, Unit> {
        public C3721d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            Dialog dialog = C33512Id0.this.getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public C33512Id0() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new C3719b());
        this.f15948i = lazy;
        C45168ma4<String> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<String>()");
        this.f15949j = m25409g;
        C45168ma4<String> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<String>()");
        this.f15950k = m25409g2;
    }

    @Override // p000.InterfaceC36320Ud0
    /* renamed from: K8 */
    public Observable<String> mo81225K8() {
        Observable<String> hide = this.f15950k.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "birdIdRelay.hide()");
        return hide;
    }

    /* renamed from: N6 */
    public final C36086Td0 m101882N6() {
        C36086Td0 c36086Td0 = this.f15944e;
        if (c36086Td0 != null) {
            return c36086Td0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
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

    @Override // p000.InterfaceC36320Ud0
    /* renamed from: Z3 */
    public Observable<String> mo81224Z3() {
        Observable<String> hide = this.f15949j.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "imageClicksRelay.hide()");
        return hide;
    }

    /* renamed from: a5 */
    public final C48955sx4 m101881a5() {
        return (C48955sx4) this.f15948i.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C3707IZ binding = C3707IZ.m101929c(getLayoutInflater(), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(binding, "binding");
        this.f15945f = binding;
        LinearLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "inflate(layoutInflater, …ding = binding\n    }.root");
        return root;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, androidx.fragment.app.Fragment
    public void onStart() {
        ViewGroup viewGroup;
        super.onStart();
        ViewParent parent = requireView().getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return;
        }
        viewGroup.getLayoutParams().height = -1;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Application application;
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC33980Kd0.InterfaceC4508a m1574a = C52700zH0.m1574a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        FragmentActivity activity = getActivity();
        C3707IZ c3707iz = null;
        if (activity != null) {
            application = activity.getApplication();
        } else {
            application = null;
        }
        if (application == null) {
            return;
        }
        m1574a.mo1570a(c46172oG2.m21419a(application)).mo1573a(this);
        C3707IZ c3707iz2 = this.f15945f;
        if (c3707iz2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c3707iz2 = null;
        }
        c3707iz2.f15888c.setLayoutManager(new LinearLayoutManager(getActivity()));
        C3707IZ c3707iz3 = this.f15945f;
        if (c3707iz3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c3707iz3 = null;
        }
        c3707iz3.f15888c.setItemAnimator(new C11894g());
        C3707IZ c3707iz4 = this.f15945f;
        if (c3707iz4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c3707iz4 = null;
        }
        c3707iz4.f15888c.setAdapter(this.f15946g);
        this.f15946g.m103644w(new C3720c(this.f15949j));
        C3707IZ c3707iz5 = this.f15945f;
        if (c3707iz5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c3707iz = c3707iz5;
        }
        ImageView imageView = c3707iz.f15887b;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.close");
        C34585Ms2.m94661j(imageView, new C3721d());
        m101882N6().consume(this);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("bird_id")) != null) {
            this.f15950k.accept(string);
        }
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: t8 */
    public void render(C36554Vd0 state) {
        Throwable m79642b;
        Intrinsics.checkNotNullParameter(state, "state");
        this.f15946g.mo24871u(this.f15947h.m96539a(state.m79641c()));
        C48955sx4 m101881a5 = m101881a5();
        if (m101881a5 != null && (m79642b = state.m79642b()) != null) {
            C38689bg5.m64178c(m101881a5, m79642b);
        }
    }
}
