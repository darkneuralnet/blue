package p000;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.danlew.android.joda.DateUtils;
import p000.InterfaceC28996u2;
/* renamed from: p2 */
/* loaded from: classes.dex */
public class C27125p2 {

    /* renamed from: d */
    public static int f102968d;

    /* renamed from: a */
    public final AccessibilityNodeInfo f102969a;

    /* renamed from: b */
    public int f102970b = -1;

    /* renamed from: c */
    public int f102971c = -1;

    /* renamed from: p2$a */
    /* loaded from: classes.dex */
    public static class C27126a {

        /* renamed from: A */
        public static final C27126a f102972A;

        /* renamed from: B */
        public static final C27126a f102973B;

        /* renamed from: C */
        public static final C27126a f102974C;

        /* renamed from: D */
        public static final C27126a f102975D;

        /* renamed from: E */
        public static final C27126a f102976E;

        /* renamed from: F */
        public static final C27126a f102977F;

        /* renamed from: G */
        public static final C27126a f102978G;

        /* renamed from: H */
        public static final C27126a f102979H;

        /* renamed from: I */
        public static final C27126a f102980I;

        /* renamed from: J */
        public static final C27126a f102981J;

        /* renamed from: K */
        public static final C27126a f102982K;

        /* renamed from: L */
        public static final C27126a f102983L;

        /* renamed from: M */
        public static final C27126a f102984M;

        /* renamed from: N */
        public static final C27126a f102985N;

        /* renamed from: O */
        public static final C27126a f102986O;

        /* renamed from: P */
        public static final C27126a f102987P;

        /* renamed from: Q */
        public static final C27126a f102988Q;

        /* renamed from: R */
        public static final C27126a f102989R;

        /* renamed from: S */
        public static final C27126a f102990S;

        /* renamed from: T */
        public static final C27126a f102991T;

        /* renamed from: U */
        public static final C27126a f102992U;

        /* renamed from: e */
        public static final C27126a f102993e = new C27126a(1, null);

        /* renamed from: f */
        public static final C27126a f102994f = new C27126a(2, null);

        /* renamed from: g */
        public static final C27126a f102995g = new C27126a(4, null);

        /* renamed from: h */
        public static final C27126a f102996h = new C27126a(8, null);

        /* renamed from: i */
        public static final C27126a f102997i = new C27126a(16, null);

        /* renamed from: j */
        public static final C27126a f102998j = new C27126a(32, null);

        /* renamed from: k */
        public static final C27126a f102999k = new C27126a(64, null);

        /* renamed from: l */
        public static final C27126a f103000l = new C27126a(128, null);

        /* renamed from: m */
        public static final C27126a f103001m = new C27126a(256, (CharSequence) null, InterfaceC28996u2.C28998b.class);

        /* renamed from: n */
        public static final C27126a f103002n = new C27126a(512, (CharSequence) null, InterfaceC28996u2.C28998b.class);

        /* renamed from: o */
        public static final C27126a f103003o = new C27126a(1024, (CharSequence) null, InterfaceC28996u2.C28999c.class);

        /* renamed from: p */
        public static final C27126a f103004p = new C27126a(2048, (CharSequence) null, InterfaceC28996u2.C28999c.class);

        /* renamed from: q */
        public static final C27126a f103005q = new C27126a(4096, null);

        /* renamed from: r */
        public static final C27126a f103006r = new C27126a(8192, null);

        /* renamed from: s */
        public static final C27126a f103007s = new C27126a(16384, null);

        /* renamed from: t */
        public static final C27126a f103008t = new C27126a(DateUtils.FORMAT_ABBREV_WEEKDAY, null);

        /* renamed from: u */
        public static final C27126a f103009u = new C27126a(65536, null);

        /* renamed from: v */
        public static final C27126a f103010v = new C27126a((int) DateUtils.FORMAT_NUMERIC_DATE, (CharSequence) null, InterfaceC28996u2.C29003g.class);

        /* renamed from: w */
        public static final C27126a f103011w = new C27126a(DateUtils.FORMAT_ABBREV_RELATIVE, null);

        /* renamed from: x */
        public static final C27126a f103012x = new C27126a(524288, null);

        /* renamed from: y */
        public static final C27126a f103013y = new C27126a(1048576, null);

        /* renamed from: z */
        public static final C27126a f103014z = new C27126a(2097152, (CharSequence) null, InterfaceC28996u2.C29004h.class);

        /* renamed from: a */
        public final Object f103015a;

        /* renamed from: b */
        public final int f103016b;

        /* renamed from: c */
        public final Class<? extends InterfaceC28996u2.AbstractC28997a> f103017c;

        /* renamed from: d */
        public final InterfaceC28996u2 f103018d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction25 = null;
            int i = Build.VERSION.SDK_INT;
            f102972A = new C27126a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
            f102973B = new C27126a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, InterfaceC28996u2.C29001e.class);
            f102974C = new C27126a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
            f102975D = new C27126a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
            f102976E = new C27126a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
            f102977F = new C27126a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
            if (i >= 29) {
                accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
                accessibilityAction = accessibilityAction24;
            } else {
                accessibilityAction = null;
            }
            f102978G = new C27126a(accessibilityAction, 16908358, null, null, null);
            if (i >= 29) {
                accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction2 = accessibilityAction23;
            } else {
                accessibilityAction2 = null;
            }
            f102979H = new C27126a(accessibilityAction2, 16908359, null, null, null);
            if (i >= 29) {
                accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction3 = accessibilityAction22;
            } else {
                accessibilityAction3 = null;
            }
            f102980I = new C27126a(accessibilityAction3, 16908360, null, null, null);
            if (i >= 29) {
                accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction4 = accessibilityAction21;
            } else {
                accessibilityAction4 = null;
            }
            f102981J = new C27126a(accessibilityAction4, 16908361, null, null, null);
            f102982K = new C27126a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
            f102983L = new C27126a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, null, null, InterfaceC28996u2.C29002f.class);
            if (i >= 26) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
                accessibilityAction5 = accessibilityAction20;
            } else {
                accessibilityAction5 = null;
            }
            f102984M = new C27126a(accessibilityAction5, 16908354, null, null, InterfaceC28996u2.C29000d.class);
            if (i >= 28) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction6 = accessibilityAction19;
            } else {
                accessibilityAction6 = null;
            }
            f102985N = new C27126a(accessibilityAction6, 16908356, null, null, null);
            if (i >= 28) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction7 = accessibilityAction18;
            } else {
                accessibilityAction7 = null;
            }
            f102986O = new C27126a(accessibilityAction7, 16908357, null, null, null);
            if (i >= 30) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction8 = accessibilityAction17;
            } else {
                accessibilityAction8 = null;
            }
            f102987P = new C27126a(accessibilityAction8, 16908362, null, null, null);
            if (i >= 30) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction9 = accessibilityAction16;
            } else {
                accessibilityAction9 = null;
            }
            f102988Q = new C27126a(accessibilityAction9, 16908372, null, null, null);
            if (i >= 32) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
                accessibilityAction10 = accessibilityAction15;
            } else {
                accessibilityAction10 = null;
            }
            f102989R = new C27126a(accessibilityAction10, 16908373, null, null, null);
            if (i >= 32) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
                accessibilityAction11 = accessibilityAction14;
            } else {
                accessibilityAction11 = null;
            }
            f102990S = new C27126a(accessibilityAction11, 16908374, null, null, null);
            if (i >= 32) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
                accessibilityAction12 = accessibilityAction13;
            } else {
                accessibilityAction12 = null;
            }
            f102991T = new C27126a(accessibilityAction12, 16908375, null, null, null);
            if (i >= 33) {
                accessibilityAction25 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            }
            f102992U = new C27126a(accessibilityAction25, 16908376, null, null, null);
        }

        public C27126a(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        /* renamed from: a */
        public C27126a m20039a(CharSequence charSequence, InterfaceC28996u2 interfaceC28996u2) {
            return new C27126a(null, this.f103016b, charSequence, interfaceC28996u2, this.f103017c);
        }

        /* renamed from: b */
        public int m20038b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f103015a).getId();
        }

        /* renamed from: c */
        public CharSequence m20037c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f103015a).getLabel();
        }

        /* renamed from: d */
        public boolean m20036d(View view, Bundle bundle) {
            String name;
            InterfaceC28996u2.AbstractC28997a newInstance;
            if (this.f103018d == null) {
                return false;
            }
            Class<? extends InterfaceC28996u2.AbstractC28997a> cls = this.f103017c;
            InterfaceC28996u2.AbstractC28997a abstractC28997a = null;
            if (cls != null) {
                try {
                    newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e) {
                    e = e;
                }
                try {
                    newInstance.m11044a(bundle);
                    abstractC28997a = newInstance;
                } catch (Exception e2) {
                    e = e2;
                    abstractC28997a = newInstance;
                    Class<? extends InterfaceC28996u2.AbstractC28997a> cls2 = this.f103017c;
                    if (cls2 == null) {
                        name = "null";
                    } else {
                        name = cls2.getName();
                    }
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e);
                    return this.f103018d.mo8762a(view, abstractC28997a);
                }
            }
            return this.f103018d.mo8762a(view, abstractC28997a);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C27126a)) {
                return false;
            }
            C27126a c27126a = (C27126a) obj;
            Object obj2 = this.f103015a;
            if (obj2 == null) {
                if (c27126a.f103015a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(c27126a.f103015a)) {
                return false;
            } else {
                return true;
            }
        }

        public int hashCode() {
            Object obj = this.f103015a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public C27126a(int i, CharSequence charSequence, InterfaceC28996u2 interfaceC28996u2) {
            this(null, i, charSequence, interfaceC28996u2, null);
        }

        public C27126a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public C27126a(int i, CharSequence charSequence, Class<? extends InterfaceC28996u2.AbstractC28997a> cls) {
            this(null, i, charSequence, null, cls);
        }

        public C27126a(Object obj, int i, CharSequence charSequence, InterfaceC28996u2 interfaceC28996u2, Class<? extends InterfaceC28996u2.AbstractC28997a> cls) {
            this.f103016b = i;
            this.f103018d = interfaceC28996u2;
            if (obj == null) {
                this.f103015a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            } else {
                this.f103015a = obj;
            }
            this.f103017c = cls;
        }
    }

    /* renamed from: p2$b */
    /* loaded from: classes.dex */
    public static class C27127b {

        /* renamed from: a */
        public final Object f103019a;

        public C27127b(Object obj) {
            this.f103019a = obj;
        }

        /* renamed from: a */
        public static C27127b m20035a(int i, int i2, boolean z) {
            return new C27127b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
        }

        /* renamed from: b */
        public static C27127b m20034b(int i, int i2, boolean z, int i3) {
            return new C27127b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    /* renamed from: p2$c */
    /* loaded from: classes.dex */
    public static class C27128c {

        /* renamed from: a */
        public final Object f103020a;

        public C27128c(Object obj) {
            this.f103020a = obj;
        }

        /* renamed from: a */
        public static C27128c m20033a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new C27128c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    /* renamed from: p2$d */
    /* loaded from: classes.dex */
    public static class C27129d {

        /* renamed from: a */
        public final Object f103021a;

        public C27129d(Object obj) {
            this.f103021a = obj;
        }

        /* renamed from: a */
        public static C27129d m20032a(int i, float f, float f2, float f3) {
            return new C27129d(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
        }
    }

    public C27125p2(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f102969a = accessibilityNodeInfo;
    }

    /* renamed from: R */
    public static C27125p2 m20105R() {
        return m20096V0(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: S */
    public static C27125p2 m20103S(C27125p2 c27125p2) {
        return m20096V0(AccessibilityNodeInfo.obtain(c27125p2.f102969a));
    }

    /* renamed from: T */
    public static C27125p2 m20101T(View view) {
        return m20096V0(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: V0 */
    public static C27125p2 m20096V0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C27125p2(accessibilityNodeInfo);
    }

    /* renamed from: j */
    public static String m20073j(int i) {
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case DateUtils.FORMAT_ABBREV_WEEKDAY /* 32768 */:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case DateUtils.FORMAT_NUMERIC_DATE /* 131072 */:
                        return "ACTION_SET_SELECTION";
                    case DateUtils.FORMAT_ABBREV_RELATIVE /* 262144 */:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    default:
                        switch (i) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        switch (i) {
                                            case 16908372:
                                                return "ACTION_IME_ENTER";
                                            case 16908373:
                                                return "ACTION_DRAG_START";
                                            case 16908374:
                                                return "ACTION_DRAG_DROP";
                                            case 16908375:
                                                return "ACTION_DRAG_CANCEL";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    /* renamed from: q */
    public static ClickableSpan[] m20059q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: A */
    public String m20139A() {
        String uniqueId;
        if (T30.m84398c()) {
            uniqueId = this.f102969a.getUniqueId();
            return uniqueId;
        }
        return this.f102969a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    /* renamed from: A0 */
    public void m20138A0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f102969a.setPaneTitle(charSequence);
        } else {
            this.f102969a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: B */
    public String m20137B() {
        return this.f102969a.getViewIdResourceName();
    }

    /* renamed from: B0 */
    public void m20136B0(View view) {
        this.f102970b = -1;
        this.f102969a.setParent(view);
    }

    /* renamed from: C */
    public final boolean m20135C() {
        return !m20077h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: C0 */
    public void m20134C0(View view, int i) {
        this.f102970b = i;
        this.f102969a.setParent(view, i);
    }

    /* renamed from: D */
    public final int m20133D(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f102968d;
        f102968d = i2 + 1;
        return i2;
    }

    /* renamed from: D0 */
    public void m20132D0(boolean z) {
        this.f102969a.setPassword(z);
    }

    /* renamed from: E */
    public boolean m20131E() {
        return this.f102969a.isAccessibilityFocused();
    }

    /* renamed from: E0 */
    public void m20130E0(C27129d c27129d) {
        this.f102969a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) c27129d.f103021a);
    }

    /* renamed from: F */
    public boolean m20129F() {
        return this.f102969a.isCheckable();
    }

    /* renamed from: F0 */
    public void m20128F0(CharSequence charSequence) {
        this.f102969a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    /* renamed from: G */
    public boolean m20127G() {
        return this.f102969a.isChecked();
    }

    /* renamed from: G0 */
    public void m20126G0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f102969a.setScreenReaderFocusable(z);
        } else {
            m20092Z(1, z);
        }
    }

    /* renamed from: H */
    public boolean m20125H() {
        return this.f102969a.isClickable();
    }

    /* renamed from: H0 */
    public void m20124H0(boolean z) {
        this.f102969a.setScrollable(z);
    }

    /* renamed from: I */
    public boolean m20123I() {
        return this.f102969a.isEnabled();
    }

    /* renamed from: I0 */
    public void m20122I0(boolean z) {
        this.f102969a.setSelected(z);
    }

    /* renamed from: J */
    public boolean m20121J() {
        return this.f102969a.isFocusable();
    }

    /* renamed from: J0 */
    public void m20120J0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f102969a.setShowingHintText(z);
        } else {
            m20092Z(4, z);
        }
    }

    /* renamed from: K */
    public boolean m20119K() {
        return this.f102969a.isFocused();
    }

    /* renamed from: K0 */
    public void m20118K0(View view) {
        this.f102971c = -1;
        this.f102969a.setSource(view);
    }

    /* renamed from: L */
    public boolean m20117L() {
        return this.f102969a.isLongClickable();
    }

    /* renamed from: L0 */
    public void m20116L0(View view, int i) {
        this.f102971c = i;
        this.f102969a.setSource(view, i);
    }

    /* renamed from: M */
    public boolean m20115M() {
        return this.f102969a.isPassword();
    }

    /* renamed from: M0 */
    public void m20114M0(CharSequence charSequence) {
        if (T30.m84399b()) {
            this.f102969a.setStateDescription(charSequence);
        } else {
            this.f102969a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: N */
    public boolean m20113N() {
        return this.f102969a.isScrollable();
    }

    /* renamed from: N0 */
    public void m20112N0(CharSequence charSequence) {
        this.f102969a.setText(charSequence);
    }

    /* renamed from: O */
    public boolean m20111O() {
        return this.f102969a.isSelected();
    }

    /* renamed from: O0 */
    public void m20110O0(int i, int i2) {
        this.f102969a.setTextSelection(i, i2);
    }

    /* renamed from: P */
    public boolean m20109P() {
        boolean isShowingHintText;
        if (Build.VERSION.SDK_INT >= 26) {
            isShowingHintText = this.f102969a.isShowingHintText();
            return isShowingHintText;
        }
        return m20069l(4);
    }

    /* renamed from: P0 */
    public void m20108P0(View view) {
        this.f102969a.setTraversalAfter(view);
    }

    /* renamed from: Q */
    public boolean m20107Q() {
        return this.f102969a.isVisibleToUser();
    }

    /* renamed from: Q0 */
    public void m20106Q0(View view, int i) {
        this.f102969a.setTraversalAfter(view, i);
    }

    /* renamed from: R0 */
    public void m20104R0(View view, int i) {
        this.f102969a.setTraversalBefore(view, i);
    }

    /* renamed from: S0 */
    public void m20102S0(String str) {
        this.f102969a.setViewIdResourceName(str);
    }

    /* renamed from: T0 */
    public void m20100T0(boolean z) {
        this.f102969a.setVisibleToUser(z);
    }

    /* renamed from: U */
    public boolean m20099U(int i, Bundle bundle) {
        return this.f102969a.performAction(i, bundle);
    }

    /* renamed from: U0 */
    public AccessibilityNodeInfo m20098U0() {
        return this.f102969a;
    }

    /* renamed from: V */
    public void m20097V() {
        this.f102969a.recycle();
    }

    /* renamed from: W */
    public boolean m20095W(C27126a c27126a) {
        return this.f102969a.removeAction((AccessibilityNodeInfo.AccessibilityAction) c27126a.f103015a);
    }

    /* renamed from: X */
    public final void m20094X(View view) {
        SparseArray<WeakReference<ClickableSpan>> m20045x = m20045x(view);
        if (m20045x != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < m20045x.size(); i++) {
                if (m20045x.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                m20045x.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: Y */
    public void m20093Y(boolean z) {
        this.f102969a.setAccessibilityFocused(z);
    }

    /* renamed from: Z */
    public final void m20092Z(int i, boolean z) {
        Bundle m20055s = m20055s();
        if (m20055s != null) {
            int i2 = m20055s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            m20055s.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: a */
    public void m20091a(int i) {
        this.f102969a.addAction(i);
    }

    @Deprecated
    /* renamed from: a0 */
    public void m20090a0(Rect rect) {
        this.f102969a.setBoundsInParent(rect);
    }

    /* renamed from: b */
    public void m20089b(C27126a c27126a) {
        this.f102969a.addAction((AccessibilityNodeInfo.AccessibilityAction) c27126a.f103015a);
    }

    /* renamed from: b0 */
    public void m20088b0(Rect rect) {
        this.f102969a.setBoundsInScreen(rect);
    }

    /* renamed from: c */
    public void m20087c(View view) {
        this.f102969a.addChild(view);
    }

    /* renamed from: c0 */
    public void m20086c0(boolean z) {
        this.f102969a.setCanOpenPopup(z);
    }

    /* renamed from: d */
    public void m20085d(View view, int i) {
        this.f102969a.addChild(view, i);
    }

    /* renamed from: d0 */
    public void m20084d0(boolean z) {
        this.f102969a.setCheckable(z);
    }

    /* renamed from: e */
    public final void m20083e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m20077h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m20077h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m20077h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m20077h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    /* renamed from: e0 */
    public void m20082e0(boolean z) {
        this.f102969a.setChecked(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C27125p2)) {
            return false;
        }
        C27125p2 c27125p2 = (C27125p2) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f102969a;
        if (accessibilityNodeInfo == null) {
            if (c27125p2.f102969a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c27125p2.f102969a)) {
            return false;
        }
        if (this.f102971c == c27125p2.f102971c && this.f102970b == c27125p2.f102970b) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m20081f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            m20079g();
            m20094X(view);
            ClickableSpan[] m20059q = m20059q(charSequence);
            if (m20059q != null && m20059q.length > 0) {
                m20055s().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C34020Kh4.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> m20049v = m20049v(view);
                for (int i = 0; i < m20059q.length; i++) {
                    int m20133D = m20133D(m20059q[i], m20049v);
                    m20049v.put(m20133D, new WeakReference<>(m20059q[i]));
                    m20083e(m20059q[i], (Spanned) charSequence, m20133D);
                }
            }
        }
    }

    /* renamed from: f0 */
    public void m20080f0(CharSequence charSequence) {
        this.f102969a.setClassName(charSequence);
    }

    /* renamed from: g */
    public final void m20079g() {
        this.f102969a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f102969a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f102969a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f102969a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    /* renamed from: g0 */
    public void m20078g0(boolean z) {
        this.f102969a.setClickable(z);
    }

    /* renamed from: h */
    public final List<Integer> m20077h(String str) {
        ArrayList<Integer> integerArrayList = this.f102969a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.f102969a.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    /* renamed from: h0 */
    public void m20076h0(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f102969a;
        if (obj == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((C27127b) obj).f103019a;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f102969a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public List<C27126a> m20075i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f102969a.getActionList();
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new C27126a(actionList.get(i)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    /* renamed from: i0 */
    public void m20074i0(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f102969a;
        if (obj == null) {
            collectionItemInfo = null;
        } else {
            collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((C27128c) obj).f103020a;
        }
        accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
    }

    /* renamed from: j0 */
    public void m20072j0(CharSequence charSequence) {
        this.f102969a.setContentDescription(charSequence);
    }

    @Deprecated
    /* renamed from: k */
    public int m20071k() {
        return this.f102969a.getActions();
    }

    /* renamed from: k0 */
    public void m20070k0(boolean z) {
        this.f102969a.setContentInvalid(z);
    }

    /* renamed from: l */
    public final boolean m20069l(int i) {
        Bundle m20055s = m20055s();
        if (m20055s == null || (m20055s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) != i) {
            return false;
        }
        return true;
    }

    /* renamed from: l0 */
    public void m20068l0(boolean z) {
        this.f102969a.setDismissable(z);
    }

    @Deprecated
    /* renamed from: m */
    public void m20067m(Rect rect) {
        this.f102969a.getBoundsInParent(rect);
    }

    /* renamed from: m0 */
    public void m20066m0(boolean z) {
        this.f102969a.setEditable(z);
    }

    /* renamed from: n */
    public void m20065n(Rect rect) {
        this.f102969a.getBoundsInScreen(rect);
    }

    /* renamed from: n0 */
    public void m20064n0(boolean z) {
        this.f102969a.setEnabled(z);
    }

    /* renamed from: o */
    public int m20063o() {
        return this.f102969a.getChildCount();
    }

    /* renamed from: o0 */
    public void m20062o0(CharSequence charSequence) {
        this.f102969a.setError(charSequence);
    }

    /* renamed from: p */
    public CharSequence m20061p() {
        return this.f102969a.getClassName();
    }

    /* renamed from: p0 */
    public void m20060p0(boolean z) {
        this.f102969a.setFocusable(z);
    }

    /* renamed from: q0 */
    public void m20058q0(boolean z) {
        this.f102969a.setFocused(z);
    }

    /* renamed from: r */
    public CharSequence m20057r() {
        return this.f102969a.getContentDescription();
    }

    /* renamed from: r0 */
    public void m20056r0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f102969a.setHeading(z);
        } else {
            m20092Z(2, z);
        }
    }

    /* renamed from: s */
    public Bundle m20055s() {
        return this.f102969a.getExtras();
    }

    /* renamed from: s0 */
    public void m20054s0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f102969a.setHintText(charSequence);
        } else {
            this.f102969a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: t */
    public CharSequence m20053t() {
        CharSequence hintText;
        if (Build.VERSION.SDK_INT >= 26) {
            hintText = this.f102969a.getHintText();
            return hintText;
        }
        return this.f102969a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
    }

    /* renamed from: t0 */
    public void m20052t0(boolean z) {
        this.f102969a.setImportantForAccessibility(z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m20067m(rect);
        sb.append("; boundsInParent: " + rect);
        m20065n(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(m20047w());
        sb.append("; className: ");
        sb.append(m20061p());
        sb.append("; text: ");
        sb.append(m20041z());
        sb.append("; contentDescription: ");
        sb.append(m20057r());
        sb.append("; viewId: ");
        sb.append(m20137B());
        sb.append("; uniqueId: ");
        sb.append(m20139A());
        sb.append("; checkable: ");
        sb.append(m20129F());
        sb.append("; checked: ");
        sb.append(m20127G());
        sb.append("; focusable: ");
        sb.append(m20121J());
        sb.append("; focused: ");
        sb.append(m20119K());
        sb.append("; selected: ");
        sb.append(m20111O());
        sb.append("; clickable: ");
        sb.append(m20125H());
        sb.append("; longClickable: ");
        sb.append(m20117L());
        sb.append("; enabled: ");
        sb.append(m20123I());
        sb.append("; password: ");
        sb.append(m20115M());
        sb.append("; scrollable: " + m20113N());
        sb.append("; [");
        List<C27126a> m20075i = m20075i();
        for (int i = 0; i < m20075i.size(); i++) {
            C27126a c27126a = m20075i.get(i);
            String m20073j = m20073j(c27126a.m20038b());
            if (m20073j.equals("ACTION_UNKNOWN") && c27126a.m20037c() != null) {
                m20073j = c27126a.m20037c().toString();
            }
            sb.append(m20073j);
            if (i != m20075i.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public int m20051u() {
        return this.f102969a.getMovementGranularities();
    }

    /* renamed from: u0 */
    public void m20050u0(View view) {
        this.f102969a.setLabelFor(view);
    }

    /* renamed from: v */
    public final SparseArray<WeakReference<ClickableSpan>> m20049v(View view) {
        SparseArray<WeakReference<ClickableSpan>> m20045x = m20045x(view);
        if (m20045x == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(C34020Kh4.tag_accessibility_clickable_spans, sparseArray);
            return sparseArray;
        }
        return m20045x;
    }

    /* renamed from: v0 */
    public void m20048v0(int i) {
        this.f102969a.setLiveRegion(i);
    }

    /* renamed from: w */
    public CharSequence m20047w() {
        return this.f102969a.getPackageName();
    }

    /* renamed from: w0 */
    public void m20046w0(boolean z) {
        this.f102969a.setLongClickable(z);
    }

    /* renamed from: x */
    public final SparseArray<WeakReference<ClickableSpan>> m20045x(View view) {
        return (SparseArray) view.getTag(C34020Kh4.tag_accessibility_clickable_spans);
    }

    /* renamed from: x0 */
    public void m20044x0(int i) {
        this.f102969a.setMaxTextLength(i);
    }

    /* renamed from: y */
    public CharSequence m20043y() {
        CharSequence stateDescription;
        if (T30.m84399b()) {
            stateDescription = this.f102969a.getStateDescription();
            return stateDescription;
        }
        return this.f102969a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    /* renamed from: y0 */
    public void m20042y0(int i) {
        this.f102969a.setMovementGranularities(i);
    }

    /* renamed from: z */
    public CharSequence m20041z() {
        if (m20135C()) {
            List<Integer> m20077h = m20077h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> m20077h2 = m20077h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> m20077h3 = m20077h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> m20077h4 = m20077h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f102969a.getText(), 0, this.f102969a.getText().length()));
            for (int i = 0; i < m20077h.size(); i++) {
                spannableString.setSpan(new C4690L1(m20077h4.get(i).intValue(), this, m20055s().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), m20077h.get(i).intValue(), m20077h2.get(i).intValue(), m20077h3.get(i).intValue());
            }
            return spannableString;
        }
        return this.f102969a.getText();
    }

    /* renamed from: z0 */
    public void m20040z0(CharSequence charSequence) {
        this.f102969a.setPackageName(charSequence);
    }
}
