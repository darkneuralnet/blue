package com.appboy.enums;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m28432d2 = {"Lcom/appboy/enums/NotificationSubscriptionType;", "", "LaP1;", "", "forJsonPut", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "OPTED_IN", "SUBSCRIBED", "UNSUBSCRIBED", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* loaded from: classes.dex */
public enum NotificationSubscriptionType implements InterfaceC37933aP1<String> {
    OPTED_IN("opted_in"),
    SUBSCRIBED("subscribed"),
    UNSUBSCRIBED("unsubscribed");
    
    public static final Companion Companion = new Companion(null);
    private static final Map<String, NotificationSubscriptionType> map;
    private final String key;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/appboy/enums/NotificationSubscriptionType$Companion;", "", "()V", "map", "", "", "Lcom/appboy/enums/NotificationSubscriptionType;", "fromValue", "value", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final NotificationSubscriptionType fromValue(String str) {
            String lowerCase;
            Map map = NotificationSubscriptionType.map;
            if (str == null) {
                lowerCase = null;
            } else {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                lowerCase = str.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            }
            if (lowerCase == null) {
                lowerCase = "";
            }
            Object obj = map.get(lowerCase);
            return obj != null ? obj : null;
        }

        private Companion() {
        }
    }

    static {
        int mapCapacity;
        int coerceAtLeast;
        int i = 0;
        NotificationSubscriptionType[] values = values();
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(values.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        int length = values.length;
        while (i < length) {
            NotificationSubscriptionType notificationSubscriptionType = values[i];
            i++;
            linkedHashMap.put(notificationSubscriptionType.getKey(), notificationSubscriptionType);
        }
        map = linkedHashMap;
    }

    NotificationSubscriptionType(String str) {
        this.key = str;
    }

    public final String getKey() {
        return this.key;
    }

    @Override // p000.InterfaceC37933aP1
    public String forJsonPut() {
        return this.key;
    }
}
