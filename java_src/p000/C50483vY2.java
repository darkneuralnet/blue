package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.C17216a;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.financialconnections.p040di.NamedConstantsKt;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
@Metadata(m28433d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\u0007MPS\b\u0005\u0004LB\t\b\u0002¢\u0006\u0004\bb\u0010`J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001a\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0006H\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0007J&\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0007Jl\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00072\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00112\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001c\u001a\u00020\u0014H\u0007Jl\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00072\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00112\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001c\u001a\u00020\u0014H\u0002Jz\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u00072\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00112\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001c\u001a\u00020\u0014H\u0007J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!H\u0007J:\u0010*\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u00072\b\u0010%\u001a\u0004\u0018\u00010\u00072\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0007J6\u0010-\u001a\u00020,2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u00072\b\u0010%\u001a\u0004\u0018\u00010\u00072\u0006\u0010\"\u001a\u00020!2\b\u0010+\u001a\u0004\u0018\u00010(H\u0007J&\u00102\u001a\u0004\u0018\u00010\u000b2\u0006\u0010.\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u00010(2\b\u00101\u001a\u0004\u0018\u000100H\u0007J\u0012\u00103\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u00104\u001a\u00020!2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0014\u00106\u001a\u0004\u0018\u0001052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007J\u0012\u00107\u001a\u0004\u0018\u00010(2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0012\u00108\u001a\u0004\u0018\u00010(2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0010\u0010:\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u000bH\u0007J\u0014\u0010<\u001a\u0004\u0018\u0001002\b\u0010;\u001a\u0004\u0018\u00010(H\u0007J\u0014\u0010=\u001a\u0004\u0018\u00010(2\b\u0010\u0005\u001a\u0004\u0018\u000100H\u0007J\u0010\u0010?\u001a\u00020!2\u0006\u0010>\u001a\u00020!H\u0007J\u0018\u0010B\u001a\u00020&2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010A\u001a\u00020@H\u0007J \u0010D\u001a\u00020&2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010A\u001a\u00020@H\u0002J\b\u0010E\u001a\u00020,H\u0007J\u0016\u0010G\u001a\b\u0012\u0004\u0012\u00020!0F2\u0006\u0010\r\u001a\u00020\u0003H\u0002J(\u0010J\u001a\u00020!2\u000e\u0010H\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010F2\u0006\u0010I\u001a\u00020!2\u0006\u0010A\u001a\u00020@H\u0007J\u0010\u0010L\u001a\u00020K2\u0006\u0010\r\u001a\u00020\u0003H\u0002R\u0014\u0010O\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010QR&\u0010V\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010UR\u0014\u0010Y\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010XR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020!0Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010[R\u001a\u0010a\u001a\u00020!8FX\u0087\u0004¢\u0006\f\u0012\u0004\b_\u0010`\u001a\u0004\b]\u0010^¨\u0006c"}, m28432d2 = {"LvY2;", "", "", "LvY2$e;", "f", "e", "", "", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "intent", "appInfo", "D", "E", NamedConstantsKt.APPLICATION_ID, "", "permissions", "e2e", "", "isRerequest", "isForPublish", "LrW0;", "defaultAudience", "clientState", "authType", "messengerPageId", "resetMessengerState", "j", "ignoreAppSwitchToLoggedOut", "k", "o", "", "version", "A", "callId", "action", "LvY2$f;", "versionResult", "Landroid/os/Bundle;", "extras", "l", "params", "", "B", "requestIntent", "results", "Lcom/facebook/FacebookException;", "error", "n", "m", "y", "Ljava/util/UUID;", "r", "q", "x", "resultIntent", "z", "errorData", "s", "i", "minimumVersion", "v", "", "versionSpec", "t", "appInfoList", "u", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Ljava/util/TreeSet;", "p", "allAvailableFacebookAppVersions", "latestSdkVersion", "h", "Landroid/net/Uri;", "g", C17296a.f69688o, "Ljava/lang/String;", "TAG", "b", "Ljava/util/List;", "facebookAppInfoList", "c", "effectCameraAppInfoList", "Ljava/util/Map;", "actionToAppInfoMap", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "protocolVersionsAsyncUpdating", "", "[Ljava/lang/Integer;", "KNOWN_PROTOCOL_VERSIONS", "w", "()I", "getLatestKnownVersion$annotations", "()V", "latestKnownVersion", "<init>", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: vY2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50483vY2 {

    /* renamed from: a */
    public static final String f114250a;

    /* renamed from: b */
    public static final List<AbstractC29586e> f114251b;

    /* renamed from: c */
    public static final List<AbstractC29586e> f114252c;

    /* renamed from: d */
    public static final Map<String, List<AbstractC29586e>> f114253d;

    /* renamed from: e */
    public static final AtomicBoolean f114254e;

    /* renamed from: f */
    public static final Integer[] f114255f;

    /* renamed from: g */
    public static final C50483vY2 f114256g;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"LvY2$a;", "LvY2$e;", "", "e", "", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: vY2$a */
    /* loaded from: classes5.dex */
    public static final class C29581a extends AbstractC29586e {
        @Override // p000.C50483vY2.AbstractC29586e
        /* renamed from: c */
        public /* bridge */ /* synthetic */ String mo8451c() {
            return (String) m8461e();
        }

        @Override // p000.C50483vY2.AbstractC29586e
        /* renamed from: d */
        public String mo8450d() {
            return "com.facebook.arstudio.player";
        }

        /* renamed from: e */
        public Void m8461e() {
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, m28432d2 = {"LvY2$b;", "LvY2$e;", "", "c", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "b", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: vY2$b */
    /* loaded from: classes5.dex */
    public static final class C29582b extends AbstractC29586e {

        /* renamed from: b */
        public static final C29583a f114257b = new C29583a(null);

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LvY2$b$a;", "", "", "FACEBOOK_LITE_ACTIVITY", "Ljava/lang/String;", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
        /* renamed from: vY2$b$a */
        /* loaded from: classes5.dex */
        public static final class C29583a {
            private C29583a() {
            }

            public /* synthetic */ C29583a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // p000.C50483vY2.AbstractC29586e
        /* renamed from: c */
        public String mo8451c() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }

        @Override // p000.C50483vY2.AbstractC29586e
        /* renamed from: d */
        public String mo8450d() {
            return "com.facebook.lite";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"LvY2$c;", "LvY2$e;", "", "c", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: vY2$c */
    /* loaded from: classes5.dex */
    public static final class C29584c extends AbstractC29586e {
        @Override // p000.C50483vY2.AbstractC29586e
        /* renamed from: c */
        public String mo8451c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // p000.C50483vY2.AbstractC29586e
        /* renamed from: d */
        public String mo8450d() {
            return "com.facebook.katana";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"LvY2$d;", "LvY2$e;", "", "e", "", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: vY2$d */
    /* loaded from: classes5.dex */
    public static final class C29585d extends AbstractC29586e {
        @Override // p000.C50483vY2.AbstractC29586e
        /* renamed from: c */
        public /* bridge */ /* synthetic */ String mo8451c() {
            return (String) m8460e();
        }

        @Override // p000.C50483vY2.AbstractC29586e
        /* renamed from: d */
        public String mo8450d() {
            return "com.facebook.orca";
        }

        /* renamed from: e */
        public Void m8460e() {
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"LvY2$e;", "", "", DateTokenConverter.CONVERTER_KEY, "c", "Ljava/util/TreeSet;", "", "b", "", "force", "", C17296a.f69688o, "Ljava/util/TreeSet;", "availableVersions", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: vY2$e */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC29586e {

        /* renamed from: a */
        public TreeSet<Integer> f114258a;

        /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
            if (r1.isEmpty() == false) goto L4;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final synchronized void m8459a(boolean z) {
            if (!z) {
                TreeSet<Integer> treeSet = this.f114258a;
                if (treeSet != null) {
                    if (treeSet != null) {
                    }
                }
            }
            this.f114258a = C50483vY2.m8487a(C50483vY2.f114256g, this);
        }

        /* renamed from: b */
        public final TreeSet<Integer> m8458b() {
            TreeSet<Integer> treeSet = this.f114258a;
            if (treeSet == null || treeSet == null || treeSet.isEmpty()) {
                m8459a(false);
            }
            return this.f114258a;
        }

        /* renamed from: c */
        public abstract String mo8451c();

        /* renamed from: d */
        public abstract String mo8450d();
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00062\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R$\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"LvY2$f;", "", "LvY2$e;", "<set-?>", C17296a.f69688o, "LvY2$e;", "c", "()LvY2$e;", "appInfo", "", "b", "I", DateTokenConverter.CONVERTER_KEY, "()I", "protocolVersion", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: vY2$f */
    /* loaded from: classes5.dex */
    public static final class C29587f {

        /* renamed from: c */
        public static final C29588a f114259c = new C29588a(null);

        /* renamed from: a */
        public AbstractC29586e f114260a;

        /* renamed from: b */
        public int f114261b;

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, m28432d2 = {"LvY2$f$a;", "", "LvY2$e;", "nativeAppInfo", "", "protocolVersion", "LvY2$f;", C17296a.f69688o, "b", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
        /* renamed from: vY2$f$a */
        /* loaded from: classes5.dex */
        public static final class C29588a {
            private C29588a() {
            }

            @JvmStatic
            /* renamed from: a */
            public final C29587f m8453a(AbstractC29586e abstractC29586e, int i) {
                C29587f c29587f = new C29587f(null);
                c29587f.f114260a = abstractC29586e;
                c29587f.f114261b = i;
                return c29587f;
            }

            @JvmStatic
            /* renamed from: b */
            public final C29587f m8452b() {
                C29587f c29587f = new C29587f(null);
                c29587f.f114261b = -1;
                return c29587f;
            }

            public /* synthetic */ C29588a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private C29587f() {
        }

        /* renamed from: c */
        public final AbstractC29586e m8455c() {
            return this.f114260a;
        }

        /* renamed from: d */
        public final int m8454d() {
            return this.f114261b;
        }

        public /* synthetic */ C29587f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"LvY2$g;", "LvY2$e;", "", "c", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: vY2$g */
    /* loaded from: classes5.dex */
    public static final class C29589g extends AbstractC29586e {
        @Override // p000.C50483vY2.AbstractC29586e
        /* renamed from: c */
        public String mo8451c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // p000.C50483vY2.AbstractC29586e
        /* renamed from: d */
        public String mo8450d() {
            return "com.facebook.wakizashi";
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: vY2$h */
    /* loaded from: classes5.dex */
    public static final class RunnableC29590h implements Runnable {

        /* renamed from: b */
        public static final RunnableC29590h f114262b = new RunnableC29590h();

        @Override // java.lang.Runnable
        public final void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                try {
                    for (AbstractC29586e abstractC29586e : C50483vY2.m8486b(C50483vY2.f114256g)) {
                        abstractC29586e.m8459a(true);
                    }
                } finally {
                    C50483vY2.m8485c(C50483vY2.f114256g).set(false);
                }
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    static {
        C50483vY2 c50483vY2 = new C50483vY2();
        f114256g = c50483vY2;
        String name = C50483vY2.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "NativeProtocol::class.java.name");
        f114250a = name;
        f114251b = c50483vY2.m8482f();
        f114252c = c50483vY2.m8483e();
        f114253d = c50483vY2.m8484d();
        f114254e = new AtomicBoolean(false);
        f114255f = new Integer[]{20170417, 20160327, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140204, 20131107, 20130618, 20130502, 20121101};
    }

    private C50483vY2() {
    }

    @JvmStatic
    /* renamed from: A */
    public static final boolean m8492A(int i) {
        if (TD0.m84203d(C50483vY2.class)) {
            return false;
        }
        try {
            if (!ArraysKt.contains(f114255f, Integer.valueOf(i)) || i < 20140701) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TD0.m84205b(th, C50483vY2.class);
            return false;
        }
    }

    @JvmStatic
    /* renamed from: B */
    public static final void m8491B(Intent intent, String str, String str2, int i, Bundle bundle) {
        if (TD0.m84203d(C50483vY2.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            String m52740f = C17216a.m52740f();
            String m52739g = C17216a.m52739g();
            intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", str2).putExtra("com.facebook.platform.extra.APPLICATION_ID", m52740f);
            if (m8492A(i)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("action_id", str);
                C52364yi6.m2838g0(bundle2, AnalyticsFields.APP_NAME, m52739g);
                intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Intrinsics.checkNotNullExpressionValue(intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", bundle), "intent.putExtra(EXTRA_PR…OD_ARGS, methodArguments)");
                return;
            }
            intent.putExtra("com.facebook.platform.protocol.CALL_ID", str);
            if (!C52364yi6.m2860R(m52739g)) {
                intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", m52739g);
            }
            if (bundle != null) {
                intent.putExtras(bundle);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C50483vY2.class);
        }
    }

    @JvmStatic
    /* renamed from: C */
    public static final void m8490C() {
        if (TD0.m84203d(C50483vY2.class)) {
            return;
        }
        try {
            if (!f114254e.compareAndSet(false, true)) {
                return;
            }
            C17216a.m52731o().execute(RunnableC29590h.f114262b);
        } catch (Throwable th) {
            TD0.m84205b(th, C50483vY2.class);
        }
    }

    @JvmStatic
    /* renamed from: D */
    public static final Intent m8489D(Context context, Intent intent, AbstractC29586e abstractC29586e) {
        ResolveInfo resolveActivity;
        if (TD0.m84203d(C50483vY2.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (intent == null || (resolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null) {
                return null;
            }
            String str = resolveActivity.activityInfo.packageName;
            Intrinsics.checkNotNullExpressionValue(str, "resolveInfo.activityInfo.packageName");
            if (!C47034pj1.m18895a(context, str)) {
                return null;
            }
            return intent;
        } catch (Throwable th) {
            TD0.m84205b(th, C50483vY2.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: E */
    public static final Intent m8488E(Context context, Intent intent, AbstractC29586e abstractC29586e) {
        ResolveInfo resolveService;
        if (TD0.m84203d(C50483vY2.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (intent == null || (resolveService = context.getPackageManager().resolveService(intent, 0)) == null) {
                return null;
            }
            String str = resolveService.serviceInfo.packageName;
            Intrinsics.checkNotNullExpressionValue(str, "resolveInfo.serviceInfo.packageName");
            if (!C47034pj1.m18895a(context, str)) {
                return null;
            }
            return intent;
        } catch (Throwable th) {
            TD0.m84205b(th, C50483vY2.class);
            return null;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TreeSet m8487a(C50483vY2 c50483vY2, AbstractC29586e abstractC29586e) {
        if (TD0.m84203d(C50483vY2.class)) {
            return null;
        }
        try {
            return c50483vY2.m8472p(abstractC29586e);
        } catch (Throwable th) {
            TD0.m84205b(th, C50483vY2.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ List m8486b(C50483vY2 c50483vY2) {
        if (TD0.m84203d(C50483vY2.class)) {
            return null;
        }
        try {
            return f114251b;
        } catch (Throwable th) {
            TD0.m84205b(th, C50483vY2.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ AtomicBoolean m8485c(C50483vY2 c50483vY2) {
        if (TD0.m84203d(C50483vY2.class)) {
            return null;
        }
        try {
            return f114254e;
        } catch (Throwable th) {
            TD0.m84205b(th, C50483vY2.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: h */
    public static final int m8480h(TreeSet<Integer> treeSet, int i, int[] versionSpec) {
        if (TD0.m84203d(C50483vY2.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(versionSpec, "versionSpec");
            if (treeSet == null) {
                return -1;
            }
            int length = versionSpec.length - 1;
            Iterator<Integer> descendingIterator = treeSet.descendingIterator();
            int i2 = -1;
            while (descendingIterator.hasNext()) {
                Integer fbAppVersion = descendingIterator.next();
                Intrinsics.checkNotNullExpressionValue(fbAppVersion, "fbAppVersion");
                i2 = Math.max(i2, fbAppVersion.intValue());
                while (length >= 0 && versionSpec[length] > fbAppVersion.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (versionSpec[length] == fbAppVersion.intValue()) {
                    if (length % 2 != 0) {
                        return -1;
                    }
                    return Math.min(i2, i);
                }
            }
            return -1;
        } catch (Throwable th) {
            TD0.m84205b(th, C50483vY2.class);
            return 0;
        }
    }

    @JvmStatic
    /* renamed from: i */
    public static final Bundle m8479i(FacebookException facebookException) {
        if (TD0.m84203d(C50483vY2.class) || facebookException == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", facebookException.toString());
            if (facebookException instanceof FacebookOperationCanceledException) {
                bundle.putString("error_type", "UserCanceled");
            }
            return bundle;
        } catch (Throwable th) {
            TD0.m84205b(th, C50483vY2.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: j */
    public static final Intent m8478j(Context context, String applicationId, Collection<String> permissions, String e2e, boolean z, boolean z2, EnumC48093rW0 defaultAudience, String clientState, String authType, String str, boolean z3) {
        if (TD0.m84203d(C50483vY2.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            Intrinsics.checkNotNullParameter(e2e, "e2e");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(clientState, "clientState");
            Intrinsics.checkNotNullParameter(authType, "authType");
            C29582b c29582b = new C29582b();
            return m8489D(context, f114256g.m8477k(c29582b, applicationId, permissions, e2e, z2, defaultAudience, clientState, authType, false, str, z3), c29582b);
        } catch (Throwable th) {
            TD0.m84205b(th, C50483vY2.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: l */
    public static final Intent m8476l(Context context, String str, String str2, C29587f c29587f, Bundle bundle) {
        AbstractC29586e m8455c;
        Intent m8489D;
        if (TD0.m84203d(C50483vY2.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (c29587f == null || (m8455c = c29587f.m8455c()) == null || (m8489D = m8489D(context, new Intent().setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(m8455c.mo8450d()).addCategory("android.intent.category.DEFAULT"), m8455c)) == null) {
                return null;
            }
            m8491B(m8489D, str, str2, c29587f.m8454d(), bundle);
            return m8489D;
        } catch (Throwable th) {
            TD0.m84205b(th, C50483vY2.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: m */
    public static final Intent m8475m(Context context) {
        if (TD0.m84203d(C50483vY2.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            for (AbstractC29586e abstractC29586e : f114251b) {
                Intent m8488E = m8488E(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(abstractC29586e.mo8450d()).addCategory("android.intent.category.DEFAULT"), abstractC29586e);
                if (m8488E != null) {
                    return m8488E;
                }
            }
            return null;
        } catch (Throwable th) {
            TD0.m84205b(th, C50483vY2.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: n */
    public static final Intent m8474n(Intent requestIntent, Bundle bundle, FacebookException facebookException) {
        if (TD0.m84203d(C50483vY2.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(requestIntent, "requestIntent");
            UUID m8470r = m8470r(requestIntent);
            if (m8470r == null) {
                return null;
            }
            Intent intent = new Intent();
            intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m8463y(requestIntent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", m8470r.toString());
            if (facebookException != null) {
                bundle2.putBundle("error", m8479i(facebookException));
            }
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle != null) {
                intent.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent;
        } catch (Throwable th) {
            TD0.m84205b(th, C50483vY2.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: o */
    public static final List<Intent> m8473o(Context context, String applicationId, Collection<String> permissions, String e2e, boolean z, boolean z2, EnumC48093rW0 defaultAudience, String clientState, String authType, boolean z3, String str, boolean z4) {
        if (TD0.m84203d(C50483vY2.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            Intrinsics.checkNotNullParameter(e2e, "e2e");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(clientState, "clientState");
            Intrinsics.checkNotNullParameter(authType, "authType");
            ArrayList arrayList = new ArrayList();
            for (AbstractC29586e abstractC29586e : f114251b) {
                ArrayList arrayList2 = arrayList;
                Intent m8477k = f114256g.m8477k(abstractC29586e, applicationId, permissions, e2e, z2, defaultAudience, clientState, authType, z3, str, z4);
                if (m8477k != null) {
                    arrayList2.add(m8477k);
                }
                arrayList = arrayList2;
            }
            return arrayList;
        } catch (Throwable th) {
            TD0.m84205b(th, C50483vY2.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: q */
    public static final Bundle m8471q(Intent intent) {
        if (TD0.m84203d(C50483vY2.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (!m8492A(m8463y(intent))) {
                return null;
            }
            return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
        } catch (Throwable th) {
            TD0.m84205b(th, C50483vY2.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: r */
    public static final UUID m8470r(Intent intent) {
        String stringExtra;
        if (TD0.m84203d(C50483vY2.class) || intent == null) {
            return null;
        }
        try {
            if (m8492A(m8463y(intent))) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                if (bundleExtra != null) {
                    stringExtra = bundleExtra.getString("action_id");
                } else {
                    stringExtra = null;
                }
            } else {
                stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (stringExtra == null) {
                return null;
            }
            try {
                return UUID.fromString(stringExtra);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C50483vY2.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: s */
    public static final FacebookException m8469s(Bundle bundle) {
        if (TD0.m84203d(C50483vY2.class) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString("error_type");
            if (string == null) {
                string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = bundle.getString("error_description");
            if (string2 == null) {
                string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            if (string != null && StringsKt.equals(string, "UserCanceled", true)) {
                return new FacebookOperationCanceledException(string2);
            }
            return new FacebookException(string2);
        } catch (Throwable th) {
            TD0.m84205b(th, C50483vY2.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: t */
    public static final C29587f m8468t(String action, int[] versionSpec) {
        if (TD0.m84203d(C50483vY2.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(versionSpec, "versionSpec");
            List<AbstractC29586e> list = f114253d.get(action);
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            return f114256g.m8467u(list, versionSpec);
        } catch (Throwable th) {
            TD0.m84205b(th, C50483vY2.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: v */
    public static final int m8466v(int i) {
        if (TD0.m84203d(C50483vY2.class)) {
            return 0;
        }
        try {
            return f114256g.m8467u(f114251b, new int[]{i}).m8454d();
        } catch (Throwable th) {
            TD0.m84205b(th, C50483vY2.class);
            return 0;
        }
    }

    /* renamed from: w */
    public static final int m8465w() {
        if (TD0.m84203d(C50483vY2.class)) {
            return 0;
        }
        try {
            return f114255f[0].intValue();
        } catch (Throwable th) {
            TD0.m84205b(th, C50483vY2.class);
            return 0;
        }
    }

    @JvmStatic
    /* renamed from: x */
    public static final Bundle m8464x(Intent intent) {
        if (TD0.m84203d(C50483vY2.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (!m8492A(m8463y(intent))) {
                return intent.getExtras();
            }
            return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            TD0.m84205b(th, C50483vY2.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: y */
    public static final int m8463y(Intent intent) {
        if (TD0.m84203d(C50483vY2.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            TD0.m84205b(th, C50483vY2.class);
            return 0;
        }
    }

    @JvmStatic
    /* renamed from: z */
    public static final boolean m8462z(Intent resultIntent) {
        if (TD0.m84203d(C50483vY2.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(resultIntent, "resultIntent");
            Bundle m8471q = m8471q(resultIntent);
            if (m8471q != null) {
                return m8471q.containsKey("error");
            }
            return resultIntent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
        } catch (Throwable th) {
            TD0.m84205b(th, C50483vY2.class);
            return false;
        }
    }

    /* renamed from: d */
    public final Map<String, List<AbstractC29586e>> m8484d() {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C29585d());
            List<AbstractC29586e> list = f114251b;
            hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", f114252c);
            hashMap.put("com.facebook.platform.action.request.SHARE_STORY", list);
            return hashMap;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: e */
    public final List<AbstractC29586e> m8483e() {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            ArrayList arrayListOf = CollectionsKt.arrayListOf(new C29581a());
            arrayListOf.addAll(m8482f());
            return arrayListOf;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: f */
    public final List<AbstractC29586e> m8482f() {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            return CollectionsKt.arrayListOf(new C29584c(), new C29589g());
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: g */
    public final Uri m8481g(AbstractC29586e abstractC29586e) {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            Uri parse = Uri.parse("content://" + abstractC29586e.mo8450d() + ".provider.PlatformProvider/versions");
            Intrinsics.checkNotNullExpressionValue(parse, "Uri.parse(CONTENT_SCHEME…ATFORM_PROVIDER_VERSIONS)");
            return parse;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: k */
    public final Intent m8477k(AbstractC29586e abstractC29586e, String str, Collection<String> collection, String str2, boolean z, EnumC48093rW0 enumC48093rW0, String str3, String str4, boolean z2, String str5, boolean z3) {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            String mo8451c = abstractC29586e.mo8451c();
            if (mo8451c == null) {
                return null;
            }
            Intent putExtra = new Intent().setClassName(abstractC29586e.mo8450d(), mo8451c).putExtra(AnalyticsRequestV2.PARAM_CLIENT_ID, str);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent()\n            .se…PP_ID_KEY, applicationId)");
            putExtra.putExtra("facebook_sdk_version", C17216a.m52725u());
            if (!C52364yi6.m2859S(collection)) {
                putExtra.putExtra(Action.SCOPE_ATTRIBUTE, TextUtils.join(",", collection));
            }
            if (!C52364yi6.m2860R(str2)) {
                putExtra.putExtra("e2e", str2);
            }
            putExtra.putExtra(TransferTable.COLUMN_STATE, str3);
            putExtra.putExtra("response_type", "token,signed_request,graph_domain");
            putExtra.putExtra("return_scopes", "true");
            if (z) {
                putExtra.putExtra("default_audience", enumC48093rW0.m15837a());
            }
            putExtra.putExtra("legacy_override", C17216a.m52729q());
            putExtra.putExtra("auth_type", str4);
            if (z2) {
                putExtra.putExtra("fail_on_logged_out", true);
            }
            putExtra.putExtra("messenger_page_id", str5);
            putExtra.putExtra("reset_messenger_state", z3);
            return putExtra;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0091 A[Catch: all -> 0x009d, TRY_ENTER, TryCatch #6 {all -> 0x009d, blocks: (B:5:0x000c, B:35:0x0099, B:36:0x009c, B:30:0x0091), top: B:45:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073 A[EXC_TOP_SPLITTER, LOOP:0: B:43:0x0073->B:24:0x0079, LOOP_START, SYNTHETIC] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TreeSet<Integer> m8472p(AbstractC29586e abstractC29586e) {
        Cursor cursor;
        ProviderInfo providerInfo;
        Cursor cursor2;
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            TreeSet<Integer> treeSet = new TreeSet<>();
            Context appContext = C17216a.m52741e();
            Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
            ContentResolver contentResolver = appContext.getContentResolver();
            String[] strArr = {"version"};
            Uri m8481g = m8481g(abstractC29586e);
            try {
                Context m52741e = C17216a.m52741e();
                Intrinsics.checkNotNullExpressionValue(m52741e, "FacebookSdk.getApplicationContext()");
                try {
                    providerInfo = m52741e.getPackageManager().resolveContentProvider(abstractC29586e.mo8450d() + ".provider.PlatformProvider", 0);
                } catch (RuntimeException e) {
                    Log.e(f114250a, "Failed to query content resolver.", e);
                    providerInfo = null;
                }
                if (providerInfo != null) {
                    try {
                        cursor2 = contentResolver.query(m8481g, strArr, null, null, null);
                    } catch (IllegalArgumentException unused) {
                        Log.e(f114250a, "Failed to query content resolver.");
                        cursor2 = null;
                        if (cursor2 != null) {
                        }
                        if (cursor2 != null) {
                        }
                        return treeSet;
                    } catch (NullPointerException unused2) {
                        Log.e(f114250a, "Failed to query content resolver.");
                        cursor2 = null;
                        if (cursor2 != null) {
                        }
                        if (cursor2 != null) {
                        }
                        return treeSet;
                    } catch (SecurityException unused3) {
                        Log.e(f114250a, "Failed to query content resolver.");
                        cursor2 = null;
                        if (cursor2 != null) {
                        }
                        if (cursor2 != null) {
                        }
                        return treeSet;
                    }
                    if (cursor2 != null) {
                        while (cursor2.moveToNext()) {
                            try {
                                treeSet.add(Integer.valueOf(cursor2.getInt(cursor2.getColumnIndex("version"))));
                            } catch (Throwable th) {
                                cursor = cursor2;
                                th = th;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                    }
                } else {
                    cursor2 = null;
                }
                if (cursor2 != null) {
                    cursor2.close();
                }
                return treeSet;
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
            }
        } catch (Throwable th3) {
            TD0.m84205b(th3, this);
            return null;
        }
    }

    /* renamed from: u */
    public final C29587f m8467u(List<? extends AbstractC29586e> list, int[] iArr) {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            m8490C();
            if (list == null) {
                return C29587f.f114259c.m8452b();
            }
            for (AbstractC29586e abstractC29586e : list) {
                int m8480h = m8480h(abstractC29586e.m8458b(), m8465w(), iArr);
                if (m8480h != -1) {
                    return C29587f.f114259c.m8453a(abstractC29586e, m8480h);
                }
            }
            return C29587f.f114259c.m8452b();
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }
}
