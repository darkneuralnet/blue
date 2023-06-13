package co.bird.android.model.analytics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\u0004\u001a\u00020\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/model/analytics/PersistentPropertyEntry;", "", "type", "Lco/bird/android/model/analytics/PersistentType;", "value", "(Lco/bird/android/model/analytics/PersistentType;Ljava/lang/Object;)V", "name", "", "Lco/bird/android/model/analytics/AppName;", "Lco/bird/android/model/analytics/BluetoothState;", "Lco/bird/android/model/analytics/GooglePayEligible;", "Lco/bird/android/model/analytics/LastRideDate;", "Lco/bird/android/model/analytics/NetworkSubType;", "Lco/bird/android/model/analytics/NetworkType;", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public abstract class PersistentPropertyEntry {
    private final PersistentType type;
    private final Object value;

    public /* synthetic */ PersistentPropertyEntry(PersistentType persistentType, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(persistentType, obj);
    }

    public final String name() {
        return this.type.key();
    }

    public final Object value() {
        return this.value;
    }

    private PersistentPropertyEntry(PersistentType persistentType, Object obj) {
        this.type = persistentType;
        this.value = obj;
    }
}
