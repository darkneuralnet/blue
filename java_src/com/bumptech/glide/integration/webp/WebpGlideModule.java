package com.bumptech.glide.integration.webp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.C17098b;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.bumptech.glide.Registry;
import java.io.InputStream;
import java.nio.ByteBuffer;
@Deprecated
/* loaded from: classes5.dex */
public class WebpGlideModule implements LC1 {
    @Override // p000.InterfaceC26212mm
    /* renamed from: a */
    public void mo25040a(Context context, C17098b c17098b) {
    }

    @Override // p000.InterfaceC34362Lt4
    /* renamed from: b */
    public void mo16929b(Context context, ComponentCallbacks2C17096a componentCallbacks2C17096a, Registry registry) {
        Resources resources = context.getResources();
        InterfaceC20044eU m53152f = componentCallbacks2C17096a.m53152f();
        InterfaceC28820to m53153e = componentCallbacks2C17096a.m53153e();
        FA6 fa6 = new FA6(registry.m53172g(), resources.getDisplayMetrics(), m53152f, m53153e);
        C8708Ve c8708Ve = new C8708Ve(m53153e, m53152f);
        C52607z70 c52607z70 = new C52607z70(fa6);
        C46274oR5 c46274oR5 = new C46274oR5(fa6, m53153e);
        F70 f70 = new F70(context, m53153e, m53152f);
        registry.m53162q("Bitmap", ByteBuffer.class, Bitmap.class, c52607z70).m53162q("Bitmap", InputStream.class, Bitmap.class, c46274oR5).m53162q("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C7175RT(resources, c52607z70)).m53162q("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C7175RT(resources, c46274oR5)).m53162q("Bitmap", ByteBuffer.class, Bitmap.class, new C50235v70(c8708Ve)).m53162q("Bitmap", InputStream.class, Bitmap.class, new C44495lR5(c8708Ve)).m53163p(ByteBuffer.class, GA6.class, f70).m53163p(InputStream.class, GA6.class, new FR5(f70, m53153e)).m53164o(GA6.class, new HA6());
    }
}
