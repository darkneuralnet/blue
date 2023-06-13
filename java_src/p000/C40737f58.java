package p000;

import android.net.Uri;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
/* renamed from: f58  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40737f58 extends C36094Td8 {

    /* renamed from: b */
    public final List<InterfaceC48207rh8> f79429b;

    public C40737f58(InputStream inputStream, List<InterfaceC48207rh8> list) {
        super(inputStream);
        this.f79429b = list;
    }

    /* renamed from: a */
    public static C40737f58 m42098a(List<InterfaceC36364Uh8> list, Uri uri, InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC36364Uh8 interfaceC36364Uh8 : list) {
            InterfaceC48207rh8 zza = interfaceC36364Uh8.zza();
            if (zza != null) {
                arrayList.add(zza);
            }
        }
        if (!arrayList.isEmpty()) {
            return new C40737f58(inputStream, arrayList);
        }
        return null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        for (InterfaceC48207rh8 interfaceC48207rh8 : this.f79429b) {
            try {
                interfaceC48207rh8.close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            for (InterfaceC48207rh8 interfaceC48207rh8 : this.f79429b) {
                interfaceC48207rh8.zza();
            }
        }
        return read;
    }

    @Override // p000.C36094Td8, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int read = ((FilterInputStream) this).in.read(bArr);
        if (read != -1) {
            for (InterfaceC48207rh8 interfaceC48207rh8 : this.f79429b) {
                interfaceC48207rh8.zza();
            }
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read != -1) {
            for (InterfaceC48207rh8 interfaceC48207rh8 : this.f79429b) {
                interfaceC48207rh8.zza();
            }
        }
        return read;
    }
}
