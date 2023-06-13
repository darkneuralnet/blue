package net.danlew.android.joda;

import android.content.Context;
import android.content.IntentFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.joda.time.DateTimeZone;
/* loaded from: classes8.dex */
public class JodaTimeInitializer implements E22<Object> {
    @Override // p000.E22
    public Object create(Context context) {
        try {
            DateTimeZone.setProvider(new ResourceZoneInfoProvider(context));
            context.getApplicationContext().registerReceiver(new TimeZoneChangedReceiver(), new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
            return new Object();
        } catch (IOException e) {
            throw new RuntimeException("Could not read ZoneInfoMap. You are probably using Proguard wrong.", e);
        }
    }

    @Override // p000.E22
    public List<Class<? extends E22<?>>> dependencies() {
        return Collections.emptyList();
    }
}
