package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0005\u001a\u00020\u00042\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001aK\u0010\u000e\u001a\u00020\r\"\b\b\u0000\u0010\u0007*\u00020\u0006\"\b\b\u0001\u0010\b*\u00020\u0006*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\n0\t2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, m28432d2 = {"Llm;", "applier", "LYt0;", "parent", "LXt0;", C17296a.f69688o, "", "K", "V", "LkW1;", "LlW1;", "key", "value", "", DateTokenConverter.CONVERTER_KEY, "(LkW1;Ljava/lang/Object;Ljava/lang/Object;)V", "Ljava/lang/Object;", "PendingApplyNoModifications", "runtime_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1257:1\n1549#2:1258\n1620#2,3:1259\n1#3:1262\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionKt\n*L\n1227#1:1258\n1227#1:1259,3\n*E\n"})
/* renamed from: du0 */
/* loaded from: classes.dex */
public final class C40027du0 {

    /* renamed from: a */
    public static final Object f77371a = new Object();

    /* renamed from: a */
    public static final InterfaceC37166Xt0 m43531a(InterfaceC25773lm<?> applier, AbstractC37400Yt0 parent) {
        Intrinsics.checkNotNullParameter(applier, "applier");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new C39435cu0(parent, applier, null, 4, null);
    }

    /* renamed from: b */
    public static final /* synthetic */ void m43530b(C43943kW1 c43943kW1, Object obj, Object obj2) {
        m43528d(c43943kW1, obj, obj2);
    }

    /* renamed from: c */
    public static final /* synthetic */ Object m43529c() {
        return f77371a;
    }

    /* renamed from: d */
    public static final <K, V> void m43528d(C43943kW1<K, C44536lW1<V>> c43943kW1, K k, V v) {
        if (c43943kW1.m28900b(k)) {
            C44536lW1<V> m28897e = c43943kW1.m28897e(k);
            if (m28897e != null) {
                m28897e.add(v);
                return;
            }
            return;
        }
        C44536lW1<V> c44536lW1 = new C44536lW1<>();
        c44536lW1.add(v);
        Unit unit = Unit.INSTANCE;
        c43943kW1.m28891k(k, c44536lW1);
    }
}
