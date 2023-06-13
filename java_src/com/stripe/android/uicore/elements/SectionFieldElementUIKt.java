package com.stripe.android.uicore.elements;

import androidx.compose.p003ui.focus.C11299c;
import com.google.p034ar.core.ImageMetadata;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a]\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, m28432d2 = {"", "enabled", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "field", "LgV2;", "modifier", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Landroidx/compose/ui/focus/c;", "nextFocusDirection", "previousFocusDirection", "", "SectionFieldElementUI-0uKR9Ig", "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;II)V", "SectionFieldElementUI", "stripe-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class SectionFieldElementUIKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0118  */
    /* renamed from: SectionFieldElementUI-0uKR9Ig  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m116747SectionFieldElementUI0uKR9Ig(boolean z, SectionFieldElement field, InterfaceC41563gV2 interfaceC41563gV2, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i, int i2, InterfaceC32720Et0 interfaceC32720Et0, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        Object obj;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        InterfaceC41563gV2 interfaceC41563gV22;
        Set<IdentifierSpec> set2;
        InterfaceC41563gV2 interfaceC41563gV23;
        int i13;
        int i14;
        Set<IdentifierSpec> set3;
        Set<IdentifierSpec> set4;
        int i15;
        int i16;
        Set<IdentifierSpec> set5;
        SectionFieldComposable sectionFieldComposable;
        InterfaceC36874Wm5 mo89512w;
        int i17;
        int i18;
        Intrinsics.checkNotNullParameter(field, "field");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1052939135);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            if (mo89518u.mo89536o(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i5 = i6 | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            if (mo89518u.mo89539n(field)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i5 |= i7;
        }
        int i19 = i4 & 4;
        if (i19 != 0) {
            i5 |= 384;
        } else if ((i3 & 896) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i5 |= i8;
            i9 = i4 & 8;
            if (i9 != 0) {
                i5 |= 1024;
            }
            if ((i4 & 16) == 0) {
                i5 |= 24576;
            } else if ((i3 & 57344) == 0) {
                if (mo89518u.mo89539n(identifierSpec)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i5 |= i10;
            }
            if ((i3 & ImageMetadata.JPEG_GPS_COORDINATES) != 0) {
                if ((i4 & 32) == 0) {
                    i11 = i;
                    if (mo89518u.mo89527r(i11)) {
                        i18 = DateUtils.FORMAT_NUMERIC_DATE;
                        i5 |= i18;
                    }
                } else {
                    i11 = i;
                }
                i18 = 65536;
                i5 |= i18;
            } else {
                i11 = i;
            }
            if ((i3 & 3670016) != 0) {
                if ((i4 & 64) == 0) {
                    i12 = i2;
                    if (mo89518u.mo89527r(i12)) {
                        i17 = 1048576;
                        i5 |= i17;
                    }
                } else {
                    i12 = i2;
                }
                i17 = 524288;
                i5 |= i17;
            } else {
                i12 = i2;
            }
            if (i9 != 8 && (2995931 & i5) == 599186 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
                set5 = set;
                i15 = i11;
                i16 = i12;
            } else {
                mo89518u.mo89626J();
                if ((i3 & 1) == 0 && !mo89518u.mo89545l()) {
                    mo89518u.mo89548k();
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                    }
                    if ((i4 & 64) != 0) {
                        i5 &= -3670017;
                    }
                    interfaceC41563gV23 = obj;
                    i13 = i11;
                    i14 = i12;
                    set3 = set;
                } else {
                    if (i19 == 0) {
                        interfaceC41563gV22 = InterfaceC41563gV2.f82354b0;
                    } else {
                        interfaceC41563gV22 = obj;
                    }
                    if (i9 == 0) {
                        set2 = SetsKt__SetsKt.emptySet();
                    } else {
                        set2 = set;
                    }
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                        i11 = C11299c.f52961b.m68807a();
                    }
                    if ((i4 & 64) == 0) {
                        i5 &= -3670017;
                        interfaceC41563gV23 = interfaceC41563gV22;
                        set3 = set2;
                        i14 = C11299c.f52961b.m68800h();
                        i13 = i11;
                    } else {
                        interfaceC41563gV23 = interfaceC41563gV22;
                        i13 = i11;
                        i14 = i12;
                        set3 = set2;
                    }
                }
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(1052939135, i5, -1, "com.stripe.android.uicore.elements.SectionFieldElementUI (SectionFieldElementUI.kt:9)");
                }
                if (!set3.contains(field.getIdentifier())) {
                    SectionFieldErrorController sectionFieldErrorController = field.sectionFieldErrorController();
                    if (sectionFieldErrorController instanceof SectionFieldComposable) {
                        sectionFieldComposable = (SectionFieldComposable) sectionFieldErrorController;
                    } else {
                        sectionFieldComposable = null;
                    }
                    if (sectionFieldComposable != null) {
                        set4 = set3;
                        sectionFieldComposable.mo116658ComposeUIMxjM1cc(z, field, interfaceC41563gV23, set3, identifierSpec, i13, i14, mo89518u, (i5 & 14) | 4096 | (i5 & 112) | (i5 & 896) | (i5 & 57344) | (i5 & ImageMetadata.JPEG_GPS_COORDINATES) | (i5 & 3670016));
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87817Y();
                        }
                        obj = interfaceC41563gV23;
                        i15 = i13;
                        i16 = i14;
                        set5 = set4;
                    }
                }
                set4 = set3;
                if (C35528Qt0.m87827O()) {
                }
                obj = interfaceC41563gV23;
                i15 = i13;
                i16 = i14;
                set5 = set4;
            }
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
                mo89512w.mo20405a(new SectionFieldElementUIKt$SectionFieldElementUI$1(z, field, obj, set5, identifierSpec, i15, i16, i3, i4));
                return;
            }
            return;
        }
        obj = interfaceC41563gV2;
        i9 = i4 & 8;
        if (i9 != 0) {
        }
        if ((i4 & 16) == 0) {
        }
        if ((i3 & ImageMetadata.JPEG_GPS_COORDINATES) != 0) {
        }
        if ((i3 & 3670016) != 0) {
        }
        if (i9 != 8) {
        }
        mo89518u.mo89626J();
        if ((i3 & 1) == 0) {
        }
        if (i19 == 0) {
        }
        if (i9 == 0) {
        }
        if ((i4 & 32) != 0) {
        }
        if ((i4 & 64) == 0) {
        }
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        if (!set3.contains(field.getIdentifier())) {
        }
        set4 = set3;
        if (C35528Qt0.m87827O()) {
        }
        obj = interfaceC41563gV23;
        i15 = i13;
        i16 = i14;
        set5 = set4;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }
}
