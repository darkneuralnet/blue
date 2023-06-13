package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.models.push.BrazeNotificationPayload;
import com.braze.push.NotificationTrampolineActivity;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C38054ac3;
import p000.C43664k20;
import p000.InterfaceC39721dO1;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u001e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ \u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¨\u0006\u0015"}, m28432d2 = {"Lo20;", "", "Lac3$e;", "notificationBuilder", "Lcom/appboy/models/push/BrazeNotificationPayload;", "payload", "", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "intent", "c", "Lcom/appboy/models/push/BrazeNotificationPayload$ActionButton;", "actionButton", C17296a.f69688o, "", "actionType", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: o20  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C46036o20 {

    /* renamed from: a */
    public static final C46036o20 f101236a = new C46036o20();

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: o20$a */
    /* loaded from: classes2.dex */
    public static final class C26790a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C26790a f101237g = new C26790a();

        public C26790a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Cannot add notification action with null context from payload";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: o20$b */
    /* loaded from: classes2.dex */
    public static final class C26791b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f101238g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26791b(String str) {
            super(0);
            this.f101238g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Adding notification action with type: " + ((Object) this.f101238g) + "Setting intent class to notification receiver: " + C47815r20.m16602e();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: o20$c */
    /* loaded from: classes2.dex */
    public static final class C26792c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f101239g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26792c(String str) {
            super(0);
            this.f101239g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Adding notification action with type: " + ((Object) this.f101239g) + " Setting intent class to trampoline activity";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: o20$d */
    /* loaded from: classes2.dex */
    public static final class C26793d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Bundle f101240g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26793d(Bundle bundle) {
            super(0);
            this.f101240g = bundle;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Added action with bundle: ", this.f101240g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: o20$e */
    /* loaded from: classes2.dex */
    public static final class C26794e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C26794e f101241g = new C26794e();

        public C26794e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Context cannot be null when adding notification buttons.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: o20$f */
    /* loaded from: classes2.dex */
    public static final class C26795f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C26795f f101242g = new C26795f();

        public C26795f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "No action buttons present. Not adding notification actions";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: o20$g */
    /* loaded from: classes2.dex */
    public static final class C26796g extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ BrazeNotificationPayload.ActionButton f101243g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26796g(BrazeNotificationPayload.ActionButton actionButton) {
            super(0);
            this.f101243g = actionButton;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Adding action button: ", this.f101243g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: o20$h */
    /* loaded from: classes2.dex */
    public static final class C26797h extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C26797h f101244g = new C26797h();

        public C26797h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Notification action button type was blank or null. Doing nothing.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: o20$i */
    /* loaded from: classes2.dex */
    public static final class C26798i extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C26798i f101245g = new C26798i();

        public C26798i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Not handling deep links automatically, skipping deep link handling";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: o20$j */
    /* loaded from: classes2.dex */
    public static final class C26799j extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C26799j f101246g = new C26799j();

        public C26799j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Unknown notification action button clicked. Doing nothing.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: o20$k */
    /* loaded from: classes2.dex */
    public static final class C26800k extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C26800k f101247g = new C26800k();

        public C26800k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Caught exception while handling notification action button click.";
        }
    }

    private C46036o20() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m21963b(C38054ac3.C10770e notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.getContext() == null) {
            C43664k20.m29442e(C43664k20.f93782a, f101236a, null, null, false, C26794e.f101241g, 7, null);
            return;
        }
        List<BrazeNotificationPayload.ActionButton> actionButtons = payload.getActionButtons();
        if (actionButtons.isEmpty()) {
            C43664k20.m29442e(C43664k20.f93782a, f101236a, null, null, false, C26795f.f101242g, 7, null);
            return;
        }
        for (BrazeNotificationPayload.ActionButton actionButton : actionButtons) {
            C43664k20 c43664k20 = C43664k20.f93782a;
            C46036o20 c46036o20 = f101236a;
            C43664k20.m29442e(c43664k20, c46036o20, C43664k20.EnumC25082a.V, null, false, new C26796g(actionButton), 6, null);
            c46036o20.m21964a(notificationBuilder, payload, actionButton);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020 A[Catch: Exception -> 0x00e7, TryCatch #0 {Exception -> 0x00e7, blocks: (B:3:0x000a, B:5:0x0014, B:11:0x0020, B:13:0x0030, B:15:0x003e, B:23:0x0055, B:33:0x0075, B:36:0x0080, B:44:0x0093, B:48:0x00a3, B:52:0x00ac, B:54:0x00b9, B:56:0x00c7, B:57:0x00cb, B:40:0x008a, B:53:0x00b6, B:26:0x005f, B:29:0x0069, B:30:0x006e, B:58:0x00d9), top: B:63:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[Catch: Exception -> 0x00e7, TryCatch #0 {Exception -> 0x00e7, blocks: (B:3:0x000a, B:5:0x0014, B:11:0x0020, B:13:0x0030, B:15:0x003e, B:23:0x0055, B:33:0x0075, B:36:0x0080, B:44:0x0093, B:48:0x00a3, B:52:0x00ac, B:54:0x00b9, B:56:0x00c7, B:57:0x00cb, B:40:0x008a, B:53:0x00b6, B:26:0x005f, B:29:0x0069, B:30:0x006e, B:58:0x00d9), top: B:63:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080 A[Catch: Exception -> 0x00e7, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e7, blocks: (B:3:0x000a, B:5:0x0014, B:11:0x0020, B:13:0x0030, B:15:0x003e, B:23:0x0055, B:33:0x0075, B:36:0x0080, B:44:0x0093, B:48:0x00a3, B:52:0x00ac, B:54:0x00b9, B:56:0x00c7, B:57:0x00cb, B:40:0x008a, B:53:0x00b6, B:26:0x005f, B:29:0x0069, B:30:0x006e, B:58:0x00d9), top: B:63:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7 A[Catch: Exception -> 0x00e7, TryCatch #0 {Exception -> 0x00e7, blocks: (B:3:0x000a, B:5:0x0014, B:11:0x0020, B:13:0x0030, B:15:0x003e, B:23:0x0055, B:33:0x0075, B:36:0x0080, B:44:0x0093, B:48:0x00a3, B:52:0x00ac, B:54:0x00b9, B:56:0x00c7, B:57:0x00cb, B:40:0x008a, B:53:0x00b6, B:26:0x005f, B:29:0x0069, B:30:0x006e, B:58:0x00d9), top: B:63:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb A[Catch: Exception -> 0x00e7, TryCatch #0 {Exception -> 0x00e7, blocks: (B:3:0x000a, B:5:0x0014, B:11:0x0020, B:13:0x0030, B:15:0x003e, B:23:0x0055, B:33:0x0075, B:36:0x0080, B:44:0x0093, B:48:0x00a3, B:52:0x00ac, B:54:0x00b9, B:56:0x00c7, B:57:0x00cb, B:40:0x008a, B:53:0x00b6, B:26:0x005f, B:29:0x0069, B:30:0x006e, B:58:0x00d9), top: B:63:0x000a }] */
    @JvmStatic
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m21962c(Context context, Intent intent) {
        boolean z;
        boolean z2;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            String stringExtra = intent.getStringExtra("appboy_action_type");
            boolean z3 = false;
            if (stringExtra != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(stringExtra);
                if (!isBlank) {
                    z = false;
                    if (!z) {
                        C43664k20.m29442e(C43664k20.f93782a, f101236a, C43664k20.EnumC25082a.W, null, false, C26797h.f101244g, 6, null);
                        return;
                    }
                    int intExtra = intent.getIntExtra("nid", -1);
                    C46036o20 c46036o20 = f101236a;
                    c46036o20.m21961d(context, intent, stringExtra);
                    if (stringExtra != null) {
                        int hashCode = stringExtra.hashCode();
                        if (hashCode != -1424488370) {
                            if (hashCode != -1209677674) {
                                if (hashCode == -1209647192) {
                                    if (!stringExtra.equals("ab_open")) {
                                    }
                                    C47815r20.m16606a(context, intExtra);
                                    if (Intrinsics.areEqual(stringExtra, "ab_uri")) {
                                        Bundle extras = intent.getExtras();
                                        if (extras == null || !extras.containsKey("appboy_action_uri")) {
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        if (z2) {
                                            intent.putExtra("uri", intent.getStringExtra("appboy_action_uri"));
                                            Bundle extras2 = intent.getExtras();
                                            if (extras2 != null && extras2.containsKey("appboy_action_use_webview")) {
                                                z3 = true;
                                            }
                                            if (z3) {
                                                intent.putExtra("ab_use_webview", intent.getStringExtra("appboy_action_use_webview"));
                                            }
                                            C47815r20.m16586u(context, intent);
                                            if (new X10(context).getDoesHandlePushDeepLinksAutomatically()) {
                                                C47815r20.m16587t(context, intent);
                                                return;
                                            } else {
                                                C43664k20.m29442e(C43664k20.f93782a, c46036o20, C43664k20.EnumC25082a.I, null, false, C26798i.f101245g, 6, null);
                                                return;
                                            }
                                        }
                                    }
                                    intent.removeExtra("uri");
                                    C47815r20.m16586u(context, intent);
                                    if (new X10(context).getDoesHandlePushDeepLinksAutomatically()) {
                                    }
                                }
                            } else if (stringExtra.equals("ab_none")) {
                                C47815r20.m16606a(context, intExtra);
                                return;
                            }
                        } else {
                            if (!stringExtra.equals("ab_uri")) {
                            }
                            C47815r20.m16606a(context, intExtra);
                            if (Intrinsics.areEqual(stringExtra, "ab_uri")) {
                            }
                            intent.removeExtra("uri");
                            C47815r20.m16586u(context, intent);
                            if (new X10(context).getDoesHandlePushDeepLinksAutomatically()) {
                            }
                        }
                    }
                    C43664k20.m29442e(C43664k20.f93782a, c46036o20, C43664k20.EnumC25082a.W, null, false, C26799j.f101246g, 6, null);
                    return;
                }
            }
            z = true;
            if (!z) {
            }
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, f101236a, C43664k20.EnumC25082a.E, e, false, C26800k.f101247g, 4, null);
        }
    }

    /* renamed from: a */
    public final void m21964a(C38054ac3.C10770e notificationBuilder, BrazeNotificationPayload payload, BrazeNotificationPayload.ActionButton actionButton) {
        PendingIntent activity;
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        Context context = payload.getContext();
        if (context == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C26790a.f101237g, 7, null);
            return;
        }
        Bundle bundle = new Bundle(payload.getNotificationExtras());
        actionButton.putIntoBundle(bundle);
        String type = actionButton.getType();
        int m64971b = 134217728 | C38352b62.m64971b();
        if (Intrinsics.areEqual("ab_none", type)) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C26791b(type), 6, null);
            Intent intent = new Intent("com.appboy.action.APPBOY_ACTION_CLICKED").setClass(context, C47815r20.m16602e());
            Intrinsics.checkNotNullExpressionValue(intent, "Intent(Constants.BRAZE_A…ceiverClass\n            )");
            intent.putExtras(bundle);
            activity = PendingIntent.getBroadcast(context, C38352b62.m64968e(), intent, m64971b);
            Intrinsics.checkNotNullExpressionValue(activity, "getBroadcast(\n          …IntentFlags\n            )");
        } else {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C26792c(type), 6, null);
            Intent intent2 = new Intent("com.appboy.action.APPBOY_ACTION_CLICKED").setClass(context, NotificationTrampolineActivity.class);
            Intrinsics.checkNotNullExpressionValue(intent2, "Intent(Constants.BRAZE_A…lineActivity::class.java)");
            intent2.setFlags(intent2.getFlags() | C38310b20.f56803a.m65097a().mo44326a(InterfaceC39721dO1.EnumC19746a.NOTIFICATION_ACTION_WITH_DEEPLINK));
            intent2.putExtras(bundle);
            activity = PendingIntent.getActivity(context, C38352b62.m64968e(), intent2, m64971b);
            Intrinsics.checkNotNullExpressionValue(activity, "getActivity(\n           …IntentFlags\n            )");
        }
        C38054ac3.C10762a.C10763a c10763a = new C38054ac3.C10762a.C10763a(0, actionButton.getText(), activity);
        c10763a.m71085a(new Bundle(bundle));
        notificationBuilder.m71058b(c10763a.m71084b());
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C26793d(bundle), 6, null);
    }

    /* renamed from: d */
    public final void m21961d(Context context, Intent intent, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        P10.getInstance(context).logPushNotificationActionClicked(intent.getStringExtra("cid"), intent.getStringExtra("appboy_action_id"), str);
    }
}
