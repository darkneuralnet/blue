package com.stripe.android.p049ui.core.elements;

import com.stripe.android.uicore.elements.DropdownConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/SimpleDropdownConfig;", "Lcom/stripe/android/uicore/elements/DropdownConfig;", "label", "", "items", "", "Lcom/stripe/android/ui/core/elements/DropdownItemSpec;", "(ILjava/util/List;)V", "debugLabel", "", "getDebugLabel", "()Ljava/lang/String;", "displayItems", "getDisplayItems", "()Ljava/util/List;", "getLabel", "()I", "rawItems", "getRawItems", "convertFromRaw", "rawValue", "getSelectedItemLabel", "index", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nSimpleDropdownConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleDropdownConfig.kt\ncom/stripe/android/ui/core/elements/SimpleDropdownConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,26:1\n1549#2:27\n1620#2,3:28\n1549#2:31\n1620#2,3:32\n288#2,2:35\n*S KotlinDebug\n*F\n+ 1 SimpleDropdownConfig.kt\ncom/stripe/android/ui/core/elements/SimpleDropdownConfig\n*L\n14#1:27\n14#1:28,3\n16#1:31\n16#1:32,3\n22#1:35,2\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.SimpleDropdownConfig */
/* loaded from: classes7.dex */
public final class SimpleDropdownConfig implements DropdownConfig {
    public static final int $stable = 8;
    private final String debugLabel;
    private final List<String> displayItems;
    private final List<DropdownItemSpec> items;
    private final int label;
    private final List<String> rawItems;

    public SimpleDropdownConfig(int i, List<DropdownItemSpec> items) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(items, "items");
        this.label = i;
        this.items = items;
        this.debugLabel = "simple_dropdown";
        List<DropdownItemSpec> list = items;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (DropdownItemSpec dropdownItemSpec : list) {
            arrayList.add(dropdownItemSpec.getApiValue());
        }
        this.rawItems = arrayList;
        List<DropdownItemSpec> list2 = this.items;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (DropdownItemSpec dropdownItemSpec2 : list2) {
            arrayList2.add(dropdownItemSpec2.getDisplayText());
        }
        this.displayItems = arrayList2;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public String convertFromRaw(String rawValue) {
        Object obj;
        String displayText;
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        Iterator<T> it = this.items.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((DropdownItemSpec) obj).getApiValue(), rawValue)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        DropdownItemSpec dropdownItemSpec = (DropdownItemSpec) obj;
        if (dropdownItemSpec == null || (displayText = dropdownItemSpec.getDisplayText()) == null) {
            return this.items.get(0).getDisplayText();
        }
        return displayText;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public String getDebugLabel() {
        return this.debugLabel;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public boolean getDisableDropdownWithSingleElement() {
        return DropdownConfig.DefaultImpls.getDisableDropdownWithSingleElement(this);
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public List<String> getDisplayItems() {
        return this.displayItems;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public int getLabel() {
        return this.label;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public List<String> getRawItems() {
        return this.rawItems;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public String getSelectedItemLabel(int i) {
        return getDisplayItems().get(i);
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public boolean getTinyMode() {
        return DropdownConfig.DefaultImpls.getTinyMode(this);
    }
}
