package p000;

import java.util.HashMap;
import java.util.concurrent.Executor;
/* renamed from: on8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46488on8 {

    /* renamed from: a */
    public Executor f102504a;

    /* renamed from: b */
    public P78 f102505b;

    /* renamed from: d */
    public final C32746Ev8 f102507d = C32746Ev8.f8304a;

    /* renamed from: c */
    public final HashMap<String, AbstractC32503Du8> f102506c = new HashMap<>();

    /* renamed from: a */
    public final C39355cn8 m20486a() {
        return new C39355cn8(this.f102504a, this.f102505b, this.f102507d, this.f102506c, null, null);
    }

    /* renamed from: b */
    public final C46488on8 m20485b(AbstractC32503Du8 abstractC32503Du8) {
        C52142yK8.m3658g(!this.f102506c.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
        this.f102506c.put("singleproc", abstractC32503Du8);
        return this;
    }

    /* renamed from: c */
    public final C46488on8 m20484c(Executor executor) {
        this.f102504a = executor;
        return this;
    }

    /* renamed from: d */
    public final C46488on8 m20483d(P78 p78) {
        this.f102505b = p78;
        return this;
    }
}
