package com.stripe.android.p049ui.core.elements;

import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a]\u0010\f\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m28432d2 = {"LEX2;", "", "openDialog", "", "titleText", "messageText", "confirmText", "dismissText", "Lkotlin/Function0;", "", "onConfirmListener", "onDismissListener", "SimpleDialogElementUI", "(LEX2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V", "payments-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt */
/* loaded from: classes7.dex */
public final class SimpleDialogElementUIKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SimpleDialogElementUI(EX2<Boolean> openDialog, String titleText, String messageText, String confirmText, String dismissText, Function0<Unit> function0, Function0<Unit> function02, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Object obj;
        int i9;
        int i10;
        Object obj2;
        int i11;
        int i12;
        SimpleDialogElementUIKt$SimpleDialogElementUI$1 simpleDialogElementUIKt$SimpleDialogElementUI$1;
        SimpleDialogElementUIKt$SimpleDialogElementUI$2 simpleDialogElementUIKt$SimpleDialogElementUI$2;
        Function0<Unit> function03;
        Function0<Unit> function04;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(openDialog, "openDialog");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(messageText, "messageText");
        Intrinsics.checkNotNullParameter(confirmText, "confirmText");
        Intrinsics.checkNotNullParameter(dismissText, "dismissText");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-433843748);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(openDialog)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89539n(titleText)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (mo89518u.mo89539n(messageText)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (mo89518u.mo89539n(confirmText)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (mo89518u.mo89539n(dismissText)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i13 = i2 & 32;
        if (i13 != 0) {
            i3 |= ImageMetadata.EDGE_MODE;
        } else if ((458752 & i) == 0) {
            obj = function0;
            if (mo89518u.mo89539n(obj)) {
                i9 = DateUtils.FORMAT_NUMERIC_DATE;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
            i10 = i2 & 64;
            if (i10 == 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                obj2 = function02;
                if (mo89518u.mo89539n(obj2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
                i12 = i3;
                if ((2995931 & i12) != 599186 && mo89518u.mo89575b()) {
                    mo89518u.mo89548k();
                    function03 = obj;
                    function04 = obj2;
                } else {
                    if (i13 != 0) {
                        simpleDialogElementUIKt$SimpleDialogElementUI$1 = SimpleDialogElementUIKt$SimpleDialogElementUI$1.INSTANCE;
                    } else {
                        simpleDialogElementUIKt$SimpleDialogElementUI$1 = obj;
                    }
                    if (i10 != 0) {
                        simpleDialogElementUIKt$SimpleDialogElementUI$2 = SimpleDialogElementUIKt$SimpleDialogElementUI$2.INSTANCE;
                    } else {
                        simpleDialogElementUIKt$SimpleDialogElementUI$2 = obj2;
                    }
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87816Z(-433843748, i12, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:13)");
                    }
                    if (openDialog.getValue().booleanValue()) {
                        StripeThemeKt.StripeTheme(null, null, null, C43575jt0.m29791b(mo89518u, 256730981, true, new SimpleDialogElementUIKt$SimpleDialogElementUI$3(openDialog, i12, simpleDialogElementUIKt$SimpleDialogElementUI$1, confirmText, simpleDialogElementUIKt$SimpleDialogElementUI$2, dismissText, titleText, messageText)), mo89518u, 3072, 7);
                    }
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                    function03 = simpleDialogElementUIKt$SimpleDialogElementUI$1;
                    function04 = simpleDialogElementUIKt$SimpleDialogElementUI$2;
                }
                mo89512w = mo89518u.mo89512w();
                if (mo89512w != null) {
                    mo89512w.mo20405a(new SimpleDialogElementUIKt$SimpleDialogElementUI$4(openDialog, titleText, messageText, confirmText, dismissText, function03, function04, i, i2));
                    return;
                }
                return;
            }
            obj2 = function02;
            i12 = i3;
            if ((2995931 & i12) != 599186) {
            }
            if (i13 != 0) {
            }
            if (i10 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            if (openDialog.getValue().booleanValue()) {
            }
            if (C35528Qt0.m87827O()) {
            }
            function03 = simpleDialogElementUIKt$SimpleDialogElementUI$1;
            function04 = simpleDialogElementUIKt$SimpleDialogElementUI$2;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
            }
        }
        obj = function0;
        i10 = i2 & 64;
        if (i10 == 0) {
        }
        obj2 = function02;
        i12 = i3;
        if ((2995931 & i12) != 599186) {
        }
        if (i13 != 0) {
        }
        if (i10 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        if (openDialog.getValue().booleanValue()) {
        }
        if (C35528Qt0.m87827O()) {
        }
        function03 = simpleDialogElementUIKt$SimpleDialogElementUI$1;
        function04 = simpleDialogElementUIKt$SimpleDialogElementUI$2;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
        }
    }
}
