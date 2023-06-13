package com.google.android.play.core.review;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
/* renamed from: com.google.android.play.core.review.c */
/* loaded from: classes6.dex */
public final class C17968c implements EO4 {

    /* renamed from: a */
    public final YN6 f73714a;

    /* renamed from: b */
    public final Handler f73715b = new Handler(Looper.getMainLooper());

    public C17968c(YN6 yn6) {
        this.f73714a = yn6;
    }

    @Override // p000.EO4
    @NonNull
    /* renamed from: a */
    public final XY5<ReviewInfo> mo48459a() {
        return this.f73714a.m75133a();
    }

    @Override // p000.EO4
    @NonNull
    /* renamed from: b */
    public final XY5<Void> mo48458b(@NonNull Activity activity, @NonNull ReviewInfo reviewInfo) {
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.mo48460a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        C37929aO6 c37929aO6 = new C37929aO6();
        intent.putExtra("result_receiver", new ResultReceiverC17967b(this.f73715b, c37929aO6));
        activity.startActivity(intent);
        return c37929aO6.m71487c();
    }
}
