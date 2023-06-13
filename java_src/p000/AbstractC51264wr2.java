package p000;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import java.util.List;
import kotlin.KotlinVersion;
/* renamed from: wr2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC51264wr2<T extends Entry> extends AbstractC52450yr2<T> implements NO1<T> {

    /* renamed from: C */
    public int f116637C;

    /* renamed from: D */
    public Drawable f116638D;

    /* renamed from: E */
    public int f116639E;

    /* renamed from: F */
    public float f116640F;

    /* renamed from: G */
    public boolean f116641G;

    public AbstractC51264wr2(List<T> list, String str) {
        super(list, str);
        this.f116637C = Color.rgb(140, 234, (int) KotlinVersion.MAX_COMPONENT_VALUE);
        this.f116639E = 85;
        this.f116640F = 2.5f;
        this.f116641G = false;
    }

    @Override // p000.NO1
    /* renamed from: T */
    public int mo6222T() {
        return this.f116639E;
    }

    @Override // p000.NO1
    /* renamed from: W */
    public float mo6221W() {
        return this.f116640F;
    }

    /* renamed from: Z0 */
    public void m6220Z0(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 10.0f) {
            f = 10.0f;
        }
        this.f116640F = AbstractC34967Oi6.m91656e(f);
    }

    @Override // p000.NO1
    /* renamed from: f */
    public Drawable mo6219f() {
        return this.f116638D;
    }

    @Override // p000.NO1
    /* renamed from: x0 */
    public boolean mo6218x0() {
        return this.f116641G;
    }

    @Override // p000.NO1
    /* renamed from: y */
    public int mo6217y() {
        return this.f116637C;
    }
}
