package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0005B!\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u0016\u0010\u0005\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0004H\u0016¨\u0006\u0014"}, m28432d2 = {"Lbo/app/j6;", "Lbo/app/x2;", "", "", "", C17296a.f69688o, "", "Lbo/app/y2;", "triggeredActions", "", "triggeredAction", "", "b", "eventTimeInSeconds", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "userId", "apiKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.j6 */
/* loaded from: classes.dex */
public final class C12798j6 implements InterfaceC13201x2 {

    /* renamed from: c */
    public static final C12799a f58730c = new C12799a(null);

    /* renamed from: a */
    private final SharedPreferences f58731a;

    /* renamed from: b */
    private final Map<String, Long> f58732b;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lbo/app/j6$a;", "", "", "RE_ELIGIBILITY_FILE_PREFIX", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.j6$a */
    /* loaded from: classes.dex */
    public static final class C12799a {
        public /* synthetic */ C12799a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12799a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.j6$b */
    /* loaded from: classes.dex */
    public static final class C12800b extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13232y2 f58733b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12800b(InterfaceC13232y2 interfaceC13232y2) {
            super(0);
            this.f58733b = interfaceC13232y2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Triggered action id " + this.f58733b.getId() + " always eligible via configuration. Returning true for eligibility status";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.j6$c */
    /* loaded from: classes.dex */
    public static final class C12801c extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13232y2 f58734b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12801c(InterfaceC13232y2 interfaceC13232y2) {
            super(0);
            this.f58734b = interfaceC13232y2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Triggered action id " + this.f58734b.getId() + " always eligible via never having been triggered. Returning true for eligibility status";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.j6$d */
    /* loaded from: classes.dex */
    public static final class C12802d extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13232y2 f58735b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12802d(InterfaceC13232y2 interfaceC13232y2) {
            super(0);
            this.f58735b = interfaceC13232y2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Triggered action id " + this.f58735b.getId() + " no longer eligible due to having been triggered in the past and is only eligible once.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.j6$e */
    /* loaded from: classes.dex */
    public static final class C12803e extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ long f58736b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC12817k2 f58737c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12803e(long j, InterfaceC12817k2 interfaceC12817k2) {
            super(0);
            this.f58736b = j;
            this.f58737c = interfaceC12817k2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Trigger action is re-eligible for display since " + (C46287oT0.m21027i() - this.f58736b) + " seconds have passed since the last time it was triggered (minimum interval: " + this.f58737c.mo63460q() + ").";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.j6$f */
    /* loaded from: classes.dex */
    public static final class C12804f extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ long f58738b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC12817k2 f58739c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12804f(long j, InterfaceC12817k2 interfaceC12817k2) {
            super(0);
            this.f58738b = j;
            this.f58739c = interfaceC12817k2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Trigger action is not re-eligible for display since only " + (C46287oT0.m21027i() - this.f58738b) + " seconds have passed since the last time it was triggered (minimum interval: " + this.f58739c.mo63460q() + ").";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.j6$g */
    /* loaded from: classes.dex */
    public static final class C12805g extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13232y2 f58740b;

        /* renamed from: c */
        final /* synthetic */ long f58741c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12805g(InterfaceC13232y2 interfaceC13232y2, long j) {
            super(0);
            this.f58740b = interfaceC13232y2;
            this.f58741c = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Updating re-eligibility for action Id " + this.f58740b.getId() + " to time " + this.f58741c + CoreConstants.DOT;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.j6$h */
    /* loaded from: classes.dex */
    public static final class C12806h extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58742b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12806h(String str) {
            super(0);
            this.f58742b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Deleting outdated triggered action id " + this.f58742b + " from stored re-eligibility list. In-memory re-eligibility list is unchanged.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.j6$i */
    /* loaded from: classes.dex */
    public static final class C12807i extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58743b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12807i(String str) {
            super(0);
            this.f58743b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Retaining triggered action " + this.f58743b + " in re-eligibility list.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.j6$j */
    /* loaded from: classes.dex */
    public static final class C12808j extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58744b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12808j(String str) {
            super(0);
            this.f58744b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Retrieving triggered action id " + ((Object) this.f58744b) + " eligibility information from local storage.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.j6$k */
    /* loaded from: classes.dex */
    public static final class C12809k extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12809k f58745b = new C12809k();

        public C12809k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Encountered unexpected exception while parsing stored re-eligibility information.";
        }
    }

    public C12798j6(Context context, String str, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences(Intrinsics.stringPlus("com.appboy.storage.triggers.re_eligibility", C43318jS5.m30601c(context, str, apiKey)), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f58731a = sharedPreferences;
        this.f58732b = m63479a();
    }

    @Override // bo.app.InterfaceC13201x2
    /* renamed from: a */
    public void mo62824a(InterfaceC13232y2 triggeredAction, long j) {
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12805g(triggeredAction, j), 7, null);
        this.f58732b.put(triggeredAction.getId(), Long.valueOf(j));
        this.f58731a.edit().putLong(triggeredAction.getId(), j).apply();
    }

    @Override // bo.app.InterfaceC13201x2
    /* renamed from: b */
    public boolean mo62823b(InterfaceC13232y2 triggeredAction) {
        long longValue;
        int intValue;
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        InterfaceC12817k2 mo62976t = triggeredAction.mo62740f().mo62976t();
        if (mo62976t.mo63461o()) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12800b(triggeredAction), 7, null);
            return true;
        } else if (!this.f58732b.containsKey(triggeredAction.getId())) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12801c(triggeredAction), 7, null);
            return true;
        } else if (mo62976t.mo63459s()) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12802d(triggeredAction), 7, null);
            return false;
        } else {
            Long l = this.f58732b.get(triggeredAction.getId());
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            long m21027i = C46287oT0.m21027i() + triggeredAction.mo62740f().mo62979g();
            Integer mo63460q = mo62976t.mo63460q();
            if (mo63460q == null) {
                intValue = 0;
            } else {
                intValue = mo63460q.intValue();
            }
            if (m21027i >= intValue + longValue) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12803e(longValue, mo62976t), 7, null);
                return true;
            }
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12804f(longValue, mo62976t), 7, null);
            return false;
        }
    }

    /* renamed from: a */
    private final Map<String, Long> m63479a() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        try {
            for (String actionId : this.f58731a.getAll().keySet()) {
                long j = this.f58731a.getLong(actionId, 0L);
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12808j(actionId), 7, null);
                Intrinsics.checkNotNullExpressionValue(actionId, "actionId");
                concurrentHashMap.put(actionId, Long.valueOf(j));
            }
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12809k.f58745b, 4, null);
        }
        return concurrentHashMap;
    }

    @Override // bo.app.InterfaceC13190w2
    /* renamed from: a */
    public void mo62690a(List<? extends InterfaceC13232y2> triggeredActions) {
        int collectionSizeOrDefault;
        Set<String> set;
        Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(triggeredActions, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (InterfaceC13232y2 interfaceC13232y2 : triggeredActions) {
            arrayList.add(interfaceC13232y2.getId());
        }
        SharedPreferences.Editor edit = this.f58731a.edit();
        set = CollectionsKt___CollectionsKt.toSet(this.f58732b.keySet());
        for (String str : set) {
            if (!arrayList.contains(str)) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12806h(str), 7, null);
                edit.remove(str);
            } else {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12807i(str), 7, null);
            }
        }
        edit.apply();
    }
}
