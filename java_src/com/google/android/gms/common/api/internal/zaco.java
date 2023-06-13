package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import java.util.concurrent.ExecutorService;
/* loaded from: classes5.dex */
public final class zaco {
    private static final ExecutorService zaa = C46859pQ6.m19317a().mo21085c(new NumberedThreadFactory("GAC_Transform"), 1);

    public static ExecutorService zaa() {
        return zaa;
    }
}
