package com.stripe.android.link;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C11758t;
import androidx.lifecycle.C11759u;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkActivityViewModel;
import com.stripe.android.link.model.NavigatorKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\f\u001a\u00020\u0004H\u0014J\b\u0010\r\u001a\u00020\u0004H\u0016R(\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR(\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b$\u0010\u0016\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010(¨\u0006+"}, m28432d2 = {"Lcom/stripe/android/link/LinkActivity;", "Landroidx/activity/ComponentActivity;", "Lcom/stripe/android/link/LinkActivityResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "dismiss", "LEu1;", "", "isRootScreenFlow", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "finish", "Landroidx/lifecycle/u$b;", "viewModelFactory", "Landroidx/lifecycle/u$b;", "getViewModelFactory$link_release", "()Landroidx/lifecycle/u$b;", "setViewModelFactory$link_release", "(Landroidx/lifecycle/u$b;)V", "getViewModelFactory$link_release$annotations", "()V", "Lcom/stripe/android/link/LinkActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/stripe/android/link/LinkActivityViewModel;", "viewModel", "LOY2;", "navController", "LOY2;", "getNavController", "()LOY2;", "setNavController", "(LOY2;)V", "getNavController$annotations", "Lcom/stripe/android/link/LinkActivityContract$Args;", "starterArgs$delegate", "getStarterArgs", "()Lcom/stripe/android/link/LinkActivityContract$Args;", "starterArgs", "<init>", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLinkActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkActivity.kt\ncom/stripe/android/link/LinkActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,276:1\n75#2,13:277\n47#3:290\n49#3:294\n50#4:291\n55#4:293\n106#5:292\n*S KotlinDebug\n*F\n+ 1 LinkActivity.kt\ncom/stripe/android/link/LinkActivity\n*L\n66#1:277,13\n274#1:290\n274#1:294\n274#1:291\n274#1:293\n274#1:292\n*E\n"})
/* loaded from: classes7.dex */
public final class LinkActivity extends ComponentActivity {
    public OY2 navController;
    private final Lazy starterArgs$delegate;
    private C11759u.InterfaceC11763b viewModelFactory = new LinkActivityViewModel.Factory(new LinkActivity$viewModelFactory$1(this));
    private final Lazy viewModel$delegate = new C11758t(Reflection.getOrCreateKotlinClass(LinkActivityViewModel.class), new LinkActivity$special$$inlined$viewModels$default$2(this), new LinkActivity$viewModel$2(this), new LinkActivity$special$$inlined$viewModels$default$3(null, this));

    public LinkActivity() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new LinkActivity$starterArgs$2(this));
        this.starterArgs$delegate = lazy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismiss(LinkActivityResult linkActivityResult) {
        setResult(linkActivityResult.getResultCode(), new Intent().putExtras(new LinkActivityContract.Result(linkActivityResult).toBundle()));
        finish();
    }

    public static /* synthetic */ void getNavController$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkActivityContract.Args getStarterArgs() {
        return (LinkActivityContract.Args) this.starterArgs$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkActivityViewModel getViewModel() {
        return (LinkActivityViewModel) this.viewModel$delegate.getValue();
    }

    public static /* synthetic */ void getViewModelFactory$link_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC32730Eu1<Boolean> isRootScreenFlow() {
        final InterfaceC32730Eu1<AY2> m110201z = getNavController().m110201z();
        return new InterfaceC32730Eu1<Boolean>() { // from class: com.stripe.android.link.LinkActivity$isRootScreenFlow$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 LinkActivity.kt\ncom/stripe/android/link/LinkActivity\n*L\n1#1,222:1\n48#2:223\n274#3:224\n*E\n"})
            /* renamed from: com.stripe.android.link.LinkActivity$isRootScreenFlow$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C189562<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                final /* synthetic */ LinkActivity this$0;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.link.LinkActivity$isRootScreenFlow$$inlined$map$1$2", m28418f = "LinkActivity.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.link.LinkActivity$isRootScreenFlow$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C189571 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C189571(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C189562.this.emit(null, this);
                    }
                }

                public C189562(InterfaceC33198Gu1 interfaceC33198Gu1, LinkActivity linkActivity) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                    this.this$0 = linkActivity;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C189571 c189571;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C189571) {
                        c189571 = (C189571) continuation;
                        int i2 = c189571.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c189571.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c189571.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c189571.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                AY2 ay2 = (AY2) obj;
                                Boolean boxBoolean = Boxing.boxBoolean(NavigatorKt.isOnRootScreen(this.this$0.getNavController()));
                                c189571.label = 1;
                                if (interfaceC33198Gu1.emit(boxBoolean, c189571) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c189571 = new C189571(continuation);
                    Object obj22 = c189571.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c189571.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super Boolean> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C189562(interfaceC33198Gu1, this), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, C18975R.anim.slide_down);
    }

    public final OY2 getNavController() {
        OY2 oy2 = this.navController;
        if (oy2 != null) {
            return oy2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navController");
        return null;
    }

    public final C11759u.InterfaceC11763b getViewModelFactory$link_release() {
        return this.viewModelFactory;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(C18975R.anim.slide_up, 0);
        C34583Ms0.m94672b(this, null, C43575jt0.m29790c(1514588233, true, new LinkActivity$onCreate$1(this)), 1, null);
        getViewModel().getNavigator().setOnDismiss(new LinkActivity$onCreate$2(this));
        getViewModel().setupPaymentLauncher(this);
        getWindow().getDecorView().getRootView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.stripe.android.link.LinkActivity$onCreate$3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                Z30.m73800d(C33163Gq2.m104689a(LinkActivity.this), null, null, new LinkActivity$onCreate$3$onGlobalLayout$1(LinkActivity.this, null), 3, null);
                LinkActivity.this.getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getViewModel().unregisterFromActivity();
    }

    public final void setNavController(OY2 oy2) {
        Intrinsics.checkNotNullParameter(oy2, "<set-?>");
        this.navController = oy2;
    }

    public final void setViewModelFactory$link_release(C11759u.InterfaceC11763b interfaceC11763b) {
        Intrinsics.checkNotNullParameter(interfaceC11763b, "<set-?>");
        this.viewModelFactory = interfaceC11763b;
    }
}
