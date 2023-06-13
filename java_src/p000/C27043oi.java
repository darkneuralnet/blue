package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import p000.C46228oM4;
/* renamed from: oi */
/* loaded from: classes.dex */
public final class C27043oi {

    /* renamed from: b */
    public static final PorterDuff.Mode f102352b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static C27043oi f102353c;

    /* renamed from: a */
    public C46228oM4 f102354a;

    /* renamed from: oi$a */
    /* loaded from: classes.dex */
    public class C27044a implements C46228oM4.InterfaceC26927c {

        /* renamed from: a */
        public final int[] f102355a = {C34947Og4.abc_textfield_search_default_mtrl_alpha, C34947Og4.abc_textfield_default_mtrl_alpha, C34947Og4.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        public final int[] f102356b = {C34947Og4.abc_ic_commit_search_api_mtrl_alpha, C34947Og4.abc_seekbar_tick_mark_material, C34947Og4.abc_ic_menu_share_mtrl_alpha, C34947Og4.abc_ic_menu_copy_mtrl_am_alpha, C34947Og4.abc_ic_menu_cut_mtrl_alpha, C34947Og4.abc_ic_menu_selectall_mtrl_alpha, C34947Og4.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        public final int[] f102357c = {C34947Og4.abc_textfield_activated_mtrl_alpha, C34947Og4.abc_textfield_search_activated_mtrl_alpha, C34947Og4.abc_cab_background_top_mtrl_alpha, C34947Og4.abc_text_cursor_material, C34947Og4.abc_text_select_handle_left_mtrl, C34947Og4.abc_text_select_handle_middle_mtrl, C34947Og4.abc_text_select_handle_right_mtrl};

        /* renamed from: d */
        public final int[] f102358d = {C34947Og4.abc_popup_background_mtrl_mult, C34947Og4.abc_cab_background_internal_bg, C34947Og4.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        public final int[] f102359e = {C34947Og4.abc_tab_indicator_material, C34947Og4.abc_textfield_search_material};

        /* renamed from: f */
        public final int[] f102360f = {C34947Og4.abc_btn_check_material, C34947Og4.abc_btn_radio_material, C34947Og4.abc_btn_check_material_anim, C34947Og4.abc_btn_radio_material_anim};

        @Override // p000.C46228oM4.InterfaceC26927c
        /* renamed from: a */
        public Drawable mo20603a(C46228oM4 c46228oM4, Context context, int i) {
            if (i == C34947Og4.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{c46228oM4.m21278i(context, C34947Og4.abc_cab_background_internal_bg), c46228oM4.m21278i(context, C34947Og4.abc_cab_background_top_mtrl_alpha)});
            }
            if (i == C34947Og4.abc_ratingbar_material) {
                return m20592l(c46228oM4, context, C39281cg4.abc_star_big);
            }
            if (i == C34947Og4.abc_ratingbar_indicator_material) {
                return m20592l(c46228oM4, context, C39281cg4.abc_star_medium);
            }
            if (i == C34947Og4.abc_ratingbar_small_material) {
                return m20592l(c46228oM4, context, C39281cg4.abc_star_small);
            }
            return null;
        }

        @Override // p000.C46228oM4.InterfaceC26927c
        /* renamed from: b */
        public ColorStateList mo20602b(Context context, int i) {
            if (i == C34947Og4.abc_edit_text_material) {
                return C29611vi.m8249a(context, C34236Lf4.abc_tint_edittext);
            }
            if (i == C34947Og4.abc_switch_track_mtrl_alpha) {
                return C29611vi.m8249a(context, C34236Lf4.abc_tint_switch_track);
            }
            if (i == C34947Og4.abc_switch_thumb_material) {
                return m20593k(context);
            }
            if (i == C34947Og4.abc_btn_default_mtrl_shape) {
                return m20594j(context);
            }
            if (i == C34947Og4.abc_btn_borderless_material) {
                return m20597g(context);
            }
            if (i == C34947Og4.abc_btn_colored_material) {
                return m20595i(context);
            }
            if (i != C34947Og4.abc_spinner_mtrl_am_alpha && i != C34947Og4.abc_spinner_textfield_background_material) {
                if (m20598f(this.f102356b, i)) {
                    return C46645p36.m20006e(context, C50553vf4.colorControlNormal);
                }
                if (m20598f(this.f102359e, i)) {
                    return C29611vi.m8249a(context, C34236Lf4.abc_tint_default);
                }
                if (m20598f(this.f102360f, i)) {
                    return C29611vi.m8249a(context, C34236Lf4.abc_tint_btn_checkable);
                }
                if (i == C34947Og4.abc_seekbar_thumb_material) {
                    return C29611vi.m8249a(context, C34236Lf4.abc_tint_seek_thumb);
                }
                return null;
            }
            return C29611vi.m8249a(context, C34236Lf4.abc_tint_spinner);
        }

        @Override // p000.C46228oM4.InterfaceC26927c
        /* renamed from: c */
        public PorterDuff.Mode mo20601c(int i) {
            if (i == C34947Og4.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // p000.C46228oM4.InterfaceC26927c
        /* renamed from: d */
        public boolean mo20600d(Context context, int i, Drawable drawable) {
            if (i == C34947Og4.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = C50553vf4.colorControlNormal;
                m20591m(findDrawableByLayerId, C46645p36.m20008c(context, i2), C27043oi.f102352b);
                m20591m(layerDrawable.findDrawableByLayerId(16908303), C46645p36.m20008c(context, i2), C27043oi.f102352b);
                m20591m(layerDrawable.findDrawableByLayerId(16908301), C46645p36.m20008c(context, C50553vf4.colorControlActivated), C27043oi.f102352b);
                return true;
            } else if (i != C34947Og4.abc_ratingbar_material && i != C34947Og4.abc_ratingbar_indicator_material && i != C34947Og4.abc_ratingbar_small_material) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m20591m(layerDrawable2.findDrawableByLayerId(16908288), C46645p36.m20009b(context, C50553vf4.colorControlNormal), C27043oi.f102352b);
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = C50553vf4.colorControlActivated;
                m20591m(findDrawableByLayerId2, C46645p36.m20008c(context, i3), C27043oi.f102352b);
                m20591m(layerDrawable2.findDrawableByLayerId(16908301), C46645p36.m20008c(context, i3), C27043oi.f102352b);
                return true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[RETURN] */
        @Override // p000.C46228oM4.InterfaceC26927c
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean mo20599e(Context context, int i, Drawable drawable) {
            PorterDuff.Mode mode;
            int i2;
            boolean z;
            int round;
            PorterDuff.Mode mode2 = C27043oi.f102352b;
            if (m20598f(this.f102355a, i)) {
                i2 = C50553vf4.colorControlNormal;
            } else if (m20598f(this.f102357c, i)) {
                i2 = C50553vf4.colorControlActivated;
            } else {
                if (m20598f(this.f102358d, i)) {
                    mode2 = PorterDuff.Mode.MULTIPLY;
                } else if (i == C34947Og4.abc_list_divider_mtrl_alpha) {
                    z = true;
                    round = Math.round(40.8f);
                    i2 = 16842800;
                    mode = mode2;
                    if (z) {
                        return false;
                    }
                    if (C39565d71.m44602a(drawable)) {
                        drawable = drawable.mutate();
                    }
                    drawable.setColorFilter(C27043oi.m20608e(C46645p36.m20008c(context, i2), mode));
                    if (round != -1) {
                        drawable.setAlpha(round);
                    }
                    return true;
                } else if (i != C34947Og4.abc_dialog_material_background) {
                    mode = mode2;
                    i2 = 0;
                    z = false;
                    round = -1;
                    if (z) {
                    }
                }
                mode = mode2;
                round = -1;
                i2 = 16842801;
                z = true;
                if (z) {
                }
            }
            mode = mode2;
            z = true;
            round = -1;
            if (z) {
            }
        }

        /* renamed from: f */
        public final boolean m20598f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        public final ColorStateList m20597g(Context context) {
            return m20596h(context, 0);
        }

        /* renamed from: h */
        public final ColorStateList m20596h(Context context, int i) {
            int m20008c = C46645p36.m20008c(context, C50553vf4.colorControlHighlight);
            return new ColorStateList(new int[][]{C46645p36.f103073b, C46645p36.f103076e, C46645p36.f103074c, C46645p36.f103080i}, new int[]{C46645p36.m20009b(context, C50553vf4.colorButtonNormal), C33827Jm0.m99850k(m20008c, i), C33827Jm0.m99850k(m20008c, i), i});
        }

        /* renamed from: i */
        public final ColorStateList m20595i(Context context) {
            return m20596h(context, C46645p36.m20008c(context, C50553vf4.colorAccent));
        }

        /* renamed from: j */
        public final ColorStateList m20594j(Context context) {
            return m20596h(context, C46645p36.m20008c(context, C50553vf4.colorButtonNormal));
        }

        /* renamed from: k */
        public final ColorStateList m20593k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i = C50553vf4.colorSwitchThumbNormal;
            ColorStateList m20006e = C46645p36.m20006e(context, i);
            if (m20006e != null && m20006e.isStateful()) {
                int[] iArr3 = C46645p36.f103073b;
                iArr[0] = iArr3;
                iArr2[0] = m20006e.getColorForState(iArr3, 0);
                iArr[1] = C46645p36.f103077f;
                iArr2[1] = C46645p36.m20008c(context, C50553vf4.colorControlActivated);
                iArr[2] = C46645p36.f103080i;
                iArr2[2] = m20006e.getDefaultColor();
            } else {
                iArr[0] = C46645p36.f103073b;
                iArr2[0] = C46645p36.m20009b(context, i);
                iArr[1] = C46645p36.f103077f;
                iArr2[1] = C46645p36.m20008c(context, C50553vf4.colorControlActivated);
                iArr[2] = C46645p36.f103080i;
                iArr2[2] = C46645p36.m20008c(context, i);
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        public final LayerDrawable m20592l(C46228oM4 c46228oM4, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable m21278i = c46228oM4.m21278i(context, C34947Og4.abc_star_black_48dp);
            Drawable m21278i2 = c46228oM4.m21278i(context, C34947Og4.abc_star_half_black_48dp);
            if ((m21278i instanceof BitmapDrawable) && m21278i.getIntrinsicWidth() == dimensionPixelSize && m21278i.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) m21278i;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                m21278i.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                m21278i.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((m21278i2 instanceof BitmapDrawable) && m21278i2.getIntrinsicWidth() == dimensionPixelSize && m21278i2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) m21278i2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                m21278i2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                m21278i2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        /* renamed from: m */
        public final void m20591m(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C39565d71.m44602a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C27043oi.f102352b;
            }
            drawable.setColorFilter(C27043oi.m20608e(i, mode));
        }
    }

    /* renamed from: b */
    public static synchronized C27043oi m20611b() {
        C27043oi c27043oi;
        synchronized (C27043oi.class) {
            if (f102353c == null) {
                m20605h();
            }
            c27043oi = f102353c;
        }
        return c27043oi;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m20608e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m21276k;
        synchronized (C27043oi.class) {
            m21276k = C46228oM4.m21276k(i, mode);
        }
        return m21276k;
    }

    /* renamed from: h */
    public static synchronized void m20605h() {
        synchronized (C27043oi.class) {
            if (f102353c == null) {
                C27043oi c27043oi = new C27043oi();
                f102353c = c27043oi;
                c27043oi.f102354a = C46228oM4.m21280g();
                f102353c.f102354a.m21267t(new C27044a());
            }
        }
    }

    /* renamed from: i */
    public static void m20604i(Drawable drawable, X46 x46, int[] iArr) {
        C46228oM4.m21265v(drawable, x46, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable m20610c(Context context, int i) {
        return this.f102354a.m21278i(context, i);
    }

    /* renamed from: d */
    public synchronized Drawable m20609d(Context context, int i, boolean z) {
        return this.f102354a.m21277j(context, i, z);
    }

    /* renamed from: f */
    public synchronized ColorStateList m20607f(Context context, int i) {
        return this.f102354a.m21275l(context, i);
    }

    /* renamed from: g */
    public synchronized void m20606g(Context context) {
        this.f102354a.m21269r(context);
    }
}
