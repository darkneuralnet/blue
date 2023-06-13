package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.IdToolOption;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.constant.ScanStatus;
import co.bird.android.model.wire.configs.RideConfig;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aO\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\u000f\u001a\u00020\u0006*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0000H\u0002\u001a\"\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014¨\u0006\u0018"}, m28432d2 = {"Landroid/content/Context;", "", "isGuest", "", "guestRes", "hostRes", "", "fineString", "guestFineRes", "hostFineRes", "", "b", "(Landroid/content/Context;ZIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/CharSequence;", "Lco/bird/android/model/IdToolOption;", CoreConstants.CONTEXT_SCOPE_VALUE, DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/constant/ScanMode;", "mode", "Lco/bird/android/model/constant/ScanStatus;", "status", "LTq4;", "reactiveConfig", "LNy;", C17296a.f69688o, "core-base_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Oy */
/* loaded from: classes2.dex */
public final class C6212Oy {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Oy$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C6213a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

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
                iArr[IdToolOption.ONE_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IdToolOption.BATTERY_SERIAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IdToolOption.MOTOR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[IdToolOption.GERMAN_LICENSE_PLATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[IdToolOption.IL_LICENSE_PLATE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[IdToolOption.US_CA_PLATE.ordinal()] = 10;
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
            int[] iArr2 = new int[ScanStatus.values().length];
            try {
                iArr2[ScanStatus.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[ScanStatus.RELEASED.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[ScanStatus.FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[ScanStatus.IN_RIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[ScanStatus.LOW_BATTERY.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[ScanStatus.OFFLINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[ScanStatus.DAMAGED.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[ScanStatus.INVALID_CODE.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[ScanStatus.QR_DETACHED.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[ScanStatus.QR_REQUIRED.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[ScanStatus.AWAITING_FLEET_CHANGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[ScanStatus.AWAITING_TASK.ordinal()] = 12;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[ScanStatus.AFTER_HOURS.ordinal()] = 13;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[ScanStatus.WEATHER.ordinal()] = 14;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[ScanStatus.NO_RIDE_START.ordinal()] = 15;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[ScanStatus.LOCATION_SERVICES_REQUIRED.ordinal()] = 16;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[ScanStatus.RESERVED.ordinal()] = 17;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[ScanStatus.INACCESSIBLE_PRIVATE.ordinal()] = 18;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[ScanStatus.INCOMPATIBLE_APP.ordinal()] = 19;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[ScanStatus.OUTSIDE_SERVICE_AREA.ordinal()] = 20;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[ScanStatus.INSIDE_NO_RIDE_ZONE.ordinal()] = 21;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[ScanStatus.SUBMERGED.ordinal()] = 22;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[ScanStatus.TOTALED.ordinal()] = 23;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr2[ScanStatus.OWNABLE_SCAN_REQUIRED.ordinal()] = 24;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr2[ScanStatus.UNAVAILABLE_TO_GUEST.ordinal()] = 25;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr2[ScanStatus.NO_BOUNTY.ordinal()] = 26;
            } catch (NoSuchFieldError unused40) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ScanMode.values().length];
            try {
                iArr3[ScanMode.RIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr3[ScanMode.WATCHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr3[ScanMode.SERVICE_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr3[ScanMode.OPERATOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr3[ScanMode.ADMIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused45) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* renamed from: a */
    public static final AbstractC5751Ny m91146a(ScanMode mode, ScanStatus scanStatus, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        RideConfig rideConfig = reactiveConfig.m82623f8().m73665a().getRideConfig();
        int i = C6213a.$EnumSwitchMapping$2[mode.ordinal()];
        int i2 = -1;
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                if (i == 5) {
                    if (scanStatus != null) {
                        i2 = C6213a.$EnumSwitchMapping$1[scanStatus.ordinal()];
                    }
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 8) {
                                if (i2 != 18) {
                                    if (i2 != 19) {
                                        if (i2 != 22) {
                                            if (i2 != 23) {
                                                return null;
                                            }
                                            return C48836sl5.f109218d;
                                        }
                                        return C44093kl5.f94878d;
                                    }
                                    return C42304hk5.f85822d;
                                }
                                return C52976zk5.f122155d;
                            }
                            return new C43490jk5(rideConfig.getMinBirdCodeLength(), rideConfig.getMaxBirdCodeLength());
                        }
                        return C30178xT.f117636d;
                    }
                    return C41711gk5.f84167d;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (scanStatus != null) {
                i2 = C6213a.$EnumSwitchMapping$1[scanStatus.ordinal()];
            }
            if (i2 == 1) {
                return null;
            }
            if (i2 != 26) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 8) {
                            if (i2 != 9) {
                                if (i2 != 18) {
                                    if (i2 != 19) {
                                        if (i2 != 22) {
                                            if (i2 != 23) {
                                                return C50022ul5.f112880d;
                                            }
                                            return C48836sl5.f109218d;
                                        }
                                        return C44093kl5.f94878d;
                                    }
                                    return C42304hk5.f85822d;
                                }
                                return C52976zk5.f122155d;
                            }
                            return C31708Ak5.f1008d;
                        }
                        return new C43490jk5(rideConfig.getMinBirdCodeLength(), rideConfig.getMaxBirdCodeLength());
                    }
                    return C30178xT.f117636d;
                }
                return C41711gk5.f84167d;
            }
            return C45269mk5.f98657d;
        }
        if (scanStatus != null) {
            i2 = C6213a.$EnumSwitchMapping$1[scanStatus.ordinal()];
        }
        switch (i2) {
            case 1:
            case 2:
                return null;
            case 3:
                return C41118fk5.f80532d;
            case 4:
                return C30178xT.f117636d;
            case 5:
                return C44676lk5.f96655d;
            case 6:
                return C46455ok5.f102425d;
            case 7:
                return C36613Vj5.f39610d;
            case 8:
                return new C43490jk5(rideConfig.getMinBirdCodeLength(), rideConfig.getMaxBirdCodeLength());
            case 9:
                return new C37549Zj5(rideConfig.getMinBirdCodeLength(), rideConfig.getMaxBirdCodeLength());
            case 10:
                return C37090Xk5.f43788d;
            case 11:
            case 12:
                return C41701gj5.f84077d;
            case 13:
                return C41108fj5.f80498d;
            case 14:
                return C31717Al5.f1040d;
            case 15:
                return C45862nk5.f100443d;
            case 16:
                return C34621Mw2.f23858d;
            case 17:
                return C35920Sk5.f34190d;
            case 18:
                return C52976zk5.f122155d;
            case 19:
                return C42304hk5.f85822d;
            case 20:
                return C48826sk5.f109180d;
            case 21:
                return C42897ik5.f87806d;
            case 22:
                return C44093kl5.f94878d;
            case 23:
                return C48836sl5.f109218d;
            case 24:
                return C41457gJ4.f81978d;
            case 25:
                return C49429tl5.f110985d;
            default:
                return C50022ul5.f112880d;
        }
    }

    /* renamed from: b */
    public static final CharSequence m91145b(Context context, boolean z, int i, int i2, String str, Integer num, Integer num2) {
        int intValue;
        if (str != null && num2 != null && num != null) {
            if (z) {
                intValue = num.intValue();
            } else {
                intValue = num2.intValue();
            }
            String string = context.getString(intValue, str);
            Intrinsics.checkNotNullExpressionValue(string, "{\n    getString(if (isGu…ineRes }, fineString)\n  }");
            return string;
        }
        if (!z) {
            i = i2;
        }
        String string2 = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "{\n    getString(if (isGu…s } else { hostRes })\n  }");
        return string2;
    }

    /* renamed from: d */
    public static final String m91143d(IdToolOption idToolOption, Context context) {
        String string;
        switch (C6213a.$EnumSwitchMapping$0[idToolOption.ordinal()]) {
            case 1:
                string = context.getString(C45871nl4.id_tools_qr_code_label);
                break;
            case 2:
                string = context.getString(C45871nl4.id_tools_license_plate_label);
                break;
            case 3:
                string = context.getString(C45871nl4.id_tools_brain_label);
                break;
            case 4:
                string = context.getString(C45871nl4.id_tools_handlebar_label);
                break;
            case 5:
                string = context.getString(C45871nl4.id_tools_one_code_label);
                break;
            case 6:
                string = context.getString(C45871nl4.id_tools_battery_serial_label);
                break;
            case 7:
                string = context.getString(C45871nl4.id_tools_motor_label);
                break;
            case 8:
                string = context.getString(C45871nl4.id_tools_german_license_plate_label);
                break;
            case 9:
                string = context.getString(C45871nl4.id_tools_il_license_plate_label);
                break;
            case 10:
                string = context.getString(C45871nl4.id_tools_us_ca_plate_label);
                break;
            case 11:
                string = context.getString(C45871nl4.id_tools_pcm_label);
                break;
            case 12:
                string = context.getString(C45871nl4.id_tools_beacon_label);
                break;
            case 13:
                string = context.getString(C45871nl4.part_helmet);
                break;
            case 14:
                string = context.getString(C45871nl4.part_physical_lock_sticker);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullExpressionValue(string, "when (this) {\n  IdToolOp…_physical_lock_sticker)\n}");
        return string;
    }
}
