package p000;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;
/* renamed from: N61 */
/* loaded from: classes6.dex */
public class N61 extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f24152b = new N61();

    /* renamed from: a */
    public final WeakHashMap<Drawable, Integer> f24153a;

    private N61() {
        super(Integer.class, "drawableAlphaCompat");
        this.f24153a = new WeakHashMap<>();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
