package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
/* renamed from: xq2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51847xq2 extends AbstractC43395jb0 {

    /* renamed from: B */
    public LifecycleOwner f118223B;

    public C51847xq2(Context context) {
        super(context);
    }

    @Override // p000.AbstractC43395jb0
    /* renamed from: J */
    public InterfaceC45757na0 mo4567J() {
        if (this.f118223B == null) {
            Log.d("CamLifecycleController", "Lifecycle is not set.");
            return null;
        } else if (this.f92980l == null) {
            Log.d("CamLifecycleController", "CameraProvider is not ready.");
            return null;
        } else {
            C37280Yf6 m30243g = m30243g();
            if (m30243g == null) {
                return null;
            }
            try {
                return this.f92980l.mo16477d(this.f118223B, this.f92969a, m30243g);
            } catch (IllegalArgumentException e) {
                throw new IllegalStateException("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: T */
    public void m4566T(LifecycleOwner lifecycleOwner) {
        O36.m92961a();
        this.f118223B = lifecycleOwner;
        m30258K();
    }

    /* renamed from: U */
    public void m4565U() {
        O36.m92961a();
        this.f118223B = null;
        this.f92979k = null;
        InterfaceC47266q64 interfaceC47266q64 = this.f92980l;
        if (interfaceC47266q64 != null) {
            interfaceC47266q64.mo16478c();
        }
    }
}
