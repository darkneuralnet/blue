package p000;

import java.io.Serializable;
/* renamed from: g */
/* loaded from: classes6.dex */
public class C20674g implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public int f81262b;

    /* renamed from: c */
    public int f81263c;

    /* renamed from: d */
    public byte[] f81264d;

    public C20674g() {
    }

    /* renamed from: a */
    public byte[] m40379a() {
        return this.f81264d;
    }

    /* renamed from: b */
    public int m40378b() {
        return this.f81262b;
    }

    /* renamed from: c */
    public int m40377c() {
        return this.f81263c;
    }

    public String toString() {
        return String.format("ADStructure(Length=%d,Type=0x%02X)", Integer.valueOf(this.f81262b), Integer.valueOf(this.f81263c));
    }

    public C20674g(int i, int i2, byte[] bArr) {
        this.f81262b = i;
        this.f81263c = i2;
        this.f81264d = bArr;
    }
}
