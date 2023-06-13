package p000;

import android.graphics.Bitmap;
import android.util.LruCache;
import androidx.recyclerview.widget.C11925l;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BitmapTarget;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: K
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0010B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b*\u0010+J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R'\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0010\u0010\u001bR\u001e\u0010 \u001a\f0\u001dR\b\u0012\u0004\u0012\u00028\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010)\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00018\u00008\u00000%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, m28432d2 = {"Lxn4;", "K", "Lwn4;", "key", "", "contains", "(Ljava/lang/Object;)Z", "Lco/bird/android/model/BitmapTarget;", "bitmapTarget", "", "b", "(Ljava/lang/Object;Lco/bird/android/model/BitmapTarget;)V", "Landroid/graphics/Bitmap;", "get", "(Ljava/lang/Object;)Landroid/graphics/Bitmap;", "LUI4;", C17296a.f69688o, "LUI4;", "glideRequestManager", "LZ84;", "", "Lkotlin/Lazy;", "getLoadedIds", "()LZ84;", "loadedIds", "Lio/reactivex/Observable;", "c", "()Lio/reactivex/Observable;", "newlyLoadedIds", "Lxn4$a;", DateTokenConverter.CONVERTER_KEY, "Lxn4$a;", "cache", "La94;", "e", "La94;", "mutableLoadedIds", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "f", "Lio/reactivex/subjects/d;", "mutableNewlyLoadedIds", "<init>", "(LUI4;)V", "media_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xn4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C51819xn4<K> implements InterfaceC51226wn4<K> {

    /* renamed from: a */
    public final UI4 f118117a;

    /* renamed from: b */
    public final Lazy f118118b;

    /* renamed from: c */
    public final Lazy f118119c;

    /* renamed from: d */
    public final C51819xn4<K>.C30298a f118120d;

    /* renamed from: e */
    public final C37791a94<Set<K>> f118121e;

    /* renamed from: f */
    public final C24558d<K> f118122f;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\u000f"}, m28432d2 = {"Lxn4$a;", "Landroid/util/LruCache;", "Lco/bird/android/model/BitmapTarget;", "", "evicted", "key", "oldValue", "newValue", "", C17296a.f69688o, "(ZLjava/lang/Object;Lco/bird/android/model/BitmapTarget;Lco/bird/android/model/BitmapTarget;)V", "", "maxSize", "<init>", "(Lxn4;I)V", "media_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: xn4$a */
    /* loaded from: classes4.dex */
    public final class C30298a extends LruCache<K, BitmapTarget> {

        /* renamed from: a */
        public final /* synthetic */ C51819xn4<K> f118123a;

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"K", "", "currentValue", C17296a.f69688o, "(Ljava/util/Set;)Ljava/util/Set;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: xn4$a$a */
        /* loaded from: classes4.dex */
        public static final class C30299a extends Lambda implements Function1<Set<? extends K>, Set<? extends K>> {

            /* renamed from: g */
            public final /* synthetic */ K f118124g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30299a(K k) {
                super(1);
                this.f118124g = k;
            }

            /* renamed from: a */
            public final Set<K> m4698a(Set<? extends K> currentValue) {
                Set<K> minus;
                Intrinsics.checkNotNullParameter(currentValue, "currentValue");
                minus = SetsKt___SetsKt.minus(currentValue, this.f118124g);
                return minus;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m4698a((Set) obj);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30298a(C51819xn4 c51819xn4, int i) {
            super(i);
            this.f118123a = c51819xn4;
        }

        /* renamed from: a */
        public void m4699a(boolean z, K k, BitmapTarget oldValue, BitmapTarget bitmapTarget) {
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
            super.entryRemoved(z, k, oldValue, bitmapTarget);
            this.f118123a.f118117a.m81660d(oldValue);
            if (z) {
                this.f118123a.f118121e.m71837i(new C30299a(k));
            }
        }

        @Override // android.util.LruCache
        public /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, BitmapTarget bitmapTarget, BitmapTarget bitmapTarget2) {
            m4699a(z, obj, bitmapTarget, bitmapTarget2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0003*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"K", "LZ84;", "", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xn4$b */
    /* loaded from: classes4.dex */
    public static final class C30300b extends Lambda implements Function0<Z84<Set<? extends K>>> {

        /* renamed from: g */
        public final /* synthetic */ C51819xn4<K> f118125g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30300b(C51819xn4<K> c51819xn4) {
            super(0);
            this.f118125g = c51819xn4;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Z84<Set<K>> invoke() {
            return Z84.f47888d.m73663b(this.f118125g.f118121e);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            return invoke();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"K", "", "oldLoadedIds", "newLoadedIds", C17296a.f69688o, "(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nReactiveBitmapCacheImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactiveBitmapCacheImpl.kt\nco/bird/android/manager/media/ReactiveBitmapCacheImpl$mutableLoadedIds$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,67:1\n1855#2,2:68\n*S KotlinDebug\n*F\n+ 1 ReactiveBitmapCacheImpl.kt\nco/bird/android/manager/media/ReactiveBitmapCacheImpl$mutableLoadedIds$1\n*L\n25#1:68,2\n*E\n"})
    /* renamed from: xn4$c */
    /* loaded from: classes4.dex */
    public static final class C30301c extends Lambda implements Function2<Set<? extends K>, Set<? extends K>, Set<? extends K>> {

        /* renamed from: g */
        public final /* synthetic */ C51819xn4<K> f118126g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30301c(C51819xn4<K> c51819xn4) {
            super(2);
            this.f118126g = c51819xn4;
        }

        /* renamed from: a */
        public final Set<K> m4697a(Set<? extends K> oldLoadedIds, Set<? extends K> newLoadedIds) {
            Set<K> plus;
            Intrinsics.checkNotNullParameter(oldLoadedIds, "oldLoadedIds");
            Intrinsics.checkNotNullParameter(newLoadedIds, "newLoadedIds");
            C51819xn4<K> c51819xn4 = this.f118126g;
            for (Object obj : newLoadedIds) {
                if (!oldLoadedIds.contains(obj)) {
                    c51819xn4.f118122f.onNext(obj);
                }
            }
            plus = SetsKt___SetsKt.plus((Set) oldLoadedIds, (Iterable) newLoadedIds);
            return plus;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m4697a((Set) obj, (Set) obj2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00008\u0000 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"K", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xn4$d */
    /* loaded from: classes4.dex */
    public static final class C30302d extends Lambda implements Function0<Observable<K>> {

        /* renamed from: g */
        public final /* synthetic */ C51819xn4<K> f118127g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30302d(C51819xn4<K> c51819xn4) {
            super(0);
            this.f118127g = c51819xn4;
        }

        /* renamed from: b */
        public final Observable<K> m4696b() {
            return (Observable<K>) this.f118127g.f118122f.hide();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            return m4696b();
        }
    }

    public C51819xn4(UI4 glideRequestManager) {
        Lazy lazy;
        Lazy lazy2;
        Set emptySet;
        Intrinsics.checkNotNullParameter(glideRequestManager, "glideRequestManager");
        this.f118117a = glideRequestManager;
        lazy = LazyKt__LazyJVMKt.lazy(new C30300b(this));
        this.f118118b = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C30302d(this));
        this.f118119c = lazy2;
        this.f118120d = new C30298a(this, C11925l.AbstractC11930e.DEFAULT_SWIPE_ANIMATION_DURATION);
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        emptySet = SetsKt__SetsKt.emptySet();
        this.f118121e = c10586a.m71835a(emptySet, new C30301c(this));
        C24558d<K> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<K>()");
        this.f118122f = m31902e;
    }

    @Override // p000.InterfaceC51226wn4
    /* renamed from: a */
    public Observable<K> mo4701a() {
        Object value = this.f118119c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-newlyLoadedIds>(...)");
        return (Observable) value;
    }

    @Override // p000.InterfaceC5295MT
    /* renamed from: b */
    public synchronized void mo4700b(K k, BitmapTarget bitmapTarget) {
        Set<K> of;
        Intrinsics.checkNotNullParameter(bitmapTarget, "bitmapTarget");
        this.f118120d.put(k, bitmapTarget);
        C37791a94<Set<K>> c37791a94 = this.f118121e;
        of = SetsKt__SetsJVMKt.setOf(k);
        c37791a94.accept(of);
    }

    @Override // p000.InterfaceC5295MT
    public synchronized boolean contains(K k) {
        boolean z;
        if (get(k) != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    @Override // p000.InterfaceC5295MT
    public synchronized Bitmap get(K k) {
        Bitmap bitmap;
        BitmapTarget bitmapTarget = this.f118120d.get(k);
        if (bitmapTarget != null) {
            bitmap = bitmapTarget.getBitmap();
        } else {
            bitmap = null;
        }
        return bitmap;
    }
}
