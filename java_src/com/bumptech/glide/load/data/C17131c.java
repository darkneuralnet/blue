package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.InterfaceC17126a;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: com.bumptech.glide.load.data.c */
/* loaded from: classes5.dex */
public final class C17131c implements InterfaceC17126a<InputStream> {

    /* renamed from: a */
    public final C38818bt4 f69166a;

    /* renamed from: com.bumptech.glide.load.data.c$a */
    /* loaded from: classes5.dex */
    public static final class C17132a implements InterfaceC17126a.InterfaceC17127a<InputStream> {

        /* renamed from: a */
        public final InterfaceC28820to f69167a;

        public C17132a(InterfaceC28820to interfaceC28820to) {
            this.f69167a = interfaceC28820to;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC17126a.InterfaceC17127a
        /* renamed from: a */
        public Class<InputStream> mo53089a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC17126a.InterfaceC17127a
        /* renamed from: c */
        public InterfaceC17126a<InputStream> mo53088b(InputStream inputStream) {
            return new C17131c(inputStream, this.f69167a);
        }
    }

    public C17131c(InputStream inputStream, InterfaceC28820to interfaceC28820to) {
        C38818bt4 c38818bt4 = new C38818bt4(inputStream, interfaceC28820to);
        this.f69166a = c38818bt4;
        c38818bt4.mark(5242880);
    }

    /* renamed from: b */
    public void m53091b() {
        this.f69166a.m62199b();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC17126a
    /* renamed from: c */
    public InputStream mo53092a() throws IOException {
        this.f69166a.reset();
        return this.f69166a;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC17126a
    public void cleanup() {
        this.f69166a.release();
    }
}
