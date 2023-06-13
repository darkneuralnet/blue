package p000;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
/* renamed from: Kb9 */
/* loaded from: classes5.dex */
public final class Kb9 {

    /* renamed from: e */
    public static Kb9 f19919e;

    /* renamed from: a */
    public final C51111wb9 f19920a;

    /* renamed from: b */
    public final C48750sc9 f19921b;

    /* renamed from: c */
    public final C41042fc9 f19922c;

    /* renamed from: d */
    public C52307yc9 f19923d;

    public Kb9(Context context, Db9 db9) {
        C41042fc9 c41042fc9 = new C41042fc9();
        this.f19922c = c41042fc9;
        this.f19921b = new C48750sc9(context);
        this.f19920a = new C51111wb9(db9, c41042fc9);
    }

    /* renamed from: b */
    public static synchronized Kb9 m98697b() {
        Kb9 kb9;
        synchronized (Kb9.class) {
            if (f19919e == null) {
                f19919e = new Kb9((Context) C52226yU2.m3451c().m3453a(Context.class), Fc9.f9785a);
            }
            kb9 = f19919e;
        }
        return kb9;
    }

    /* renamed from: a */
    public final C39236cb9 m98698a() {
        boolean z;
        if (this.f19923d != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return this.f19923d.m3164b();
    }

    /* renamed from: c */
    public final String m98696c() throws InterruptedException {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.f19923d != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        if (this.f19923d != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkState(z2);
        if (this.f19923d.m3161e()) {
            Yb9 yb9 = new Yb9();
            yb9.m74819g();
            try {
                if (this.f19920a.m6602c(yb9)) {
                    this.f19923d = this.f19920a.m6604a();
                }
            } finally {
                yb9.m74821e();
                this.f19922c.m41104a(EnumC45136mW8.INSTALLATION_ID_REFRESH_TEMPORARY_TOKEN, yb9);
            }
        }
        if (this.f19923d == null) {
            z3 = false;
        }
        Preconditions.checkState(z3);
        return this.f19923d.m3162d();
    }

    /* renamed from: d */
    public final void m98695d() throws IOException, InterruptedException {
        C41042fc9 c41042fc9;
        EnumC45136mW8 enumC45136mW8;
        Yb9 yb9 = new Yb9();
        yb9.m74819g();
        try {
            C52307yc9 m13940a = this.f19921b.m13940a(yb9);
            if (m13940a != null) {
                this.f19923d = m13940a;
            } else {
                final Yb9 yb92 = new Yb9();
                yb92.m74819g();
                final C39236cb9 c39236cb9 = new C39236cb9(Rb9.m86561a());
                final C51111wb9 c51111wb9 = this.f19920a;
                if (!Xj9.m76495a(new Qj9() { // from class: jb9
                    @Override // p000.Qj9
                    public final boolean zza() {
                        return C51111wb9.this.m6603b(c39236cb9, yb92);
                    }
                })) {
                    yb92.m74822d(EnumC38962c79.RPC_EXPONENTIAL_BACKOFF_FAILED);
                    yb92.m74822d(EnumC38962c79.RPC_ERROR);
                    yb92.m74821e();
                    c41042fc9 = this.f19922c;
                    enumC45136mW8 = EnumC45136mW8.INSTALLATION_ID_REGISTER_NEW_ID;
                } else {
                    C52307yc9 m6604a = this.f19920a.m6604a();
                    this.f19923d = m6604a;
                    if (m6604a != null) {
                        this.f19921b.m13938c(m6604a, yb92);
                    }
                    yb92.m74821e();
                    c41042fc9 = this.f19922c;
                    enumC45136mW8 = EnumC45136mW8.INSTALLATION_ID_REGISTER_NEW_ID;
                }
                c41042fc9.m41104a(enumC45136mW8, yb92);
            }
        } finally {
            yb9.m74821e();
            this.f19922c.m41104a(EnumC45136mW8.INSTALLATION_ID_INIT, yb9);
        }
    }
}
