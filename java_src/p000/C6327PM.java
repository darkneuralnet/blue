package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.BirdModel;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/constant/BirdModel;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/drawable/Drawable;", C17296a.f69688o, "widget_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdModel+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdModel+.kt\nco/bird/android/utility/extension/BirdModel_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
/* renamed from: PM */
/* loaded from: classes4.dex */
public final class C6327PM {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: PM$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C6328a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BirdModel.values().length];
            try {
                iArr[BirdModel.M365.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BirdModel.ES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BirdModel.ESX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BirdModel.BD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BirdModel.RF.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BirdModel.B2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BirdModel.B3.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BirdModel.BC.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BirdModel.EB100.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BirdModel.ES400.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BirdModel.ES500.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BirdModel.SGC.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BirdModel.SSC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BirdModel.STE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BirdModel.SFB.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BirdModel.SKF.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BirdModel.SFK.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BirdModel.BIRDAIR.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final Drawable m90445a(BirdModel birdModel, Context context) {
        Integer valueOf;
        Intrinsics.checkNotNullParameter(birdModel, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        switch (C6328a.$EnumSwitchMapping$0[birdModel.ordinal()]) {
            case 1:
                valueOf = Integer.valueOf(C33309Hg4.illustration_m365);
                break;
            case 2:
                valueOf = Integer.valueOf(C33309Hg4.illustration_es);
                break;
            case 3:
                valueOf = Integer.valueOf(C33309Hg4.illustration_esx);
                break;
            case 4:
                valueOf = Integer.valueOf(C33309Hg4.illustration_bird_zero);
                break;
            case 5:
                valueOf = Integer.valueOf(C33309Hg4.illustration_bird_one);
                break;
            case 6:
                valueOf = Integer.valueOf(C33309Hg4.illustration_bird_2);
                break;
            case 7:
                valueOf = Integer.valueOf(C33309Hg4.illustration_bird_2);
                break;
            case 8:
                valueOf = Integer.valueOf(C33309Hg4.illustration_bird_cruiser);
                break;
            case 9:
                valueOf = Integer.valueOf(C33309Hg4.illustration_bird_bike);
                break;
            case 10:
                valueOf = Integer.valueOf(C33309Hg4.illustration_bird_s);
                break;
            case 11:
                valueOf = Integer.valueOf(C33309Hg4.illustration_bird_flex);
                break;
            default:
                valueOf = null;
                break;
        }
        if (valueOf == null) {
            return null;
        }
        return NA0.m94299e(context, valueOf.intValue());
    }
}
