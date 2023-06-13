package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;
/* renamed from: RT */
/* loaded from: classes5.dex */
public class C7175RT<DataType> implements InterfaceC38502bM4<DataType, BitmapDrawable> {

    /* renamed from: a */
    public final InterfaceC38502bM4<DataType, Bitmap> f32067a;

    /* renamed from: b */
    public final Resources f32068b;

    public C7175RT(Resources resources, InterfaceC38502bM4<DataType, Bitmap> interfaceC38502bM4) {
        this.f32068b = (Resources) C52865zZ3.m1111d(resources);
        this.f32067a = (InterfaceC38502bM4) C52865zZ3.m1111d(interfaceC38502bM4);
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: a */
    public boolean mo1782a(DataType datatype, C48964sy3 c48964sy3) throws IOException {
        return this.f32067a.mo1782a(datatype, c48964sy3);
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: b */
    public VL4<BitmapDrawable> mo1781b(DataType datatype, int i, int i2, C48964sy3 c48964sy3) throws IOException {
        return C39959dn2.m43717f(this.f32068b, this.f32067a.mo1781b(datatype, i, i2, c48964sy3));
    }
}
