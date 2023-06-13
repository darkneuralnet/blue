package com.stripe.android.paymentsheet.addresselement.analytics;

import com.stripe.android.core.networking.AnalyticsEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \t2\u00020\u0001:\u0003\t\n\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent;", "Lcom/stripe/android/core/networking/AnalyticsEvent;", "()V", "additionalParams", "", "", "", "getAdditionalParams", "()Ljava/util/Map;", "Companion", "Completed", "Show", "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent$Completed;", "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent$Show;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class AddressLauncherEvent implements AnalyticsEvent {
    public static final Companion Companion = new Companion(null);
    public static final String FIELD_ADDRESS_COUNTRY_CODE = "address_country_code";
    public static final String FIELD_ADDRESS_DATA_BLOB = "address_data_blob";
    public static final String FIELD_AUTO_COMPLETE_RESULT_SELECTED = "auto_complete_result_selected";
    public static final String FIELD_EDIT_DISTANCE = "edit_distance";

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent$Companion;", "", "()V", "FIELD_ADDRESS_COUNTRY_CODE", "", "FIELD_ADDRESS_DATA_BLOB", "FIELD_AUTO_COMPLETE_RESULT_SELECTED", "FIELD_EDIT_DISTANCE", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent$Completed;", "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent;", "country", "", "autocompleteResultSelected", "", "editDistance", "", "(Ljava/lang/String;ZLjava/lang/Integer;)V", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "getCountry", "()Ljava/lang/String;", "Ljava/lang/Integer;", "eventName", "getEventName", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Completed extends AddressLauncherEvent {
        public static final int $stable = 0;
        private final boolean autocompleteResultSelected;
        private final String country;
        private final Integer editDistance;
        private final String eventName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(String country, boolean z, Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(country, "country");
            this.country = country;
            this.autocompleteResultSelected = z;
            this.editDistance = num;
            this.eventName = "mc_address_completed";
        }

        @Override // com.stripe.android.paymentsheet.addresselement.analytics.AddressLauncherEvent
        public Map<String, Object> getAdditionalParams() {
            Map mutableMapOf;
            Map<String, Object> mapOf;
            mutableMapOf = MapsKt__MapsKt.mutableMapOf(TuplesKt.m28425to(AddressLauncherEvent.FIELD_ADDRESS_COUNTRY_CODE, this.country), TuplesKt.m28425to(AddressLauncherEvent.FIELD_AUTO_COMPLETE_RESULT_SELECTED, Boolean.valueOf(this.autocompleteResultSelected)));
            Integer num = this.editDistance;
            if (num != null) {
                mutableMapOf.put(AddressLauncherEvent.FIELD_EDIT_DISTANCE, Integer.valueOf(num.intValue()));
            }
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(AddressLauncherEvent.FIELD_ADDRESS_DATA_BLOB, mutableMapOf));
            return mapOf;
        }

        public final String getCountry() {
            return this.country;
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent$Show;", "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent;", "country", "", "(Ljava/lang/String;)V", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "getCountry", "()Ljava/lang/String;", "eventName", "getEventName", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Show extends AddressLauncherEvent {
        public static final int $stable = 0;
        private final String country;
        private final String eventName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Show(String country) {
            super(null);
            Intrinsics.checkNotNullParameter(country, "country");
            this.country = country;
            this.eventName = "mc_address_show";
        }

        @Override // com.stripe.android.paymentsheet.addresselement.analytics.AddressLauncherEvent
        public Map<String, Object> getAdditionalParams() {
            Map mapOf;
            Map<String, Object> mapOf2;
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(AddressLauncherEvent.FIELD_ADDRESS_COUNTRY_CODE, this.country));
            mapOf2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(AddressLauncherEvent.FIELD_ADDRESS_DATA_BLOB, mapOf));
            return mapOf2;
        }

        public final String getCountry() {
            return this.country;
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }
    }

    public /* synthetic */ AddressLauncherEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Map<String, Object> getAdditionalParams();

    private AddressLauncherEvent() {
    }
}
