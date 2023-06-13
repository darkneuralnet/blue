package p000;

import co.bird.android.model.constant.DeserializerKind;
import java.util.Map;
/* renamed from: sk */
/* loaded from: classes4.dex */
public final class C28376sk implements InterfaceC48812sj1<C51174wi2> {

    /* renamed from: a */
    public final C22711hj f109175a;

    /* renamed from: b */
    public final Y94<Map<DeserializerKind, F01>> f109176b;

    public C28376sk(C22711hj c22711hj, Y94<Map<DeserializerKind, F01>> y94) {
        this.f109175a = c22711hj;
        this.f109176b = y94;
    }

    /* renamed from: a */
    public static C28376sk m13745a(C22711hj c22711hj, Y94<Map<DeserializerKind, F01>> y94) {
        return new C28376sk(c22711hj, y94);
    }

    /* renamed from: c */
    public static C51174wi2 m13743c(C22711hj c22711hj, Map<DeserializerKind, F01> map) {
        return (C51174wi2) C51679xZ3.m5002e(c22711hj.m35984l0(map));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C51174wi2 get() {
        return m13743c(this.f109175a, this.f109176b.get());
    }
}
