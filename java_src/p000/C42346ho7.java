package p000;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
/* renamed from: ho7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42346ho7 {

    /* renamed from: e */
    public static C42346ho7 f85908e;

    /* renamed from: a */
    public final C41160fo7 f85909a;

    /* renamed from: b */
    public final C45311mo7 f85910b;

    /* renamed from: c */
    public final C44125ko7 f85911c;

    /* renamed from: d */
    public C45904no7 f85912d;

    public C42346ho7(Context context, C41753go7 c41753go7) {
        C44125ko7 c44125ko7 = new C44125ko7();
        this.f85911c = c44125ko7;
        this.f85910b = new C45311mo7(context);
        this.f85909a = new C41160fo7(c41753go7, c44125ko7);
    }

    /* renamed from: b */
    public static synchronized C42346ho7 m35842b() {
        C42346ho7 c42346ho7;
        synchronized (C42346ho7.class) {
            if (f85908e == null) {
                f85908e = new C42346ho7((Context) C52226yU2.m3451c().m3453a(Context.class), C46497oo7.f102524a);
            }
            c42346ho7 = f85908e;
        }
        return c42346ho7;
    }

    /* renamed from: a */
    public final C39974do7 m35843a() {
        boolean z;
        if (this.f85912d != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return this.f85912d.m22345b();
    }

    /* renamed from: c */
    public final void m35841c() throws IOException, InterruptedException {
        C44125ko7 c44125ko7;
        EnumC36858Wk7 enumC36858Wk7;
        C43532jo7 c43532jo7 = new C43532jo7();
        c43532jo7.m29887g();
        try {
            C45904no7 m24902a = this.f85910b.m24902a(c43532jo7);
            if (m24902a != null) {
                this.f85912d = m24902a;
            } else {
                final C43532jo7 c43532jo72 = new C43532jo7();
                c43532jo72.m29887g();
                final C39974do7 c39974do7 = new C39974do7(C42939io7.m31852a());
                final C41160fo7 c41160fo7 = this.f85909a;
                if (!C43542jp7.m29865a(new InterfaceC42949ip7() { // from class: eo7
                    @Override // p000.InterfaceC42949ip7
                    public final boolean zzb() {
                        return C41160fo7.this.m40797b(c39974do7, c43532jo72);
                    }
                })) {
                    c43532jo72.m29890d(EnumC52998zm7.RPC_EXPONENTIAL_BACKOFF_FAILED);
                    c43532jo72.m29890d(EnumC52998zm7.RPC_ERROR);
                    c43532jo72.m29889e();
                    c44125ko7 = this.f85911c;
                    enumC36858Wk7 = EnumC36858Wk7.INSTALLATION_ID_REGISTER_NEW_ID;
                } else {
                    C45904no7 m40798a = this.f85909a.m40798a();
                    this.f85912d = m40798a;
                    if (m40798a != null) {
                        this.f85910b.m24900c(m40798a, c43532jo72);
                    }
                    c43532jo72.m29889e();
                    c44125ko7 = this.f85911c;
                    enumC36858Wk7 = EnumC36858Wk7.INSTALLATION_ID_REGISTER_NEW_ID;
                }
                c44125ko7.m28436a(enumC36858Wk7, c43532jo72);
            }
        } finally {
            c43532jo7.m29889e();
            this.f85911c.m28436a(EnumC36858Wk7.INSTALLATION_ID_INIT, c43532jo7);
        }
    }
}
