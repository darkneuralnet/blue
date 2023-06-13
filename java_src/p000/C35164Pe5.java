package p000;

import io.reactivex.AbstractC23437E;
import io.reactivex.EnumC23460b;
import io.reactivex.Observable;
import io.reactivex.plugins.C24508a;
import java.lang.reflect.Type;
/* renamed from: Pe5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C35164Pe5<R> implements InterfaceC52024y80<R, Object> {

    /* renamed from: a */
    public final Type f28799a;

    /* renamed from: b */
    public final AbstractC23437E f28800b;

    /* renamed from: c */
    public final boolean f28801c;

    /* renamed from: d */
    public final boolean f28802d;

    /* renamed from: e */
    public final boolean f28803e;

    /* renamed from: f */
    public final boolean f28804f;

    /* renamed from: g */
    public final boolean f28805g;

    /* renamed from: h */
    public final boolean f28806h;

    /* renamed from: i */
    public final boolean f28807i;

    public C35164Pe5(Type type, AbstractC23437E abstractC23437E, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f28799a = type;
        this.f28800b = abstractC23437E;
        this.f28801c = z;
        this.f28802d = z2;
        this.f28803e = z3;
        this.f28804f = z4;
        this.f28805g = z5;
        this.f28806h = z6;
        this.f28807i = z7;
    }

    @Override // p000.InterfaceC52024y80
    /* renamed from: a */
    public Type mo1287a() {
        return this.f28799a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    @Override // p000.InterfaceC52024y80
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo1286b(InterfaceC51431x80<R> interfaceC51431x80) {
        Observable a80;
        Observable c7189ry;
        AbstractC23437E abstractC23437E;
        if (this.f28801c) {
            a80 = new C52617z80(interfaceC51431x80);
        } else {
            a80 = new A80(interfaceC51431x80);
        }
        if (this.f28802d) {
            c7189ry = new C40307eN4(a80);
        } else {
            if (this.f28803e) {
                c7189ry = new C7189RY(a80);
            }
            abstractC23437E = this.f28800b;
            if (abstractC23437E != null) {
                a80 = a80.subscribeOn(abstractC23437E);
            }
            if (!this.f28804f) {
                return a80.toFlowable(EnumC23460b.LATEST);
            }
            if (this.f28805g) {
                return a80.singleOrError();
            }
            if (this.f28806h) {
                return a80.singleElement();
            }
            if (this.f28807i) {
                return a80.ignoreElements();
            }
            return C24508a.m31994o(a80);
        }
        a80 = c7189ry;
        abstractC23437E = this.f28800b;
        if (abstractC23437E != null) {
        }
        if (!this.f28804f) {
        }
    }
}
