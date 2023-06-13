package com.stripe.android.financialconnections.p041ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.p003ui.platform.C11411h;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.domain.GoNextKt;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetNativeActivityArgs;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.NavigationDirections;
import com.stripe.android.financialconnections.navigation.NavigationManager;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.utils.MavericksExtensionsKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty1;
import p000.InterfaceC32720Et0;
import p000.NN2;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001@B\u0007¢\u0006\u0004\b>\u0010?J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u000f\u001a\u00020\u0007*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001c\u001a\u00020\u0007H\u0014R\u001d\u0010\"\u001a\u0004\u0018\u00010\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00101\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00108\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006A"}, m28432d2 = {"Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "LNN2;", "LOY2;", "navController", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "", "BackHandler", "(LOY2;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;LEt0;I)V", "LaunchedPane", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;LEt0;I)V", "NavigationEffect", "(LOY2;LEt0;I)V", "LUY2;", "popUpIfNotBackwardsNavigable", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "invalidate", "initialPane", "", "reducedBranding", "NavHost", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLEt0;I)V", "Landroid/content/Intent;", "intent", "onNewIntent", "onResume", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;", "args$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getArgs", "()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;", "args", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;", "viewModel", "Lcom/stripe/android/financialconnections/navigation/NavigationManager;", "navigationManager", "Lcom/stripe/android/financialconnections/navigation/NavigationManager;", "getNavigationManager", "()Lcom/stripe/android/financialconnections/navigation/NavigationManager;", "setNavigationManager", "(Lcom/stripe/android/financialconnections/navigation/NavigationManager;)V", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "getLogger", "()Lcom/stripe/android/core/Logger;", "setLogger", "(Lcom/stripe/android/core/Logger;)V", "Lcom/stripe/android/uicore/image/StripeImageLoader;", "imageLoader", "Lcom/stripe/android/uicore/image/StripeImageLoader;", "getImageLoader", "()Lcom/stripe/android/uicore/image/StripeImageLoader;", "setImageLoader", "(Lcom/stripe/android/uicore/image/StripeImageLoader;)V", "<init>", "()V", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFinancialConnectionsSheetNativeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSheetNativeActivity.kt\ncom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity\n+ 2 MavericksExtensions.kt\ncom/stripe/android/financialconnections/utils/MavericksExtensionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,283:1\n26#2,11:284\n76#3:295\n25#4:296\n36#4:303\n1057#5,6:297\n1057#5,6:304\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsSheetNativeActivity.kt\ncom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity\n*L\n59#1:284,11\n138#1:295\n140#1:296\n142#1:303\n140#1:297,6\n142#1:304,6\n*E\n"})
/* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity */
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetNativeActivity extends AppCompatActivity implements NN2 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(FinancialConnectionsSheetNativeActivity.class, "args", "getArgs()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;", 0))};
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_RESULT = "result";
    private final ReadOnlyProperty args$delegate = MavericksExtensionsKt.argsOrNull();
    public StripeImageLoader imageLoader;
    public Logger logger;
    public NavigationManager navigationManager;
    private final Lazy viewModel$delegate;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$Companion;", "", "()V", "EXTRA_RESULT", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FinancialConnectionsSheetNativeActivity() {
        Lazy lazy;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FinancialConnectionsSheetNativeViewModel.class);
        lazy = LazyKt__LazyJVMKt.lazy(new C18911x710780bb(orCreateKotlinClass, this, orCreateKotlinClass));
        this.viewModel$delegate = lazy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void BackHandler(OY2 oy2, FinancialConnectionsSessionManifest.Pane pane, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-151036495);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-151036495, i, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.BackHandler (FinancialConnectionsSheetNativeActivity.kt:208)");
        }
        C7582Sv.m84651a(true, new FinancialConnectionsSheetNativeActivity$BackHandler$1(this, pane, oy2), mo89518u, 6, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new FinancialConnectionsSheetNativeActivity$BackHandler$2(this, oy2, pane, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void LaunchedPane(FinancialConnectionsSessionManifest.Pane pane, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1585663943);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1585663943, i, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.LaunchedPane (FinancialConnectionsSheetNativeActivity.kt:216)");
        }
        Y91.m75533f(Unit.INSTANCE, new FinancialConnectionsSheetNativeActivity$LaunchedPane$1(this, pane, null), mo89518u, 70);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new FinancialConnectionsSheetNativeActivity$LaunchedPane$2(this, pane, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void NavigationEffect(OY2 oy2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1611006371);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1611006371, i, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavigationEffect (FinancialConnectionsSheetNativeActivity.kt:236)");
        }
        Y91.m75533f(getNavigationManager().getCommands(), new FinancialConnectionsSheetNativeActivity$NavigationEffect$1(this, oy2, null), mo89518u, 72);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new FinancialConnectionsSheetNativeActivity$NavigationEffect$2(this, oy2, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void popUpIfNotBackwardsNavigable(UY2 uy2, OY2 oy2) {
        HY2 m115582f;
        String m103771w;
        List listOf;
        String str;
        boolean contains;
        AY2 m110202y = oy2.m110202y();
        if (m110202y != null && (m115582f = m110202y.m115582f()) != null && (m103771w = m115582f.m103771w()) != null) {
            NavigationDirections navigationDirections = NavigationDirections.INSTANCE;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{navigationDirections.getPartnerAuth().getDestination(), navigationDirections.getReset().getDestination()});
            List list = listOf;
            HY2 m110261A = oy2.m110261A();
            if (m110261A != null) {
                str = m110261A.m103771w();
            } else {
                str = null;
            }
            contains = CollectionsKt___CollectionsKt.contains(list, str);
            if (contains) {
                uy2.m81361d(m103771w, C18928x7aa57a8d.INSTANCE);
            }
        }
    }

    public final void NavHost(FinancialConnectionsSessionManifest.Pane initialPane, boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Map emptyMap;
        Intrinsics.checkNotNullParameter(initialPane, "initialPane");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(915147200);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(915147200, i, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost (FinancialConnectionsSheetNativeActivity.kt:133)");
        }
        Context context = (Context) mo89518u.mo89572c(C11411h.m68324g());
        OY2 m90122e = PY2.m90122e(new AbstractC39507d13[0], mo89518u, 8);
        mo89518u.mo89638F(-492369756);
        Object mo89635G = mo89518u.mo89635G();
        InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
        if (mo89635G == c2012a.m108267a()) {
            mo89635G = new CustomTabUriHandler(context);
            mo89518u.mo89503z(mo89635G);
        }
        mo89518u.mo89605Q();
        CustomTabUriHandler customTabUriHandler = (CustomTabUriHandler) mo89635G;
        mo89518u.mo89638F(1157296644);
        boolean mo89539n = mo89518u.mo89539n(initialPane);
        Object mo89635G2 = mo89518u.mo89635G();
        if (mo89539n || mo89635G2 == c2012a.m108267a()) {
            Logger logger = getLogger();
            emptyMap = MapsKt__MapsKt.emptyMap();
            mo89635G2 = GoNextKt.toNavigationCommand(initialPane, logger, emptyMap).getDestination();
            mo89518u.mo89503z(mo89635G2);
        }
        mo89518u.mo89605Q();
        NavigationEffect(m90122e, mo89518u, 72);
        C41806gu0.m37353a(new W94[]{FinancialConnectionsSheetNativeActivityKt.getLocalReducedBranding().m81907c(Boolean.valueOf(z)), FinancialConnectionsSheetNativeActivityKt.getLocalNavHostController().m81907c(m90122e), FinancialConnectionsSheetNativeActivityKt.getLocalImageLoader().m81907c(getImageLoader()), C42399hu0.m35603p().m81907c(customTabUriHandler)}, C43575jt0.m29791b(mo89518u, -789697280, true, new FinancialConnectionsSheetNativeActivity$NavHost$1(m90122e, (String) mo89635G2, this)), mo89518u, 56);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new FinancialConnectionsSheetNativeActivity$NavHost$2(this, initialPane, z, i));
        }
    }

    public <T> InterfaceC52943zh2 collectLatest(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, AbstractC37698a01 abstractC37698a01, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return NN2.C5563a.m94001a(this, interfaceC32730Eu1, abstractC37698a01, function2);
    }

    public final FinancialConnectionsSheetNativeActivityArgs getArgs() {
        return (FinancialConnectionsSheetNativeActivityArgs) this.args$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final StripeImageLoader getImageLoader() {
        StripeImageLoader stripeImageLoader = this.imageLoader;
        if (stripeImageLoader != null) {
            return stripeImageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final Logger getLogger() {
        Logger logger = this.logger;
        if (logger != null) {
            return logger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("logger");
        return null;
    }

    @Override // p000.NN2
    public ON2 getMavericksViewInternalViewModel() {
        return NN2.C5563a.m94000b(this);
    }

    @Override // p000.NN2
    public String getMvrxViewId() {
        return NN2.C5563a.m93999c(this);
    }

    public final NavigationManager getNavigationManager() {
        NavigationManager navigationManager = this.navigationManager;
        if (navigationManager != null) {
            return navigationManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigationManager");
        return null;
    }

    @Override // p000.NN2
    public LifecycleOwner getSubscriptionLifecycleOwner() {
        return NN2.C5563a.m93998d(this);
    }

    public final FinancialConnectionsSheetNativeViewModel getViewModel() {
        return (FinancialConnectionsSheetNativeViewModel) this.viewModel$delegate.getValue();
    }

    @Override // p000.NN2
    public void invalidate() {
        C36686Vr6.m79329a(getViewModel(), new FinancialConnectionsSheetNativeActivity$invalidate$1(this));
    }

    public <S extends AN2, T> InterfaceC52943zh2 onAsync(RN2<S> rn2, KProperty1<S, ? extends AbstractC19862dp<? extends T>> kProperty1, AbstractC37698a01 abstractC37698a01, Function2<? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function2, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function22) {
        return NN2.C5563a.m93997e(this, rn2, kProperty1, abstractC37698a01, function2, function22);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArgs() == null) {
            finish();
            return;
        }
        getViewModel().getActivityRetainedComponent().inject(this);
        NN2.C5563a.m93988n(this, getViewModel(), null, new FinancialConnectionsSheetNativeActivity$onCreate$1(this, null), 1, null);
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "onBackPressedDispatcher");
        C38677bf3.m64201b(onBackPressedDispatcher, null, false, new FinancialConnectionsSheetNativeActivity$onCreate$2(this), 3, null);
        C34583Ms0.m94672b(this, null, C43575jt0.m29790c(-131864197, true, new FinancialConnectionsSheetNativeActivity$onCreate$3(this)), 1, null);
    }

    @Override // p000.NN2
    public <S extends AN2> InterfaceC52943zh2 onEach(RN2<S> rn2, AbstractC37698a01 abstractC37698a01, Function2<? super S, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return NN2.C5563a.m93996f(this, rn2, abstractC37698a01, function2);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        getViewModel().handleOnNewIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getViewModel().onResume();
    }

    public void postInvalidate() {
        NN2.C5563a.m93987o(this);
    }

    public final void setImageLoader(StripeImageLoader stripeImageLoader) {
        Intrinsics.checkNotNullParameter(stripeImageLoader, "<set-?>");
        this.imageLoader = stripeImageLoader;
    }

    public final void setLogger(Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "<set-?>");
        this.logger = logger;
    }

    public final void setNavigationManager(NavigationManager navigationManager) {
        Intrinsics.checkNotNullParameter(navigationManager, "<set-?>");
        this.navigationManager = navigationManager;
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
