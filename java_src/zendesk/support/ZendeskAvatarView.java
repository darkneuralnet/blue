package zendesk.support;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
/* loaded from: classes8.dex */
public class ZendeskAvatarView extends FrameLayout {
    private static final int[] AVATAR_COLORS = {C52925zf4.zs_avatar_view_color_01, C52925zf4.zs_avatar_view_color_02, C52925zf4.zs_avatar_view_color_03, C52925zf4.zs_avatar_view_color_04, C52925zf4.zs_avatar_view_color_05, C52925zf4.zs_avatar_view_color_06, C52925zf4.zs_avatar_view_color_07, C52925zf4.zs_avatar_view_color_08, C52925zf4.zs_avatar_view_color_09, C52925zf4.zs_avatar_view_color_10, C52925zf4.zs_avatar_view_color_11, C52925zf4.zs_avatar_view_color_12, C52925zf4.zs_avatar_view_color_13, C52925zf4.zs_avatar_view_color_14, C52925zf4.zs_avatar_view_color_15, C52925zf4.zs_avatar_view_color_16, C52925zf4.zs_avatar_view_color_17, C52925zf4.zs_avatar_view_color_18, C52925zf4.zs_avatar_view_color_19};
    private boolean enableOutline;
    private ImageView imageView;
    private int strokeColor;
    private int strokeWidth;
    private TextView textView;

    public ZendeskAvatarView(Context context) {
        this(context, null, 0);
    }

    private Drawable getBackgroundShape(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(NA0.m94301c(getContext(), i));
        if (this.enableOutline) {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable2.getPaint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            paint.setColor(this.strokeColor);
            paint.setStrokeWidth(this.strokeWidth);
            return new LayerDrawable(new Drawable[]{shapeDrawable, new InsetDrawable((Drawable) shapeDrawable2, this.strokeWidth / 2)});
        }
        return shapeDrawable;
    }

    private int getColorId(Object obj) {
        int[] iArr = AVATAR_COLORS;
        return iArr[Math.abs(obj.hashCode() % iArr.length)];
    }

    private void initViews() {
        TextView textView = new TextView(getContext());
        this.textView = textView;
        textView.setId(C35181Pg4.zs_avatar_view_text_view);
        this.textView.setTextColor(NA0.m94301c(getContext(), C52925zf4.zs_avatar_text_color));
        this.textView.setGravity(17);
        this.textView.setTextSize(2, 16.0f);
        ImageView imageView = new ImageView(getContext());
        this.imageView = imageView;
        imageView.setId(C35181Pg4.zs_avatar_view_image_view);
        addView(this.textView);
        addView(this.imageView);
    }

    private void setTextView(String str) {
        setBackground(getBackgroundShape(getColorId(str)));
        this.textView.setText(String.valueOf(Character.toUpperCase(str.charAt(0))));
    }

    public void setStroke(int i, int i2) {
        this.strokeColor = i;
        this.strokeWidth = i2;
        this.enableOutline = true;
    }

    public void showUserWithAvatarImage(C42732iT3 c42732iT3, String str, String str2, int i) {
        this.imageView.setVisibility(0);
        this.imageView.setImageResource(C52925zf4.zs_color_transparent);
        if (C44504lS5.m27273b(str2)) {
            this.textView.setVisibility(0);
            setTextView(str2);
        }
        this.imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FI4 m33877l = c42732iT3.m33877l(str);
        int i2 = i * 2;
        m33877l.m107336k(i2, i2).m107346a().m107337j().m107335l(PicassoTransformations.getRoundWithBorderTransformation(i, this.strokeColor, this.strokeWidth)).m107340g(this.imageView);
    }

    public void showUserWithIdentifier(Object obj) {
        if (obj != null) {
            setBackground(getBackgroundShape(getColorId(obj)));
            this.imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.imageView.setImageResource(C32373Dg4.zs_request_list_account_icon);
            this.textView.setVisibility(4);
            this.imageView.setVisibility(0);
        }
    }

    public void showUserWithName(String str) {
        if (C44504lS5.m27273b(str)) {
            setTextView(str);
            this.textView.setVisibility(0);
            this.imageView.setVisibility(4);
        }
    }

    public ZendeskAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ZendeskAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.enableOutline = false;
        this.strokeColor = 0;
        this.strokeWidth = 0;
        initViews();
    }
}
