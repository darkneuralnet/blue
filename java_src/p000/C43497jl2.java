package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0010\u0017B\u0015\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0001\u0010\n*\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0016R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, m28432d2 = {"Ljl2;", "T", "Lh81;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "Lvf;", "V", "Lwb6;", "converter", "Ltk6;", "f", "Ljl2$b;", C17296a.f69688o, "Ljl2$b;", "getConfig", "()Ljl2$b;", "config", "<init>", "(Ljl2$b;)V", "b", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,651:1\n442#2:652\n392#2:653\n1238#3,4:654\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n*L\n496#1:652\n496#1:653\n496#1:654,4\n*E\n"})
/* renamed from: jl2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43497jl2<T> implements InterfaceC41946h81<T> {

    /* renamed from: a */
    public final C25006b<T> f93269a;

    @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005*\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0086\u0004J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\"\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0018\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R,\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, m28432d2 = {"Ljl2$b;", "T", "", "", "timeStamp", "Ljl2$a;", C17296a.f69688o, "(Ljava/lang/Object;I)Ljl2$a;", "Lh91;", "easing", "", "f", LegacyRepairType.OTHER_KEY, "", "equals", "hashCode", "I", "c", "()I", "e", "(I)V", "durationMillis", "b", "setDelayMillis", "delayMillis", "", "Ljava/util/Map;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Map;", "keyframes", "<init>", "()V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: jl2$b */
    /* loaded from: classes.dex */
    public static final class C25006b<T> {

        /* renamed from: b */
        public int f93273b;

        /* renamed from: a */
        public int f93272a = 300;

        /* renamed from: c */
        public final Map<Integer, C25005a<T>> f93274c = new LinkedHashMap();

        /* renamed from: a */
        public final C25005a<T> m29995a(T t, int i) {
            C25005a<T> c25005a = new C25005a<>(t, null, 2, null);
            this.f93274c.put(Integer.valueOf(i), c25005a);
            return c25005a;
        }

        /* renamed from: b */
        public final int m29994b() {
            return this.f93273b;
        }

        /* renamed from: c */
        public final int m29993c() {
            return this.f93272a;
        }

        /* renamed from: d */
        public final Map<Integer, C25005a<T>> m29992d() {
            return this.f93274c;
        }

        /* renamed from: e */
        public final void m29991e(int i) {
            this.f93272a = i;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C25006b) {
                C25006b c25006b = (C25006b) obj;
                if (this.f93273b == c25006b.f93273b && this.f93272a == c25006b.f93272a && Intrinsics.areEqual(this.f93274c, c25006b.f93274c)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: f */
        public final void m29990f(C25005a<T> c25005a, InterfaceC41956h91 easing) {
            Intrinsics.checkNotNullParameter(c25005a, "<this>");
            Intrinsics.checkNotNullParameter(easing, "easing");
            c25005a.m29997a(easing);
        }

        public int hashCode() {
            return (((this.f93272a * 31) + this.f93273b) * 31) + this.f93274c.hashCode();
        }
    }

    public C43497jl2(C25006b<T> config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f93269a = config;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C43497jl2) && Intrinsics.areEqual(this.f93269a, ((C43497jl2) obj).f93269a)) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC41946h81, p000.InterfaceC25753lf
    /* renamed from: f */
    public <V extends AbstractC29607vf> C49420tk6<V> mo12016a(InterfaceC51108wb6<T, V> converter) {
        int mapCapacity;
        Intrinsics.checkNotNullParameter(converter, "converter");
        Map<Integer, C25005a<T>> m29992d = this.f93269a.m29992d();
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(m29992d.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        Iterator<T> it = m29992d.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((C25005a) entry.getValue()).m29996b(converter.mo4960a()));
        }
        return new C49420tk6<>(linkedHashMap, this.f93269a.m29993c(), this.f93269a.m29994b());
    }

    public int hashCode() {
        return this.f93269a.hashCode();
    }

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u001b\b\u0000\u0012\u0006\u0010\u0014\u001a\u00028\u0001\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ9\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\b0\u0007\"\b\b\u0002\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001a\u0010\u0014\u001a\u00028\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0010\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"Ljl2$a;", "T", "", "Lvf;", "V", "Lkotlin/Function1;", "convertToVector", "Lkotlin/Pair;", "Lh91;", "b", "(Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", C17296a.f69688o, "Ljava/lang/Object;", "getValue$animation_core_release", "()Ljava/lang/Object;", "value", "Lh91;", "getEasing$animation_core_release", "()Lh91;", "(Lh91;)V", "easing", "<init>", "(Ljava/lang/Object;Lh91;)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: jl2$a */
    /* loaded from: classes.dex */
    public static final class C25005a<T> {

        /* renamed from: a */
        public final T f93270a;

        /* renamed from: b */
        public InterfaceC41956h91 f93271b;

        public C25005a(T t, InterfaceC41956h91 easing) {
            Intrinsics.checkNotNullParameter(easing, "easing");
            this.f93270a = t;
            this.f93271b = easing;
        }

        /* renamed from: a */
        public final void m29997a(InterfaceC41956h91 interfaceC41956h91) {
            Intrinsics.checkNotNullParameter(interfaceC41956h91, "<set-?>");
            this.f93271b = interfaceC41956h91;
        }

        /* renamed from: b */
        public final <V extends AbstractC29607vf> Pair<V, InterfaceC41956h91> m29996b(Function1<? super T, ? extends V> convertToVector) {
            Intrinsics.checkNotNullParameter(convertToVector, "convertToVector");
            return TuplesKt.m28425to(convertToVector.invoke((T) this.f93270a), this.f93271b);
        }

        public boolean equals(Object obj) {
            if (obj instanceof C25005a) {
                C25005a c25005a = (C25005a) obj;
                if (Intrinsics.areEqual(c25005a.f93270a, this.f93270a) && Intrinsics.areEqual(c25005a.f93271b, this.f93271b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            T t = this.f93270a;
            return ((t != null ? t.hashCode() : 0) * 31) + this.f93271b.hashCode();
        }

        public /* synthetic */ C25005a(Object obj, InterfaceC41956h91 interfaceC41956h91, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? C42549i91.m34394c() : interfaceC41956h91);
        }
    }
}
