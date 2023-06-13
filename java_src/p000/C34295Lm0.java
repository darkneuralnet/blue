package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.ColoredIcon;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/constant/ColoredIcon;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/drawable/Drawable;", C17296a.f69688o, "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nColoredIcon+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColoredIcon+.kt\nco/bird/android/library/extension/ColoredIcon_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
/* renamed from: Lm0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34295Lm0 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Lm0$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5080a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColoredIcon.values().length];
            try {
                iArr[ColoredIcon.IC_SCOOTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColoredIcon.IC_STAR_EMOJI_BLUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColoredIcon.IC_STAR_EMOJI_GOLD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ColoredIcon.IC_STAR_EMOJI_SILVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final Drawable m96371a(ColoredIcon coloredIcon, Context context) {
        Integer valueOf;
        Intrinsics.checkNotNullParameter(coloredIcon, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int i = C5080a.$EnumSwitchMapping$0[coloredIcon.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(C33309Hg4.ic_star_emoji_silver);
                    }
                } else {
                    valueOf = Integer.valueOf(C33309Hg4.ic_star_emoji_gold);
                }
            } else {
                valueOf = Integer.valueOf(C48193rg4.ic_star_emoji_blue);
            }
        } else {
            valueOf = Integer.valueOf(C48193rg4.ic_nest_scooter);
        }
        if (valueOf == null) {
            return null;
        }
        valueOf.intValue();
        return NA0.m94299e(context, valueOf.intValue());
    }
}
