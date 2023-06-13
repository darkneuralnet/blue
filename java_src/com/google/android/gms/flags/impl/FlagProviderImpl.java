package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
@DynamiteApi
/* loaded from: classes5.dex */
public class FlagProviderImpl extends AbstractBinderC47525qY7 {

    /* renamed from: a */
    public boolean f70360a = false;

    /* renamed from: b */
    public SharedPreferences f70361b;

    @Override // p000.InterfaceC43895kQ7
    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        if (!this.f70360a) {
            return z;
        }
        return NC7.m94194a(this.f70361b, str, Boolean.valueOf(z)).booleanValue();
    }

    @Override // p000.InterfaceC43895kQ7
    public int getIntFlagValue(String str, int i, int i2) {
        if (!this.f70360a) {
            return i;
        }
        return BY7.m113867a(this.f70361b, str, Integer.valueOf(i)).intValue();
    }

    @Override // p000.InterfaceC43895kQ7
    public long getLongFlagValue(String str, long j, int i) {
        if (!this.f70360a) {
            return j;
        }
        return C34465Me8.m95086a(this.f70361b, str, Long.valueOf(j)).longValue();
    }

    @Override // p000.InterfaceC43895kQ7
    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.f70360a) {
            return str2;
        }
        return C51290wt8.m6151a(this.f70361b, str, str2);
    }

    @Override // p000.InterfaceC43895kQ7
    public void init(WO1 wo1) {
        String str;
        Context context = (Context) BinderC36557Vd3.m79637d5(wo1);
        if (this.f70360a) {
            return;
        }
        try {
            this.f70361b = C40850fH8.m41613a(context.createPackageContext("com.google.android.gms", 0));
            this.f70360a = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str = "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf);
            } else {
                str = new String("Could not retrieve sdk flags, continuing with defaults: ");
            }
            Log.w("FlagProviderImpl", str);
        }
    }
}
