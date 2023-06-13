package com.stripe.android.paymentsheet.navigation;

import com.stripe.android.paymentsheet.p047ui.AddPaymentMethodKt;
import com.stripe.android.paymentsheet.p047ui.PaymentOptionsUIKt;
import com.stripe.android.paymentsheet.p047ui.PaymentSheetLoadingKt;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u000f\u0010\u0011\u0012J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\u0082\u0001\u0004\u0013\u0014\u0015\u0016¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;", "", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "viewModel", "LgV2;", "modifier", "", "Content", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LgV2;LEt0;I)V", "", "getShowsBuyButton", "()Z", "showsBuyButton", "getShowsContinueButton", "showsContinueButton", "AddAnotherPaymentMethod", "AddFirstPaymentMethod", "Loading", "SelectSavedPaymentMethods", "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AddAnotherPaymentMethod;", "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AddFirstPaymentMethod;", "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$Loading;", "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public interface PaymentSheetScreen {

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AddAnotherPaymentMethod;", "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "viewModel", "LgV2;", "modifier", "", "Content", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LgV2;LEt0;I)V", "", "showsBuyButton", "Z", "getShowsBuyButton", "()Z", "showsContinueButton", "getShowsContinueButton", "<init>", "()V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class AddAnotherPaymentMethod implements PaymentSheetScreen {
        public static final int $stable = 0;
        public static final AddAnotherPaymentMethod INSTANCE = new AddAnotherPaymentMethod();
        private static final boolean showsBuyButton = true;
        private static final boolean showsContinueButton = true;

        private AddAnotherPaymentMethod() {
        }

        @Override // com.stripe.android.paymentsheet.navigation.PaymentSheetScreen
        public void Content(BaseSheetViewModel viewModel, InterfaceC41563gV2 modifier, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            Intrinsics.checkNotNullParameter(modifier, "modifier");
            InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-956829579);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-956829579, i, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.AddAnotherPaymentMethod.Content (PaymentSheetScreen.kt:45)");
            }
            AddPaymentMethodKt.AddPaymentMethod(viewModel, modifier, mo89518u, (i & 112) | 8, 0);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
                mo89512w.mo20405a(new PaymentSheetScreen$AddAnotherPaymentMethod$Content$1(this, viewModel, modifier, i));
            }
        }

        @Override // com.stripe.android.paymentsheet.navigation.PaymentSheetScreen
        public boolean getShowsBuyButton() {
            return showsBuyButton;
        }

        @Override // com.stripe.android.paymentsheet.navigation.PaymentSheetScreen
        public boolean getShowsContinueButton() {
            return showsContinueButton;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AddFirstPaymentMethod;", "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "viewModel", "LgV2;", "modifier", "", "Content", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LgV2;LEt0;I)V", "", "showsBuyButton", "Z", "getShowsBuyButton", "()Z", "showsContinueButton", "getShowsContinueButton", "<init>", "()V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class AddFirstPaymentMethod implements PaymentSheetScreen {
        public static final int $stable = 0;
        public static final AddFirstPaymentMethod INSTANCE = new AddFirstPaymentMethod();
        private static final boolean showsBuyButton = true;
        private static final boolean showsContinueButton = true;

        private AddFirstPaymentMethod() {
        }

        @Override // com.stripe.android.paymentsheet.navigation.PaymentSheetScreen
        public void Content(BaseSheetViewModel viewModel, InterfaceC41563gV2 modifier, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            Intrinsics.checkNotNullParameter(modifier, "modifier");
            InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-918143070);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-918143070, i, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.AddFirstPaymentMethod.Content (PaymentSheetScreen.kt:56)");
            }
            AddPaymentMethodKt.AddPaymentMethod(viewModel, modifier, mo89518u, (i & 112) | 8, 0);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
                mo89512w.mo20405a(new PaymentSheetScreen$AddFirstPaymentMethod$Content$1(this, viewModel, modifier, i));
            }
        }

        @Override // com.stripe.android.paymentsheet.navigation.PaymentSheetScreen
        public boolean getShowsBuyButton() {
            return showsBuyButton;
        }

        @Override // com.stripe.android.paymentsheet.navigation.PaymentSheetScreen
        public boolean getShowsContinueButton() {
            return showsContinueButton;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$Loading;", "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "viewModel", "LgV2;", "modifier", "", "Content", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LgV2;LEt0;I)V", "", "showsBuyButton", "Z", "getShowsBuyButton", "()Z", "showsContinueButton", "getShowsContinueButton", "<init>", "()V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Loading implements PaymentSheetScreen {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();
        private static final boolean showsBuyButton = false;
        private static final boolean showsContinueButton = false;

        private Loading() {
        }

        @Override // com.stripe.android.paymentsheet.navigation.PaymentSheetScreen
        public void Content(BaseSheetViewModel viewModel, InterfaceC41563gV2 modifier, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            int i2;
            int i3;
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            Intrinsics.checkNotNullParameter(modifier, "modifier");
            InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1744319394);
            if ((i & 112) == 0) {
                if (mo89518u.mo89539n(modifier)) {
                    i3 = 32;
                } else {
                    i3 = 16;
                }
                i2 = i3 | i;
            } else {
                i2 = i;
            }
            if ((i2 & 81) == 16 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
            } else {
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1744319394, i2, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.Loading.Content (PaymentSheetScreen.kt:23)");
                }
                PaymentSheetLoadingKt.PaymentSheetLoading(modifier, mo89518u, (i2 >> 3) & 14, 0);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
            InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
                mo89512w.mo20405a(new PaymentSheetScreen$Loading$Content$1(this, viewModel, modifier, i));
            }
        }

        @Override // com.stripe.android.paymentsheet.navigation.PaymentSheetScreen
        public boolean getShowsBuyButton() {
            return showsBuyButton;
        }

        @Override // com.stripe.android.paymentsheet.navigation.PaymentSheetScreen
        public boolean getShowsContinueButton() {
            return showsContinueButton;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;", "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "viewModel", "LgV2;", "modifier", "", "Content", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LgV2;LEt0;I)V", "", "showsBuyButton", "Z", "getShowsBuyButton", "()Z", "showsContinueButton", "getShowsContinueButton", "<init>", "()V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class SelectSavedPaymentMethods implements PaymentSheetScreen {
        public static final int $stable = 0;
        public static final SelectSavedPaymentMethods INSTANCE = new SelectSavedPaymentMethods();
        private static final boolean showsBuyButton = true;
        private static final boolean showsContinueButton = false;

        private SelectSavedPaymentMethods() {
        }

        @Override // com.stripe.android.paymentsheet.navigation.PaymentSheetScreen
        public void Content(BaseSheetViewModel viewModel, InterfaceC41563gV2 modifier, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            Intrinsics.checkNotNullParameter(modifier, "modifier");
            InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-462161565);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-462161565, i, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.SelectSavedPaymentMethods.Content (PaymentSheetScreen.kt:34)");
            }
            PaymentOptionsUIKt.PaymentOptions(viewModel, modifier, mo89518u, (i & 112) | 8, 0);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
                mo89512w.mo20405a(new PaymentSheetScreen$SelectSavedPaymentMethods$Content$1(this, viewModel, modifier, i));
            }
        }

        @Override // com.stripe.android.paymentsheet.navigation.PaymentSheetScreen
        public boolean getShowsBuyButton() {
            return showsBuyButton;
        }

        @Override // com.stripe.android.paymentsheet.navigation.PaymentSheetScreen
        public boolean getShowsContinueButton() {
            return showsContinueButton;
        }
    }

    void Content(BaseSheetViewModel baseSheetViewModel, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i);

    boolean getShowsBuyButton();

    boolean getShowsContinueButton();
}
