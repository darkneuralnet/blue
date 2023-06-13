package p000;

import android.graphics.drawable.Drawable;
/* renamed from: fQ6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40929fQ6 extends Drawable.ConstantState {

    /* renamed from: a */
    public int f80107a;

    /* renamed from: b */
    public int f80108b;

    public C40929fQ6(C40929fQ6 c40929fQ6) {
        if (c40929fQ6 != null) {
            this.f80107a = c40929fQ6.f80107a;
            this.f80108b = c40929fQ6.f80108b;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f80107a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C41522gQ6(this);
    }
}
