package p000;

import kotlin.KotlinVersion;
import okhttp3.internal.http2.Settings;
/* renamed from: d */
/* loaded from: classes6.dex */
public class C19649d extends C20674g {
    private static final long serialVersionUID = 1;

    /* renamed from: e */
    public int f75932e;

    public C19649d() {
        this(3, KotlinVersion.MAX_COMPONENT_VALUE, new byte[]{-1, -1}, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
    }

    /* renamed from: d */
    public int m44757d() {
        return this.f75932e;
    }

    @Override // p000.C20674g
    public String toString() {
        return String.format("ADManufacturerSpecific(Length=%d,Type=0x%02X,CompanyID=0x%04X)", Integer.valueOf(m40378b()), Integer.valueOf(m40377c()), Integer.valueOf(this.f75932e));
    }

    public C19649d(int i, int i2, byte[] bArr, int i3) {
        super(i, i2, bArr);
        this.f75932e = i3;
    }
}
