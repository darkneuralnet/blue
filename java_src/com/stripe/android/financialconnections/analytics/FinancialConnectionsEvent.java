package com.stripe.android.financialconnections.analytics;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.exception.FinancialConnectionsError;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.utils.CollectionsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$B1\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0001\u0012%&'()*+,-./0123456¨\u00067"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;", "", "name", "", "params", "", "includePrefix", "", "(Ljava/lang/String;Ljava/util/Map;Z)V", "eventName", "getEventName", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "Click", "ClickDisconnectLink", "ClickDone", "ClickLearnMoreDataAccess", "ClickLinkAccounts", "ClickLinkAnotherAccount", "ClickNavBarBack", "ClickNavBarClose", "Complete", "ConsentAgree", "Error", "Exposure", "InstitutionSelected", "PaneLaunched", "PaneLoaded", "PollAccountsSucceeded", "PollAttachPaymentsSucceeded", "SearchSucceeded", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Click;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickDisconnectLink;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickDone;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickLearnMoreDataAccess;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickLinkAccounts;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickLinkAnotherAccount;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickNavBarBack;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickNavBarClose;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Complete;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ConsentAgree;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Error;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Exposure;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$InstitutionSelected;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$PaneLaunched;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$PaneLoaded;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$PollAccountsSucceeded;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$PollAttachPaymentsSucceeded;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$SearchSucceeded;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class FinancialConnectionsEvent {
    private final String eventName;
    private final boolean includePrefix;
    private final String name;
    private final Map<String, String> params;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Click;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;", "eventName", "", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Click extends FinancialConnectionsEvent {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Click(String eventName, FinancialConnectionsSessionManifest.Pane pane) {
            super(eventName, CollectionsKt.filterNotNullValues(r8), false, 4, null);
            Map mapOf;
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(pane, "pane");
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("pane", pane.getValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickDisconnectLink;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ClickDisconnectLink extends FinancialConnectionsEvent {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ClickDisconnectLink(FinancialConnectionsSessionManifest.Pane pane) {
            super("click.disconnect_link", CollectionsKt.filterNotNullValues(r8), false, 4, null);
            Map mapOf;
            Intrinsics.checkNotNullParameter(pane, "pane");
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("pane", pane.getValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickDone;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ClickDone extends FinancialConnectionsEvent {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ClickDone(FinancialConnectionsSessionManifest.Pane pane) {
            super("click.done", CollectionsKt.filterNotNullValues(r8), false, 4, null);
            Map mapOf;
            Intrinsics.checkNotNullParameter(pane, "pane");
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("pane", pane.getValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickLearnMoreDataAccess;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ClickLearnMoreDataAccess extends FinancialConnectionsEvent {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ClickLearnMoreDataAccess(FinancialConnectionsSessionManifest.Pane pane) {
            super("click.data_access.learn_more", CollectionsKt.filterNotNullValues(r8), false, 4, null);
            Map mapOf;
            Intrinsics.checkNotNullParameter(pane, "pane");
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("pane", pane.getValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickLinkAccounts;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ClickLinkAccounts extends FinancialConnectionsEvent {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ClickLinkAccounts(FinancialConnectionsSessionManifest.Pane pane) {
            super("click.link_accounts", CollectionsKt.filterNotNullValues(r8), false, 4, null);
            Map mapOf;
            Intrinsics.checkNotNullParameter(pane, "pane");
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("pane", pane.getValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickLinkAnotherAccount;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ClickLinkAnotherAccount extends FinancialConnectionsEvent {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ClickLinkAnotherAccount(FinancialConnectionsSessionManifest.Pane pane) {
            super("click.link_another_account", CollectionsKt.filterNotNullValues(r8), false, 4, null);
            Map mapOf;
            Intrinsics.checkNotNullParameter(pane, "pane");
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("pane", pane.getValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickNavBarBack;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ClickNavBarBack extends FinancialConnectionsEvent {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ClickNavBarBack(FinancialConnectionsSessionManifest.Pane pane) {
            super("click.nav_bar.back", CollectionsKt.filterNotNullValues(r8), false, 4, null);
            Map mapOf;
            Intrinsics.checkNotNullParameter(pane, "pane");
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("pane", pane.getValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ClickNavBarClose;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ClickNavBarClose extends FinancialConnectionsEvent {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ClickNavBarClose(FinancialConnectionsSessionManifest.Pane pane) {
            super("click.nav_bar.close", CollectionsKt.filterNotNullValues(r8), false, 4, null);
            Map mapOf;
            Intrinsics.checkNotNullParameter(pane, "pane");
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("pane", pane.getValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Complete;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;", "exception", "", "connectedAccounts", "", "(Ljava/lang/Throwable;Ljava/lang/Integer;)V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Complete extends FinancialConnectionsEvent {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Complete(Throwable th, Integer num) {
            super("complete", CollectionsKt.filterNotNullValues(r7), false, 4, null);
            String str;
            String str2;
            Map mapOf;
            Map<String, String> emptyMap;
            Map plus;
            Pair[] pairArr = new Pair[2];
            if (num != null) {
                str = num.toString();
            } else {
                str = null;
            }
            pairArr[0] = TuplesKt.m28425to("num_linked_accounts", str);
            if (th == null) {
                str2 = "object";
            } else {
                str2 = "error";
            }
            pairArr[1] = TuplesKt.m28425to("type", str2);
            mapOf = MapsKt__MapsKt.mapOf(pairArr);
            plus = MapsKt__MapsKt.plus(mapOf, (th == null || (emptyMap = AnalyticsMappersKt.toEventParams(th)) == null) ? MapsKt__MapsKt.emptyMap() : emptyMap);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ConsentAgree;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ConsentAgree extends FinancialConnectionsEvent {
        public static final int $stable = 0;
        public static final ConsentAgree INSTANCE = new ConsentAgree();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ConsentAgree() {
            super("click.agree", r2, false, 4, null);
            Map mapOf;
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("pane", FinancialConnectionsSessionManifest.Pane.CONSENT.getValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Error;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "exception", "", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/Throwable;)V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Error extends FinancialConnectionsEvent {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Error(FinancialConnectionsSessionManifest.Pane pane, Throwable exception) {
            super(r1, CollectionsKt.filterNotNullValues(r9), false, 4, null);
            String str;
            Map mapOf;
            Map plus;
            Intrinsics.checkNotNullParameter(pane, "pane");
            Intrinsics.checkNotNullParameter(exception, "exception");
            if (exception instanceof FinancialConnectionsError) {
                str = "error.expected";
            } else {
                str = "error.unexpected";
            }
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("pane", pane.getValue()));
            plus = MapsKt__MapsKt.plus(mapOf, AnalyticsMappersKt.toEventParams(exception));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Exposure;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;", "experimentName", "", "assignmentEventId", "accountHolderId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Exposure extends FinancialConnectionsEvent {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Exposure(String experimentName, String assignmentEventId, String accountHolderId) {
            super("preloaded_experiment_retrieved", CollectionsKt.filterNotNullValues(r3), false, null);
            Map mapOf;
            Intrinsics.checkNotNullParameter(experimentName, "experimentName");
            Intrinsics.checkNotNullParameter(assignmentEventId, "assignmentEventId");
            Intrinsics.checkNotNullParameter(accountHolderId, "accountHolderId");
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("experiment_retrieved", experimentName), TuplesKt.m28425to("arb_id", assignmentEventId), TuplesKt.m28425to("account_holder_id", accountHolderId));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$InstitutionSelected;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "fromFeatured", "", "institutionId", "", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLjava/lang/String;)V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class InstitutionSelected extends FinancialConnectionsEvent {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public InstitutionSelected(FinancialConnectionsSessionManifest.Pane pane, boolean z, String institutionId) {
            super(r9, CollectionsKt.filterNotNullValues(r8), false, 4, null);
            String str;
            Map mapOf;
            Intrinsics.checkNotNullParameter(pane, "pane");
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            if (z) {
                str = "search.featured_institution_selected";
            } else {
                str = "search.search_result_selected";
            }
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("pane", pane.getValue()), TuplesKt.m28425to("institution_id", institutionId));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$PaneLaunched;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class PaneLaunched extends FinancialConnectionsEvent {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public PaneLaunched(FinancialConnectionsSessionManifest.Pane pane) {
            super("pane.launched", CollectionsKt.filterNotNullValues(r8), false, 4, null);
            Map mapOf;
            Intrinsics.checkNotNullParameter(pane, "pane");
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("pane", pane.getValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$PaneLoaded;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class PaneLoaded extends FinancialConnectionsEvent {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public PaneLoaded(FinancialConnectionsSessionManifest.Pane pane) {
            super("pane.loaded", CollectionsKt.filterNotNullValues(r8), false, 4, null);
            Map mapOf;
            Intrinsics.checkNotNullParameter(pane, "pane");
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("pane", pane.getValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$PollAccountsSucceeded;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;", "authSessionId", "", "duration", "", "(Ljava/lang/String;J)V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class PollAccountsSucceeded extends FinancialConnectionsEvent {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public PollAccountsSucceeded(String authSessionId, long j) {
            super("polling.accounts.success", CollectionsKt.filterNotNullValues(r8), false, 4, null);
            Map mapOf;
            Intrinsics.checkNotNullParameter(authSessionId, "authSessionId");
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("authSessionId", authSessionId), TuplesKt.m28425to("duration", String.valueOf(j)));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$PollAttachPaymentsSucceeded;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;", "authSessionId", "", "duration", "", "(Ljava/lang/String;J)V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class PollAttachPaymentsSucceeded extends FinancialConnectionsEvent {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public PollAttachPaymentsSucceeded(String authSessionId, long j) {
            super("polling.attachPayment.success", CollectionsKt.filterNotNullValues(r8), false, 4, null);
            Map mapOf;
            Intrinsics.checkNotNullParameter(authSessionId, "authSessionId");
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("authSessionId", authSessionId), TuplesKt.m28425to("duration", String.valueOf(j)));
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$SearchSucceeded;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "query", "", "duration", "", "resultCount", "", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;JI)V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class SearchSucceeded extends FinancialConnectionsEvent {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public SearchSucceeded(FinancialConnectionsSessionManifest.Pane pane, String query, long j, int i) {
            super("search.succeeded", CollectionsKt.filterNotNullValues(r9), false, 4, null);
            Map mapOf;
            Intrinsics.checkNotNullParameter(pane, "pane");
            Intrinsics.checkNotNullParameter(query, "query");
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("pane", pane.getValue()), TuplesKt.m28425to("query", query), TuplesKt.m28425to("duration", String.valueOf(j)), TuplesKt.m28425to("result_count", String.valueOf(i)));
        }
    }

    public /* synthetic */ FinancialConnectionsEvent(String str, Map map, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, z);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent");
        FinancialConnectionsEvent financialConnectionsEvent = (FinancialConnectionsEvent) obj;
        if (Intrinsics.areEqual(this.name, financialConnectionsEvent.name) && Intrinsics.areEqual(this.params, financialConnectionsEvent.params) && this.includePrefix == financialConnectionsEvent.includePrefix && Intrinsics.areEqual(this.eventName, financialConnectionsEvent.eventName)) {
            return true;
        }
        return false;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public int hashCode() {
        int i;
        int hashCode = this.name.hashCode() * 31;
        Map<String, String> map = this.params;
        if (map != null) {
            i = map.hashCode();
        } else {
            i = 0;
        }
        return ((((hashCode + i) * 31) + Boolean.hashCode(this.includePrefix)) * 31) + this.eventName.hashCode();
    }

    public String toString() {
        String str = this.name;
        Map<String, String> map = this.params;
        return "FinancialConnectionsEvent(name='" + str + "', params=" + map + ")";
    }

    private FinancialConnectionsEvent(String str, Map<String, String> map, boolean z) {
        this.name = str;
        this.params = map;
        this.includePrefix = z;
        if (z) {
            str = "linked_accounts." + str;
        }
        this.eventName = str;
    }

    public /* synthetic */ FinancialConnectionsEvent(String str, Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? true : z, null);
    }
}
