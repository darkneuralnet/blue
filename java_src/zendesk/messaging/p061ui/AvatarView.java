package zendesk.messaging.p061ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import zendesk.messaging.R$array;
import zendesk.messaging.R$attr;
import zendesk.messaging.R$color;
import zendesk.messaging.R$dimen;
import zendesk.messaging.R$id;
import zendesk.messaging.R$layout;
import zendesk.messaging.R$styleable;
/* renamed from: zendesk.messaging.ui.AvatarView */
/* loaded from: classes8.dex */
public class AvatarView extends FrameLayout {
    private final int avatarSize;
    private final int[] colorPalette;
    private final ImageView imageView;
    private final int outlineColor;
    private final int outlineSize;
    private final TextView textView;

    public AvatarView(Context context) {
        this(context, null, 0);
    }

    private Drawable generateBackground(Object obj) {
        int i = this.colorPalette[Math.abs(obj.hashCode() % this.colorPalette.length)];
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i);
        if (this.outlineSize > 0) {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable2.getPaint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            paint.setColor(this.outlineColor);
            paint.setStrokeWidth(this.outlineSize);
            return new LayerDrawable(new Drawable[]{shapeDrawable, new InsetDrawable((Drawable) shapeDrawable2, this.outlineSize / 2)});
        }
        return shapeDrawable;
    }

    public void showDefault(int i, Object obj) {
        setBackground(generateBackground(obj));
        this.imageView.setImageResource(i);
        this.textView.setVisibility(8);
        this.imageView.setVisibility(0);
    }

    public void showDrawable(int i) {
        setBackground(null);
        this.imageView.setImageResource(i);
        this.textView.setVisibility(8);
        this.imageView.setVisibility(0);
    }

    public void showImage(C42732iT3 c42732iT3, String str) {
        if (this.avatarSize - this.outlineSize > 0) {
            setBackground(null);
            this.imageView.setImageResource(R$color.zui_color_transparent);
            this.imageView.setVisibility(0);
            this.textView.setVisibility(8);
            FI4 m33877l = c42732iT3.m33877l(str);
            int i = this.avatarSize;
            int i2 = this.outlineSize;
            m33877l.m107336k(i - i2, i - i2).m107346a().m107337j().m107335l(C44511lT3.m27258a(this.avatarSize, this.outlineColor, this.outlineSize)).m107340g(this.imageView);
        }
    }

    public void showLetter(String str, Object obj) {
        setBackground(generateBackground(obj));
        this.textView.setText(str);
        this.textView.setVisibility(0);
        this.imageView.setVisibility(8);
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, R$layout.zui_view_avatar, this);
        Resources resources = getResources();
        int color = resources.getColor(R$color.zui_color_white_80);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R$dimen.zui_avatar_view_outline);
        int m115422e = C31646Ad6.m115422e(R$attr.colorPrimary, context, R$color.zui_color_primary);
        this.imageView = (ImageView) findViewById(R$id.zui_avatar_image);
        TextView textView = (TextView) findViewById(R$id.zui_avatar_letter);
        this.textView = textView;
        this.avatarSize = resources.getDimensionPixelSize(R$dimen.zui_avatar_view_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AvatarView);
        this.colorPalette = resources.getIntArray(obtainStyledAttributes.getResourceId(R$styleable.AvatarView_colorPalette, R$array.zui_avatar_view__background_color_palette));
        this.outlineSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.AvatarView_outlineSize, dimensionPixelOffset);
        this.outlineColor = obtainStyledAttributes.getColor(R$styleable.AvatarView_outlineColor, m115422e);
        textView.setTextColor(obtainStyledAttributes.getColor(R$styleable.AvatarView_textColor, color));
        obtainStyledAttributes.recycle();
    }
}
