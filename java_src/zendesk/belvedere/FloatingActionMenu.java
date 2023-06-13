package zendesk.belvedere;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes8.dex */
public class FloatingActionMenu extends LinearLayout implements View.OnClickListener {

    /* renamed from: b */
    public FloatingActionButton f121754b;

    /* renamed from: c */
    public LayoutInflater f121755c;

    /* renamed from: d */
    public final List<C48526sE3<FloatingActionButton, View.OnClickListener>> f121756d;

    /* renamed from: e */
    public View.OnClickListener f121757e;

    /* renamed from: f */
    public boolean f121758f;

    /* renamed from: g */
    public boolean f121759g;

    /* renamed from: h */
    public int f121760h;

    /* renamed from: i */
    public final AbstractanimationAnimation$AnimationListenerC31084c f121761i;

    /* renamed from: zendesk.belvedere.FloatingActionMenu$a */
    /* loaded from: classes8.dex */
    public class C31082a extends AbstractanimationAnimation$AnimationListenerC31084c {

        /* renamed from: b */
        public final /* synthetic */ C48526sE3 f121762b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31082a(C48526sE3 c48526sE3) {
            super(null);
            this.f121762b = c48526sE3;
        }

        @Override // zendesk.belvedere.FloatingActionMenu.AbstractanimationAnimation$AnimationListenerC31084c, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            FloatingActionMenu.this.m831d((View) this.f121762b.f108491a, 4);
        }
    }

    /* renamed from: zendesk.belvedere.FloatingActionMenu$b */
    /* loaded from: classes8.dex */
    public class C31083b extends AbstractanimationAnimation$AnimationListenerC31084c {
        public C31083b() {
            super(null);
        }

        @Override // zendesk.belvedere.FloatingActionMenu.AbstractanimationAnimation$AnimationListenerC31084c, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            for (C48526sE3 c48526sE3 : FloatingActionMenu.this.f121756d) {
                FloatingActionMenu.this.m831d((View) c48526sE3.f108491a, 8);
            }
        }
    }

    /* renamed from: zendesk.belvedere.FloatingActionMenu$c  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static abstract class AbstractanimationAnimation$AnimationListenerC31084c implements Animation.AnimationListener {
        private AbstractanimationAnimation$AnimationListenerC31084c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        public /* synthetic */ AbstractanimationAnimation$AnimationListenerC31084c(C31082a c31082a) {
            this();
        }
    }

    public FloatingActionMenu(Context context) {
        super(context);
        this.f121756d = new ArrayList();
        this.f121759g = true;
        this.f121761i = new C31083b();
        m827h(context);
    }

    /* renamed from: c */
    public void m832c(int i, int i2, int i3, View.OnClickListener onClickListener) {
        FloatingActionButton floatingActionButton = (FloatingActionButton) this.f121755c.inflate(C32175Ck4.belvedere_floating_action_menu_item, (ViewGroup) this, false);
        floatingActionButton.setOnClickListener(onClickListener);
        floatingActionButton.setImageDrawable(m830e(i, C31896Bf4.belvedere_floating_action_menu_item_icon_color));
        floatingActionButton.setId(i2);
        floatingActionButton.setContentDescription(getResources().getString(i3));
        this.f121756d.add(C48526sE3.m14515a(floatingActionButton, onClickListener));
        if (this.f121756d.size() == 1) {
            this.f121754b.setImageDrawable(m830e(i, C31896Bf4.belvedere_floating_action_menu_icon_color));
            this.f121754b.setContentDescription(getResources().getString(i3));
        } else if (this.f121756d.size() == 2) {
            addView(this.f121756d.get(0).f108491a, 0);
            addView(floatingActionButton, 0);
            this.f121754b.setImageDrawable(m830e(C33075Gg4.belvedere_fam_icon_add_file, C31896Bf4.belvedere_floating_action_menu_icon_color));
            this.f121754b.setContentDescription(getResources().getString(C44092kl4.belvedere_fam_desc_expand_fam));
        } else {
            addView(floatingActionButton, 0);
        }
        if (!this.f121756d.isEmpty()) {
            m828g();
        }
    }

    /* renamed from: d */
    public final void m831d(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* renamed from: e */
    public final Drawable m830e(int i, int i2) {
        Context context = getContext();
        Drawable m90834r = P61.m90834r(NA0.m94299e(context, i));
        P61.m90838n(m90834r, NA0.m94301c(context, i2));
        return m90834r;
    }

    /* renamed from: f */
    public final void m829f() {
        m826i(false);
        m824k(false);
        this.f121754b.setContentDescription(getResources().getString(C44092kl4.belvedere_fam_desc_collapse_fam));
    }

    /* renamed from: g */
    public void m828g() {
        if (this.f121756d.isEmpty()) {
            return;
        }
        if (this.f121759g) {
            this.f121754b.setImageResource(C33075Gg4.belvedere_fam_icon_add_file);
        }
        this.f121759g = false;
    }

    /* renamed from: h */
    public final void m827h(Context context) {
        View.inflate(context, C32175Ck4.belvedere_floating_action_menu, this);
        if (!isInEditMode()) {
            setOrientation(1);
            setOnClickListener(this);
            FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(C35883Sg4.floating_action_menu_fab);
            this.f121754b = floatingActionButton;
            floatingActionButton.setOnClickListener(this);
            this.f121755c = LayoutInflater.from(context);
            this.f121760h = getResources().getInteger(C35433Qi4.belvedere_fam_animation_delay_subsequent_item);
            m823l();
        }
    }

    /* renamed from: i */
    public final void m826i(boolean z) {
        if (z) {
            this.f121754b.setImageResource(C33075Gg4.belvedere_fam_icon_close);
        } else {
            this.f121754b.setImageResource(C33075Gg4.belvedere_fam_icon_add_file);
        }
    }

    /* renamed from: j */
    public final void m825j() {
        m826i(true);
        m824k(true);
        this.f121754b.setContentDescription(getResources().getString(C44092kl4.belvedere_fam_desc_expand_fam));
    }

    /* renamed from: k */
    public final void m824k(boolean z) {
        if (this.f121756d.isEmpty()) {
            m823l();
            return;
        }
        long j = 0;
        if (z) {
            for (C48526sE3<FloatingActionButton, View.OnClickListener> c48526sE3 : this.f121756d) {
                Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C39271cf4.belvedere_show_menu_item);
                loadAnimation.setRepeatMode(2);
                loadAnimation.setStartOffset(j);
                FloatingActionButton floatingActionButton = c48526sE3.f108491a;
                if (floatingActionButton != null) {
                    m831d(floatingActionButton, 0);
                    c48526sE3.f108491a.startAnimation(loadAnimation);
                }
                j += this.f121760h;
            }
            return;
        }
        int size = this.f121756d.size() - 1;
        Animation animation = null;
        while (size >= 0) {
            C48526sE3<FloatingActionButton, View.OnClickListener> c48526sE32 = this.f121756d.get(size);
            Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), C39271cf4.belvedere_hide_menu_item);
            loadAnimation2.setRepeatMode(2);
            loadAnimation2.setStartOffset(j);
            loadAnimation2.setAnimationListener(new C31082a(c48526sE32));
            FloatingActionButton floatingActionButton2 = c48526sE32.f108491a;
            if (floatingActionButton2 != null) {
                floatingActionButton2.startAnimation(loadAnimation2);
            }
            j += this.f121760h;
            size--;
            animation = loadAnimation2;
        }
        if (animation != null) {
            animation.setAnimationListener(this.f121761i);
        }
    }

    /* renamed from: l */
    public void m823l() {
        this.f121759g = true;
        if (this.f121758f) {
            m829f();
        }
        this.f121754b.setImageResource(C33075Gg4.belvedere_fam_icon_send);
    }

    /* renamed from: m */
    public final void m822m() {
        boolean z = !this.f121758f;
        this.f121758f = z;
        if (z) {
            m825j();
        } else {
            m829f();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener;
        if (this.f121759g && (onClickListener = this.f121757e) != null) {
            onClickListener.onClick(this);
        } else if (this.f121756d.isEmpty()) {
        } else {
            if (this.f121756d.size() == 1) {
                C48526sE3<FloatingActionButton, View.OnClickListener> c48526sE3 = this.f121756d.get(0);
                c48526sE3.f108492b.onClick(c48526sE3.f108491a);
                return;
            }
            m822m();
        }
    }

    public void setOnSendClickListener(View.OnClickListener onClickListener) {
        this.f121757e = onClickListener;
    }

    public FloatingActionMenu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f121756d = new ArrayList();
        this.f121759g = true;
        this.f121761i = new C31083b();
        m827h(context);
    }

    public FloatingActionMenu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121756d = new ArrayList();
        this.f121759g = true;
        this.f121761i = new C31083b();
        m827h(context);
    }
}
