package p000;

import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.internal.measurement.zznj;
import java.io.IOException;
import p000.AbstractC46897pU8;
import p000.US8;
/* renamed from: US8 */
/* loaded from: classes5.dex */
public class US8<MessageType extends AbstractC46897pU8<MessageType, BuilderType>, BuilderType extends US8<MessageType, BuilderType>> extends FJ8<MessageType, BuilderType> {

    /* renamed from: b */
    public final AbstractC46897pU8 f37450b;

    /* renamed from: c */
    public AbstractC46897pU8 f37451c;

    public US8(MessageType messagetype) {
        this.f37450b = messagetype;
        if (!messagetype.m19194y()) {
            this.f37451c = messagetype.m19206l();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* renamed from: l */
    public static void m81480l(Object obj, Object obj2) {
        R29.m87386a().m87385b(obj.getClass()).mo43319a(obj, obj2);
    }

    @Override // p000.FJ8
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ FJ8 mo81482j(byte[] bArr, int i, int i2) throws zzll {
        m81477p(bArr, 0, i2, TQ8.f35440c);
        return this;
    }

    @Override // p000.FJ8
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ FJ8 mo81481k(byte[] bArr, int i, int i2, TQ8 tq8) throws zzll {
        m81477p(bArr, 0, i2, tq8);
        return this;
    }

    @Override // p000.FJ8
    /* renamed from: n */
    public final US8 mo81483h() {
        US8 us8 = (US8) this.f37450b.mo8350A(5, null, null);
        us8.f37451c = mo36897R1();
        return us8;
    }

    /* renamed from: o */
    public final US8 m81478o(AbstractC46897pU8 abstractC46897pU8) {
        if (!this.f37450b.equals(abstractC46897pU8)) {
            if (!this.f37451c.m19194y()) {
                m81473w();
            }
            m81480l(this.f37451c, abstractC46897pU8);
        }
        return this;
    }

    /* renamed from: p */
    public final US8 m81477p(byte[] bArr, int i, int i2, TQ8 tq8) throws zzll {
        if (!this.f37451c.m19194y()) {
            m81473w();
        }
        try {
            R29.m87386a().m87385b(this.f37451c.getClass()).mo43315e(this.f37451c, bArr, 0, i2, new C52735zK8(tq8));
            return this;
        } catch (zzll e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzll.m51339f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r3 != false) goto L13;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MessageType m81476q() {
        Object obj;
        MessageType mo36897R1 = mo36897R1();
        byte byteValue = ((Byte) mo36897R1.mo8350A(1, null, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue != 0) {
                boolean mo43318b = R29.m87386a().m87385b(mo36897R1.getClass()).mo43318b(mo36897R1);
                if (true != mo43318b) {
                    obj = null;
                } else {
                    obj = mo36897R1;
                }
                mo36897R1.mo8350A(2, obj, null);
            }
            throw new zznj(mo36897R1);
        }
        return mo36897R1;
    }

    @Override // p000.InterfaceC41884h19
    /* renamed from: r */
    public MessageType mo36897R1() {
        if (!this.f37451c.m19194y()) {
            return (MessageType) this.f37451c;
        }
        this.f37451c.m19198u();
        return (MessageType) this.f37451c;
    }

    /* renamed from: t */
    public final void m81474t() {
        if (!this.f37451c.m19194y()) {
            m81473w();
        }
    }

    /* renamed from: w */
    public void m81473w() {
        AbstractC46897pU8 m19206l = this.f37450b.m19206l();
        m81480l(m19206l, this.f37451c);
        this.f37451c = m19206l;
    }
}
