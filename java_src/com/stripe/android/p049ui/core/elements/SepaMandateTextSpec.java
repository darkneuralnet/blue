package com.stripe.android.p049ui.core.elements;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.p049ui.core.C19369R;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.IdentifierSpec$$serializer;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b&\u0010'B/\b\u0017\u0012\u0006\u0010(\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0003\u0010\u0012\u001a\u00020\u000fHÆ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001J\t\u0010\u0015\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R \u0010\u0011\u001a\u00020\r8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b#\u0010$\u0012\u0004\b%\u0010\u001e¨\u0006."}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "merchantName", "Lcom/stripe/android/uicore/elements/FormElement;", "transform", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "component1", "", "component2", "apiPath", "stringResId", "copy", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath$annotations", "()V", "I", "getStringResId", "()I", "Lcom/stripe/android/ui/core/elements/MandateTextSpec;", "mandateTextSpec", "Lcom/stripe/android/ui/core/elements/MandateTextSpec;", "getMandateTextSpec$annotations", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/uicore/elements/IdentifierSpec;ILbt5;)V", "Companion", "$serializer", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.SepaMandateTextSpec */
/* loaded from: classes7.dex */
public final class SepaMandateTextSpec extends FormItemSpec {
    public static final Companion Companion = new Companion(null);
    private final IdentifierSpec apiPath;
    private final MandateTextSpec mandateTextSpec;
    private final int stringResId;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec$Companion;", "", "LKj2;", "Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.ui.core.elements.SepaMandateTextSpec$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<SepaMandateTextSpec> serializer() {
            return SepaMandateTextSpec$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SepaMandateTextSpec() {
        this((IdentifierSpec) null, 0, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SepaMandateTextSpec copy$default(SepaMandateTextSpec sepaMandateTextSpec, IdentifierSpec identifierSpec, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            identifierSpec = sepaMandateTextSpec.getApiPath();
        }
        if ((i2 & 2) != 0) {
            i = sepaMandateTextSpec.stringResId;
        }
        return sepaMandateTextSpec.copy(identifierSpec, i);
    }

    @InterfaceC36694Vs5("api_path")
    public static /* synthetic */ void getApiPath$annotations() {
    }

    private static /* synthetic */ void getMandateTextSpec$annotations() {
    }

    @JvmStatic
    public static final void write$Self(SepaMandateTextSpec self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        boolean z;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z2 = false;
        if (output.mo1132s(serialDesc, 0) || !Intrinsics.areEqual(self.getApiPath(), IdentifierSpec.Companion.Generic("sepa_mandate"))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo1126y(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        }
        if (output.mo1132s(serialDesc, 1) || self.stringResId != C19369R.string.sepa_mandate) {
            z2 = true;
        }
        if (z2) {
            output.mo1145e(serialDesc, 1, self.stringResId);
        }
    }

    public final IdentifierSpec component1() {
        return getApiPath();
    }

    public final int component2() {
        return this.stringResId;
    }

    public final SepaMandateTextSpec copy(IdentifierSpec apiPath, int i) {
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        return new SepaMandateTextSpec(apiPath, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SepaMandateTextSpec) {
            SepaMandateTextSpec sepaMandateTextSpec = (SepaMandateTextSpec) obj;
            return Intrinsics.areEqual(getApiPath(), sepaMandateTextSpec.getApiPath()) && this.stringResId == sepaMandateTextSpec.stringResId;
        }
        return false;
    }

    @Override // com.stripe.android.p049ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public final int getStringResId() {
        return this.stringResId;
    }

    public int hashCode() {
        return (getApiPath().hashCode() * 31) + Integer.hashCode(this.stringResId);
    }

    public String toString() {
        IdentifierSpec apiPath = getApiPath();
        int i = this.stringResId;
        return "SepaMandateTextSpec(apiPath=" + apiPath + ", stringResId=" + i + ")";
    }

    public final FormElement transform(String merchantName) {
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        return this.mandateTextSpec.transform(merchantName);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ SepaMandateTextSpec(int i, @InterfaceC36694Vs5("api_path") IdentifierSpec identifierSpec, int i2, C38819bt5 c38819bt5) {
        super(null);
        if ((i & 0) != 0) {
            C52838zW3.m1275b(i, 0, SepaMandateTextSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.apiPath = (i & 1) == 0 ? IdentifierSpec.Companion.Generic("sepa_mandate") : identifierSpec;
        if ((i & 2) == 0) {
            this.stringResId = C19369R.string.sepa_mandate;
        } else {
            this.stringResId = i2;
        }
        this.mandateTextSpec = new MandateTextSpec(getApiPath(), this.stringResId);
    }

    public /* synthetic */ SepaMandateTextSpec(IdentifierSpec identifierSpec, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? IdentifierSpec.Companion.Generic("sepa_mandate") : identifierSpec, (i2 & 2) != 0 ? C19369R.string.sepa_mandate : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SepaMandateTextSpec(IdentifierSpec apiPath, int i) {
        super(null);
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        this.apiPath = apiPath;
        this.stringResId = i;
        this.mandateTextSpec = new MandateTextSpec(getApiPath(), i);
    }
}
