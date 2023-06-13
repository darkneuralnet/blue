package co.bird.android.model.wire;

import android.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m28432d2 = {"colorCode", "", "Lco/bird/android/model/wire/WireBirdLabel;", "model-wire_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBirdLabelKt {
    public static final int colorCode(WireBirdLabel wireBirdLabel) {
        int checkRadix;
        Intrinsics.checkNotNullParameter(wireBirdLabel, "<this>");
        try {
            int color = wireBirdLabel.getColor();
            checkRadix = CharsKt__CharJVMKt.checkRadix(16);
            String num = Integer.toString(color, checkRadix);
            Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
            return Color.parseColor("#" + num);
        } catch (Exception unused) {
            return -16777216;
        }
    }
}
