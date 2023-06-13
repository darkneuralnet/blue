package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.ResultReceiver;
/* renamed from: com.google.android.play.core.appupdate.b */
/* loaded from: classes6.dex */
final class ResultReceiverC17959b extends ResultReceiver {

    /* renamed from: b */
    public final /* synthetic */ C37929aO6 f73699b;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        C37929aO6 c37929aO6;
        int i2 = 1;
        if (i == 1) {
            c37929aO6 = this.f73699b;
            i2 = -1;
        } else if (i != 2) {
            c37929aO6 = this.f73699b;
        } else {
            c37929aO6 = this.f73699b;
            i2 = 0;
        }
        c37929aO6.m71485e(Integer.valueOf(i2));
    }
}
