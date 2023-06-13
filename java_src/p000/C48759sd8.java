package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/* renamed from: sd8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48759sd8 extends C36094Td8 implements InterfaceC35608Rb8 {

    /* renamed from: b */
    public final FileInputStream f109058b;

    /* renamed from: c */
    public final File f109059c;

    public C48759sd8(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.f109058b = fileInputStream;
        this.f109059c = file;
    }

    /* renamed from: a */
    public static C48759sd8 m13918a(File file) throws FileNotFoundException {
        return new C48759sd8(new FileInputStream(file), file);
    }

    @Override // p000.InterfaceC35608Rb8
    public final File zza() {
        return this.f109059c;
    }
}
