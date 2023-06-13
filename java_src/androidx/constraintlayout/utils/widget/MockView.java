package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.C11925l;
import kotlin.KotlinVersion;
/* loaded from: classes.dex */
public class MockView extends View {

    /* renamed from: b */
    public Paint f53858b;

    /* renamed from: c */
    public Paint f53859c;

    /* renamed from: d */
    public Paint f53860d;

    /* renamed from: e */
    public boolean f53861e;

    /* renamed from: f */
    public boolean f53862f;

    /* renamed from: g */
    public String f53863g;

    /* renamed from: h */
    public Rect f53864h;

    /* renamed from: i */
    public int f53865i;

    /* renamed from: j */
    public int f53866j;

    /* renamed from: k */
    public int f53867k;

    /* renamed from: l */
    public int f53868l;

    public MockView(Context context) {
        super(context);
        this.f53858b = new Paint();
        this.f53859c = new Paint();
        this.f53860d = new Paint();
        this.f53861e = true;
        this.f53862f = true;
        this.f53863g = null;
        this.f53864h = new Rect();
        this.f53865i = Color.argb((int) KotlinVersion.MAX_COMPONENT_VALUE, 0, 0, 0);
        this.f53866j = Color.argb((int) KotlinVersion.MAX_COMPONENT_VALUE, (int) C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, (int) C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, (int) C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION);
        this.f53867k = Color.argb((int) KotlinVersion.MAX_COMPONENT_VALUE, 50, 50, 50);
        this.f53868l = 4;
        m67924a(context, null);
    }

    /* renamed from: a */
    public final void m67924a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C39341cm4.MockView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C39341cm4.MockView_mock_label) {
                    this.f53863g = obtainStyledAttributes.getString(index);
                } else if (index == C39341cm4.MockView_mock_showDiagonals) {
                    this.f53861e = obtainStyledAttributes.getBoolean(index, this.f53861e);
                } else if (index == C39341cm4.MockView_mock_diagonalsColor) {
                    this.f53865i = obtainStyledAttributes.getColor(index, this.f53865i);
                } else if (index == C39341cm4.MockView_mock_labelBackgroundColor) {
                    this.f53867k = obtainStyledAttributes.getColor(index, this.f53867k);
                } else if (index == C39341cm4.MockView_mock_labelColor) {
                    this.f53866j = obtainStyledAttributes.getColor(index, this.f53866j);
                } else if (index == C39341cm4.MockView_mock_showLabel) {
                    this.f53862f = obtainStyledAttributes.getBoolean(index, this.f53862f);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f53863g == null) {
            try {
                this.f53863g = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f53858b.setColor(this.f53865i);
        this.f53858b.setAntiAlias(true);
        this.f53859c.setColor(this.f53866j);
        this.f53859c.setAntiAlias(true);
        this.f53860d.setColor(this.f53867k);
        this.f53868l = Math.round(this.f53868l * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f53861e) {
            width--;
            height--;
            float f = width;
            float f2 = height;
            canvas.drawLine(0.0f, 0.0f, f, f2, this.f53858b);
            canvas.drawLine(0.0f, f2, f, 0.0f, this.f53858b);
            canvas.drawLine(0.0f, 0.0f, f, 0.0f, this.f53858b);
            canvas.drawLine(f, 0.0f, f, f2, this.f53858b);
            canvas.drawLine(f, f2, 0.0f, f2, this.f53858b);
            canvas.drawLine(0.0f, f2, 0.0f, 0.0f, this.f53858b);
        }
        String str = this.f53863g;
        if (str != null && this.f53862f) {
            this.f53859c.getTextBounds(str, 0, str.length(), this.f53864h);
            float width2 = (width - this.f53864h.width()) / 2.0f;
            float height2 = ((height - this.f53864h.height()) / 2.0f) + this.f53864h.height();
            this.f53864h.offset((int) width2, (int) height2);
            Rect rect = this.f53864h;
            int i = rect.left;
            int i2 = this.f53868l;
            rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
            canvas.drawRect(this.f53864h, this.f53860d);
            canvas.drawText(this.f53863g, width2, height2, this.f53859c);
        }
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53858b = new Paint();
        this.f53859c = new Paint();
        this.f53860d = new Paint();
        this.f53861e = true;
        this.f53862f = true;
        this.f53863g = null;
        this.f53864h = new Rect();
        this.f53865i = Color.argb((int) KotlinVersion.MAX_COMPONENT_VALUE, 0, 0, 0);
        this.f53866j = Color.argb((int) KotlinVersion.MAX_COMPONENT_VALUE, (int) C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, (int) C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, (int) C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION);
        this.f53867k = Color.argb((int) KotlinVersion.MAX_COMPONENT_VALUE, 50, 50, 50);
        this.f53868l = 4;
        m67924a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53858b = new Paint();
        this.f53859c = new Paint();
        this.f53860d = new Paint();
        this.f53861e = true;
        this.f53862f = true;
        this.f53863g = null;
        this.f53864h = new Rect();
        this.f53865i = Color.argb((int) KotlinVersion.MAX_COMPONENT_VALUE, 0, 0, 0);
        this.f53866j = Color.argb((int) KotlinVersion.MAX_COMPONENT_VALUE, (int) C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, (int) C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, (int) C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION);
        this.f53867k = Color.argb((int) KotlinVersion.MAX_COMPONENT_VALUE, 50, 50, 50);
        this.f53868l = 4;
        m67924a(context, attributeSet);
    }
}
