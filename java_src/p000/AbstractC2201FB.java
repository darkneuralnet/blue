package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.InterfaceC17827b;
import java.util.ArrayList;
import java.util.List;
/* renamed from: FB */
/* loaded from: classes6.dex */
public abstract class AbstractC2201FB implements InterfaceC17827b {

    /* renamed from: a */
    public final Context f8989a;

    /* renamed from: b */
    public final ExtendedFloatingActionButton f8990b;

    /* renamed from: c */
    public final ArrayList<Animator.AnimatorListener> f8991c = new ArrayList<>();

    /* renamed from: d */
    public final C0676Bf f8992d;

    /* renamed from: e */
    public YV2 f8993e;

    /* renamed from: f */
    public YV2 f8994f;

    /* renamed from: FB$a */
    /* loaded from: classes6.dex */
    public class C2202a extends Property<ExtendedFloatingActionButton, Float> {
        public C2202a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(C27325pf.m19015a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.f72835o.getColorForState(extendedFloatingActionButton.getDrawableState(), AbstractC2201FB.this.f8990b.f72835o.getDefaultColor()))));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
            int colorForState = extendedFloatingActionButton.f72835o.getColorForState(extendedFloatingActionButton.getDrawableState(), AbstractC2201FB.this.f8990b.f72835o.getDefaultColor());
            ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (C27325pf.m19015a(0.0f, Color.alpha(colorForState) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f.floatValue() == 1.0f) {
                extendedFloatingActionButton.m49557w(extendedFloatingActionButton.f72835o);
            } else {
                extendedFloatingActionButton.m49557w(valueOf);
            }
        }
    }

    public AbstractC2201FB(ExtendedFloatingActionButton extendedFloatingActionButton, C0676Bf c0676Bf) {
        this.f8990b = extendedFloatingActionButton;
        this.f8989a = extendedFloatingActionButton.getContext();
        this.f8992d = c0676Bf;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC17827b
    /* renamed from: b */
    public final void mo49443b(YV2 yv2) {
        this.f8994f = yv2;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC17827b
    /* renamed from: d */
    public AnimatorSet mo49441d() {
        return m107451k(m107450l());
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC17827b
    /* renamed from: g */
    public void mo49438g() {
        this.f8992d.m113735b();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC17827b
    /* renamed from: h */
    public void mo49437h() {
        this.f8992d.m113735b();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC17827b
    /* renamed from: i */
    public final List<Animator.AnimatorListener> mo49436i() {
        return this.f8991c;
    }

    /* renamed from: k */
    public AnimatorSet m107451k(YV2 yv2) {
        ArrayList arrayList = new ArrayList();
        if (yv2.m74976j("opacity")) {
            arrayList.add(yv2.m74980f("opacity", this.f8990b, View.ALPHA));
        }
        if (yv2.m74976j("scale")) {
            arrayList.add(yv2.m74980f("scale", this.f8990b, View.SCALE_Y));
            arrayList.add(yv2.m74980f("scale", this.f8990b, View.SCALE_X));
        }
        if (yv2.m74976j("width")) {
            arrayList.add(yv2.m74980f("width", this.f8990b, ExtendedFloatingActionButton.f72818t));
        }
        if (yv2.m74976j("height")) {
            arrayList.add(yv2.m74980f("height", this.f8990b, ExtendedFloatingActionButton.f72819u));
        }
        if (yv2.m74976j("paddingStart")) {
            arrayList.add(yv2.m74980f("paddingStart", this.f8990b, ExtendedFloatingActionButton.f72820v));
        }
        if (yv2.m74976j("paddingEnd")) {
            arrayList.add(yv2.m74980f("paddingEnd", this.f8990b, ExtendedFloatingActionButton.f72821w));
        }
        if (yv2.m74976j("labelOpacity")) {
            arrayList.add(yv2.m74980f("labelOpacity", this.f8990b, new C2202a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        C0168Af.m115414a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: l */
    public final YV2 m107450l() {
        YV2 yv2 = this.f8994f;
        if (yv2 != null) {
            return yv2;
        }
        if (this.f8993e == null) {
            this.f8993e = YV2.m74982d(this.f8989a, mo49442c());
        }
        return (YV2) HZ3.m103731g(this.f8993e);
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC17827b
    public void onAnimationStart(Animator animator) {
        this.f8992d.m113734c(animator);
    }
}
