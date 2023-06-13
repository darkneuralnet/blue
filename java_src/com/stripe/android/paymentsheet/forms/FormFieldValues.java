package com.stripe.android.paymentsheet.forms;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "", "fieldValuePairs", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "showsMandate", "", "userRequestedReuse", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "(Ljava/util/Map;ZLcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;)V", "getFieldValuePairs", "()Ljava/util/Map;", "getShowsMandate", "()Z", "getUserRequestedReuse", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FormFieldValues {
    private final Map<IdentifierSpec, FormFieldEntry> fieldValuePairs;
    private final boolean showsMandate;
    private final PaymentSelection.CustomerRequestedSave userRequestedReuse;

    public FormFieldValues(Map<IdentifierSpec, FormFieldEntry> fieldValuePairs, boolean z, PaymentSelection.CustomerRequestedSave userRequestedReuse) {
        Intrinsics.checkNotNullParameter(fieldValuePairs, "fieldValuePairs");
        Intrinsics.checkNotNullParameter(userRequestedReuse, "userRequestedReuse");
        this.fieldValuePairs = fieldValuePairs;
        this.showsMandate = z;
        this.userRequestedReuse = userRequestedReuse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormFieldValues copy$default(FormFieldValues formFieldValues, Map map, boolean z, PaymentSelection.CustomerRequestedSave customerRequestedSave, int i, Object obj) {
        if ((i & 1) != 0) {
            map = formFieldValues.fieldValuePairs;
        }
        if ((i & 2) != 0) {
            z = formFieldValues.showsMandate;
        }
        if ((i & 4) != 0) {
            customerRequestedSave = formFieldValues.userRequestedReuse;
        }
        return formFieldValues.copy(map, z, customerRequestedSave);
    }

    public final Map<IdentifierSpec, FormFieldEntry> component1() {
        return this.fieldValuePairs;
    }

    public final boolean component2() {
        return this.showsMandate;
    }

    public final PaymentSelection.CustomerRequestedSave component3() {
        return this.userRequestedReuse;
    }

    public final FormFieldValues copy(Map<IdentifierSpec, FormFieldEntry> fieldValuePairs, boolean z, PaymentSelection.CustomerRequestedSave userRequestedReuse) {
        Intrinsics.checkNotNullParameter(fieldValuePairs, "fieldValuePairs");
        Intrinsics.checkNotNullParameter(userRequestedReuse, "userRequestedReuse");
        return new FormFieldValues(fieldValuePairs, z, userRequestedReuse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FormFieldValues) {
            FormFieldValues formFieldValues = (FormFieldValues) obj;
            return Intrinsics.areEqual(this.fieldValuePairs, formFieldValues.fieldValuePairs) && this.showsMandate == formFieldValues.showsMandate && this.userRequestedReuse == formFieldValues.userRequestedReuse;
        }
        return false;
    }

    public final Map<IdentifierSpec, FormFieldEntry> getFieldValuePairs() {
        return this.fieldValuePairs;
    }

    public final boolean getShowsMandate() {
        return this.showsMandate;
    }

    public final PaymentSelection.CustomerRequestedSave getUserRequestedReuse() {
        return this.userRequestedReuse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.fieldValuePairs.hashCode() * 31;
        boolean z = this.showsMandate;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.userRequestedReuse.hashCode();
    }

    public String toString() {
        Map<IdentifierSpec, FormFieldEntry> map = this.fieldValuePairs;
        boolean z = this.showsMandate;
        PaymentSelection.CustomerRequestedSave customerRequestedSave = this.userRequestedReuse;
        return "FormFieldValues(fieldValuePairs=" + map + ", showsMandate=" + z + ", userRequestedReuse=" + customerRequestedSave + ")";
    }

    public /* synthetic */ FormFieldValues(Map map, boolean z, PaymentSelection.CustomerRequestedSave customerRequestedSave, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt__MapsKt.emptyMap() : map, z, customerRequestedSave);
    }
}
