package com.stripe.android.view;

import android.app.Application;
import androidx.lifecycle.C11759u;
import androidx.lifecycle.LiveData;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B!\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/view/FpxViewModel;", "Lie;", "Landroidx/lifecycle/LiveData;", "Lcom/stripe/android/model/BankStatuses;", "getFpxBankStatues$payments_core_release", "()Landroidx/lifecycle/LiveData;", "getFpxBankStatues", "", "publishableKey", "Ljava/lang/String;", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "", "selectedPosition", "Ljava/lang/Integer;", "getSelectedPosition$payments_core_release", "()Ljava/lang/Integer;", "setSelectedPosition$payments_core_release", "(Ljava/lang/Integer;)V", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;Ljava/lang/String;Lcom/stripe/android/networking/StripeRepository;)V", "Factory", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class FpxViewModel extends C23294ie {
    private final String publishableKey;
    private Integer selectedPosition;
    private final StripeRepository stripeRepository;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/view/FpxViewModel$Factory;", "Landroidx/lifecycle/u$b;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)LOr6;", "Landroid/app/Application;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b {
        private final Application application;

        public Factory(Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            this.application = application;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls, FE0 fe0) {
            return super.create(cls, fe0);
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            String publishableKey = PaymentConfiguration.Companion.getInstance(this.application).getPublishableKey();
            return new FpxViewModel(this.application, publishableKey, new StripeApiRepository(this.application, new FpxViewModel$Factory$create$stripeRepository$1(publishableKey), null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FpxViewModel(Application application, String publishableKey, StripeRepository stripeRepository) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        this.publishableKey = publishableKey;
        this.stripeRepository = stripeRepository;
    }

    public final /* synthetic */ LiveData getFpxBankStatues$payments_core_release() {
        return WC0.m78736b(null, 0L, new FpxViewModel$getFpxBankStatues$1(this, null), 3, null);
    }

    public final Integer getSelectedPosition$payments_core_release() {
        return this.selectedPosition;
    }

    public final void setSelectedPosition$payments_core_release(Integer num) {
        this.selectedPosition = num;
    }
}
