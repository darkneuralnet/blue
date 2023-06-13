package de.mateware.snacky;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes7.dex */
public class Snacky {
    public static final int LENGTH_INDEFINITE = -2;
    public static final int LENGTH_LONG = 0;
    public static final int LENGTH_SHORT = -1;

    /* renamed from: a */
    public final Builder f76940a;

    /* loaded from: classes7.dex */
    public static class Builder {

        /* renamed from: a */
        public View f76941a;

        /* renamed from: b */
        public EnumC19826b f76942b;

        /* renamed from: c */
        public int f76943c;

        /* renamed from: d */
        public CharSequence f76944d;

        /* renamed from: e */
        public int f76945e;

        /* renamed from: f */
        public Integer f76946f;

        /* renamed from: g */
        public ColorStateList f76947g;

        /* renamed from: h */
        public Integer f76948h;

        /* renamed from: i */
        public Float f76949i;

        /* renamed from: j */
        public Integer f76950j;

        /* renamed from: k */
        public Typeface f76951k;

        /* renamed from: l */
        public Integer f76952l;

        /* renamed from: m */
        public Float f76953m;

        /* renamed from: n */
        public CharSequence f76954n;

        /* renamed from: o */
        public int f76955o;

        /* renamed from: p */
        public Integer f76956p;

        /* renamed from: q */
        public Typeface f76957q;

        /* renamed from: r */
        public View.OnClickListener f76958r;

        /* renamed from: s */
        public Integer f76959s;

        /* renamed from: t */
        public ColorStateList f76960t;

        /* renamed from: u */
        public int f76961u;

        /* renamed from: v */
        public boolean f76962v;

        /* renamed from: w */
        public Drawable f76963w;

        /* renamed from: x */
        public int f76964x;

        /* renamed from: y */
        public Integer f76965y;

        public /* synthetic */ Builder(View$OnClickListenerC19825a view$OnClickListenerC19825a) {
            this();
        }

        /* renamed from: B */
        public final Snackbar m43991B() {
            View view = this.f76941a;
            if (view != null) {
                if (this.f76945e != 0) {
                    this.f76944d = view.getResources().getText(this.f76945e);
                }
                if (this.f76955o != 0) {
                    this.f76954n = this.f76941a.getResources().getText(this.f76955o);
                }
                if (this.f76964x != 0) {
                    this.f76963w = NA0.m94299e(this.f76941a.getContext(), this.f76964x);
                }
                return new Snacky(this, null).m43993b();
            }
            throw new IllegalStateException("Snacky Error: You must set an Activity or a View before making a snack");
        }

        public Snackbar build() {
            return m43991B();
        }

        public Builder centerText() {
            this.f76962v = true;
            return this;
        }

        public Snackbar error() {
            this.f76942b = EnumC19826b.ERROR;
            return m43991B();
        }

        public Snackbar info() {
            this.f76942b = EnumC19826b.INFO;
            return m43991B();
        }

        public Builder setActionClickListener(View.OnClickListener onClickListener) {
            this.f76958r = onClickListener;
            return this;
        }

        public Builder setActionText(int i) {
            this.f76955o = i;
            return this;
        }

        public Builder setActionTextColor(ColorStateList colorStateList) {
            this.f76959s = null;
            this.f76960t = colorStateList;
            return this;
        }

        public Builder setActionTextSize(float f) {
            this.f76952l = null;
            this.f76953m = Float.valueOf(f);
            return this;
        }

        public Builder setActionTextTypeface(Typeface typeface) {
            this.f76957q = typeface;
            return this;
        }

        public Builder setActionTextTypefaceStyle(int i) {
            this.f76956p = Integer.valueOf(i);
            return this;
        }

        public Builder setActivity(Activity activity) {
            return setView(((ViewGroup) activity.findViewById(16908290)).getChildAt(0));
        }

        public Builder setBackgroundColor(int i) {
            this.f76965y = Integer.valueOf(i);
            return this;
        }

        public Builder setDuration(int i) {
            this.f76943c = i;
            return this;
        }

        public Builder setIcon(int i) {
            this.f76964x = i;
            return this;
        }

        public Builder setMaxLines(int i) {
            this.f76961u = i;
            return this;
        }

        public Builder setText(int i) {
            this.f76945e = i;
            return this;
        }

        public Builder setTextColor(int i) {
            this.f76946f = Integer.valueOf(i);
            return this;
        }

        public Builder setTextSize(float f) {
            this.f76948h = null;
            this.f76949i = Float.valueOf(f);
            return this;
        }

        public Builder setTextTypeface(Typeface typeface) {
            this.f76951k = typeface;
            return this;
        }

        public Builder setTextTypefaceStyle(int i) {
            this.f76950j = Integer.valueOf(i);
            return this;
        }

        public Builder setView(View view) {
            this.f76941a = view;
            return this;
        }

        public Snackbar success() {
            this.f76942b = EnumC19826b.SUCCESS;
            return m43991B();
        }

        public Snackbar warning() {
            this.f76942b = EnumC19826b.WARNING;
            return m43991B();
        }

        private Builder() {
            this.f76941a = null;
            this.f76942b = EnumC19826b.DEFAULT;
            this.f76943c = -1;
            this.f76944d = "";
            this.f76945e = 0;
            this.f76946f = null;
            this.f76947g = null;
            this.f76948h = null;
            this.f76949i = null;
            this.f76950j = null;
            this.f76951k = null;
            this.f76952l = null;
            this.f76953m = null;
            this.f76954n = "";
            this.f76955o = 0;
            this.f76956p = null;
            this.f76957q = null;
            this.f76958r = null;
            this.f76959s = null;
            this.f76960t = null;
            this.f76961u = Integer.MAX_VALUE;
            this.f76962v = false;
            this.f76963w = null;
            this.f76964x = 0;
            this.f76965y = null;
        }

        public Builder setActionText(CharSequence charSequence) {
            this.f76945e = 0;
            this.f76954n = charSequence;
            return this;
        }

        public Builder setIcon(Drawable drawable) {
            this.f76963w = drawable;
            return this;
        }

        public Builder setText(CharSequence charSequence) {
            this.f76945e = 0;
            this.f76944d = charSequence;
            return this;
        }

        public Builder setTextColor(ColorStateList colorStateList) {
            this.f76946f = null;
            this.f76947g = colorStateList;
            return this;
        }

        public Builder setActionTextColor(int i) {
            this.f76959s = Integer.valueOf(i);
            return this;
        }

        public Builder setActionTextSize(int i, float f) {
            this.f76952l = Integer.valueOf(i);
            this.f76953m = Float.valueOf(f);
            return this;
        }

        public Builder setTextSize(int i, float f) {
            this.f76948h = Integer.valueOf(i);
            this.f76949i = Float.valueOf(f);
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface Duration {
    }

    /* renamed from: de.mateware.snacky.Snacky$a */
    /* loaded from: classes7.dex */
    public class View$OnClickListenerC19825a implements View.OnClickListener {
        public View$OnClickListenerC19825a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: de.mateware.snacky.Snacky$b */
    /* loaded from: classes7.dex */
    public enum EnumC19826b {
        DEFAULT(null, null, null),
        SUCCESS(Integer.valueOf(Color.parseColor("#388E3C")), Integer.valueOf(C19821R.C19822drawable.ic_check_black_24dp), -1),
        ERROR(Integer.valueOf(Color.parseColor("#D50000")), Integer.valueOf(C19821R.C19822drawable.ic_clear_black_24dp), -1),
        INFO(Integer.valueOf(Color.parseColor("#3F51B5")), Integer.valueOf(C19821R.C19822drawable.ic_info_outline_black_24dp), -1),
        WARNING(Integer.valueOf(Color.parseColor("#FFA900")), Integer.valueOf(C19821R.C19822drawable.ic_error_outline_black_24dp), -16777216);
        

        /* renamed from: b */
        public Integer f76973b;

        /* renamed from: c */
        public Integer f76974c;

        /* renamed from: d */
        public Integer f76975d;

        EnumC19826b(Integer num, Integer num2, Integer num3) {
            this.f76973b = num;
            this.f76974c = num2;
            this.f76975d = num3;
        }

        /* renamed from: a */
        public Integer m43964a() {
            return this.f76973b;
        }

        /* renamed from: b */
        public Drawable m43963b(Context context) {
            Integer num = this.f76974c;
            if (num == null) {
                return null;
            }
            Drawable m94299e = NA0.m94299e(context, num.intValue());
            if (m94299e != null) {
                return SnackyUtils.m43960b(m94299e, this.f76975d.intValue());
            }
            return m94299e;
        }

        /* renamed from: c */
        public Integer m43962c() {
            return this.f76975d;
        }
    }

    public /* synthetic */ Snacky(Builder builder, View$OnClickListenerC19825a view$OnClickListenerC19825a) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder(null);
    }

    /* renamed from: b */
    public final Snackbar m43993b() {
        Snackbar m48855o0 = Snackbar.m48855o0(this.f76940a.f76941a, this.f76940a.f76944d, this.f76940a.f76943c);
        if (this.f76940a.f76958r != null || this.f76940a.f76954n != null) {
            if (this.f76940a.f76958r == null) {
                this.f76940a.f76958r = new View$OnClickListenerC19825a();
            }
            m48855o0.m48852r0(this.f76940a.f76954n, this.f76940a.f76958r);
            if (this.f76940a.f76959s == null) {
                Builder builder = this.f76940a;
                builder.f76959s = builder.f76942b.m43962c();
            }
            if (this.f76940a.f76960t != null) {
                m48855o0.m48850t0(this.f76940a.f76960t);
            } else if (this.f76940a.f76959s != null) {
                m48855o0.m48851s0(this.f76940a.f76959s.intValue());
            }
        }
        Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) m48855o0.m48933I();
        if (this.f76940a.f76965y == null) {
            Builder builder2 = this.f76940a;
            builder2.f76965y = builder2.f76942b.m43964a();
        }
        if (this.f76940a.f76965y != null) {
            snackbarLayout.setBackgroundColor(this.f76940a.f76965y.intValue());
        }
        TextView textView = (TextView) snackbarLayout.findViewById(C33795Ji4.snackbar_action);
        if (this.f76940a.f76953m != null) {
            if (this.f76940a.f76952l != null) {
                textView.setTextSize(this.f76940a.f76952l.intValue(), this.f76940a.f76953m.floatValue());
            } else {
                textView.setTextSize(this.f76940a.f76953m.floatValue());
            }
        }
        Typeface typeface = textView.getTypeface();
        if (this.f76940a.f76957q != null) {
            typeface = this.f76940a.f76957q;
        }
        if (this.f76940a.f76956p != null) {
            textView.setTypeface(typeface, this.f76940a.f76956p.intValue());
        } else {
            textView.setTypeface(typeface);
        }
        TextView textView2 = (TextView) snackbarLayout.findViewById(C33795Ji4.snackbar_text);
        if (this.f76940a.f76949i != null) {
            if (this.f76940a.f76948h != null) {
                textView2.setTextSize(this.f76940a.f76948h.intValue(), this.f76940a.f76949i.floatValue());
            } else {
                textView2.setTextSize(this.f76940a.f76949i.floatValue());
            }
        }
        Typeface typeface2 = textView2.getTypeface();
        if (this.f76940a.f76951k != null) {
            typeface2 = this.f76940a.f76951k;
        }
        if (this.f76940a.f76950j != null) {
            textView2.setTypeface(typeface2, this.f76940a.f76950j.intValue());
        } else {
            textView2.setTypeface(typeface2);
        }
        if (this.f76940a.f76946f == null) {
            Builder builder3 = this.f76940a;
            builder3.f76946f = builder3.f76942b.m43962c();
        }
        if (this.f76940a.f76947g != null) {
            textView2.setTextColor(this.f76940a.f76947g);
        } else if (this.f76940a.f76946f != null) {
            textView2.setTextColor(this.f76940a.f76946f.intValue());
        }
        textView2.setMaxLines(this.f76940a.f76961u);
        textView2.setGravity(this.f76940a.f76962v ? 17 : 16);
        if (this.f76940a.f76962v) {
            textView2.setTextAlignment(4);
        }
        if (this.f76940a.f76963w == null) {
            Builder builder4 = this.f76940a;
            builder4.f76963w = builder4.f76942b.m43963b(this.f76940a.f76941a.getContext());
        }
        if (this.f76940a.f76963w != null) {
            textView2.setCompoundDrawablesWithIntrinsicBounds(this.f76940a.f76963w, (Drawable) null, (this.f76940a.f76962v && TextUtils.isEmpty(this.f76940a.f76954n)) ? SnackyUtils.m43961a(this.f76940a.f76941a.getContext(), this.f76940a.f76963w.getIntrinsicWidth(), this.f76940a.f76963w.getIntrinsicHeight()) : null, (Drawable) null);
            textView2.setCompoundDrawablePadding(textView2.getResources().getDimensionPixelOffset(C19821R.dimen.snacky_icon_padding));
        }
        return m48855o0;
    }

    public Snacky(Builder builder) {
        this.f76940a = builder;
    }
}
