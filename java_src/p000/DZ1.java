package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J2\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\fH\u0007J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\fH\u0007J\u001a\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0014\u001a\u00020\fH\u0007J\u001a\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u0014\u001a\u00020\fH\u0007J\u001c\u0010\u001f\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000fH\u0007J\b\u0010 \u001a\u00020\u0006H\u0007J\u0018\u0010#\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!H\u0007J\u001a\u0010$\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u0014\u001a\u00020\fH\u0002¨\u0006'"}, m28432d2 = {"LDZ1;", "", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/widget/ImageView;", "imageView", "", "g", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "icon", "", "iconColor", "iconBackgroundColor", "Landroid/widget/TextView;", "textView", "f", "Landroid/view/View;", "view", "color", "e", "(Landroid/view/View;Ljava/lang/Integer;)V", "i", "j", "k", "Landroid/graphics/drawable/Drawable;", "drawable", "c", "messageView", "headerView", "b", C17296a.f69688o, "Ls06;", "textAlign", "h", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: DZ1 */
/* loaded from: classes5.dex */
public final class DZ1 {

    /* renamed from: a */
    public static final DZ1 f5951a = new DZ1();

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: DZ1$a */
    /* loaded from: classes5.dex */
    public static final class C1540a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C1540a f5952g = new C1540a();

        public C1540a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Back button intercepted by in-app message view, closing in-app message.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: DZ1$b */
    /* loaded from: classes5.dex */
    public static final class C1541b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C1541b f5953g = new C1541b();

        public C1541b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "LayerDrawable for button background did not have the expected number of layers or the 0th layer was not a GradientDrawable.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: DZ1$c */
    /* loaded from: classes5.dex */
    public static final class C1542c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C1542c f5954g = new C1542c();

        public C1542c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Caught exception setting icon typeface. Not rendering icon.";
        }
    }

    private DZ1() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m110187a() {
        C43664k20.m29442e(C43664k20.f93782a, f5951a, null, null, false, C1540a.f5952g, 7, null);
        C42478i20.m35358s().m35357t(true);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m110186b(TextView textView, TextView textView2) {
        if (textView2 == null && textView != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(textView.getLayoutParams().width, textView.getLayoutParams().height);
            layoutParams.setMargins(0, 0, 0, 0);
            textView.setLayoutParams(layoutParams);
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m110185c(Drawable drawable, int i) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable.getNumberOfLayers() > 0 && (layerDrawable.getDrawable(0) instanceof GradientDrawable)) {
                Drawable drawable2 = layerDrawable.getDrawable(0);
                Intrinsics.checkNotNullExpressionValue(drawable2, "drawable.getDrawable(0)");
                m110185c(drawable2, i);
            } else {
                C43664k20.m29442e(C43664k20.f93782a, f5951a, null, null, false, C1541b.f5953g, 7, null);
            }
        }
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(i);
        } else {
            f5951a.m110184d(drawable, i);
        }
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m110183e(View view, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (num != null) {
            view.setBackgroundColor(num.intValue());
        }
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m110182f(Context context, String str, int i, int i2, TextView textView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textView, "textView");
        if (str != null) {
            try {
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf"));
                textView.setText(str);
                m110179i(textView, i);
                if (textView.getBackground() != null) {
                    Drawable background = textView.getBackground();
                    Intrinsics.checkNotNullExpressionValue(background, "textView.background");
                    m110185c(background, i2);
                    return;
                }
                m110178j(textView, i2);
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, f5951a, C43664k20.EnumC25082a.E, e, false, C1542c.f5954g, 4, null);
            }
        }
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m110181g(Bitmap bitmap, ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m110180h(TextView textView, EnumC48393s06 textAlign) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(textAlign, "textAlign");
        if (textAlign == EnumC48393s06.START) {
            textView.setGravity(8388611);
        } else if (textAlign == EnumC48393s06.END) {
            textView.setGravity(8388613);
        } else if (textAlign == EnumC48393s06.CENTER) {
            textView.setGravity(17);
        }
    }

    @JvmStatic
    /* renamed from: i */
    public static final void m110179i(TextView textView, int i) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        textView.setTextColor(i);
    }

    @JvmStatic
    /* renamed from: j */
    public static final void m110178j(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackgroundColor(i);
    }

    @JvmStatic
    /* renamed from: k */
    public static final void m110177k(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        DZ1 dz1 = f5951a;
        Drawable background = view.getBackground();
        Intrinsics.checkNotNullExpressionValue(background, "view.background");
        dz1.m110184d(background, i);
        view.getBackground().setAlpha(Color.alpha(i));
    }

    /* renamed from: d */
    public final void m110184d(Drawable drawable, int i) {
        BlendMode blendMode;
        if (Build.VERSION.SDK_INT >= 29) {
            C5597NW.m93831a();
            blendMode = BlendMode.SRC_ATOP;
            drawable.setColorFilter(C5299MW.m95242a(i, blendMode));
            return;
        }
        drawable.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }
}
