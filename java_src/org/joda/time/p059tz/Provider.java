package org.joda.time.p059tz;

import java.util.Set;
import org.joda.time.DateTimeZone;
/* renamed from: org.joda.time.tz.Provider */
/* loaded from: classes8.dex */
public interface Provider {
    Set<String> getAvailableIDs();

    DateTimeZone getZone(String str);
}
