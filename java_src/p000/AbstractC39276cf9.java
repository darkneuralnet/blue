package p000;

import com.google.android.gms.internal.recaptcha.zzrr;
import com.google.android.gms.internal.recaptcha.zztq;
import java.io.InputStream;
import p000.Np9;
/* renamed from: cf9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC39276cf9<MessageType extends Np9> implements InterfaceC42368hq9<MessageType> {

    /* renamed from: a */
    public static final C48830sk9 f61026a = C48830sk9.m13736a();

    /* renamed from: e */
    public static final MessageType m61076e(MessageType messagetype) throws zzrr {
        if (messagetype != null && !messagetype.mo89719d()) {
            zzrr zzrrVar = new zzrr(new zztq(messagetype).getMessage());
            zzrrVar.m51023h(messagetype);
            throw zzrrVar;
        }
        return messagetype;
    }

    @Override // p000.InterfaceC42368hq9
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo35762b(InputStream inputStream, C48830sk9 c48830sk9) throws zzrr {
        MessageType m61077d = m61077d(inputStream, c48830sk9);
        m61076e(m61077d);
        return m61077d;
    }

    @Override // p000.InterfaceC42368hq9
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo35761c(InputStream inputStream) throws zzrr {
        MessageType m61077d = m61077d(inputStream, f61026a);
        m61076e(m61077d);
        return m61077d;
    }

    /* renamed from: d */
    public final MessageType m61077d(InputStream inputStream, C48830sk9 c48830sk9) throws zzrr {
        AbstractC49403ti9 c44660li9;
        int i = AbstractC49403ti9.f110930d;
        if (inputStream == null) {
            byte[] bArr = Fn9.f10240c;
            int length = bArr.length;
            c44660li9 = AbstractC49403ti9.m11871g(bArr, 0, 0, false);
        } else {
            c44660li9 = new C44660li9(inputStream, 4096, null);
        }
        MessageType messagetype = (MessageType) mo35763a(c44660li9, c48830sk9);
        try {
            c44660li9.mo11878A(0);
            return messagetype;
        } catch (zzrr e) {
            e.m51023h(messagetype);
            throw e;
        }
    }
}
