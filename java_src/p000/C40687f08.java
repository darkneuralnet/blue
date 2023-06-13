package p000;

import android.content.Context;
import java.util.concurrent.ExecutorService;
/* renamed from: f08  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40687f08 {

    /* renamed from: a */
    public final Context f79281a;

    /* renamed from: b */
    public final DV7 f79282b;

    /* renamed from: c */
    public final ExecutorService f79283c;

    /* renamed from: d */
    public final CI7<Ou9> f79284d;

    public C40687f08(Context context, DV7 dv7) {
        this.f79281a = context;
        this.f79282b = dv7;
        ExecutorService executorService = C51665xX7.f117783b;
        this.f79283c = executorService;
        this.f79284d = new CI7<>(C51665xX7.m5040b(), executorService, Ou9.m91194x());
    }
}
