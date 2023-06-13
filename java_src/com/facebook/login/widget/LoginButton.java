package com.facebook.login.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.C17216a;
import com.facebook.FacebookButtonBase;
import com.facebook.Profile;
import com.facebook.login.C17263d;
import com.facebook.login.widget.C17281a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes5.dex */
public class LoginButton extends FacebookButtonBase {

    /* renamed from: j */
    public boolean f69588j;

    /* renamed from: k */
    public String f69589k;

    /* renamed from: l */
    public String f69590l;

    /* renamed from: m */
    public C17275d f69591m;

    /* renamed from: n */
    public String f69592n;

    /* renamed from: o */
    public boolean f69593o;

    /* renamed from: p */
    public C17281a.EnumC17286e f69594p;

    /* renamed from: q */
    public EnumC17278f f69595q;

    /* renamed from: r */
    public long f69596r;

    /* renamed from: s */
    public C17281a f69597s;

    /* renamed from: t */
    public AbstractC3831J1 f69598t;

    /* renamed from: com.facebook.login.widget.LoginButton$a */
    /* loaded from: classes5.dex */
    public class RunnableC17271a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f69599b;

        /* renamed from: com.facebook.login.widget.LoginButton$a$a */
        /* loaded from: classes5.dex */
        public class RunnableC17272a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ C34512Mk1 f69601b;

            public RunnableC17272a(C34512Mk1 c34512Mk1) {
                this.f69601b = c34512Mk1;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (TD0.m84203d(this)) {
                    return;
                }
                try {
                    LoginButton.this.m52472N(this.f69601b);
                } catch (Throwable th) {
                    TD0.m84205b(th, this);
                }
            }
        }

        public RunnableC17271a(String str) {
            this.f69599b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                LoginButton.this.m52883f().runOnUiThread(new RunnableC17272a(C34746Nk1.m93517o(this.f69599b, false)));
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$b */
    /* loaded from: classes5.dex */
    public class C17273b extends AbstractC3831J1 {
        public C17273b() {
        }

        @Override // p000.AbstractC3831J1
        /* renamed from: d */
        public void mo52309d(AccessToken accessToken, AccessToken accessToken2) {
            LoginButton.this.m52473M();
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$c */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C17274c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f69604a;

        static {
            int[] iArr = new int[EnumC17278f.values().length];
            f69604a = iArr;
            try {
                iArr[EnumC17278f.AUTOMATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69604a[EnumC17278f.DISPLAY_ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69604a[EnumC17278f.NEVER_DISPLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$d */
    /* loaded from: classes5.dex */
    public static class C17275d {

        /* renamed from: a */
        public EnumC48093rW0 f69605a = EnumC48093rW0.FRIENDS;

        /* renamed from: b */
        public List<String> f69606b = Collections.emptyList();

        /* renamed from: c */
        public EnumC38273ay2 f69607c = EnumC38273ay2.NATIVE_WITH_FALLBACK;

        /* renamed from: d */
        public String f69608d = "rerequest";

        /* renamed from: e */
        public String f69609e;

        /* renamed from: f */
        public boolean f69610f;

        /* renamed from: b */
        public String m52463b() {
            return this.f69608d;
        }

        /* renamed from: c */
        public EnumC48093rW0 m52462c() {
            return this.f69605a;
        }

        /* renamed from: d */
        public EnumC38273ay2 m52461d() {
            return this.f69607c;
        }

        /* renamed from: e */
        public String m52460e() {
            return this.f69609e;
        }

        /* renamed from: f */
        public boolean m52459f() {
            return this.f69610f;
        }

        /* renamed from: g */
        public void m52458g(String str) {
            this.f69608d = str;
        }

        /* renamed from: h */
        public void m52457h(EnumC48093rW0 enumC48093rW0) {
            this.f69605a = enumC48093rW0;
        }

        /* renamed from: i */
        public void m52456i(EnumC38273ay2 enumC38273ay2) {
            this.f69607c = enumC38273ay2;
        }

        /* renamed from: j */
        public void m52455j(String str) {
            this.f69609e = str;
        }

        /* renamed from: k */
        public void m52454k(List<String> list) {
            this.f69606b = list;
        }

        /* renamed from: l */
        public void m52453l(boolean z) {
            this.f69610f = z;
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$e */
    /* loaded from: classes5.dex */
    public class View$OnClickListenerC17276e implements View.OnClickListener {

        /* renamed from: com.facebook.login.widget.LoginButton$e$a */
        /* loaded from: classes5.dex */
        public class DialogInterface$OnClickListenerC17277a implements DialogInterface.OnClickListener {

            /* renamed from: b */
            public final /* synthetic */ C17263d f69612b;

            public DialogInterface$OnClickListenerC17277a(C17263d c17263d) {
                this.f69612b = c17263d;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.f69612b.m52500k();
            }
        }

        public View$OnClickListenerC17276e() {
        }

        /* renamed from: a */
        public C17263d mo52452a() {
            if (TD0.m84203d(this)) {
                return null;
            }
            try {
                C17263d m52508c = C17263d.m52508c();
                m52508c.m52496o(LoginButton.this.m52480F());
                m52508c.m52494q(LoginButton.this.m52479G());
                m52508c.m52497n(LoginButton.this.m52481E());
                m52508c.m52493r(LoginButton.this.m52478H());
                m52508c.m52492s(LoginButton.this.m52476J());
                return m52508c;
            } catch (Throwable th) {
                TD0.m84205b(th, this);
                return null;
            }
        }

        /* renamed from: b */
        public void m52451b() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                C17263d mo52452a = mo52452a();
                if (LoginButton.this.m52882i() != null) {
                    mo52452a.m52501j(LoginButton.this.m52882i(), LoginButton.this.f69591m.f69606b);
                } else if (LoginButton.this.m52881j() != null) {
                    mo52452a.m52502i(LoginButton.this.m52881j(), LoginButton.this.f69591m.f69606b);
                } else {
                    mo52452a.m52503h(LoginButton.this.m52883f(), LoginButton.this.f69591m.f69606b);
                }
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }

        /* renamed from: c */
        public void m52450c(Context context) {
            String string;
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                C17263d mo52452a = mo52452a();
                if (LoginButton.this.f69588j) {
                    String string2 = LoginButton.this.getResources().getString(C39331cl4.com_facebook_loginview_log_out_action);
                    String string3 = LoginButton.this.getResources().getString(C39331cl4.com_facebook_loginview_cancel_action);
                    Profile m52762c = Profile.m52762c();
                    if (m52762c != null && m52762c.m52761d() != null) {
                        string = String.format(LoginButton.this.getResources().getString(C39331cl4.com_facebook_loginview_logged_in_as), m52762c.m52761d());
                    } else {
                        string = LoginButton.this.getResources().getString(C39331cl4.com_facebook_loginview_logged_in_using_facebook);
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(context);
                    builder.setMessage(string).setCancelable(true).setPositiveButton(string2, new DialogInterface$OnClickListenerC17277a(mo52452a)).setNegativeButton(string3, (DialogInterface.OnClickListener) null);
                    builder.create().show();
                    return;
                }
                mo52452a.m52500k();
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i;
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                LoginButton.this.m52884d(view);
                AccessToken m52920c = AccessToken.m52920c();
                if (AccessToken.m52909o()) {
                    m52450c(LoginButton.this.getContext());
                } else {
                    m52451b();
                }
                C45485n62 c45485n62 = new C45485n62(LoginButton.this.getContext());
                Bundle bundle = new Bundle();
                int i2 = 0;
                if (m52920c != null) {
                    i = 0;
                } else {
                    i = 1;
                }
                bundle.putInt("logging_in", i);
                if (AccessToken.m52909o()) {
                    i2 = 1;
                }
                bundle.putInt("access_token_expired", i2);
                c45485n62.m24338h(LoginButton.this.f69592n, bundle);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$f */
    /* loaded from: classes5.dex */
    public enum EnumC17278f {
        AUTOMATIC("automatic", 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);
        

        /* renamed from: b */
        public String f69619b;

        /* renamed from: c */
        public int f69620c;

        /* renamed from: g */
        public static EnumC17278f f69617g = AUTOMATIC;

        EnumC17278f(String str, int i) {
            this.f69619b = str;
            this.f69620c = i;
        }

        /* renamed from: a */
        public static EnumC17278f m52449a(int i) {
            EnumC17278f[] values;
            for (EnumC17278f enumC17278f : values()) {
                if (enumC17278f.m52448b() == i) {
                    return enumC17278f;
                }
            }
            return null;
        }

        /* renamed from: b */
        public int m52448b() {
            return this.f69620c;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f69619b;
        }
    }

    public LoginButton(Context context) {
        super(context, null, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
        this.f69591m = new C17275d();
        this.f69592n = "fb_login_view_usage";
        this.f69594p = C17281a.EnumC17286e.BLUE;
        this.f69596r = 6000L;
    }

    /* renamed from: B */
    public final void m52484B() {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            int i = C17274c.f69604a[this.f69595q.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    m52482D(getResources().getString(C39331cl4.com_facebook_tooltip_default));
                    return;
                }
                return;
            }
            C17216a.m52731o().execute(new RunnableC17271a(C52364yi6.m2801z(getContext())));
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: C */
    public void m52483C() {
        C17281a c17281a = this.f69597s;
        if (c17281a != null) {
            c17281a.m52432d();
            this.f69597s = null;
        }
    }

    /* renamed from: D */
    public final void m52482D(String str) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            C17281a c17281a = new C17281a(str, this);
            this.f69597s = c17281a;
            c17281a.m52429g(this.f69594p);
            this.f69597s.m52430f(this.f69596r);
            this.f69597s.m52428h();
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: E */
    public String m52481E() {
        return this.f69591m.m52463b();
    }

    /* renamed from: F */
    public EnumC48093rW0 m52480F() {
        return this.f69591m.m52462c();
    }

    /* renamed from: G */
    public EnumC38273ay2 m52479G() {
        return this.f69591m.m52461d();
    }

    /* renamed from: H */
    public String m52478H() {
        return this.f69591m.m52460e();
    }

    /* renamed from: I */
    public View$OnClickListenerC17276e mo52477I() {
        return new View$OnClickListenerC17276e();
    }

    /* renamed from: J */
    public boolean m52476J() {
        return this.f69591m.m52459f();
    }

    /* renamed from: K */
    public final int m52475K(String str) {
        if (TD0.m84203d(this)) {
            return 0;
        }
        try {
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + m52878m(str) + getCompoundPaddingRight();
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return 0;
        }
    }

    /* renamed from: L */
    public final void m52474L(Context context, AttributeSet attributeSet, int i, int i2) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            this.f69595q = EnumC17278f.f69617g;
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C35694Rl4.com_facebook_login_view, i, i2);
            this.f69588j = obtainStyledAttributes.getBoolean(C35694Rl4.com_facebook_login_view_com_facebook_confirm_logout, true);
            this.f69589k = obtainStyledAttributes.getString(C35694Rl4.com_facebook_login_view_com_facebook_login_text);
            this.f69590l = obtainStyledAttributes.getString(C35694Rl4.com_facebook_login_view_com_facebook_logout_text);
            this.f69595q = EnumC17278f.m52449a(obtainStyledAttributes.getInt(C35694Rl4.com_facebook_login_view_com_facebook_tooltip_mode, EnumC17278f.f69617g.m52448b()));
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: M */
    public final void m52473M() {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            Resources resources = getResources();
            if (!isInEditMode() && AccessToken.m52909o()) {
                String str = this.f69590l;
                if (str == null) {
                    str = resources.getString(C39331cl4.com_facebook_loginview_log_out_button);
                }
                setText(str);
                return;
            }
            String str2 = this.f69589k;
            if (str2 != null) {
                setText(str2);
                return;
            }
            String string = resources.getString(C39331cl4.com_facebook_loginview_log_in_button_continue);
            int width = getWidth();
            if (width != 0 && m52475K(string) > width) {
                string = resources.getString(C39331cl4.com_facebook_loginview_log_in_button);
            }
            setText(string);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: N */
    public final void m52472N(C34512Mk1 c34512Mk1) {
        if (!TD0.m84203d(this) && c34512Mk1 != null) {
            try {
                if (c34512Mk1.m94973i() && getVisibility() == 0) {
                    m52482D(c34512Mk1.m94974h());
                }
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    @Override // com.facebook.FacebookButtonBase
    /* renamed from: e */
    public void mo52084e(Context context, AttributeSet attributeSet, int i, int i2) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            super.mo52084e(context, attributeSet, i, i2);
            m52873r(mo52477I());
            m52474L(context, attributeSet, i, i2);
            if (isInEditMode()) {
                setBackgroundColor(getResources().getColor(C33300Hf4.com_facebook_blue));
                this.f69589k = "Continue with Facebook";
            } else {
                this.f69598t = new C17273b();
            }
            m52473M();
            setCompoundDrawablesWithIntrinsicBounds(C29611vi.m8248b(getContext(), C50563vg4.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    @Override // com.facebook.FacebookButtonBase
    /* renamed from: h */
    public int mo52085h() {
        return C33120Gl4.com_facebook_loginview_default_style;
    }

    @Override // com.facebook.FacebookButtonBase, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            AbstractC3831J1 abstractC3831J1 = this.f69598t;
            if (abstractC3831J1 != null && !abstractC3831J1.m101394c()) {
                this.f69598t.m101393e();
                m52473M();
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            super.onDetachedFromWindow();
            AbstractC3831J1 abstractC3831J1 = this.f69598t;
            if (abstractC3831J1 != null) {
                abstractC3831J1.m101392f();
            }
            m52483C();
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    @Override // com.facebook.FacebookButtonBase, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            super.onDraw(canvas);
            if (!this.f69593o && !isInEditMode()) {
                this.f69593o = true;
                m52484B();
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            super.onLayout(z, i, i2, i3, i4);
            m52473M();
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil(Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom))) + getCompoundPaddingBottom();
            Resources resources = getResources();
            String str = this.f69589k;
            if (str == null) {
                str = resources.getString(C39331cl4.com_facebook_loginview_log_in_button_continue);
                int m52475K = m52475K(str);
                if (View.resolveSize(m52475K, i) < m52475K) {
                    str = resources.getString(C39331cl4.com_facebook_loginview_log_in_button);
                }
            }
            int m52475K2 = m52475K(str);
            String str2 = this.f69590l;
            if (str2 == null) {
                str2 = resources.getString(C39331cl4.com_facebook_loginview_log_out_button);
            }
            setMeasuredDimension(View.resolveSize(Math.max(m52475K2, m52475K(str2)), i), compoundPaddingTop);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            super.onVisibilityChanged(view, i);
            if (i != 0) {
                m52483C();
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    public void setAuthType(String str) {
        this.f69591m.m52458g(str);
    }

    public void setDefaultAudience(EnumC48093rW0 enumC48093rW0) {
        this.f69591m.m52457h(enumC48093rW0);
    }

    public void setLoginBehavior(EnumC38273ay2 enumC38273ay2) {
        this.f69591m.m52456i(enumC38273ay2);
    }

    public void setLoginText(String str) {
        this.f69589k = str;
        m52473M();
    }

    public void setLogoutText(String str) {
        this.f69590l = str;
        m52473M();
    }

    public void setMessengerPageId(String str) {
        this.f69591m.m52455j(str);
    }

    public void setPermissions(List<String> list) {
        this.f69591m.m52454k(list);
    }

    public void setPublishPermissions(List<String> list) {
        this.f69591m.m52454k(list);
    }

    public void setReadPermissions(List<String> list) {
        this.f69591m.m52454k(list);
    }

    public void setResetMessengerState(boolean z) {
        this.f69591m.m52453l(z);
    }

    public void setToolTipDisplayTime(long j) {
        this.f69596r = j;
    }

    public void setToolTipMode(EnumC17278f enumC17278f) {
        this.f69595q = enumC17278f;
    }

    public void setToolTipStyle(C17281a.EnumC17286e enumC17286e) {
        this.f69594p = enumC17286e;
    }

    public void setPermissions(String... strArr) {
        this.f69591m.m52454k(Arrays.asList(strArr));
    }

    public void setPublishPermissions(String... strArr) {
        this.f69591m.m52454k(Arrays.asList(strArr));
    }

    public void setReadPermissions(String... strArr) {
        this.f69591m.m52454k(Arrays.asList(strArr));
    }

    public LoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
        this.f69591m = new C17275d();
        this.f69592n = "fb_login_view_usage";
        this.f69594p = C17281a.EnumC17286e.BLUE;
        this.f69596r = 6000L;
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, "fb_login_button_create", "fb_login_button_did_tap");
        this.f69591m = new C17275d();
        this.f69592n = "fb_login_view_usage";
        this.f69594p = C17281a.EnumC17286e.BLUE;
        this.f69596r = 6000L;
    }
}
