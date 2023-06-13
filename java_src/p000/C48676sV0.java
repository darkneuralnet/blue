package p000;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.load.data.InterfaceC17126a;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* renamed from: sV0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C48676sV0<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    public final Class<DataType> f108877a;

    /* renamed from: b */
    public final List<? extends InterfaceC38502bM4<DataType, ResourceType>> f108878b;

    /* renamed from: c */
    public final InterfaceC49192tM4<ResourceType, Transcode> f108879c;

    /* renamed from: d */
    public final InterfaceC41591gY3<List<Throwable>> f108880d;

    /* renamed from: e */
    public final String f108881e;

    /* renamed from: sV0$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC28325a<ResourceType> {
        /* renamed from: a */
        VL4<ResourceType> mo14143a(VL4<ResourceType> vl4);
    }

    public C48676sV0(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends InterfaceC38502bM4<DataType, ResourceType>> list, InterfaceC49192tM4<ResourceType, Transcode> interfaceC49192tM4, InterfaceC41591gY3<List<Throwable>> interfaceC41591gY3) {
        this.f108877a = cls;
        this.f108878b = list;
        this.f108879c = interfaceC49192tM4;
        this.f108880d = interfaceC41591gY3;
        this.f108881e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public VL4<Transcode> m14146a(InterfaceC17126a<DataType> interfaceC17126a, int i, int i2, C48964sy3 c48964sy3, InterfaceC28325a<ResourceType> interfaceC28325a) throws GlideException {
        return this.f108879c.mo9029a(interfaceC28325a.mo14143a(m14145b(interfaceC17126a, i, i2, c48964sy3)), c48964sy3);
    }

    /* renamed from: b */
    public final VL4<ResourceType> m14145b(InterfaceC17126a<DataType> interfaceC17126a, int i, int i2, C48964sy3 c48964sy3) throws GlideException {
        List<Throwable> list = (List) C52865zZ3.m1111d(this.f108880d.mo9830a());
        try {
            return m14144c(interfaceC17126a, i, i2, c48964sy3, list);
        } finally {
            this.f108880d.mo9829b(list);
        }
    }

    /* renamed from: c */
    public final VL4<ResourceType> m14144c(InterfaceC17126a<DataType> interfaceC17126a, int i, int i2, C48964sy3 c48964sy3, List<Throwable> list) throws GlideException {
        int size = this.f108878b.size();
        VL4<ResourceType> vl4 = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC38502bM4<DataType, ResourceType> interfaceC38502bM4 = this.f108878b.get(i3);
            try {
                if (interfaceC38502bM4.mo1782a(interfaceC17126a.mo53092a(), c48964sy3)) {
                    vl4 = interfaceC38502bM4.mo1781b(interfaceC17126a.mo53092a(), i, i2, c48964sy3);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC38502bM4, e);
                }
                list.add(e);
            }
            if (vl4 != null) {
                break;
            }
        }
        if (vl4 != null) {
            return vl4;
        }
        throw new GlideException(this.f108881e, new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f108877a + ", decoders=" + this.f108878b + ", transcoder=" + this.f108879c + CoreConstants.CURLY_RIGHT;
    }
}
