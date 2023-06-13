package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.NestIcon;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/constant/NestIcon;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/drawable/Drawable;", C17296a.f69688o, "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestIcon+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestIcon+.kt\nco/bird/android/library/extension/NestIcon_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
/* renamed from: S33 */
/* loaded from: classes3.dex */
public final class S33 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: S33$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C7320a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NestIcon.values().length];
            try {
                iArr[NestIcon.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NestIcon.BIRD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NestIcon.BIKE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NestIcon.BLUE_HEART.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NestIcon.BLUE_STAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NestIcon.FLAG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[NestIcon.GOLD_HEART.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[NestIcon.GOLD_STAR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[NestIcon.HEART.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[NestIcon.LOCK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[NestIcon.REBALANCE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[NestIcon.SILVER_HEART.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[NestIcon.SILVER_STAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[NestIcon.TRIAL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final Drawable m86052a(NestIcon nestIcon, Context context) {
        Integer valueOf;
        Intrinsics.checkNotNullParameter(nestIcon, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        switch (C7320a.$EnumSwitchMapping$0[nestIcon.ordinal()]) {
            case 1:
                valueOf = Integer.valueOf(C48193rg4.ic_arrow_down);
                break;
            case 2:
                valueOf = Integer.valueOf(C48193rg4.ic_nest_scooter);
                break;
            case 3:
                valueOf = Integer.valueOf(C48193rg4.ic_bike);
                break;
            case 4:
                valueOf = Integer.valueOf(C48193rg4.ic_blue_heart);
                break;
            case 5:
                valueOf = Integer.valueOf(C48193rg4.ic_star_emoji_blue);
                break;
            case 6:
                valueOf = Integer.valueOf(C48193rg4.ic_issue_triangle);
                break;
            case 7:
                valueOf = Integer.valueOf(C48193rg4.ic_gold_heart);
                break;
            case 8:
                valueOf = Integer.valueOf(C33309Hg4.ic_star_emoji_gold);
                break;
            case 9:
                valueOf = Integer.valueOf(C48193rg4.ic_heart);
                break;
            case 10:
                valueOf = Integer.valueOf(C48193rg4.ic_filled_lock);
                break;
            case 11:
                valueOf = Integer.valueOf(C48193rg4.ic_rebalance);
                break;
            case 12:
                valueOf = Integer.valueOf(C48193rg4.ic_silver_heart);
                break;
            case 13:
                valueOf = Integer.valueOf(C33309Hg4.ic_star_emoji_silver);
                break;
            case 14:
                valueOf = Integer.valueOf(C48193rg4.ic_hourglass);
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
