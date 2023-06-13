package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.ProgressType;
import co.bird.android.model.wire.WireFrequentFlyerProgress;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireFrequentFlyerProgress;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/drawable/Drawable;", C17296a.f69688o, "frequent-flyer_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: mA1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44931mA1 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mA1$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C25930a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProgressType.values().length];
            try {
                iArr[ProgressType.PILLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final Drawable m26205a(WireFrequentFlyerProgress wireFrequentFlyerProgress, Context context) {
        Intrinsics.checkNotNullParameter(wireFrequentFlyerProgress, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (C25930a.$EnumSwitchMapping$0[wireFrequentFlyerProgress.getProgressType().ordinal()] == 1) {
            return new Q74(wireFrequentFlyerProgress.getTotalRides(), wireFrequentFlyerProgress.getCurrentRides(), wireFrequentFlyerProgress.getColor(), context);
        }
        return new P74(wireFrequentFlyerProgress.getTotalRides(), wireFrequentFlyerProgress.getCurrentRides(), wireFrequentFlyerProgress.getColor(), context);
    }
}
