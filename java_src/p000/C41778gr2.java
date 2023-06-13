package p000;

import kotlin.KotlinVersion;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\t\u001a \u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0002\u001a\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0002\u001a\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¨\u0006\t"}, m28432d2 = {"", "i1", "i2", "i3", "e", "mask", "f", "g", "h", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: gr2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41778gr2 {
    /* renamed from: e */
    public static final int m37395e(int i, int i2, int i3) {
        return i | (i2 << 8) | (i3 << 16);
    }

    /* renamed from: f */
    public static final int m37394f(int i) {
        return i & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    /* renamed from: g */
    public static final int m37393g(int i) {
        return (i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    /* renamed from: h */
    public static final int m37392h(int i) {
        return (i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
    }
}
