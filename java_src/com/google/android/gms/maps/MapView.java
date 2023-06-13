package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes6.dex */
public class MapView extends FrameLayout {

    /* renamed from: b */
    public final C38751bm7 f71382b;

    public MapView(Context context) {
        super(context);
        this.f71382b = new C38751bm7(this, context, null);
        setClickable(true);
    }

    /* renamed from: a */
    public void m50726a(InterfaceC36350Ug3 interfaceC36350Ug3) {
        Preconditions.checkMainThread("getMapAsync() must be called on the main thread");
        Preconditions.checkNotNull(interfaceC36350Ug3, "callback must not be null.");
        this.f71382b.m64030r(interfaceC36350Ug3);
    }

    /* renamed from: b */
    public void m50725b(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.f71382b.m30340c(bundle);
            if (this.f71382b.m30341b() == null) {
                AbstractC43376jZ0.m30332k(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: c */
    public void m50724c() {
        this.f71382b.m30339d();
    }

    /* renamed from: d */
    public void m50723d() {
        this.f71382b.m30338e();
    }

    /* renamed from: e */
    public void m50722e() {
        this.f71382b.m30337f();
    }

    /* renamed from: f */
    public void m50721f() {
        this.f71382b.m30336g();
    }

    /* renamed from: g */
    public void m50720g(Bundle bundle) {
        this.f71382b.m30335h(bundle);
    }

    /* renamed from: h */
    public void m50719h() {
        this.f71382b.m30334i();
    }

    /* renamed from: i */
    public void m50718i() {
        this.f71382b.m30333j();
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f71382b = new C38751bm7(this, context, GoogleMapOptions.m50753F(context, attributeSet));
        setClickable(true);
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f71382b = new C38751bm7(this, context, GoogleMapOptions.m50753F(context, attributeSet));
        setClickable(true);
    }
}
