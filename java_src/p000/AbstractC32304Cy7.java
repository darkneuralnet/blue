package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: Cy7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC32304Cy7 {

    /* renamed from: a */
    public final List f4981a = new ArrayList();

    /* renamed from: a */
    public abstract InterfaceC37164Xs7 mo1608a(String str, C38159am8 c38159am8, List list);

    /* renamed from: b */
    public final InterfaceC37164Xs7 m111184b(String str) {
        if (this.f4981a.contains(C38822bt8.m62179e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
