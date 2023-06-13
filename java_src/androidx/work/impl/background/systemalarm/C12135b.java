package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.C12137d;
import java.util.ArrayList;
import java.util.List;
/* renamed from: androidx.work.impl.background.systemalarm.b */
/* loaded from: classes.dex */
public class C12135b {

    /* renamed from: e */
    public static final String f56247e = AbstractC32056Bx2.m113270i("ConstraintsCmdHandler");

    /* renamed from: a */
    public final Context f56248a;

    /* renamed from: b */
    public final int f56249b;

    /* renamed from: c */
    public final C12137d f56250c;

    /* renamed from: d */
    public final GC6 f56251d;

    public C12135b(Context context, int i, C12137d c12137d) {
        this.f56248a = context;
        this.f56249b = i;
        this.f56250c = c12137d;
        this.f56251d = new GC6(c12137d.m65503g().m71757t(), (EC6) null);
    }

    /* renamed from: a */
    public void m65517a() {
        List<HG6> mo100757k = this.f56250c.m65503g().m71756u().mo65549I().mo100757k();
        ConstraintProxy.m65536a(this.f56248a, mo100757k);
        this.f56251d.mo105647a(mo100757k);
        ArrayList<HG6> arrayList = new ArrayList(mo100757k.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (HG6 hg6 : mo100757k) {
            String str = hg6.f13191a;
            if (currentTimeMillis >= hg6.m104076c() && (!hg6.m104071h() || this.f56251d.m105646d(str))) {
                arrayList.add(hg6);
            }
        }
        for (HG6 hg62 : arrayList) {
            String str2 = hg62.f13191a;
            Intent m65532b = C12134a.m65532b(this.f56248a, KG6.m99055a(hg62));
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str3 = f56247e;
            m113272e.mo113269a(str3, "Creating a delay_met command for workSpec with id (" + str2 + ")");
            this.f56250c.m65504f().mo25426b().execute(new C12137d.RunnableC12139b(this.f56250c, m65532b, this.f56249b));
        }
        this.f56251d.reset();
    }
}
