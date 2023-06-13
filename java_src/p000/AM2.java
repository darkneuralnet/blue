package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import androidx.appcompat.app.DialogInterfaceC10997b;
/* renamed from: AM2 */
/* loaded from: classes6.dex */
public class AM2 extends DialogInterfaceC10997b.C10998a {

    /* renamed from: e */
    public static final int f420e = C49961uf4.alertDialogStyle;

    /* renamed from: f */
    public static final int f421f = C50021ul4.MaterialAlertDialog_MaterialComponents;

    /* renamed from: g */
    public static final int f422g = C49961uf4.materialAlertDialogTheme;

    /* renamed from: c */
    public Drawable f423c;

    /* renamed from: d */
    public final Rect f424d;

    public AM2(Context context) {
        this(context, 0);
    }

    /* renamed from: t */
    public static Context m115884t(Context context) {
        int m115883u = m115883u(context);
        Context m79935c = VM2.m79935c(context, null, f420e, f421f);
        if (m115883u == 0) {
            return m79935c;
        }
        return new C37806aB0(m79935c, m115883u);
    }

    /* renamed from: u */
    public static int m115883u(Context context) {
        TypedValue m114085a = BM2.m114085a(context, f422g);
        if (m114085a == null) {
            return 0;
        }
        return m114085a.data;
    }

    /* renamed from: v */
    public static int m115882v(Context context, int i) {
        return i == 0 ? m115883u(context) : i;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC10997b.C10998a
    /* renamed from: A */
    public AM2 mo70295g(int i) {
        return (AM2) super.mo70295g(i);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC10997b.C10998a
    /* renamed from: B */
    public AM2 mo70294h(CharSequence charSequence) {
        return (AM2) super.mo70294h(charSequence);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC10997b.C10998a
    /* renamed from: C */
    public AM2 mo70293i(int i, DialogInterface.OnClickListener onClickListener) {
        return (AM2) super.mo70293i(i, onClickListener);
    }

    /* renamed from: D */
    public AM2 m115893D(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (AM2) super.m70292j(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC10997b.C10998a
    /* renamed from: E */
    public AM2 mo70291k(DialogInterface.OnCancelListener onCancelListener) {
        return (AM2) super.mo70291k(onCancelListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC10997b.C10998a
    /* renamed from: F */
    public AM2 mo70290l(DialogInterface.OnKeyListener onKeyListener) {
        return (AM2) super.mo70290l(onKeyListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC10997b.C10998a
    /* renamed from: G */
    public AM2 mo70289m(int i, DialogInterface.OnClickListener onClickListener) {
        return (AM2) super.mo70289m(i, onClickListener);
    }

    /* renamed from: H */
    public AM2 m115889H(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (AM2) super.m70288n(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC10997b.C10998a
    /* renamed from: I */
    public AM2 mo70287o(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        return (AM2) super.mo70287o(listAdapter, i, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC10997b.C10998a
    /* renamed from: J */
    public AM2 mo70286p(int i) {
        return (AM2) super.mo70286p(i);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC10997b.C10998a
    /* renamed from: K */
    public AM2 mo70285q(CharSequence charSequence) {
        return (AM2) super.mo70285q(charSequence);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC10997b.C10998a
    /* renamed from: L */
    public AM2 mo70284r(View view) {
        return (AM2) super.mo70284r(view);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC10997b.C10998a
    /* renamed from: a */
    public DialogInterfaceC10997b mo70301a() {
        DialogInterfaceC10997b mo70301a = super.mo70301a();
        Window window = mo70301a.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f423c;
        if (drawable instanceof PM2) {
            ((PM2) drawable).m90417Z(C38790bq6.m62447y(decorView));
        }
        window.setBackgroundDrawable(IM2.m102458b(this.f423c, this.f424d));
        decorView.setOnTouchListener(new B32(mo70301a, this.f424d));
        return mo70301a;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC10997b.C10998a
    /* renamed from: w */
    public AM2 mo70299c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (AM2) super.mo70299c(listAdapter, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC10997b.C10998a
    /* renamed from: x */
    public AM2 mo70298d(boolean z) {
        return (AM2) super.mo70298d(z);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC10997b.C10998a
    /* renamed from: y */
    public AM2 mo70297e(View view) {
        return (AM2) super.mo70297e(view);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC10997b.C10998a
    /* renamed from: z */
    public AM2 mo70296f(Drawable drawable) {
        return (AM2) super.mo70296f(drawable);
    }

    public AM2(Context context, int i) {
        super(m115884t(context), m115882v(context, i));
        Context m70300b = m70300b();
        Resources.Theme theme = m70300b.getTheme();
        int i2 = f420e;
        int i3 = f421f;
        this.f424d = IM2.m102459a(m70300b, i2, i3);
        int m103953c = HM2.m103953c(m70300b, C49961uf4.colorSurface, getClass().getCanonicalName());
        PM2 pm2 = new PM2(m70300b, null, i2, i3);
        pm2.m90427P(m70300b);
        pm2.m90416a0(ColorStateList.valueOf(m103953c));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(16844145, typedValue, true);
            float dimension = typedValue.getDimension(m70300b().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                pm2.m90419X(dimension);
            }
        }
        this.f423c = pm2;
    }
}
