package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.amazonaws.services.p026s3.model.InstructionFileId;
/* renamed from: xr2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC51857xr2 extends AbstractC53043zr2 {
    public AbstractC51857xr2(C42279hi0 c42279hi0, C32951Fs6 c32951Fs6) {
        super(c42279hi0, c32951Fs6);
    }

    /* renamed from: k */
    public final boolean m4557k() {
        return AbstractC34967Oi6.m91642s() >= 18;
    }

    /* renamed from: l */
    public void m4556l(Canvas canvas, Path path, int i, int i2) {
        int i3 = (i & 16777215) | (i2 << 24);
        if (m4557k()) {
            int save = canvas.save();
            canvas.clipPath(path);
            canvas.drawColor(i3);
            canvas.restoreToCount(save);
            return;
        }
        Paint.Style style = this.f32036c.getStyle();
        int color = this.f32036c.getColor();
        this.f32036c.setStyle(Paint.Style.FILL);
        this.f32036c.setColor(i3);
        canvas.drawPath(path, this.f32036c);
        this.f32036c.setColor(color);
        this.f32036c.setStyle(style);
    }

    /* renamed from: m */
    public void m4555m(Canvas canvas, Path path, Drawable drawable) {
        if (m4557k()) {
            int save = canvas.save();
            canvas.clipPath(path);
            drawable.setBounds((int) this.f106125a.m106379h(), (int) this.f106125a.m106377j(), (int) this.f106125a.m106378i(), (int) this.f106125a.m106381f());
            drawable.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        throw new RuntimeException("Fill-drawables not (yet) supported below API level 18, this code was run on API level " + AbstractC34967Oi6.m91642s() + InstructionFileId.DOT);
    }
}
