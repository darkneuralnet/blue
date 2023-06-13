package p000;
/* renamed from: i32  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC42490i32 {

    /* renamed from: i32$a */
    /* loaded from: classes.dex */
    public class C23110a extends AbstractC42490i32 {
        @Override // p000.AbstractC42490i32
        /* renamed from: a */
        public AbstractC41897h32 mo34531a(String str) {
            return null;
        }
    }

    /* renamed from: c */
    public static AbstractC42490i32 m34532c() {
        return new C23110a();
    }

    /* renamed from: a */
    public abstract AbstractC41897h32 mo34531a(String str);

    /* renamed from: b */
    public final AbstractC41897h32 m34533b(String str) {
        AbstractC41897h32 mo34531a = mo34531a(str);
        if (mo34531a == null) {
            return AbstractC41897h32.m36878a(str);
        }
        return mo34531a;
    }
}
