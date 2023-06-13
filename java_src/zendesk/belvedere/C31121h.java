package zendesk.belvedere;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.widget.PopupWindow;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import zendesk.belvedere.BelvedereUi;
import zendesk.belvedere.C31103c;
import zendesk.belvedere.KeyboardHelper;
/* renamed from: zendesk.belvedere.h */
/* loaded from: classes8.dex */
public class C31121h extends PopupWindow implements InterfaceC31116f {

    /* renamed from: a */
    public final C31117g f121857a;

    /* renamed from: b */
    public final C31103c f121858b;

    /* renamed from: c */
    public final List<Integer> f121859c;

    /* renamed from: d */
    public KeyboardHelper f121860d;

    /* renamed from: e */
    public View f121861e;

    /* renamed from: f */
    public View f121862f;

    /* renamed from: g */
    public View f121863g;

    /* renamed from: h */
    public View f121864h;

    /* renamed from: i */
    public FloatingActionMenu f121865i;

    /* renamed from: j */
    public RecyclerView f121866j;

    /* renamed from: k */
    public Toolbar f121867k;

    /* renamed from: l */
    public BottomSheetBehavior<View> f121868l;

    /* renamed from: m */
    public Activity f121869m;

    /* renamed from: zendesk.belvedere.h$a */
    /* loaded from: classes8.dex */
    public class View$OnClickListenerC31122a implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ boolean f121870b;

        public View$OnClickListenerC31122a(boolean z) {
            this.f121870b = z;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!this.f121870b) {
                C31121h.this.f121868l.m50082p0(4);
            } else {
                C31121h.this.dismiss();
            }
        }
    }

    /* renamed from: zendesk.belvedere.h$b */
    /* loaded from: classes8.dex */
    public class C31123b extends BottomSheetBehavior.AbstractC17702f {
        public C31123b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
        public void onSlide(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
        public void onStateChanged(View view, int i) {
            if (i != 5) {
                return;
            }
            C31121h.this.dismiss();
        }
    }

    /* renamed from: zendesk.belvedere.h$c */
    /* loaded from: classes8.dex */
    public class C31124c implements KeyboardHelper.InterfaceC31088d {
        public C31124c() {
        }

        @Override // zendesk.belvedere.KeyboardHelper.InterfaceC31088d
        /* renamed from: a */
        public void mo673a(int i) {
            if (i != C31121h.this.f121868l.m50129K()) {
                C31121h.this.f121868l.m50092k0(C31121h.this.f121861e.getPaddingTop() + C31121h.this.f121860d.m810l());
            }
        }
    }

    /* renamed from: zendesk.belvedere.h$d */
    /* loaded from: classes8.dex */
    public class View$OnClickListenerC31125d implements View.OnClickListener {
        public View$OnClickListenerC31125d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C31121h.this.f121857a.m700j();
            C31121h.this.dismiss();
        }
    }

    /* renamed from: zendesk.belvedere.h$e */
    /* loaded from: classes8.dex */
    public class View$OnTouchListenerC31126e implements View.OnTouchListener {

        /* renamed from: b */
        public final /* synthetic */ List f121875b;

        /* renamed from: c */
        public final /* synthetic */ Activity f121876c;

        public View$OnTouchListenerC31126e(List list, Activity activity) {
            this.f121875b = list;
            this.f121876c = activity;
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            boolean z3;
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            Iterator it = this.f121875b.iterator();
            while (true) {
                if (it.hasNext()) {
                    View findViewById = this.f121876c.findViewById(((Integer) it.next()).intValue());
                    if (findViewById != null) {
                        Rect rect = new Rect();
                        findViewById.getGlobalVisibleRect(rect);
                        z = false;
                        if (rawX >= rect.left && rawX <= rect.right) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (rawY >= rect.top && rawY <= rect.bottom) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2 && z3) {
                            this.f121876c.dispatchTouchEvent(MotionEvent.obtain(motionEvent));
                            break;
                        }
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                C31121h.this.dismiss();
            }
            return true;
        }
    }

    /* renamed from: zendesk.belvedere.h$f */
    /* loaded from: classes8.dex */
    public class C31127f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ Window f121878a;

        /* renamed from: b */
        public final /* synthetic */ ValueAnimator f121879b;

        public C31127f(Window window, ValueAnimator valueAnimator) {
            this.f121878a = window;
            this.f121879b = valueAnimator;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f121878a.setStatusBarColor(((Integer) this.f121879b.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: zendesk.belvedere.h$g */
    /* loaded from: classes8.dex */
    public class C31128g extends CoordinatorLayout.Behavior<View> {

        /* renamed from: a */
        public final boolean f121881a;

        public /* synthetic */ C31128g(C31121h c31121h, boolean z, View$OnClickListenerC31122a view$OnClickListenerC31122a) {
            this(z);
        }

        /* renamed from: a */
        public final void m672a(int i, float f, int i2, View view) {
            float f2 = i;
            float f3 = f2 - (f * f2);
            float f4 = i2;
            if (f3 <= f4) {
                C32627Ei6.m108562f(C31121h.this.getContentView(), true);
                view.setAlpha(1.0f - (f3 / f4));
                view.setY(f3);
            } else {
                C32627Ei6.m108562f(C31121h.this.getContentView(), false);
            }
            C31121h.this.m674w(f);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2.getId() == C35883Sg4.bottom_sheet;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int height = coordinatorLayout.getHeight() - C31121h.this.f121868l.m50129K();
            float height2 = ((coordinatorLayout.getHeight() - view2.getY()) - C31121h.this.f121868l.m50129K()) / height;
            m672a(height, height2, C38790bq6.m62546E(C31121h.this.f121867k), view);
            if (this.f121881a) {
                C31121h.this.f121857a.m702h(coordinatorLayout.getHeight(), height, height2);
                return true;
            }
            return true;
        }

        public C31128g(boolean z) {
            this.f121881a = z;
        }
    }

    public C31121h(Activity activity, View view, C31098b c31098b, BelvedereUi.UiConfig uiConfig) {
        super(view, -1, -1, false);
        setInputMethodMode(2);
        setFocusable(true);
        setTouchable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setOutsideTouchable(true);
        m681p(view);
        this.f121869m = activity;
        this.f121858b = new C31103c();
        this.f121860d = c31098b.m757A9();
        this.f121859c = uiConfig.m860e();
        C31117g c31117g = new C31117g(new C31115e(view.getContext(), uiConfig), this, c31098b);
        this.f121857a = c31117g;
        c31117g.m704f();
    }

    /* renamed from: v */
    public static C31121h m675v(Activity activity, ViewGroup viewGroup, C31098b c31098b, BelvedereUi.UiConfig uiConfig) {
        C31121h c31121h = new C31121h(activity, LayoutInflater.from(activity).inflate(C32175Ck4.belvedere_image_stream, viewGroup, false), c31098b, uiConfig);
        c31121h.showAtLocation(viewGroup, 48, 0, 0);
        return c31121h;
    }

    @Override // zendesk.belvedere.InterfaceC31116f
    /* renamed from: a */
    public void mo696a(List<MediaResult> list, List<MediaResult> list2, boolean z, boolean z2, C31103c.InterfaceC31105b interfaceC31105b) {
        if (!z) {
            KeyboardHelper.m800v(this.f121860d.m811k());
        }
        ViewGroup.LayoutParams layoutParams = this.f121861e.getLayoutParams();
        layoutParams.height = -1;
        this.f121861e.setLayoutParams(layoutParams);
        if (z2) {
            this.f121858b.m741o(C31106d.m737a(interfaceC31105b));
        }
        this.f121858b.m740p(C31106d.m736b(list, interfaceC31105b, this.f121861e.getContext()));
        this.f121858b.m739q(list2);
        this.f121858b.notifyDataSetChanged();
    }

    @Override // zendesk.belvedere.InterfaceC31116f
    /* renamed from: b */
    public void mo695b(View.OnClickListener onClickListener) {
        FloatingActionMenu floatingActionMenu = this.f121865i;
        if (floatingActionMenu != null) {
            floatingActionMenu.m832c(C33075Gg4.belvedere_ic_file, C35883Sg4.belvedere_fam_item_documents, C44092kl4.belvedere_fam_desc_open_gallery, onClickListener);
        }
    }

    @Override // zendesk.belvedere.InterfaceC31116f
    /* renamed from: c */
    public void mo694c(View.OnClickListener onClickListener) {
        FloatingActionMenu floatingActionMenu = this.f121865i;
        if (floatingActionMenu != null) {
            floatingActionMenu.m832c(C33075Gg4.belvedere_ic_collections, C35883Sg4.belvedere_fam_item_google_photos, C44092kl4.belvedere_fam_desc_open_google_photos, onClickListener);
        }
    }

    @Override // zendesk.belvedere.InterfaceC31116f
    /* renamed from: d */
    public void mo693d(boolean z) {
        m677t(this.f121858b);
        m676u(z);
        m680q(z);
        m678s(this.f121869m, this.f121859c);
        m679r(this.f121865i);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        m674w(0.0f);
        this.f121857a.m705e();
    }

    @Override // zendesk.belvedere.InterfaceC31116f
    /* renamed from: e */
    public void mo692e(int i) {
        if (i > 0) {
            this.f121867k.setTitle(String.format(Locale.getDefault(), "%s (%d)", this.f121869m.getString(C44092kl4.belvedere_image_stream_title), Integer.valueOf(i)));
            return;
        }
        this.f121867k.setTitle(C44092kl4.belvedere_image_stream_title);
    }

    @Override // zendesk.belvedere.InterfaceC31116f
    /* renamed from: f */
    public void mo691f(int i) {
        if (i == 0) {
            this.f121865i.m828g();
        } else {
            this.f121865i.m823l();
        }
    }

    @Override // zendesk.belvedere.InterfaceC31116f
    /* renamed from: g */
    public void mo690g(int i) {
        Toast.makeText(this.f121869m, i, 0).show();
    }

    @Override // zendesk.belvedere.InterfaceC31116f
    /* renamed from: h */
    public boolean mo689h() {
        boolean z;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        if (this.f121869m.isInMultiWindowMode() || this.f121869m.isInPictureInPictureMode()) {
            return true;
        }
        if (this.f121869m.getResources().getConfiguration().keyboard != 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f121869m.getSystemService("accessibility");
        if (accessibilityManager != null && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(47)) != null && enabledAccessibilityServiceList.size() > 0) {
            return true;
        }
        return false;
    }

    @Override // zendesk.belvedere.InterfaceC31116f
    /* renamed from: i */
    public void mo688i(MediaIntent mediaIntent, C31098b c31098b) {
        mediaIntent.m794g(c31098b);
    }

    /* renamed from: p */
    public final void m681p(View view) {
        this.f121861e = view.findViewById(C35883Sg4.bottom_sheet);
        this.f121862f = view.findViewById(C35883Sg4.dismiss_area);
        this.f121866j = (RecyclerView) view.findViewById(C35883Sg4.image_list);
        this.f121867k = (Toolbar) view.findViewById(C35883Sg4.image_stream_toolbar);
        this.f121863g = view.findViewById(C35883Sg4.image_stream_toolbar_container);
        this.f121864h = view.findViewById(C35883Sg4.image_stream_compat_shadow);
        this.f121865i = (FloatingActionMenu) view.findViewById(C35883Sg4.floating_action_menu);
    }

    /* renamed from: q */
    public final void m680q(boolean z) {
        C38790bq6.m62545E0(this.f121866j, this.f121861e.getContext().getResources().getDimensionPixelSize(C35874Sf4.belvedere_bottom_sheet_elevation));
        BottomSheetBehavior<View> m50133G = BottomSheetBehavior.m50133G(this.f121861e);
        this.f121868l = m50133G;
        m50133G.m50073u(new C31123b());
        C32627Ei6.m108562f(getContentView(), false);
        if (!z) {
            this.f121868l.m50092k0(this.f121861e.getPaddingTop() + this.f121860d.m810l());
            this.f121868l.m50082p0(4);
            this.f121860d.m801u(new C31124c());
        } else {
            this.f121868l.m50084o0(true);
            this.f121868l.m50082p0(3);
            KeyboardHelper.m805q(this.f121869m);
        }
        this.f121866j.setClickable(true);
        this.f121861e.setVisibility(0);
    }

    /* renamed from: r */
    public final void m679r(FloatingActionMenu floatingActionMenu) {
        floatingActionMenu.setOnSendClickListener(new View$OnClickListenerC31125d());
    }

    /* renamed from: s */
    public final void m678s(Activity activity, List<Integer> list) {
        this.f121862f.setOnTouchListener(new View$OnTouchListenerC31126e(list, activity));
    }

    /* renamed from: t */
    public final void m677t(C31103c c31103c) {
        this.f121866j.setLayoutManager(new StaggeredGridLayoutManager(this.f121861e.getContext().getResources().getInteger(C35433Qi4.belvedere_image_stream_column_count), 1));
        this.f121866j.setHasFixedSize(true);
        this.f121866j.setDrawingCacheEnabled(true);
        this.f121866j.setDrawingCacheQuality(1048576);
        C11894g c11894g = new C11894g();
        c11894g.setSupportsChangeAnimations(false);
        this.f121866j.setItemAnimator(c11894g);
        this.f121866j.setAdapter(c31103c);
    }

    /* renamed from: u */
    public final void m676u(boolean z) {
        this.f121867k.setNavigationIcon(C33075Gg4.belvedere_ic_close);
        this.f121867k.setNavigationContentDescription(C44092kl4.belvedere_toolbar_desc_collapse);
        this.f121867k.setBackgroundColor(-1);
        this.f121867k.setNavigationOnClickListener(new View$OnClickListenerC31122a(z));
        CoordinatorLayout.C11529e c11529e = (CoordinatorLayout.C11529e) this.f121863g.getLayoutParams();
        if (c11529e != null) {
            c11529e.m67758q(new C31128g(this, !z, null));
        }
    }

    /* renamed from: w */
    public final void m674w(float f) {
        boolean z;
        int color = this.f121867k.getResources().getColor(C31896Bf4.belvedere_image_stream_status_bar_color);
        int m108567a = C32627Ei6.m108567a(this.f121867k.getContext(), C44625lf4.colorPrimaryDark);
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        Window window = this.f121869m.getWindow();
        if (z) {
            if (window.getStatusBarColor() == m108567a) {
                ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(m108567a), Integer.valueOf(color));
                ofObject.setDuration(100L);
                ofObject.addUpdateListener(new C31127f(window, ofObject));
                ofObject.start();
            }
        } else {
            window.setStatusBarColor(m108567a);
        }
        View decorView = window.getDecorView();
        if (z) {
            decorView.setSystemUiVisibility(8192);
        } else {
            decorView.setSystemUiVisibility(0);
        }
    }
}
