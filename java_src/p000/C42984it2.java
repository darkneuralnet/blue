package p000;

import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.load.data.InterfaceC17126a;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.C48676sV0;
/* renamed from: it2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C42984it2<Data, ResourceType, Transcode> {

    /* renamed from: a */
    public final Class<Data> f91650a;

    /* renamed from: b */
    public final InterfaceC41591gY3<List<Throwable>> f91651b;

    /* renamed from: c */
    public final List<? extends C48676sV0<Data, ResourceType, Transcode>> f91652c;

    /* renamed from: d */
    public final String f91653d;

    public C42984it2(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C48676sV0<Data, ResourceType, Transcode>> list, InterfaceC41591gY3<List<Throwable>> interfaceC41591gY3) {
        this.f91650a = cls;
        this.f91651b = interfaceC41591gY3;
        this.f91652c = (List) C52865zZ3.m1112c(list);
        this.f91653d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public VL4<Transcode> m31681a(InterfaceC17126a<Data> interfaceC17126a, C48964sy3 c48964sy3, int i, int i2, C48676sV0.InterfaceC28325a<ResourceType> interfaceC28325a) throws GlideException {
        List<Throwable> list = (List) C52865zZ3.m1111d(this.f91651b.mo9830a());
        try {
            return m31680b(interfaceC17126a, c48964sy3, i, i2, interfaceC28325a, list);
        } finally {
            this.f91651b.mo9829b(list);
        }
    }

    /* renamed from: b */
    public final VL4<Transcode> m31680b(InterfaceC17126a<Data> interfaceC17126a, C48964sy3 c48964sy3, int i, int i2, C48676sV0.InterfaceC28325a<ResourceType> interfaceC28325a, List<Throwable> list) throws GlideException {
        int size = this.f91652c.size();
        VL4<Transcode> vl4 = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                vl4 = this.f91652c.get(i3).m14146a(interfaceC17126a, i, i2, c48964sy3, interfaceC28325a);
            } catch (GlideException e) {
                list.add(e);
            }
            if (vl4 != null) {
                break;
            }
        }
        if (vl4 != null) {
            return vl4;
        }
        throw new GlideException(this.f91653d, new ArrayList(list));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f91652c.toArray()) + CoreConstants.CURLY_RIGHT;
    }
}
