package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
/* renamed from: Y46 */
/* loaded from: classes.dex */
public class Y46 extends CM4 {

    /* renamed from: b */
    public final WeakReference<Context> f44503b;

    public Y46(Context context, Resources resources) {
        super(resources);
        this.f44503b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable m112292a = m112292a(i);
        Context context = this.f44503b.get();
        if (m112292a != null && context != null) {
            C46228oM4.m21280g().m21264w(context, i, m112292a);
        }
        return m112292a;
    }
}
