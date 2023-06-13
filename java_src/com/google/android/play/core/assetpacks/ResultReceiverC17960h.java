package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ResultReceiver;
/* renamed from: com.google.android.play.core.assetpacks.h */
/* loaded from: classes6.dex */
final class ResultReceiverC17960h extends ResultReceiver {

    /* renamed from: b */
    public final /* synthetic */ C37929aO6 f73706b;

    /* renamed from: c */
    public final /* synthetic */ C39115cO6 f73707c;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        C44442lL6 c44442lL6;
        if (i == 1) {
            this.f73706b.m71485e(-1);
            c44442lL6 = this.f73707c.f60523g;
            c44442lL6.m27416a(null);
        } else if (i != 2) {
            this.f73706b.m71486d(new AssetPackException(-100));
        } else {
            this.f73706b.m71485e(0);
        }
    }
}
