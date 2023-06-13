package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* renamed from: kQ6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43894kQ6 extends NA0 {
    @Deprecated
    /* renamed from: o */
    public static Intent m28975o(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i;
        Intent registerReceiver;
        if (C43301jQ6.m30639a()) {
            if (true != C43301jQ6.m30639a()) {
                i = 0;
            } else {
                i = 2;
            }
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, i);
            return registerReceiver;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
