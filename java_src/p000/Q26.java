package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p000.C51086wZ3;
/* renamed from: Q26 */
/* loaded from: classes.dex */
public final class Q26 {

    /* renamed from: Q26$a */
    /* loaded from: classes.dex */
    public static class C6649a {
        private C6649a() {
        }

        /* renamed from: a */
        public static boolean m89057a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        /* renamed from: b */
        public static int m89056b(TextView textView) {
            return textView.getMaxLines();
        }

        /* renamed from: c */
        public static int m89055c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* renamed from: Q26$b */
    /* loaded from: classes.dex */
    public static class C6650b {
        private C6650b() {
        }

        /* renamed from: a */
        public static Drawable[] m89054a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        public static int m89053b(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: c */
        public static int m89052c(View view) {
            return view.getTextDirection();
        }

        /* renamed from: d */
        public static Locale m89051d(TextView textView) {
            return textView.getTextLocale();
        }

        /* renamed from: e */
        public static void m89050e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: f */
        public static void m89049f(TextView textView, int i, int i2, int i3, int i4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        }

        /* renamed from: g */
        public static void m89048g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: h */
        public static void m89047h(View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* renamed from: Q26$c */
    /* loaded from: classes.dex */
    public static class C6651c {
        private C6651c() {
        }

        /* renamed from: a */
        public static int m89046a(TextView textView) {
            return textView.getBreakStrategy();
        }

        /* renamed from: b */
        public static ColorStateList m89045b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        /* renamed from: c */
        public static PorterDuff.Mode m89044c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        /* renamed from: d */
        public static int m89043d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        /* renamed from: e */
        public static void m89042e(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        /* renamed from: f */
        public static void m89041f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        /* renamed from: g */
        public static void m89040g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        /* renamed from: h */
        public static void m89039h(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    /* renamed from: Q26$d */
    /* loaded from: classes.dex */
    public static class C6652d {
        private C6652d() {
        }

        /* renamed from: a */
        public static DecimalFormatSymbols m89038a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* renamed from: Q26$e */
    /* loaded from: classes.dex */
    public static class C6653e {
        private C6653e() {
        }

        /* renamed from: a */
        public static String[] m89037a(DecimalFormatSymbols decimalFormatSymbols) {
            String[] digitStrings;
            digitStrings = decimalFormatSymbols.getDigitStrings();
            return digitStrings;
        }

        /* renamed from: b */
        public static PrecomputedText.Params m89036b(TextView textView) {
            PrecomputedText.Params textMetricsParams;
            textMetricsParams = textView.getTextMetricsParams();
            return textMetricsParams;
        }

        /* renamed from: c */
        public static void m89035c(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    /* renamed from: Q26$f */
    /* loaded from: classes.dex */
    public static class ActionMode$CallbackC6654f implements ActionMode.Callback {

        /* renamed from: a */
        public final ActionMode.Callback f29734a;

        /* renamed from: b */
        public final TextView f29735b;

        /* renamed from: c */
        public Class<?> f29736c;

        /* renamed from: d */
        public Method f29737d;

        /* renamed from: e */
        public boolean f29738e;

        /* renamed from: f */
        public boolean f29739f = false;

        public ActionMode$CallbackC6654f(ActionMode.Callback callback, TextView textView) {
            this.f29734a = callback;
            this.f29735b = textView;
        }

        /* renamed from: a */
        public final Intent m89034a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: b */
        public final Intent m89033b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = m89034a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m89030e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: c */
        public final List<ResolveInfo> m89032c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m89034a(), 0)) {
                if (m89029f(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        /* renamed from: d */
        public ActionMode.Callback m89031d() {
            return this.f29734a;
        }

        /* renamed from: e */
        public final boolean m89030e(TextView textView) {
            if ((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public final boolean m89029f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            if (str == null || context.checkSelfPermission(str) == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public final void m89028g(Menu menu) {
            Method declaredMethod;
            Context context = this.f29735b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f29739f) {
                this.f29739f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f29736c = cls;
                    this.f29737d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f29738e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f29736c = null;
                    this.f29737d = null;
                    this.f29738e = false;
                }
            }
            try {
                if (this.f29738e && this.f29736c.isInstance(menu)) {
                    declaredMethod = this.f29737d;
                } else {
                    declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> m89032c = m89032c(context, packageManager);
                for (int i = 0; i < m89032c.size(); i++) {
                    ResolveInfo resolveInfo = m89032c.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m89033b(resolveInfo, this.f29735b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f29734a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f29734a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f29734a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m89028g(menu);
            return this.f29734a.onPrepareActionMode(actionMode, menu);
        }
    }

    private Q26() {
    }

    /* renamed from: a */
    public static Drawable[] m89075a(TextView textView) {
        return C6650b.m89054a(textView);
    }

    /* renamed from: b */
    public static int m89074b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: c */
    public static int m89073c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: d */
    public static int m89072d(TextView textView) {
        return C6649a.m89056b(textView);
    }

    /* renamed from: e */
    public static int m89071e(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 1;
        }
        return 7;
    }

    /* renamed from: f */
    public static TextDirectionHeuristic m89070f(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(C6653e.m89037a(C6652d.m89038a(C6650b.m89051d(textView)))[0].codePointAt(0));
            if (directionality != 1 && directionality != 2) {
                return TextDirectionHeuristics.LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        if (C6650b.m89053b(textView) == 1) {
            z = true;
        }
        switch (C6650b.m89052c(textView)) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                if (z) {
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    /* renamed from: g */
    public static C51086wZ3.C29915a m89069g(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C51086wZ3.C29915a(C6653e.m89036b(textView));
        }
        C51086wZ3.C29915a.C29916a c29916a = new C51086wZ3.C29915a.C29916a(new TextPaint(textView.getPaint()));
        c29916a.m6640b(C6651c.m89046a(textView));
        c29916a.m6639c(C6651c.m89043d(textView));
        c29916a.m6638d(m89070f(textView));
        return c29916a.m6641a();
    }

    /* renamed from: h */
    public static void m89068h(TextView textView, ColorStateList colorStateList) {
        HZ3.m103731g(textView);
        C6651c.m89041f(textView, colorStateList);
    }

    /* renamed from: i */
    public static void m89067i(TextView textView, PorterDuff.Mode mode) {
        HZ3.m103731g(textView);
        C6651c.m89040g(textView, mode);
    }

    /* renamed from: j */
    public static void m89066j(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        C6650b.m89050e(textView, drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: k */
    public static void m89065k(TextView textView, int i) {
        int i2;
        HZ3.m103734d(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C6653e.m89035c(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (C6649a.m89057a(textView)) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: l */
    public static void m89064l(TextView textView, int i) {
        int i2;
        HZ3.m103734d(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (C6649a.m89057a(textView)) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: m */
    public static void m89063m(TextView textView, int i) {
        HZ3.m103734d(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* renamed from: n */
    public static void m89062n(TextView textView, C51086wZ3 c51086wZ3) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(c51086wZ3.m6647b());
        } else if (m89069g(textView).m6646a(c51086wZ3.m6648a())) {
            textView.setText(c51086wZ3);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    /* renamed from: o */
    public static void m89061o(TextView textView, int i) {
        textView.setTextAppearance(i);
    }

    /* renamed from: p */
    public static void m89060p(TextView textView, C51086wZ3.C29915a c29915a) {
        C6650b.m89047h(textView, m89071e(c29915a.m6643d()));
        textView.getPaint().set(c29915a.m6642e());
        C6651c.m89042e(textView, c29915a.m6645b());
        C6651c.m89039h(textView, c29915a.m6644c());
    }

    /* renamed from: q */
    public static ActionMode.Callback m89059q(ActionMode.Callback callback) {
        if ((callback instanceof ActionMode$CallbackC6654f) && Build.VERSION.SDK_INT >= 26) {
            return ((ActionMode$CallbackC6654f) callback).m89031d();
        }
        return callback;
    }

    /* renamed from: r */
    public static ActionMode.Callback m89058r(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i <= 27 && !(callback instanceof ActionMode$CallbackC6654f) && callback != null) {
            return new ActionMode$CallbackC6654f(callback, textView);
        }
        return callback;
    }
}
