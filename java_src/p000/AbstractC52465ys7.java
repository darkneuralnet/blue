package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p000.AbstractC51872xs7;
import p000.AbstractC52465ys7;
/* renamed from: ys7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC52465ys7<MessageType extends AbstractC52465ys7<MessageType, BuilderType>, BuilderType extends AbstractC51872xs7<MessageType, BuilderType>> implements InterfaceC41230fv7 {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static void m2343c(Iterable iterable, List list) {
        C46557ou7.m20293e(iterable);
        if (iterable instanceof InterfaceC35076Ou7) {
            List zzh = ((InterfaceC35076Ou7) iterable).zzh();
            InterfaceC35076Ou7 interfaceC35076Ou7 = (InterfaceC35076Ou7) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    int size2 = interfaceC35076Ou7.size();
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2 - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    int size3 = interfaceC35076Ou7.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            break;
                        }
                        interfaceC35076Ou7.remove(size3);
                    }
                    throw new NullPointerException(sb2);
                } else if (obj instanceof AbstractC44175kt7) {
                    interfaceC35076Ou7.mo4416H2((AbstractC44175kt7) obj);
                } else {
                    interfaceC35076Ou7.add((String) obj);
                }
            }
        } else if (!(iterable instanceof InterfaceC32745Ev7)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
            }
            int size4 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    int size5 = list.size();
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(size5 - size4);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    int size6 = list.size();
                    while (true) {
                        size6--;
                        if (size6 < size4) {
                            break;
                        }
                        list.remove(size6);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(obj2);
            }
        } else {
            list.addAll(iterable);
        }
    }

    /* renamed from: a */
    public final void m2345a(OutputStream outputStream) throws IOException {
        AbstractC50104ut7 m9555p = AbstractC50104ut7.m9555p(outputStream, AbstractC50104ut7.m9561j(mo40440w()));
        mo190y(m9555p);
        m9555p.mo9551t();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo2344b() {
        throw null;
    }

    /* renamed from: d */
    public void mo2342d(int i) {
        throw null;
    }

    /* renamed from: e */
    public final byte[] m2341e() {
        try {
            byte[] bArr = new byte[mo40440w()];
            AbstractC50104ut7 m9556o = AbstractC50104ut7.m9556o(bArr);
            mo190y(m9556o);
            m9556o.m9554q();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    @Override // p000.InterfaceC41230fv7
    /* renamed from: g */
    public final AbstractC44175kt7 mo192g() {
        try {
            int mo40440w = mo40440w();
            AbstractC44175kt7 abstractC44175kt7 = AbstractC44175kt7.f95165c;
            byte[] bArr = new byte[mo40440w];
            AbstractC50104ut7 m9556o = AbstractC50104ut7.m9556o(bArr);
            mo190y(m9556o);
            return C41803gt7.m37360a(m9556o, bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
