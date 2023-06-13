package com.stripe.android.paymentsheet.forms;

import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001BQ\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u000e\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u000e\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0004\b\u0013\u0010\u0014J<\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000eR&\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;", "", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "idFieldSnapshotMap", "", "hiddenIdentifiers", "", "showingMandate", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "userRequestedReuse", "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "filterFlow", "LEu1;", "currentFieldValueMap", "LEu1;", "getShowingMandate", "()LEu1;", "<init>", "(LEu1;LEu1;LEu1;LEu1;)V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCompleteFormFieldValueFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompleteFormFieldValueFilter.kt\ncom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n515#2:56\n500#2,6:57\n1549#3:63\n1620#3,3:64\n2624#3,3:67\n*S KotlinDebug\n*F\n+ 1 CompleteFormFieldValueFilter.kt\ncom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter\n*L\n41#1:56\n41#1:57,6\n50#1:63\n50#1:64,3\n51#1:67,3\n*E\n"})
/* loaded from: classes7.dex */
public final class CompleteFormFieldValueFilter {
    private final InterfaceC32730Eu1<Map<IdentifierSpec, FormFieldEntry>> currentFieldValueMap;
    private final InterfaceC32730Eu1<Set<IdentifierSpec>> hiddenIdentifiers;
    private final InterfaceC32730Eu1<Boolean> showingMandate;
    private final InterfaceC32730Eu1<PaymentSelection.CustomerRequestedSave> userRequestedReuse;

    /* JADX WARN: Multi-variable type inference failed */
    public CompleteFormFieldValueFilter(InterfaceC32730Eu1<? extends Map<IdentifierSpec, FormFieldEntry>> currentFieldValueMap, InterfaceC32730Eu1<? extends Set<IdentifierSpec>> hiddenIdentifiers, InterfaceC32730Eu1<Boolean> showingMandate, InterfaceC32730Eu1<? extends PaymentSelection.CustomerRequestedSave> userRequestedReuse) {
        Intrinsics.checkNotNullParameter(currentFieldValueMap, "currentFieldValueMap");
        Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
        Intrinsics.checkNotNullParameter(showingMandate, "showingMandate");
        Intrinsics.checkNotNullParameter(userRequestedReuse, "userRequestedReuse");
        this.currentFieldValueMap = currentFieldValueMap;
        this.hiddenIdentifiers = hiddenIdentifiers;
        this.showingMandate = showingMandate;
        this.userRequestedReuse = userRequestedReuse;
    }

    public final InterfaceC32730Eu1<FormFieldValues> filterFlow() {
        return C36708Vu1.m79259l(this.currentFieldValueMap, this.hiddenIdentifiers, this.showingMandate, this.userRequestedReuse, new CompleteFormFieldValueFilter$filterFlow$1(this, null));
    }

    public final InterfaceC32730Eu1<Boolean> getShowingMandate() {
        return this.showingMandate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FormFieldValues filterFlow(Map<IdentifierSpec, FormFieldEntry> map, Set<IdentifierSpec> set, boolean z, PaymentSelection.CustomerRequestedSave customerRequestedSave) {
        boolean z2;
        int collectionSizeOrDefault;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<IdentifierSpec, FormFieldEntry>> it = map.entrySet().iterator();
        while (true) {
            z2 = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<IdentifierSpec, FormFieldEntry> next = it.next();
            if (true ^ set.contains(next.getKey())) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        FormFieldValues formFieldValues = new FormFieldValues(linkedHashMap, z, customerRequestedSave);
        Collection<FormFieldEntry> values = linkedHashMap.values();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(values, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (FormFieldEntry formFieldEntry : values) {
            arrayList.add(Boolean.valueOf(formFieldEntry.isComplete()));
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!((Boolean) it2.next()).booleanValue()) {
                        z2 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z2) {
            return formFieldValues;
        }
        return null;
    }
}
