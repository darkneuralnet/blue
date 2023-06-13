package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.models.push.BrazeNotificationPayload;
import com.appboy.p027ui.R$id;
import com.appboy.p027ui.R$layout;
import com.braze.push.NotificationTrampolineActivity;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C38054ac3;
import p000.C43664k20;
import p000.InterfaceC39721dO1;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m28432d2 = {"Lq20;", "", "<init>", "()V", "Companion", C17296a.f69688o, "b", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: q20  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47222q20 {
    public static final C27457a Companion = new C27457a(null);

    @Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b+\u0010,J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\"\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J \u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010$\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002R\u0014\u0010%\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010)¨\u0006-"}, m28432d2 = {"Lq20$a;", "", "Lac3$e;", "notificationBuilder", "Lcom/appboy/models/push/BrazeNotificationPayload;", "payload", "", "l", "Lac3$i;", "g", "Lac3$c;", DateTokenConverter.CONVERTER_KEY, "Lac3$f;", "h", "f", "Lac3$b;", "c", "Lac3$h;", "e", "bigPictureNotificationStyle", "k", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/appboy/models/push/BrazeNotificationPayload$PushStoryPage;", "pushStoryPage", "Landroid/app/PendingIntent;", C17296a.f69688o, "Landroid/os/Bundle;", "notificationExtras", "", "pageIndex", "b", "Landroid/widget/RemoteViews;", "view", "", "j", "i", "BIG_PICTURE_STYLE_IMAGE_HEIGHT", "I", "", "STORY_SET_GRAVITY", "Ljava/lang/String;", "STORY_SET_VISIBILITY", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: q20$a */
    /* loaded from: classes2.dex */
    public static final class C27457a {

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: q20$a$a */
        /* loaded from: classes2.dex */
        public static final class C27458a extends Lambda implements Function0<String> {

            /* renamed from: g */
            public final /* synthetic */ String f104569g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27458a(String str) {
                super(0);
                this.f104569g = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Failed to download image bitmap for big picture notification style. Url: ", this.f104569g);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: q20$a$b */
        /* loaded from: classes2.dex */
        public static final class C27459b extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C27459b f104570g = new C27459b();

            public C27459b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Failed to scale image bitmap, using original.";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: q20$a$c */
        /* loaded from: classes2.dex */
        public static final class C27460c extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C27460c f104571g = new C27460c();

            public C27460c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Bitmap download failed for push notification. No image will be included with the notification.";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: q20$a$d */
        /* loaded from: classes2.dex */
        public static final class C27461d extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C27461d f104572g = new C27461d();

            public C27461d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Failed to create Big Picture Style.";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: q20$a$e */
        /* loaded from: classes2.dex */
        public static final class C27462e extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C27462e f104573g = new C27462e();

            public C27462e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Reply person does not exist in mapping. Not rendering a style";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: q20$a$f */
        /* loaded from: classes2.dex */
        public static final class C27463f extends Lambda implements Function0<String> {

            /* renamed from: g */
            public final /* synthetic */ BrazeNotificationPayload.ConversationMessage f104574g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27463f(BrazeNotificationPayload.ConversationMessage conversationMessage) {
                super(0);
                this.f104574g = conversationMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Message person does not exist in mapping. Not rendering a style. ", this.f104574g);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: q20$a$g */
        /* loaded from: classes2.dex */
        public static final class C27464g extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C27464g f104575g = new C27464g();

            public C27464g() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Failed to create conversation push style. Returning null.";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: q20$a$h */
        /* loaded from: classes2.dex */
        public static final class C27465h extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C27465h f104576g = new C27465h();

            public C27465h() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Inline Image Push cannot render without a context";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: q20$a$i */
        /* loaded from: classes2.dex */
        public static final class C27466i extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C27466i f104577g = new C27466i();

            public C27466i() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Inline Image Push image url invalid";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: q20$a$j */
        /* loaded from: classes2.dex */
        public static final class C27467j extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C27467j f104578g = new C27467j();

            public C27467j() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Inline Image Push failed to get image bitmap";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: q20$a$k */
        /* loaded from: classes2.dex */
        public static final class C27468k extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C27468k f104579g = new C27468k();

            public C27468k() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Inline Image Push application info was null";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: q20$a$l */
        /* loaded from: classes2.dex */
        public static final class C27469l extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C27469l f104580g = new C27469l();

            public C27469l() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Rendering push notification with DecoratedCustomViewStyle (Story)";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: q20$a$m */
        /* loaded from: classes2.dex */
        public static final class C27470m extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C27470m f104581g = new C27470m();

            public C27470m() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Rendering conversational push";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: q20$a$n */
        /* loaded from: classes2.dex */
        public static final class C27471n extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C27471n f104582g = new C27471n();

            public C27471n() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Rendering push notification with custom inline image style";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: q20$a$o */
        /* loaded from: classes2.dex */
        public static final class C27472o extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C27472o f104583g = new C27472o();

            public C27472o() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Rendering push notification with BigPictureStyle";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: q20$a$p */
        /* loaded from: classes2.dex */
        public static final class C27473p extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C27473p f104584g = new C27473p();

            public C27473p() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Rendering push notification with BigTextStyle";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: q20$a$q */
        /* loaded from: classes2.dex */
        public static final class C27474q extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C27474q f104585g = new C27474q();

            public C27474q() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Push story page cannot render without a context";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: q20$a$r */
        /* loaded from: classes2.dex */
        public static final class C27475r extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C27475r f104586g = new C27475r();

            public C27475r() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Push story page was not populated correctly. Not using DecoratedCustomViewStyle.";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: q20$a$s */
        /* loaded from: classes2.dex */
        public static final class C27476s extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C27476s f104587g = new C27476s();

            public C27476s() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Push story page cannot render without a context";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: q20$a$t */
        /* loaded from: classes2.dex */
        public static final class C27477t extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C27477t f104588g = new C27477t();

            public C27477t() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Push story page cannot render without a configuration provider";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: q20$a$u */
        /* loaded from: classes2.dex */
        public static final class C27478u extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C27478u f104589g = new C27478u();

            public C27478u() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Push story page image url invalid";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: q20$a$v */
        /* loaded from: classes2.dex */
        public static final class C27479v extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C27479v f104590g = new C27479v();

            public C27479v() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Setting style for notification";
            }
        }

        public /* synthetic */ C27457a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final PendingIntent m18287a(Context context, BrazeNotificationPayload.PushStoryPage pushStoryPage) {
            Intent intent = new Intent("com.appboy.action.APPBOY_STORY_CLICKED").setClass(context, NotificationTrampolineActivity.class);
            Intrinsics.checkNotNullExpressionValue(intent, "Intent(Constants.BRAZE_S…lineActivity::class.java)");
            intent.setFlags(intent.getFlags() | C38310b20.f56803a.m65097a().mo44326a(InterfaceC39721dO1.EnumC19746a.NOTIFICATION_PUSH_STORY_PAGE_CLICK));
            intent.putExtra("appboy_action_uri", pushStoryPage.getDeeplink());
            intent.putExtra("appboy_action_use_webview", pushStoryPage.getUseWebview());
            intent.putExtra("appboy_story_page_id", pushStoryPage.getStoryPageId());
            intent.putExtra("appboy_campaign_id", pushStoryPage.getCampaignId());
            PendingIntent activity = PendingIntent.getActivity(context, C38352b62.m64968e(), intent, C38352b62.m64971b());
            Intrinsics.checkNotNullExpressionValue(activity, "getActivity(\n           …tentFlags()\n            )");
            return activity;
        }

        /* renamed from: b */
        public final PendingIntent m18286b(Context context, Bundle bundle, int i) {
            Intent intent = new Intent("com.appboy.action.STORY_TRAVERSE").setClass(context, C47815r20.m16602e());
            Intrinsics.checkNotNullExpressionValue(intent, "Intent(Constants.BRAZE_S…otificationReceiverClass)");
            if (bundle != null) {
                bundle.putInt("appboy_story_index", i);
                intent.putExtras(bundle);
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(context, C38352b62.m64968e(), intent, 1073741824 | C38352b62.m64971b());
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(\n          …      flags\n            )");
            return broadcast;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C38054ac3.C10764b m18285c(BrazeNotificationPayload payload) {
            boolean z;
            boolean isBlank;
            Intrinsics.checkNotNullParameter(payload, "payload");
            Context context = payload.getContext();
            if (context == null) {
                return null;
            }
            String bigImageUrl = payload.getBigImageUrl();
            if (bigImageUrl != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(bigImageUrl);
                if (!isBlank) {
                    z = false;
                    if (!z) {
                        return null;
                    }
                    Bitmap mo10195e = P10.getInstance(context).getImageLoader().mo10195e(context, payload.getNotificationExtras(), bigImageUrl, EnumC50778w20.NOTIFICATION_EXPANDED_IMAGE);
                    if (mo10195e == null) {
                        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C27458a(bigImageUrl), 7, null);
                        return null;
                    }
                    try {
                        if (mo10195e.getWidth() > mo10195e.getHeight()) {
                            int m43381k = C40106e20.m43381k(C40106e20.m43387e(context), 192);
                            int i = m43381k * 2;
                            int m43384h = C40106e20.m43384h(context);
                            if (i > m43384h) {
                                i = m43384h;
                            }
                            try {
                                mo10195e = Bitmap.createScaledBitmap(mo10195e, i, m43381k, true);
                            } catch (Exception e) {
                                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C27459b.f104570g, 4, null);
                            }
                        }
                        if (mo10195e == null) {
                            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C27460c.f104571g, 6, null);
                            return null;
                        }
                        C38054ac3.C10764b c10764b = new C38054ac3.C10764b();
                        c10764b.m71081i(mo10195e);
                        m18277k(c10764b, payload);
                        return c10764b;
                    } catch (Exception e2) {
                        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e2, false, C27461d.f104572g, 4, null);
                        return null;
                    }
                }
            }
            z = true;
            if (!z) {
            }
        }

        /* renamed from: d */
        public final C38054ac3.C10768c m18284d(BrazeNotificationPayload payload) {
            CharSequence m5358a;
            Intrinsics.checkNotNullParameter(payload, "payload");
            C38054ac3.C10768c c10768c = new C38054ac3.C10768c();
            X10 configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider == null) {
                return c10768c;
            }
            String contentText = payload.getContentText();
            if (contentText != null && (m5358a = C51569xN1.m5358a(contentText, configurationProvider)) != null) {
                c10768c.m71072h(m5358a);
            }
            String bigSummaryText = payload.getBigSummaryText();
            if (bigSummaryText != null) {
                c10768c.m71070j(C51569xN1.m5358a(bigSummaryText, configurationProvider));
            }
            String bigTitleText = payload.getBigTitleText();
            if (bigTitleText != null) {
                c10768c.m71071i(C51569xN1.m5358a(bigTitleText, configurationProvider));
            }
            return c10768c;
        }

        /* renamed from: e */
        public final C38054ac3.C10773h m18283e(C38054ac3.C10770e notificationBuilder, BrazeNotificationPayload payload) {
            Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
            Intrinsics.checkNotNullParameter(payload, "payload");
            try {
                Map<String, BrazeNotificationPayload.ConversationPerson> conversationPersonMap = payload.getConversationPersonMap();
                BrazeNotificationPayload.ConversationPerson conversationPerson = conversationPersonMap.get(payload.getConversationReplyPersonId());
                if (conversationPerson == null) {
                    C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C27462e.f104573g, 7, null);
                    return null;
                }
                C38054ac3.C10773h c10773h = new C38054ac3.C10773h(conversationPerson.getPerson());
                for (BrazeNotificationPayload.ConversationMessage conversationMessage : payload.getConversationMessages()) {
                    BrazeNotificationPayload.ConversationPerson conversationPerson2 = conversationPersonMap.get(conversationMessage.getPersonId());
                    if (conversationPerson2 == null) {
                        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C27463f(conversationMessage), 7, null);
                        return null;
                    }
                    c10773h.m71031i(conversationMessage.getMessage(), conversationMessage.getTimestamp(), conversationPerson2.getPerson());
                }
                boolean z = true;
                if (conversationPersonMap.size() <= 1) {
                    z = false;
                }
                c10773h.m71029k(z);
                notificationBuilder.m71034z(payload.getConversationShortcutId());
                return c10773h;
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C27464g.f104575g, 4, null);
                return null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C38054ac3.AbstractC10775i m18282f(BrazeNotificationPayload payload, C38054ac3.C10770e notificationBuilder) {
            boolean z;
            int i;
            ApplicationInfo applicationInfo;
            PackageManager.ApplicationInfoFlags of;
            boolean isBlank;
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
            Context context = payload.getContext();
            if (context == null) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C27465h.f104576g, 7, null);
                return null;
            }
            String bigImageUrl = payload.getBigImageUrl();
            if (bigImageUrl != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(bigImageUrl);
                if (!isBlank) {
                    z = false;
                    if (!z) {
                        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C27466i.f104577g, 7, null);
                        return null;
                    }
                    Bundle notificationExtras = payload.getNotificationExtras();
                    Bitmap mo10195e = P10.getInstance(context).getImageLoader().mo10195e(context, notificationExtras, bigImageUrl, EnumC50778w20.NOTIFICATION_INLINE_PUSH_IMAGE);
                    if (mo10195e == null) {
                        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C27467j.f104578g, 7, null);
                        return null;
                    }
                    boolean m18279i = m18279i(context);
                    String packageName = context.getPackageName();
                    if (m18279i) {
                        i = R$layout.com_braze_push_inline_image_constrained;
                    } else {
                        i = R$layout.com_braze_notification_inline_image;
                    }
                    RemoteViews remoteViews = new RemoteViews(packageName, i);
                    X10 x10 = new X10(context);
                    Icon createWithResource = Icon.createWithResource(context, x10.getSmallNotificationIconResourceId());
                    Intrinsics.checkNotNullExpressionValue(createWithResource, "createWithResource(\n    …nResourceId\n            )");
                    Integer accentColor = payload.getAccentColor();
                    if (accentColor != null) {
                        createWithResource.setTint(accentColor.intValue());
                    }
                    remoteViews.setImageViewIcon(R$id.com_braze_inline_image_push_app_icon, createWithResource);
                    PackageManager packageManager = context.getPackageManager();
                    try {
                        if (Build.VERSION.SDK_INT >= 33) {
                            String packageName2 = context.getPackageName();
                            of = PackageManager.ApplicationInfoFlags.of(0L);
                            applicationInfo = packageManager.getApplicationInfo(packageName2, of);
                        } else {
                            applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                        }
                        Intrinsics.checkNotNullExpressionValue(applicationInfo, "{\n                if (Bu…          }\n            }");
                        remoteViews.setTextViewText(R$id.com_braze_inline_image_push_app_name_text, C51569xN1.m5358a((String) packageManager.getApplicationLabel(applicationInfo), x10));
                        remoteViews.setTextViewText(R$id.com_braze_inline_image_push_time_text, C46287oT0.m21030f(EnumC37717a20.CLOCK_12_HOUR));
                        String string = notificationExtras.getString("t");
                        if (string != null) {
                            remoteViews.setTextViewText(R$id.com_braze_inline_image_push_title_text, C51569xN1.m5358a(string, x10));
                        }
                        String string2 = notificationExtras.getString(C17296a.f69688o);
                        if (string2 != null) {
                            remoteViews.setTextViewText(R$id.com_braze_inline_image_push_content_text, C51569xN1.m5358a(string2, x10));
                        }
                        notificationBuilder.m71045o(remoteViews);
                        if (m18279i) {
                            notificationBuilder.m71041s(mo10195e);
                            return new C38054ac3.C10771f();
                        }
                        remoteViews.setImageViewBitmap(R$id.com_braze_inline_image_push_side_image, mo10195e);
                        return new C27480b();
                    } catch (PackageManager.NameNotFoundException e) {
                        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C27468k.f104579g, 4, null);
                        return null;
                    }
                }
            }
            z = true;
            if (!z) {
            }
        }

        /* renamed from: g */
        public final C38054ac3.AbstractC10775i m18281g(C38054ac3.C10770e notificationBuilder, BrazeNotificationPayload payload) {
            C38054ac3.AbstractC10775i abstractC10775i;
            Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (payload.isPushStory() && payload.getContext() != null) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C27469l.f104580g, 7, null);
                abstractC10775i = m18280h(notificationBuilder, payload);
            } else if (payload.isConversationalPush() && Build.VERSION.SDK_INT >= 25) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C27470m.f104581g, 7, null);
                abstractC10775i = m18283e(notificationBuilder, payload);
            } else if (payload.getBigImageUrl() != null) {
                if (payload.isInlineImagePush()) {
                    C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C27471n.f104582g, 7, null);
                    abstractC10775i = m18282f(payload, notificationBuilder);
                } else {
                    C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C27472o.f104583g, 7, null);
                    abstractC10775i = m18285c(payload);
                }
            } else {
                abstractC10775i = null;
            }
            if (abstractC10775i == null) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C27473p.f104584g, 7, null);
                return m18284d(payload);
            }
            return abstractC10775i;
        }

        /* renamed from: h */
        public final C38054ac3.C10771f m18280h(C38054ac3.C10770e notificationBuilder, BrazeNotificationPayload payload) {
            Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
            Intrinsics.checkNotNullParameter(payload, "payload");
            Context context = payload.getContext();
            if (context == null) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C27474q.f104585g, 7, null);
                return null;
            }
            List<BrazeNotificationPayload.PushStoryPage> pushStoryPages = payload.getPushStoryPages();
            int pushStoryPageIndex = payload.getPushStoryPageIndex();
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R$layout.com_braze_push_story_one_image);
            if (!m18278j(remoteViews, payload, pushStoryPages.get(pushStoryPageIndex))) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C27475r.f104586g, 6, null);
                return null;
            }
            Bundle notificationExtras = payload.getNotificationExtras();
            C38054ac3.C10771f c10771f = new C38054ac3.C10771f();
            int size = pushStoryPages.size();
            remoteViews.setOnClickPendingIntent(R$id.com_braze_story_button_previous, m18286b(context, notificationExtras, ((pushStoryPageIndex - 1) + size) % size));
            remoteViews.setOnClickPendingIntent(R$id.com_braze_story_button_next, m18286b(context, notificationExtras, (pushStoryPageIndex + 1) % size));
            notificationBuilder.m71046n(remoteViews);
            notificationBuilder.m71037w(true);
            return c10771f;
        }

        /* renamed from: i */
        public final boolean m18279i(Context context) {
            if (Build.VERSION.SDK_INT >= 31 && context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 31) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
            if (r6 != false) goto L38;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
        /* renamed from: j */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean m18278j(RemoteViews remoteViews, BrazeNotificationPayload brazeNotificationPayload, BrazeNotificationPayload.PushStoryPage pushStoryPage) {
            boolean z;
            boolean z2;
            String subtitle;
            boolean isBlank;
            boolean isBlank2;
            boolean isBlank3;
            Context context = brazeNotificationPayload.getContext();
            boolean z3 = false;
            if (context == null) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C27476s.f104587g, 7, null);
                return false;
            }
            X10 configurationProvider = brazeNotificationPayload.getConfigurationProvider();
            if (configurationProvider == null) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C27477t.f104588g, 7, null);
                return false;
            }
            String bitmapUrl = pushStoryPage.getBitmapUrl();
            if (bitmapUrl != null) {
                isBlank3 = StringsKt__StringsJVMKt.isBlank(bitmapUrl);
                if (!isBlank3) {
                    z = false;
                    if (!z) {
                        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C27478u.f104589g, 7, null);
                        return false;
                    }
                    Bitmap mo10195e = P10.getInstance(context).getImageLoader().mo10195e(context, brazeNotificationPayload.getNotificationExtras(), bitmapUrl, EnumC50778w20.NOTIFICATION_ONE_IMAGE_STORY);
                    if (mo10195e == null) {
                        return false;
                    }
                    remoteViews.setImageViewBitmap(R$id.com_braze_story_image_view, mo10195e);
                    String title = pushStoryPage.getTitle();
                    if (title != null) {
                        isBlank2 = StringsKt__StringsJVMKt.isBlank(title);
                        if (!isBlank2) {
                            z2 = false;
                            if (z2) {
                                remoteViews.setTextViewText(R$id.com_braze_story_text_view, C51569xN1.m5358a(title, configurationProvider));
                                remoteViews.setInt(R$id.com_braze_story_text_view_container, "setGravity", pushStoryPage.getTitleGravity());
                            } else {
                                remoteViews.setInt(R$id.com_braze_story_text_view_container, "setVisibility", 8);
                            }
                            subtitle = pushStoryPage.getSubtitle();
                            if (subtitle != null) {
                                isBlank = StringsKt__StringsJVMKt.isBlank(subtitle);
                            }
                            z3 = true;
                            if (z3) {
                                remoteViews.setTextViewText(R$id.com_braze_story_text_view_small, C51569xN1.m5358a(subtitle, configurationProvider));
                                remoteViews.setInt(R$id.com_braze_story_text_view_small_container, "setGravity", pushStoryPage.getSubtitleGravity());
                            } else {
                                remoteViews.setInt(R$id.com_braze_story_text_view_small_container, "setVisibility", 8);
                            }
                            remoteViews.setOnClickPendingIntent(R$id.com_braze_story_relative_layout, m18287a(context, pushStoryPage));
                            return true;
                        }
                    }
                    z2 = true;
                    if (z2) {
                    }
                    subtitle = pushStoryPage.getSubtitle();
                    if (subtitle != null) {
                    }
                    z3 = true;
                    if (z3) {
                    }
                    remoteViews.setOnClickPendingIntent(R$id.com_braze_story_relative_layout, m18287a(context, pushStoryPage));
                    return true;
                }
            }
            z = true;
            if (!z) {
            }
        }

        @JvmStatic
        /* renamed from: k */
        public final void m18277k(C38054ac3.C10764b bigPictureNotificationStyle, BrazeNotificationPayload payload) {
            String contentText;
            Intrinsics.checkNotNullParameter(bigPictureNotificationStyle, "bigPictureNotificationStyle");
            Intrinsics.checkNotNullParameter(payload, "payload");
            X10 configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider == null) {
                return;
            }
            String bigSummaryText = payload.getBigSummaryText();
            String bigTitleText = payload.getBigTitleText();
            String summaryText = payload.getSummaryText();
            if (bigSummaryText != null) {
                bigPictureNotificationStyle.m71079k(C51569xN1.m5358a(bigSummaryText, configurationProvider));
            }
            if (bigTitleText != null) {
                bigPictureNotificationStyle.m71080j(C51569xN1.m5358a(bigTitleText, configurationProvider));
            }
            if (summaryText == null && bigSummaryText == null && (contentText = payload.getContentText()) != null) {
                bigPictureNotificationStyle.m71079k(C51569xN1.m5358a(contentText, configurationProvider));
            }
        }

        @JvmStatic
        /* renamed from: l */
        public final void m18276l(C38054ac3.C10770e notificationBuilder, BrazeNotificationPayload payload) {
            Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
            Intrinsics.checkNotNullParameter(payload, "payload");
            C38054ac3.AbstractC10775i m18281g = m18281g(notificationBuilder, payload);
            if (!(m18281g instanceof C27480b)) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C27479v.f104590g, 7, null);
                notificationBuilder.m71065D(m18281g);
            }
        }

        private C27457a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lq20$b;", "Lac3$i;", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: q20$b */
    /* loaded from: classes2.dex */
    public static final class C27480b extends C38054ac3.AbstractC10775i {
    }
}
