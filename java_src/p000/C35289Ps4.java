package p000;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
/* renamed from: Ps4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35289Ps4 implements TypeEvaluator<Rect> {

    /* renamed from: a */
    public final Rect f29186a;

    public C35289Ps4(Rect rect) {
        this.f29186a = rect;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a */
    public Rect evaluate(float f, Rect rect, Rect rect2) {
        int i = rect.left;
        int i2 = i + ((int) ((rect2.left - i) * f));
        int i3 = rect.top;
        int i4 = i3 + ((int) ((rect2.top - i3) * f));
        int i5 = rect.right;
        int i6 = rect.bottom;
        int i7 = i6 + ((int) ((rect2.bottom - i6) * f));
        this.f29186a.set(i2, i4, i5 + ((int) ((rect2.right - i5) * f)), i7);
        return this.f29186a;
    }
}
