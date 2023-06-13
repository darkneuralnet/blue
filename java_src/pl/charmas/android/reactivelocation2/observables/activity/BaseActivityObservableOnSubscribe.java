package pl.charmas.android.reactivelocation2.observables.activity;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.ActivityRecognition;
import com.google.android.gms.location.ActivityRecognitionClient;
import io.reactivex.InterfaceC24578y;
import pl.charmas.android.reactivelocation2.observables.BaseObservableOnSubscribe;
import pl.charmas.android.reactivelocation2.observables.ObservableContext;
/* loaded from: classes8.dex */
abstract class BaseActivityObservableOnSubscribe<T> extends BaseObservableOnSubscribe<T> {
    public BaseActivityObservableOnSubscribe(ObservableContext observableContext) {
        super(observableContext, ActivityRecognition.API);
    }

    public abstract void onActivityRecognitionClientReady(ActivityRecognitionClient activityRecognitionClient, InterfaceC24578y<? super T> interfaceC24578y);

    @Override // pl.charmas.android.reactivelocation2.observables.BaseObservableOnSubscribe
    public final void onGoogleApiClientReady(Context context, GoogleApiClient googleApiClient, InterfaceC24578y<? super T> interfaceC24578y) {
        onActivityRecognitionClientReady(ActivityRecognition.getClient(context), interfaceC24578y);
    }
}
