package p000;

import android.graphics.Color;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.AlertImage;
import co.bird.android.model.wire.WireAlert;
import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0000*\u00020\u0003H\u0001\u001a\f\u0010\u0005\u001a\u00020\u0000*\u00020\u0003H\u0001\u001a\u0019\u0010\u0007\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\n\u0010\t\u001a\u00020\u0000*\u00020\u0003¨\u0006\n"}, m28432d2 = {"", "", "b", "Lco/bird/android/model/wire/WireAlert;", C17296a.f69688o, "e", "color", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Integer;)I", "c", "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: D9 */
/* loaded from: classes2.dex */
public final class C1399D9 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D9$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1400a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlertImage.values().length];
            try {
                iArr[AlertImage.MOON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlertImage.RAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AlertImage.SCOOTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final int m110878a(WireAlert wireAlert) {
        Intrinsics.checkNotNullParameter(wireAlert, "<this>");
        if (wireAlert.getBackgroundColor() == null) {
            return -1;
        }
        return m110875d(wireAlert.getBackgroundColor());
    }

    /* renamed from: b */
    public static final String m110877b(int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i & 16777215)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }

    /* renamed from: c */
    public static final int m110876c(WireAlert wireAlert) {
        int i;
        Intrinsics.checkNotNullParameter(wireAlert, "<this>");
        AlertImage image = wireAlert.getImage();
        if (image == null) {
            i = -1;
        } else {
            i = C1400a.$EnumSwitchMapping$0[image.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return C48193rg4.ic_flying_scooter;
                }
                return C48193rg4.ic_flying_scooter;
            }
            return C48193rg4.ic_raindrop_black;
        }
        return C48193rg4.ic_moon_white;
    }

    /* renamed from: d */
    public static final int m110875d(Integer num) {
        String str;
        if (num != null) {
            str = m110877b(num.intValue());
        } else {
            str = null;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return -16777216;
        }
    }

    /* renamed from: e */
    public static final int m110874e(WireAlert wireAlert) {
        Intrinsics.checkNotNullParameter(wireAlert, "<this>");
        if (wireAlert.getTextColor() == null) {
            return -16777216;
        }
        return m110875d(wireAlert.getTextColor());
    }
}
