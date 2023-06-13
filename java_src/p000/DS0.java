package p000;

import java.io.File;
import p000.InterfaceC52578z41;
/* renamed from: DS0 */
/* loaded from: classes5.dex */
public class DS0<DataType> implements InterfaceC52578z41.InterfaceC30902b {

    /* renamed from: a */
    public final InterfaceC45175mb1<DataType> f5714a;

    /* renamed from: b */
    public final DataType f5715b;

    /* renamed from: c */
    public final C48964sy3 f5716c;

    public DS0(InterfaceC45175mb1<DataType> interfaceC45175mb1, DataType datatype, C48964sy3 c48964sy3) {
        this.f5714a = interfaceC45175mb1;
        this.f5715b = datatype;
        this.f5716c = c48964sy3;
    }

    @Override // p000.InterfaceC52578z41.InterfaceC30902b
    /* renamed from: a */
    public boolean mo1851a(File file) {
        return this.f5714a.mo7265b(this.f5715b, file, this.f5716c);
    }
}
