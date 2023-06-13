package com.stripe.android.link.p042ui.wallet;

import co.bird.android.model.LegacyRepairType;
import com.google.android.gms.location.places.Place;
import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.ErrorMessageKt;
import com.stripe.android.link.p042ui.PrimaryButtonState;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.CvcCheck;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0014J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00104\u001a\u00020\nHÆ\u0003J\t\u00105\u001a\u00020\nHÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u00108\u001a\u00020\u0010HÆ\u0003J\t\u00109\u001a\u00020\u0010HÆ\u0003J\u008b\u0001\u0010:\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010;\u001a\u00020\n2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0018\u0010=\u001a\u0004\u0018\u00010\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\t\u0010>\u001a\u00020?HÖ\u0001J\u0006\u0010@\u001a\u00020\u0000J\t\u0010A\u001a\u00020\u0004HÖ\u0001J\u000e\u0010B\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020EJ\u0018\u0010F\u001a\u00020\u00002\u0006\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0004J\u000e\u0010J\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u0007R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001cR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010-\u001a\u00020\n*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006L"}, m28432d2 = {"Lcom/stripe/android/link/ui/wallet/WalletUiState;", "", "supportedTypes", "", "", "paymentDetailsList", "", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "selectedItem", "isExpanded", "", "isProcessing", "hasCompleted", "errorMessage", "Lcom/stripe/android/link/ui/ErrorMessage;", "expiryDateInput", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "cvcInput", "alertMessage", "paymentMethodIdBeingUpdated", "(Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/ErrorMessage;Ljava/lang/String;)V", "getAlertMessage", "()Lcom/stripe/android/link/ui/ErrorMessage;", "getCvcInput", "()Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getErrorMessage", "getExpiryDateInput", "getHasCompleted", "()Z", "getPaymentDetailsList", "()Ljava/util/List;", "getPaymentMethodIdBeingUpdated", "()Ljava/lang/String;", "primaryButtonState", "Lcom/stripe/android/link/ui/PrimaryButtonState;", "getPrimaryButtonState", "()Lcom/stripe/android/link/ui/PrimaryButtonState;", "selectedCard", "Lcom/stripe/android/model/ConsumerPaymentDetails$Card;", "getSelectedCard", "()Lcom/stripe/android/model/ConsumerPaymentDetails$Card;", "getSelectedItem", "()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "getSupportedTypes", "()Ljava/util/Set;", "isValid", "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)Z", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "getDefaultItemSelection", "hashCode", "", "setProcessing", "toString", "updateWithError", "updateWithPaymentResult", "paymentResult", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "updateWithResponse", "response", "Lcom/stripe/android/model/ConsumerPaymentDetails;", "initialSelectedItemId", "updateWithSetDefaultResult", "updatedPaymentMethod", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nWalletUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletUiState.kt\ncom/stripe/android/link/ui/wallet/WalletUiState\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n288#2,2:132\n1549#2:134\n1620#2,3:135\n288#2,2:138\n766#2:140\n857#2,2:141\n288#2,2:143\n*S KotlinDebug\n*F\n+ 1 WalletUiState.kt\ncom/stripe/android/link/ui/wallet/WalletUiState\n*L\n59#1:132,2\n75#1:134\n75#1:135,3\n86#1:138,2\n124#1:140\n124#1:141,2\n125#1:143,2\n*E\n"})
/* renamed from: com.stripe.android.link.ui.wallet.WalletUiState */
/* loaded from: classes7.dex */
public final class WalletUiState {
    private final ErrorMessage alertMessage;
    private final FormFieldEntry cvcInput;
    private final ErrorMessage errorMessage;
    private final FormFieldEntry expiryDateInput;
    private final boolean hasCompleted;
    private final boolean isExpanded;
    private final boolean isProcessing;
    private final List<ConsumerPaymentDetails.PaymentDetails> paymentDetailsList;
    private final String paymentMethodIdBeingUpdated;
    private final ConsumerPaymentDetails.PaymentDetails selectedItem;
    private final Set<String> supportedTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public WalletUiState(Set<String> supportedTypes, List<? extends ConsumerPaymentDetails.PaymentDetails> paymentDetailsList, ConsumerPaymentDetails.PaymentDetails paymentDetails, boolean z, boolean z2, boolean z3, ErrorMessage errorMessage, FormFieldEntry expiryDateInput, FormFieldEntry cvcInput, ErrorMessage errorMessage2, String str) {
        Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
        Intrinsics.checkNotNullParameter(paymentDetailsList, "paymentDetailsList");
        Intrinsics.checkNotNullParameter(expiryDateInput, "expiryDateInput");
        Intrinsics.checkNotNullParameter(cvcInput, "cvcInput");
        this.supportedTypes = supportedTypes;
        this.paymentDetailsList = paymentDetailsList;
        this.selectedItem = paymentDetails;
        this.isExpanded = z;
        this.isProcessing = z2;
        this.hasCompleted = z3;
        this.errorMessage = errorMessage;
        this.expiryDateInput = expiryDateInput;
        this.cvcInput = cvcInput;
        this.alertMessage = errorMessage2;
        this.paymentMethodIdBeingUpdated = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletUiState copy$default(WalletUiState walletUiState, Set set, List list, ConsumerPaymentDetails.PaymentDetails paymentDetails, boolean z, boolean z2, boolean z3, ErrorMessage errorMessage, FormFieldEntry formFieldEntry, FormFieldEntry formFieldEntry2, ErrorMessage errorMessage2, String str, int i, Object obj) {
        return walletUiState.copy((i & 1) != 0 ? walletUiState.supportedTypes : set, (i & 2) != 0 ? walletUiState.paymentDetailsList : list, (i & 4) != 0 ? walletUiState.selectedItem : paymentDetails, (i & 8) != 0 ? walletUiState.isExpanded : z, (i & 16) != 0 ? walletUiState.isProcessing : z2, (i & 32) != 0 ? walletUiState.hasCompleted : z3, (i & 64) != 0 ? walletUiState.errorMessage : errorMessage, (i & 128) != 0 ? walletUiState.expiryDateInput : formFieldEntry, (i & 256) != 0 ? walletUiState.cvcInput : formFieldEntry2, (i & 512) != 0 ? walletUiState.alertMessage : errorMessage2, (i & 1024) != 0 ? walletUiState.paymentMethodIdBeingUpdated : str);
    }

    private final ConsumerPaymentDetails.PaymentDetails getDefaultItemSelection(List<? extends ConsumerPaymentDetails.PaymentDetails> list) {
        Object obj;
        Object firstOrNull;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (this.supportedTypes.contains(((ConsumerPaymentDetails.PaymentDetails) obj2).getType())) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ConsumerPaymentDetails.PaymentDetails) obj).isDefault()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ConsumerPaymentDetails.PaymentDetails paymentDetails = (ConsumerPaymentDetails.PaymentDetails) obj;
        if (paymentDetails == null) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
            return (ConsumerPaymentDetails.PaymentDetails) firstOrNull;
        }
        return paymentDetails;
    }

    private final boolean isValid(ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        return this.supportedTypes.contains(paymentDetails.getType());
    }

    public final Set<String> component1() {
        return this.supportedTypes;
    }

    public final ErrorMessage component10() {
        return this.alertMessage;
    }

    public final String component11() {
        return this.paymentMethodIdBeingUpdated;
    }

    public final List<ConsumerPaymentDetails.PaymentDetails> component2() {
        return this.paymentDetailsList;
    }

    public final ConsumerPaymentDetails.PaymentDetails component3() {
        return this.selectedItem;
    }

    public final boolean component4() {
        return this.isExpanded;
    }

    public final boolean component5() {
        return this.isProcessing;
    }

    public final boolean component6() {
        return this.hasCompleted;
    }

    public final ErrorMessage component7() {
        return this.errorMessage;
    }

    public final FormFieldEntry component8() {
        return this.expiryDateInput;
    }

    public final FormFieldEntry component9() {
        return this.cvcInput;
    }

    public final WalletUiState copy(Set<String> supportedTypes, List<? extends ConsumerPaymentDetails.PaymentDetails> paymentDetailsList, ConsumerPaymentDetails.PaymentDetails paymentDetails, boolean z, boolean z2, boolean z3, ErrorMessage errorMessage, FormFieldEntry expiryDateInput, FormFieldEntry cvcInput, ErrorMessage errorMessage2, String str) {
        Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
        Intrinsics.checkNotNullParameter(paymentDetailsList, "paymentDetailsList");
        Intrinsics.checkNotNullParameter(expiryDateInput, "expiryDateInput");
        Intrinsics.checkNotNullParameter(cvcInput, "cvcInput");
        return new WalletUiState(supportedTypes, paymentDetailsList, paymentDetails, z, z2, z3, errorMessage, expiryDateInput, cvcInput, errorMessage2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WalletUiState) {
            WalletUiState walletUiState = (WalletUiState) obj;
            return Intrinsics.areEqual(this.supportedTypes, walletUiState.supportedTypes) && Intrinsics.areEqual(this.paymentDetailsList, walletUiState.paymentDetailsList) && Intrinsics.areEqual(this.selectedItem, walletUiState.selectedItem) && this.isExpanded == walletUiState.isExpanded && this.isProcessing == walletUiState.isProcessing && this.hasCompleted == walletUiState.hasCompleted && Intrinsics.areEqual(this.errorMessage, walletUiState.errorMessage) && Intrinsics.areEqual(this.expiryDateInput, walletUiState.expiryDateInput) && Intrinsics.areEqual(this.cvcInput, walletUiState.cvcInput) && Intrinsics.areEqual(this.alertMessage, walletUiState.alertMessage) && Intrinsics.areEqual(this.paymentMethodIdBeingUpdated, walletUiState.paymentMethodIdBeingUpdated);
        }
        return false;
    }

    public final ErrorMessage getAlertMessage() {
        return this.alertMessage;
    }

    public final FormFieldEntry getCvcInput() {
        return this.cvcInput;
    }

    public final ErrorMessage getErrorMessage() {
        return this.errorMessage;
    }

    public final FormFieldEntry getExpiryDateInput() {
        return this.expiryDateInput;
    }

    public final boolean getHasCompleted() {
        return this.hasCompleted;
    }

    public final List<ConsumerPaymentDetails.PaymentDetails> getPaymentDetailsList() {
        return this.paymentDetailsList;
    }

    public final String getPaymentMethodIdBeingUpdated() {
        return this.paymentMethodIdBeingUpdated;
    }

    public final PrimaryButtonState getPrimaryButtonState() {
        ConsumerPaymentDetails.Card card;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        CvcCheck cvcCheck;
        ConsumerPaymentDetails.PaymentDetails paymentDetails = this.selectedItem;
        if (paymentDetails instanceof ConsumerPaymentDetails.Card) {
            card = (ConsumerPaymentDetails.Card) paymentDetails;
        } else {
            card = null;
        }
        boolean z5 = false;
        if (card != null) {
            z = card.isExpired();
        } else {
            z = false;
        }
        if (card != null && (cvcCheck = card.getCvcCheck()) != null) {
            z2 = cvcCheck.getRequiresRecollection();
        } else {
            z2 = false;
        }
        if (this.expiryDateInput.isComplete() && this.cvcInput.isComplete()) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z6 = !this.cvcInput.isComplete();
        ConsumerPaymentDetails.PaymentDetails paymentDetails2 = this.selectedItem;
        if (paymentDetails2 != null) {
            z4 = isValid(paymentDetails2);
        } else {
            z4 = false;
        }
        if (!z4 || ((z && z3) || (z2 && z6))) {
            z5 = true;
        }
        if (this.hasCompleted) {
            return PrimaryButtonState.Completed;
        }
        if (this.isProcessing) {
            return PrimaryButtonState.Processing;
        }
        if (z5) {
            return PrimaryButtonState.Disabled;
        }
        return PrimaryButtonState.Enabled;
    }

    public final ConsumerPaymentDetails.Card getSelectedCard() {
        ConsumerPaymentDetails.PaymentDetails paymentDetails = this.selectedItem;
        if (paymentDetails instanceof ConsumerPaymentDetails.Card) {
            return (ConsumerPaymentDetails.Card) paymentDetails;
        }
        return null;
    }

    public final ConsumerPaymentDetails.PaymentDetails getSelectedItem() {
        return this.selectedItem;
    }

    public final Set<String> getSupportedTypes() {
        return this.supportedTypes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.supportedTypes.hashCode() * 31) + this.paymentDetailsList.hashCode()) * 31;
        ConsumerPaymentDetails.PaymentDetails paymentDetails = this.selectedItem;
        int hashCode2 = (hashCode + (paymentDetails == null ? 0 : paymentDetails.hashCode())) * 31;
        boolean z = this.isExpanded;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.isProcessing;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.hasCompleted;
        int i5 = (i4 + (z3 ? 1 : z3 ? 1 : 0)) * 31;
        ErrorMessage errorMessage = this.errorMessage;
        int hashCode3 = (((((i5 + (errorMessage == null ? 0 : errorMessage.hashCode())) * 31) + this.expiryDateInput.hashCode()) * 31) + this.cvcInput.hashCode()) * 31;
        ErrorMessage errorMessage2 = this.alertMessage;
        int hashCode4 = (hashCode3 + (errorMessage2 == null ? 0 : errorMessage2.hashCode())) * 31;
        String str = this.paymentMethodIdBeingUpdated;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final boolean isProcessing() {
        return this.isProcessing;
    }

    public final WalletUiState setProcessing() {
        return copy$default(this, null, null, null, false, true, false, null, null, null, null, null, 1967, null);
    }

    public String toString() {
        Set<String> set = this.supportedTypes;
        List<ConsumerPaymentDetails.PaymentDetails> list = this.paymentDetailsList;
        ConsumerPaymentDetails.PaymentDetails paymentDetails = this.selectedItem;
        boolean z = this.isExpanded;
        boolean z2 = this.isProcessing;
        boolean z3 = this.hasCompleted;
        ErrorMessage errorMessage = this.errorMessage;
        FormFieldEntry formFieldEntry = this.expiryDateInput;
        FormFieldEntry formFieldEntry2 = this.cvcInput;
        ErrorMessage errorMessage2 = this.alertMessage;
        String str = this.paymentMethodIdBeingUpdated;
        return "WalletUiState(supportedTypes=" + set + ", paymentDetailsList=" + list + ", selectedItem=" + paymentDetails + ", isExpanded=" + z + ", isProcessing=" + z2 + ", hasCompleted=" + z3 + ", errorMessage=" + errorMessage + ", expiryDateInput=" + formFieldEntry + ", cvcInput=" + formFieldEntry2 + ", alertMessage=" + errorMessage2 + ", paymentMethodIdBeingUpdated=" + str + ")";
    }

    public final WalletUiState updateWithError(ErrorMessage errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return copy$default(this, null, null, null, false, false, false, errorMessage, null, null, null, null, 1967, null);
    }

    public final WalletUiState updateWithPaymentResult(PaymentResult paymentResult) {
        PaymentResult.Failed failed;
        ErrorMessage errorMessage;
        Throwable throwable;
        Intrinsics.checkNotNullParameter(paymentResult, "paymentResult");
        boolean z = paymentResult instanceof PaymentResult.Completed;
        if (paymentResult instanceof PaymentResult.Failed) {
            failed = (PaymentResult.Failed) paymentResult;
        } else {
            failed = null;
        }
        if (failed != null && (throwable = failed.getThrowable()) != null) {
            errorMessage = ErrorMessageKt.getErrorMessage(throwable);
        } else {
            errorMessage = null;
        }
        return copy$default(this, null, null, null, false, false, z, errorMessage, null, null, null, null, 1935, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r0 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WalletUiState updateWithResponse(ConsumerPaymentDetails response, String str) {
        String str2;
        ConsumerPaymentDetails.PaymentDetails defaultItemSelection;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(response, "response");
        Object obj = null;
        if (str == null) {
            ConsumerPaymentDetails.PaymentDetails paymentDetails = this.selectedItem;
            if (paymentDetails != null) {
                str2 = paymentDetails.getId();
            } else {
                str2 = null;
            }
        } else {
            str2 = str;
        }
        if (str2 != null) {
            Iterator<T> it = response.getPaymentDetails().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((ConsumerPaymentDetails.PaymentDetails) next).getId(), str2)) {
                    obj = next;
                    break;
                }
            }
            defaultItemSelection = (ConsumerPaymentDetails.PaymentDetails) obj;
        }
        defaultItemSelection = getDefaultItemSelection(response.getPaymentDetails());
        ConsumerPaymentDetails.PaymentDetails paymentDetails2 = defaultItemSelection;
        if (paymentDetails2 != null) {
            z = isValid(paymentDetails2);
        } else {
            z = false;
        }
        List<ConsumerPaymentDetails.PaymentDetails> paymentDetails3 = response.getPaymentDetails();
        if (z) {
            z2 = this.isExpanded;
        } else {
            z2 = true;
        }
        return copy$default(this, null, paymentDetails3, paymentDetails2, z2, false, false, null, null, null, null, null, 2017, null);
    }

    public final WalletUiState updateWithSetDefaultResult(ConsumerPaymentDetails.PaymentDetails updatedPaymentMethod) {
        int collectionSizeOrDefault;
        Object obj;
        ConsumerPaymentDetails.PaymentDetails copy;
        Intrinsics.checkNotNullParameter(updatedPaymentMethod, "updatedPaymentMethod");
        List<ConsumerPaymentDetails.PaymentDetails> list = this.paymentDetailsList;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (ConsumerPaymentDetails.PaymentDetails paymentDetails : list) {
            if (Intrinsics.areEqual(paymentDetails.getId(), updatedPaymentMethod.getId())) {
                copy = updatedPaymentMethod;
            } else if (paymentDetails instanceof ConsumerPaymentDetails.BankAccount) {
                copy = ConsumerPaymentDetails.BankAccount.copy$default((ConsumerPaymentDetails.BankAccount) paymentDetails, null, false, null, null, null, 29, null);
            } else if (paymentDetails instanceof ConsumerPaymentDetails.Card) {
                copy = r15.copy((r18 & 1) != 0 ? r15.getId() : null, (r18 & 2) != 0 ? r15.isDefault() : false, (r18 & 4) != 0 ? r15.expiryYear : 0, (r18 & 8) != 0 ? r15.expiryMonth : 0, (r18 & 16) != 0 ? r15.brand : null, (r18 & 32) != 0 ? r15.last4 : null, (r18 & 64) != 0 ? r15.cvcCheck : null, (r18 & 128) != 0 ? ((ConsumerPaymentDetails.Card) paymentDetails).billingAddress : null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(copy);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String id = ((ConsumerPaymentDetails.PaymentDetails) next).getId();
            ConsumerPaymentDetails.PaymentDetails paymentDetails2 = this.selectedItem;
            if (paymentDetails2 != null) {
                obj = paymentDetails2.getId();
            }
            if (Intrinsics.areEqual(id, obj)) {
                obj = next;
                break;
            }
        }
        return copy$default(this, null, arrayList, (ConsumerPaymentDetails.PaymentDetails) obj, false, false, false, null, null, null, null, null, Place.TYPE_POSTAL_TOWN, null);
    }

    public /* synthetic */ WalletUiState(Set set, List list, ConsumerPaymentDetails.PaymentDetails paymentDetails, boolean z, boolean z2, boolean z3, ErrorMessage errorMessage, FormFieldEntry formFieldEntry, FormFieldEntry formFieldEntry2, ErrorMessage errorMessage2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : paymentDetails, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? null : errorMessage, (i & 128) != 0 ? new FormFieldEntry(null, false, 2, null) : formFieldEntry, (i & 256) != 0 ? new FormFieldEntry(null, false, 2, null) : formFieldEntry2, (i & 512) != 0 ? null : errorMessage2, (i & 1024) == 0 ? str : null);
    }
}
