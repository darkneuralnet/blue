package com.stripe.android.uicore.elements;

import com.google.p034ar.core.ImageMetadata;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\bg\u0018\u00002\u00020\u00012\u00020\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&JU\u0010\u0019\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001d\u0010)\u001a\u00020&8&X¦\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001d\u0010,\u001a\u00020*8&X¦\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b+\u0010(R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010$R\u0014\u00103\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u00050!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u0010$R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00030!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010$R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00070!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010$R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00070!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010$R\u001c\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010$R\u0014\u0010\u000b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u00105R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00030!8&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010$\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006D"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/TextFieldController;", "Lcom/stripe/android/uicore/elements/InputController;", "Lcom/stripe/android/uicore/elements/SectionFieldComposable;", "", "displayFormatted", "Lcom/stripe/android/uicore/elements/TextFieldState;", "onValueChange", "", "newHasFocus", "", "onFocusChange", "enabled", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "field", "LgV2;", "modifier", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Landroidx/compose/ui/focus/c;", "nextFocusDirection", "previousFocusDirection", "ComposeUI-MxjM1cc", "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V", "ComposeUI", "LRu;", "getAutofillType", "()LRu;", "autofillType", "getDebugLabel", "()Ljava/lang/String;", "debugLabel", "LEu1;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "getTrailingIcon", "()LEu1;", "trailingIcon", "Lal2;", "getCapitalization-IUNYP9k", "()I", "capitalization", "Lcl2;", "getKeyboardType-PjHm6EE", "keyboardType", "", "getLabel", "label", "LEu6;", "getVisualTransformation", "()LEu6;", "visualTransformation", "getShowOptionalLabel", "()Z", "showOptionalLabel", "getFieldState", "fieldState", "getFieldValue", "fieldValue", "getVisibleError", "visibleError", "getLoading", "loading", "getPlaceHolder", "placeHolder", "getEnabled", "getContentDescription", "contentDescription", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public interface TextFieldController extends InputController, SectionFieldComposable {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        /* renamed from: ComposeUI-MxjM1cc  reason: not valid java name */
        public static void m116749ComposeUIMxjM1cc(TextFieldController textFieldController, boolean z, SectionFieldElement field, InterfaceC41563gV2 modifier, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, int i, int i2, InterfaceC32720Et0 interfaceC32720Et0, int i3) {
            int i4;
            int m107000d;
            InterfaceC32720Et0 interfaceC32720Et02;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            Intrinsics.checkNotNullParameter(field, "field");
            Intrinsics.checkNotNullParameter(modifier, "modifier");
            Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
            InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-2028039881);
            if ((i3 & 14) == 0) {
                if (mo89518u.mo89536o(z)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                i4 = i11 | i3;
            } else {
                i4 = i3;
            }
            if ((i3 & 112) == 0) {
                if (mo89518u.mo89539n(field)) {
                    i10 = 32;
                } else {
                    i10 = 16;
                }
                i4 |= i10;
            }
            if ((i3 & 896) == 0) {
                if (mo89518u.mo89539n(modifier)) {
                    i9 = 256;
                } else {
                    i9 = 128;
                }
                i4 |= i9;
            }
            if ((57344 & i3) == 0) {
                if (mo89518u.mo89539n(identifierSpec)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            if ((i3 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                if (mo89518u.mo89527r(i)) {
                    i7 = DateUtils.FORMAT_NUMERIC_DATE;
                } else {
                    i7 = 65536;
                }
                i4 |= i7;
            }
            if ((i3 & 3670016) == 0) {
                if (mo89518u.mo89527r(i2)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i4 |= i6;
            }
            if ((29360128 & i3) == 0) {
                if (mo89518u.mo89539n(textFieldController)) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i4 |= i5;
            }
            if ((23962331 & i4) == 4792466 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
                interfaceC32720Et02 = mo89518u;
            } else {
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-2028039881, i4, -1, "com.stripe.android.uicore.elements.TextFieldController.ComposeUI (TextFieldController.kt:52)");
                }
                if (Intrinsics.areEqual(identifierSpec, field.getIdentifier())) {
                    m107000d = FY1.f9619b.m107002b();
                } else {
                    m107000d = FY1.f9619b.m107000d();
                }
                int i12 = i4 << 3;
                int i13 = m107000d;
                interfaceC32720Et02 = mo89518u;
                TextFieldUIKt.m116750TextFieldndPIYpw(textFieldController, z, i13, modifier, null, i, i2, mo89518u, (458752 & i4) | ((i4 >> 21) & 14) | (i12 & 112) | (i12 & 7168) | (i4 & 3670016), 16);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
            InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w != null) {
                mo89512w.mo20405a(new TextFieldController$ComposeUI$1(textFieldController, z, field, modifier, hiddenIdentifiers, identifierSpec, i, i2, i3));
            }
        }

        public static boolean getEnabled(TextFieldController textFieldController) {
            return true;
        }

        public static InterfaceC32730Eu1<String> getPlaceHolder(TextFieldController textFieldController) {
            return C36708Vu1.m79281G(null);
        }
    }

    /* renamed from: ComposeUI-MxjM1cc */
    void mo116658ComposeUIMxjM1cc(boolean z, SectionFieldElement sectionFieldElement, InterfaceC41563gV2 interfaceC41563gV2, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i, int i2, InterfaceC32720Et0 interfaceC32720Et0, int i3);

    EnumC7283Ru getAutofillType();

    /* renamed from: getCapitalization-IUNYP9k */
    int mo116661getCapitalizationIUNYP9k();

    InterfaceC32730Eu1<String> getContentDescription();

    String getDebugLabel();

    boolean getEnabled();

    InterfaceC32730Eu1<TextFieldState> getFieldState();

    @Override // com.stripe.android.uicore.elements.InputController
    InterfaceC32730Eu1<String> getFieldValue();

    /* renamed from: getKeyboardType-PjHm6EE */
    int mo116662getKeyboardTypePjHm6EE();

    @Override // com.stripe.android.uicore.elements.InputController
    InterfaceC32730Eu1<Integer> getLabel();

    InterfaceC32730Eu1<Boolean> getLoading();

    InterfaceC32730Eu1<String> getPlaceHolder();

    @Override // com.stripe.android.uicore.elements.InputController
    boolean getShowOptionalLabel();

    InterfaceC32730Eu1<TextFieldIcon> getTrailingIcon();

    InterfaceC32730Eu1<Boolean> getVisibleError();

    InterfaceC32735Eu6 getVisualTransformation();

    void onFocusChange(boolean z);

    TextFieldState onValueChange(String str);
}
