package com.facebook.login.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.login.C17257a;
import com.facebook.login.C17263d;
import com.facebook.login.widget.LoginButton;
/* loaded from: classes5.dex */
public class DeviceLoginButton extends LoginButton {

    /* renamed from: u */
    public Uri f69586u;

    /* renamed from: com.facebook.login.widget.DeviceLoginButton$b */
    /* loaded from: classes5.dex */
    public class C17270b extends LoginButton.View$OnClickListenerC17276e {
        public C17270b() {
            super();
        }

        @Override // com.facebook.login.widget.LoginButton.View$OnClickListenerC17276e
        /* renamed from: a */
        public C17263d mo52452a() {
            if (TD0.m84203d(this)) {
                return null;
            }
            try {
                C17257a m52532x = C17257a.m52532x();
                m52532x.m52496o(DeviceLoginButton.this.m52480F());
                m52532x.m52494q(EnumC38273ay2.DEVICE_AUTH);
                m52532x.m52531y(DeviceLoginButton.this.m52486O());
                return m52532x;
            } catch (Throwable th) {
                TD0.m84205b(th, this);
                return null;
            }
        }
    }

    public DeviceLoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.facebook.login.widget.LoginButton
    /* renamed from: I */
    public LoginButton.View$OnClickListenerC17276e mo52477I() {
        return new C17270b();
    }

    /* renamed from: O */
    public Uri m52486O() {
        return this.f69586u;
    }

    public void setDeviceRedirectUri(Uri uri) {
        this.f69586u = uri;
    }

    public DeviceLoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DeviceLoginButton(Context context) {
        super(context);
    }
}
