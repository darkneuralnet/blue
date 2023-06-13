package p000;

import android.net.Uri;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
/* renamed from: u58  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49631u58 extends C38089af8 {

    /* renamed from: b */
    public final List<InterfaceC33088Gh8> f111725b;

    public C49631u58(OutputStream outputStream, List<InterfaceC33088Gh8> list) {
        super(outputStream);
        this.f111725b = list;
    }

    /* renamed from: a */
    public static C49631u58 m10870a(List<InterfaceC36364Uh8> list, Uri uri, OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC36364Uh8 interfaceC36364Uh8 : list) {
            InterfaceC33088Gh8 zzb = interfaceC36364Uh8.zzb();
            if (zzb != null) {
                arrayList.add(zzb);
            }
        }
        if (!arrayList.isEmpty()) {
            return new C49631u58(outputStream, arrayList);
        }
        return null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        for (InterfaceC33088Gh8 interfaceC33088Gh8 : this.f111725b) {
            try {
                interfaceC33088Gh8.close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        for (InterfaceC33088Gh8 interfaceC33088Gh8 : this.f111725b) {
            interfaceC33088Gh8.zza();
        }
    }

    @Override // p000.C38089af8, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        ((FilterOutputStream) this).out.write(bArr);
        for (InterfaceC33088Gh8 interfaceC33088Gh8 : this.f111725b) {
            int length = bArr.length;
            interfaceC33088Gh8.zza();
        }
    }

    @Override // p000.C38089af8, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        for (InterfaceC33088Gh8 interfaceC33088Gh8 : this.f111725b) {
            interfaceC33088Gh8.zza();
        }
    }
}
