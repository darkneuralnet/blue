package com.stripe.android.p049ui.core.elements;

import co.bird.android.model.LegacyRepairType;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36694Vs5("next_action_spec")
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B!\b\u0000\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001c\u0010\u001dB3\b\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0010\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u0012\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017¨\u0006$"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/SelectorIcon;", "", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "component1", "component2", "lightThemePng", "darkThemePng", "copy", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getLightThemePng", "()Ljava/lang/String;", "getLightThemePng$annotations", "()V", "getDarkThemePng", "getDarkThemePng$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lbt5;)V", "Companion", "$serializer", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.SelectorIcon */
/* loaded from: classes7.dex */
public final class SelectorIcon {
    public static final Companion Companion = new Companion(null);
    private final String darkThemePng;
    private final String lightThemePng;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/SelectorIcon$Companion;", "", "LKj2;", "Lcom/stripe/android/ui/core/elements/SelectorIcon;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.ui.core.elements.SelectorIcon$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<SelectorIcon> serializer() {
            return SelectorIcon$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SelectorIcon() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SelectorIcon copy$default(SelectorIcon selectorIcon, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectorIcon.lightThemePng;
        }
        if ((i & 2) != 0) {
            str2 = selectorIcon.darkThemePng;
        }
        return selectorIcon.copy(str, str2);
    }

    @InterfaceC36694Vs5("dark_theme_png")
    public static /* synthetic */ void getDarkThemePng$annotations() {
    }

    @InterfaceC36694Vs5("light_theme_png")
    public static /* synthetic */ void getLightThemePng$annotations() {
    }

    @JvmStatic
    public static final void write$Self(SelectorIcon self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        boolean z;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z2 = false;
        if (output.mo1132s(serialDesc, 0) || self.lightThemePng != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo1173E(serialDesc, 0, C41539gS5.f82260a, self.lightThemePng);
        }
        if (output.mo1132s(serialDesc, 1) || self.darkThemePng != null) {
            z2 = true;
        }
        if (z2) {
            output.mo1173E(serialDesc, 1, C41539gS5.f82260a, self.darkThemePng);
        }
    }

    public final String component1() {
        return this.lightThemePng;
    }

    public final String component2() {
        return this.darkThemePng;
    }

    public final SelectorIcon copy(String str, String str2) {
        return new SelectorIcon(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SelectorIcon) {
            SelectorIcon selectorIcon = (SelectorIcon) obj;
            return Intrinsics.areEqual(this.lightThemePng, selectorIcon.lightThemePng) && Intrinsics.areEqual(this.darkThemePng, selectorIcon.darkThemePng);
        }
        return false;
    }

    public final String getDarkThemePng() {
        return this.darkThemePng;
    }

    public final String getLightThemePng() {
        return this.lightThemePng;
    }

    public int hashCode() {
        String str = this.lightThemePng;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.darkThemePng;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.lightThemePng;
        String str2 = this.darkThemePng;
        return "SelectorIcon(lightThemePng=" + str + ", darkThemePng=" + str2 + ")";
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ SelectorIcon(int i, @InterfaceC36694Vs5("light_theme_png") String str, @InterfaceC36694Vs5("dark_theme_png") String str2, C38819bt5 c38819bt5) {
        if ((i & 0) != 0) {
            C52838zW3.m1275b(i, 0, SelectorIcon$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.lightThemePng = null;
        } else {
            this.lightThemePng = str;
        }
        if ((i & 2) == 0) {
            this.darkThemePng = null;
        } else {
            this.darkThemePng = str2;
        }
    }

    public SelectorIcon(String str, String str2) {
        this.lightThemePng = str;
        this.darkThemePng = str2;
    }

    public /* synthetic */ SelectorIcon(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
