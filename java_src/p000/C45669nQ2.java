package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
/* renamed from: nQ2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45669nQ2 {

    /* renamed from: nQ2$a */
    /* loaded from: classes.dex */
    public static class C26499a {
        private C26499a() {
        }

        /* renamed from: a */
        public static int m23820a(MenuItem menuItem) {
            int alphabeticModifiers;
            alphabeticModifiers = menuItem.getAlphabeticModifiers();
            return alphabeticModifiers;
        }

        /* renamed from: b */
        public static CharSequence m23819b(MenuItem menuItem) {
            CharSequence contentDescription;
            contentDescription = menuItem.getContentDescription();
            return contentDescription;
        }

        /* renamed from: c */
        public static ColorStateList m23818c(MenuItem menuItem) {
            ColorStateList iconTintList;
            iconTintList = menuItem.getIconTintList();
            return iconTintList;
        }

        /* renamed from: d */
        public static PorterDuff.Mode m23817d(MenuItem menuItem) {
            PorterDuff.Mode iconTintMode;
            iconTintMode = menuItem.getIconTintMode();
            return iconTintMode;
        }

        /* renamed from: e */
        public static int m23816e(MenuItem menuItem) {
            int numericModifiers;
            numericModifiers = menuItem.getNumericModifiers();
            return numericModifiers;
        }

        /* renamed from: f */
        public static CharSequence m23815f(MenuItem menuItem) {
            CharSequence tooltipText;
            tooltipText = menuItem.getTooltipText();
            return tooltipText;
        }

        /* renamed from: g */
        public static MenuItem m23814g(MenuItem menuItem, char c, int i) {
            MenuItem alphabeticShortcut;
            alphabeticShortcut = menuItem.setAlphabeticShortcut(c, i);
            return alphabeticShortcut;
        }

        /* renamed from: h */
        public static MenuItem m23813h(MenuItem menuItem, CharSequence charSequence) {
            MenuItem contentDescription;
            contentDescription = menuItem.setContentDescription(charSequence);
            return contentDescription;
        }

        /* renamed from: i */
        public static MenuItem m23812i(MenuItem menuItem, ColorStateList colorStateList) {
            MenuItem iconTintList;
            iconTintList = menuItem.setIconTintList(colorStateList);
            return iconTintList;
        }

        /* renamed from: j */
        public static MenuItem m23811j(MenuItem menuItem, PorterDuff.Mode mode) {
            MenuItem iconTintMode;
            iconTintMode = menuItem.setIconTintMode(mode);
            return iconTintMode;
        }

        /* renamed from: k */
        public static MenuItem m23810k(MenuItem menuItem, char c, int i) {
            MenuItem numericShortcut;
            numericShortcut = menuItem.setNumericShortcut(c, i);
            return numericShortcut;
        }

        /* renamed from: l */
        public static MenuItem m23809l(MenuItem menuItem, char c, char c2, int i, int i2) {
            MenuItem shortcut;
            shortcut = menuItem.setShortcut(c, c2, i, i2);
            return shortcut;
        }

        /* renamed from: m */
        public static MenuItem m23808m(MenuItem menuItem, CharSequence charSequence) {
            MenuItem tooltipText;
            tooltipText = menuItem.setTooltipText(charSequence);
            return tooltipText;
        }
    }

    private C45669nQ2() {
    }

    /* renamed from: a */
    public static MenuItem m23827a(MenuItem menuItem, AbstractC3314I2 abstractC3314I2) {
        if (menuItem instanceof InterfaceMenuItemC39788dV5) {
            return ((InterfaceMenuItemC39788dV5) menuItem).mo44208a(abstractC3314I2);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static void m23826b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof InterfaceMenuItemC39788dV5) {
            ((InterfaceMenuItemC39788dV5) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C26499a.m23814g(menuItem, c, i);
        }
    }

    /* renamed from: c */
    public static void m23825c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC39788dV5) {
            ((InterfaceMenuItemC39788dV5) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C26499a.m23813h(menuItem, charSequence);
        }
    }

    /* renamed from: d */
    public static void m23824d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC39788dV5) {
            ((InterfaceMenuItemC39788dV5) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C26499a.m23812i(menuItem, colorStateList);
        }
    }

    /* renamed from: e */
    public static void m23823e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC39788dV5) {
            ((InterfaceMenuItemC39788dV5) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C26499a.m23811j(menuItem, mode);
        }
    }

    /* renamed from: f */
    public static void m23822f(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof InterfaceMenuItemC39788dV5) {
            ((InterfaceMenuItemC39788dV5) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C26499a.m23810k(menuItem, c, i);
        }
    }

    /* renamed from: g */
    public static void m23821g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC39788dV5) {
            ((InterfaceMenuItemC39788dV5) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C26499a.m23808m(menuItem, charSequence);
        }
    }
}
