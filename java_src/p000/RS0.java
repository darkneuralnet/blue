package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import kotlin.KotlinVersion;
/* renamed from: RS0 */
/* loaded from: classes5.dex */
public abstract class RS0 extends AbstractC47770qx4 {

    /* renamed from: b */
    public C42279hi0 f32035b;

    /* renamed from: c */
    public Paint f32036c;

    /* renamed from: d */
    public Paint f32037d;

    /* renamed from: e */
    public Paint f32038e;

    /* renamed from: f */
    public Paint f32039f;

    public RS0(C42279hi0 c42279hi0, C32951Fs6 c32951Fs6) {
        super(c32951Fs6);
        this.f32035b = c42279hi0;
        Paint paint = new Paint(1);
        this.f32036c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f32038e = new Paint(4);
        Paint paint2 = new Paint(1);
        this.f32039f = paint2;
        paint2.setColor(Color.rgb(63, 63, 63));
        this.f32039f.setTextAlign(Paint.Align.CENTER);
        this.f32039f.setTextSize(AbstractC34967Oi6.m91656e(9.0f));
        Paint paint3 = new Paint(1);
        this.f32037d = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.f32037d.setStrokeWidth(2.0f);
        this.f32037d.setColor(Color.rgb((int) KotlinVersion.MAX_COMPONENT_VALUE, 187, 115));
    }

    /* renamed from: a */
    public void m86739a(InterfaceC46243oO1 interfaceC46243oO1) {
        this.f32039f.setTypeface(interfaceC46243oO1.mo4012k());
        this.f32039f.setTextSize(interfaceC46243oO1.mo4008u0());
    }

    /* renamed from: b */
    public abstract void mo15000b(Canvas canvas);

    /* renamed from: c */
    public abstract void mo14999c(Canvas canvas);

    /* renamed from: d */
    public abstract void mo14998d(Canvas canvas, OM1[] om1Arr);

    /* renamed from: e */
    public abstract void mo14997e(Canvas canvas);

    /* renamed from: f */
    public abstract void mo14996f();

    /* renamed from: g */
    public boolean mo71520g(InterfaceC44058ki0 interfaceC44058ki0) {
        if (interfaceC44058ki0.getData().m33551g() < interfaceC44058ki0.mo28585i() * this.f106125a.m106370q()) {
            return true;
        }
        return false;
    }
}
