package p000;

import co.bird.android.model.IdToolOption;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/IdToolOption;", "LiQ1;", C17296a.f69688o, "servicecenter_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: jQ1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43296jQ1 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jQ1$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C24839a {
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
    public static final EnumC42703iQ1 m30642a(IdToolOption idToolOption) {
        Intrinsics.checkNotNullParameter(idToolOption, "<this>");
        switch (C24839a.$EnumSwitchMapping$0[idToolOption.ordinal()]) {
            case 1:
                return EnumC42703iQ1.f87250g;
            case 2:
                return EnumC42703iQ1.f87251h;
            case 3:
                return EnumC42703iQ1.f87252i;
            case 4:
                return EnumC42703iQ1.f87253j;
            case 5:
                return EnumC42703iQ1.f87254k;
            case 6:
                return EnumC42703iQ1.f87255l;
            case 7:
                return EnumC42703iQ1.f87256m;
            case 8:
                return EnumC42703iQ1.f87257n;
            case 9:
                return EnumC42703iQ1.f87258o;
            case 10:
                return EnumC42703iQ1.f87259p;
            case 11:
                return EnumC42703iQ1.f87260q;
            case 12:
                return EnumC42703iQ1.f87261r;
            case 13:
                return EnumC42703iQ1.f87262s;
            case 14:
                return EnumC42703iQ1.f87263t;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
