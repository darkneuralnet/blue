package com.facebook;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
/* loaded from: classes5.dex */
public abstract class FacebookButtonBase extends Button {

    /* renamed from: b */
    public String f69343b;

    /* renamed from: c */
    public String f69344c;

    /* renamed from: d */
    public View.OnClickListener f69345d;

    /* renamed from: e */
    public View.OnClickListener f69346e;

    /* renamed from: f */
    public boolean f69347f;

    /* renamed from: g */
    public int f69348g;

    /* renamed from: h */
    public int f69349h;

    /* renamed from: i */
    public C33702Iy1 f69350i;

    /* renamed from: com.facebook.FacebookButtonBase$a */
    /* loaded from: classes5.dex */
    public class View$OnClickListenerC17191a implements View.OnClickListener {
        public View$OnClickListenerC17191a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                FacebookButtonBase facebookButtonBase = FacebookButtonBase.this;
                FacebookButtonBase.m52887a(facebookButtonBase, facebookButtonBase.getContext());
                if (FacebookButtonBase.m52886b(FacebookButtonBase.this) != null) {
                    FacebookButtonBase.m52886b(FacebookButtonBase.this).onClick(view);
                } else if (FacebookButtonBase.m52885c(FacebookButtonBase.this) != null) {
                    FacebookButtonBase.m52885c(FacebookButtonBase.this).onClick(view);
                }
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    public FacebookButtonBase(Context context, AttributeSet attributeSet, int i, int i2, String str, String str2) {
        super(context, attributeSet, 0);
        i2 = i2 == 0 ? mo52085h() : i2;
        mo52084e(context, attributeSet, i, i2 == 0 ? C32886Fl4.com_facebook_button : i2);
        this.f69343b = str;
        this.f69344c = str2;
        setClickable(true);
        setFocusable(true);
    }

    /* renamed from: a */
    public static /* synthetic */ void m52887a(FacebookButtonBase facebookButtonBase, Context context) {
        if (TD0.m84203d(FacebookButtonBase.class)) {
            return;
        }
        try {
            facebookButtonBase.m52879l(context);
        } catch (Throwable th) {
            TD0.m84205b(th, FacebookButtonBase.class);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ View.OnClickListener m52886b(FacebookButtonBase facebookButtonBase) {
        if (TD0.m84203d(FacebookButtonBase.class)) {
            return null;
        }
        try {
            return facebookButtonBase.f69346e;
        } catch (Throwable th) {
            TD0.m84205b(th, FacebookButtonBase.class);
            return null;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ View.OnClickListener m52885c(FacebookButtonBase facebookButtonBase) {
        if (TD0.m84203d(FacebookButtonBase.class)) {
            return null;
        }
        try {
            return facebookButtonBase.f69345d;
        } catch (Throwable th) {
            TD0.m84205b(th, FacebookButtonBase.class);
            return null;
        }
    }

    /* renamed from: d */
    public void m52884d(View view) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            View.OnClickListener onClickListener = this.f69345d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: e */
    public void mo52084e(Context context, AttributeSet attributeSet, int i, int i2) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            m52877n(context, attributeSet, i, i2);
            m52876o(context, attributeSet, i, i2);
            m52875p(context, attributeSet, i, i2);
            m52874q(context, attributeSet, i, i2);
            m52872s();
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: f */
    public Activity m52883f() {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            Context context = getContext();
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            throw new FacebookException("Unable to get Activity.");
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: g */
    public abstract int mo52086g();

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (TD0.m84203d(this)) {
            return 0;
        }
        try {
            if (this.f69347f) {
                return this.f69348g;
            }
            return super.getCompoundPaddingLeft();
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return 0;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        if (TD0.m84203d(this)) {
            return 0;
        }
        try {
            if (this.f69347f) {
                return this.f69349h;
            }
            return super.getCompoundPaddingRight();
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return 0;
        }
    }

    /* renamed from: h */
    public int mo52085h() {
        TD0.m84203d(this);
        return 0;
    }

    /* renamed from: i */
    public Fragment m52882i() {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            C33702Iy1 c33702Iy1 = this.f69350i;
            if (c33702Iy1 == null) {
                return null;
            }
            return c33702Iy1.m101438c();
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: j */
    public android.app.Fragment m52881j() {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            C33702Iy1 c33702Iy1 = this.f69350i;
            if (c33702Iy1 == null) {
                return null;
            }
            return c33702Iy1.m101439b();
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: k */
    public final void m52880k(Context context) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            new C45485n62(context).m24339g(this.f69343b);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: l */
    public final void m52879l(Context context) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            new C45485n62(context).m24339g(this.f69344c);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: m */
    public int m52878m(String str) {
        if (TD0.m84203d(this)) {
            return 0;
        }
        try {
            return (int) Math.ceil(getPaint().measureText(str));
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return 0;
        }
    }

    /* renamed from: n */
    public final void m52877n(Context context, AttributeSet attributeSet, int i, int i2) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            if (isInEditMode()) {
                return;
            }
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842964}, i, i2);
            if (obtainStyledAttributes.hasValue(0)) {
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    setBackgroundResource(resourceId);
                } else {
                    setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
                }
            } else {
                setBackgroundColor(NA0.m94301c(context, C33300Hf4.com_facebook_blue));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    @SuppressLint({"ResourceType"})
    /* renamed from: o */
    public final void m52876o(Context context, AttributeSet attributeSet, int i, int i2) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16843119, 16843117, 16843120, 16843118, 16843121}, i, i2);
            setCompoundDrawablesWithIntrinsicBounds(obtainStyledAttributes.getResourceId(0, 0), obtainStyledAttributes.getResourceId(1, 0), obtainStyledAttributes.getResourceId(2, 0), obtainStyledAttributes.getResourceId(3, 0));
            setCompoundDrawablePadding(obtainStyledAttributes.getDimensionPixelSize(4, 0));
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (!isInEditMode()) {
                m52880k(getContext());
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        boolean z;
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            if ((getGravity() & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int compoundPaddingLeft = getCompoundPaddingLeft();
                int compoundPaddingRight = getCompoundPaddingRight();
                int min = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - m52878m(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
                this.f69348g = compoundPaddingLeft - min;
                this.f69349h = compoundPaddingRight + min;
                this.f69347f = true;
            }
            super.onDraw(canvas);
            this.f69347f = false;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: p */
    public final void m52875p(Context context, AttributeSet attributeSet, int i, int i2) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842966, 16842967, 16842968, 16842969}, i, i2);
            setPadding(obtainStyledAttributes.getDimensionPixelSize(0, 0), obtainStyledAttributes.getDimensionPixelSize(1, 0), obtainStyledAttributes.getDimensionPixelSize(2, 0), obtainStyledAttributes.getDimensionPixelSize(3, 0));
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: q */
    public final void m52874q(Context context, AttributeSet attributeSet, int i, int i2) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842904}, i, i2);
            setTextColor(obtainStyledAttributes.getColorStateList(0));
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842927}, i, i2);
            setGravity(obtainStyledAttributes2.getInt(0, 17));
            obtainStyledAttributes2.recycle();
            TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842901, 16842903, 16843087}, i, i2);
            setTextSize(0, obtainStyledAttributes3.getDimensionPixelSize(0, 0));
            setTypeface(Typeface.defaultFromStyle(obtainStyledAttributes3.getInt(1, 1)));
            setText(obtainStyledAttributes3.getString(2));
            obtainStyledAttributes3.recycle();
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: r */
    public void m52873r(View.OnClickListener onClickListener) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            this.f69346e = onClickListener;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: s */
    public final void m52872s() {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            super.setOnClickListener(new View$OnClickListenerC17191a());
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    public void setFragment(Fragment fragment) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            this.f69350i = new C33702Iy1(fragment);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            this.f69345d = onClickListener;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    public void setFragment(android.app.Fragment fragment) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            this.f69350i = new C33702Iy1(fragment);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }
}
