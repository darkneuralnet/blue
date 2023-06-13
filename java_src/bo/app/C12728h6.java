package bo.app;

import bo.app.C12728h6;
import bo.app.InterfaceC13232y2;
import com.facebook.share.internal.C17296a;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0003B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\n"}, m28432d2 = {"Lbo/app/h6;", "", "Lbo/app/y2;", C17296a.f69688o, "()Lbo/app/y2;", "nextFallbackTriggeredAction", "", "fallbackActions", "<init>", "(Ljava/util/List;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.h6 */
/* loaded from: classes.dex */
public final class C12728h6 {

    /* renamed from: b */
    public static final C12729a f58621b = new C12729a(null);

    /* renamed from: c */
    private static final Comparator<InterfaceC13232y2> f58622c = new Comparator() { // from class: SN6
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m63607a;
            m63607a = C12728h6.m63607a((InterfaceC13232y2) obj, (InterfaceC13232y2) obj2);
            return m63607a;
        }
    };

    /* renamed from: a */
    private final PriorityQueue<InterfaceC13232y2> f58623a;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\"\u0010\b\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, m28432d2 = {"Lbo/app/h6$a;", "", "", "INITIAL_TRIGGER_CAPACITY", "I", "Ljava/util/Comparator;", "Lbo/app/y2;", "kotlin.jvm.PlatformType", "triggeredActionComparator", "Ljava/util/Comparator;", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h6$a */
    /* loaded from: classes.dex */
    public static final class C12729a {
        public /* synthetic */ C12729a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12729a() {
        }
    }

    public C12728h6(List<? extends InterfaceC13232y2> fallbackActions) {
        Intrinsics.checkNotNullParameter(fallbackActions, "fallbackActions");
        PriorityQueue<InterfaceC13232y2> priorityQueue = new PriorityQueue<>(12, f58622c);
        this.f58623a = priorityQueue;
        priorityQueue.addAll(fallbackActions);
    }

    /* renamed from: a */
    public final InterfaceC13232y2 m63608a() {
        return this.f58623a.poll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final int m63607a(InterfaceC13232y2 actionA, InterfaceC13232y2 actionB) {
        Intrinsics.checkNotNullParameter(actionA, "actionA");
        Intrinsics.checkNotNullParameter(actionB, "actionB");
        int mo62975u = actionA.mo62740f().mo62975u();
        int mo62975u2 = actionB.mo62740f().mo62975u();
        if (mo62975u > mo62975u2) {
            return -1;
        }
        if (mo62975u < mo62975u2) {
            return 1;
        }
        return actionA.getId().compareTo(actionB.getId());
    }
}
