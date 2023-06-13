package com.facebook.login;

import android.net.Uri;
import com.facebook.login.LoginClient;
import java.util.Collection;
/* renamed from: com.facebook.login.a */
/* loaded from: classes5.dex */
public class C17257a extends C17263d {

    /* renamed from: k */
    public static volatile C17257a f69559k;

    /* renamed from: i */
    public Uri f69560i;

    /* renamed from: j */
    public String f69561j;

    /* renamed from: x */
    public static C17257a m52532x() {
        if (TD0.m84203d(C17257a.class)) {
            return null;
        }
        try {
            if (f69559k == null) {
                synchronized (C17257a.class) {
                    if (f69559k == null) {
                        f69559k = new C17257a();
                    }
                }
            }
            return f69559k;
        } catch (Throwable th) {
            TD0.m84205b(th, C17257a.class);
            return null;
        }
    }

    @Override // com.facebook.login.C17263d
    /* renamed from: a */
    public LoginClient.Request mo52510a(Collection<String> collection) {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            LoginClient.Request mo52510a = super.mo52510a(collection);
            Uri m52533w = m52533w();
            if (m52533w != null) {
                mo52510a.m52585o(m52533w.toString());
            }
            String m52534v = m52534v();
            if (m52534v != null) {
                mo52510a.m52586n(m52534v);
            }
            return mo52510a;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: v */
    public String m52534v() {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            return this.f69561j;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: w */
    public Uri m52533w() {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            return this.f69560i;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: y */
    public void m52531y(Uri uri) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            this.f69560i = uri;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }
}
