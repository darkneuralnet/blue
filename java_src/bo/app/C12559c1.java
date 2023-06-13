package bo.app;

import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¨\u0006\u000e"}, m28432d2 = {"Lbo/app/c1;", "", "Lbo/app/u1;", "event", "", C17296a.f69688o, "", "events", "Lbo/app/e2;", "dispatchManager", "Lbo/app/v1;", "brazeEventStorageProvider", "<init>", "(Lbo/app/v1;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.c1 */
/* loaded from: classes.dex */
public final class C12559c1 {

    /* renamed from: a */
    private final InterfaceC13174v1 f58278a;

    /* renamed from: b */
    private boolean f58279b;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.c1$a */
    /* loaded from: classes.dex */
    public static final class C12560a extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13160u1 f58280b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12560a(InterfaceC13160u1 interfaceC13160u1) {
            super(0);
            this.f58280b = interfaceC13160u1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Storage manager is closed. Not adding event: ", this.f58280b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.c1$b */
    /* loaded from: classes.dex */
    public static final class C12561b extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ Set<InterfaceC13160u1> f58281b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12561b(Set<? extends InterfaceC13160u1> set) {
            super(0);
            this.f58281b = set;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Storage manager is closed. Not deleting events: ", this.f58281b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.c1$c */
    /* loaded from: classes.dex */
    public static final class C12562c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12562c f58282b = new C12562c();

        public C12562c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Storage manager is closed. Not starting offline recovery.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.c1$d */
    /* loaded from: classes.dex */
    public static final class C12563d extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12563d f58283b = new C12563d();

        public C12563d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Started offline event recovery task.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.c1$e */
    /* loaded from: classes.dex */
    public static final class C12564e extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13160u1 f58284b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12564e(InterfaceC13160u1 interfaceC13160u1) {
            super(0);
            this.f58284b = interfaceC13160u1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Adding event to dispatch from storage: ", this.f58284b);
        }
    }

    public C12559c1(InterfaceC13174v1 brazeEventStorageProvider) {
        Intrinsics.checkNotNullParameter(brazeEventStorageProvider, "brazeEventStorageProvider");
        this.f58278a = brazeEventStorageProvider;
    }

    /* renamed from: a */
    public final void m63881a(InterfaceC13160u1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f58279b) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C12560a(event), 6, null);
        } else {
            this.f58278a.mo62877a(event);
        }
    }

    /* renamed from: a */
    public final void m63880a(Set<? extends InterfaceC13160u1> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        if (this.f58279b) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C12561b(events), 6, null);
        } else {
            this.f58278a.mo62876a(events);
        }
    }

    /* renamed from: a */
    public final void m63882a(InterfaceC12599e2 dispatchManager) {
        List<InterfaceC13160u1> filterNotNull;
        Intrinsics.checkNotNullParameter(dispatchManager, "dispatchManager");
        if (this.f58279b) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C12562c.f58282b, 6, null);
            return;
        }
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12563d.f58283b, 7, null);
        filterNotNull = CollectionsKt___CollectionsKt.filterNotNull(this.f58278a.mo62878a());
        for (InterfaceC13160u1 interfaceC13160u1 : filterNotNull) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C12564e(interfaceC13160u1), 6, null);
            dispatchManager.mo63261a(interfaceC13160u1);
        }
    }
}
