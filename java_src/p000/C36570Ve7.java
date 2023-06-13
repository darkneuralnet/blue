package p000;

import p000.V52;
/* renamed from: Ve7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36570Ve7 extends V52.AbstractC8545a {

    /* renamed from: a */
    public String f39413a;

    /* renamed from: b */
    public Long f39414b;

    @Override // p000.V52.AbstractC8545a
    /* renamed from: a */
    public final V52 mo79596a() {
        String str = this.f39413a;
        if (str != null) {
            return new C41523gQ7(str, this.f39414b, null);
        }
        throw new IllegalStateException("Missing required properties: nonce");
    }

    @Override // p000.V52.AbstractC8545a
    /* renamed from: b */
    public final V52.AbstractC8545a mo79595b(long j) {
        this.f39414b = Long.valueOf(j);
        return this;
    }

    @Override // p000.V52.AbstractC8545a
    /* renamed from: c */
    public final V52.AbstractC8545a mo79594c(String str) {
        if (str != null) {
            this.f39413a = str;
            return this;
        }
        throw new NullPointerException("Null nonce");
    }
}
