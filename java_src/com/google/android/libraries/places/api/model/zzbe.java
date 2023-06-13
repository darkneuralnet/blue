package com.google.android.libraries.places.api.model;

import android.util.Log;
import com.google.android.libraries.places.api.model.Period;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzhu;
import com.google.android.libraries.places.internal.zzhv;
import com.google.android.libraries.places.internal.zzie;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class zzbe {
    private static final zzhv zza;
    private static final LocalTime zzb;

    static {
        zzhu zzhuVar = new zzhu();
        zzhuVar.zza(1, DayOfWeek.SUNDAY);
        zzhuVar.zza(2, DayOfWeek.MONDAY);
        zzhuVar.zza(3, DayOfWeek.TUESDAY);
        zzhuVar.zza(4, DayOfWeek.WEDNESDAY);
        zzhuVar.zza(5, DayOfWeek.THURSDAY);
        zzhuVar.zza(6, DayOfWeek.FRIDAY);
        zzhuVar.zza(7, DayOfWeek.SATURDAY);
        zza = zzhuVar.zzb();
        zzb = LocalTime.newInstance(23, 59);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Boolean zza(Place place, long j) {
        TimeZone timeZone;
        Place.BusinessStatus businessStatus = place.getBusinessStatus();
        OpeningHours openingHours = place.getOpeningHours();
        Integer utcOffsetMinutes = place.getUtcOffsetMinutes();
        if (businessStatus != null && businessStatus != Place.BusinessStatus.OPERATIONAL) {
            return Boolean.FALSE;
        }
        if (openingHours == null || utcOffsetMinutes == null) {
            return null;
        }
        List<Period> periods = openingHours.getPeriods();
        if (!periods.isEmpty()) {
            if (periods.size() == 1) {
                Period period = periods.get(0);
                TimeOfWeek open = period.getOpen();
                if (period.getClose() == null && open != null && open.getDay() == DayOfWeek.SUNDAY && open.getTime().getHours() == 0 && open.getTime().getMinutes() == 0) {
                    return Boolean.TRUE;
                }
            }
            for (Period period2 : periods) {
                if (period2.getOpen() == null || period2.getClose() == null) {
                    return null;
                }
                while (r2.hasNext()) {
                }
            }
            int intValue = utcOffsetMinutes.intValue();
            String[] availableIDs = TimeZone.getAvailableIDs((int) TimeUnit.MINUTES.toMillis(intValue));
            if (availableIDs != null && availableIDs.length > 0) {
                timeZone = TimeZone.getTimeZone(availableIDs[0]);
            } else {
                Log.w("Places", String.format("Cannot find timezone that associates with utcOffsetMinutes %d from Place object.", Integer.valueOf(intValue)));
                timeZone = null;
            }
            if (timeZone == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTimeInMillis(j);
            DayOfWeek dayOfWeek = (DayOfWeek) zza.get(Integer.valueOf(calendar.get(7)));
            LocalTime newInstance = LocalTime.newInstance(calendar.get(11), calendar.get(12));
            EnumMap enumMap = new EnumMap(DayOfWeek.class);
            if (!periods.isEmpty()) {
                Period period3 = periods.get(0);
                int i = 0;
                while (period3 != null) {
                    TimeOfWeek open2 = period3.getOpen();
                    TimeOfWeek close = period3.getClose();
                    if (open2 != null && close != null) {
                        DayOfWeek day = open2.getDay();
                        LocalTime time = open2.getTime();
                        if (open2.getDay() != close.getDay()) {
                            LocalTime localTime = zzb;
                            List list = (List) zzb(enumMap, day, new ArrayList());
                            list.add(zzie.zzc(time, localTime));
                            enumMap.put((EnumMap) day, (DayOfWeek) list);
                            TimeOfWeek newInstance2 = TimeOfWeek.newInstance(DayOfWeek.values()[(day.ordinal() + 1) % 7], LocalTime.newInstance(0, 0));
                            TimeOfWeek close2 = period3.getClose();
                            Period.Builder builder = Period.builder();
                            builder.setOpen(newInstance2);
                            builder.setClose(close2);
                            period3 = builder.build();
                        } else {
                            LocalTime time2 = close.getTime();
                            List list2 = (List) zzb(enumMap, day, new ArrayList());
                            list2.add(zzie.zzd(time, time2));
                            enumMap.put((EnumMap) day, (DayOfWeek) list2);
                            i++;
                            if (i < periods.size()) {
                                period3 = periods.get(i);
                            } else {
                                period3 = null;
                            }
                        }
                    } else {
                        i++;
                        if (i >= periods.size()) {
                            period3 = null;
                        } else {
                            period3 = periods.get(i);
                        }
                    }
                }
            }
            List<zzie> list3 = (List) enumMap.get(dayOfWeek);
            if (list3 == null) {
                return Boolean.FALSE;
            }
            for (zzie zzieVar : list3) {
                if (zzieVar.zze(newInstance)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        }
        return Boolean.FALSE;
    }

    private static Object zzb(Map map, Object obj, Object obj2) {
        if (map.containsKey(obj)) {
            return map.get(obj);
        }
        return obj2;
    }
}
