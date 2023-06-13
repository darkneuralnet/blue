package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.chuckerteam.chucker.internal.p029ui.MainActivity;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000bR \u0010\r\u001a\u00020\u00068\u0006X\u0086D¢\u0006\u0012\n\u0004\b\u0005\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\"\u0010\u0019\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001b\u001a\u00020\u00068F¢\u0006\f\u0012\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u001d"}, m28432d2 = {"Ljj0;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "b", "", "enabled", "", "e", C17296a.f69688o, "(Landroid/content/Context;)V", "Z", "isOp", "()Z", "isOp$annotations", "()V", "c", "_isEnabled", "LEx2;", DateTokenConverter.CONVERTER_KEY, "LEx2;", "()LEx2;", "setLogger$com_github_ChuckerTeam_Chucker_library", "(LEx2;)V", "logger", "isEnabled$annotations", "isEnabled", "<init>", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nChucker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chucker.kt\ncom/chuckerteam/chucker/api/Chucker\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n31#2:113\n1747#3,3:114\n*S KotlinDebug\n*F\n+ 1 Chucker.kt\ncom/chuckerteam/chucker/api/Chucker\n*L\n68#1:113\n69#1:114,3\n*E\n"})
/* renamed from: jj0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43475jj0 {

    /* renamed from: c */
    public static boolean f93241c;

    /* renamed from: a */
    public static final C43475jj0 f93239a = new C43475jj0();

    /* renamed from: b */
    public static final boolean f93240b = true;

    /* renamed from: d */
    public static InterfaceC32758Ex2 f93242d = new C24995a();

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m28432d2 = {"jj0$a", "LEx2;", "", "message", "", "throwable", "", C17296a.f69688o, "b", "error", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: jj0$a */
    /* loaded from: classes5.dex */
    public static final class C24995a implements InterfaceC32758Ex2 {

        /* renamed from: b */
        public final String f93243b = "Chucker";

        @Override // p000.InterfaceC32758Ex2
        /* renamed from: a */
        public void mo30037a(String message, Throwable th) {
            Intrinsics.checkNotNullParameter(message, "message");
            Log.i(this.f93243b, message, th);
        }

        @Override // p000.InterfaceC32758Ex2
        /* renamed from: b */
        public void mo30036b(String message, Throwable th) {
            Intrinsics.checkNotNullParameter(message, "message");
            Log.w(this.f93243b, message, th);
        }

        @Override // p000.InterfaceC32758Ex2
        public void error(String message, Throwable th) {
            Intrinsics.checkNotNullParameter(message, "message");
            Log.e(this.f93243b, message, th);
        }
    }

    private C43475jj0() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final Intent m30041b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent flags = new Intent(context, MainActivity.class).setFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(flags, "Intent(context, MainActi…t.FLAG_ACTIVITY_NEW_TASK)");
        return flags;
    }

    /* renamed from: a */
    public final void m30042a(Context context) {
        ShortcutManager m64076a;
        List dynamicShortcuts;
        String id;
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder longLabel;
        ShortcutInfo.Builder icon;
        ShortcutInfo.Builder intent;
        ShortcutInfo build;
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT < 25 || (m64076a = C38714bj0.m64076a(NA0.m94294j(context, ShortcutManager.class))) == null) {
            return;
        }
        dynamicShortcuts = m64076a.getDynamicShortcuts();
        Intrinsics.checkNotNullExpressionValue(dynamicShortcuts, "shortcutManager.dynamicShortcuts");
        List list = dynamicShortcuts;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                id = C39918dj0.m43853a(it.next()).getId();
                if (Intrinsics.areEqual(id, "chuckerShortcutId")) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            return;
        }
        C38121aj0.m70827a();
        ShortcutInfo.Builder m76548a = C37067Xi0.m76548a(context, "chuckerShortcutId");
        int i = C38145al4.chucker_shortcut_label;
        shortLabel = m76548a.setShortLabel(context.getString(i));
        longLabel = shortLabel.setLongLabel(context.getString(i));
        icon = longLabel.setIcon(Icon.createWithResource(context, C36621Vk4.chucker_ic_launcher));
        intent = icon.setIntent(m30041b(context).setAction("android.intent.action.VIEW"));
        build = intent.build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder(context, SHORTCU…EW))\n            .build()");
        try {
            m64076a.addDynamicShortcuts(CollectionsKt.listOf(build));
        } catch (IllegalArgumentException e) {
            InterfaceC32758Ex2.f8338a.mo30036b("ShortcutManager addDynamicShortcuts failed ", e);
        } catch (IllegalStateException e2) {
            InterfaceC32758Ex2.f8338a.mo30036b("ShortcutManager addDynamicShortcuts failed ", e2);
        }
    }

    /* renamed from: c */
    public final InterfaceC32758Ex2 m30040c() {
        return f93242d;
    }

    /* renamed from: d */
    public final boolean m30039d() {
        return f93241c;
    }

    /* renamed from: e */
    public final void m30038e(boolean z) {
        f93241c = z;
    }
}
