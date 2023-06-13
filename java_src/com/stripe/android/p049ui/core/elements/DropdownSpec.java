package com.stripe.android.p049ui.core.elements;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.uicore.elements.DropdownFieldController;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.IdentifierSpec$$serializer;
import com.stripe.android.uicore.elements.SectionElement;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B%\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\u0010\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b-\u0010.BE\b\u0017\u0012\u0006\u0010/\u001a\u00020\u001a\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0001\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b-\u00102J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u001e\u0010\u000e\u001a\u00020\r2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tJ\t\u0010\u000f\u001a\u00020\nHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J-\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00102\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0001J\t\u0010\u0019\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003R \u0010\u0015\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R \u0010\u0016\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010)\u0012\u0004\b,\u0010$\u001a\u0004\b*\u0010+¨\u00065"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/DropdownSpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", NamedConstantsKt.INITIAL_VALUES, "Lcom/stripe/android/uicore/elements/SectionElement;", "transform", "component1", "Lcom/stripe/android/ui/core/elements/TranslationId;", "component2", "", "Lcom/stripe/android/ui/core/elements/DropdownItemSpec;", "component3", "apiPath", "labelTranslationId", "items", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath$annotations", "()V", "Lcom/stripe/android/ui/core/elements/TranslationId;", "getLabelTranslationId", "()Lcom/stripe/android/ui/core/elements/TranslationId;", "getLabelTranslationId$annotations", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getItems$annotations", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/TranslationId;Ljava/util/List;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/TranslationId;Ljava/util/List;Lbt5;)V", "Companion", "$serializer", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.DropdownSpec */
/* loaded from: classes7.dex */
public final class DropdownSpec extends FormItemSpec {
    private final IdentifierSpec apiPath;
    private final List<DropdownItemSpec> items;
    private final TranslationId labelTranslationId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/DropdownSpec$Companion;", "", "LKj2;", "Lcom/stripe/android/ui/core/elements/DropdownSpec;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.ui.core.elements.DropdownSpec$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<DropdownSpec> serializer() {
            return DropdownSpec$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ DropdownSpec(int i, @InterfaceC36694Vs5("api_path") IdentifierSpec identifierSpec, @InterfaceC36694Vs5("translation_id") TranslationId translationId, @InterfaceC36694Vs5("items") List list, C38819bt5 c38819bt5) {
        super(null);
        if (7 != (i & 7)) {
            C52838zW3.m1275b(i, 7, DropdownSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.apiPath = identifierSpec;
        this.labelTranslationId = translationId;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DropdownSpec copy$default(DropdownSpec dropdownSpec, IdentifierSpec identifierSpec, TranslationId translationId, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            identifierSpec = dropdownSpec.getApiPath();
        }
        if ((i & 2) != 0) {
            translationId = dropdownSpec.labelTranslationId;
        }
        if ((i & 4) != 0) {
            list = dropdownSpec.items;
        }
        return dropdownSpec.copy(identifierSpec, translationId, list);
    }

    @InterfaceC36694Vs5("api_path")
    public static /* synthetic */ void getApiPath$annotations() {
    }

    @InterfaceC36694Vs5("items")
    public static /* synthetic */ void getItems$annotations() {
    }

    @InterfaceC36694Vs5("translation_id")
    public static /* synthetic */ void getLabelTranslationId$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SectionElement transform$default(DropdownSpec dropdownSpec, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = MapsKt__MapsKt.emptyMap();
        }
        return dropdownSpec.transform(map);
    }

    @JvmStatic
    public static final void write$Self(DropdownSpec self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.mo1126y(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        output.mo1126y(serialDesc, 1, TranslationId.Companion.serializer(), self.labelTranslationId);
        output.mo1126y(serialDesc, 2, new C27999ro(DropdownItemSpec$$serializer.INSTANCE), self.items);
    }

    public final IdentifierSpec component1() {
        return getApiPath();
    }

    public final TranslationId component2() {
        return this.labelTranslationId;
    }

    public final List<DropdownItemSpec> component3() {
        return this.items;
    }

    public final DropdownSpec copy(IdentifierSpec apiPath, TranslationId labelTranslationId, List<DropdownItemSpec> items) {
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        Intrinsics.checkNotNullParameter(labelTranslationId, "labelTranslationId");
        Intrinsics.checkNotNullParameter(items, "items");
        return new DropdownSpec(apiPath, labelTranslationId, items);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DropdownSpec) {
            DropdownSpec dropdownSpec = (DropdownSpec) obj;
            return Intrinsics.areEqual(getApiPath(), dropdownSpec.getApiPath()) && this.labelTranslationId == dropdownSpec.labelTranslationId && Intrinsics.areEqual(this.items, dropdownSpec.items);
        }
        return false;
    }

    @Override // com.stripe.android.p049ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public final List<DropdownItemSpec> getItems() {
        return this.items;
    }

    public final TranslationId getLabelTranslationId() {
        return this.labelTranslationId;
    }

    public int hashCode() {
        return (((getApiPath().hashCode() * 31) + this.labelTranslationId.hashCode()) * 31) + this.items.hashCode();
    }

    public String toString() {
        IdentifierSpec apiPath = getApiPath();
        TranslationId translationId = this.labelTranslationId;
        List<DropdownItemSpec> list = this.items;
        return "DropdownSpec(apiPath=" + apiPath + ", labelTranslationId=" + translationId + ", items=" + list + ")";
    }

    public final SectionElement transform(Map<IdentifierSpec, String> initialValues) {
        Intrinsics.checkNotNullParameter(initialValues, "initialValues");
        return FormItemSpec.createSectionElement$payments_ui_core_release$default(this, new SimpleDropdownElement(getApiPath(), new DropdownFieldController(new SimpleDropdownConfig(this.labelTranslationId.getResourceId(), this.items), initialValues.get(getApiPath()))), (Integer) null, 2, (Object) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropdownSpec(IdentifierSpec apiPath, TranslationId labelTranslationId, List<DropdownItemSpec> items) {
        super(null);
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        Intrinsics.checkNotNullParameter(labelTranslationId, "labelTranslationId");
        Intrinsics.checkNotNullParameter(items, "items");
        this.apiPath = apiPath;
        this.labelTranslationId = labelTranslationId;
        this.items = items;
    }
}
