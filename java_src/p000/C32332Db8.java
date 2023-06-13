package p000;

import com.google.android.gms.internal.recaptcha.zzew;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
/* renamed from: Db8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32332Db8 {

    /* renamed from: a */
    public OutputStream f6028a;

    /* renamed from: b */
    public C32818Fd8 f6029b;

    /* renamed from: a */
    public final void m110119a(List<OutputStream> list) throws IOException {
        OutputStream outputStream = (OutputStream) C38551bR8.m64526a(list);
        if (outputStream instanceof C32818Fd8) {
            this.f6029b = (C32818Fd8) outputStream;
            this.f6028a = list.get(0);
        }
    }

    /* renamed from: b */
    public final void m110118b() throws IOException {
        if (this.f6029b != null) {
            this.f6028a.flush();
            this.f6029b.m106834a();
            return;
        }
        throw new zzew("Cannot sync underlying stream");
    }
}
