package p000;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* renamed from: wL6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50963wL6 extends OutputStream {

    /* renamed from: b */
    public final DM6 f115850b = new DM6();

    /* renamed from: c */
    public final File f115851c;

    /* renamed from: d */
    public final QM6 f115852d;

    /* renamed from: e */
    public long f115853e;

    /* renamed from: f */
    public long f115854f;

    /* renamed from: g */
    public FileOutputStream f115855g;

    /* renamed from: h */
    public C40309eN6 f115856h;

    public C50963wL6(File file, QM6 qm6) {
        this.f115851c = file;
        this.f115852d = qm6;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int min;
        while (i2 > 0) {
            if (this.f115853e == 0 && this.f115854f == 0) {
                int m110561a = this.f115850b.m110561a(bArr, i, i2);
                if (m110561a == -1) {
                    return;
                }
                i += m110561a;
                i2 -= m110561a;
                C40309eN6 m110560b = this.f115850b.m110560b();
                this.f115856h = m110560b;
                if (m110560b.m42947h()) {
                    this.f115853e = 0L;
                    this.f115852d.m88581m(this.f115856h.m42946i(), this.f115856h.m42946i().length);
                    this.f115854f = this.f115856h.m42946i().length;
                } else if (!this.f115856h.m42952c() || this.f115856h.m42953b()) {
                    byte[] m42946i = this.f115856h.m42946i();
                    this.f115852d.m88581m(m42946i, m42946i.length);
                    this.f115853e = this.f115856h.m42950e();
                } else {
                    this.f115852d.m88587g(this.f115856h.m42946i());
                    File file = new File(this.f115851c, this.f115856h.m42951d());
                    file.getParentFile().mkdirs();
                    this.f115853e = this.f115856h.m42950e();
                    this.f115855g = new FileOutputStream(file);
                }
            }
            if (!this.f115856h.m42953b()) {
                if (this.f115856h.m42947h()) {
                    this.f115852d.m88585i(this.f115854f, bArr, i, i2);
                    this.f115854f += i2;
                    min = i2;
                } else if (this.f115856h.m42952c()) {
                    min = (int) Math.min(i2, this.f115853e);
                    this.f115855g.write(bArr, i, min);
                    long j = this.f115853e - min;
                    this.f115853e = j;
                    if (j == 0) {
                        this.f115855g.close();
                    }
                } else {
                    min = (int) Math.min(i2, this.f115853e);
                    this.f115852d.m88585i((this.f115856h.m42946i().length + this.f115856h.m42950e()) - this.f115853e, bArr, i, min);
                    this.f115853e -= min;
                }
                i += min;
                i2 -= min;
            }
        }
    }
}
