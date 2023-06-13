package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
@SuppressLint({"InflateParams"})
/* renamed from: j56  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C43107j56 {

    /* renamed from: a */
    public static final Typeface f92129a;

    /* renamed from: b */
    public static Typeface f92130b;

    /* renamed from: c */
    public static int f92131c;

    /* renamed from: d */
    public static boolean f92132d;

    /* renamed from: e */
    public static boolean f92133e;

    /* renamed from: f */
    public static Toast f92134f;

    static {
        Typeface create = Typeface.create("sans-serif-condensed", 0);
        f92129a = create;
        f92130b = create;
        f92131c = 16;
        f92132d = true;
        f92133e = true;
        f92134f = null;
    }

    private C43107j56() {
    }

    @SuppressLint({"ShowToast"})
    /* renamed from: a */
    public static Toast m31139a(Context context, CharSequence charSequence, Drawable drawable, int i, int i2, int i3, boolean z, boolean z2) {
        Drawable m29327b;
        Toast makeText = Toast.makeText(context, "", i3);
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C31707Ak4.toast_layout, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(C35649Rg4.toast_icon);
        TextView textView = (TextView) inflate.findViewById(C35649Rg4.toast_text);
        if (z2) {
            m29327b = C43700k56.m29325d(context, i);
        } else {
            m29327b = C43700k56.m29327b(context, C32607Eg4.toast_frame);
        }
        C43700k56.m29326c(inflate, m29327b);
        if (z) {
            if (drawable != null) {
                if (f92132d) {
                    drawable = C43700k56.m29324e(drawable, i2);
                }
                C43700k56.m29326c(imageView, drawable);
            } else {
                throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
            }
        } else {
            imageView.setVisibility(8);
        }
        textView.setText(charSequence);
        textView.setTextColor(i2);
        textView.setTypeface(f92130b);
        textView.setTextSize(2, f92131c);
        makeText.setView(inflate);
        if (!f92133e) {
            Toast toast = f92134f;
            if (toast != null) {
                toast.cancel();
            }
            f92134f = makeText;
        }
        return makeText;
    }

    /* renamed from: b */
    public static Toast m31138b(Context context, CharSequence charSequence, int i) {
        return m31137c(context, charSequence, i, true);
    }

    /* renamed from: c */
    public static Toast m31137c(Context context, CharSequence charSequence, int i, boolean z) {
        return m31139a(context, charSequence, C43700k56.m29327b(context, C32607Eg4.ic_clear_white_24dp), C43700k56.m29328a(context, C31662Af4.errorColor), C43700k56.m29328a(context, C31662Af4.defaultTextColor), i, z, true);
    }
}
