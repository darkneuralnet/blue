package com.stripe.android.p049ui.core.elements;

import co.bird.android.model.LegacyRepairType;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u001d\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dB3\b\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0010\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R \u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u0012\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017¨\u0006$"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/DropdownItemSpec;", "", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "component1", "component2", "apiValue", "displayText", "copy", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getApiValue", "()Ljava/lang/String;", "getApiValue$annotations", "()V", "getDisplayText", "getDisplayText$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lbt5;)V", "Companion", "$serializer", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.DropdownItemSpec */
/* loaded from: classes7.dex */
public final class DropdownItemSpec {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String apiValue;
    private final String displayText;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/DropdownItemSpec$Companion;", "", "LKj2;", "Lcom/stripe/android/ui/core/elements/DropdownItemSpec;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.ui.core.elements.DropdownItemSpec$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<DropdownItemSpec> serializer() {
            return DropdownItemSpec$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public DropdownItemSpec() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DropdownItemSpec copy$default(DropdownItemSpec dropdownItemSpec, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dropdownItemSpec.apiValue;
        }
        if ((i & 2) != 0) {
            str2 = dropdownItemSpec.displayText;
        }
        return dropdownItemSpec.copy(str, str2);
    }

    @InterfaceC36694Vs5("api_value")
    public static /* synthetic */ void getApiValue$annotations() {
    }

    @InterfaceC36694Vs5("display_text")
    public static /* synthetic */ void getDisplayText$annotations() {
    }

    @JvmStatic
    public static final void write$Self(DropdownItemSpec self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        boolean z;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z2 = false;
        if (output.mo1132s(serialDesc, 0) || self.apiValue != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo1173E(serialDesc, 0, C41539gS5.f82260a, self.apiValue);
        }
        if (output.mo1132s(serialDesc, 1) || !Intrinsics.areEqual(self.displayText, "Other")) {
            z2 = true;
        }
        if (z2) {
            output.mo1128w(serialDesc, 1, self.displayText);
        }
    }

    public final String component1() {
        return this.apiValue;
    }

    public final String component2() {
        return this.displayText;
    }

    public final DropdownItemSpec copy(String str, String displayText) {
        Intrinsics.checkNotNullParameter(displayText, "displayText");
        return new DropdownItemSpec(str, displayText);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DropdownItemSpec) {
            DropdownItemSpec dropdownItemSpec = (DropdownItemSpec) obj;
            return Intrinsics.areEqual(this.apiValue, dropdownItemSpec.apiValue) && Intrinsics.areEqual(this.displayText, dropdownItemSpec.displayText);
        }
        return false;
    }

    public final String getApiValue() {
        return this.apiValue;
    }

    public final String getDisplayText() {
        return this.displayText;
    }

    public int hashCode() {
        String str = this.apiValue;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.displayText.hashCode();
    }

    public String toString() {
        String str = this.apiValue;
        String str2 = this.displayText;
        return "DropdownItemSpec(apiValue=" + str + ", displayText=" + str2 + ")";
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ DropdownItemSpec(int i, @InterfaceC36694Vs5("api_value") String str, @InterfaceC36694Vs5("display_text") String str2, C38819bt5 c38819bt5) {
        if ((i & 0) != 0) {
            C52838zW3.m1275b(i, 0, DropdownItemSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.apiValue = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.displayText = "Other";
        } else {
            this.displayText = str2;
        }
    }

    public DropdownItemSpec(String str, String displayText) {
        Intrinsics.checkNotNullParameter(displayText, "displayText");
        this.apiValue = str;
        this.displayText = displayText;
    }

    public /* synthetic */ DropdownItemSpec(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "Other" : str2);
    }
}
