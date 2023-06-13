package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;
/* loaded from: classes.dex */
public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        m65967R0();
    }

    /* renamed from: R0 */
    public final void m65967R0() {
        m65861M0(1);
        m65869C0(new Fade(2)).m65869C0(new ChangeBounds()).m65869C0(new Fade(1));
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m65967R0();
    }
}
