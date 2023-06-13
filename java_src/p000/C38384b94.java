package p000;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28433d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aI\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u00002\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0005¢\u0006\u0004\b\b\u0010\t\"3\u0010\u000f\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00018\u00008\u00000\u000b\"\b\b\u0000\u0010\u0000*\u00020\n*\b\u0012\u0004\u0012\u00028\u00000\u00018F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e*p\u0010\u0014\u001a\u0004\b\u0000\u0010\u0000\"2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00000\u001022\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00000\u0010*F\u0010\u0017\u001a\u0004\b\u0000\u0010\u0000\"\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00028\u00000\u00152\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00028\u00000\u0015¨\u0006\u0018"}, m28432d2 = {"T", "La94;", "", "newValue", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "", "b", "(La94;Ljava/lang/Object;Ljava/util/Comparator;)V", "", "LZ84;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(La94;)LZ84;", "toPropertyObservable", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "oldValue", "Merger", "Lkotlin/Function1;", "currentValue", "Modifier", "rx_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: b94  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38384b94 {

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "", "collection", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPropertyRelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PropertyRelay.kt\nco/bird/android/library/rx/property/PropertyRelayKt$upsert$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n1549#2:166\n1620#2,3:167\n*S KotlinDebug\n*F\n+ 1 PropertyRelay.kt\nco/bird/android/library/rx/property/PropertyRelayKt$upsert$1\n*L\n150#1:166\n150#1:167,3\n*E\n"})
    /* renamed from: b94$a */
    /* loaded from: classes3.dex */
    public static final class C12304a extends Lambda implements Function1<List<? extends T>, List<? extends T>> {

        /* renamed from: g */
        public final /* synthetic */ T f56988g;

        /* renamed from: h */
        public final /* synthetic */ Comparator<T> f56989h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12304a(T t, Comparator<T> comparator) {
            super(1);
            this.f56988g = t;
            this.f56989h = comparator;
        }

        /* renamed from: a */
        public final List<T> m64918a(List<? extends T> collection) {
            int collectionSizeOrDefault;
            List<T> plus;
            Intrinsics.checkNotNullParameter(collection, "collection");
            List<? extends T> list = collection;
            Object obj = this.f56988g;
            Comparator<T> comparator = this.f56989h;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            boolean z = false;
            for (Object obj2 : list) {
                if (C38384b94.m64919c(obj, comparator, obj2)) {
                    z = true;
                    obj2 = obj;
                }
                arrayList.add(obj2);
            }
            if (!z) {
                plus = CollectionsKt___CollectionsKt.plus((Collection<? extends Object>) arrayList, this.f56988g);
                return plus;
            }
            return arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m64918a((List) obj);
        }
    }

    /* renamed from: a */
    public static final <T> Z84<T> m64921a(C37791a94<T> c37791a94) {
        Intrinsics.checkNotNullParameter(c37791a94, "<this>");
        return Z84.f47888d.m73663b(c37791a94);
    }

    /* renamed from: b */
    public static final <T> void m64920b(C37791a94<List<T>> c37791a94, T t, Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(c37791a94, "<this>");
        c37791a94.m71837i(new C12304a(t, comparator));
    }

    /* renamed from: c */
    public static final <T> boolean m64919c(T t, Comparator<T> comparator, T t2) {
        if (comparator != null) {
            if (comparator.compare(t, t2) == 0) {
                return true;
            }
            return false;
        }
        return Intrinsics.areEqual(t, t2);
    }

    public static /* synthetic */ void upsert$default(C37791a94 c37791a94, Object obj, Comparator comparator, int i, Object obj2) {
        if ((i & 2) != 0) {
            comparator = null;
        }
        m64920b(c37791a94, obj, comparator);
    }
}
