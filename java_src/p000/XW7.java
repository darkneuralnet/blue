package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzcl;
/* renamed from: XW7 */
/* loaded from: classes5.dex */
public final class XW7 extends AbstractRunnableC46657p48 {

    /* renamed from: f */
    public final /* synthetic */ String f43351f;

    /* renamed from: g */
    public final /* synthetic */ String f43352g;

    /* renamed from: h */
    public final /* synthetic */ Context f43353h;

    /* renamed from: i */
    public final /* synthetic */ Bundle f43354i;

    /* renamed from: j */
    public final /* synthetic */ C52032y88 f43355j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XW7(C52032y88 c52032y88, String str, String str2, Context context, Bundle bundle) {
        super(c52032y88, true);
        this.f43355j = c52032y88;
        this.f43351f = str;
        this.f43352g = str2;
        this.f43353h = context;
        this.f43354i = bundle;
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: a */
    public final void mo4150a() {
        boolean m4053n;
        String str;
        String str2;
        String str3;
        InterfaceC45683nR7 interfaceC45683nR7;
        boolean z;
        InterfaceC45683nR7 interfaceC45683nR72;
        String str4;
        String str5;
        try {
            m4053n = this.f43355j.m4053n(this.f43351f, this.f43352g);
            if (m4053n) {
                String str6 = this.f43352g;
                String str7 = this.f43351f;
                str5 = this.f43355j.f118811a;
                str3 = str6;
                str2 = str7;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Preconditions.checkNotNull(this.f43353h);
            C52032y88 c52032y88 = this.f43355j;
            c52032y88.f118819i = c52032y88.m4048s(this.f43353h, true);
            interfaceC45683nR7 = this.f43355j.f118819i;
            if (interfaceC45683nR7 == null) {
                str4 = this.f43355j.f118811a;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int m51595a = DynamiteModule.m51595a(this.f43353h, ModuleDescriptor.MODULE_ID);
            int m51593c = DynamiteModule.m51593c(this.f43353h, ModuleDescriptor.MODULE_ID);
            int max = Math.max(m51595a, m51593c);
            if (m51593c < m51595a) {
                z = true;
            } else {
                z = false;
            }
            zzcl zzclVar = new zzcl(77000L, max, z, str, str2, str3, this.f43354i, C38742bl8.m64036a(this.f43353h));
            interfaceC45683nR72 = this.f43355j.f118819i;
            ((InterfaceC45683nR7) Preconditions.checkNotNull(interfaceC45683nR72)).initialize(BinderC36557Vd3.m79636e5(this.f43353h), zzclVar, this.f103108b);
        } catch (Exception e) {
            this.f43355j.m4056k(e, true, false);
        }
    }
}
