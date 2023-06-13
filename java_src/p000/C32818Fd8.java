package p000;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* renamed from: Fd8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32818Fd8 extends C38089af8 implements InterfaceC35608Rb8 {

    /* renamed from: b */
    public final FileOutputStream f9852b;

    /* renamed from: c */
    public final File f9853c;

    public C32818Fd8(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.f9852b = fileOutputStream;
        this.f9853c = file;
    }

    /* renamed from: a */
    public final void m106834a() throws IOException {
        this.f9852b.getFD().sync();
    }

    @Override // p000.InterfaceC35608Rb8
    public final File zza() {
        return this.f9853c;
    }
}
