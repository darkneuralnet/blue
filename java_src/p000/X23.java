package p000;

import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogInterface$OnCancelListenerC11663c;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.nestedstructures.NestFavoritePartner;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.C24567g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.U23;
@Metadata(m28433d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001@B\u0007¢\u0006\u0004\b=\u0010>J$\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u001a\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00170\u0014H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\u0016J\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001d0\u001cR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00106\u001a\u0010\u0012\f\u0012\n 4*\u0004\u0018\u00010\u00150\u0015038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00105R:\u00108\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019 4*\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00170\u0017038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105R.\u0010<\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0015 4*\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001d0\u001d098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006A"}, m28432d2 = {"LX23;", "Landroidx/fragment/app/c;", "Lj33;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "onResume", "Lk33;", TransferTable.COLUMN_STATE, "B9", "Lio/reactivex/h;", "T0", "Lio/reactivex/Observable;", "", "N", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/nestedstructures/NestFavoritePartner;", "", "m7", "f", "Lio/reactivex/F;", "", "t8", "Li33;", "b", "Li33;", "N6", "()Li33;", "setPresenter", "(Li33;)V", "presenter", "LA31;", "c", "LA31;", "binding", "LV23;", DateTokenConverter.CONVERTER_KEY, "LV23;", "converter", "LS23;", "e", "LS23;", "adapter", "Lma4;", "kotlin.jvm.PlatformType", "Lma4;", "nestIdRelay", "g", "nestPartnerCheckChangesRelay", "Lio/reactivex/subjects/g;", "h", "Lio/reactivex/subjects/g;", "selectedPartnersSubject", "<init>", "()V", "i", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestFavoritePartnerDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFavoritePartnerDialogFragment.kt\nco/bird/android/app/feature/operator/dialogs/nest/favorite/NestFavoritePartnerDialogFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,132:1\n1#2:133\n1747#3,3:134\n64#4:137\n*S KotlinDebug\n*F\n+ 1 NestFavoritePartnerDialogFragment.kt\nco/bird/android/app/feature/operator/dialogs/nest/favorite/NestFavoritePartnerDialogFragment\n*L\n103#1:134,3\n107#1:137\n*E\n"})
/* renamed from: X23 */
/* loaded from: classes2.dex */
public final class X23 extends DialogInterface$OnCancelListenerC11663c implements InterfaceC43084j33 {

    /* renamed from: i */
    public static final C9286a f42551i = new C9286a(null);

    /* renamed from: j */
    public static final int f42552j = 8;

    /* renamed from: b */
    public C42491i33 f42553b;

    /* renamed from: c */
    public A31 f42554c;

    /* renamed from: d */
    public final V23 f42555d = new V23();

    /* renamed from: e */
    public final S23 f42556e = new S23();

    /* renamed from: f */
    public final C45168ma4<String> f42557f;

    /* renamed from: g */
    public final C45168ma4<Pair<NestFavoritePartner, Boolean>> f42558g;

    /* renamed from: h */
    public final C24567g<List<String>> f42559h;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"LX23$a;", "", "", "nestId", "LX23;", C17296a.f69688o, "TAG", "Ljava/lang/String;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: X23$a */
    /* loaded from: classes2.dex */
    public static final class C9286a {
        public /* synthetic */ C9286a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final X23 m77521a(String nestId) {
            Intrinsics.checkNotNullParameter(nestId, "nestId");
            X23 x23 = new X23();
            Bundle bundle = new Bundle();
            bundle.putString("nest_id", nestId);
            x23.setArguments(bundle);
            return x23;
        }

        private C9286a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: X23$b */
    /* loaded from: classes2.dex */
    public static final class C9287b extends Lambda implements Function1<List<? extends String>, Unit> {
        public C9287b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
            invoke2((List<String>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<String> list) {
            X23.this.dismiss();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: X23$c */
    /* loaded from: classes2.dex */
    public static final class C9288c extends Lambda implements Function1<View, Unit> {
        public C9288c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            X23.this.dismiss();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: X23$d */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C9289d extends FunctionReferenceImpl implements Function1<Pair<? extends NestFavoritePartner, ? extends Boolean>, Unit> {
        public C9289d(Object obj) {
            super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends NestFavoritePartner, ? extends Boolean> pair) {
            invoke2((Pair<NestFavoritePartner, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<NestFavoritePartner, Boolean> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45168ma4) this.receiver).accept(p0);
        }
    }

    public X23() {
        C45168ma4<String> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<String>()");
        this.f42557f = m25409g;
        C45168ma4<Pair<NestFavoritePartner, Boolean>> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Pair<NestFavoritePartner, Boolean>>()");
        this.f42558g = m25409g2;
        C24567g<List<String>> m31882w0 = C24567g.m31882w0();
        Intrinsics.checkNotNullExpressionValue(m31882w0, "create<List<String>>()");
        this.f42559h = m31882w0;
    }

    /* renamed from: A9 */
    public static final void m77526A9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: B9 */
    public void render(C43677k33 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f42556e.mo24871u(this.f42555d.m80473a(state.m29387b()));
        A31 a31 = this.f42554c;
        if (a31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            a31 = null;
        }
        Button button = a31.f63d;
        List<Pair<NestFavoritePartner, Boolean>> m29387b = state.m29387b();
        boolean z = false;
        if (!(m29387b instanceof Collection) || !m29387b.isEmpty()) {
            Iterator<T> it = m29387b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((Boolean) ((Pair) it.next()).component2()).booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        button.setEnabled(z);
    }

    @Override // p000.InterfaceC43084j33
    /* renamed from: N */
    public Observable<String> mo31216N() {
        Observable<String> hide = this.f42557f.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "nestIdRelay.hide()");
        return hide;
    }

    /* renamed from: N6 */
    public final C42491i33 m77524N6() {
        C42491i33 c42491i33 = this.f42553b;
        if (c42491i33 != null) {
            return c42491i33;
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

    @Override // p000.InterfaceC43084j33
    /* renamed from: f */
    public Observable<Unit> mo31215f() {
        A31 a31 = this.f42554c;
        if (a31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            a31 = null;
        }
        Button button = a31.f63d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.confirm");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC43084j33
    /* renamed from: m7 */
    public Observable<Pair<NestFavoritePartner, Boolean>> mo31214m7() {
        Observable<Pair<NestFavoritePartner, Boolean>> hide = this.f42558g.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "nestPartnerCheckChangesRelay.hide()");
        return hide;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        A31 binding = A31.m116162c(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(binding, "binding");
        this.f42554c = binding;
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "inflate(inflater, contai…g = binding }\n      .root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        super.onResume();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        U23.InterfaceC8181a m8882a = C50373vM0.m8882a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = activity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        m8882a.mo8881a(c46172oG2.m21419a(application), this.f42559h).mo8880a(this);
        A31 a31 = this.f42554c;
        A31 a312 = null;
        if (a31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            a31 = null;
        }
        Button button = a31.f62c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.cancel");
        C34585Ms2.m94661j(button, new C9288c());
        A31 a313 = this.f42554c;
        if (a313 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            a313 = null;
        }
        a313.f64e.setAdapter(this.f42556e);
        A31 a314 = this.f42554c;
        if (a314 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            a314 = null;
        }
        a314.f64e.setLayoutManager(new LinearLayoutManager(activity));
        A31 a315 = this.f42554c;
        if (a315 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            a312 = a315;
        }
        a312.f64e.setItemAnimator(new C11894g());
        this.f42556e.m86075w(new C9289d(this.f42558g));
        m77524N6().consume(this);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("nest_id")) != null) {
            this.f42557f.accept(string);
        }
    }

    /* renamed from: t8 */
    public final AbstractC23442F<List<String>> m77522t8() {
        AbstractC23442F<List<String>> m33160F = this.f42559h.m33160F();
        final C9287b c9287b = new C9287b();
        AbstractC23442F<List<String>> m33101w = m33160F.m33101w(new InterfaceC23484g() { // from class: W23
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                X23.m77526A9(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "fun nestPartnerSelects()…doOnSuccess { dismiss() }");
        return m33101w;
    }
}
