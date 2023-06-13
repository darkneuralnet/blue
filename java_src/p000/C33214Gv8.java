package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzcl;
@VisibleForTesting
/* renamed from: Gv8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33214Gv8 {

    /* renamed from: a */
    public final Context f12629a;

    /* renamed from: b */
    public String f12630b;

    /* renamed from: c */
    public String f12631c;

    /* renamed from: d */
    public String f12632d;

    /* renamed from: e */
    public Boolean f12633e;

    /* renamed from: f */
    public long f12634f;

    /* renamed from: g */
    public zzcl f12635g;

    /* renamed from: h */
    public boolean f12636h;

    /* renamed from: i */
    public final Long f12637i;

    /* renamed from: j */
    public String f12638j;

    @VisibleForTesting
    public C33214Gv8(Context context, zzcl zzclVar, Long l) {
        this.f12636h = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f12629a = applicationContext;
        this.f12637i = l;
        if (zzclVar != null) {
            this.f12635g = zzclVar;
            this.f12630b = zzclVar.f70571g;
            this.f12631c = zzclVar.f70570f;
            this.f12632d = zzclVar.f70569e;
            this.f12636h = zzclVar.f70568d;
            this.f12634f = zzclVar.f70567c;
            this.f12638j = zzclVar.f70573i;
            Bundle bundle = zzclVar.f70572h;
            if (bundle != null) {
                this.f12633e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
