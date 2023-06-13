package com.stripe.android.paymentsheet.addresselement;

import android.os.Bundle;
import com.stripe.android.paymentsheet.addresselement.AddressElementScreen;
import com.stripe.android.uicore.StripeThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32720Et0;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "invoke", "(LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAddressElementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressElementActivity.kt\ncom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,163:1\n474#2,4:164\n478#2,2:172\n482#2:178\n25#3:168\n36#3:179\n1057#4,3:169\n1060#4,3:175\n1057#4,6:180\n474#5:174\n*S KotlinDebug\n*F\n+ 1 AddressElementActivity.kt\ncom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2\n*L\n81#1:164,4\n81#1:172,2\n81#1:178\n81#1:168\n83#1:179\n81#1:169,3\n81#1:175,3\n83#1:180,6\n81#1:174\n*E\n"})
/* loaded from: classes7.dex */
public final class AddressElementActivity$onCreate$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ AddressElementActivity this$0;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.addresselement.AddressElementActivity$onCreate$2$2", m28418f = "AddressElementActivity.kt", m28417i = {}, m28416l = {90}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$onCreate$2$2 */
    /* loaded from: classes7.dex */
    public static final class C191642 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        final /* synthetic */ GU2 $modalBottomSheetState;
        int label;
        final /* synthetic */ AddressElementActivity this$0;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$onCreate$2$2$1 */
        /* loaded from: classes7.dex */
        public static final class C191651 extends Lambda implements Function0<HU2> {
            final /* synthetic */ GU2 $modalBottomSheetState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C191651(GU2 gu2) {
                super(0);
                this.$modalBottomSheetState = gu2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final HU2 invoke() {
                return (HU2) this.$modalBottomSheetState.getCurrentValue();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191642(GU2 gu2, AddressElementActivity addressElementActivity, Continuation<? super C191642> continuation) {
            super(2, continuation);
            this.$modalBottomSheetState = gu2;
            this.this$0 = addressElementActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C191642(this.$modalBottomSheetState, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C191642) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC32730Eu1 m79254q = C36708Vu1.m79254q(GM5.m105192o(new C191651(this.$modalBottomSheetState)), 1);
                final AddressElementActivity addressElementActivity = this.this$0;
                InterfaceC33198Gu1<HU2> interfaceC33198Gu1 = new InterfaceC33198Gu1<HU2>() { // from class: com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.2.2.2
                    @Override // p000.InterfaceC33198Gu1
                    public /* bridge */ /* synthetic */ Object emit(HU2 hu2, Continuation continuation) {
                        return emit2(hu2, (Continuation<? super Unit>) continuation);
                    }

                    /* renamed from: emit  reason: avoid collision after fix types in other method */
                    public final Object emit2(HU2 hu2, Continuation<? super Unit> continuation) {
                        if (hu2 == HU2.Hidden) {
                            AddressElementActivity.this.finish();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (m79254q.collect(interfaceC33198Gu1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$onCreate$2$3 */
    /* loaded from: classes7.dex */
    public static final class C191673 extends Lambda implements Function1<AddressLauncherResult, Unit> {
        final /* synthetic */ ZC0 $coroutineScope;
        final /* synthetic */ GU2 $modalBottomSheetState;
        final /* synthetic */ AddressElementActivity this$0;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.addresselement.AddressElementActivity$onCreate$2$3$1", m28418f = "AddressElementActivity.kt", m28417i = {}, m28416l = {101}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$onCreate$2$3$1 */
        /* loaded from: classes7.dex */
        public static final class C191681 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
            final /* synthetic */ GU2 $modalBottomSheetState;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C191681(GU2 gu2, Continuation<? super C191681> continuation) {
                super(2, continuation);
                this.$modalBottomSheetState = gu2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C191681(this.$modalBottomSheetState, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C191681) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    GU2 gu2 = this.$modalBottomSheetState;
                    this.label = 1;
                    if (gu2.m105061i(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191673(AddressElementActivity addressElementActivity, ZC0 zc0, GU2 gu2) {
            super(1);
            this.this$0 = addressElementActivity;
            this.$coroutineScope = zc0;
            this.$modalBottomSheetState = gu2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AddressLauncherResult addressLauncherResult) {
            invoke2(addressLauncherResult);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(AddressLauncherResult it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.this$0.setResult(it);
            Z30.m73800d(this.$coroutineScope, null, null, new C191681(this.$modalBottomSheetState, null), 3, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$onCreate$2$4 */
    /* loaded from: classes7.dex */
    public static final class C191694 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ GU2 $modalBottomSheetState;
        final /* synthetic */ AddressElementActivity this$0;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$onCreate$2$4$1 */
        /* loaded from: classes7.dex */
        public static final class C191701 extends Lambda implements Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> {
            final /* synthetic */ AddressElementActivity this$0;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$onCreate$2$4$1$1 */
            /* loaded from: classes7.dex */
            public static final class C191711 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
                final /* synthetic */ AddressElementActivity this$0;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$onCreate$2$4$1$1$1 */
                /* loaded from: classes7.dex */
                public static final class C191721 extends Lambda implements Function1<KY2, Unit> {
                    final /* synthetic */ AddressElementActivity this$0;

                    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                    /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$onCreate$2$4$1$1$1$1 */
                    /* loaded from: classes7.dex */
                    public static final class C191731 extends Lambda implements Function4<InterfaceC7907Te, AY2, InterfaceC32720Et0, Integer, Unit> {
                        final /* synthetic */ AddressElementActivity this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C191731(AddressElementActivity addressElementActivity) {
                            super(4);
                            this.this$0 = addressElementActivity;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC7907Te interfaceC7907Te, AY2 ay2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                            invoke(interfaceC7907Te, ay2, interfaceC32720Et0, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(InterfaceC7907Te composable, AY2 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
                            AddressElementViewModel viewModel;
                            Intrinsics.checkNotNullParameter(composable, "$this$composable");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87816Z(486220124, i, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressElementActivity.kt:115)");
                            }
                            viewModel = this.this$0.getViewModel();
                            InputAddressScreenKt.InputAddressScreen(viewModel.getInjector(), interfaceC32720Et0, 8);
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87817Y();
                            }
                        }
                    }

                    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                    /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$onCreate$2$4$1$1$1$2 */
                    /* loaded from: classes7.dex */
                    public static final class C191742 extends Lambda implements Function1<C52855zY2, Unit> {
                        public static final C191742 INSTANCE = new C191742();

                        public C191742() {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(C52855zY2 c52855zY2) {
                            invoke2(c52855zY2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(C52855zY2 navArgument) {
                            Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
                            navArgument.m1178b(WY2.f41280m);
                        }
                    }

                    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                    /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$onCreate$2$4$1$1$1$3 */
                    /* loaded from: classes7.dex */
                    public static final class C191753 extends Lambda implements Function4<InterfaceC7907Te, AY2, InterfaceC32720Et0, Integer, Unit> {
                        final /* synthetic */ AddressElementActivity this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C191753(AddressElementActivity addressElementActivity) {
                            super(4);
                            this.this$0 = addressElementActivity;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC7907Te interfaceC7907Te, AY2 ay2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                            invoke(interfaceC7907Te, ay2, interfaceC32720Et0, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(InterfaceC7907Te composable, AY2 backStackEntry, InterfaceC32720Et0 interfaceC32720Et0, int i) {
                            AddressElementViewModel viewModel;
                            Intrinsics.checkNotNullParameter(composable, "$this$composable");
                            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87816Z(-331062907, i, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressElementActivity.kt:125)");
                            }
                            Bundle m115584d = backStackEntry.m115584d();
                            String string = m115584d != null ? m115584d.getString("country") : null;
                            viewModel = this.this$0.getViewModel();
                            AutocompleteScreenKt.AutocompleteScreen(viewModel.getInjector(), string, interfaceC32720Et0, 8);
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87817Y();
                            }
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C191721(AddressElementActivity addressElementActivity) {
                        super(1);
                        this.this$0 = addressElementActivity;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KY2 ky2) {
                        invoke2(ky2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(KY2 AnimatedNavHost) {
                        List listOf;
                        Intrinsics.checkNotNullParameter(AnimatedNavHost, "$this$AnimatedNavHost");
                        LY2.m96640b(AnimatedNavHost, AddressElementScreen.InputAddress.INSTANCE.getRoute(), null, null, null, null, null, null, C43575jt0.m29790c(486220124, true, new C191731(this.this$0)), 126, null);
                        listOf = CollectionsKt__CollectionsJVMKt.listOf(C45741nY2.m23553a("country", C191742.INSTANCE));
                        LY2.m96640b(AnimatedNavHost, AddressElementScreen.Autocomplete.route, listOf, null, null, null, null, null, C43575jt0.m29790c(-331062907, true, new C191753(this.this$0)), 124, null);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C191711(AddressElementActivity addressElementActivity) {
                    super(2);
                    this.this$0 = addressElementActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                    invoke(interfaceC32720Et0, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                    OY2 oy2;
                    if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                        interfaceC32720Et0.mo89548k();
                        return;
                    }
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87816Z(682978012, i, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressElementActivity.kt:110)");
                    }
                    oy2 = this.this$0.navController;
                    if (oy2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("navController");
                        oy2 = null;
                    }
                    C6817Qe.m88303b(oy2, AddressElementScreen.InputAddress.INSTANCE.getRoute(), null, null, null, null, null, null, null, new C191721(this.this$0), interfaceC32720Et0, 8, 508);
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C191701(AddressElementActivity addressElementActivity) {
                super(3);
                this.this$0 = addressElementActivity;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC35231Pm0 interfaceC35231Pm0, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(interfaceC35231Pm0, interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC35231Pm0 ModalBottomSheetLayout, InterfaceC32720Et0 interfaceC32720Et0, int i) {
                Intrinsics.checkNotNullParameter(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
                    interfaceC32720Et0.mo89548k();
                    return;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-2060363624, i, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (AddressElementActivity.kt:107)");
                }
                NV5.m93838a(BB5.m114257l(InterfaceC41563gV2.f82354b0, 0.0f, 1, null), null, 0L, 0L, null, 0.0f, C43575jt0.m29791b(interfaceC32720Et0, 682978012, true, new C191711(this.this$0)), interfaceC32720Et0, 1572870, 62);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191694(GU2 gu2, AddressElementActivity addressElementActivity) {
            super(2);
            this.$modalBottomSheetState = gu2;
            this.this$0 = addressElementActivity;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1044576262, i, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous>.<anonymous> (AddressElementActivity.kt:104)");
            }
            FU2.m107111c(C43575jt0.m29791b(interfaceC32720Et0, -2060363624, true, new C191701(this.this$0)), C47326qC6.m17906c(C47326qC6.m17907b(InterfaceC41563gV2.f82354b0)), this.$modalBottomSheetState, null, 0.0f, 0L, 0L, 0L, ComposableSingletons$AddressElementActivityKt.INSTANCE.m116606getLambda1$paymentsheet_release(), interfaceC32720Et0, 100663302, 248);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressElementActivity$onCreate$2(AddressElementActivity addressElementActivity) {
        super(2);
        this.this$0 = addressElementActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        AddressElementViewModel viewModel;
        OY2 oy2;
        AddressElementViewModel viewModel2;
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1953035352, i, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous> (AddressElementActivity.kt:67)");
        }
        GU2 m107098p = FU2.m107098p(HU2.Hidden, null, true, new AddressElementActivity$onCreate$2$modalBottomSheetState$1(this.this$0), interfaceC32720Et0, 390, 2);
        this.this$0.navController = QY2.m88412a(new AbstractC39507d13[0], interfaceC32720Et0, 8);
        viewModel = this.this$0.getViewModel();
        AddressElementNavigator navigator = viewModel.getNavigator();
        oy2 = this.this$0.navController;
        if (oy2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navController");
            oy2 = null;
        }
        navigator.setNavigationController(oy2);
        interfaceC32720Et0.mo89638F(773894976);
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
        if (mo89635G == c2012a.m108267a()) {
            Object c42992iu0 = new C42992iu0(Y91.m75529j(EmptyCoroutineContext.INSTANCE, interfaceC32720Et0));
            interfaceC32720Et0.mo89503z(c42992iu0);
            mo89635G = c42992iu0;
        }
        interfaceC32720Et0.mo89605Q();
        ZC0 m31665a = ((C42992iu0) mo89635G).m31665a();
        interfaceC32720Et0.mo89605Q();
        Unit unit = Unit.INSTANCE;
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(m107098p);
        Object mo89635G2 = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G2 == c2012a.m108267a()) {
            mo89635G2 = new AddressElementActivity$onCreate$2$1$1(m107098p, null);
            interfaceC32720Et0.mo89503z(mo89635G2);
        }
        interfaceC32720Et0.mo89605Q();
        Y91.m75533f(unit, (Function2) mo89635G2, interfaceC32720Et0, 70);
        Y91.m75533f(unit, new C191642(m107098p, this.this$0, null), interfaceC32720Et0, 70);
        viewModel2 = this.this$0.getViewModel();
        viewModel2.getNavigator().setOnDismiss(new C191673(this.this$0, m31665a, m107098p));
        StripeThemeKt.StripeTheme(null, null, null, C43575jt0.m29791b(interfaceC32720Et0, 1044576262, true, new C191694(m107098p, this.this$0)), interfaceC32720Et0, 3072, 7);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
