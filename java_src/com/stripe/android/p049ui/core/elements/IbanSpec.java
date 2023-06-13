package com.stripe.android.p049ui.core.elements;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.IdentifierSpec$$serializer;
import com.stripe.android.uicore.elements.SectionElement;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0011\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fB'\b\u0017\u0012\u0006\u0010 \u001a\u00020\u0013\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u001c\u0010\u000e\u001a\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tJ\t\u0010\u000f\u001a\u00020\nHÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\nHÆ\u0001J\t\u0010\u0012\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R \u0010\u0010\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/IbanSpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", NamedConstantsKt.INITIAL_VALUES, "Lcom/stripe/android/uicore/elements/SectionElement;", "transform", "component1", "apiPath", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath$annotations", "()V", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/uicore/elements/IdentifierSpec;Lbt5;)V", "Companion", "$serializer", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.IbanSpec */
/* loaded from: classes7.dex */
public final class IbanSpec extends FormItemSpec {
    private final IdentifierSpec apiPath;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = IdentifierSpec.$stable;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/IbanSpec$Companion;", "", "LKj2;", "Lcom/stripe/android/ui/core/elements/IbanSpec;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.ui.core.elements.IbanSpec$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<IbanSpec> serializer() {
            return IbanSpec$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public IbanSpec() {
        this((IdentifierSpec) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ IbanSpec copy$default(IbanSpec ibanSpec, IdentifierSpec identifierSpec, int i, Object obj) {
        if ((i & 1) != 0) {
            identifierSpec = ibanSpec.getApiPath();
        }
        return ibanSpec.copy(identifierSpec);
    }

    @InterfaceC36694Vs5("api_path")
    public static /* synthetic */ void getApiPath$annotations() {
    }

    @JvmStatic
    public static final void write$Self(IbanSpec self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z = true;
        if (!output.mo1132s(serialDesc, 0) && Intrinsics.areEqual(self.getApiPath(), IdentifierSpec.Companion.Generic("sepa_debit[iban]"))) {
            z = false;
        }
        if (z) {
            output.mo1126y(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        }
    }

    public final IdentifierSpec component1() {
        return getApiPath();
    }

    public final IbanSpec copy(IdentifierSpec apiPath) {
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        return new IbanSpec(apiPath);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IbanSpec) && Intrinsics.areEqual(getApiPath(), ((IbanSpec) obj).getApiPath());
    }

    @Override // com.stripe.android.p049ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public int hashCode() {
        return getApiPath().hashCode();
    }

    public String toString() {
        IdentifierSpec apiPath = getApiPath();
        return "IbanSpec(apiPath=" + apiPath + ")";
    }

    public final SectionElement transform(Map<IdentifierSpec, String> initialValues) {
        Intrinsics.checkNotNullParameter(initialValues, "initialValues");
        return FormItemSpec.createSectionElement$payments_ui_core_release$default(this, new IbanElement(getApiPath(), new SimpleTextFieldController(new IbanConfig(), false, initialValues.get(getApiPath()), 2, null)), (Integer) null, 2, (Object) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ IbanSpec(int i, @InterfaceC36694Vs5("api_path") IdentifierSpec identifierSpec, C38819bt5 c38819bt5) {
        super(null);
        if ((i & 0) != 0) {
            C52838zW3.m1275b(i, 0, IbanSpec$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.apiPath = IdentifierSpec.Companion.Generic("sepa_debit[iban]");
        } else {
            this.apiPath = identifierSpec;
        }
    }

    public /* synthetic */ IbanSpec(IdentifierSpec identifierSpec, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? IdentifierSpec.Companion.Generic("sepa_debit[iban]") : identifierSpec);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IbanSpec(IdentifierSpec apiPath) {
        super(null);
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        this.apiPath = apiPath;
    }
}
