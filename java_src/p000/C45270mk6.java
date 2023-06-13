package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0018\u0010\f\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002\u001a3\u0010\u0012\u001a\u00020\u0011\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m28432d2 = {"Lvf;", "V", "Llk6;", "", "playTimeMillis", "start", "end", "startVelocity", "e", "(Llk6;JLvf;Lvf;Lvf;)Lvf;", "Lok6;", "playTime", "c", "visibilityThreshold", "", "dampingRatio", "stiffness", "Lxf;", DateTokenConverter.CONVERTER_KEY, "(Lvf;FF)Lxf;", "animation-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: mk6 */
/* loaded from: classes.dex */
public final class C45270mk6 {

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\t"}, m28432d2 = {"mk6$a", "Lxf;", "", "index", "Ltu1;", C17296a.f69688o, "", "Ljava/util/List;", "anims", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedAnimationSpecKt$createSpringAnimations$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,813:1\n1549#2:814\n1620#2,3:815\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedAnimationSpecKt$createSpringAnimations$1\n*L\n671#1:814\n671#1:815,3\n*E\n"})
    /* renamed from: mk6$a */
    /* loaded from: classes.dex */
    public static final class C26183a implements InterfaceC30265xf {

        /* renamed from: a */
        public final List<C49515tu1> f98658a;

        public C26183a(AbstractC29607vf abstractC29607vf, float f, float f2) {
            IntRange until;
            int collectionSizeOrDefault;
            until = RangesKt___RangesKt.until(0, abstractC29607vf.mo8295b());
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                arrayList.add(new C49515tu1(f, f2, abstractC29607vf.mo8296a(((IntIterator) it).nextInt())));
            }
            this.f98658a = arrayList;
        }

        @Override // p000.InterfaceC30265xf
        /* renamed from: a */
        public C49515tu1 get(int i) {
            return this.f98658a.get(i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28432d2 = {"mk6$b", "Lxf;", "", "index", "Ltu1;", C17296a.f69688o, "Ltu1;", "anim", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: mk6$b */
    /* loaded from: classes.dex */
    public static final class C26184b implements InterfaceC30265xf {

        /* renamed from: a */
        public final C49515tu1 f98659a;

        public C26184b(float f, float f2) {
            this.f98659a = new C49515tu1(f, f2, 0.0f, 4, null);
        }

        @Override // p000.InterfaceC30265xf
        /* renamed from: a */
        public C49515tu1 get(int i) {
            return this.f98659a;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC30265xf m25118b(AbstractC29607vf abstractC29607vf, float f, float f2) {
        return m25116d(abstractC29607vf, f, f2);
    }

    /* renamed from: c */
    public static final long m25117c(InterfaceC46456ok6<?> interfaceC46456ok6, long j) {
        long coerceIn;
        coerceIn = RangesKt___RangesKt.coerceIn(j - interfaceC46456ok6.mo6412f(), 0L, interfaceC46456ok6.mo6411g());
        return coerceIn;
    }

    /* renamed from: d */
    public static final <V extends AbstractC29607vf> InterfaceC30265xf m25116d(V v, float f, float f2) {
        if (v != null) {
            return new C26183a(v, f, f2);
        }
        return new C26184b(f, f2);
    }

    /* renamed from: e */
    public static final <V extends AbstractC29607vf> V m25115e(InterfaceC44677lk6<V> interfaceC44677lk6, long j, V start, V end, V startVelocity) {
        Intrinsics.checkNotNullParameter(interfaceC44677lk6, "<this>");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(startVelocity, "startVelocity");
        return interfaceC44677lk6.mo6413e(j * 1000000, start, end, startVelocity);
    }
}
