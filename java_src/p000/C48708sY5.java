package p000;

import java.nio.ByteBuffer;
/* renamed from: sY5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C48708sY5 {

    /* renamed from: a */
    public int f108960a;

    /* renamed from: b */
    public ByteBuffer f108961b;

    /* renamed from: c */
    public int f108962c;

    /* renamed from: d */
    public int f108963d;

    /* renamed from: e */
    public AbstractC44657li6 f108964e = AbstractC44657li6.m26927a();

    /* renamed from: a */
    public int m14039a(int i) {
        return i + this.f108961b.getInt(i);
    }

    /* renamed from: b */
    public int m14038b(int i) {
        if (i < this.f108963d) {
            return this.f108961b.getShort(this.f108962c + i);
        }
        return 0;
    }

    /* renamed from: c */
    public void m14037c(int i, ByteBuffer byteBuffer) {
        this.f108961b = byteBuffer;
        if (byteBuffer != null) {
            this.f108960a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f108962c = i2;
            this.f108963d = this.f108961b.getShort(i2);
            return;
        }
        this.f108960a = 0;
        this.f108962c = 0;
        this.f108963d = 0;
    }

    /* renamed from: d */
    public int m14036d(int i) {
        int i2 = i + this.f108960a;
        return i2 + this.f108961b.getInt(i2) + 4;
    }

    /* renamed from: e */
    public int m14035e(int i) {
        int i2 = i + this.f108960a;
        return this.f108961b.getInt(i2 + this.f108961b.getInt(i2));
    }
}
