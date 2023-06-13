package p000;

import android.graphics.Color;
import com.github.mikephil.charting.data.Entry;
import java.util.List;
import kotlin.KotlinVersion;
/* renamed from: zx */
/* loaded from: classes5.dex */
public abstract class AbstractC31596zx<T extends Entry> extends TS0<T> implements YN1<T> {

    /* renamed from: x */
    public int f122509x;

    public AbstractC31596zx(List<T> list, String str) {
        super(list, str);
        this.f122509x = Color.rgb((int) KotlinVersion.MAX_COMPONENT_VALUE, 187, 115);
    }

    @Override // p000.YN1
    /* renamed from: K0 */
    public int mo90K0() {
        return this.f122509x;
    }
}
