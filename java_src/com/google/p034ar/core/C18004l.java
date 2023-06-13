package com.google.p034ar.core;

import java.util.LinkedHashMap;
import java.util.Map;
/* renamed from: com.google.ar.core.l */
/* loaded from: classes6.dex */
final class C18004l extends LinkedHashMap {
    public C18004l() {
        super(1, 0.75f, true);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 10;
    }
}
