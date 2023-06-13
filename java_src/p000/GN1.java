package p000;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
/* renamed from: GN1 */
/* loaded from: classes.dex */
public final class GN1 {

    /* renamed from: a */
    public final int f11807a;

    /* renamed from: b */
    public final List<AH1> f11808b;

    /* renamed from: c */
    public final int f11809c;

    /* renamed from: d */
    public final InputStream f11810d;

    /* renamed from: e */
    public final byte[] f11811e;

    public GN1(int i, List<AH1> list) {
        this(i, list, -1, null);
    }

    /* renamed from: a */
    public final InputStream m105190a() {
        InputStream inputStream = this.f11810d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f11811e != null) {
            return new ByteArrayInputStream(this.f11811e);
        }
        return null;
    }

    /* renamed from: b */
    public final int m105189b() {
        return this.f11809c;
    }

    /* renamed from: c */
    public final List<AH1> m105188c() {
        return Collections.unmodifiableList(this.f11808b);
    }

    /* renamed from: d */
    public final int m105187d() {
        return this.f11807a;
    }

    public GN1(int i, List<AH1> list, int i2, InputStream inputStream) {
        this.f11807a = i;
        this.f11808b = list;
        this.f11809c = i2;
        this.f11810d = inputStream;
        this.f11811e = null;
    }
}
