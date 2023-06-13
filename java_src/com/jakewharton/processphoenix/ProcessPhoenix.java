package com.jakewharton.processphoenix;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes6.dex */
public final class ProcessPhoenix extends Activity {
    /* renamed from: a */
    public static boolean m45925a(Context context) {
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid && runningAppProcessInfo.processName.endsWith(":phoenix")) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public static void m45924b(Context context, Intent... intentArr) {
        if (intentArr.length >= 1) {
            intentArr[0].addFlags(268468224);
            Intent intent = new Intent(context, ProcessPhoenix.class);
            intent.addFlags(268435456);
            intent.putParcelableArrayListExtra("phoenix_restart_intents", new ArrayList<>(Arrays.asList(intentArr)));
            intent.putExtra("phoenix_main_process_pid", Process.myPid());
            context.startActivity(intent);
            return;
        }
        throw new IllegalArgumentException("intents cannot be empty");
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Process.killProcess(getIntent().getIntExtra("phoenix_main_process_pid", -1));
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("phoenix_restart_intents");
        startActivities((Intent[]) parcelableArrayListExtra.toArray(new Intent[parcelableArrayListExtra.size()]));
        finish();
        Runtime.getRuntime().exit(0);
    }
}
