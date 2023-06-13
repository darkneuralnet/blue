package com.stripe.android.p049ui.core.elements;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.IdentifierSpec$$serializer;
import com.stripe.android.uicore.elements.SectionElement;
import com.stripe.android.uicore.elements.SimpleTextElement;
import com.stripe.android.uicore.elements.SimpleTextFieldConfig;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>B7\u0012\u0006\u0010\u0018\u001a\u00020\n\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b8\u00109BS\b\u0017\u0012\u0006\u0010:\u001a\u00020\u0010\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0010\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0016\u0012\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b8\u0010=J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u001e\u0010\u000e\u001a\u00020\r2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tJ\t\u0010\u000f\u001a\u00020\nHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0014HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0016HÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0003\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u0016HÆ\u0001J\t\u0010\u001e\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\"\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003R \u0010\u0018\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R \u0010\u0019\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R \u0010\u001a\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010,\u0012\u0004\b/\u0010'\u001a\u0004\b-\u0010.R \u0010\u001b\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u00100\u0012\u0004\b3\u0010'\u001a\u0004\b1\u00102R \u0010\u001c\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u00104\u0012\u0004\b7\u0010'\u001a\u0004\b5\u00106¨\u0006@"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/SimpleTextSpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", NamedConstantsKt.INITIAL_VALUES, "Lcom/stripe/android/uicore/elements/SectionElement;", "transform", "component1", "", "component2", "Lcom/stripe/android/ui/core/elements/Capitalization;", "component3", "Lcom/stripe/android/ui/core/elements/KeyboardType;", "component4", "", "component5", "apiPath", "label", "capitalization", "keyboardType", "showOptionalLabel", "copy", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath$annotations", "()V", "I", "getLabel", "()I", "getLabel$annotations", "Lcom/stripe/android/ui/core/elements/Capitalization;", "getCapitalization", "()Lcom/stripe/android/ui/core/elements/Capitalization;", "getCapitalization$annotations", "Lcom/stripe/android/ui/core/elements/KeyboardType;", "getKeyboardType", "()Lcom/stripe/android/ui/core/elements/KeyboardType;", "getKeyboardType$annotations", "Z", "getShowOptionalLabel", "()Z", "getShowOptionalLabel$annotations", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILcom/stripe/android/ui/core/elements/Capitalization;Lcom/stripe/android/ui/core/elements/KeyboardType;Z)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/uicore/elements/IdentifierSpec;ILcom/stripe/android/ui/core/elements/Capitalization;Lcom/stripe/android/ui/core/elements/KeyboardType;ZLbt5;)V", "Companion", "$serializer", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.SimpleTextSpec */
/* loaded from: classes7.dex */
public final class SimpleTextSpec extends FormItemSpec {
    private final IdentifierSpec apiPath;
    private final Capitalization capitalization;
    private final KeyboardType keyboardType;
    private final int label;
    private final boolean showOptionalLabel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = IdentifierSpec.$stable;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/SimpleTextSpec$Companion;", "", "LKj2;", "Lcom/stripe/android/ui/core/elements/SimpleTextSpec;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.ui.core.elements.SimpleTextSpec$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<SimpleTextSpec> serializer() {
            return SimpleTextSpec$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.ui.core.elements.SimpleTextSpec$WhenMappings */
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Capitalization.values().length];
            try {
                iArr[Capitalization.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Capitalization.Characters.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Capitalization.Words.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Capitalization.Sentences.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[KeyboardType.values().length];
            try {
                iArr2[KeyboardType.Text.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[KeyboardType.Ascii.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[KeyboardType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[KeyboardType.Phone.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[KeyboardType.Uri.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[KeyboardType.Email.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[KeyboardType.Password.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[KeyboardType.NumberPassword.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ SimpleTextSpec(int i, @InterfaceC36694Vs5("api_path") IdentifierSpec identifierSpec, @InterfaceC36694Vs5("label") int i2, @InterfaceC36694Vs5("capitalization") Capitalization capitalization, @InterfaceC36694Vs5("keyboard_type") KeyboardType keyboardType, @InterfaceC36694Vs5("show_optional_label") boolean z, C38819bt5 c38819bt5) {
        super(null);
        if (3 != (i & 3)) {
            C52838zW3.m1275b(i, 3, SimpleTextSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.apiPath = identifierSpec;
        this.label = i2;
        if ((i & 4) == 0) {
            this.capitalization = Capitalization.None;
        } else {
            this.capitalization = capitalization;
        }
        if ((i & 8) == 0) {
            this.keyboardType = KeyboardType.Ascii;
        } else {
            this.keyboardType = keyboardType;
        }
        if ((i & 16) == 0) {
            this.showOptionalLabel = false;
        } else {
            this.showOptionalLabel = z;
        }
    }

    public static /* synthetic */ SimpleTextSpec copy$default(SimpleTextSpec simpleTextSpec, IdentifierSpec identifierSpec, int i, Capitalization capitalization, KeyboardType keyboardType, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            identifierSpec = simpleTextSpec.getApiPath();
        }
        if ((i2 & 2) != 0) {
            i = simpleTextSpec.label;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            capitalization = simpleTextSpec.capitalization;
        }
        Capitalization capitalization2 = capitalization;
        if ((i2 & 8) != 0) {
            keyboardType = simpleTextSpec.keyboardType;
        }
        KeyboardType keyboardType2 = keyboardType;
        if ((i2 & 16) != 0) {
            z = simpleTextSpec.showOptionalLabel;
        }
        return simpleTextSpec.copy(identifierSpec, i3, capitalization2, keyboardType2, z);
    }

    @InterfaceC36694Vs5("api_path")
    public static /* synthetic */ void getApiPath$annotations() {
    }

    @InterfaceC36694Vs5("capitalization")
    public static /* synthetic */ void getCapitalization$annotations() {
    }

    @InterfaceC36694Vs5("keyboard_type")
    public static /* synthetic */ void getKeyboardType$annotations() {
    }

    @InterfaceC36694Vs5("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @InterfaceC36694Vs5("show_optional_label")
    public static /* synthetic */ void getShowOptionalLabel$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SectionElement transform$default(SimpleTextSpec simpleTextSpec, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = MapsKt__MapsKt.emptyMap();
        }
        return simpleTextSpec.transform(map);
    }

    @JvmStatic
    public static final void write$Self(SimpleTextSpec self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z3 = false;
        output.mo1126y(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        output.mo1145e(serialDesc, 1, self.label);
        if (output.mo1132s(serialDesc, 2) || self.capitalization != Capitalization.None) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo1126y(serialDesc, 2, Capitalization.Companion.serializer(), self.capitalization);
        }
        if (output.mo1132s(serialDesc, 3) || self.keyboardType != KeyboardType.Ascii) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo1126y(serialDesc, 3, KeyboardType.Companion.serializer(), self.keyboardType);
        }
        if (output.mo1132s(serialDesc, 4) || self.showOptionalLabel) {
            z3 = true;
        }
        if (z3) {
            output.mo1129v(serialDesc, 4, self.showOptionalLabel);
        }
    }

    public final IdentifierSpec component1() {
        return getApiPath();
    }

    public final int component2() {
        return this.label;
    }

    public final Capitalization component3() {
        return this.capitalization;
    }

    public final KeyboardType component4() {
        return this.keyboardType;
    }

    public final boolean component5() {
        return this.showOptionalLabel;
    }

    public final SimpleTextSpec copy(IdentifierSpec apiPath, int i, Capitalization capitalization, KeyboardType keyboardType, boolean z) {
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        Intrinsics.checkNotNullParameter(capitalization, "capitalization");
        Intrinsics.checkNotNullParameter(keyboardType, "keyboardType");
        return new SimpleTextSpec(apiPath, i, capitalization, keyboardType, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SimpleTextSpec) {
            SimpleTextSpec simpleTextSpec = (SimpleTextSpec) obj;
            return Intrinsics.areEqual(getApiPath(), simpleTextSpec.getApiPath()) && this.label == simpleTextSpec.label && this.capitalization == simpleTextSpec.capitalization && this.keyboardType == simpleTextSpec.keyboardType && this.showOptionalLabel == simpleTextSpec.showOptionalLabel;
        }
        return false;
    }

    @Override // com.stripe.android.p049ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public final Capitalization getCapitalization() {
        return this.capitalization;
    }

    public final KeyboardType getKeyboardType() {
        return this.keyboardType;
    }

    public final int getLabel() {
        return this.label;
    }

    public final boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((getApiPath().hashCode() * 31) + Integer.hashCode(this.label)) * 31) + this.capitalization.hashCode()) * 31) + this.keyboardType.hashCode()) * 31;
        boolean z = this.showOptionalLabel;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        IdentifierSpec apiPath = getApiPath();
        int i = this.label;
        Capitalization capitalization = this.capitalization;
        KeyboardType keyboardType = this.keyboardType;
        boolean z = this.showOptionalLabel;
        return "SimpleTextSpec(apiPath=" + apiPath + ", label=" + i + ", capitalization=" + capitalization + ", keyboardType=" + keyboardType + ", showOptionalLabel=" + z + ")";
    }

    public final SectionElement transform(Map<IdentifierSpec, String> initialValues) {
        int m70783b;
        int m60908h;
        Intrinsics.checkNotNullParameter(initialValues, "initialValues");
        IdentifierSpec apiPath = getApiPath();
        Integer valueOf = Integer.valueOf(this.label);
        int i = WhenMappings.$EnumSwitchMapping$0[this.capitalization.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        m70783b = C38143al2.f51187a.m70782c();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    m70783b = C38143al2.f51187a.m70781d();
                }
            } else {
                m70783b = C38143al2.f51187a.m70784a();
            }
        } else {
            m70783b = C38143al2.f51187a.m70783b();
        }
        int i2 = m70783b;
        switch (WhenMappings.$EnumSwitchMapping$1[this.keyboardType.ordinal()]) {
            case 1:
                m60908h = C39329cl2.f61189b.m60908h();
                break;
            case 2:
                m60908h = C39329cl2.f61189b.m60915a();
                break;
            case 3:
                m60908h = C39329cl2.f61189b.m60912d();
                break;
            case 4:
                m60908h = C39329cl2.f61189b.m60909g();
                break;
            case 5:
                m60908h = C39329cl2.f61189b.m60907i();
                break;
            case 6:
                m60908h = C39329cl2.f61189b.m60913c();
                break;
            case 7:
                m60908h = C39329cl2.f61189b.m60910f();
                break;
            case 8:
                m60908h = C39329cl2.f61189b.m60911e();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return FormItemSpec.createSectionElement$payments_ui_core_release$default(this, new SimpleTextElement(apiPath, new SimpleTextFieldController(new SimpleTextFieldConfig(valueOf, i2, m60908h, null, 8, null), this.showOptionalLabel, initialValues.get(getApiPath()))), (Integer) null, 2, (Object) null);
    }

    public /* synthetic */ SimpleTextSpec(IdentifierSpec identifierSpec, int i, Capitalization capitalization, KeyboardType keyboardType, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, i, (i2 & 4) != 0 ? Capitalization.None : capitalization, (i2 & 8) != 0 ? KeyboardType.Ascii : keyboardType, (i2 & 16) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleTextSpec(IdentifierSpec apiPath, int i, Capitalization capitalization, KeyboardType keyboardType, boolean z) {
        super(null);
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        Intrinsics.checkNotNullParameter(capitalization, "capitalization");
        Intrinsics.checkNotNullParameter(keyboardType, "keyboardType");
        this.apiPath = apiPath;
        this.label = i;
        this.capitalization = capitalization;
        this.keyboardType = keyboardType;
        this.showOptionalLabel = z;
    }
}
