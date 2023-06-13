package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.PartKind;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/constant/PartKind;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "repair_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPartKind+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartKind+.kt\nco/bird/android/feature/repair/extensions/PartKind_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
/* renamed from: fI3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40854fI3 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fI3$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C20351a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PartKind.values().length];
            try {
                iArr[PartKind.CHASSIS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PartKind.BRAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PartKind.SIM_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PartKind.STICKER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PartKind.PLATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PartKind.PCM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PartKind.GERMAN_PLATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PartKind.BATTERY_SERIAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PartKind.US_CA_PLATE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PartKind.MOTOR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PartKind.BEACON.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PartKind.IL_PLATE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PartKind.HELMET.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PartKind.PHYSICAL_LOCK_STICKER.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final String m41604a(PartKind partKind, Context context) {
        Integer valueOf;
        Intrinsics.checkNotNullParameter(partKind, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        switch (C20351a.$EnumSwitchMapping$0[partKind.ordinal()]) {
            case 1:
                valueOf = Integer.valueOf(C45871nl4.part_kind_chassis);
                break;
            case 2:
                valueOf = Integer.valueOf(C45871nl4.part_kind_brain);
                break;
            case 3:
                valueOf = Integer.valueOf(C45871nl4.part_kind_sim_card);
                break;
            case 4:
                valueOf = Integer.valueOf(C45871nl4.part_kind_sticker);
                break;
            case 5:
                valueOf = Integer.valueOf(C45871nl4.part_kind_plate);
                break;
            case 6:
                valueOf = Integer.valueOf(C45871nl4.part_kind_pcm);
                break;
            case 7:
                valueOf = Integer.valueOf(C45871nl4.part_kind_german_plate);
                break;
            case 8:
                valueOf = Integer.valueOf(C45871nl4.part_kind_battery_serial);
                break;
            case 9:
                valueOf = Integer.valueOf(C45871nl4.part_kind_us_ca_plate);
                break;
            case 10:
                valueOf = Integer.valueOf(C45871nl4.part_kind_motor);
                break;
            case 11:
                valueOf = Integer.valueOf(C45871nl4.part_kind_beacon);
                break;
            case 12:
                valueOf = Integer.valueOf(C45871nl4.part_kind_il_plate);
                break;
            case 13:
                valueOf = Integer.valueOf(C45871nl4.part_helmet);
                break;
            case 14:
                valueOf = Integer.valueOf(C45871nl4.part_physical_lock_sticker);
                break;
            default:
                valueOf = null;
                break;
        }
        if (valueOf == null) {
            return null;
        }
        return context.getString(valueOf.intValue());
    }
}
