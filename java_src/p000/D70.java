package p000;

import com.bumptech.glide.load.data.InterfaceC17126a;
import java.nio.ByteBuffer;
/* renamed from: D70 */
/* loaded from: classes5.dex */
public class D70 implements InterfaceC17126a<ByteBuffer> {

    /* renamed from: a */
    public final ByteBuffer f5261a;

    /* renamed from: D70$a */
    /* loaded from: classes5.dex */
    public static class C1395a implements InterfaceC17126a.InterfaceC17127a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.InterfaceC17126a.InterfaceC17127a
        /* renamed from: a */
        public Class<ByteBuffer> mo53089a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC17126a.InterfaceC17127a
        /* renamed from: c */
        public InterfaceC17126a<ByteBuffer> mo53088b(ByteBuffer byteBuffer) {
            return new D70(byteBuffer);
        }
    }

    public D70(ByteBuffer byteBuffer) {
        this.f5261a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC17126a
    /* renamed from: b */
    public ByteBuffer mo53092a() {
        this.f5261a.position(0);
        return this.f5261a;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC17126a
    public void cleanup() {
    }
}
