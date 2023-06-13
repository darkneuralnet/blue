package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.IdToolOption;
import com.facebook.share.internal.C17296a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a\n\u0010\u0007\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0003*\u00020\u0000¨\u0006\t"}, m28432d2 = {"Lco/bird/android/model/IdToolOption;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "lowercase", "", "c", "b", C17296a.f69688o, "servicecenter_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: aQ1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37942aQ1 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: aQ1$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C10690a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdToolOption.values().length];
            try {
                iArr[IdToolOption.QR_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdToolOption.LICENSE_PLATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdToolOption.BRAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdToolOption.HANDLEBAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IdToolOption.GERMAN_LICENSE_PLATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IdToolOption.IL_LICENSE_PLATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IdToolOption.ONE_CODE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[IdToolOption.BATTERY_SERIAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[IdToolOption.US_CA_PLATE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[IdToolOption.MOTOR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[IdToolOption.PCM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[IdToolOption.BEACON.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[IdToolOption.HELMET.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[IdToolOption.PHYSICAL_LOCK_STICKER.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final boolean m71430a(IdToolOption idToolOption) {
        Intrinsics.checkNotNullParameter(idToolOption, "<this>");
        switch (C10690a.$EnumSwitchMapping$0[idToolOption.ordinal()]) {
            case 1:
            case 4:
            case 7:
            case 8:
            case 10:
            case 12:
            case 13:
            case 14:
                return false;
            case 2:
            case 3:
            case 5:
            case 6:
            case 9:
            case 11:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b */
    public static final boolean m71429b(IdToolOption idToolOption) {
        Intrinsics.checkNotNullParameter(idToolOption, "<this>");
        switch (C10690a.$EnumSwitchMapping$0[idToolOption.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                return true;
            case 12:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: c */
    public static final String m71428c(IdToolOption idToolOption, Context context, boolean z) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        String capitalize;
        String capitalize2;
        Intrinsics.checkNotNullParameter(idToolOption, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        switch (C10690a.$EnumSwitchMapping$0[idToolOption.ordinal()]) {
            case 1:
                if (z) {
                    string = context.getString(C45871nl4.id_tools_qr_code_label_lowercase);
                } else {
                    string = context.getString(C45871nl4.id_tools_qr_code_label);
                }
                Intrinsics.checkNotNullExpressionValue(string, "if (lowercase) {\n      c…ools_qr_code_label)\n    }");
                return string;
            case 2:
                if (z) {
                    string2 = context.getString(C45871nl4.id_tools_license_plate_label_lowercase);
                } else {
                    string2 = context.getString(C45871nl4.id_tools_license_plate_label);
                }
                Intrinsics.checkNotNullExpressionValue(string2, "if (lowercase) {\n      c…icense_plate_label)\n    }");
                return string2;
            case 3:
                if (z) {
                    string3 = context.getString(C45871nl4.id_tools_brain_label_lowercase);
                } else {
                    string3 = context.getString(C45871nl4.id_tools_brain_label);
                }
                Intrinsics.checkNotNullExpressionValue(string3, "if (lowercase) {\n      c…_tools_brain_label)\n    }");
                return string3;
            case 4:
                if (z) {
                    string4 = context.getString(C45871nl4.id_tools_handlebar_label_lowercase);
                } else {
                    string4 = context.getString(C45871nl4.id_tools_handlebar_label);
                }
                Intrinsics.checkNotNullExpressionValue(string4, "if (lowercase) {\n      c…ls_handlebar_label)\n    }");
                return string4;
            case 5:
                if (z) {
                    string5 = context.getString(C45871nl4.id_tools_german_license_plate_label_lowercase);
                } else {
                    string5 = context.getString(C45871nl4.id_tools_german_license_plate_label);
                }
                Intrinsics.checkNotNullExpressionValue(string5, "if (lowercase) {\n      c…icense_plate_label)\n    }");
                return string5;
            case 6:
                if (z) {
                    string6 = context.getString(C45871nl4.id_tools_il_license_plate_label_lowercase);
                } else {
                    string6 = context.getString(C45871nl4.id_tools_il_license_plate_label);
                }
                Intrinsics.checkNotNullExpressionValue(string6, "if (lowercase) {\n      c…icense_plate_label)\n    }");
                return string6;
            case 7:
                if (z) {
                    string7 = context.getString(C45871nl4.id_tools_one_code_label_lowercase);
                } else {
                    string7 = context.getString(C45871nl4.id_tools_one_code_label);
                }
                Intrinsics.checkNotNullExpressionValue(string7, "if (lowercase) {\n      c…ols_one_code_label)\n    }");
                return string7;
            case 8:
                if (z) {
                    string8 = context.getString(C45871nl4.id_tools_battery_serial_label_lowercase);
                } else {
                    string8 = context.getString(C45871nl4.id_tools_battery_serial_label);
                }
                Intrinsics.checkNotNullExpressionValue(string8, "if (lowercase) {\n      c…ttery_serial_label)\n    }");
                return string8;
            case 9:
                if (z) {
                    string9 = context.getString(C45871nl4.id_tools_us_ca_plate_label_lowercase);
                } else {
                    string9 = context.getString(C45871nl4.id_tools_us_ca_plate_label);
                }
                Intrinsics.checkNotNullExpressionValue(string9, "if (lowercase) {\n      c…_us_ca_plate_label)\n    }");
                return string9;
            case 10:
                if (z) {
                    string10 = context.getString(C45871nl4.id_tools_motor_label_lowercase);
                } else {
                    string10 = context.getString(C45871nl4.id_tools_motor_label);
                }
                Intrinsics.checkNotNullExpressionValue(string10, "if (lowercase) {\n      c…_tools_motor_label)\n    }");
                return string10;
            case 11:
                String string12 = context.getString(C45871nl4.id_tools_pcm_label);
                Intrinsics.checkNotNullExpressionValue(string12, "context.getString(L.string.id_tools_pcm_label)");
                return string12;
            case 12:
                if (z) {
                    string11 = context.getString(C45871nl4.id_tools_beacon_label_lowercase);
                } else {
                    string11 = context.getString(C45871nl4.id_tools_beacon_label);
                }
                Intrinsics.checkNotNullExpressionValue(string11, "if (lowercase) {\n      c…tools_beacon_label)\n    }");
                return string11;
            case 13:
                String it = context.getString(C45871nl4.part_helmet);
                if (z) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                    String lowerCase = it.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    return lowerCase;
                }
                Intrinsics.checkNotNullExpressionValue(it, "it");
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "getDefault()");
                capitalize = StringsKt__StringsJVMKt.capitalize(it, locale2);
                return capitalize;
            case 14:
                String it2 = context.getString(C45871nl4.part_physical_lock_sticker);
                if (z) {
                    Intrinsics.checkNotNullExpressionValue(it2, "it");
                    Locale locale3 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale3, "getDefault()");
                    String lowerCase2 = it2.toLowerCase(locale3);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                    return lowerCase2;
                }
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                Locale locale4 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale4, "getDefault()");
                capitalize2 = StringsKt__StringsJVMKt.capitalize(it2, locale4);
                return capitalize2;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ String label$default(IdToolOption idToolOption, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m71428c(idToolOption, context, z);
    }
}
