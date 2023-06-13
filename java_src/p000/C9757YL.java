package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.BirdLocationSource;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/constant/BirdLocationSource;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/drawable/Drawable;", C17296a.f69688o, "widget_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: YL */
/* loaded from: classes4.dex */
public final class C9757YL {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: YL$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C9758a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BirdLocationSource.values().length];
            try {
                iArr[BirdLocationSource.USER_SCAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BirdLocationSource.BEACON_TRACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BirdLocationSource.BLE_TRACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BirdLocationSource.BEAK_TRACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final Drawable m75240a(BirdLocationSource birdLocationSource, Context context) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(context, "context");
        if (birdLocationSource == null) {
            i = -1;
        } else {
            i = C9758a.$EnumSwitchMapping$0[birdLocationSource.ordinal()];
        }
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                i2 = C48193rg4.ic_ui_signal_four;
            } else {
                i2 = C48193rg4.ic_bluetooth;
            }
        } else {
            i2 = C48193rg4.ic_scan;
        }
        return NA0.m94299e(context, i2);
    }
}
