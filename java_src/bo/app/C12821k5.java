package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0005B)\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0013"}, m28432d2 = {"Lbo/app/k5;", "Lbo/app/v1;", "Lbo/app/u1;", "event", "", C17296a.f69688o, "", "events", "", "identifier", "", "()Ljava/util/Collection;", "allEvents", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "userId", "apiKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.k5 */
/* loaded from: classes.dex */
public final class C12821k5 implements InterfaceC13174v1 {

    /* renamed from: c */
    public static final C12822a f58759c = new C12822a(null);

    /* renamed from: a */
    private boolean f58760a;

    /* renamed from: b */
    private final SharedPreferences f58761b;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lbo/app/k5$a;", "", "", "BRAZE_EVENT_STORAGE_FILENAME", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.k5$a */
    /* loaded from: classes.dex */
    public static final class C12822a {
        public /* synthetic */ C12822a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12822a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.k5$b */
    /* loaded from: classes.dex */
    public static final class C12823b extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13160u1 f58762b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12823b(InterfaceC13160u1 interfaceC13160u1) {
            super(0);
            this.f58762b = interfaceC13160u1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Storage provider is closed. Not adding event: ", this.f58762b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.k5$c */
    /* loaded from: classes.dex */
    public static final class C12824c extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13160u1 f58763b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12824c(InterfaceC13160u1 interfaceC13160u1) {
            super(0);
            this.f58763b = interfaceC13160u1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Adding event to storage with uid ", this.f58763b.mo62893r());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.k5$d */
    /* loaded from: classes.dex */
    public static final class C12825d extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12825d f58764b = new C12825d();

        public C12825d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Storage provider is closed. Not getting all events.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.k5$e */
    /* loaded from: classes.dex */
    public static final class C12826e extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef<String> f58765b;

        /* renamed from: c */
        final /* synthetic */ String f58766c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12826e(Ref.ObjectRef<String> objectRef, String str) {
            super(0);
            this.f58765b = objectRef;
            this.f58766c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Could not create BrazeEvent from [serialized event string=" + this.f58765b.element + ", unique identifier=" + ((Object) this.f58766c) + "] ... Deleting!";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.k5$g */
    /* loaded from: classes.dex */
    public static final class C12827g extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ Set<InterfaceC13160u1> f58767b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12827g(Set<? extends InterfaceC13160u1> set) {
            super(0);
            this.f58767b = set;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Storage provider is closed. Not deleting events: ", this.f58767b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.k5$h */
    /* loaded from: classes.dex */
    public static final class C12828h extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58768b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12828h(String str) {
            super(0);
            this.f58768b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Deleting event from storage with uid ", this.f58768b);
        }
    }

    public C12821k5(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58761b = context.getSharedPreferences(Intrinsics.stringPlus("com.appboy.storage.appboy_event_storage", C43318jS5.m30601c(context, str, str2)), 0);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    @Override // bo.app.InterfaceC13174v1
    /* renamed from: a */
    public Collection<InterfaceC13160u1> mo62878a() {
        List emptyList;
        if (this.f58760a) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C12825d.f58764b, 6, null);
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Map<String, ?> all = this.f58761b.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "prefs.all");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String eventId = entry.getKey();
            Object value = entry.getValue();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            if (value != null) {
                try {
                    objectRef.element = (String) value;
                    Intrinsics.checkNotNullExpressionValue(eventId, "eventId");
                    InterfaceC13160u1 m63555b = C12749j.f58647h.m63555b((String) value, eventId);
                    if (m63555b != null) {
                        linkedHashSet.add(m63555b);
                    }
                } catch (Exception e) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C12826e(objectRef, eventId), 4, null);
                    m63456a(eventId);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                break;
            }
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C12826e(objectRef, eventId), 4, null);
            m63456a(eventId);
        }
        return linkedHashSet;
    }

    @Override // bo.app.InterfaceC13174v1
    /* renamed from: a */
    public void mo62877a(InterfaceC13160u1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f58760a) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C12823b(event), 6, null);
            return;
        }
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12824c(event), 3, null);
        this.f58761b.edit().putString(event.mo62893r(), event.m62894p()).apply();
    }

    @Override // bo.app.InterfaceC13174v1
    /* renamed from: a */
    public void mo62876a(Set<? extends InterfaceC13160u1> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        if (this.f58760a) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C12827g(events), 6, null);
            return;
        }
        SharedPreferences.Editor edit = this.f58761b.edit();
        for (InterfaceC13160u1 interfaceC13160u1 : events) {
            String mo62893r = interfaceC13160u1.mo62893r();
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12828h(mo62893r), 3, null);
            edit.remove(mo62893r);
        }
        edit.apply();
    }

    /* renamed from: a */
    public final void m63456a(String str) {
        SharedPreferences.Editor edit = this.f58761b.edit();
        edit.remove(str);
        edit.apply();
    }
}
