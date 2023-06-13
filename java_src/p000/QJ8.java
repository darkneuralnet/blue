package p000;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p000.FJ8;
import p000.QJ8;
/* renamed from: QJ8 */
/* loaded from: classes5.dex */
public abstract class QJ8<MessageType extends QJ8<MessageType, BuilderType>, BuilderType extends FJ8<MessageType, BuilderType>> implements InterfaceC47814r19 {
    protected int zzb = 0;

    /* renamed from: b */
    public static void m88654b(Iterable iterable, List list) {
        Charset charset = XV8.f43341a;
        iterable.getClass();
        if (iterable instanceof InterfaceC48702sX8) {
            List zzh = ((InterfaceC48702sX8) iterable).zzh();
            InterfaceC48702sX8 interfaceC48702sX8 = (InterfaceC48702sX8) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC48702sX8.size() - size) + " is null.";
                    int size2 = interfaceC48702sX8.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        }
                        interfaceC48702sX8.remove(size2);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof AbstractC40913fO8) {
                    interfaceC48702sX8.mo14059I0((AbstractC40913fO8) obj);
                } else {
                    interfaceC48702sX8.add((String) obj);
                }
            }
        } else if (!(iterable instanceof I29)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    String str2 = "Element at index " + (list.size() - size3) + " is null.";
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 < size3) {
                            break;
                        }
                        list.remove(size4);
                    }
                    throw new NullPointerException(str2);
                }
                list.add(obj2);
            }
        } else {
            list.addAll((Collection) iterable);
        }
    }

    /* renamed from: a */
    public int mo19212a(F39 f39) {
        throw null;
    }

    /* renamed from: c */
    public final byte[] m88653c() {
        try {
            int mo16625m = mo16625m();
            byte[] bArr = new byte[mo16625m];
            QP8 m88522A = QP8.m88522A(bArr, 0, mo16625m);
            mo16628d(m88522A);
            m88522A.m88521a();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    @Override // p000.InterfaceC47814r19
    /* renamed from: g */
    public final AbstractC40913fO8 mo16626g() {
        try {
            int mo16625m = mo16625m();
            AbstractC40913fO8 abstractC40913fO8 = AbstractC40913fO8.f80055c;
            byte[] bArr = new byte[mo16625m];
            QP8 m88522A = QP8.m88522A(bArr, 0, mo16625m);
            mo16628d(m88522A);
            m88522A.m88521a();
            return new OM8(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
