package com.stripe.android.financialconnections;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AppCompatActivity;
import com.stripe.android.financialconnections.FinancialConnectionsSheetActivity;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.financialconnections.p041ui.theme.ThemeKt;
import com.stripe.android.financialconnections.utils.MavericksExtensionsKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty1;
import p000.NN2;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\f\u001a\u00020\u0003H\u0014J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u0010\u001a\u00020\u0003H\u0016R\u001b\u0010\u0016\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\r0\r0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010!\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\r0\r0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006$"}, m28432d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "LNN2;", "", "Loading", "(LEt0;I)V", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "finishWithResult", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "Landroid/content/Intent;", "intent", "onNewIntent", "invalidate", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;", "viewModel", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "args$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getArgs", "()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "args", "LB5;", "kotlin.jvm.PlatformType", "startBrowserForResult", "LB5;", "startNativeAuthFlowForResult", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFinancialConnectionsSheetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSheetActivity.kt\ncom/stripe/android/financialconnections/FinancialConnectionsSheetActivity\n+ 2 MavericksExtensions.kt\ncom/stripe/android/financialconnections/utils/MavericksExtensionsKt\n*L\n1#1,129:1\n26#2,11:130\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsSheetActivity.kt\ncom/stripe/android/financialconnections/FinancialConnectionsSheetActivity\n*L\n33#1:130,11\n*E\n"})
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetActivity extends AppCompatActivity implements NN2 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(FinancialConnectionsSheetActivity.class, "args", "getArgs()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", 0))};
    private final ReadOnlyProperty args$delegate;
    private final AbstractC0407B5<Intent> startBrowserForResult;
    private final AbstractC0407B5<Intent> startNativeAuthFlowForResult;
    private final Lazy viewModel$delegate;

    public FinancialConnectionsSheetActivity() {
        Lazy lazy;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FinancialConnectionsSheetViewModel.class);
        lazy = LazyKt__LazyJVMKt.lazy(new C18625xe53119d2(orCreateKotlinClass, this, orCreateKotlinClass));
        this.viewModel$delegate = lazy;
        this.args$delegate = MavericksExtensionsKt.argsOrNull();
        AbstractC0407B5<Intent> registerForActivityResult = registerForActivityResult(new C30903z5(), new InterfaceC28515t5() { // from class: am1
            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(Object obj) {
                FinancialConnectionsSheetActivity.startBrowserForResult$lambda$0(FinancialConnectionsSheetActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…serActivityResult()\n    }");
        this.startBrowserForResult = registerForActivityResult;
        AbstractC0407B5<Intent> registerForActivityResult2 = registerForActivityResult(new C30903z5(), new InterfaceC28515t5() { // from class: bm1
            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(Object obj) {
                FinancialConnectionsSheetActivity.startNativeAuthFlowForResult$lambda$1(FinancialConnectionsSheetActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult2, "registerForActivityResul…eAuthFlowResult(it)\n    }");
        this.startNativeAuthFlowForResult = registerForActivityResult2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Loading(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1849528791);
        if ((i & 1) == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1849528791, i, -1, "com.stripe.android.financialconnections.FinancialConnectionsSheetActivity.Loading (FinancialConnectionsSheetActivity.kt:60)");
            }
            ThemeKt.FinancialConnectionsTheme(ComposableSingletons$FinancialConnectionsSheetActivityKt.INSTANCE.m116343getLambda1$financial_connections_release(), mo89518u, 6);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new FinancialConnectionsSheetActivity$Loading$1(this, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult) {
        setResult(-1, new Intent().putExtras(financialConnectionsSheetActivityResult.toBundle()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startBrowserForResult$lambda$0(FinancialConnectionsSheetActivity this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onBrowserActivityResult$financial_connections_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startNativeAuthFlowForResult$lambda$1(FinancialConnectionsSheetActivity this$0, ActivityResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FinancialConnectionsSheetViewModel viewModel = this$0.getViewModel();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        viewModel.onNativeAuthFlowResult$financial_connections_release(it);
    }

    public <T> InterfaceC52943zh2 collectLatest(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, AbstractC37698a01 abstractC37698a01, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return NN2.C5563a.m94001a(this, interfaceC32730Eu1, abstractC37698a01, function2);
    }

    public final FinancialConnectionsSheetActivityArgs getArgs() {
        return (FinancialConnectionsSheetActivityArgs) this.args$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // p000.NN2
    public ON2 getMavericksViewInternalViewModel() {
        return NN2.C5563a.m94000b(this);
    }

    @Override // p000.NN2
    public String getMvrxViewId() {
        return NN2.C5563a.m93999c(this);
    }

    @Override // p000.NN2
    public LifecycleOwner getSubscriptionLifecycleOwner() {
        return NN2.C5563a.m93998d(this);
    }

    public final FinancialConnectionsSheetViewModel getViewModel() {
        return (FinancialConnectionsSheetViewModel) this.viewModel$delegate.getValue();
    }

    @Override // p000.NN2
    public void invalidate() {
        C36686Vr6.m79329a(getViewModel(), new FinancialConnectionsSheetActivity$invalidate$1(this));
    }

    public <S extends AN2, T> InterfaceC52943zh2 onAsync(RN2<S> rn2, KProperty1<S, ? extends AbstractC19862dp<? extends T>> kProperty1, AbstractC37698a01 abstractC37698a01, Function2<? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function2, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function22) {
        return NN2.C5563a.m93997e(this, rn2, kProperty1, abstractC37698a01, function2, function22);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArgs() == null) {
            finish();
        } else {
            NN2.C5563a.m93988n(this, getViewModel(), null, new FinancialConnectionsSheetActivity$onCreate$1(this, null), 1, null);
            if (bundle != null) {
                getViewModel().onActivityRecreated$financial_connections_release();
            }
        }
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "onBackPressedDispatcher");
        C38677bf3.m64201b(onBackPressedDispatcher, null, false, new FinancialConnectionsSheetActivity$onCreate$2(this), 3, null);
        C34583Ms0.m94672b(this, null, C43575jt0.m29790c(906787691, true, new FinancialConnectionsSheetActivity$onCreate$3(this)), 1, null);
    }

    @Override // p000.NN2
    public <S extends AN2> InterfaceC52943zh2 onEach(RN2<S> rn2, AbstractC37698a01 abstractC37698a01, Function2<? super S, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return NN2.C5563a.m93996f(this, rn2, abstractC37698a01, function2);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        getViewModel().handleOnNewIntent$financial_connections_release(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getViewModel().onResume$financial_connections_release();
    }

    public void postInvalidate() {
        NN2.C5563a.m93987o(this);
    }

    public C35624Rd6 uniqueOnly(String str) {
        return NN2.C5563a.m93986p(this, str);
    }

    public <S extends AN2, A> InterfaceC52943zh2 onEach(RN2<S> rn2, KProperty1<S, ? extends A> kProperty1, AbstractC37698a01 abstractC37698a01, Function2<? super A, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return NN2.C5563a.m93995g(this, rn2, kProperty1, abstractC37698a01, function2);
    }

    public <S extends AN2, A, B> InterfaceC52943zh2 onEach(RN2<S> rn2, KProperty1<S, ? extends A> kProperty1, KProperty1<S, ? extends B> kProperty12, AbstractC37698a01 abstractC37698a01, Function3<? super A, ? super B, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return NN2.C5563a.m93994h(this, rn2, kProperty1, kProperty12, abstractC37698a01, function3);
    }

    public <S extends AN2, A, B, C> InterfaceC52943zh2 onEach(RN2<S> rn2, KProperty1<S, ? extends A> kProperty1, KProperty1<S, ? extends B> kProperty12, KProperty1<S, ? extends C> kProperty13, AbstractC37698a01 abstractC37698a01, Function4<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends Object> function4) {
        return NN2.C5563a.m93993i(this, rn2, kProperty1, kProperty12, kProperty13, abstractC37698a01, function4);
    }

    public <S extends AN2, A, B, C, D> InterfaceC52943zh2 onEach(RN2<S> rn2, KProperty1<S, ? extends A> kProperty1, KProperty1<S, ? extends B> kProperty12, KProperty1<S, ? extends C> kProperty13, KProperty1<S, ? extends D> kProperty14, AbstractC37698a01 abstractC37698a01, Function5<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends Object> function5) {
        return NN2.C5563a.m93992j(this, rn2, kProperty1, kProperty12, kProperty13, kProperty14, abstractC37698a01, function5);
    }

    public <S extends AN2, A, B, C, D, E> InterfaceC52943zh2 onEach(RN2<S> rn2, KProperty1<S, ? extends A> kProperty1, KProperty1<S, ? extends B> kProperty12, KProperty1<S, ? extends C> kProperty13, KProperty1<S, ? extends D> kProperty14, KProperty1<S, ? extends E> kProperty15, AbstractC37698a01 abstractC37698a01, Function6<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends Object> function6) {
        return NN2.C5563a.m93991k(this, rn2, kProperty1, kProperty12, kProperty13, kProperty14, kProperty15, abstractC37698a01, function6);
    }

    public <S extends AN2, A, B, C, D, E, F> InterfaceC52943zh2 onEach(RN2<S> rn2, KProperty1<S, ? extends A> kProperty1, KProperty1<S, ? extends B> kProperty12, KProperty1<S, ? extends C> kProperty13, KProperty1<S, ? extends D> kProperty14, KProperty1<S, ? extends E> kProperty15, KProperty1<S, ? extends F> kProperty16, AbstractC37698a01 abstractC37698a01, Function7<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends Object> function7) {
        return NN2.C5563a.m93990l(this, rn2, kProperty1, kProperty12, kProperty13, kProperty14, kProperty15, kProperty16, abstractC37698a01, function7);
    }

    public <S extends AN2, A, B, C, D, E, F, G> InterfaceC52943zh2 onEach(RN2<S> rn2, KProperty1<S, ? extends A> kProperty1, KProperty1<S, ? extends B> kProperty12, KProperty1<S, ? extends C> kProperty13, KProperty1<S, ? extends D> kProperty14, KProperty1<S, ? extends E> kProperty15, KProperty1<S, ? extends F> kProperty16, KProperty1<S, ? extends G> kProperty17, AbstractC37698a01 abstractC37698a01, Function8<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super Continuation<? super Unit>, ? extends Object> function8) {
        return NN2.C5563a.m93989m(this, rn2, kProperty1, kProperty12, kProperty13, kProperty14, kProperty15, kProperty16, kProperty17, abstractC37698a01, function8);
    }
}
