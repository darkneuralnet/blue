package p000;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import kotlin.KotlinVersion;
/* renamed from: Pl2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C35224Pl2 extends Paint {
    public C35224Pl2() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT < 30) {
            setColor((C48077rU2.m15917c(i, 0, KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (getColor() & 16777215));
            return;
        }
        super.setAlpha(C48077rU2.m15917c(i, 0, KotlinVersion.MAX_COMPONENT_VALUE));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public C35224Pl2(int i) {
        super(i);
    }

    public C35224Pl2(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C35224Pl2(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
