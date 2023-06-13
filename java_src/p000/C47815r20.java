package p000;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferService;
import com.appboy.Appboy;
import com.appboy.BrazeInternal;
import com.appboy.enums.Channel;
import com.appboy.models.push.BrazeNotificationPayload;
import com.braze.push.BrazeAmazonDeviceMessagingReceiver;
import com.braze.push.BrazePushReceiver;
import com.braze.push.NotificationTrampolineActivity;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C38054ac3;
import p000.C38310b20;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u00015B\t\b\u0002¢\u0006\u0004\b]\u0010OJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\f\u0010\u000b\u001a\u00020\n*\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0007J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J.\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0007J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\"\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010#\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\"\u0010%\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J\"\u0010&\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J\u0018\u0010(\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 H\u0007J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010*\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010+\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010,\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010-\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010.\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010/\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u00100\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u00101\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0010\u00103\u001a\u00020\n2\u0006\u00102\u001a\u00020\u0015H\u0007J\u0018\u00104\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u00105\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0007J\u0010\u00106\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007J\u0010\u00108\u001a\u0002072\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u00109\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010:\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010;\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010<\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u001c\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010>\u001a\u00020=2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J\"\u0010C\u001a\u00020B2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010A\u001a\u0002072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\"\u0010F\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010E\u001a\u00020D2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\"\u0010H\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002R\u0014\u0010K\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR \u0010P\u001a\u0002078\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0019\u0010J\u0012\u0004\bN\u0010O\u001a\u0004\bL\u0010MR \u0010S\u001a\u0002078\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u001a\u0010J\u0012\u0004\bR\u0010O\u001a\u0004\bQ\u0010MR \u0010W\u001a\u0002078\u0006X\u0087D¢\u0006\u0012\n\u0004\bT\u0010J\u0012\u0004\bV\u0010O\u001a\u0004\bU\u0010MR\u0011\u0010Z\u001a\u00020X8G¢\u0006\u0006\u001a\u0004\bI\u0010YR\u0015\u0010\\\u001a\u0006\u0012\u0002\b\u00030\u00138G¢\u0006\u0006\u001a\u0004\bT\u0010[¨\u0006^"}, m28432d2 = {"Lr20;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "intent", "", "l", "k", "t", "", "n", "o", "Landroid/os/Bundle;", "notificationExtras", "x", "Lcom/appboy/models/push/BrazeNotificationPayload;", "payload", "s", "Ljava/lang/Class;", "thisClass", "", "notificationId", "durationInMillis", "F", "c", DateTokenConverter.CONVERTER_KEY, "LX10;", "configurationProvider", "P", "Q", "r", "Lac3$e;", "notificationBuilder", "N", "A", "M", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "appConfigurationProvider", "J", "I", "D", "K", "L", "G", "y", "z", "O", "H", "visibility", "q", "i", C17296a.f69688o, "p", "", "f", "E", "m", "j", "u", "Landroid/app/NotificationManager;", "notificationManager", "Landroid/app/NotificationChannel;", "h", "action", "Landroid/app/PendingIntent;", "g", "Lr20$a;", "broadcastType", "v", "pushIntent", "w", "b", "Ljava/lang/String;", "TAG", "getAPPBOY_NOTIFICATION_OPENED_SUFFIX", "()Ljava/lang/String;", "getAPPBOY_NOTIFICATION_OPENED_SUFFIX$annotations", "()V", "APPBOY_NOTIFICATION_OPENED_SUFFIX", "getAPPBOY_NOTIFICATION_RECEIVED_SUFFIX", "getAPPBOY_NOTIFICATION_RECEIVED_SUFFIX$annotations", "APPBOY_NOTIFICATION_RECEIVED_SUFFIX", "e", "getAPPBOY_NOTIFICATION_DELETED_SUFFIX", "getAPPBOY_NOTIFICATION_DELETED_SUFFIX$annotations", "APPBOY_NOTIFICATION_DELETED_SUFFIX", "LfO1;", "()LfO1;", "activeNotificationFactory", "()Ljava/lang/Class;", "notificationReceiverClass", "<init>", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: r20  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47815r20 {

    /* renamed from: a */
    public static final C47815r20 f106239a = new C47815r20();

    /* renamed from: b */
    public static final String f106240b = C43664k20.m29433n(C47815r20.class);

    /* renamed from: c */
    public static final String f106241c = ".intent.APPBOY_NOTIFICATION_OPENED";

    /* renamed from: d */
    public static final String f106242d = ".intent.APPBOY_PUSH_RECEIVED";

    /* renamed from: e */
    public static final String f106243e = ".intent.APPBOY_PUSH_DELETED";

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$A */
    /* loaded from: classes2.dex */
    public static final class C27758A extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27758A f106244g = new C27758A();

        public C27758A() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Geofence sync key not included in push payload or false. Not syncing geofences.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$B */
    /* loaded from: classes2.dex */
    public static final class C27759B extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f106245g;

        /* renamed from: h */
        public final /* synthetic */ boolean f106246h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27759B(String str, boolean z) {
            super(0);
            this.f106245g = str;
            this.f106246h = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Found a deep link: " + ((Object) this.f106245g) + ". Use webview set to: " + this.f106246h;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$C */
    /* loaded from: classes2.dex */
    public static final class C27760C extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Intent f106247g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27760C(Intent intent) {
            super(0);
            this.f106247g = intent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Push notification had no deep link. Opening main activity: ", this.f106247g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$D */
    /* loaded from: classes2.dex */
    public static final class C27761D extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27761D f106248g = new C27761D();

        public C27761D() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Sending notification opened broadcast";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$E */
    /* loaded from: classes2.dex */
    public static final class C27762E extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ EnumC27784a f106249g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27762E(EnumC27784a enumC27784a) {
            super(0);
            this.f106249g = enumC27784a;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Sending original Appboy broadcast receiver intent for ", this.f106249g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$F */
    /* loaded from: classes2.dex */
    public static final class C27763F extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ EnumC27784a f106250g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27763F(EnumC27784a enumC27784a) {
            super(0);
            this.f106250g = enumC27784a;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Sending Braze broadcast receiver intent for ", this.f106250g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$G */
    /* loaded from: classes2.dex */
    public static final class C27764G extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Intent f106251g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27764G(Intent intent) {
            super(0);
            this.f106251g = intent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Sending push action intent: ", this.f106251g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$H */
    /* loaded from: classes2.dex */
    public static final class C27765H extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27765H f106252g = new C27765H();

        public C27765H() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Sending push message received broadcast";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$I */
    /* loaded from: classes2.dex */
    public static final class C27766I extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27766I f106253g = new C27766I();

        public C27766I() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Using accent color for notification from extras bundle";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$J */
    /* loaded from: classes2.dex */
    public static final class C27767J extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27767J f106254g = new C27767J();

        public C27767J() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Using default accent color for notification";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$K */
    /* loaded from: classes2.dex */
    public static final class C27768K extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27768K f106255g = new C27768K();

        public C27768K() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting category for notification";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$L */
    /* loaded from: classes2.dex */
    public static final class C27769L extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27769L f106256g = new C27769L();

        public C27769L() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Category not present in notification extras. Not setting category for notification.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$M */
    /* loaded from: classes2.dex */
    public static final class C27770M extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27770M f106257g = new C27770M();

        public C27770M() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting content for notification";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$N */
    /* loaded from: classes2.dex */
    public static final class C27771N extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27771N f106258g = new C27771N();

        public C27771N() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Error setting content intent.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$O */
    /* loaded from: classes2.dex */
    public static final class C27772O extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27772O f106259g = new C27772O();

        public C27772O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Error setting delete intent.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$P */
    /* loaded from: classes2.dex */
    public static final class C27773P extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27773P f106260g = new C27773P();

        public C27773P() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Large icon not supported in story push.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$Q */
    /* loaded from: classes2.dex */
    public static final class C27774Q extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27774Q f106261g = new C27774Q();

        public C27774Q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting large icon for notification";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$R */
    /* loaded from: classes2.dex */
    public static final class C27775R extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27775R f106262g = new C27775R();

        public C27775R() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Large icon bitmap url not present in extras. Attempting to use resource id instead.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$S */
    /* loaded from: classes2.dex */
    public static final class C27776S extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27776S f106263g = new C27776S();

        public C27776S() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Large icon resource id not present for notification";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$T */
    /* loaded from: classes2.dex */
    public static final class C27777T extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27777T f106264g = new C27777T();

        public C27777T() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Error setting large notification icon";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$U */
    /* loaded from: classes2.dex */
    public static final class C27778U extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27778U f106265g = new C27778U();

        public C27778U() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Large icon not set for notification";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$V */
    /* loaded from: classes2.dex */
    public static final class C27779V extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27779V f106266g = new C27779V();

        public C27779V() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Notification badge number not supported on this android version. Not setting badge number for notification.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$W */
    /* loaded from: classes2.dex */
    public static final class C27780W extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f106267g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27780W(int i) {
            super(0);
            this.f106267g = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting Notification duration alarm for " + this.f106267g + " ms";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$X */
    /* loaded from: classes2.dex */
    public static final class C27781X extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27781X f106268g = new C27781X();

        public C27781X() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting priority for notification";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$Y */
    /* loaded from: classes2.dex */
    public static final class C27782Y extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ BrazeNotificationPayload f106269g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27782Y(BrazeNotificationPayload brazeNotificationPayload) {
            super(0);
            this.f106269g = brazeNotificationPayload;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Setting public version of notification with payload: ", this.f106269g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$Z */
    /* loaded from: classes2.dex */
    public static final class C27783Z extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27783Z f106270g = new C27783Z();

        public C27783Z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Set show when not supported in story push.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"Lr20$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: r20$a */
    /* loaded from: classes2.dex */
    public enum EnumC27784a {
        OPENED,
        RECEIVED,
        DELETED
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$a0 */
    /* loaded from: classes2.dex */
    public static final class C27785a0 extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27785a0 f106275g = new C27785a0();

        public C27785a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Small notification icon resource was not found. Will use the app icon when displaying notifications.";
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C27786b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC27784a.values().length];
            iArr[EnumC27784a.OPENED.ordinal()] = 1;
            iArr[EnumC27784a.RECEIVED.ordinal()] = 2;
            iArr[EnumC27784a.DELETED.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$b0 */
    /* loaded from: classes2.dex */
    public static final class C27787b0 extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27787b0 f106276g = new C27787b0();

        public C27787b0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting small icon for notification via resource id";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$c */
    /* loaded from: classes2.dex */
    public static final class C27788c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f106277g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27788c(int i) {
            super(0);
            this.f106277g = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Cancelling notification action with id: ", Integer.valueOf(this.f106277g));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$c0 */
    /* loaded from: classes2.dex */
    public static final class C27789c0 extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27789c0 f106278g = new C27789c0();

        public C27789c0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting default sound for notification.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$d */
    /* loaded from: classes2.dex */
    public static final class C27790d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27790d f106279g = new C27790d();

        public C27790d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Exception occurred attempting to cancel notification.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$d0 */
    /* loaded from: classes2.dex */
    public static final class C27791d0 extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27791d0 f106280g = new C27791d0();

        public C27791d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting sound for notification via uri.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$e */
    /* loaded from: classes2.dex */
    public static final class C27792e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Integer f106281g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27792e(Integer num) {
            super(0);
            this.f106281g = num;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Using notification id provided in the message's extras bundle: ", this.f106281g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$e0 */
    /* loaded from: classes2.dex */
    public static final class C27793e0 extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27793e0 f106282g = new C27793e0();

        public C27793e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting summary text for notification";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$f */
    /* loaded from: classes2.dex */
    public static final class C27794f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f106283g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27794f(int i) {
            super(0);
            this.f106283g = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Message without notification id provided in the extras bundle received. Using a hash of the message: ", Integer.valueOf(this.f106283g));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$f0 */
    /* loaded from: classes2.dex */
    public static final class C27795f0 extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27795f0 f106284g = new C27795f0();

        public C27795f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Summary text not present. Not setting summary text for notification.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$g */
    /* loaded from: classes2.dex */
    public static final class C27796g extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Integer f106285g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27796g(Integer num) {
            super(0);
            this.f106285g = num;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Received invalid notification priority ", this.f106285g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$g0 */
    /* loaded from: classes2.dex */
    public static final class C27797g0 extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27797g0 f106286g = new C27797g0();

        public C27797g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting ticker for notification";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$h */
    /* loaded from: classes2.dex */
    public static final class C27798h extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f106287g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27798h(String str) {
            super(0);
            this.f106287g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Found notification channel in extras with id: ", this.f106287g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$h0 */
    /* loaded from: classes2.dex */
    public static final class C27799h0 extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27799h0 f106288g = new C27799h0();

        public C27799h0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting title for notification";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$i */
    /* loaded from: classes2.dex */
    public static final class C27800i extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f106289g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27800i(String str) {
            super(0);
            this.f106289g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Notification channel from extras is invalid. No channel found with id: ", this.f106289g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$i0 */
    /* loaded from: classes2.dex */
    public static final class C27801i0 extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27801i0 f106290g = new C27801i0();

        public C27801i0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting visibility for notification";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$j */
    /* loaded from: classes2.dex */
    public static final class C27802j extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27802j f106291g = new C27802j();

        public C27802j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Braze default notification channel does not exist on device. Creating default channel.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$j0 */
    /* loaded from: classes2.dex */
    public static final class C27803j0 extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Integer f106292g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27803j0(Integer num) {
            super(0);
            this.f106292g = num;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Received invalid notification visibility ", this.f106292g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$k */
    /* loaded from: classes2.dex */
    public static final class C27804k extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27804k f106293g = new C27804k();

        public C27804k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Notification extras bundle was null. Could not find a valid notification channel";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$k0 */
    /* loaded from: classes2.dex */
    public static final class C27805k0 extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27805k0 f106294g = new C27805k0();

        public C27805k0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Not waking this TV UI mode device";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$l */
    /* loaded from: classes2.dex */
    public static final class C27806l extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f106295g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27806l(String str) {
            super(0);
            this.f106295g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Found notification channel in extras with id: ", this.f106295g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$l0 */
    /* loaded from: classes2.dex */
    public static final class C27807l0 extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27807l0 f106296g = new C27807l0();

        public C27807l0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to check for TV status during screen wake. Continuing.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$m */
    /* loaded from: classes2.dex */
    public static final class C27808m extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f106297g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27808m(String str) {
            super(0);
            this.f106297g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Notification channel from extras is invalid, no channel found with id: ", this.f106297g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$m0 */
    /* loaded from: classes2.dex */
    public static final class C27809m0 extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27809m0 f106298g = new C27809m0();

        public C27809m0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Not waking screen on Android O+ device, could not find notification channel.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$n */
    /* loaded from: classes2.dex */
    public static final class C27810n extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27810n f106299g = new C27810n();

        public C27810n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Braze default notification channel does not exist on device.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$n0 */
    /* loaded from: classes2.dex */
    public static final class C27811n0 extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ NotificationChannel f106300g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27811n0(NotificationChannel notificationChannel) {
            super(0);
            this.f106300g = notificationChannel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            int importance;
            importance = this.f106300g.getImportance();
            return Intrinsics.stringPlus("Not acquiring wake-lock for Android O+ notification with importance: ", Integer.valueOf(importance));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$o */
    /* loaded from: classes2.dex */
    public static final class C27812o extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f106301g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27812o(int i) {
            super(0);
            this.f106301g = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Cancelling notification action with id: ", Integer.valueOf(this.f106301g));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$o0 */
    /* loaded from: classes2.dex */
    public static final class C27813o0 extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27813o0 f106302g = new C27813o0();

        public C27813o0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Waking screen for notification";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$p */
    /* loaded from: classes2.dex */
    public static final class C27814p extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27814p f106303g = new C27814p();

        public C27814p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Exception occurred handling cancel notification intent.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$q */
    /* loaded from: classes2.dex */
    public static final class C27815q extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f106304g;

        /* renamed from: h */
        public final /* synthetic */ String f106305h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27815q(String str, String str2) {
            super(0);
            this.f106304g = str;
            this.f106305h = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Push contains associated Content Cards card. User id: " + ((Object) this.f106304g) + " Card data: " + ((Object) this.f106305h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$r */
    /* loaded from: classes2.dex */
    public static final class C27816r extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27816r f106306g = new C27816r();

        public C27816r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Sending notification deleted broadcast";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$s */
    /* loaded from: classes2.dex */
    public static final class C27817s extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27817s f106307g = new C27817s();

        public C27817s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Exception occurred attempting to handle notification delete intent.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$t */
    /* loaded from: classes2.dex */
    public static final class C27818t extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27818t f106308g = new C27818t();

        public C27818t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Not handling deep links automatically, skipping deep link handling";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$u */
    /* loaded from: classes2.dex */
    public static final class C27819u extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27819u f106309g = new C27819u();

        public C27819u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Exception occurred attempting to handle notification opened intent.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$v */
    /* loaded from: classes2.dex */
    public static final class C27820v extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f106310g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27820v(String str) {
            super(0);
            this.f106310g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Not handling deep links automatically, skipping deep link handling for '" + ((Object) this.f106310g) + CoreConstants.SINGLE_QUOTE_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$w */
    /* loaded from: classes2.dex */
    public static final class C27821w extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27821w f106311g = new C27821w();

        public C27821w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Caught exception while handling story click.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$x */
    /* loaded from: classes2.dex */
    public static final class C27822x extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27822x f106312g = new C27822x();

        public C27822x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to determine if push is uninstall tracking. Returning false.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$y */
    /* loaded from: classes2.dex */
    public static final class C27823y extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f106313g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27823y(String str) {
            super(0);
            this.f106313g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Pre-fetching bitmap at URL: ", this.f106313g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r20$z */
    /* loaded from: classes2.dex */
    public static final class C27824z extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27824z f106314g = new C27824z();

        public C27824z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Geofence sync key was true. Syncing geofences.";
        }
    }

    private C47815r20() {
    }

    @JvmStatic
    /* renamed from: A */
    public static final void m16623A(C38054ac3.C10770e notificationBuilder, BrazeNotificationPayload payload) {
        X10 configurationProvider;
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27770M.f106257g, 7, null);
        String contentText = payload.getContentText();
        if (contentText == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return;
        }
        notificationBuilder.m71048l(C51569xN1.m5358a(contentText, configurationProvider));
    }

    @JvmStatic
    /* renamed from: B */
    public static final void m16622B(Context context, C38054ac3.C10770e notificationBuilder, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        try {
            notificationBuilder.m71049k(f106239a.m16600g(context, "com.appboy.action.APPBOY_PUSH_CLICKED", bundle));
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, C43664k20.EnumC25082a.E, e, false, C27771N.f106258g, 4, null);
        }
    }

    @JvmStatic
    /* renamed from: C */
    public static final void m16621C(Context context, C38054ac3.C10770e notificationBuilder, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        try {
            Intent intent = new Intent("com.appboy.action.APPBOY_PUSH_DELETED").setClass(context, m16602e());
            Intrinsics.checkNotNullExpressionValue(intent, "Intent(Constants.BRAZE_P…otificationReceiverClass)");
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            notificationBuilder.m71043q(PendingIntent.getBroadcast(context, C38352b62.m64968e(), intent, C38352b62.m64971b() | 1073741824));
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, C43664k20.EnumC25082a.E, e, false, C27772O.f106259g, 4, null);
        }
    }

    @JvmStatic
    /* renamed from: D */
    public static final boolean m16620D(C38054ac3.C10770e notificationBuilder, BrazeNotificationPayload payload) {
        X10 configurationProvider;
        C43664k20 c43664k20;
        C47815r20 c47815r20;
        String largeIcon;
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.isPushStory()) {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27773P.f106260g, 7, null);
            return false;
        }
        Context context = payload.getContext();
        if (context == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return false;
        }
        try {
            c43664k20 = C43664k20.f93782a;
            c47815r20 = f106239a;
            C43664k20.m29442e(c43664k20, c47815r20, null, null, false, C27774Q.f106261g, 7, null);
            largeIcon = payload.getLargeIcon();
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, C43664k20.EnumC25082a.E, e, false, C27777T.f106264g, 4, null);
        }
        if (largeIcon == null) {
            C43664k20.m29442e(c43664k20, c47815r20, null, null, false, C27775R.f106262g, 7, null);
            int largeNotificationIconResourceId = configurationProvider.getLargeNotificationIconResourceId();
            if (largeNotificationIconResourceId != 0) {
                notificationBuilder.m71041s(BitmapFactory.decodeResource(context.getResources(), largeNotificationIconResourceId));
                return true;
            }
            C43664k20.m29442e(c43664k20, c47815r20, null, null, false, C27776S.f106263g, 7, null);
            C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27778U.f106265g, 7, null);
            return false;
        }
        notificationBuilder.m71041s(P10.getInstance(context).getImageLoader().mo10195e(context, null, largeIcon, EnumC50778w20.NOTIFICATION_LARGE_ICON));
        return true;
    }

    @JvmStatic
    /* renamed from: E */
    public static final void m16619E(C38054ac3.C10770e notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (Build.VERSION.SDK_INT < 26) {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27779V.f106266g, 7, null);
            return;
        }
        Integer notificationBadgeNumber = payload.getNotificationBadgeNumber();
        if (notificationBadgeNumber != null) {
            notificationBuilder.m71038v(notificationBadgeNumber.intValue());
        }
    }

    @JvmStatic
    /* renamed from: F */
    public static final void m16618F(Context context, Class<?> cls, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, cls);
        intent.setAction("com.appboy.action.CANCEL_NOTIFICATION");
        intent.putExtra("nid", i);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 134217728 | C38352b62.m64971b());
        Object systemService = context.getSystemService("alarm");
        if (systemService != null) {
            AlarmManager alarmManager = (AlarmManager) systemService;
            if (i2 >= 1000) {
                C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, new C27780W(i2), 7, null);
                alarmManager.set(3, SystemClock.elapsedRealtime() + i2, broadcast);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.AlarmManager");
    }

    @JvmStatic
    /* renamed from: G */
    public static final void m16617G(C38054ac3.C10770e notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27781X.f106268g, 7, null);
        notificationBuilder.m71036x(m16603d(payload));
    }

    @JvmStatic
    /* renamed from: H */
    public static final void m16616H(C38054ac3.C10770e notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Context context = payload.getContext();
        X10 configurationProvider = payload.getConfigurationProvider();
        if (context != null && payload.getPublicNotificationExtras() != null && configurationProvider != null) {
            String m16601f = m16601f(payload);
            Bundle m115346m = C31696Aj2.m115346m(payload.getPublicNotificationExtras());
            if (m115346m.isEmpty()) {
                return;
            }
            BrazeNotificationPayload brazeNotificationPayload = new BrazeNotificationPayload(m115346m, null, context, configurationProvider, 2, null);
            C38054ac3.C10770e c10770e = new C38054ac3.C10770e(context, m16601f);
            C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, new C27782Y(brazeNotificationPayload), 7, null);
            m16623A(c10770e, brazeNotificationPayload);
            m16610N(c10770e, brazeNotificationPayload);
            m16612L(c10770e, brazeNotificationPayload);
            m16614J(configurationProvider, c10770e);
            m16582y(c10770e, brazeNotificationPayload);
            notificationBuilder.m71035y(c10770e.m71057c());
        }
    }

    @JvmStatic
    /* renamed from: I */
    public static final void m16615I(C38054ac3.C10770e notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.isPushStory()) {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27783Z.f106270g, 7, null);
            notificationBuilder.m71068A(false);
        }
    }

    @JvmStatic
    /* renamed from: J */
    public static final int m16614J(X10 appConfigurationProvider, C38054ac3.C10770e notificationBuilder) {
        Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        int smallNotificationIconResourceId = appConfigurationProvider.getSmallNotificationIconResourceId();
        if (smallNotificationIconResourceId == 0) {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27785a0.f106275g, 7, null);
            smallNotificationIconResourceId = appConfigurationProvider.getApplicationIconResourceId();
        } else {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27787b0.f106276g, 7, null);
        }
        notificationBuilder.m71067B(smallNotificationIconResourceId);
        return smallNotificationIconResourceId;
    }

    @JvmStatic
    /* renamed from: K */
    public static final void m16613K(C38054ac3.C10770e notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        String notificationSound = payload.getNotificationSound();
        if (notificationSound == null) {
            return;
        }
        if (Intrinsics.areEqual(notificationSound, DateTokenConverter.CONVERTER_KEY)) {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27789c0.f106278g, 7, null);
            notificationBuilder.m71044p(1);
            return;
        }
        C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27791d0.f106280g, 7, null);
        notificationBuilder.m71066C(Uri.parse(notificationSound));
    }

    @JvmStatic
    /* renamed from: L */
    public static final void m16612L(C38054ac3.C10770e notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        String summaryText = payload.getSummaryText();
        if (summaryText != null) {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27793e0.f106282g, 7, null);
            notificationBuilder.m71064E(summaryText);
            return;
        }
        C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27795f0.f106284g, 7, null);
    }

    @JvmStatic
    /* renamed from: M */
    public static final void m16611M(C38054ac3.C10770e notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27797g0.f106286g, 7, null);
        String titleText = payload.getTitleText();
        if (titleText == null) {
            return;
        }
        notificationBuilder.m71063F(titleText);
    }

    @JvmStatic
    /* renamed from: N */
    public static final void m16610N(C38054ac3.C10770e notificationBuilder, BrazeNotificationPayload payload) {
        X10 configurationProvider;
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27799h0.f106288g, 7, null);
        String titleText = payload.getTitleText();
        if (titleText == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return;
        }
        notificationBuilder.m71047m(C51569xN1.m5358a(titleText, configurationProvider));
    }

    @JvmStatic
    /* renamed from: O */
    public static final void m16609O(C38054ac3.C10770e notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Integer notificationVisibility = payload.getNotificationVisibility();
        if (notificationVisibility != null) {
            if (m16590q(notificationVisibility.intValue())) {
                C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27801i0.f106290g, 7, null);
                notificationBuilder.m71061H(notificationVisibility.intValue());
                return;
            }
            C43664k20.m29442e(C43664k20.f93782a, f106239a, C43664k20.EnumC25082a.W, null, false, new C27803j0(notificationVisibility), 6, null);
        }
    }

    @JvmStatic
    /* renamed from: P */
    public static final boolean m16608P(Context context, X10 configurationProvider, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        return m16607Q(new BrazeNotificationPayload(bundle, null, context, configurationProvider, 2, null));
    }

    @JvmStatic
    @SuppressLint({"WakelockTimeout"})
    /* renamed from: Q */
    public static final boolean m16607Q(BrazeNotificationPayload payload) {
        X10 configurationProvider;
        int importance;
        Object systemService;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Context context = payload.getContext();
        if (context == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return false;
        }
        Bundle notificationExtras = payload.getNotificationExtras();
        if (!C39750dR3.m44274b(context, "android.permission.WAKE_LOCK") || !configurationProvider.isPushWakeScreenForNotificationEnabled()) {
            return false;
        }
        try {
            systemService = context.getSystemService("uimode");
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, C43664k20.EnumC25082a.E, e, false, C27807l0.f106296g, 4, null);
        }
        if (systemService != null) {
            if (((UiModeManager) systemService).getCurrentModeType() == 4) {
                C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27805k0.f106294g, 7, null);
                return false;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Object systemService2 = context.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
                if (systemService2 != null) {
                    NotificationChannel m16599h = m16599h((NotificationManager) systemService2, notificationExtras);
                    if (m16599h == null) {
                        C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27809m0.f106298g, 7, null);
                        return false;
                    }
                    importance = m16599h.getImportance();
                    if (importance == 1) {
                        C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, new C27811n0(m16599h), 7, null);
                        return false;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
                }
            } else if (m16603d(payload) == -2) {
                return false;
            }
            C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27813o0.f106302g, 7, null);
            Object systemService3 = context.getSystemService("power");
            if (systemService3 != null) {
                PowerManager.WakeLock newWakeLock = ((PowerManager) systemService3).newWakeLock(268435482, f106240b);
                newWakeLock.acquire();
                newWakeLock.release();
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.PowerManager");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.UiModeManager");
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m16606a(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, new C27788c(i), 7, null);
            Intent intent = new Intent("com.appboy.action.CANCEL_NOTIFICATION").setClass(context, m16602e());
            Intrinsics.checkNotNullExpressionValue(intent, "Intent(Constants.BRAZE_C…otificationReceiverClass)");
            intent.setPackage(context.getPackageName());
            intent.putExtra("nid", i);
            C38352b62.m64972a(context, intent);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, C43664k20.EnumC25082a.E, e, false, C27790d.f106279g, 4, null);
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final InterfaceC40906fO1 m16605b() {
        InterfaceC40906fO1 customBrazeNotificationFactory = Appboy.getCustomBrazeNotificationFactory();
        if (customBrazeNotificationFactory == null) {
            return C46629p20.Companion.m20031a();
        }
        return customBrazeNotificationFactory;
    }

    @JvmStatic
    /* renamed from: c */
    public static final int m16604c(BrazeNotificationPayload payload) {
        int hashCode;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Integer customNotificationId = payload.getCustomNotificationId();
        if (customNotificationId != null) {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, new C27792e(customNotificationId), 7, null);
            return customNotificationId.intValue();
        }
        String titleText = payload.getTitleText();
        String str = "";
        if (titleText != null) {
            str = Intrinsics.stringPlus("", titleText);
        }
        String contentText = payload.getContentText();
        if (contentText != null) {
            str = Intrinsics.stringPlus(str, contentText);
        }
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, new C27794f(hashCode), 7, null);
        return hashCode;
    }

    @JvmStatic
    /* renamed from: d */
    public static final int m16603d(BrazeNotificationPayload payload) {
        boolean z;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Integer notificationPriorityInt = payload.getNotificationPriorityInt();
        Integer notificationPriorityInt2 = payload.getNotificationPriorityInt();
        if (notificationPriorityInt2 != null) {
            int intValue = notificationPriorityInt2.intValue();
            if (-2 <= intValue && intValue < 3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return intValue;
            }
            C43664k20.m29442e(C43664k20.f93782a, f106239a, C43664k20.EnumC25082a.W, null, false, new C27796g(notificationPriorityInt), 6, null);
        }
        return 0;
    }

    @JvmStatic
    /* renamed from: e */
    public static final Class<?> m16602e() {
        return C36977Wy0.m77599a() ? BrazeAmazonDeviceMessagingReceiver.class : BrazePushReceiver.class;
    }

    @JvmStatic
    /* renamed from: f */
    public static final String m16601f(BrazeNotificationPayload payload) {
        Object systemService;
        NotificationChannel notificationChannel;
        String defaultNotificationChannelName;
        NotificationChannel notificationChannel2;
        Intrinsics.checkNotNullParameter(payload, "payload");
        String notificationChannelId = payload.getNotificationChannelId();
        if (Build.VERSION.SDK_INT < 26) {
            if (notificationChannelId == null) {
                return "com_appboy_default_notification_channel";
            }
            return notificationChannelId;
        }
        Context context = payload.getContext();
        X10 configurationProvider = payload.getConfigurationProvider();
        String str = null;
        if (context == null) {
            systemService = null;
        } else {
            systemService = context.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        }
        if (systemService != null) {
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (notificationChannelId != null) {
                notificationChannel2 = notificationManager.getNotificationChannel(notificationChannelId);
                if (notificationChannel2 != null) {
                    C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, new C27798h(notificationChannelId), 7, null);
                    return notificationChannelId;
                }
                C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, new C27800i(notificationChannelId), 7, null);
            }
            notificationChannel = notificationManager.getNotificationChannel("com_appboy_default_notification_channel");
            if (notificationChannel == null) {
                C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27802j.f106291g, 7, null);
                C42795ia3.m33793a();
                if (configurationProvider == null) {
                    defaultNotificationChannelName = null;
                } else {
                    defaultNotificationChannelName = configurationProvider.getDefaultNotificationChannelName();
                }
                NotificationChannel m36179a = C42202ha3.m36179a("com_appboy_default_notification_channel", defaultNotificationChannelName, 3);
                if (configurationProvider != null) {
                    str = configurationProvider.getDefaultNotificationChannelDescription();
                }
                m36179a.setDescription(str);
                notificationManager.createNotificationChannel(m36179a);
            }
            return "com_appboy_default_notification_channel";
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    @JvmStatic
    @TargetApi(26)
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final NotificationChannel m16599h(NotificationManager notificationManager, Bundle bundle) {
        boolean z;
        NotificationChannel notificationChannel;
        NotificationChannel notificationChannel2;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        if (bundle == null) {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27804k.f106293g, 7, null);
            return null;
        }
        String string = bundle.getString("ab_nc", null);
        if (string != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(string);
            if (!isBlank) {
                z = false;
                if (!z) {
                    notificationChannel2 = notificationManager.getNotificationChannel(string);
                    if (notificationChannel2 != null) {
                        C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, new C27806l(string), 7, null);
                        return notificationChannel2;
                    }
                    C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, new C27808m(string), 7, null);
                }
                notificationChannel = notificationManager.getNotificationChannel("com_appboy_default_notification_channel");
                if (notificationChannel == null) {
                    return notificationChannel;
                }
                C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27810n.f106299g, 7, null);
                return null;
            }
        }
        z = true;
        if (!z) {
        }
        notificationChannel = notificationManager.getNotificationChannel("com_appboy_default_notification_channel");
        if (notificationChannel == null) {
        }
    }

    @JvmStatic
    /* renamed from: i */
    public static final void m16598i(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            if (intent.hasExtra("nid")) {
                int intExtra = intent.getIntExtra("nid", -1);
                C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, new C27812o(intExtra), 7, null);
                Object systemService = context.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
                if (systemService != null) {
                    ((NotificationManager) systemService).cancel("appboy_notification", intExtra);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            }
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, C43664k20.EnumC25082a.E, e, false, C27814p.f106303g, 4, null);
        }
    }

    @JvmStatic
    /* renamed from: j */
    public static final void m16597j(BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        String contentCardSyncData = payload.getContentCardSyncData();
        String contentCardSyncUserId = payload.getContentCardSyncUserId();
        Context context = payload.getContext();
        if (contentCardSyncData != null && context != null) {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, new C27815q(contentCardSyncUserId, contentCardSyncData), 7, null);
            BrazeInternal.addSerializedContentCardToStorage(context, contentCardSyncData, contentCardSyncUserId);
        }
    }

    @JvmStatic
    /* renamed from: k */
    public static final void m16596k(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            C43664k20 c43664k20 = C43664k20.f93782a;
            C47815r20 c47815r20 = f106239a;
            C43664k20.m29442e(c43664k20, c47815r20, null, null, false, C27816r.f106306g, 7, null);
            c47815r20.m16585v(context, EnumC27784a.DELETED, intent.getExtras());
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, C43664k20.EnumC25082a.E, e, false, C27817s.f106307g, 4, null);
        }
    }

    @JvmStatic
    /* renamed from: l */
    public static final void m16595l(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            P10.getInstance(context).logPushNotificationOpened(intent);
            m16586u(context, intent);
            if (new X10(context).getDoesHandlePushDeepLinksAutomatically()) {
                m16587t(context, intent);
            } else {
                C43664k20.m29442e(C43664k20.f93782a, f106239a, C43664k20.EnumC25082a.I, null, false, C27818t.f106308g, 6, null);
            }
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, C43664k20.EnumC25082a.E, e, false, C27819u.f106309g, 4, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        if (r4 != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035 A[Catch: Exception -> 0x007c, TRY_ENTER, TryCatch #0 {Exception -> 0x007c, blocks: (B:3:0x000c, B:5:0x0027, B:12:0x0035, B:14:0x0044, B:18:0x004d, B:20:0x0056, B:22:0x0064, B:23:0x0068, B:19:0x0053), top: B:28:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053 A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:3:0x000c, B:5:0x0027, B:12:0x0035, B:14:0x0044, B:18:0x004d, B:20:0x0056, B:22:0x0064, B:23:0x0068, B:19:0x0053), top: B:28:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:3:0x000c, B:5:0x0027, B:12:0x0035, B:14:0x0044, B:18:0x004d, B:20:0x0056, B:22:0x0064, B:23:0x0068, B:19:0x0053), top: B:28:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[Catch: Exception -> 0x007c, TRY_LEAVE, TryCatch #0 {Exception -> 0x007c, blocks: (B:3:0x000c, B:5:0x0027, B:12:0x0035, B:14:0x0044, B:18:0x004d, B:20:0x0056, B:22:0x0064, B:23:0x0068, B:19:0x0053), top: B:28:0x000c }] */
    @JvmStatic
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m16594m(Context context, Intent intent) {
        boolean z;
        boolean isBlank;
        boolean isBlank2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            P10.getInstance(context).logPushStoryPageClicked(intent.getStringExtra("appboy_campaign_id"), intent.getStringExtra("appboy_story_page_id"));
            String stringExtra = intent.getStringExtra("appboy_action_uri");
            boolean z2 = false;
            if (stringExtra != null) {
                isBlank2 = StringsKt__StringsJVMKt.isBlank(stringExtra);
                if (!isBlank2) {
                    z = false;
                    if (z) {
                        intent.putExtra("uri", intent.getStringExtra("appboy_action_uri"));
                        String stringExtra2 = intent.getStringExtra("appboy_action_use_webview");
                        if (stringExtra2 != null) {
                            isBlank = StringsKt__StringsJVMKt.isBlank(stringExtra2);
                        }
                        z2 = true;
                        if (!z2) {
                            intent.putExtra("ab_use_webview", stringExtra2);
                        }
                    } else {
                        intent.removeExtra("uri");
                    }
                    m16586u(context, intent);
                    if (!new X10(context).getDoesHandlePushDeepLinksAutomatically()) {
                        m16587t(context, intent);
                        return;
                    } else {
                        C43664k20.m29442e(C43664k20.f93782a, f106239a, C43664k20.EnumC25082a.I, null, false, new C27820v(stringExtra), 6, null);
                        return;
                    }
                }
            }
            z = true;
            if (z) {
            }
            m16586u(context, intent);
            if (!new X10(context).getDoesHandlePushDeepLinksAutomatically()) {
            }
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, C43664k20.EnumC25082a.E, e, false, C27821w.f106311g, 4, null);
        }
    }

    @JvmStatic
    /* renamed from: n */
    public static final boolean m16593n(Intent intent) {
        boolean equals;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        equals = StringsKt__StringsJVMKt.equals("true", extras.getString("_ab"), true);
        return equals;
    }

    @JvmStatic
    /* renamed from: o */
    public static final boolean m16592o(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("t") || !extras.containsKey(C17296a.f69688o)) {
            return false;
        }
        return true;
    }

    @JvmStatic
    /* renamed from: p */
    public static final boolean m16591p(Bundle notificationExtras) {
        Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
        try {
            if (notificationExtras.containsKey("appboy_uninstall_tracking")) {
                return true;
            }
            Bundle bundle = notificationExtras.getBundle("extra");
            if (bundle != null) {
                return bundle.containsKey("appboy_uninstall_tracking");
            }
            return false;
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, C43664k20.EnumC25082a.E, e, false, C27822x.f106312g, 4, null);
            return false;
        }
    }

    @JvmStatic
    @TargetApi(21)
    /* renamed from: q */
    public static final boolean m16590q(int i) {
        return i == -1 || i == 0 || i == 1;
    }

    @JvmStatic
    /* renamed from: r */
    public static final void m16589r(BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Context context = payload.getContext();
        if (context != null && payload.isPushStory() && payload.isNewlyReceivedPushStory()) {
            ArrayList<String> arrayList = new ArrayList();
            for (BrazeNotificationPayload.PushStoryPage pushStoryPage : payload.getPushStoryPages()) {
                String bitmapUrl = pushStoryPage.getBitmapUrl();
                if (bitmapUrl != null) {
                    arrayList.add(bitmapUrl);
                }
            }
            for (String str : arrayList) {
                C43664k20.m29442e(C43664k20.f93782a, f106239a, C43664k20.EnumC25082a.V, null, false, new C27823y(str), 6, null);
                P10.getInstance(context).getImageLoader().mo10195e(context, payload.getBrazeExtras(), str, EnumC50778w20.NOTIFICATION_ONE_IMAGE_STORY);
            }
            payload.setNewlyReceivedPushStory(false);
        }
    }

    @JvmStatic
    /* renamed from: s */
    public static final boolean m16588s(BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Context context = payload.getContext();
        if (payload.getShouldSyncGeofences() && context != null) {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27824z.f106314g, 7, null);
            BrazeInternal.requestGeofenceRefresh(context, true);
            return true;
        }
        C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27758A.f106244g, 7, null);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    @JvmStatic
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m16587t(Context context, Intent intent) {
        boolean z;
        boolean equals;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle bundleExtra = intent.getBundleExtra("extra");
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        bundleExtra.putString("cid", intent.getStringExtra("cid"));
        bundleExtra.putString(Stripe3ds2AuthParams.FIELD_SOURCE, "Appboy");
        String stringExtra = intent.getStringExtra("uri");
        if (stringExtra != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(stringExtra);
            if (!isBlank) {
                z = false;
                if (z) {
                    equals = StringsKt__StringsJVMKt.equals("true", intent.getStringExtra("ab_use_webview"), true);
                    C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, new C27759B(stringExtra, equals), 7, null);
                    bundleExtra.putString("uri", stringExtra);
                    bundleExtra.putBoolean("ab_use_webview", equals);
                    C38310b20.C12274a c12274a = C38310b20.f56803a;
                    C32132Cf6 mo44325b = c12274a.m65097a().mo44325b(stringExtra, bundleExtra, equals, Channel.PUSH);
                    if (mo44325b != null) {
                        c12274a.m65097a().mo44324c(context, mo44325b);
                        return;
                    }
                    return;
                }
                Intent m103554a = C33302Hf6.m103554a(context, bundleExtra);
                C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, new C27760C(m103554a), 7, null);
                context.startActivity(m103554a);
                return;
            }
        }
        z = true;
        if (z) {
        }
    }

    @JvmStatic
    /* renamed from: u */
    public static final void m16586u(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        C43664k20 c43664k20 = C43664k20.f93782a;
        C47815r20 c47815r20 = f106239a;
        C43664k20.m29442e(c43664k20, c47815r20, null, null, false, C27761D.f106248g, 7, null);
        c47815r20.m16585v(context, EnumC27784a.OPENED, intent.getExtras());
    }

    @JvmStatic
    /* renamed from: x */
    public static final void m16583x(Context context, Bundle notificationExtras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
        C43664k20 c43664k20 = C43664k20.f93782a;
        C47815r20 c47815r20 = f106239a;
        C43664k20.m29442e(c43664k20, c47815r20, null, null, false, C27765H.f106252g, 7, null);
        c47815r20.m16585v(context, EnumC27784a.RECEIVED, notificationExtras);
    }

    @JvmStatic
    /* renamed from: y */
    public static final void m16582y(C38054ac3.C10770e notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Integer accentColor = payload.getAccentColor();
        if (accentColor != null) {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27766I.f106253g, 7, null);
            notificationBuilder.m71050j(accentColor.intValue());
            return;
        }
        X10 configurationProvider = payload.getConfigurationProvider();
        if (configurationProvider != null) {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27767J.f106254g, 7, null);
            notificationBuilder.m71050j(configurationProvider.getDefaultNotificationAccentColor());
        }
    }

    @JvmStatic
    /* renamed from: z */
    public static final void m16581z(C38054ac3.C10770e notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        String notificationCategory = payload.getNotificationCategory();
        if (notificationCategory != null) {
            C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27768K.f106255g, 7, null);
            notificationBuilder.m71052h(notificationCategory);
            return;
        }
        C43664k20.m29442e(C43664k20.f93782a, f106239a, null, null, false, C27769L.f106256g, 7, null);
    }

    /* renamed from: g */
    public final PendingIntent m16600g(Context context, String str, Bundle bundle) {
        Intent intent = new Intent(str).setClass(context, NotificationTrampolineActivity.class);
        Intrinsics.checkNotNullExpressionValue(intent, "Intent(action).setClass(…lineActivity::class.java)");
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        PendingIntent activity = PendingIntent.getActivity(context, C38352b62.m64968e(), intent, 1073741824 | C38352b62.m64971b());
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(context, get… pushActionIntent, flags)");
        return activity;
    }

    /* renamed from: v */
    public final void m16585v(Context context, EnumC27784a enumC27784a, Bundle bundle) {
        Intent intent;
        Intent intent2;
        int i = C27786b.$EnumSwitchMapping$0[enumC27784a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    intent = new Intent(Intrinsics.stringPlus(context.getPackageName(), f106243e));
                    intent2 = new Intent("com.braze.push.intent.NOTIFICATION_DELETED").setPackage(context.getPackageName());
                    Intrinsics.checkNotNullExpressionValue(intent2, "Intent(Constants.BRAZE_P…kage(context.packageName)");
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                intent = new Intent(Intrinsics.stringPlus(context.getPackageName(), f106242d));
                intent2 = new Intent("com.braze.push.intent.NOTIFICATION_RECEIVED").setPackage(context.getPackageName());
                Intrinsics.checkNotNullExpressionValue(intent2, "Intent(Constants.BRAZE_P…kage(context.packageName)");
            }
        } else {
            intent = new Intent(Intrinsics.stringPlus(context.getPackageName(), f106241c));
            intent2 = new Intent("com.braze.push.intent.NOTIFICATION_OPENED").setPackage(context.getPackageName());
            Intrinsics.checkNotNullExpressionValue(intent2, "Intent(Constants.BRAZE_P…kage(context.packageName)");
        }
        C43664k20 c43664k20 = C43664k20.f93782a;
        C43664k20.EnumC25082a enumC25082a = C43664k20.EnumC25082a.V;
        C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, new C27762E(enumC27784a), 6, null);
        m16584w(context, intent, bundle);
        C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, new C27763F(enumC27784a), 6, null);
        m16584w(context, intent2, bundle);
    }

    /* renamed from: w */
    public final void m16584w(Context context, Intent intent, Bundle bundle) {
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C27764G(intent), 6, null);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        C38352b62.m64972a(context, intent);
    }
}
