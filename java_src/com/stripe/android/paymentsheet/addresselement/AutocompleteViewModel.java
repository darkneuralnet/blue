package com.stripe.android.paymentsheet.addresselement;

import android.app.Application;
import androidx.lifecycle.C11759u;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.NonFallbackInjectable;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.p049ui.core.elements.autocomplete.PlacesClientProxy;
import com.stripe.android.p049ui.core.elements.autocomplete.model.AutocompletePrediction;
import com.stripe.android.p049ui.core.elements.autocomplete.model.FindAutocompletePredictionsResponse;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.analytics.AddressLauncherEventReporter;
import com.stripe.android.paymentsheet.injection.AutocompleteViewModelSubcomponent;
import com.stripe.android.uicore.elements.SimpleTextFieldConfig;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.elements.TextFieldIcon;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.InterfaceC43640jz5;
@Metadata(m28433d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 C2\u00020\u0001:\u0004DCEFB;\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u0014\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R3\u0010&\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010%0\u001f8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0012\n\u0004\b&\u0010\"\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0017\u0010/\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000204038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001f\u0010<\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010 038F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020#038F¢\u0006\u0006\u001a\u0004\b=\u0010;\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006G"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;", "Lie;", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "addressDetails", "", "setResultAndGoBack", "Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;", "prediction", "selectPrediction", "onBackPressed", "onEnterAddressManually", "clearQuery", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "args", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "getArgs", "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;", "navigator", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;", "getNavigator", "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;", "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;", "placesClient", "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;", "autocompleteArgs", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;", "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;", "eventReporter", "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;", "LGX2;", "", "_predictions", "LGX2;", "", "_loading", "Lkotlin/Result;", "addressResult", "getAddressResult", "()LGX2;", "getAddressResult$annotations", "()V", "Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;", "config", "Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;", "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "textFieldController", "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "getTextFieldController", "()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "LtP5;", "", "queryFlow", "LtP5;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;", "debouncer", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;", "getPredictions", "()LtP5;", "predictions", "getLoading", "loading", "Landroid/app/Application;", "application", "<init>", "(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;Landroid/app/Application;)V", "Companion", "Args", "Debouncer", "Factory", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAutocompleteViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutocompleteViewModel.kt\ncom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,247:1\n47#2:248\n49#2:252\n50#3:249\n55#3:251\n106#4:250\n*S KotlinDebug\n*F\n+ 1 AutocompleteViewModel.kt\ncom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel\n*L\n63#1:248\n63#1:252\n63#1:249\n63#1:251\n63#1:250\n*E\n"})
/* loaded from: classes7.dex */
public final class AutocompleteViewModel extends C23294ie {
    public static final Companion Companion = new Companion(null);
    public static final int MAX_DISPLAYED_RESULTS = 4;
    public static final int MIN_CHARS_AUTOCOMPLETE = 3;
    public static final long SEARCH_DEBOUNCE_MS = 1000;
    private final GX2<Boolean> _loading;
    private final GX2<List<AutocompletePrediction>> _predictions;
    private final GX2<Result<AddressDetails>> addressResult;
    private final AddressElementActivityContract.Args args;
    private final Args autocompleteArgs;
    private final SimpleTextFieldConfig config;
    private final Debouncer debouncer;
    private final AddressLauncherEventReporter eventReporter;
    private final AddressElementNavigator navigator;
    private final PlacesClientProxy placesClient;
    private final InterfaceC49220tP5<String> queryFlow;
    private final SimpleTextFieldController textFieldController;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$1 */
    /* loaded from: classes7.dex */
    public static final class C191791 extends Lambda implements Function1<String, Unit> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$1$1", m28418f = "AutocompleteViewModel.kt", m28417i = {}, m28416l = {74}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$1$1 */
        /* loaded from: classes7.dex */
        public static final class C191801 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $it;
            int label;
            final /* synthetic */ AutocompleteViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C191801(AutocompleteViewModel autocompleteViewModel, String str, Continuation<? super C191801> continuation) {
                super(2, continuation);
                this.this$0 = autocompleteViewModel;
                this.$it = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C191801(this.this$0, this.$it, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C191801) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                Object mo116667findAutocompletePredictionsBWLJW6A;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        mo116667findAutocompletePredictionsBWLJW6A = ((Result) obj).m116792unboximpl();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    PlacesClientProxy placesClientProxy = this.this$0.placesClient;
                    if (placesClientProxy != null) {
                        String str = this.$it;
                        String country = this.this$0.autocompleteArgs.getCountry();
                        if (country != null) {
                            this.label = 1;
                            mo116667findAutocompletePredictionsBWLJW6A = placesClientProxy.mo116667findAutocompletePredictionsBWLJW6A(str, country, 4, this);
                            if (mo116667findAutocompletePredictionsBWLJW6A == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            throw new IllegalStateException("Country cannot be empty");
                        }
                    }
                    return Unit.INSTANCE;
                }
                AutocompleteViewModel autocompleteViewModel = this.this$0;
                Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(mo116667findAutocompletePredictionsBWLJW6A);
                if (m116786exceptionOrNullimpl == null) {
                    autocompleteViewModel._loading.setValue(Boxing.boxBoolean(false));
                    autocompleteViewModel._predictions.setValue(((FindAutocompletePredictionsResponse) mo116667findAutocompletePredictionsBWLJW6A).getAutocompletePredictions());
                } else {
                    autocompleteViewModel._loading.setValue(Boxing.boxBoolean(false));
                    autocompleteViewModel.getAddressResult().setValue(Result.m116782boximpl(Result.m116783constructorimpl(ResultKt.createFailure(m116786exceptionOrNullimpl))));
                }
                return Unit.INSTANCE;
            }
        }

        public C191791() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Z30.m73800d(C36218Tr6.m82333a(AutocompleteViewModel.this), null, null, new C191801(AutocompleteViewModel.this, it, null), 3, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$2", m28418f = "AutocompleteViewModel.kt", m28417i = {}, m28416l = {93}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$2 */
    /* loaded from: classes7.dex */
    public static final class C191812 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        int label;

        public C191812(Continuation<? super C191812> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C191812(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C191812) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC49220tP5 interfaceC49220tP5 = AutocompleteViewModel.this.queryFlow;
                final AutocompleteViewModel autocompleteViewModel = AutocompleteViewModel.this;
                InterfaceC33198Gu1<String> interfaceC33198Gu1 = new InterfaceC33198Gu1<String>() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel.2.1
                    @Override // p000.InterfaceC33198Gu1
                    public /* bridge */ /* synthetic */ Object emit(String str, Continuation continuation) {
                        return emit2(str, (Continuation<? super Unit>) continuation);
                    }

                    /* renamed from: emit  reason: avoid collision after fix types in other method */
                    public final Object emit2(String str, Continuation<? super Unit> continuation) {
                        if (str.length() == 0) {
                            GX2<TextFieldIcon> trailingIcon = AutocompleteViewModel.this.config.getTrailingIcon();
                            do {
                            } while (!trailingIcon.compareAndSet(trailingIcon.getValue(), null));
                        } else {
                            GX2<TextFieldIcon> trailingIcon2 = AutocompleteViewModel.this.config.getTrailingIcon();
                            do {
                            } while (!trailingIcon2.compareAndSet(trailingIcon2.getValue(), new TextFieldIcon.Trailing(C19159R.C19160drawable.stripe_ic_clear, null, true, new AutocompleteViewModel$2$1$emit$3$1(AutocompleteViewModel.this), 2, null)));
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (interfaceC49220tP5.collect(interfaceC33198Gu1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;", "", "country", "", "(Ljava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Args {
        public static final int $stable = 0;
        private final String country;

        public Args(String str) {
            this.country = str;
        }

        public static /* synthetic */ Args copy$default(Args args, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.country;
            }
            return args.copy(str);
        }

        public final String component1() {
            return this.country;
        }

        public final Args copy(String str) {
            return new Args(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Args) && Intrinsics.areEqual(this.country, ((Args) obj).country);
        }

        public final String getCountry() {
            return this.country;
        }

        public int hashCode() {
            String str = this.country;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.country;
            return "Args(country=" + str + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Companion;", "", "()V", "MAX_DISPLAYED_RESULTS", "", "MIN_CHARS_AUTOCOMPLETE", "SEARCH_DEBOUNCE_MS", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;", "", "LZC0;", "coroutineScope", "LtP5;", "", "queryFlow", "Lkotlin/Function1;", "", "onValidQuery", "startWatching", "Lzh2;", "searchJob", "Lzh2;", "<init>", "()V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Debouncer {
        private InterfaceC52943zh2 searchJob;

        public final void startWatching(ZC0 coroutineScope, InterfaceC49220tP5<String> queryFlow, Function1<? super String, Unit> onValidQuery) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(queryFlow, "queryFlow");
            Intrinsics.checkNotNullParameter(onValidQuery, "onValidQuery");
            Z30.m73800d(coroutineScope, null, null, new AutocompleteViewModel$Debouncer$startWatching$1(queryFlow, this, onValidQuery, null), 3, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;", "Landroidx/lifecycle/u$b;", "Lcom/stripe/android/core/injection/NonFallbackInjectable;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)LOr6;", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "injector", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;", "args", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;", "Lkotlin/Function0;", "Landroid/app/Application;", "applicationSupplier", "Lkotlin/jvm/functions/Function0;", "LY94;", "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;", "subComponentBuilderProvider", "LY94;", "getSubComponentBuilderProvider", "()LY94;", "setSubComponentBuilderProvider", "(LY94;)V", "<init>", "(Lcom/stripe/android/core/injection/NonFallbackInjector;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;Lkotlin/jvm/functions/Function0;)V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b, NonFallbackInjectable {
        private final Function0<Application> applicationSupplier;
        private final Args args;
        private final NonFallbackInjector injector;
        public Y94<AutocompleteViewModelSubcomponent.Builder> subComponentBuilderProvider;

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(NonFallbackInjector injector, Args args, Function0<? extends Application> applicationSupplier) {
            Intrinsics.checkNotNullParameter(injector, "injector");
            Intrinsics.checkNotNullParameter(args, "args");
            Intrinsics.checkNotNullParameter(applicationSupplier, "applicationSupplier");
            this.injector = injector;
            this.args = args;
            this.applicationSupplier = applicationSupplier;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls, FE0 fe0) {
            return super.create(cls, fe0);
        }

        @Override // com.stripe.android.core.injection.Injectable
        public /* bridge */ /* synthetic */ Injector fallbackInitialize(Unit unit) {
            return (Injector) fallbackInitialize2(unit);
        }

        public final Y94<AutocompleteViewModelSubcomponent.Builder> getSubComponentBuilderProvider() {
            Y94<AutocompleteViewModelSubcomponent.Builder> y94 = this.subComponentBuilderProvider;
            if (y94 != null) {
                return y94;
            }
            Intrinsics.throwUninitializedPropertyAccessException("subComponentBuilderProvider");
            return null;
        }

        public final void setSubComponentBuilderProvider(Y94<AutocompleteViewModelSubcomponent.Builder> y94) {
            Intrinsics.checkNotNullParameter(y94, "<set-?>");
            this.subComponentBuilderProvider = y94;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            this.injector.inject(this);
            AutocompleteViewModel autoCompleteViewModel = getSubComponentBuilderProvider().get().application(this.applicationSupplier.invoke()).configuration(this.args).build().getAutoCompleteViewModel();
            Intrinsics.checkNotNull(autoCompleteViewModel, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel.Factory.create");
            return autoCompleteViewModel;
        }

        @Override // com.stripe.android.core.injection.NonFallbackInjectable
        /* renamed from: fallbackInitialize  reason: avoid collision after fix types in other method */
        public Void fallbackInitialize2(Unit unit) {
            return NonFallbackInjectable.DefaultImpls.fallbackInitialize(this, unit);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutocompleteViewModel(AddressElementActivityContract.Args args, AddressElementNavigator navigator, PlacesClientProxy placesClientProxy, Args autocompleteArgs, AddressLauncherEventReporter eventReporter, Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(autocompleteArgs, "autocompleteArgs");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(application, "application");
        this.args = args;
        this.navigator = navigator;
        this.placesClient = placesClientProxy;
        this.autocompleteArgs = autocompleteArgs;
        this.eventReporter = eventReporter;
        this._predictions = C50405vP5.m8742a(null);
        this._loading = C50405vP5.m8742a(Boolean.FALSE);
        this.addressResult = C50405vP5.m8742a(null);
        SimpleTextFieldConfig simpleTextFieldConfig = new SimpleTextFieldConfig(Integer.valueOf(C19159R.string.address_label_address), 0, 0, C50405vP5.m8742a(null), 6, null);
        this.config = simpleTextFieldConfig;
        SimpleTextFieldController simpleTextFieldController = new SimpleTextFieldController(simpleTextFieldConfig, false, null, 6, null);
        this.textFieldController = simpleTextFieldController;
        final InterfaceC32730Eu1<String> fieldValue = simpleTextFieldController.getFieldValue();
        InterfaceC49220tP5<String> m79273O = C36708Vu1.m79273O(new InterfaceC32730Eu1<String>() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$special$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AutocompleteViewModel.kt\ncom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel\n*L\n1#1,222:1\n48#2:223\n63#3:224\n*E\n"})
            /* renamed from: com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$special$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C191832<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$special$$inlined$map$1$2", m28418f = "AutocompleteViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$special$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C191841 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C191841(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C191832.this.emit(null, this);
                    }
                }

                public C191832(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C191841 c191841;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C191841) {
                        c191841 = (C191841) continuation;
                        int i2 = c191841.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c191841.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c191841.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c191841.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                c191841.label = 1;
                                if (this.$this_unsafeFlow.emit((String) obj, c191841) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c191841 = new C191841(continuation);
                    Object obj22 = c191841.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c191841.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C191832(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        }, C36218Tr6.m82333a(this), InterfaceC43640jz5.C25067a.m29522b(InterfaceC43640jz5.f93705a, 0L, 0L, 3, null), "");
        this.queryFlow = m79273O;
        Debouncer debouncer = new Debouncer();
        this.debouncer = debouncer;
        debouncer.startWatching(C36218Tr6.m82333a(this), m79273O, new C191791());
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new C191812(null), 3, null);
        String country = autocompleteArgs.getCountry();
        if (country != null) {
            eventReporter.onShow(country);
        }
    }

    public static /* synthetic */ void getAddressResult$annotations() {
    }

    private final void setResultAndGoBack(AddressDetails addressDetails) {
        if (addressDetails != null) {
            this.navigator.setResult(AddressDetails.KEY, addressDetails);
        } else {
            Result<AddressDetails> value = this.addressResult.getValue();
            if (value != null) {
                Object m116792unboximpl = value.m116792unboximpl();
                if (Result.m116786exceptionOrNullimpl(m116792unboximpl) == null) {
                    this.navigator.setResult(AddressDetails.KEY, (AddressDetails) m116792unboximpl);
                } else {
                    this.navigator.setResult(AddressDetails.KEY, null);
                }
            }
        }
        this.navigator.onBack();
    }

    public static /* synthetic */ void setResultAndGoBack$default(AutocompleteViewModel autocompleteViewModel, AddressDetails addressDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            addressDetails = null;
        }
        autocompleteViewModel.setResultAndGoBack(addressDetails);
    }

    public final void clearQuery() {
        this.textFieldController.onRawValueChange("");
        this._predictions.setValue(null);
    }

    public final GX2<Result<AddressDetails>> getAddressResult() {
        return this.addressResult;
    }

    public final AddressElementActivityContract.Args getArgs() {
        return this.args;
    }

    public final InterfaceC49220tP5<Boolean> getLoading() {
        return this._loading;
    }

    public final AddressElementNavigator getNavigator() {
        return this.navigator;
    }

    public final InterfaceC49220tP5<List<AutocompletePrediction>> getPredictions() {
        return this._predictions;
    }

    public final SimpleTextFieldController getTextFieldController() {
        return this.textFieldController;
    }

    public final void onBackPressed() {
        boolean isBlank;
        AddressDetails addressDetails;
        isBlank = StringsKt__StringsJVMKt.isBlank(this.queryFlow.getValue());
        if (!isBlank) {
            addressDetails = new AddressDetails(null, new PaymentSheet.Address(null, null, this.queryFlow.getValue(), null, null, null, 59, null), null, null, 13, null);
        } else {
            addressDetails = null;
        }
        setResultAndGoBack(addressDetails);
    }

    public final void onEnterAddressManually() {
        setResultAndGoBack(new AddressDetails(null, new PaymentSheet.Address(null, null, this.queryFlow.getValue(), null, null, null, 59, null), null, null, 13, null));
    }

    public final void selectPrediction(AutocompletePrediction prediction) {
        Intrinsics.checkNotNullParameter(prediction, "prediction");
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new AutocompleteViewModel$selectPrediction$1(this, prediction, null), 3, null);
    }
}
