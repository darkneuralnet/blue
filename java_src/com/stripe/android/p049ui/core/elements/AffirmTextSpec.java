package com.stripe.android.p049ui.core.elements;

import co.bird.android.model.LegacyRepairType;
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
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0011\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dB'\b\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0011\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0006\u0010\n\u001a\u00020\tJ\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R \u0010\r\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/AffirmTextSpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "Lcom/stripe/android/uicore/elements/FormElement;", "transform", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "component1", "apiPath", "copy", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath$annotations", "()V", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/uicore/elements/IdentifierSpec;Lbt5;)V", "Companion", "$serializer", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.AffirmTextSpec */
/* loaded from: classes7.dex */
public final class AffirmTextSpec extends FormItemSpec {
    public static final Companion Companion = new Companion(null);
    private final IdentifierSpec apiPath;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/AffirmTextSpec$Companion;", "", "LKj2;", "Lcom/stripe/android/ui/core/elements/AffirmTextSpec;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.ui.core.elements.AffirmTextSpec$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<AffirmTextSpec> serializer() {
            return AffirmTextSpec$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AffirmTextSpec() {
        this((IdentifierSpec) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ AffirmTextSpec copy$default(AffirmTextSpec affirmTextSpec, IdentifierSpec identifierSpec, int i, Object obj) {
        if ((i & 1) != 0) {
            identifierSpec = affirmTextSpec.getApiPath();
        }
        return affirmTextSpec.copy(identifierSpec);
    }

    @InterfaceC36694Vs5("api_path")
    public static /* synthetic */ void getApiPath$annotations() {
    }

    @JvmStatic
    public static final void write$Self(AffirmTextSpec self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z = true;
        if (!output.mo1132s(serialDesc, 0) && Intrinsics.areEqual(self.getApiPath(), IdentifierSpec.Companion.Generic("affirm_header"))) {
            z = false;
        }
        if (z) {
            output.mo1126y(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        }
    }

    public final IdentifierSpec component1() {
        return getApiPath();
    }

    public final AffirmTextSpec copy(IdentifierSpec apiPath) {
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        return new AffirmTextSpec(apiPath);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AffirmTextSpec) && Intrinsics.areEqual(getApiPath(), ((AffirmTextSpec) obj).getApiPath());
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
        return "AffirmTextSpec(apiPath=" + apiPath + ")";
    }

    public final FormElement transform() {
        return new AffirmHeaderElement(getApiPath(), null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ AffirmTextSpec(int i, @InterfaceC36694Vs5("api_path") IdentifierSpec identifierSpec, C38819bt5 c38819bt5) {
        super(null);
        if ((i & 0) != 0) {
            C52838zW3.m1275b(i, 0, AffirmTextSpec$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.apiPath = IdentifierSpec.Companion.Generic("affirm_header");
        } else {
            this.apiPath = identifierSpec;
        }
    }

    public /* synthetic */ AffirmTextSpec(IdentifierSpec identifierSpec, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? IdentifierSpec.Companion.Generic("affirm_header") : identifierSpec);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AffirmTextSpec(IdentifierSpec apiPath) {
        super(null);
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        this.apiPath = apiPath;
    }
}
