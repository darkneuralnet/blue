package androidx.test.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.test.internal.util.Checks;
/* loaded from: classes.dex */
class InstrumentationActivityInvoker {

    /* loaded from: classes.dex */
    public static class BootstrapActivity extends Activity {

        /* renamed from: d */
        public static final String f55707d = "androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity";

        /* renamed from: b */
        public final BroadcastReceiver f55708b = new BroadcastReceiver() { // from class: androidx.test.core.app.InstrumentationActivityInvoker.BootstrapActivity.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                BootstrapActivity.this.finishActivity(0);
                BootstrapActivity.this.finish();
            }
        };

        /* renamed from: c */
        public boolean f55709c;

        @Override // android.app.Activity
        public void finish() {
            super.finish();
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        public void onActivityResult(int i, int i2, Intent intent) {
            if (i == 0) {
                Intent intent2 = new Intent("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_RECEIVED");
                intent2.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_CODE_KEY", i2);
                if (intent != null) {
                    intent2.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_DATA_KEY", intent);
                }
                sendBroadcast(intent2);
                finish();
            }
        }

        @Override // android.app.Activity
        public void onCreate(Bundle bundle) {
            boolean z;
            super.onCreate(bundle);
            InstrumentationActivityInvoker.m66013b(this, this.f55708b, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_BOOTSTRAP_ACTIVITY"));
            if (bundle != null && bundle.getBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", false)) {
                z = true;
            } else {
                z = false;
            }
            this.f55709c = z;
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        public void onDestroy() {
            super.onDestroy();
            unregisterReceiver(this.f55708b);
        }

        @Override // android.app.Activity
        public void onResume() {
            super.onResume();
            if (!this.f55709c) {
                this.f55709c = true;
                PendingIntent pendingIntent = (PendingIntent) Checks.m66011a((PendingIntent) getIntent().getParcelableExtra("androidx.test.core.app.InstrumentationActivityInvoker.START_TARGET_ACTIVITY_INTENT_KEY"));
                Bundle bundleExtra = getIntent().getBundleExtra("androidx.test.core.app.InstrumentationActivityInvoker.TARGET_ACTIVITY_OPTIONS_BUNDLE_KEY");
                try {
                    if (bundleExtra != null) {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 0, null, 268435456, 0, 0, bundleExtra);
                    } else {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 0, null, 268435456, 0, 0);
                    }
                } catch (IntentSender.SendIntentException e) {
                    Log.e(f55707d, "Failed to start target activity.", e);
                    throw new RuntimeException(e);
                }
            }
        }

        @Override // android.app.Activity
        public void onSaveInstanceState(Bundle bundle) {
            super.onSaveInstanceState(bundle);
            bundle.putBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", this.f55709c);
        }
    }

    /* loaded from: classes.dex */
    public static class EmptyActivity extends Activity {

        /* renamed from: b */
        public final BroadcastReceiver f55711b = new BroadcastReceiver() { // from class: androidx.test.core.app.InstrumentationActivityInvoker.EmptyActivity.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                EmptyActivity.this.finish();
            }
        };

        @Override // android.app.Activity
        public void finish() {
            super.finish();
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            InstrumentationActivityInvoker.m66013b(this, this.f55711b, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_EMPTY_ACTIVITIES"));
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        public void onDestroy() {
            super.onDestroy();
            unregisterReceiver(this.f55711b);
        }

        @Override // android.app.Activity
        public void onResume() {
            super.onResume();
            sendBroadcast(new Intent("androidx.test.core.app.InstrumentationActivityInvoker.EMPTY_ACTIVITY_RESUMED"));
        }
    }

    /* loaded from: classes.dex */
    public static class EmptyFloatingActivity extends Activity {

        /* renamed from: b */
        public final BroadcastReceiver f55713b = new BroadcastReceiver() { // from class: androidx.test.core.app.InstrumentationActivityInvoker.EmptyFloatingActivity.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                EmptyFloatingActivity.this.finish();
            }
        };

        @Override // android.app.Activity
        public void finish() {
            super.finish();
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            InstrumentationActivityInvoker.m66013b(this, this.f55713b, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_EMPTY_ACTIVITIES"));
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        public void onDestroy() {
            super.onDestroy();
            unregisterReceiver(this.f55713b);
        }

        @Override // android.app.Activity
        public void onResume() {
            super.onResume();
            sendBroadcast(new Intent("androidx.test.core.app.InstrumentationActivityInvoker.EMPTY_FLOATING_ACTIVITY_RESUMED"));
        }
    }

    /* renamed from: b */
    public static void m66013b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 2);
        }
    }
}
