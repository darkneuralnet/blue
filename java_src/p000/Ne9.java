package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p000.Ge9;
import p000.Ne9;
/* renamed from: Ne9 */
/* loaded from: classes6.dex */
public abstract class Ne9<MessageType extends Ne9<MessageType, BuilderType>, BuilderType extends Ge9<MessageType, BuilderType>> implements Np9 {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static <T> void m93594c(Iterable<T> iterable, List<? super T> list) {
        Fn9.m106450e(iterable);
        if (iterable instanceof InterfaceC44127ko9) {
            List<?> zzh = ((InterfaceC44127ko9) iterable).zzh();
            InterfaceC44127ko9 interfaceC44127ko9 = (InterfaceC44127ko9) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    int size2 = interfaceC44127ko9.size();
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2 - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    int size3 = interfaceC44127ko9.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            break;
                        }
                        interfaceC44127ko9.remove(size3);
                    }
                    throw new NullPointerException(sb2);
                } else if (obj instanceof AbstractC45836nh9) {
                    interfaceC44127ko9.mo28435P2((AbstractC45836nh9) obj);
                } else {
                    interfaceC44127ko9.add((String) obj);
                }
            }
        } else if (!(iterable instanceof InterfaceC44147kq9)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
            }
            int size4 = list.size();
            for (T t : iterable) {
                if (t == 0) {
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
                list.add(t);
            }
        } else {
            list.addAll(iterable);
        }
    }

    /* renamed from: a */
    public int mo93595a() {
        throw null;
    }

    @Override // p000.Np9
    /* renamed from: e */
    public final void mo81211e(OutputStream outputStream) throws IOException {
        AbstractC48228rj9 m15503o = AbstractC48228rj9.m15503o(outputStream, AbstractC48228rj9.m15509i(mo93341g()));
        mo81209j(m15503o);
        m15503o.mo15499s();
    }

    @Override // p000.Np9
    /* renamed from: f */
    public final AbstractC45836nh9 mo81210f() {
        try {
            int mo93341g = mo93341g();
            AbstractC45836nh9 abstractC45836nh9 = AbstractC45836nh9.f100361c;
            byte[] bArr = new byte[mo93341g];
            AbstractC48228rj9 m15504n = AbstractC48228rj9.m15504n(bArr);
            mo81209j(m15504n);
            return Hg9.m103533a(m15504n, bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo93593i(int i) {
        throw null;
    }
}
