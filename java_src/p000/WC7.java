package p000;

import java.util.Arrays;
import java.util.Comparator;
/* renamed from: WC7 */
/* loaded from: classes5.dex */
public final class WC7 implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ AbstractC40557en7 f40571b;

    /* renamed from: c */
    public final /* synthetic */ C38159am8 f40572c;

    public WC7(AbstractC40557en7 abstractC40557en7, C38159am8 c38159am8) {
        this.f40571b = abstractC40557en7;
        this.f40572c = c38159am8;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC37164Xs7 interfaceC37164Xs7 = (InterfaceC37164Xs7) obj;
        InterfaceC37164Xs7 interfaceC37164Xs72 = (InterfaceC37164Xs7) obj2;
        AbstractC40557en7 abstractC40557en7 = this.f40571b;
        C38159am8 c38159am8 = this.f40572c;
        if (interfaceC37164Xs7 instanceof C37200Xw7) {
            if (!(interfaceC37164Xs72 instanceof C37200Xw7)) {
                return 1;
            }
            return 0;
        } else if (interfaceC37164Xs72 instanceof C37200Xw7) {
            return -1;
        } else {
            if (abstractC40557en7 == null) {
                return interfaceC37164Xs7.zzi().compareTo(interfaceC37164Xs72.zzi());
            }
            return (int) C38822bt8.m62183a(abstractC40557en7.mo4521d(c38159am8, Arrays.asList(interfaceC37164Xs7, interfaceC37164Xs72)).zzh().doubleValue());
        }
    }
}
