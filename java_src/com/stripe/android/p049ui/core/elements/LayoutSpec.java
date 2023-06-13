package com.stripe.android.p049ui.core.elements;

import co.bird.android.model.LegacyRepairType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/LayoutSpec;", "", "items", "", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "Companion", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.LayoutSpec */
/* loaded from: classes7.dex */
public final class LayoutSpec {
    private final List<FormItemSpec> items;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u001f\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/LayoutSpec$Companion;", "", "()V", "create", "Lcom/stripe/android/ui/core/elements/LayoutSpec;", "item", "", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "([Lcom/stripe/android/ui/core/elements/FormItemSpec;)Lcom/stripe/android/ui/core/elements/LayoutSpec;", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.ui.core.elements.LayoutSpec$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LayoutSpec create(FormItemSpec... item) {
            List list;
            Intrinsics.checkNotNullParameter(item, "item");
            list = ArraysKt___ArraysKt.toList(item);
            return new LayoutSpec(list);
        }

        private Companion() {
        }

        public final LayoutSpec create() {
            List listOf;
            listOf = CollectionsKt__CollectionsJVMKt.listOf(EmptyFormSpec.INSTANCE);
            return new LayoutSpec(listOf);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutSpec(List<? extends FormItemSpec> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LayoutSpec copy$default(LayoutSpec layoutSpec, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = layoutSpec.items;
        }
        return layoutSpec.copy(list);
    }

    public final List<FormItemSpec> component1() {
        return this.items;
    }

    public final LayoutSpec copy(List<? extends FormItemSpec> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new LayoutSpec(items);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutSpec) && Intrinsics.areEqual(this.items, ((LayoutSpec) obj).items);
    }

    public final List<FormItemSpec> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    public String toString() {
        List<FormItemSpec> list = this.items;
        return "LayoutSpec(items=" + list + ")";
    }
}
