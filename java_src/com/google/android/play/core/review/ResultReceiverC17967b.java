package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
/* renamed from: com.google.android.play.core.review.b */
/* loaded from: classes6.dex */
final class ResultReceiverC17967b extends ResultReceiver {

    /* renamed from: b */
    public final /* synthetic */ C37929aO6 f73713b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultReceiverC17967b(Handler handler, C37929aO6 c37929aO6) {
        super(handler);
        this.f73713b = c37929aO6;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.f73713b.m71485e(null);
    }
}
