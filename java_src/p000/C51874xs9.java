package p000;

import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: xs9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51874xs9 extends AbstractC40557en7 {

    /* renamed from: d */
    public final Callable f118289d;

    public C51874xs9(String str, Callable callable) {
        super("internal.appMetadata");
        this.f118289d = callable;
    }

    @Override // p000.AbstractC40557en7
    /* renamed from: d */
    public final InterfaceC37164Xs7 mo4521d(C38159am8 c38159am8, List list) {
        try {
            return C40194eA8.m43153b(this.f118289d.call());
        } catch (Exception unused) {
            return InterfaceC37164Xs7.f44125h0;
        }
    }
}
