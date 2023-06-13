package com.google.p034ar.core;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.m */
/* loaded from: classes6.dex */
public final class C18005m {

    /* renamed from: a */
    final Map f73817a = new C18004l();

    /* renamed from: a */
    public final synchronized AugmentedFace m48404a(long j, Session session) {
        Map map = this.f73817a;
        Long valueOf = Long.valueOf(j);
        AugmentedFace augmentedFace = (AugmentedFace) map.get(valueOf);
        if (augmentedFace == null) {
            AugmentedFace augmentedFace2 = new AugmentedFace(j, session);
            this.f73817a.put(valueOf, augmentedFace2);
            return augmentedFace2;
        }
        return augmentedFace;
    }
}
