package com.braze;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bo.app.C12954o1;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0017\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u000e"}, m28432d2 = {"Lcom/braze/BrazeBootReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "intent", "", "onReceive", "", "handleIncomingIntent", "<init>", "()V", "Companion", C17296a.f69688o, "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* loaded from: classes2.dex */
public class BrazeBootReceiver extends BroadcastReceiver {
    public static final C17006a Companion = new C17006a(null);

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lcom/braze/BrazeBootReceiver$a;", "", "", "BOOT_COMPLETE_ACTION", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: com.braze.BrazeBootReceiver$a */
    /* loaded from: classes2.dex */
    public static final class C17006a {
        public /* synthetic */ C17006a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C17006a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: com.braze.BrazeBootReceiver$b */
    /* loaded from: classes2.dex */
    public static final class C17007b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Intent f68958g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17007b(Intent intent) {
            super(0);
            this.f68958g = intent;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Received broadcast message. Message: ", this.f68958g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: com.braze.BrazeBootReceiver$c */
    /* loaded from: classes2.dex */
    public static final class C17008c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C17008c f68959g = new C17008c();

        public C17008c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Boot complete intent received. Initializing.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: com.braze.BrazeBootReceiver$d */
    /* loaded from: classes2.dex */
    public static final class C17009d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Intent f68960g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17009d(Intent intent) {
            super(0);
            this.f68960g = intent;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Unknown intent " + this.f68960g + " received. Doing nothing.";
        }
    }

    public final boolean handleIncomingIntent(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        C43664k20 c43664k20 = C43664k20.f93782a;
        C43664k20.EnumC25082a enumC25082a = C43664k20.EnumC25082a.I;
        C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, new C17007b(intent), 6, null);
        if (Intrinsics.areEqual("android.intent.action.BOOT_COMPLETED", intent.getAction())) {
            C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, C17008c.f68959g, 6, null);
            C12954o1.m63244a(context);
            P10.getInstance(context);
            return true;
        }
        C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.W, null, false, new C17009d(intent), 6, null);
        return false;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        handleIncomingIntent(context, intent);
    }
}
