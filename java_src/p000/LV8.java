package p000;

import java.nio.charset.Charset;
/* renamed from: LV8 */
/* loaded from: classes6.dex */
public abstract class LV8 extends TU8 {
    @Override // p000.TU8, p000.LW8
    /* renamed from: a */
    public final AW8 mo83544a(CharSequence charSequence, Charset charset) {
        byte[] bytes = charSequence.toString().getBytes(charset);
        return mo79836c(bytes, 0, bytes.length);
    }

    @Override // p000.TU8
    /* renamed from: d */
    public final WW8 mo83542d(int i) {
        return new C46906pV8(this, i);
    }

    @Override // p000.LW8
    public final WW8 zze() {
        return new C46906pV8(this, 32);
    }
}
