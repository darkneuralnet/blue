package p000;

import java.util.List;
/* renamed from: mK7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45027mK7 extends AbstractC32304Cy7 {
    @Override // p000.AbstractC32304Cy7
    /* renamed from: a */
    public final InterfaceC37164Xs7 mo1608a(String str, C38159am8 c38159am8, List list) {
        if (str != null && !str.isEmpty() && c38159am8.m70751h(str)) {
            InterfaceC37164Xs7 m70755d = c38159am8.m70755d(str);
            if (m70755d instanceof AbstractC40557en7) {
                return ((AbstractC40557en7) m70755d).mo4521d(c38159am8, list);
            }
            throw new IllegalArgumentException(String.format("Function %s is not defined", str));
        }
        throw new IllegalArgumentException(String.format("Command not found: %s", str));
    }
}
