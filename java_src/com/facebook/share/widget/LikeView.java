package com.facebook.share.widget;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookException;
import com.facebook.share.internal.C17296a;
import com.facebook.share.internal.LikeBoxCountView;
import com.facebook.share.internal.LikeButton;
@Deprecated
/* loaded from: classes5.dex */
public class LikeView extends FrameLayout {

    /* renamed from: b */
    public String f69888b;

    /* renamed from: c */
    public EnumC17371g f69889c;

    /* renamed from: d */
    public LinearLayout f69890d;

    /* renamed from: e */
    public LikeButton f69891e;

    /* renamed from: f */
    public LikeBoxCountView f69892f;

    /* renamed from: g */
    public TextView f69893g;

    /* renamed from: h */
    public C17296a f69894h;

    /* renamed from: i */
    public BroadcastReceiver f69895i;

    /* renamed from: j */
    public C17369e f69896j;

    /* renamed from: k */
    public EnumC17373i f69897k;

    /* renamed from: l */
    public EnumC17368d f69898l;

    /* renamed from: m */
    public EnumC17367c f69899m;

    /* renamed from: n */
    public int f69900n;

    /* renamed from: o */
    public int f69901o;

    /* renamed from: p */
    public int f69902p;

    /* renamed from: q */
    public C33702Iy1 f69903q;

    /* renamed from: r */
    public boolean f69904r;

    /* renamed from: com.facebook.share.widget.LikeView$a */
    /* loaded from: classes5.dex */
    public class View$OnClickListenerC17365a implements View.OnClickListener {
        public View$OnClickListenerC17365a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                LikeView.this.m52103s();
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: com.facebook.share.widget.LikeView$b */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C17366b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f69906a;

        static {
            int[] iArr = new int[EnumC17367c.values().length];
            f69906a = iArr;
            try {
                iArr[EnumC17367c.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69906a[EnumC17367c.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69906a[EnumC17367c.INLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Deprecated
    /* renamed from: com.facebook.share.widget.LikeView$c */
    /* loaded from: classes5.dex */
    public enum EnumC17367c {
        BOTTOM("bottom", 0),
        INLINE("inline", 1),
        TOP("top", 2);
        

        /* renamed from: b */
        public String f69912b;

        /* renamed from: c */
        public int f69913c;

        /* renamed from: g */
        public static EnumC17367c f69910g = BOTTOM;

        EnumC17367c(String str, int i) {
            this.f69912b = str;
            this.f69913c = i;
        }

        /* renamed from: b */
        public static EnumC17367c m52098b(int i) {
            EnumC17367c[] values;
            for (EnumC17367c enumC17367c : values()) {
                if (enumC17367c.m52097c() == i) {
                    return enumC17367c;
                }
            }
            return null;
        }

        /* renamed from: c */
        public final int m52097c() {
            return this.f69913c;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f69912b;
        }
    }

    @Deprecated
    /* renamed from: com.facebook.share.widget.LikeView$d */
    /* loaded from: classes5.dex */
    public enum EnumC17368d {
        CENTER("center", 0),
        LEFT("left", 1),
        RIGHT("right", 2);
        

        /* renamed from: b */
        public String f69919b;

        /* renamed from: c */
        public int f69920c;

        /* renamed from: g */
        public static EnumC17368d f69917g = CENTER;

        EnumC17368d(String str, int i) {
            this.f69919b = str;
            this.f69920c = i;
        }

        /* renamed from: b */
        public static EnumC17368d m52095b(int i) {
            EnumC17368d[] values;
            for (EnumC17368d enumC17368d : values()) {
                if (enumC17368d.m52094c() == i) {
                    return enumC17368d;
                }
            }
            return null;
        }

        /* renamed from: c */
        public final int m52094c() {
            return this.f69920c;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f69919b;
        }
    }

    /* renamed from: com.facebook.share.widget.LikeView$e */
    /* loaded from: classes5.dex */
    public class C17369e implements C17296a.InterfaceC17312m {

        /* renamed from: a */
        public boolean f69921a;

        public C17369e() {
        }

        @Override // com.facebook.share.internal.C17296a.InterfaceC17312m
        /* renamed from: a */
        public void mo52093a(C17296a c17296a, FacebookException facebookException) {
            if (this.f69921a) {
                return;
            }
            if (c17296a != null) {
                if (!c17296a.m52331k0()) {
                    facebookException = new FacebookException("Cannot use LikeView. The device may not be supported.");
                }
                LikeView.this.m52113i(c17296a);
                LikeView.this.m52100v();
            }
            if (facebookException != null) {
                LikeView.this.getClass();
            }
            LikeView.this.f69896j = null;
        }

        /* renamed from: b */
        public void m52092b() {
            this.f69921a = true;
        }

        public /* synthetic */ C17369e(LikeView likeView, View$OnClickListenerC17365a view$OnClickListenerC17365a) {
            this();
        }
    }

    /* renamed from: com.facebook.share.widget.LikeView$f */
    /* loaded from: classes5.dex */
    public class C17370f extends BroadcastReceiver {
        public C17370f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Bundle extras = intent.getExtras();
            boolean z = true;
            if (extras != null) {
                String string = extras.getString("com.facebook.sdk.LikeActionController.OBJECT_ID");
                if (!C52364yi6.m2860R(string) && !C52364yi6.m2851a(LikeView.this.f69888b, string)) {
                    z = false;
                }
            }
            if (!z) {
                return;
            }
            if ("com.facebook.sdk.LikeActionController.UPDATED".equals(action)) {
                LikeView.this.m52100v();
            } else if ("com.facebook.sdk.LikeActionController.DID_ERROR".equals(action)) {
                LikeView.this.getClass();
            } else if ("com.facebook.sdk.LikeActionController.DID_RESET".equals(action)) {
                LikeView likeView = LikeView.this;
                likeView.m52105q(likeView.f69888b, LikeView.this.f69889c);
                LikeView.this.m52100v();
            }
        }

        public /* synthetic */ C17370f(LikeView likeView, View$OnClickListenerC17365a view$OnClickListenerC17365a) {
            this();
        }
    }

    @Deprecated
    /* renamed from: com.facebook.share.widget.LikeView$g */
    /* loaded from: classes5.dex */
    public enum EnumC17371g {
        UNKNOWN("unknown", 0),
        OPEN_GRAPH("open_graph", 1),
        PAGE("page", 2);
        

        /* renamed from: b */
        public String f69929b;

        /* renamed from: c */
        public int f69930c;

        /* renamed from: g */
        public static EnumC17371g f69927g = UNKNOWN;

        EnumC17371g(String str, int i) {
            this.f69929b = str;
            this.f69930c = i;
        }

        /* renamed from: a */
        public static EnumC17371g m52091a(int i) {
            EnumC17371g[] values;
            for (EnumC17371g enumC17371g : values()) {
                if (enumC17371g.m52090b() == i) {
                    return enumC17371g;
                }
            }
            return null;
        }

        /* renamed from: b */
        public int m52090b() {
            return this.f69930c;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f69929b;
        }
    }

    /* renamed from: com.facebook.share.widget.LikeView$h */
    /* loaded from: classes5.dex */
    public interface InterfaceC17372h {
    }

    @Deprecated
    /* renamed from: com.facebook.share.widget.LikeView$i */
    /* loaded from: classes5.dex */
    public enum EnumC17373i {
        STANDARD("standard", 0),
        BUTTON("button", 1),
        BOX_COUNT("box_count", 2);
        

        /* renamed from: b */
        public String f69936b;

        /* renamed from: c */
        public int f69937c;

        /* renamed from: g */
        public static EnumC17373i f69934g = STANDARD;

        EnumC17373i(String str, int i) {
            this.f69936b = str;
            this.f69937c = i;
        }

        /* renamed from: b */
        public static EnumC17373i m52088b(int i) {
            EnumC17373i[] values;
            for (EnumC17373i enumC17373i : values()) {
                if (enumC17373i.m52087c() == i) {
                    return enumC17373i;
                }
            }
            return null;
        }

        /* renamed from: c */
        public final int m52087c() {
            return this.f69937c;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f69936b;
        }
    }

    @Deprecated
    public LikeView(Context context) {
        super(context);
        this.f69897k = EnumC17373i.f69934g;
        this.f69898l = EnumC17368d.f69917g;
        this.f69899m = EnumC17367c.f69910g;
        this.f69900n = -1;
        this.f69904r = true;
        m52110l(context);
    }

    /* renamed from: i */
    public final void m52113i(C17296a c17296a) {
        this.f69894h = c17296a;
        this.f69895i = new C17370f(this, null);
        C34603Mu2 m94592b = C34603Mu2.m94592b(getContext());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.LikeActionController.UPDATED");
        intentFilter.addAction("com.facebook.sdk.LikeActionController.DID_ERROR");
        intentFilter.addAction("com.facebook.sdk.LikeActionController.DID_RESET");
        m94592b.m94591c(this.f69895i, intentFilter);
    }

    /* renamed from: j */
    public final Activity m52112j() {
        boolean z;
        Context context = getContext();
        while (true) {
            z = context instanceof Activity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (z) {
            return (Activity) context;
        }
        throw new FacebookException("Unable to get Activity.");
    }

    /* renamed from: k */
    public final Bundle m52111k() {
        Bundle bundle = new Bundle();
        bundle.putString("style", this.f69897k.toString());
        bundle.putString("auxiliary_position", this.f69899m.toString());
        bundle.putString("horizontal_alignment", this.f69898l.toString());
        bundle.putString("object_id", C52364yi6.m2837h(this.f69888b, ""));
        bundle.putString("object_type", this.f69889c.toString());
        return bundle;
    }

    /* renamed from: l */
    public final void m52110l(Context context) {
        this.f69901o = getResources().getDimensionPixelSize(C34470Mf4.com_facebook_likeview_edge_padding);
        this.f69902p = getResources().getDimensionPixelSize(C34470Mf4.com_facebook_likeview_internal_padding);
        if (this.f69900n == -1) {
            this.f69900n = getResources().getColor(C33300Hf4.com_facebook_likeview_text_color);
        }
        setBackgroundColor(0);
        this.f69890d = new LinearLayout(context);
        this.f69890d.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        m52109m(context);
        m52107o(context);
        m52108n(context);
        this.f69890d.addView(this.f69891e);
        this.f69890d.addView(this.f69893g);
        this.f69890d.addView(this.f69892f);
        addView(this.f69890d);
        m52105q(this.f69888b, this.f69889c);
        m52100v();
    }

    /* renamed from: m */
    public final void m52109m(Context context) {
        boolean z;
        C17296a c17296a = this.f69894h;
        if (c17296a != null && c17296a.m52360S()) {
            z = true;
        } else {
            z = false;
        }
        LikeButton likeButton = new LikeButton(context, z);
        this.f69891e = likeButton;
        likeButton.setOnClickListener(new View$OnClickListenerC17365a());
        this.f69891e.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    }

    /* renamed from: n */
    public final void m52108n(Context context) {
        this.f69892f = new LikeBoxCountView(context);
        this.f69892f.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    }

    /* renamed from: o */
    public final void m52107o(Context context) {
        TextView textView = new TextView(context);
        this.f69893g = textView;
        textView.setTextSize(0, getResources().getDimension(C34470Mf4.com_facebook_likeview_text_size));
        this.f69893g.setMaxLines(2);
        this.f69893g.setTextColor(this.f69900n);
        this.f69893g.setGravity(17);
        this.f69893g.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        setObjectIdAndType(null, EnumC17371g.UNKNOWN);
        super.onDetachedFromWindow();
    }

    /* renamed from: p */
    public final void m52106p(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        if (attributeSet == null || getContext() == null || (obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C35460Ql4.com_facebook_like_view)) == null) {
            return;
        }
        this.f69888b = C52364yi6.m2837h(obtainStyledAttributes.getString(C35460Ql4.com_facebook_like_view_com_facebook_object_id), null);
        this.f69889c = EnumC17371g.m52091a(obtainStyledAttributes.getInt(C35460Ql4.com_facebook_like_view_com_facebook_object_type, EnumC17371g.f69927g.m52090b()));
        EnumC17373i m52088b = EnumC17373i.m52088b(obtainStyledAttributes.getInt(C35460Ql4.com_facebook_like_view_com_facebook_style, EnumC17373i.f69934g.m52087c()));
        this.f69897k = m52088b;
        if (m52088b != null) {
            EnumC17367c m52098b = EnumC17367c.m52098b(obtainStyledAttributes.getInt(C35460Ql4.com_facebook_like_view_com_facebook_auxiliary_view_position, EnumC17367c.f69910g.m52097c()));
            this.f69899m = m52098b;
            if (m52098b != null) {
                EnumC17368d m52095b = EnumC17368d.m52095b(obtainStyledAttributes.getInt(C35460Ql4.com_facebook_like_view_com_facebook_horizontal_alignment, EnumC17368d.f69917g.m52094c()));
                this.f69898l = m52095b;
                if (m52095b != null) {
                    this.f69900n = obtainStyledAttributes.getColor(C35460Ql4.com_facebook_like_view_com_facebook_foreground_color, -1);
                    obtainStyledAttributes.recycle();
                    return;
                }
                throw new IllegalArgumentException("Unsupported value for LikeView 'horizontal_alignment'");
            }
            throw new IllegalArgumentException("Unsupported value for LikeView 'auxiliary_view_position'");
        }
        throw new IllegalArgumentException("Unsupported value for LikeView 'style'");
    }

    /* renamed from: q */
    public final void m52105q(String str, EnumC17371g enumC17371g) {
        m52104r();
        this.f69888b = str;
        this.f69889c = enumC17371g;
        if (C52364yi6.m2860R(str)) {
            return;
        }
        this.f69896j = new C17369e(this, null);
        if (!isInEditMode()) {
            C17296a.m52366M(str, enumC17371g, this.f69896j);
        }
    }

    /* renamed from: r */
    public final void m52104r() {
        if (this.f69895i != null) {
            C34603Mu2.m94592b(getContext()).m94589e(this.f69895i);
            this.f69895i = null;
        }
        C17369e c17369e = this.f69896j;
        if (c17369e != null) {
            c17369e.m52092b();
            this.f69896j = null;
        }
        this.f69894h = null;
    }

    /* renamed from: s */
    public final void m52103s() {
        Activity activity;
        if (this.f69894h != null) {
            if (this.f69903q == null) {
                activity = m52112j();
            } else {
                activity = null;
            }
            this.f69894h.m52327m0(activity, this.f69903q, m52111k());
        }
    }

    @Deprecated
    public void setAuxiliaryViewPosition(EnumC17367c enumC17367c) {
        if (enumC17367c == null) {
            enumC17367c = EnumC17367c.f69910g;
        }
        if (this.f69899m != enumC17367c) {
            this.f69899m = enumC17367c;
            m52101u();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void setEnabled(boolean z) {
        this.f69904r = true;
        m52100v();
    }

    @Deprecated
    public void setForegroundColor(int i) {
        if (this.f69900n != i) {
            this.f69893g.setTextColor(i);
        }
    }

    @Deprecated
    public void setFragment(Fragment fragment) {
        this.f69903q = new C33702Iy1(fragment);
    }

    @Deprecated
    public void setHorizontalAlignment(EnumC17368d enumC17368d) {
        if (enumC17368d == null) {
            enumC17368d = EnumC17368d.f69917g;
        }
        if (this.f69898l != enumC17368d) {
            this.f69898l = enumC17368d;
            m52101u();
        }
    }

    @Deprecated
    public void setLikeViewStyle(EnumC17373i enumC17373i) {
        if (enumC17373i == null) {
            enumC17373i = EnumC17373i.f69934g;
        }
        if (this.f69897k != enumC17373i) {
            this.f69897k = enumC17373i;
            m52101u();
        }
    }

    @Deprecated
    public void setObjectIdAndType(String str, EnumC17371g enumC17371g) {
        String m2837h = C52364yi6.m2837h(str, null);
        if (enumC17371g == null) {
            enumC17371g = EnumC17371g.f69927g;
        }
        if (!C52364yi6.m2851a(m2837h, this.f69888b) || enumC17371g != this.f69889c) {
            m52105q(m2837h, enumC17371g);
            m52100v();
        }
    }

    @Deprecated
    public void setOnErrorListener(InterfaceC17372h interfaceC17372h) {
    }

    /* renamed from: t */
    public final void m52102t() {
        LikeBoxCountView.EnumC17292b enumC17292b;
        int i = C17366b.f69906a[this.f69899m.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    LikeBoxCountView likeBoxCountView = this.f69892f;
                    if (this.f69898l == EnumC17368d.RIGHT) {
                        enumC17292b = LikeBoxCountView.EnumC17292b.RIGHT;
                    } else {
                        enumC17292b = LikeBoxCountView.EnumC17292b.LEFT;
                    }
                    likeBoxCountView.setCaretPosition(enumC17292b);
                    return;
                }
                return;
            }
            this.f69892f.setCaretPosition(LikeBoxCountView.EnumC17292b.TOP);
            return;
        }
        this.f69892f.setCaretPosition(LikeBoxCountView.EnumC17292b.BOTTOM);
    }

    /* renamed from: u */
    public final void m52101u() {
        int i;
        C17296a c17296a;
        View view;
        C17296a c17296a2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f69890d.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f69891e.getLayoutParams();
        EnumC17368d enumC17368d = this.f69898l;
        if (enumC17368d == EnumC17368d.LEFT) {
            i = 3;
        } else if (enumC17368d == EnumC17368d.CENTER) {
            i = 1;
        } else {
            i = 5;
        }
        layoutParams.gravity = i | 48;
        layoutParams2.gravity = i;
        this.f69893g.setVisibility(8);
        this.f69892f.setVisibility(8);
        if (this.f69897k == EnumC17373i.STANDARD && (c17296a2 = this.f69894h) != null && !C52364yi6.m2860R(c17296a2.m52362Q())) {
            view = this.f69893g;
        } else if (this.f69897k == EnumC17373i.BOX_COUNT && (c17296a = this.f69894h) != null && !C52364yi6.m2860R(c17296a.m52364O())) {
            m52102t();
            view = this.f69892f;
        } else {
            return;
        }
        int i2 = 0;
        view.setVisibility(0);
        ((LinearLayout.LayoutParams) view.getLayoutParams()).gravity = i;
        LinearLayout linearLayout = this.f69890d;
        EnumC17367c enumC17367c = this.f69899m;
        EnumC17367c enumC17367c2 = EnumC17367c.INLINE;
        if (enumC17367c != enumC17367c2) {
            i2 = 1;
        }
        linearLayout.setOrientation(i2);
        EnumC17367c enumC17367c3 = this.f69899m;
        if (enumC17367c3 != EnumC17367c.TOP && (enumC17367c3 != enumC17367c2 || this.f69898l != EnumC17368d.RIGHT)) {
            this.f69890d.removeView(view);
            this.f69890d.addView(view);
        } else {
            this.f69890d.removeView(this.f69891e);
            this.f69890d.addView(this.f69891e);
        }
        int i3 = C17366b.f69906a[this.f69899m.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    if (this.f69898l == EnumC17368d.RIGHT) {
                        int i4 = this.f69901o;
                        view.setPadding(i4, i4, this.f69902p, i4);
                        return;
                    }
                    int i5 = this.f69902p;
                    int i6 = this.f69901o;
                    view.setPadding(i5, i6, i6, i6);
                    return;
                }
                return;
            }
            int i7 = this.f69901o;
            view.setPadding(i7, this.f69902p, i7, i7);
            return;
        }
        int i8 = this.f69901o;
        view.setPadding(i8, i8, i8, this.f69902p);
    }

    /* renamed from: v */
    public final void m52100v() {
        boolean z = !this.f69904r;
        C17296a c17296a = this.f69894h;
        if (c17296a == null) {
            this.f69891e.setSelected(false);
            this.f69893g.setText((CharSequence) null);
            this.f69892f.setText(null);
        } else {
            this.f69891e.setSelected(c17296a.m52360S());
            this.f69893g.setText(this.f69894h.m52362Q());
            this.f69892f.setText(this.f69894h.m52364O());
            z &= this.f69894h.m52331k0();
        }
        super.setEnabled(z);
        this.f69891e.setEnabled(z);
        m52101u();
    }

    @Deprecated
    public void setFragment(android.app.Fragment fragment) {
        this.f69903q = new C33702Iy1(fragment);
    }

    @Deprecated
    public LikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69897k = EnumC17373i.f69934g;
        this.f69898l = EnumC17368d.f69917g;
        this.f69899m = EnumC17367c.f69910g;
        this.f69900n = -1;
        this.f69904r = true;
        m52106p(attributeSet);
        m52110l(context);
    }
}
