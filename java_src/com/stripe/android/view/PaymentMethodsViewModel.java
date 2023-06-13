package com.stripe.android.view;

import android.app.Application;
import android.content.res.Resources;
import androidx.lifecycle.C11759u;
import androidx.lifecycle.LiveData;
import com.stripe.android.C18606R;
import com.stripe.android.CustomerSession;
import com.stripe.android.PaymentSession;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u00017B4\u0012\u0006\u00104\u001a\u000203\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u001dø\u0001\u0000¢\u0006\u0004\b5\u00106J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0002J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\nJ$\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00100\u000f0\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010\"\u001a\n !*\u0004\u0018\u00010 0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u00101\u001a\b\u0012\u0004\u0012\u00020\u001d0,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, m28432d2 = {"Lcom/stripe/android/view/PaymentMethodsViewModel;", "Lie;", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "", "stringRes", "", "createSnackbarText", "", "onPaymentMethodAdded$payments_core_release", "(Lcom/stripe/android/model/PaymentMethod;)V", "onPaymentMethodAdded", "onPaymentMethodRemoved$payments_core_release", "onPaymentMethodRemoved", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "", "getPaymentMethods$payments_core_release", "()Landroidx/lifecycle/LiveData;", "getPaymentMethods", "Lcom/stripe/android/CustomerSession;", "customerSession", "Ljava/lang/Object;", "selectedPaymentMethodId", "Ljava/lang/String;", "getSelectedPaymentMethodId$payments_core_release", "()Ljava/lang/String;", "setSelectedPaymentMethodId$payments_core_release", "(Ljava/lang/String;)V", "", "startedFromPaymentSession", "Z", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "resources", "Landroid/content/res/Resources;", "Lcom/stripe/android/view/CardDisplayTextFactory;", "cardDisplayTextFactory", "Lcom/stripe/android/view/CardDisplayTextFactory;", "", NamedConstantsKt.PRODUCT_USAGE, "Ljava/util/Set;", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "LuX2;", "snackbarData", "LuX2;", "getSnackbarData$payments_core_release", "()LuX2;", "progressData", "getProgressData$payments_core_release", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;Ljava/lang/Object;Ljava/lang/String;Z)V", "Factory", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentMethodsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodsViewModel.kt\ncom/stripe/android/view/PaymentMethodsViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1#2:120\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentMethodsViewModel extends C23294ie {
    private final CardDisplayTextFactory cardDisplayTextFactory;
    private final Object customerSession;
    private final Set<String> productUsage;
    private final C49882uX2<Boolean> progressData;
    private final Resources resources;
    private String selectedPaymentMethodId;
    private final C49882uX2<String> snackbarData;
    private final boolean startedFromPaymentSession;

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B2\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/view/PaymentMethodsViewModel$Factory;", "Landroidx/lifecycle/u$b;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)LOr6;", "Landroid/app/Application;", "application", "Landroid/app/Application;", "Lkotlin/Result;", "Lcom/stripe/android/CustomerSession;", "customerSession", "Ljava/lang/Object;", "", "initialPaymentMethodId", "Ljava/lang/String;", "", "startedFromPaymentSession", "Z", "<init>", "(Landroid/app/Application;Ljava/lang/Object;Ljava/lang/String;Z)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b {
        private final Application application;
        private final Object customerSession;
        private final String initialPaymentMethodId;
        private final boolean startedFromPaymentSession;

        public Factory(Application application, Object obj, String str, boolean z) {
            Intrinsics.checkNotNullParameter(application, "application");
            this.application = application;
            this.customerSession = obj;
            this.initialPaymentMethodId = str;
            this.startedFromPaymentSession = z;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls, FE0 fe0) {
            return super.create(cls, fe0);
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new PaymentMethodsViewModel(this.application, this.customerSession, this.initialPaymentMethodId, this.startedFromPaymentSession);
        }
    }

    public /* synthetic */ PaymentMethodsViewModel(Application application, Object obj, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, obj, (i & 4) != 0 ? null : str, z);
    }

    private final String createSnackbarText(PaymentMethod paymentMethod, int i) {
        PaymentMethod.Card card = paymentMethod.card;
        if (card != null) {
            return this.resources.getString(i, this.cardDisplayTextFactory.createUnstyled$payments_core_release(card));
        }
        return null;
    }

    public final /* synthetic */ LiveData getPaymentMethods$payments_core_release() {
        final C49882uX2 c49882uX2 = new C49882uX2();
        this.progressData.setValue(Boolean.TRUE);
        Object obj = this.customerSession;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj);
        if (m116786exceptionOrNullimpl == null) {
            CustomerSession.getPaymentMethods$payments_core_release$default((CustomerSession) obj, PaymentMethod.Type.Card, null, null, null, this.productUsage, new CustomerSession.PaymentMethodsRetrievalListener() { // from class: com.stripe.android.view.PaymentMethodsViewModel$getPaymentMethods$1$1
                @Override // com.stripe.android.CustomerSession.RetrievalListener
                public void onError(int i, String errorMessage, StripeError stripeError) {
                    Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                    C49882uX2<Result<List<PaymentMethod>>> c49882uX22 = c49882uX2;
                    Result.Companion companion = Result.Companion;
                    c49882uX22.setValue(Result.m116782boximpl(Result.m116783constructorimpl(ResultKt.createFailure(new APIException(stripeError, null, i, errorMessage, null, 18, null)))));
                    this.getProgressData$payments_core_release().setValue(Boolean.FALSE);
                }

                @Override // com.stripe.android.CustomerSession.PaymentMethodsRetrievalListener
                public void onPaymentMethodsRetrieved(List<PaymentMethod> paymentMethods) {
                    Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
                    c49882uX2.setValue(Result.m116782boximpl(Result.m116783constructorimpl(paymentMethods)));
                    this.getProgressData$payments_core_release().setValue(Boolean.FALSE);
                }
            }, 14, null);
        } else {
            c49882uX2.setValue(Result.m116782boximpl(Result.m116783constructorimpl(ResultKt.createFailure(m116786exceptionOrNullimpl))));
            this.progressData.setValue(Boolean.FALSE);
        }
        return c49882uX2;
    }

    public final Set<String> getProductUsage$payments_core_release() {
        return this.productUsage;
    }

    public final C49882uX2<Boolean> getProgressData$payments_core_release() {
        return this.progressData;
    }

    public final String getSelectedPaymentMethodId$payments_core_release() {
        return this.selectedPaymentMethodId;
    }

    public final C49882uX2<String> getSnackbarData$payments_core_release() {
        return this.snackbarData;
    }

    public final void onPaymentMethodAdded$payments_core_release(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        String createSnackbarText = createSnackbarText(paymentMethod, C18606R.string.added);
        if (createSnackbarText != null) {
            this.snackbarData.setValue(createSnackbarText);
            this.snackbarData.setValue(null);
        }
    }

    public final void onPaymentMethodRemoved$payments_core_release(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        String createSnackbarText = createSnackbarText(paymentMethod, C18606R.string.removed);
        if (createSnackbarText != null) {
            this.snackbarData.setValue(createSnackbarText);
            this.snackbarData.setValue(null);
        }
    }

    public final void setSelectedPaymentMethodId$payments_core_release(String str) {
        this.selectedPaymentMethodId = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsViewModel(Application application, Object obj, String str, boolean z) {
        super(application);
        List listOfNotNull;
        Set<String> set;
        Intrinsics.checkNotNullParameter(application, "application");
        this.customerSession = obj;
        this.selectedPaymentMethodId = str;
        this.startedFromPaymentSession = z;
        this.resources = application.getResources();
        this.cardDisplayTextFactory = new CardDisplayTextFactory(application);
        String[] strArr = new String[2];
        strArr[0] = z ? PaymentSession.PRODUCT_TOKEN : null;
        strArr[1] = PaymentMethodsActivity.PRODUCT_TOKEN;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) strArr);
        set = CollectionsKt___CollectionsKt.toSet(listOfNotNull);
        this.productUsage = set;
        this.snackbarData = new C49882uX2<>();
        this.progressData = new C49882uX2<>();
    }
}
