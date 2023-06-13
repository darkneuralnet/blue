package p000;

import com.facebook.share.internal.C17296a;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0002\r\nB\t\b\u0016¢\u0006\u0004\b\u0013\u0010\u0014B9\b\u0016\u0012.\u0010\u0015\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u000ej\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f`\u0010¢\u0006\u0004\b\u0013\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0086\u0002J\u001c\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bR<\u0010\u0012\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u000ej\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0017"}, m28432d2 = {"LlR3;", "Ljava/io/Serializable;", "", "writeReplace", "", "LE1;", "c", "accessTokenAppIdPair", "", "LSi;", "b", "appEvents", "", C17296a.f69688o, "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "events", "<init>", "()V", "appEventMap", "(Ljava/util/HashMap;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: lR3  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44493lR3 implements Serializable {

    /* renamed from: c */
    public static final C25699a f96188c = new C25699a(null);
    private static final long serialVersionUID = 20160629001L;

    /* renamed from: b */
    public final HashMap<C1706E1, List<C7508Si>> f96189b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LlR3$a;", "", "", "serialVersionUID", "J", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: lR3$a */
    /* loaded from: classes5.dex */
    public static final class C25699a {
        private C25699a() {
        }

        public /* synthetic */ C25699a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB7\u0012.\u0010\u000b\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R<\u0010\u000b\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0010"}, m28432d2 = {"LlR3$b;", "Ljava/io/Serializable;", "", "readResolve", "Ljava/util/HashMap;", "LE1;", "", "LSi;", "Lkotlin/collections/HashMap;", "b", "Ljava/util/HashMap;", "proxyEvents", "<init>", "(Ljava/util/HashMap;)V", "c", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: lR3$b */
    /* loaded from: classes5.dex */
    public static final class C25700b implements Serializable {

        /* renamed from: c */
        public static final C25701a f96190c = new C25701a(null);
        private static final long serialVersionUID = 20160629001L;

        /* renamed from: b */
        public final HashMap<C1706E1, List<C7508Si>> f96191b;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LlR3$b$a;", "", "", "serialVersionUID", "J", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
        /* renamed from: lR3$b$a */
        /* loaded from: classes5.dex */
        public static final class C25701a {
            private C25701a() {
            }

            public /* synthetic */ C25701a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C25700b(HashMap<C1706E1, List<C7508Si>> proxyEvents) {
            Intrinsics.checkNotNullParameter(proxyEvents, "proxyEvents");
            this.f96191b = proxyEvents;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new C44493lR3(this.f96191b);
        }
    }

    public C44493lR3() {
        this.f96189b = new HashMap<>();
    }

    private final Object writeReplace() throws ObjectStreamException {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            return new C25700b(this.f96189b);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: a */
    public final void m27294a(C1706E1 accessTokenAppIdPair, List<C7508Si> appEvents) {
        List<C7508Si> mutableList;
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            if (!this.f96189b.containsKey(accessTokenAppIdPair)) {
                HashMap<C1706E1, List<C7508Si>> hashMap = this.f96189b;
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) appEvents);
                hashMap.put(accessTokenAppIdPair, mutableList);
                return;
            }
            List<C7508Si> list = this.f96189b.get(accessTokenAppIdPair);
            if (list != null) {
                list.addAll(appEvents);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: b */
    public final List<C7508Si> m27293b(C1706E1 accessTokenAppIdPair) {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
            return this.f96189b.get(accessTokenAppIdPair);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: c */
    public final Set<C1706E1> m27292c() {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            Set<C1706E1> keySet = this.f96189b.keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "events.keys");
            return keySet;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    public C44493lR3(HashMap<C1706E1, List<C7508Si>> appEventMap) {
        Intrinsics.checkNotNullParameter(appEventMap, "appEventMap");
        HashMap<C1706E1, List<C7508Si>> hashMap = new HashMap<>();
        this.f96189b = hashMap;
        hashMap.putAll(appEventMap);
    }
}
