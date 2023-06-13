package p000;

import kotlin.Metadata;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"T", "LvZ0;", "LK83;", "type", "stopType", "b", "(LvZ0;II)Ljava/lang/Object;", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: I83 */
/* loaded from: classes.dex */
public final class I83 {
    /* renamed from: a */
    public static final /* synthetic */ Object m102915a(InterfaceC50490vZ0 interfaceC50490vZ0, int i, int i2) {
        return m102914b(interfaceC50490vZ0, i, i2);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [gV2$c] */
    /* renamed from: b */
    public static final <T> T m102914b(InterfaceC50490vZ0 interfaceC50490vZ0, int i, int i2) {
        ?? r3 = (T) interfaceC50490vZ0.mo8445r().m39261I();
        if (r3 == 0) {
            return null;
        }
        int m39262G = r3.m39262G() & i;
        if (m39262G == 0) {
            return null;
        }
        for (InterfaceC41563gV2.AbstractC20914c abstractC20914c = r3; abstractC20914c != null; abstractC20914c = (T) abstractC20914c.m39261I()) {
            int m39258M = abstractC20914c.m39258M();
            if ((m39258M & i2) != 0) {
                return null;
            }
            if ((m39258M & i) != 0) {
                return (T) abstractC20914c;
            }
        }
        return null;
    }
}
