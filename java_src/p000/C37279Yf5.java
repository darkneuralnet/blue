package p000;

import android.widget.ImageView;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.net.SyslogConstants;
import co.bird.android.buava.Optional;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.LocalAsset;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import p000.C37279Yf5;
@Metadata(m28433d1 = {"\u0000\u008e\u0001\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0001*\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0007\u001a!\u0010\f\u001a\u00020\u00052\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n\"\u00020\u0005¢\u0006\u0004\b\f\u0010\r\u001aL\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u000fH\u0007\u001aL\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000fH\u0007\u001aL\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160\u000fH\u0007\u001a>\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00190\b\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0007\u001a>\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\u0001\"\b\b\u0001\u0010\u001b*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000fH\u0007\u001a>\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c\"\u0004\b\u0000\u0010\u0001\"\b\b\u0001\u0010\u001b*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000fH\u0007\u001a$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u000eH\u0007\u001a$\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0004\b\u0000\u0010\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u001cH\u0007\u001a$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\bH\u0007\u001a\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\b\u001a4\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000%0\u000e\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u0010\u001a$\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010'\u001a\u00020\"\u001a\u0012\u0010)\u001a\u00020\u0005*\u00020\u00052\u0006\u0010'\u001a\u00020\"\u001a\u001a\u0010+\u001a\u00020\u0005*\u00020\u00052\u0006\u0010*\u001a\u00020\"2\u0006\u0010'\u001a\u00020\"\u001a$\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010'\u001a\u00020\"\u001a,\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010*\u001a\u00020\"2\u0006\u0010'\u001a\u00020\"\u001a,\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010*\u001a\u00020\"2\u0006\u0010'\u001a\u00020\"\u001a \u00105\u001a\u000204*\b\u0012\u0004\u0012\u00020/0\b2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202\u001a0\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002040\u000f\u001a<\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001e0\u000e\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u00108*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f\u001a\"\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u000e\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000e\u001a\u0015\u0010>\u001a\u000204*\u00020;2\u0006\u0010=\u001a\u00020<H\u0086\u0004\u001a#\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\n\b\u0000\u0010?\u0018\u0001*\u00020\u0000*\u0006\u0012\u0002\b\u00030\u000eH\u0086\b¨\u0006A"}, m28432d2 = {"", "T", "Lio/reactivex/p;", "l0", "(Ljava/lang/Object;)Lio/reactivex/p;", "Lio/reactivex/c;", "Lio/reactivex/B;", LegacyRepairType.OTHER_KEY, "Lio/reactivex/F;", "r0", "", "sources", "z", "([Lio/reactivex/c;)Lio/reactivex/c;", "Lio/reactivex/Observable;", "Lkotlin/Function1;", "", "predicate", "mapper", "F", "Lio/reactivex/K;", "G", "Lio/reactivex/u;", "J", "U", "Lkotlin/Pair;", "s0", "R", "Lio/reactivex/k;", "Q", "Lco/bird/android/buava/Optional;", "S", "P", "i0", "", "size", "emitPartialWindow", "", "j0", "delaySeconds", "f0", "c0", "maxAttempts", "d0", "g0", "h0", "e0", "Lco/bird/android/model/LocalAsset;", "Landroid/widget/ImageView;", "imageView", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "", "L", "onFirst", "D", "V", "o0", "n0", "Lio/reactivex/disposables/c;", "Lio/reactivex/disposables/b;", "compositeDisposable", "y", "K", "filterInstance", "rx_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,644:1\n199#2:645\n237#2:647\n41#3:646\n11335#4:648\n11670#4,3:649\n*S KotlinDebug\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt\n*L\n567#1:645\n607#1:647\n590#1:646\n56#1:648\n56#1:649,3\n*E\n"})
/* renamed from: Yf5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37279Yf5 {

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062&\u0010\u0005\u001a\"\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lio/reactivex/F;", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "singles", "Lio/reactivex/h;", "c", "(Ljava/util/List;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$concatUntilFirstSuccess$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,644:1\n1789#2,3:645\n*S KotlinDebug\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$concatUntilFirstSuccess$2\n*L\n68#1:645,3\n*E\n"})
    /* renamed from: Yf5$a */
    /* loaded from: classes3.dex */
    public static final class C9884a extends Lambda implements Function1<List<? extends AbstractC23442F<Optional<Throwable>>>, InterfaceC23496h> {

        /* renamed from: g */
        public static final C9884a f46227g = new C9884a();

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Yf5$a$a */
        /* loaded from: classes3.dex */
        public static final class C9885a extends Lambda implements Function1<Optional<Throwable>, InterfaceC23447K<? extends Optional<Throwable>>> {

            /* renamed from: g */
            public final /* synthetic */ Ref.ObjectRef<Throwable> f46228g;

            /* renamed from: h */
            public final /* synthetic */ C9887c f46229h;

            /* renamed from: i */
            public final /* synthetic */ AbstractC23442F<Optional<Throwable>> f46230i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9885a(Ref.ObjectRef<Throwable> objectRef, C9887c c9887c, AbstractC23442F<Optional<Throwable>> abstractC23442F) {
                super(1);
                this.f46228g = objectRef;
                this.f46229h = c9887c;
                this.f46230i = abstractC23442F;
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable, T, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23447K<? extends Optional<Throwable>> invoke(Optional<Throwable> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Throwable m59035e = it.m59035e();
                if (this.f46228g.element == null && !Intrinsics.areEqual(m59035e, this.f46229h)) {
                    this.f46228g.element = m59035e;
                }
                if (m59035e != 0) {
                    return this.f46230i;
                }
                return AbstractC23442F.m33158H(Optional.f63040c.m59034a());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Yf5$a$b */
        /* loaded from: classes3.dex */
        public static final class C9886b extends Lambda implements Function1<Optional<Throwable>, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ Ref.ObjectRef<Throwable> f46231g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9886b(Ref.ObjectRef<Throwable> objectRef) {
                super(1);
                this.f46231g = objectRef;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23496h invoke(Optional<Throwable> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Throwable m59035e = it.m59035e();
                if (m59035e != null) {
                    Throwable th = this.f46231g.element;
                    if (th != null) {
                        m59035e = th;
                    }
                    return AbstractC23461c.m33080F(m59035e);
                }
                return AbstractC23461c.m33039p();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m28432d2 = {"Yf5$a$c", "", "rx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Yf5$a$c */
        /* loaded from: classes3.dex */
        public static final class C9887c extends Throwable {
            public C9887c() {
                super("just a base exception to ignore");
            }
        }

        public C9884a() {
            super(1);
        }

        /* renamed from: d */
        public static final InterfaceC23447K m74518d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final InterfaceC23496h m74517e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(List<? extends AbstractC23442F<Optional<Throwable>>> singles) {
            Intrinsics.checkNotNullParameter(singles, "singles");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            C9887c c9887c = new C9887c();
            AbstractC23442F m33158H = AbstractC23442F.m33158H(Optional.f63040c.m59032c(c9887c));
            Intrinsics.checkNotNull(m33158H, "null cannot be cast to non-null type io.reactivex.Single<co.bird.android.buava.Optional<kotlin.Throwable>>");
            Iterator<T> it = singles.iterator();
            while (it.hasNext()) {
                final C9885a c9885a = new C9885a(objectRef, c9887c, (AbstractC23442F) it.next());
                m33158H = m33158H.m33165A(new InterfaceC23492o() { // from class: Wf5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23447K m74518d;
                        m74518d = C37279Yf5.C9884a.m74518d(Function1.this, obj);
                        return m74518d;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m33158H, "error: Throwable? = null…())\n          }\n        }");
            }
            final C9886b c9886b = new C9886b(objectRef);
            return m33158H.m33164B(new InterfaceC23492o() { // from class: Xf5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m74517e;
                    m74517e = C37279Yf5.C9884a.m74517e(Function1.this, obj);
                    return m74517e;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yf5$b */
    /* loaded from: classes3.dex */
    public static final class C9888b extends Lambda implements Function1<T, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AtomicBoolean f46232g;

        /* renamed from: h */
        public final /* synthetic */ Function1<T, Unit> f46233h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9888b(AtomicBoolean atomicBoolean, Function1<? super T, Unit> function1) {
            super(1);
            this.f46232g = atomicBoolean;
            this.f46233h = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2((C9888b) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(T t) {
            if (this.f46232g.getAndSet(true)) {
                return;
            }
            this.f46233h.invoke(t);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "K", "", "item", "test"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = SyslogConstants.LOG_LOCAL6)
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: Yf5$c */
    /* loaded from: classes3.dex */
    public static final class C9889c<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C9889c<T> f46234b = new C9889c<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.reifiedOperationMarker(3, "K");
            return item instanceof Object;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u0001H\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "K", "kotlin.jvm.PlatformType", "", "item", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = SyslogConstants.LOG_LOCAL6)
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: Yf5$d */
    /* loaded from: classes3.dex */
    public static final class C9890d<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C9890d<T, R> f46235b = new C9890d<>();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.InterfaceC23492o
        public final K apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.reifiedOperationMarker(1, "K");
            return item;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00018\u00008\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Object;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yf5$e */
    /* loaded from: classes3.dex */
    public static final class C9891e extends Lambda implements Function1<T, InterfaceC23434B<? extends T>> {

        /* renamed from: g */
        public final /* synthetic */ Function1<T, Boolean> f46236g;

        /* renamed from: h */
        public final /* synthetic */ Function1<T, InterfaceC23434B<T>> f46237h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9891e(Function1<? super T, Boolean> function1, Function1<? super T, ? extends InterfaceC23434B<T>> function12) {
            super(1);
            this.f46236g = function1;
            this.f46237h = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends T> invoke(T t) {
            if (this.f46236g.invoke(t).booleanValue()) {
                return (InterfaceC23434B) this.f46237h.invoke(t);
            }
            Observable just = Observable.just(t);
            Intrinsics.checkNotNullExpressionValue(just, "just(it)");
            return just;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00018\u00008\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Object;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yf5$f */
    /* loaded from: classes3.dex */
    public static final class C9892f extends Lambda implements Function1<T, InterfaceC23447K<? extends T>> {

        /* renamed from: g */
        public final /* synthetic */ Function1<T, Boolean> f46238g;

        /* renamed from: h */
        public final /* synthetic */ Function1<T, InterfaceC23447K<T>> f46239h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9892f(Function1<? super T, Boolean> function1, Function1<? super T, ? extends InterfaceC23447K<T>> function12) {
            super(1);
            this.f46238g = function1;
            this.f46239h = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends T> invoke(T t) {
            if (this.f46238g.invoke(t).booleanValue()) {
                return (InterfaceC23447K) this.f46239h.invoke(t);
            }
            AbstractC23442F m33158H = AbstractC23442F.m33158H(t);
            Intrinsics.checkNotNullExpressionValue(m33158H, "just(it)");
            return m33158H;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00018\u00008\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "it", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Object;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yf5$g */
    /* loaded from: classes3.dex */
    public static final class C9893g extends Lambda implements Function1<T, InterfaceC24574u<? extends T>> {

        /* renamed from: g */
        public final /* synthetic */ Function1<T, Boolean> f46240g;

        /* renamed from: h */
        public final /* synthetic */ Function1<T, InterfaceC24574u<T>> f46241h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9893g(Function1<? super T, Boolean> function1, Function1<? super T, ? extends InterfaceC24574u<T>> function12) {
            super(1);
            this.f46240g = function1;
            this.f46241h = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends T> invoke(T t) {
            if (this.f46240g.invoke(t).booleanValue()) {
                return (InterfaceC24574u) this.f46241h.invoke(t);
            }
            AbstractC24507p m32068G = AbstractC24507p.m32068G(t);
            Intrinsics.checkNotNullExpressionValue(m32068G, "just(it)");
            return m32068G;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yf5$h */
    /* loaded from: classes3.dex */
    public static final class C9894h extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public final /* synthetic */ ImageView f46242g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9894h(ImageView imageView) {
            super(1);
            this.f46242g = imageView;
        }

        /* renamed from: a */
        public final void m74511a(InterfaceC23465c interfaceC23465c) {
            this.f46242g.setImageDrawable(null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m74511a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/LocalAsset;", "kotlin.jvm.PlatformType", "localAsset", "", C17296a.f69688o, "(Lco/bird/android/model/LocalAsset;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yf5$i */
    /* loaded from: classes3.dex */
    public static final class C9895i extends Lambda implements Function1<LocalAsset, Unit> {

        /* renamed from: g */
        public final /* synthetic */ ImageView f46243g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9895i(ImageView imageView) {
            super(1);
            this.f46243g = imageView;
        }

        /* renamed from: a */
        public final void m74510a(LocalAsset localAsset) {
            ComponentCallbacks2C17096a.m53137u(this.f46243g).m81655i(localAsset.getFile()).mo16086d(new YI4().m97554k(B41.f1616b)).m16096R0(this.f46243g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LocalAsset localAsset) {
            m74510a(localAsset);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yf5$j */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9896j extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C9896j f46244b = new C9896j();

        public C9896j() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00018\u00018\u0001 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00018\u00018\u0001\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"T", "", "R", "it", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Object;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yf5$k */
    /* loaded from: classes3.dex */
    public static final class C9897k extends Lambda implements Function1<T, InterfaceC24574u<? extends R>> {

        /* renamed from: g */
        public final /* synthetic */ Function1<T, R> f46245g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9897k(Function1<? super T, ? extends R> function1) {
            super(1);
            this.f46245g = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends R> invoke(T t) {
            return C37279Yf5.m74545l0(this.f46245g.invoke(t));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00018\u00018\u0001 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00018\u00018\u0001\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"T", "", "R", "it", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Object;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yf5$l */
    /* loaded from: classes3.dex */
    public static final class C9898l extends Lambda implements Function1<T, InterfaceC24574u<? extends R>> {

        /* renamed from: g */
        public final /* synthetic */ Function1<T, R> f46246g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9898l(Function1<? super T, ? extends R> function1) {
            super(1);
            this.f46246g = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends R> invoke(T t) {
            return C37279Yf5.m74545l0(this.f46246g.invoke(t));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "Lco/bird/android/buava/Optional;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yf5$m */
    /* loaded from: classes3.dex */
    public static final class C9899m extends Lambda implements Function1<Optional<T>, Boolean> {

        /* renamed from: g */
        public static final C9899m f46247g = new C9899m();

        public C9899m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<T> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "Lco/bird/android/buava/Optional;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yf5$n */
    /* loaded from: classes3.dex */
    public static final class C9900n extends Lambda implements Function1<Optional<T>, T> {

        /* renamed from: g */
        public static final C9900n f46248g = new C9900n();

        public C9900n() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final T invoke(Optional<T> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59038b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "Lco/bird/android/buava/Optional;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yf5$o */
    /* loaded from: classes3.dex */
    public static final class C9901o extends Lambda implements Function1<Optional<T>, Boolean> {

        /* renamed from: g */
        public static final C9901o f46249g = new C9901o();

        public C9901o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<T> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "Lco/bird/android/buava/Optional;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yf5$p */
    /* loaded from: classes3.dex */
    public static final class C9902p extends Lambda implements Function1<Optional<T>, T> {

        /* renamed from: g */
        public static final C9902p f46250g = new C9902p();

        public C9902p() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final T invoke(Optional<T> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59038b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "Lco/bird/android/buava/Optional;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yf5$q */
    /* loaded from: classes3.dex */
    public static final class C9903q extends Lambda implements Function1<Optional<T>, Boolean> {

        /* renamed from: g */
        public static final C9903q f46251g = new C9903q();

        public C9903q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<T> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "Lco/bird/android/buava/Optional;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yf5$r */
    /* loaded from: classes3.dex */
    public static final class C9904r extends Lambda implements Function1<Optional<T>, T> {

        /* renamed from: g */
        public static final C9904r f46252g = new C9904r();

        public C9904r() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final T invoke(Optional<T> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59038b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0002*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u00050\u0004\"\u0004\b\u0000\u0010\u00002\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00008\u00000\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"T", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "upstream", "Lio/reactivex/B;", "", "invoke", "(Lio/reactivex/Observable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yf5$s */
    /* loaded from: classes3.dex */
    public static final class C9905s extends Lambda implements Function1<Observable<T>, InterfaceC23434B<List<? extends T>>> {

        /* renamed from: g */
        public final /* synthetic */ int f46253g;

        /* renamed from: h */
        public final /* synthetic */ boolean f46254h;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0003*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "it", "", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Object;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Yf5$s$a */
        /* loaded from: classes3.dex */
        public static final class C9906a extends Lambda implements Function1<T, List<? extends T>> {

            /* renamed from: g */
            public static final C9906a f46255g = new C9906a();

            public C9906a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final List<T> invoke(T t) {
                List<T> listOf;
                listOf = CollectionsKt__CollectionsJVMKt.listOf(t);
                return listOf;
            }
        }

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "", "previous", "current", C17296a.f69688o, "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Yf5$s$b */
        /* loaded from: classes3.dex */
        public static final class C9907b extends Lambda implements Function2<List<? extends T>, List<? extends T>, List<? extends T>> {

            /* renamed from: g */
            public final /* synthetic */ int f46256g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9907b(int i) {
                super(2);
                this.f46256g = i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final List<T> invoke(List<? extends T> previous, List<? extends T> current) {
                int coerceAtMost;
                List takeLast;
                List<T> plus;
                Intrinsics.checkNotNullParameter(previous, "previous");
                Intrinsics.checkNotNullParameter(current, "current");
                int size = this.f46256g - current.size();
                if (size > 0) {
                    coerceAtMost = RangesKt___RangesKt.coerceAtMost(size, previous.size());
                    takeLast = CollectionsKt___CollectionsKt.takeLast(previous, coerceAtMost);
                    plus = CollectionsKt___CollectionsKt.plus((Collection) takeLast, (Iterable) current);
                    return plus;
                }
                return current;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Yf5$s$c */
        /* loaded from: classes3.dex */
        public static final class C9908c extends Lambda implements Function1<List<? extends T>, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ int f46257g;

            /* renamed from: h */
            public final /* synthetic */ boolean f46258h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9908c(int i, boolean z) {
                super(1);
                this.f46257g = i;
                this.f46258h = z;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(List<? extends T> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z = true;
                if (it.size() != this.f46257g && (!(!it.isEmpty()) || !this.f46258h)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9905s(int i, boolean z) {
            super(1);
            this.f46253g = i;
            this.f46254h = z;
        }

        /* renamed from: d */
        public static final List m74498d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final List m74497e(Function2 tmp0, List list, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(list, obj);
        }

        /* renamed from: f */
        public static final boolean m74496f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<List<T>> invoke(Observable<T> upstream) {
            List emptyList;
            Intrinsics.checkNotNullParameter(upstream, "upstream");
            final C9906a c9906a = C9906a.f46255g;
            Observable map = upstream.map(new InterfaceC23492o() { // from class: cg5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m74498d;
                    m74498d = C37279Yf5.C9905s.m74498d(Function1.this, obj);
                    return m74498d;
                }
            });
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            final C9907b c9907b = new C9907b(this.f46253g);
            Observable scan = map.scan(emptyList, new InterfaceC23480c() { // from class: dg5
                @Override // io.reactivex.functions.InterfaceC23480c
                public final Object apply(Object obj, Object obj2) {
                    List m74497e;
                    m74497e = C37279Yf5.C9905s.m74497e(Function2.this, (List) obj, obj2);
                    return m74497e;
                }
            });
            final C9908c c9908c = new C9908c(this.f46253g, this.f46254h);
            return scan.filter(new InterfaceC23494q() { // from class: eg5
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m74496f;
                    m74496f = C37279Yf5.C9905s.m74496f(Function1.this, obj);
                    return m74496f;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00028\u0001 \u0004*\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "V", "it", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Object;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yf5$t */
    /* loaded from: classes3.dex */
    public static final class C9909t extends Lambda implements Function1<T, Optional<V>> {

        /* renamed from: g */
        public final /* synthetic */ Function1<T, V> f46259g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9909t(Function1<? super T, ? extends V> function1) {
            super(1);
            this.f46259g = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final Optional<V> invoke(T t) {
            return Optional.f63040c.m59033b(this.f46259g.invoke(t));
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0003*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "it", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Object;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yf5$u */
    /* loaded from: classes3.dex */
    public static final class C9910u extends Lambda implements Function1<T, Optional<T>> {

        /* renamed from: g */
        public static final C9910u f46260g = new C9910u();

        public C9910u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final Optional<T> invoke(T t) {
            return Optional.f63040c.m59032c(t);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u00002\u001a\u0010\u0004\u001a\u0016\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Pair;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yf5$v */
    /* loaded from: classes3.dex */
    public static final class C9911v extends Lambda implements Function1<Pair<? extends Unit, ? extends T>, T> {

        /* renamed from: g */
        public static final C9911v f46261g = new C9911v();

        public C9911v() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final T invoke(Pair<Unit, ? extends T> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return pair.component2();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "T", "U", "t", "u", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yf5$w */
    /* loaded from: classes3.dex */
    public static final class C9912w extends Lambda implements Function2<T, U, Pair<? extends T, ? extends U>> {

        /* renamed from: g */
        public static final C9912w f46262g = new C9912w();

        public C9912w() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((C9912w) obj, obj2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Pair<T, U> invoke(T t, U u) {
            return new Pair<>(t, u);
        }
    }

    /* renamed from: A */
    public static final List m74594A(AbstractC23461c[] sources) {
        Intrinsics.checkNotNullParameter(sources, "$sources");
        ArrayList arrayList = new ArrayList(sources.length);
        for (AbstractC23461c abstractC23461c : sources) {
            arrayList.add(abstractC23461c.m33046j0(Optional.f63040c.m59034a()).m33149Q(new InterfaceC23492o() { // from class: Hf5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m74593B;
                    m74593B = C37279Yf5.m74593B((Throwable) obj);
                    return m74593B;
                }
            }));
        }
        return arrayList;
    }

    /* renamed from: B */
    public static final Optional m74593B(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return Optional.f63040c.m59032c(exception);
    }

    /* renamed from: C */
    public static final InterfaceC23496h m74592C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final <T> AbstractC24490k<T> m74591D(AbstractC24490k<T> abstractC24490k, Function1<? super T, Unit> onFirst) {
        Intrinsics.checkNotNullParameter(abstractC24490k, "<this>");
        Intrinsics.checkNotNullParameter(onFirst, "onFirst");
        final C9888b c9888b = new C9888b(new AtomicBoolean(false), onFirst);
        AbstractC24490k<T> m32191K = abstractC24490k.m32191K(new InterfaceC23484g() { // from class: uf5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37279Yf5.m74590E(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32191K, "onFirst: (T) -> Unit): F…    onFirst(it)\n    }\n  }");
        return m32191K;
    }

    /* renamed from: E */
    public static final void m74590E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final <T> Observable<T> m74589F(Observable<T> observable, Function1<? super T, Boolean> predicate, Function1<? super T, ? extends InterfaceC23434B<T>> mapper) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        final C9891e c9891e = new C9891e(predicate, mapper);
        Observable<T> observable2 = (Observable<T>) observable.flatMap(new InterfaceC23492o() { // from class: wf5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m74587H;
                m74587H = C37279Yf5.m74587H(Function1.this, obj);
                return m74587H;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable2, "predicate: (T) -> Boolea…lse Observable.just(it) }");
        return observable2;
    }

    /* renamed from: G */
    public static final <T> AbstractC23442F<T> m74588G(AbstractC23442F<T> abstractC23442F, Function1<? super T, Boolean> predicate, Function1<? super T, ? extends InterfaceC23447K<T>> mapper) {
        Intrinsics.checkNotNullParameter(abstractC23442F, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        final C9892f c9892f = new C9892f(predicate, mapper);
        AbstractC23442F<T> abstractC23442F2 = (AbstractC23442F<T>) abstractC23442F.m33165A(new InterfaceC23492o() { // from class: Jf5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m74586I;
                m74586I = C37279Yf5.m74586I(Function1.this, obj);
                return m74586I;
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC23442F2, "predicate: (T) -> Boolea…t) else Single.just(it) }");
        return abstractC23442F2;
    }

    /* renamed from: H */
    public static final InterfaceC23434B m74587H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final InterfaceC23447K m74586I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final <T> Observable<T> m74585J(Observable<T> observable, Function1<? super T, Boolean> predicate, Function1<? super T, ? extends InterfaceC24574u<T>> mapper) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        final C9893g c9893g = new C9893g(predicate, mapper);
        Observable<T> observable2 = (Observable<T>) observable.flatMapMaybe(new InterfaceC23492o() { // from class: If5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m74584K;
                m74584K = C37279Yf5.m74584K(Function1.this, obj);
                return m74584K;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable2, "predicate: (T) -> Boolea…it) else Maybe.just(it) }");
        return observable2;
    }

    /* renamed from: K */
    public static final InterfaceC24574u m74584K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m74583L(AbstractC23442F<LocalAsset> abstractC23442F, ImageView imageView, ScopeProvider scope) {
        Intrinsics.checkNotNullParameter(abstractC23442F, "<this>");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(scope, "scope");
        AbstractC23442F<LocalAsset> m33152N = abstractC23442F.m33142Y(C24542a.m31932c()).m33152N(C23454a.m33087a());
        final C9894h c9894h = new C9894h(imageView);
        AbstractC23442F<LocalAsset> m33102v = m33152N.m33102v(new InterfaceC23484g() { // from class: vf5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37279Yf5.m74582M(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33102v, "imageView: ImageView, sc….setImageDrawable(null) }");
        Object m33135e = m33102v.m33135e(AutoDispose.m45239a(scope));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9895i c9895i = new C9895i(imageView);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Lf5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37279Yf5.m74581N(Function1.this, obj);
            }
        };
        final C9896j c9896j = C9896j.f46244b;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Nf5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37279Yf5.m74580O(Function1.this, obj);
            }
        });
    }

    /* renamed from: M */
    public static final void m74582M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m74581N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m74580O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final <T> AbstractC24490k<T> m74579P(AbstractC24490k<Optional<T>> abstractC24490k) {
        Intrinsics.checkNotNullParameter(abstractC24490k, "<this>");
        final C9901o c9901o = C9901o.f46249g;
        AbstractC24490k<Optional<T>> m32175S = abstractC24490k.m32175S(new InterfaceC23494q() { // from class: Bf5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m74570Y;
                m74570Y = C37279Yf5.m74570Y(Function1.this, obj);
                return m74570Y;
            }
        });
        final C9902p c9902p = C9902p.f46250g;
        AbstractC24490k<T> abstractC24490k2 = (AbstractC24490k<T>) m32175S.m32117q0(new InterfaceC23492o() { // from class: Cf5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Object m74569Z;
                m74569Z = C37279Yf5.m74569Z(Function1.this, obj);
                return m74569Z;
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC24490k2, "filter { it.isPresent }.map { it.get() }");
        return abstractC24490k2;
    }

    /* renamed from: Q */
    public static final <T, R> AbstractC24490k<R> m74578Q(AbstractC24490k<T> abstractC24490k, Function1<? super T, ? extends R> mapper) {
        Intrinsics.checkNotNullParameter(abstractC24490k, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        final C9898l c9898l = new C9898l(mapper);
        AbstractC24490k<R> m32154d0 = abstractC24490k.m32154d0(new InterfaceC23492o() { // from class: Sf5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m74573V;
                m74573V = C37279Yf5.m74573V(Function1.this, obj);
                return m74573V;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32154d0, "mapper: (T) -> R?): Flow… { mapper(it).toMaybe() }");
        return m32154d0;
    }

    /* renamed from: R */
    public static final <T> AbstractC24507p<T> m74577R(AbstractC23442F<Optional<T>> abstractC23442F) {
        Intrinsics.checkNotNullParameter(abstractC23442F, "<this>");
        final C9903q c9903q = C9903q.f46251g;
        AbstractC24507p<Optional<T>> m33098z = abstractC23442F.m33098z(new InterfaceC23494q() { // from class: Ef5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m74567a0;
                m74567a0 = C37279Yf5.m74567a0(Function1.this, obj);
                return m74567a0;
            }
        });
        final C9904r c9904r = C9904r.f46252g;
        AbstractC24507p<T> abstractC24507p = (AbstractC24507p<T>) m33098z.m32067H(new InterfaceC23492o() { // from class: Ff5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Object m74565b0;
                m74565b0 = C37279Yf5.m74565b0(Function1.this, obj);
                return m74565b0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC24507p, "filter { it.isPresent }.map { it.get() }");
        return abstractC24507p;
    }

    /* renamed from: S */
    public static final <T> Observable<T> m74576S(Observable<Optional<T>> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        final C9899m c9899m = C9899m.f46247g;
        Observable<Optional<T>> filter = observable.filter(new InterfaceC23494q() { // from class: yf5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m74572W;
                m74572W = C37279Yf5.m74572W(Function1.this, obj);
                return m74572W;
            }
        });
        final C9900n c9900n = C9900n.f46248g;
        Observable<T> observable2 = (Observable<T>) filter.map(new InterfaceC23492o() { // from class: zf5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Object m74571X;
                m74571X = C37279Yf5.m74571X(Function1.this, obj);
                return m74571X;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable2, "filter { it.isPresent }.map { it.get() }");
        return observable2;
    }

    /* renamed from: T */
    public static final <T, R> Observable<R> m74575T(Observable<T> observable, Function1<? super T, ? extends R> mapper) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        final C9897k c9897k = new C9897k(mapper);
        Observable<R> flatMapMaybe = observable.flatMapMaybe(new InterfaceC23492o() { // from class: Pf5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m74574U;
                m74574U = C37279Yf5.m74574U(Function1.this, obj);
                return m74574U;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "mapper: (T) -> R?): Obse… { mapper(it).toMaybe() }");
        return flatMapMaybe;
    }

    /* renamed from: U */
    public static final InterfaceC24574u m74574U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final InterfaceC24574u m74573V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final boolean m74572W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: X */
    public static final Object m74571X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final boolean m74570Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: Z */
    public static final Object m74569Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final boolean m74567a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: b0 */
    public static final Object m74565b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final AbstractC23461c m74563c0(AbstractC23461c abstractC23461c, int i) {
        Intrinsics.checkNotNullParameter(abstractC23461c, "<this>");
        AbstractC23461c m33064V = abstractC23461c.m33064V(new C37927aO4(null, 0, i, null, 11, null));
        Intrinsics.checkNotNullExpressionValue(m33064V, "this.retryWhen(RetryWith…ySeconds = delaySeconds))");
        return m33064V;
    }

    /* renamed from: d0 */
    public static final AbstractC23461c m74561d0(AbstractC23461c abstractC23461c, int i, int i2) {
        Intrinsics.checkNotNullParameter(abstractC23461c, "<this>");
        AbstractC23461c m33064V = abstractC23461c.m33064V(new C37927aO4(null, i, i2, null, 9, null));
        Intrinsics.checkNotNullExpressionValue(m33064V, "this.retryWhen(RetryWith…ySeconds = delaySeconds))");
        return m33064V;
    }

    /* renamed from: e0 */
    public static final <T> AbstractC24507p<T> m74559e0(AbstractC24507p<T> abstractC24507p, int i, int i2) {
        Intrinsics.checkNotNullParameter(abstractC24507p, "<this>");
        AbstractC24507p<T> m32057R = abstractC24507p.m32057R(new C37927aO4(null, i, i2, null, 9, null));
        Intrinsics.checkNotNullExpressionValue(m32057R, "this.retryWhen(RetryWith…ySeconds = delaySeconds))");
        return m32057R;
    }

    /* renamed from: f0 */
    public static final <T> Observable<T> m74557f0(Observable<T> observable, int i) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Observable<T> retryWhen = observable.retryWhen(new WN4(null, 0, i, null, 11, null));
        Intrinsics.checkNotNullExpressionValue(retryWhen, "this.retryWhen(RetryWith…ySeconds = delaySeconds))");
        return retryWhen;
    }

    public static final /* synthetic */ <K> Observable<K> filterInstance(Observable<?> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.needClassReification();
        Observable<?> filter = observable.filter(C9889c.f46234b);
        Intrinsics.needClassReification();
        Observable<K> observable2 = (Observable<K>) filter.map(C9890d.f46235b);
        Intrinsics.checkNotNullExpressionValue(observable2, "filter { item -> item is…map { item -> item as K }");
        return observable2;
    }

    /* renamed from: g0 */
    public static final <T> AbstractC23442F<T> m74555g0(AbstractC23442F<T> abstractC23442F, int i) {
        Intrinsics.checkNotNullParameter(abstractC23442F, "<this>");
        AbstractC23442F<T> m33143W = abstractC23442F.m33143W(new C37927aO4(null, 0, i, null, 11, null));
        Intrinsics.checkNotNullExpressionValue(m33143W, "this.retryWhen(RetryWith…ySeconds = delaySeconds))");
        return m33143W;
    }

    /* renamed from: h0 */
    public static final <T> AbstractC23442F<T> m74553h0(AbstractC23442F<T> abstractC23442F, int i, int i2) {
        Intrinsics.checkNotNullParameter(abstractC23442F, "<this>");
        AbstractC23442F<T> m33143W = abstractC23442F.m33143W(new C37927aO4(null, i, i2, null, 9, null));
        Intrinsics.checkNotNullExpressionValue(m33143W, "this.retryWhen(RetryWith…ySeconds = delaySeconds))");
        return m33143W;
    }

    /* renamed from: i0 */
    public static final <T> AbstractC23442F<T> m74551i0(AbstractC23442F<T> abstractC23442F) {
        Intrinsics.checkNotNullParameter(abstractC23442F, "<this>");
        AbstractC23442F<T> firstOrError = abstractC23442F.m33123k0().replay(1).m32084i().firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "toObservable().replay(1).refCount().firstOrError()");
        return firstOrError;
    }

    /* renamed from: j0 */
    public static final <T> Observable<List<T>> m74549j0(Observable<T> observable, int i, boolean z) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        final C9905s c9905s = new C9905s(i, z);
        Observable<List<T>> observable2 = (Observable<List<T>>) observable.compose(new InterfaceC23435C() { // from class: sf5
            @Override // io.reactivex.InterfaceC23435C
            public final InterfaceC23434B apply(Observable observable3) {
                InterfaceC23434B m74547k0;
                m74547k0 = C37279Yf5.m74547k0(Function1.this, observable3);
                return m74547k0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable2, "T> Observable<T>.sliding…artialWindow)\n      }\n  }");
        return observable2;
    }

    /* renamed from: k0 */
    public static final InterfaceC23434B m74547k0(Function1 tmp0, Observable p0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (InterfaceC23434B) tmp0.invoke(p0);
    }

    /* renamed from: l0 */
    public static final <T> AbstractC24507p<T> m74545l0(final T t) {
        AbstractC24507p<T> m32071D = AbstractC24507p.m32071D(new Callable() { // from class: Rf5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object m74543m0;
                m74543m0 = C37279Yf5.m74543m0(t);
                return m74543m0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32071D, "fromCallable { this }");
        return m32071D;
    }

    /* renamed from: m0 */
    public static final Object m74543m0(Object obj) {
        return obj;
    }

    /* renamed from: n0 */
    public static final <T> Observable<Optional<T>> m74541n0(Observable<T> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        final C9910u c9910u = C9910u.f46260g;
        Observable<Optional<T>> observable2 = (Observable<Optional<T>>) observable.map(new InterfaceC23492o() { // from class: Af5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m74535q0;
                m74535q0 = C37279Yf5.m74535q0(Function1.this, obj);
                return m74535q0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable2, "map {\n  Optional.of(it)\n}");
        return observable2;
    }

    /* renamed from: o0 */
    public static final <T, V> Observable<Optional<V>> m74539o0(Observable<T> observable, Function1<? super T, ? extends V> mapper) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        final C9909t c9909t = new C9909t(mapper);
        Observable<Optional<V>> observable2 = (Observable<Optional<V>>) observable.map(new InterfaceC23492o() { // from class: Df5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m74537p0;
                m74537p0 = C37279Yf5.m74537p0(Function1.this, obj);
                return m74537p0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable2, "mapper: (T) -> V): Obser…romNullable(mapper(it))\n}");
        return observable2;
    }

    /* renamed from: p0 */
    public static final Optional m74537p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: q0 */
    public static final Optional m74535q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: r0 */
    public static final <T> AbstractC23442F<T> m74533r0(AbstractC23461c abstractC23461c, InterfaceC23434B<T> other) {
        Intrinsics.checkNotNullParameter(abstractC23461c, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        AbstractC23442F<T> m33042m = abstractC23461c.m33042m(AbstractC23442F.m33158H(Unit.INSTANCE));
        Intrinsics.checkNotNullExpressionValue(m33042m, "this.andThen(Single.just(Unit))");
        AbstractC23442F m74531s0 = m74531s0(m33042m, other);
        final C9911v c9911v = C9911v.f46261g;
        AbstractC23442F<T> m33157I = m74531s0.m33157I(new InterfaceC23492o() { // from class: Kf5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Object m74529t0;
                m74529t0 = C37279Yf5.m74529t0(Function1.this, obj);
                return m74529t0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "this.andThen(Single.just…p { (_, other) -> other }");
        return m33157I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s0 */
    public static final <T, U> AbstractC23442F<Pair<T, U>> m74531s0(AbstractC23442F<T> abstractC23442F, InterfaceC23434B<U> other) {
        Intrinsics.checkNotNullParameter(abstractC23442F, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Observable<T> m33123k0 = abstractC23442F.m33123k0();
        final C9912w c9912w = C9912w.f46262g;
        AbstractC23442F<Pair<T, U>> firstOrError = m33123k0.withLatestFrom(other, new InterfaceC23480c() { // from class: Tf5
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Pair m74527u0;
                m74527u0 = C37279Yf5.m74527u0(Function2.this, obj, obj2);
                return m74527u0;
            }
        }).firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "toObservable()\n    .with…u) })\n    .firstOrError()");
        return firstOrError;
    }

    public static /* synthetic */ Observable slidingWindow$default(Observable observable, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m74549j0(observable, i, z);
    }

    /* renamed from: t0 */
    public static final Object m74529t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return tmp0.invoke(obj);
    }

    /* renamed from: u0 */
    public static final Pair m74527u0(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj, obj2);
    }

    /* renamed from: y */
    public static final void m74523y(InterfaceC23465c interfaceC23465c, C23464b compositeDisposable) {
        Intrinsics.checkNotNullParameter(interfaceC23465c, "<this>");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        compositeDisposable.mo32983c(interfaceC23465c);
    }

    /* renamed from: z */
    public static final AbstractC23461c m74522z(final AbstractC23461c... sources) {
        Intrinsics.checkNotNullParameter(sources, "sources");
        AbstractC23442F m33161E = AbstractC23442F.m33161E(new Callable() { // from class: Uf5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m74594A;
                m74594A = C37279Yf5.m74594A(sources);
                return m74594A;
            }
        });
        final C9884a c9884a = C9884a.f46227g;
        AbstractC23461c m33164B = m33161E.m33164B(new InterfaceC23492o() { // from class: Vf5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m74592C;
                m74592C = C37279Yf5.m74592C(Function1.this, obj);
                return m74592C;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "fromCallable {\n    // Fi…        }\n        }\n    }");
        return m33164B;
    }
}
