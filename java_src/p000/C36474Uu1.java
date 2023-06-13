package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.library.flow.FlowActivity;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.rxkotlin.C24523e;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b!\u0010\"J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\"\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0019\u001a\u00020\nH\u0016R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%"}, m28432d2 = {"LUu1;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "", "onCreate", "onStart", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "onResume", "onPause", "onStop", "onDestroy", "outState", "onSaveInstanceState", "onLowMemory", "b", "Landroid/view/View;", "rootView", "Llv1;", "c", "Llv1;", "presenter", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "flow_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlowFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowFragment.kt\nco/bird/android/library/flow/FlowFragment\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,111:1\n44#2:112\n44#2:113\n180#3:114\n180#3:115\n180#3:116\n180#3:117\n*S KotlinDebug\n*F\n+ 1 FlowFragment.kt\nco/bird/android/library/flow/FlowFragment\n*L\n33#1:112\n44#1:113\n49#1:114\n55#1:115\n61#1:116\n67#1:117\n*E\n"})
/* renamed from: Uu1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36474Uu1 extends Fragment {

    /* renamed from: d */
    public static final C8496a f38234d = new C8496a(null);

    /* renamed from: b */
    public View f38235b;

    /* renamed from: c */
    public InterfaceC44782lv1 f38236c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LUu1$a;", "", "", "NODE_ID_KEY", "Ljava/lang/String;", "<init>", "()V", "flow_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Uu1$a */
    /* loaded from: classes3.dex */
    public static final class C8496a {
        public /* synthetic */ C8496a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C8496a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LEi0;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Uu1$b */
    /* loaded from: classes3.dex */
    public static final class C8497b extends Lambda implements Function1<Pair<? extends EnumC32621Ei0, ? extends Boolean>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ FlowActivity f38237g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8497b(FlowActivity flowActivity) {
            super(1);
            this.f38237g = flowActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends EnumC32621Ei0, ? extends Boolean> pair) {
            invoke2((Pair<? extends EnumC32621Ei0, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends EnumC32621Ei0, Boolean> pair) {
            boolean booleanValue = pair.component2().booleanValue();
            this.f38237g.m56041p0(pair.component1(), booleanValue);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LGi0;", "kotlin.jvm.PlatformType", "reverseType", "", C17296a.f69688o, "(LGi0;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Uu1$c */
    /* loaded from: classes3.dex */
    public static final class C8498c extends Lambda implements Function1<EnumC33089Gi0, Unit> {

        /* renamed from: g */
        public final /* synthetic */ FlowActivity f38238g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8498c(FlowActivity flowActivity) {
            super(1);
            this.f38238g = flowActivity;
        }

        /* renamed from: a */
        public final void m80645a(EnumC33089Gi0 reverseType) {
            FlowActivity flowActivity = this.f38238g;
            Intrinsics.checkNotNullExpressionValue(reverseType, "reverseType");
            flowActivity.m56040q0(reverseType);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EnumC33089Gi0 enumC33089Gi0) {
            m80645a(enumC33089Gi0);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Uu1$d */
    /* loaded from: classes3.dex */
    public static final class C8499d extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public final /* synthetic */ FlowActivity f38239g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8499d(FlowActivity flowActivity) {
            super(1);
            this.f38239g = flowActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            this.f38239g.m56044m0();
        }
    }

    /* renamed from: B9 */
    public static final void m80652B9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D9 */
    public static final void m80651D9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E9 */
    public static final void m80650E9(FlowActivity checkoutActivity, Object obj) {
        Intrinsics.checkNotNullParameter(checkoutActivity, "$checkoutActivity");
        checkoutActivity.m56044m0();
    }

    /* renamed from: G9 */
    public static final void m80649G9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC44782lv1 interfaceC44782lv1 = this.f38236c;
        if (interfaceC44782lv1 != null) {
            interfaceC44782lv1.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String string;
        C32387Di0 m56046j0;
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type co.bird.android.library.flow.FlowActivity");
        FlowActivity flowActivity = (FlowActivity) activity;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("node_id")) == null || (m56046j0 = flowActivity.m56046j0(string)) == null) {
            return;
        }
        Function1<Context, View> m109997e = m56046j0.m109997e();
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        View invoke = m109997e.invoke(context);
        Function3<View, ScopeProvider, FlowActivity, InterfaceC44782lv1> m109999c = m56046j0.m109999c();
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        InterfaceC44782lv1 invoke2 = m109999c.invoke(invoke, m45197b, flowActivity);
        invoke2.onCreate(bundle);
        this.f38236c = invoke2;
        this.f38235b = invoke;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return this.f38235b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        InterfaceC44782lv1 interfaceC44782lv1 = this.f38236c;
        if (interfaceC44782lv1 != null) {
            interfaceC44782lv1.onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        InterfaceC44782lv1 interfaceC44782lv1 = this.f38236c;
        if (interfaceC44782lv1 != null) {
            interfaceC44782lv1.onLowMemory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        InterfaceC44782lv1 interfaceC44782lv1 = this.f38236c;
        if (interfaceC44782lv1 != null) {
            interfaceC44782lv1.onPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        InterfaceC44782lv1 interfaceC44782lv1 = this.f38236c;
        if (interfaceC44782lv1 != null) {
            interfaceC44782lv1.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        InterfaceC44782lv1 interfaceC44782lv1 = this.f38236c;
        if (interfaceC44782lv1 != null) {
            interfaceC44782lv1.onSaveInstanceState(outState);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type co.bird.android.library.flow.FlowActivity");
        final FlowActivity flowActivity = (FlowActivity) activity;
        InterfaceC44782lv1 interfaceC44782lv1 = this.f38236c;
        if (interfaceC44782lv1 != null) {
            AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
            Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
            Object m33094as = C24523e.f91168a.m31956a(interfaceC44782lv1.mo12m7(), interfaceC44782lv1.mo14g7()).m33094as(AutoDispose.m45239a(m45197b));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C8497b c8497b = new C8497b(flowActivity);
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Qu1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C36474Uu1.m80652B9(Function1.this, obj);
                }
            });
            Object m33094as2 = interfaceC44782lv1.mo11rc().m33094as(AutoDispose.m45239a(m45197b));
            Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C8498c c8498c = new C8498c(flowActivity);
            ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Ru1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C36474Uu1.m80651D9(Function1.this, obj);
                }
            });
            Object m33094as3 = interfaceC44782lv1.mo22Bk().m33094as(AutoDispose.m45239a(m45197b));
            Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Su1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C36474Uu1.m80650E9(FlowActivity.this, obj);
                }
            });
            Object m33094as4 = interfaceC44782lv1.mo10z5().m33094as(AutoDispose.m45239a(m45197b));
            Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C8499d c8499d = new C8499d(flowActivity);
            ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: Tu1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C36474Uu1.m80649G9(Function1.this, obj);
                }
            });
            interfaceC44782lv1.onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        InterfaceC44782lv1 interfaceC44782lv1 = this.f38236c;
        if (interfaceC44782lv1 != null) {
            interfaceC44782lv1.onStop();
        }
    }
}
