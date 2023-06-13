package pl.charmas.android.reactivelocation2.observables.activity;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.location.ActivityRecognitionClient;
import com.google.android.gms.location.ActivityRecognitionResult;
import io.reactivex.InterfaceC24578y;
import io.reactivex.Observable;
import pl.charmas.android.reactivelocation2.observables.ObservableContext;
import pl.charmas.android.reactivelocation2.observables.ObservableFactory;
/* loaded from: classes8.dex */
public class ActivityUpdatesObservableOnSubscribe extends BaseActivityObservableOnSubscribe<ActivityRecognitionResult> {
    private static final String ACTION_ACTIVITY_DETECTED = "pl.charmas.android.reactivelocation2.ACTION_ACTIVITY_UPDATE_DETECTED";
    private ActivityRecognitionClient activityRecognitionClient;
    private final Context context;
    private final int detectionIntervalMilliseconds;
    private ActivityUpdatesBroadcastReceiver receiver;

    /* loaded from: classes8.dex */
    public static class ActivityUpdatesBroadcastReceiver extends BroadcastReceiver {
        private final InterfaceC24578y<? super ActivityRecognitionResult> emitter;

        public ActivityUpdatesBroadcastReceiver(InterfaceC24578y<? super ActivityRecognitionResult> interfaceC24578y) {
            this.emitter = interfaceC24578y;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (ActivityRecognitionResult.hasResult(intent)) {
                this.emitter.onNext(ActivityRecognitionResult.extractResult(intent));
            }
        }
    }

    private ActivityUpdatesObservableOnSubscribe(ObservableContext observableContext, int i) {
        super(observableContext);
        this.context = observableContext.getContext();
        this.detectionIntervalMilliseconds = i;
    }

    public static Observable<ActivityRecognitionResult> createObservable(ObservableContext observableContext, ObservableFactory observableFactory, int i) {
        return observableFactory.createObservable(new ActivityUpdatesObservableOnSubscribe(observableContext, i));
    }

    private PendingIntent getReceiverPendingIntent() {
        return PendingIntent.getBroadcast(this.context, 0, new Intent(ACTION_ACTIVITY_DETECTED), 134217728);
    }

    @Override // pl.charmas.android.reactivelocation2.observables.activity.BaseActivityObservableOnSubscribe
    public void onActivityRecognitionClientReady(ActivityRecognitionClient activityRecognitionClient, InterfaceC24578y<? super ActivityRecognitionResult> interfaceC24578y) {
        this.activityRecognitionClient = activityRecognitionClient;
        ActivityUpdatesBroadcastReceiver activityUpdatesBroadcastReceiver = new ActivityUpdatesBroadcastReceiver(interfaceC24578y);
        this.receiver = activityUpdatesBroadcastReceiver;
        this.context.registerReceiver(activityUpdatesBroadcastReceiver, new IntentFilter(ACTION_ACTIVITY_DETECTED));
        activityRecognitionClient.requestActivityUpdates(this.detectionIntervalMilliseconds, getReceiverPendingIntent());
    }

    @Override // pl.charmas.android.reactivelocation2.observables.BaseObservableOnSubscribe
    public void onDisposed() {
        ActivityRecognitionClient activityRecognitionClient = this.activityRecognitionClient;
        if (activityRecognitionClient != null) {
            activityRecognitionClient.removeActivityTransitionUpdates(getReceiverPendingIntent());
        }
        ActivityUpdatesBroadcastReceiver activityUpdatesBroadcastReceiver = this.receiver;
        if (activityUpdatesBroadcastReceiver != null) {
            this.context.unregisterReceiver(activityUpdatesBroadcastReceiver);
            this.receiver = null;
        }
    }
}
