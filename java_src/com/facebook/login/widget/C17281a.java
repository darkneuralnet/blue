package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.ref.WeakReference;
/* renamed from: com.facebook.login.widget.a */
/* loaded from: classes5.dex */
public class C17281a {

    /* renamed from: a */
    public final String f69632a;

    /* renamed from: b */
    public final WeakReference<View> f69633b;

    /* renamed from: c */
    public final Context f69634c;

    /* renamed from: d */
    public C17285d f69635d;

    /* renamed from: e */
    public PopupWindow f69636e;

    /* renamed from: f */
    public EnumC17286e f69637f = EnumC17286e.BLUE;

    /* renamed from: g */
    public long f69638g = 6000;

    /* renamed from: h */
    public final ViewTreeObserver.OnScrollChangedListener f69639h = new ViewTreeObserver$OnScrollChangedListenerC17282a();

    /* renamed from: com.facebook.login.widget.a$a */
    /* loaded from: classes5.dex */
    public class ViewTreeObserver$OnScrollChangedListenerC17282a implements ViewTreeObserver.OnScrollChangedListener {
        public ViewTreeObserver$OnScrollChangedListenerC17282a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            if (C17281a.m52435a(C17281a.this).get() != null && C17281a.m52434b(C17281a.this) != null && C17281a.m52434b(C17281a.this).isShowing()) {
                if (C17281a.m52434b(C17281a.this).isAboveAnchor()) {
                    C17281a.m52433c(C17281a.this).m52420f();
                } else {
                    C17281a.m52433c(C17281a.this).m52419g();
                }
            }
        }
    }

    /* renamed from: com.facebook.login.widget.a$b */
    /* loaded from: classes5.dex */
    public class RunnableC17283b implements Runnable {
        public RunnableC17283b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                C17281a.this.m52432d();
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: com.facebook.login.widget.a$c */
    /* loaded from: classes5.dex */
    public class View$OnClickListenerC17284c implements View.OnClickListener {
        public View$OnClickListenerC17284c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                C17281a.this.m52432d();
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: com.facebook.login.widget.a$d */
    /* loaded from: classes5.dex */
    public class C17285d extends FrameLayout {

        /* renamed from: b */
        public ImageView f69643b;

        /* renamed from: c */
        public ImageView f69644c;

        /* renamed from: d */
        public View f69645d;

        /* renamed from: e */
        public ImageView f69646e;

        public C17285d(Context context) {
            super(context);
            m52421e();
        }

        /* renamed from: e */
        public final void m52421e() {
            LayoutInflater.from(getContext()).inflate(C50011uk4.com_facebook_tooltip_bubble, this);
            this.f69643b = (ImageView) findViewById(C33561Ii4.com_facebook_tooltip_bubble_view_top_pointer);
            this.f69644c = (ImageView) findViewById(C33561Ii4.com_facebook_tooltip_bubble_view_bottom_pointer);
            this.f69645d = findViewById(C33561Ii4.com_facebook_body_frame);
            this.f69646e = (ImageView) findViewById(C33561Ii4.com_facebook_button_xout);
        }

        /* renamed from: f */
        public void m52420f() {
            this.f69643b.setVisibility(4);
            this.f69644c.setVisibility(0);
        }

        /* renamed from: g */
        public void m52419g() {
            this.f69643b.setVisibility(0);
            this.f69644c.setVisibility(4);
        }
    }

    /* renamed from: com.facebook.login.widget.a$e */
    /* loaded from: classes5.dex */
    public enum EnumC17286e {
        BLUE,
        BLACK
    }

    public C17281a(String str, View view) {
        this.f69632a = str;
        this.f69633b = new WeakReference<>(view);
        this.f69634c = view.getContext();
    }

    /* renamed from: a */
    public static /* synthetic */ WeakReference m52435a(C17281a c17281a) {
        if (TD0.m84203d(C17281a.class)) {
            return null;
        }
        try {
            return c17281a.f69633b;
        } catch (Throwable th) {
            TD0.m84205b(th, C17281a.class);
            return null;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ PopupWindow m52434b(C17281a c17281a) {
        if (TD0.m84203d(C17281a.class)) {
            return null;
        }
        try {
            return c17281a.f69636e;
        } catch (Throwable th) {
            TD0.m84205b(th, C17281a.class);
            return null;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ C17285d m52433c(C17281a c17281a) {
        if (TD0.m84203d(C17281a.class)) {
            return null;
        }
        try {
            return c17281a.f69635d;
        } catch (Throwable th) {
            TD0.m84205b(th, C17281a.class);
            return null;
        }
    }

    /* renamed from: d */
    public void m52432d() {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            m52427i();
            PopupWindow popupWindow = this.f69636e;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: e */
    public final void m52431e() {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            m52427i();
            if (this.f69633b.get() != null) {
                this.f69633b.get().getViewTreeObserver().addOnScrollChangedListener(this.f69639h);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: f */
    public void m52430f(long j) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            this.f69638g = j;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: g */
    public void m52429g(EnumC17286e enumC17286e) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            this.f69637f = enumC17286e;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: h */
    public void m52428h() {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            if (this.f69633b.get() != null) {
                C17285d c17285d = new C17285d(this.f69634c);
                this.f69635d = c17285d;
                ((TextView) c17285d.findViewById(C33561Ii4.com_facebook_tooltip_bubble_view_text_body)).setText(this.f69632a);
                if (this.f69637f == EnumC17286e.BLUE) {
                    this.f69635d.f69645d.setBackgroundResource(C51156wg4.com_facebook_tooltip_blue_background);
                    this.f69635d.f69644c.setImageResource(C51156wg4.com_facebook_tooltip_blue_bottomnub);
                    this.f69635d.f69643b.setImageResource(C51156wg4.com_facebook_tooltip_blue_topnub);
                    this.f69635d.f69646e.setImageResource(C51156wg4.com_facebook_tooltip_blue_xout);
                } else {
                    this.f69635d.f69645d.setBackgroundResource(C51156wg4.com_facebook_tooltip_black_background);
                    this.f69635d.f69644c.setImageResource(C51156wg4.com_facebook_tooltip_black_bottomnub);
                    this.f69635d.f69643b.setImageResource(C51156wg4.com_facebook_tooltip_black_topnub);
                    this.f69635d.f69646e.setImageResource(C51156wg4.com_facebook_tooltip_black_xout);
                }
                View decorView = ((Activity) this.f69634c).getWindow().getDecorView();
                int width = decorView.getWidth();
                int height = decorView.getHeight();
                m52431e();
                this.f69635d.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                C17285d c17285d2 = this.f69635d;
                PopupWindow popupWindow = new PopupWindow(c17285d2, c17285d2.getMeasuredWidth(), this.f69635d.getMeasuredHeight());
                this.f69636e = popupWindow;
                popupWindow.showAsDropDown(this.f69633b.get());
                m52426j();
                if (this.f69638g > 0) {
                    this.f69635d.postDelayed(new RunnableC17283b(), this.f69638g);
                }
                this.f69636e.setTouchable(true);
                this.f69635d.setOnClickListener(new View$OnClickListenerC17284c());
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: i */
    public final void m52427i() {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            if (this.f69633b.get() != null) {
                this.f69633b.get().getViewTreeObserver().removeOnScrollChangedListener(this.f69639h);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: j */
    public final void m52426j() {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            PopupWindow popupWindow = this.f69636e;
            if (popupWindow != null && popupWindow.isShowing()) {
                if (this.f69636e.isAboveAnchor()) {
                    this.f69635d.m52420f();
                } else {
                    this.f69635d.m52419g();
                }
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }
}
