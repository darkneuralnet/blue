package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.AbstractC17549C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p000.AbstractC35779Ru8;
/* renamed from: com.google.android.gms.internal.vision.C */
/* loaded from: classes6.dex */
public abstract class AbstractC17549C<MessageType extends AbstractC17549C<MessageType, BuilderType>, BuilderType extends AbstractC35779Ru8<MessageType, BuilderType>> implements InterfaceC44489lQ8 {
    protected int zza = 0;

    /* renamed from: c */
    public static <T> void m51017c(Iterable<T> iterable, List<? super T> list) {
        C52124yI8.m3691d(iterable);
        if (iterable instanceof InterfaceC41488gM8) {
            List<?> zzd = ((InterfaceC41488gM8) iterable).zzd();
            InterfaceC41488gM8 interfaceC41488gM8 = (InterfaceC41488gM8) list;
            int size = list.size();
            for (Object obj : zzd) {
                if (obj == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(interfaceC41488gM8.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = interfaceC41488gM8.size() - 1; size2 >= size; size2--) {
                        interfaceC41488gM8.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (obj instanceof AbstractC53119zy8) {
                    interfaceC41488gM8.mo6977X2((AbstractC53119zy8) obj);
                } else {
                    interfaceC41488gM8.add((String) obj);
                }
            }
        } else if (iterable instanceof IS8) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T t : iterable) {
                if (t == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(t);
            }
        }
    }

    /* renamed from: f */
    public void mo50994f(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public final byte[] m51016g() {
        try {
            byte[] bArr = new byte[mo27298b()];
            zzii m50816f = zzii.m50816f(bArr);
            mo27296e(m50816f);
            m50816f.m50830N();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo50993i() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC44489lQ8
    public final AbstractC53119zy8 zzg() {
        try {
            C37814aB8 m47C = AbstractC53119zy8.m47C(mo27298b());
            mo27296e(m47C.m71793b());
            return m47C.m71794a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
