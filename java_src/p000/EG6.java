package p000;

import androidx.work.AbstractC12126c;
import androidx.work.C12124b;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\t\b&\u0018\u0000 \n2\u00020\u0001:\u0002\u0003\bB'\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LEG6;", "", "Ljava/util/UUID;", C17296a.f69688o, "Ljava/util/UUID;", "()Ljava/util/UUID;", "id", "LHG6;", "b", "LHG6;", DateTokenConverter.CONVERTER_KEY, "()LHG6;", "workSpec", "", "", "c", "Ljava/util/Set;", "()Ljava/util/Set;", "tags", "()Ljava/lang/String;", "stringId", "<init>", "(Ljava/util/UUID;LHG6;Ljava/util/Set;)V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: EG6 */
/* loaded from: classes.dex */
public abstract class EG6 {

    /* renamed from: d */
    public static final C1770b f7168d = new C1770b(null);

    /* renamed from: a */
    public final UUID f7169a;

    /* renamed from: b */
    public final HG6 f7170b;

    /* renamed from: c */
    public final Set<String> f7171c;

    @Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\n\b&\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0019\b\u0000\u0012\u000e\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a¢\u0006\u0004\b<\u0010=J\u0015\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00028\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00028\u0001H ¢\u0006\u0004\b\u0019\u0010\u0018R\"\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00102\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R \u00108\u001a\b\u0012\u0004\u0012\u000204038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u0014\u0010;\u001a\u00028\u00008 X \u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006>"}, m28432d2 = {"LEG6$a;", "B", "LEG6;", "W", "", "Ljava/util/UUID;", "id", "i", "(Ljava/util/UUID;)LEG6$a;", "Llz0;", "constraints", "h", "(Llz0;)LEG6$a;", "Landroidx/work/b;", "inputData", "k", "(Landroidx/work/b;)LEG6$a;", "", "duration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "j", "(JLjava/util/concurrent/TimeUnit;)LEG6$a;", C17296a.f69688o, "()LEG6;", "b", "Ljava/lang/Class;", "Landroidx/work/c;", "Ljava/lang/Class;", "getWorkerClass$work_runtime_release", "()Ljava/lang/Class;", "workerClass", "", "Z", "c", "()Z", "setBackoffCriteriaSet$work_runtime_release", "(Z)V", "backoffCriteriaSet", "Ljava/util/UUID;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/UUID;", "setId$work_runtime_release", "(Ljava/util/UUID;)V", "LHG6;", "LHG6;", "g", "()LHG6;", "setWorkSpec$work_runtime_release", "(LHG6;)V", "workSpec", "", "", "e", "Ljava/util/Set;", "()Ljava/util/Set;", "tags", "f", "()LEG6$a;", "thisObject", "<init>", "(Ljava/lang/Class;)V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: EG6$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1769a<B extends AbstractC1769a<B, ?>, W extends EG6> {

        /* renamed from: a */
        public final Class<? extends AbstractC12126c> f7172a;

        /* renamed from: b */
        public boolean f7173b;

        /* renamed from: c */
        public UUID f7174c;

        /* renamed from: d */
        public HG6 f7175d;

        /* renamed from: e */
        public final Set<String> f7176e;

        public AbstractC1769a(Class<? extends AbstractC12126c> workerClass) {
            Set<String> mutableSetOf;
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            this.f7172a = workerClass;
            UUID randomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
            this.f7174c = randomUUID;
            String uuid = this.f7174c.toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
            String name = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name, "workerClass.name");
            this.f7175d = new HG6(uuid, name);
            String name2 = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "workerClass.name");
            mutableSetOf = SetsKt__SetsKt.mutableSetOf(name2);
            this.f7176e = mutableSetOf;
        }

        /* renamed from: a */
        public final W m109257a() {
            boolean z;
            W mo19321b = mo19321b();
            C44821lz0 c44821lz0 = this.f7175d.f13200j;
            boolean z2 = false;
            if (!c44821lz0.m26579e() && !c44821lz0.m26578f() && !c44821lz0.m26577g() && !c44821lz0.m26576h()) {
                z = false;
            } else {
                z = true;
            }
            HG6 hg6 = this.f7175d;
            if (hg6.f13207q) {
                if (!z) {
                    if (hg6.f13197g <= 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                    }
                } else {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
            }
            UUID randomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
            m109251i(randomUUID);
            return mo19321b;
        }

        /* renamed from: b */
        public abstract W mo19321b();

        /* renamed from: c */
        public final boolean m109256c() {
            return this.f7173b;
        }

        /* renamed from: d */
        public final UUID m109255d() {
            return this.f7174c;
        }

        /* renamed from: e */
        public final Set<String> m109254e() {
            return this.f7176e;
        }

        /* renamed from: f */
        public abstract B mo19320f();

        /* renamed from: g */
        public final HG6 m109253g() {
            return this.f7175d;
        }

        /* renamed from: h */
        public final B m109252h(C44821lz0 constraints) {
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            this.f7175d.f13200j = constraints;
            return mo19320f();
        }

        /* renamed from: i */
        public final B m109251i(UUID id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.f7174c = id;
            String uuid = id.toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
            this.f7175d = new HG6(uuid, this.f7175d);
            return mo19320f();
        }

        /* renamed from: j */
        public B m109250j(long j, TimeUnit timeUnit) {
            boolean z;
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.f7175d.f13197g = timeUnit.toMillis(j);
            if (LongCompanionObject.MAX_VALUE - System.currentTimeMillis() > this.f7175d.f13197g) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return mo19320f();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
        }

        /* renamed from: k */
        public final B m109249k(C12124b inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f7175d.f13195e = inputData;
            return mo19320f();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, m28432d2 = {"LEG6$b;", "", "", "DEFAULT_BACKOFF_DELAY_MILLIS", "J", "MAX_BACKOFF_MILLIS", "MIN_BACKOFF_MILLIS", "<init>", "()V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: EG6$b */
    /* loaded from: classes.dex */
    public static final class C1770b {
        public /* synthetic */ C1770b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1770b() {
        }
    }

    public EG6(UUID id, HG6 workSpec, Set<String> tags) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f7169a = id;
        this.f7170b = workSpec;
        this.f7171c = tags;
    }

    /* renamed from: a */
    public UUID m109261a() {
        return this.f7169a;
    }

    /* renamed from: b */
    public final String m109260b() {
        String uuid = m109261a().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
        return uuid;
    }

    /* renamed from: c */
    public final Set<String> m109259c() {
        return this.f7171c;
    }

    /* renamed from: d */
    public final HG6 m109258d() {
        return this.f7170b;
    }
}
