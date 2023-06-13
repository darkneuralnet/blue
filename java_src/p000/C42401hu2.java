package p000;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.AssetTask;
import co.bird.android.model.wire.WireAsset;
import co.bird.api.response.WireSignedUrl;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24558d;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p053io.FilesKt__UtilsKt;
import okhttp3.ResponseBody;
import org.joda.time.DateTime;
import p000.C42401hu2;
import p000.InterfaceC48923su2;
@Metadata(m28433d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 I2\u00020\u0001:\u0002JKB\u001f\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\u0006\u0010\u001e\u001a\u00020\u001a\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\bG\u0010HJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u001a\u0010\u0019\u001a\u00020\u00158\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u001a8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010'\u001a\u00020#8\u0016X\u0096D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b \u0010&R\u001a\u0010)\u001a\u00020#8\u0016X\u0096D¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b$\u0010&R\u001a\u0010/\u001a\u00020*8\u0014X\u0094D¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u00104\u001a\n 1*\u0004\u0018\u000100008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00106R\"\u0010;\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u00010\u00020\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010>R \u0010F\u001a\b\u0012\u0004\u0012\u00020\u00120B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b+\u0010E¨\u0006L"}, m28432d2 = {"Lhu2;", "Lqx1;", "Lco/bird/android/model/AssetTask;", "task", "", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "S", "Lio/reactivex/p;", "D", "LHM4;", "Lokhttp3/ResponseBody;", "response", "T", "", "e", "R", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "", "isDebug", "n", "Landroid/content/Context;", "g", "Landroid/content/Context;", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "h", "Landroid/content/Intent;", "()Landroid/content/Intent;", "intent", "Lsu2;", "i", "Lsu2;", "localAssetManager", "", "j", "I", "()I", "notificationId", "k", "notificationPriority", "", "l", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "channelId", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "m", "Ljava/util/concurrent/ExecutorService;", "executor", "Lhu2$b;", "Lhu2$b;", "assetQueue", "Lio/reactivex/subjects/d;", "o", "Lio/reactivex/subjects/d;", "downloadTaskSubject", "Lae3;", "p", "Lae3;", "activeTasks", "q", "savingTasks", "Lio/reactivex/Observable;", "r", "Lio/reactivex/Observable;", "()Lio/reactivex/Observable;", "shouldForeground", "<init>", "(Landroid/content/Context;Landroid/content/Intent;Lsu2;)V", "s", C17296a.f69688o, "b", "local-asset_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLocalAssetDownloadServicePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalAssetDownloadServicePlugin.kt\nco/bird/android/manager/localasset/services/LocalAssetDownloadServicePlugin\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,274:1\n71#2,2:275\n180#3:277\n180#3:278\n180#3:279\n1#4:280\n*S KotlinDebug\n*F\n+ 1 LocalAssetDownloadServicePlugin.kt\nco/bird/android/manager/localasset/services/LocalAssetDownloadServicePlugin\n*L\n60#1:275,2\n76#1:277\n92#1:278\n145#1:279\n*E\n"})
/* renamed from: hu2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42401hu2 extends AbstractC47767qx1 {

    /* renamed from: s */
    public static final C22810a f86116s = new C22810a(null);

    /* renamed from: g */
    public final Context f86117g;

    /* renamed from: h */
    public final Intent f86118h;

    /* renamed from: i */
    public final InterfaceC48923su2 f86119i;

    /* renamed from: j */
    public final int f86120j;

    /* renamed from: k */
    public final int f86121k;

    /* renamed from: l */
    public final String f86122l;

    /* renamed from: m */
    public final ExecutorService f86123m;

    /* renamed from: n */
    public final C22811b<AssetTask> f86124n;

    /* renamed from: o */
    public final C24558d<AssetTask> f86125o;

    /* renamed from: p */
    public final C38074ae3<AssetTask> f86126p;

    /* renamed from: q */
    public final C38074ae3<AssetTask> f86127q;

    /* renamed from: r */
    public final Observable<Boolean> f86128r;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"Lhu2$a;", "", "", "BACKGROUND_CHANNEL_ID", "Ljava/lang/String;", "", "MAX_SIMULTANEOUS_DOWNLOADS", "I", "<init>", "()V", "local-asset_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: hu2$a */
    /* loaded from: classes4.dex */
    public static final class C22810a {
        public /* synthetic */ C22810a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C22810a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BI\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u00126\u0010$\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u001d0\u001f¢\u0006\u0004\b%\u0010&J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0016\u0010\u0011\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016R.\u0010\u0017\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0014*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00130\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R#\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006'"}, m28432d2 = {"Lhu2$b;", "E", "Ljava/util/PriorityQueue;", "e", "", "offer", "(Ljava/lang/Object;)Z", "poll", "()Ljava/lang/Object;", "", "elements", "removeAll", "element", "add", "remove", "", "clear", "retainAll", "Lio/reactivex/subjects/d;", "", "kotlin.jvm.PlatformType", "b", "Lio/reactivex/subjects/d;", "queueSubject", "Lio/reactivex/Observable;", "c", "Lio/reactivex/Observable;", "()Lio/reactivex/Observable;", "observable", "", "initialCapacity", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "o1", "o2", "comparator", "<init>", "(ILkotlin/jvm/functions/Function2;)V", "local-asset_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: hu2$b */
    /* loaded from: classes4.dex */
    public static final class C22811b<E> extends PriorityQueue<E> {

        /* renamed from: b */
        public final C24558d<List<E>> f86129b;

        /* renamed from: c */
        public final Observable<List<E>> f86130c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22811b(int i, final Function2<? super E, ? super E, Integer> comparator) {
            super(i, new Comparator() { // from class: iu2
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m35534b;
                    m35534b = C42401hu2.C22811b.m35534b(Function2.this, obj, obj2);
                    return m35534b;
                }
            });
            Intrinsics.checkNotNullParameter(comparator, "comparator");
            C24558d<List<E>> m31902e = C24558d.m31902e();
            Intrinsics.checkNotNullExpressionValue(m31902e, "create<List<E>>()");
            this.f86129b = m31902e;
            Observable<List<E>> hide = m31902e.hide();
            Intrinsics.checkNotNullExpressionValue(hide, "queueSubject.hide()");
            this.f86130c = hide;
        }

        /* renamed from: b */
        public static final int m35534b(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Number) tmp0.invoke(obj, obj2)).intValue();
        }

        @Override // java.util.PriorityQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
        public boolean add(E e) {
            List<E> list;
            boolean add = super.add(e);
            C24558d<List<E>> c24558d = this.f86129b;
            list = CollectionsKt___CollectionsKt.toList(this);
            c24558d.onNext(list);
            return add;
        }

        /* renamed from: c */
        public final Observable<List<E>> m35533c() {
            return this.f86130c;
        }

        @Override // java.util.PriorityQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            List<E> list;
            super.clear();
            Unit unit = Unit.INSTANCE;
            C24558d<List<E>> c24558d = this.f86129b;
            list = CollectionsKt___CollectionsKt.toList(this);
            c24558d.onNext(list);
        }

        /* renamed from: e */
        public /* bridge */ int m35532e() {
            return super.size();
        }

        @Override // java.util.PriorityQueue, java.util.Queue
        public boolean offer(E e) {
            List<E> list;
            boolean offer = super.offer(e);
            C24558d<List<E>> c24558d = this.f86129b;
            list = CollectionsKt___CollectionsKt.toList(this);
            c24558d.onNext(list);
            return offer;
        }

        @Override // java.util.PriorityQueue, java.util.Queue
        public E poll() {
            List<E> list;
            E e = (E) super.poll();
            C24558d<List<E>> c24558d = this.f86129b;
            list = CollectionsKt___CollectionsKt.toList(this);
            c24558d.onNext(list);
            return e;
        }

        @Override // java.util.AbstractQueue, java.util.Queue
        public E remove() {
            List<E> list;
            E e = (E) super.remove();
            C24558d<List<E>> c24558d = this.f86129b;
            list = CollectionsKt___CollectionsKt.toList(this);
            c24558d.onNext(list);
            return e;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            List<E> list;
            Intrinsics.checkNotNullParameter(elements, "elements");
            boolean removeAll = super.removeAll(elements);
            C24558d<List<E>> c24558d = this.f86129b;
            list = CollectionsKt___CollectionsKt.toList(this);
            c24558d.onNext(list);
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            List<E> list;
            Intrinsics.checkNotNullParameter(elements, "elements");
            boolean retainAll = super.retainAll(elements);
            C24558d<List<E>> c24558d = this.f86129b;
            list = CollectionsKt___CollectionsKt.toList(this);
            c24558d.onNext(list);
            return retainAll;
        }

        @Override // java.util.PriorityQueue, java.util.AbstractCollection, java.util.Collection
        public final /* bridge */ int size() {
            return m35532e();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/AssetTask;", "o1", "o2", "", C17296a.f69688o, "(Lco/bird/android/model/AssetTask;Lco/bird/android/model/AssetTask;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hu2$c */
    /* loaded from: classes4.dex */
    public static final class C22812c extends Lambda implements Function2<AssetTask, AssetTask, Integer> {

        /* renamed from: g */
        public static final C22812c f86131g = new C22812c();

        public C22812c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Integer invoke(AssetTask o1, AssetTask o2) {
            Intrinsics.checkNotNullParameter(o1, "o1");
            Intrinsics.checkNotNullParameter(o2, "o2");
            return Integer.valueOf(o1.getPriority().getLevel() - o2.getPriority().getLevel());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "tasks", "", "Lco/bird/android/model/AssetTask;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hu2$d */
    /* loaded from: classes4.dex */
    public static final class C22813d extends Lambda implements Function1<List<? extends AssetTask>, Unit> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/AssetTask;", "kotlin.jvm.PlatformType", "queuedTask", "", C17296a.f69688o, "(Lco/bird/android/model/AssetTask;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nLocalAssetDownloadServicePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalAssetDownloadServicePlugin.kt\nco/bird/android/manager/localasset/services/LocalAssetDownloadServicePlugin$onCreate$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,274:1\n1747#2,3:275\n*S KotlinDebug\n*F\n+ 1 LocalAssetDownloadServicePlugin.kt\nco/bird/android/manager/localasset/services/LocalAssetDownloadServicePlugin$onCreate$1$1\n*L\n80#1:275,3\n*E\n"})
        /* renamed from: hu2$d$a */
        /* loaded from: classes4.dex */
        public static final class C22814a extends Lambda implements Function1<AssetTask, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ List<AssetTask> f86133g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22814a(List<AssetTask> list) {
                super(1);
                this.f86133g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(AssetTask assetTask) {
                List<AssetTask> tasks = this.f86133g;
                Intrinsics.checkNotNullExpressionValue(tasks, "tasks");
                List<AssetTask> list = tasks;
                boolean z = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (Intrinsics.areEqual(assetTask.getAssetId(), ((AssetTask) it.next()).getAssetId())) {
                            z = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }

        public C22813d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends AssetTask> list) {
            invoke2((List<AssetTask>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<AssetTask> list) {
            CollectionsKt__MutableCollectionsKt.removeAll(C42401hu2.this.f86124n, new C22814a(list));
            C42401hu2.this.f86124n.addAll(list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/AssetTask;", "LHM4;", "Lokhttp3/ResponseBody;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLocalAssetDownloadServicePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalAssetDownloadServicePlugin.kt\nco/bird/android/manager/localasset/services/LocalAssetDownloadServicePlugin$onCreate$10\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,274:1\n237#2:275\n*S KotlinDebug\n*F\n+ 1 LocalAssetDownloadServicePlugin.kt\nco/bird/android/manager/localasset/services/LocalAssetDownloadServicePlugin$onCreate$10\n*L\n140#1:275\n*E\n"})
    /* renamed from: hu2$e */
    /* loaded from: classes4.dex */
    public static final class C22815e extends Lambda implements Function1<Pair<? extends AssetTask, ? extends HM4<ResponseBody>>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ ScopeProvider f86135h;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: hu2$e$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C22816a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

            /* renamed from: b */
            public static final C22816a f86136b = new C22816a();

            public C22816a() {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22815e(ScopeProvider scopeProvider) {
            super(1);
            this.f86135h = scopeProvider;
        }

        /* renamed from: c */
        public static final void m35527c() {
        }

        /* renamed from: d */
        public static final void m35526d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends AssetTask, ? extends HM4<ResponseBody>> pair) {
            invoke2((Pair<AssetTask, HM4<ResponseBody>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<AssetTask, HM4<ResponseBody>> pair) {
            List listOf;
            AssetTask component1 = pair.component1();
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{InterfaceC48923su2.C28429a.updateAssetData$default(C42401hu2.this.f86119i, component1.getAssetId(), null, 0L, null, component1.assetFile(C42401hu2.this.mo16756g()).getAbsolutePath(), null, DateTime.now(), null, 174, null), C42401hu2.this.f86119i.mo13530e(component1.getAssetId())});
            AbstractC23461c m33037r = AbstractC23461c.m33037r(listOf);
            Intrinsics.checkNotNullExpressionValue(m33037r, "concat(\n          listOf…Id)\n          )\n        )");
            Object m33041n = m33037r.m33041n(AutoDispose.m45239a(this.f86135h));
            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: ju2
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C42401hu2.C22815e.m35527c();
                }
            };
            final C22816a c22816a = C22816a.f86136b;
            ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: ku2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42401hu2.C22815e.m35526d(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hu2$f */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C22817f extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C22817f f86137b = new C22817f();

        public C22817f() {
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

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/AssetTask;", "LHM4;", "Lokhttp3/ResponseBody;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hu2$g */
    /* loaded from: classes4.dex */
    public static final class C22818g extends Lambda implements Function1<Pair<? extends AssetTask, ? extends HM4<ResponseBody>>, Unit> {
        public C22818g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends AssetTask, ? extends HM4<ResponseBody>> pair) {
            invoke2((Pair<AssetTask, HM4<ResponseBody>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<AssetTask, HM4<ResponseBody>> pair) {
            AssetTask task = pair.component1();
            HM4<ResponseBody> response = pair.component2();
            C42401hu2 c42401hu2 = C42401hu2.this;
            Intrinsics.checkNotNullExpressionValue(task, "task");
            Intrinsics.checkNotNullExpressionValue(response, "response");
            c42401hu2.m35549T(task, response);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hu2$h */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C22819h extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C22819h f86139b = new C22819h();

        public C22819h() {
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

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012,\u0010\u0002\u001a(\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/AssetTask;", "kotlin.jvm.PlatformType", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hu2$i */
    /* loaded from: classes4.dex */
    public static final class C22820i extends Lambda implements Function1<Pair<? extends Set<? extends AssetTask>, ? extends List<? extends AssetTask>>, Boolean> {

        /* renamed from: g */
        public static final C22820i f86140g = new C22820i();

        public C22820i() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<? extends Set<AssetTask>, ? extends List<AssetTask>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return Boolean.valueOf(pair.component1().size() < 5);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Set<? extends AssetTask>, ? extends List<? extends AssetTask>> pair) {
            return invoke2((Pair<? extends Set<AssetTask>, ? extends List<AssetTask>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012Z\u0010\u0002\u001aV\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0007 \u0006**\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0007\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "Lco/bird/android/model/AssetTask;", "kotlin.jvm.PlatformType", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nLocalAssetDownloadServicePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalAssetDownloadServicePlugin.kt\nco/bird/android/manager/localasset/services/LocalAssetDownloadServicePlugin$onCreate$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,274:1\n1#2:275\n*E\n"})
    /* renamed from: hu2$j */
    /* loaded from: classes4.dex */
    public static final class C22821j extends Lambda implements Function1<Pair<? extends Set<? extends AssetTask>, ? extends List<? extends AssetTask>>, Unit> {
        public C22821j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Set<? extends AssetTask>, ? extends List<? extends AssetTask>> pair) {
            invoke2((Pair<? extends Set<AssetTask>, ? extends List<AssetTask>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends Set<AssetTask>, ? extends List<AssetTask>> pair) {
            AssetTask assetTask;
            if (!(!C42401hu2.this.f86124n.isEmpty()) || (assetTask = (AssetTask) C42401hu2.this.f86124n.poll()) == null) {
                return;
            }
            C42401hu2.this.f86125o.onNext(assetTask);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hu2$k */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C22822k extends FunctionReferenceImpl implements Function1<AssetTask, AbstractC24507p<AssetTask>> {
        public C22822k(Object obj) {
            super(1, obj, C42401hu2.class, "maybeStartDownloadTask", "maybeStartDownloadTask(Lco/bird/android/model/AssetTask;)Lio/reactivex/Maybe;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC24507p<AssetTask> invoke(AssetTask p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((C42401hu2) this.receiver).m35565D(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hu2$l */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C22823l extends FunctionReferenceImpl implements Function1<AssetTask, Unit> {
        public C22823l(Object obj) {
            super(1, obj, C42401hu2.class, "addTaskToActiveTasks", "addTaskToActiveTasks(Lco/bird/android/model/AssetTask;)V", 0);
        }

        /* renamed from: a */
        public final void m35524a(AssetTask p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C42401hu2) this.receiver).m35566C(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AssetTask assetTask) {
            m35524a(assetTask);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/AssetTask;", "task", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/api/response/WireSignedUrl;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/model/AssetTask;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hu2$m */
    /* loaded from: classes4.dex */
    public static final class C22824m extends Lambda implements Function1<AssetTask, InterfaceC23447K<? extends Pair<? extends AssetTask, ? extends WireSignedUrl>>> {

        /* renamed from: h */
        public final /* synthetic */ ScopeProvider f86143h;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WireSignedUrl;", "kotlin.jvm.PlatformType", "assetResponse", "", "c", "(Lco/bird/api/response/WireSignedUrl;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nLocalAssetDownloadServicePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalAssetDownloadServicePlugin.kt\nco/bird/android/manager/localasset/services/LocalAssetDownloadServicePlugin$onCreate$6$1\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,274:1\n237#2:275\n*S KotlinDebug\n*F\n+ 1 LocalAssetDownloadServicePlugin.kt\nco/bird/android/manager/localasset/services/LocalAssetDownloadServicePlugin$onCreate$6$1\n*L\n114#1:275\n*E\n"})
        /* renamed from: hu2$m$a */
        /* loaded from: classes4.dex */
        public static final class C22825a extends Lambda implements Function1<WireSignedUrl, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42401hu2 f86144g;

            /* renamed from: h */
            public final /* synthetic */ AssetTask f86145h;

            /* renamed from: i */
            public final /* synthetic */ ScopeProvider f86146i;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: hu2$m$a$a */
            /* loaded from: classes4.dex */
            public /* synthetic */ class C22826a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

                /* renamed from: b */
                public static final C22826a f86147b = new C22826a();

                public C22826a() {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22825a(C42401hu2 c42401hu2, AssetTask assetTask, ScopeProvider scopeProvider) {
                super(1);
                this.f86144g = c42401hu2;
                this.f86145h = assetTask;
                this.f86146i = scopeProvider;
            }

            /* renamed from: d */
            public static final void m35515d() {
            }

            /* renamed from: e */
            public static final void m35514e(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            /* renamed from: c */
            public final void m35516c(WireSignedUrl wireSignedUrl) {
                WireAsset asset = wireSignedUrl.getAsset();
                if (asset == null) {
                    return;
                }
                Object m33041n = InterfaceC48923su2.C28429a.updateAssetData$default(this.f86144g.f86119i, this.f86145h.getAssetId(), this.f86145h.getManager(), asset.getFileSize(), asset.getMediaType(), null, asset.getCreatedBy(), null, null, 208, null).m33041n(AutoDispose.m45239a(this.f86146i));
                Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
                InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: ou2
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        C42401hu2.C22824m.C22825a.m35515d();
                    }
                };
                final C22826a c22826a = C22826a.f86147b;
                ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: pu2
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C42401hu2.C22824m.C22825a.m35514e(Function1.this, obj);
                    }
                });
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WireSignedUrl wireSignedUrl) {
                m35516c(wireSignedUrl);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: hu2$m$b */
        /* loaded from: classes4.dex */
        public static final class C22827b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42401hu2 f86148g;

            /* renamed from: h */
            public final /* synthetic */ AssetTask f86149h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22827b(C42401hu2 c42401hu2, AssetTask assetTask) {
                super(1);
                this.f86148g = c42401hu2;
                this.f86149h = assetTask;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable e) {
                C42401hu2 c42401hu2 = this.f86148g;
                Intrinsics.checkNotNullExpressionValue(e, "e");
                AssetTask task = this.f86149h;
                Intrinsics.checkNotNullExpressionValue(task, "task");
                c42401hu2.m35551R(e, task);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/WireSignedUrl;", "responses", "Lkotlin/Pair;", "Lco/bird/android/model/AssetTask;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/WireSignedUrl;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: hu2$m$c */
        /* loaded from: classes4.dex */
        public static final class C22828c extends Lambda implements Function1<WireSignedUrl, Pair<? extends AssetTask, ? extends WireSignedUrl>> {

            /* renamed from: g */
            public final /* synthetic */ AssetTask f86150g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22828c(AssetTask assetTask) {
                super(1);
                this.f86150g = assetTask;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<AssetTask, WireSignedUrl> invoke(WireSignedUrl responses) {
                Intrinsics.checkNotNullParameter(responses, "responses");
                return TuplesKt.m28425to(this.f86150g, responses);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22824m(ScopeProvider scopeProvider) {
            super(1);
            this.f86143h = scopeProvider;
        }

        /* renamed from: e */
        public static final void m35519e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final Pair invoke$lambda$2(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23447K<? extends Pair<AssetTask, WireSignedUrl>> invoke(AssetTask task) {
            Intrinsics.checkNotNullParameter(task, "task");
            AbstractC23442F m70883l = C38096ag5.m70883l(C42401hu2.this.f86119i.mo13531d(task));
            final C22825a c22825a = new C22825a(C42401hu2.this, task, this.f86143h);
            AbstractC23442F m33101w = m70883l.m33101w(new InterfaceC23484g() { // from class: lu2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42401hu2.C22824m.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C22827b c22827b = new C22827b(C42401hu2.this, task);
            AbstractC23442F m33106t = m33101w.m33106t(new InterfaceC23484g() { // from class: mu2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42401hu2.C22824m.m35519e(Function1.this, obj);
                }
            });
            final C22828c c22828c = new C22828c(task);
            return m33106t.m33157I(new InterfaceC23492o() { // from class: nu2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$2;
                    invoke$lambda$2 = C42401hu2.C22824m.invoke$lambda$2(Function1.this, obj);
                    return invoke$lambda$2;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0001H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "Lco/bird/android/model/AssetTask;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lco/bird/api/response/WireSignedUrl;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hu2$n */
    /* loaded from: classes4.dex */
    public static final class C22829n extends Lambda implements Function1<Pair<? extends AssetTask, ? extends WireSignedUrl>, Pair<? extends AssetTask, ? extends String>> {

        /* renamed from: g */
        public static final C22829n f86151g = new C22829n();

        public C22829n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Pair<? extends AssetTask, ? extends String> invoke(Pair<? extends AssetTask, ? extends WireSignedUrl> pair) {
            return invoke2((Pair<AssetTask, WireSignedUrl>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Pair<AssetTask, String> invoke2(Pair<AssetTask, WireSignedUrl> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return TuplesKt.m28425to(pair.component1(), pair.component2().getUrl());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001ar\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00000\u0000 \u0007*8\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/AssetTask;", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LHM4;", "Lokhttp3/ResponseBody;", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hu2$o */
    /* loaded from: classes4.dex */
    public static final class C22830o extends Lambda implements Function1<Pair<? extends AssetTask, ? extends String>, InterfaceC23447K<? extends Pair<? extends AssetTask, ? extends HM4<ResponseBody>>>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: hu2$o$a */
        /* loaded from: classes4.dex */
        public static final class C22831a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42401hu2 f86153g;

            /* renamed from: h */
            public final /* synthetic */ AssetTask f86154h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22831a(C42401hu2 c42401hu2, AssetTask assetTask) {
                super(1);
                this.f86153g = c42401hu2;
                this.f86154h = assetTask;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable e) {
                C42401hu2 c42401hu2 = this.f86153g;
                Intrinsics.checkNotNullExpressionValue(e, "e");
                AssetTask task = this.f86154h;
                Intrinsics.checkNotNullExpressionValue(task, "task");
                c42401hu2.m35551R(e, task);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0005*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "Lokhttp3/ResponseBody;", "response", "Lkotlin/Pair;", "Lco/bird/android/model/AssetTask;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: hu2$o$b */
        /* loaded from: classes4.dex */
        public static final class C22832b extends Lambda implements Function1<HM4<ResponseBody>, Pair<? extends AssetTask, ? extends HM4<ResponseBody>>> {

            /* renamed from: g */
            public final /* synthetic */ AssetTask f86155g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22832b(AssetTask assetTask) {
                super(1);
                this.f86155g = assetTask;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<AssetTask, HM4<ResponseBody>> invoke(HM4<ResponseBody> response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return TuplesKt.m28425to(this.f86155g, response);
            }
        }

        public C22830o() {
            super(1);
        }

        /* renamed from: d */
        public static final Pair m35509d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Pair<AssetTask, HM4<ResponseBody>>> invoke(Pair<AssetTask, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            AssetTask component1 = pair.component1();
            AbstractC23442F<HM4<ResponseBody>> mo13529f = C42401hu2.this.f86119i.mo13529f(pair.component2());
            final C22831a c22831a = new C22831a(C42401hu2.this, component1);
            AbstractC23442F<HM4<ResponseBody>> m33151O = mo13529f.m33106t(new InterfaceC23484g() { // from class: qu2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42401hu2.C22830o.invoke$lambda$0(Function1.this, obj);
                }
            }).m33151O(AbstractC23442F.m33153M());
            final C22832b c22832b = new C22832b(component1);
            return m33151O.m33157I(new InterfaceC23492o() { // from class: ru2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair m35509d;
                    m35509d = C42401hu2.C22830o.m35509d(Function1.this, obj);
                    return m35509d;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/AssetTask;", "LHM4;", "Lokhttp3/ResponseBody;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hu2$p */
    /* loaded from: classes4.dex */
    public static final class C22833p extends Lambda implements Function1<Pair<? extends AssetTask, ? extends HM4<ResponseBody>>, Unit> {
        public C22833p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends AssetTask, ? extends HM4<ResponseBody>> pair) {
            invoke2((Pair<AssetTask, HM4<ResponseBody>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<AssetTask, HM4<ResponseBody>> pair) {
            AssetTask task = pair.component1();
            C42401hu2 c42401hu2 = C42401hu2.this;
            Intrinsics.checkNotNullExpressionValue(task, "task");
            c42401hu2.m35550S(task);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u000526\u0010\u0004\u001a2\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lwb4;", "", "Lco/bird/android/model/AssetTask;", "", "<name for destructuring parameter 0>", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lwb4;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hu2$q */
    /* loaded from: classes4.dex */
    public static final class C22834q extends Lambda implements Function1<C51106wb4<? extends List<? extends AssetTask>, ? extends List<? extends AssetTask>, ? extends Set<? extends AssetTask>, ? extends Set<? extends AssetTask>>, Boolean> {

        /* renamed from: g */
        public static final C22834q f86157g = new C22834q();

        public C22834q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C51106wb4<? extends List<AssetTask>, ? extends List<AssetTask>, ? extends Set<AssetTask>, ? extends Set<AssetTask>> c51106wb4) {
            Intrinsics.checkNotNullParameter(c51106wb4, "<name for destructuring parameter 0>");
            List<AssetTask> m6613b = c51106wb4.m6613b();
            Set<AssetTask> m6612c = c51106wb4.m6612c();
            Set<AssetTask> m6611d = c51106wb4.m6611d();
            boolean z = true;
            if (!(!c51106wb4.m6614a().isEmpty()) && !(!m6613b.isEmpty()) && !(!m6612c.isEmpty()) && !(!m6611d.isEmpty())) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\u0007\u001a\u00028\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"T1", "T2", "T3", "T4", "t1", "t2", "t3", "t4", "Lwb4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$3\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: hu2$r */
    /* loaded from: classes4.dex */
    public static final class C22835r<T1, T2, T3, T4, R> implements InterfaceC23486i {

        /* renamed from: a */
        public static final C22835r<T1, T2, T3, T4, R> f86158a = new C22835r<>();

        @Override // io.reactivex.functions.InterfaceC23486i
        /* renamed from: a */
        public final C51106wb4<T1, T2, T3, T4> apply(T1 t1, T2 t2, T3 t3, T4 t4) {
            return new C51106wb4<>(t1, t2, t3, t4);
        }
    }

    public C42401hu2(Context context, Intent intent, InterfaceC48923su2 localAssetManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(localAssetManager, "localAssetManager");
        this.f86117g = context;
        this.f86118h = intent;
        this.f86119i = localAssetManager;
        this.f86120j = 1240;
        this.f86121k = 3;
        this.f86122l = "background_download_channel";
        this.f86123m = Executors.newSingleThreadExecutor();
        C22811b<AssetTask> c22811b = new C22811b<>(1, C22812c.f86131g);
        this.f86124n = c22811b;
        C24558d<AssetTask> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<AssetTask>()");
        this.f86125o = m31902e;
        C38074ae3<AssetTask> c38074ae3 = new C38074ae3<>();
        this.f86126p = c38074ae3;
        C38074ae3<AssetTask> c38074ae32 = new C38074ae3<>();
        this.f86127q = c38074ae32;
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(localAssetManager.mo13533b(), c22811b.m35533c(), c38074ae3.m70982e(), c38074ae32.m70982e(), C22835r.f86158a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…> Quad(t1, t2, t3, t4) })");
        final C22834q c22834q = C22834q.f86157g;
        Observable<Boolean> distinctUntilChanged = combineLatest.map(new InterfaceC23492o() { // from class: Xt2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m35548U;
                m35548U = C42401hu2.m35548U(Function1.this, obj);
                return m35548U;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "BirdObservables.combineL…  .distinctUntilChanged()");
        this.f86128r = distinctUntilChanged;
    }

    /* renamed from: E */
    public static final void m35564E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m35563F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m35562G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m35561H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m35560I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final boolean m35559J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: K */
    public static final void m35558K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final InterfaceC24574u m35557L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m35556M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final InterfaceC23447K m35555N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final Pair m35554O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final InterfaceC23447K m35553P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m35552Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final Boolean m35548U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public final void m35566C(AssetTask assetTask) {
        this.f86126p.add(assetTask);
    }

    /* renamed from: D */
    public final AbstractC24507p<AssetTask> m35565D(AssetTask assetTask) {
        AbstractC24507p m32024u;
        File assetFile = assetTask.assetFile(mo16756g());
        if (!this.f86126p.contains(assetTask) && (!assetFile.exists() || !new DateTime(assetFile.lastModified()).isAfter(assetTask.getDate()))) {
            m32024u = AbstractC24507p.m32068G(assetTask);
        } else {
            m32024u = AbstractC24507p.m32024u();
        }
        AbstractC24507p<AssetTask> m32066I = m32024u.m32066I(C24542a.m31933b(this.f86123m));
        Intrinsics.checkNotNullExpressionValue(m32066I, "if (activeTasks.contains…chedulers.from(executor))");
        return m32066I;
    }

    /* renamed from: R */
    public final void m35551R(Throwable th, AssetTask assetTask) {
        C41318g46.m40159e(th);
        m35550S(assetTask);
    }

    /* renamed from: S */
    public final void m35550S(AssetTask assetTask) {
        this.f86126p.remove(assetTask);
    }

    /* renamed from: T */
    public final void m35549T(AssetTask assetTask, HM4<ResponseBody> hm4) {
        InterfaceC50872wB5 m88279h;
        InterfaceC46046o30 source;
        InterfaceC46046o30 source2;
        this.f86127q.add(assetTask);
        File filesDir = mo16756g().getFilesDir();
        File file = new File(filesDir + "/assets");
        if (!file.mkdirs() && (!file.exists() || !file.isDirectory())) {
            throw new IOException("Invalid asset path: " + file);
        }
        File assetFile = assetTask.assetFile(mo16756g());
        if (assetFile.exists()) {
            FilesKt__UtilsKt.deleteRecursively(assetFile);
        }
        assetFile.createNewFile();
        m88279h = C35396Qe3.m88279h(assetFile, false, 1, null);
        InterfaceC45453n30 m91760c = C34928Oe3.m91760c(m88279h);
        ResponseBody m103944a = hm4.m103944a();
        if (m103944a != null && (source2 = m103944a.source()) != null) {
            m91760c.mo24532R2(source2);
        }
        m91760c.close();
        ResponseBody m103944a2 = hm4.m103944a();
        if (m103944a2 != null && (source = m103944a2.source()) != null) {
            source.close();
        }
        this.f86127q.remove(assetTask);
    }

    @Override // p000.AbstractC47767qx1
    /* renamed from: c */
    public String mo16760c() {
        return this.f86122l;
    }

    @Override // p000.AbstractC47767qx1
    /* renamed from: g */
    public Context mo16756g() {
        return this.f86117g;
    }

    @Override // p000.AbstractC47767qx1
    /* renamed from: h */
    public Intent mo16755h() {
        return this.f86118h;
    }

    @Override // p000.AbstractC47767qx1
    /* renamed from: i */
    public int mo16754i() {
        return this.f86120j;
    }

    @Override // p000.AbstractC47767qx1
    /* renamed from: j */
    public int mo16753j() {
        return this.f86121k;
    }

    @Override // p000.AbstractC47767qx1
    /* renamed from: l */
    public Observable<Boolean> mo16751l() {
        return this.f86128r;
    }

    @Override // p000.AbstractC47767qx1
    /* renamed from: n */
    public void mo16749n(ScopeProvider scopeProvider, boolean z) {
        Set<AssetTask> emptySet;
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        super.mo16749n(scopeProvider, z);
        Observable<List<AssetTask>> subscribeOn = this.f86119i.mo13533b().subscribeOn(C24542a.m31931d());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "localAssetManager.tasks\n…beOn(Schedulers.single())");
        Object m33094as = subscribeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22813d c22813d = new C22813d();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Tt2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42401hu2.m35564E(Function1.this, obj);
            }
        });
        C24523e c24523e = C24523e.f91168a;
        Observable<Set<AssetTask>> m70982e = this.f86126p.m70982e();
        emptySet = SetsKt__SetsKt.emptySet();
        Observable<Set<AssetTask>> startWith = m70982e.startWith((Observable<Set<AssetTask>>) emptySet);
        Intrinsics.checkNotNullExpressionValue(startWith, "activeTasks.observable.s…th(emptySet<AssetTask>())");
        Observable subscribeOn2 = c24523e.m31956a(startWith, this.f86124n.m35533c()).subscribeOn(C24542a.m31933b(this.f86123m));
        final C22820i c22820i = C22820i.f86140g;
        Observable filter = subscribeOn2.filter(new InterfaceC23494q() { // from class: bu2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m35559J;
                m35559J = C42401hu2.m35559J(Function1.this, obj);
                return m35559J;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "Observables.combineLates…_SIMULTANEOUS_DOWNLOADS }");
        Object m33094as2 = filter.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22821j c22821j = new C22821j();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: cu2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42401hu2.m35558K(Function1.this, obj);
            }
        });
        C24558d<AssetTask> c24558d = this.f86125o;
        final C22822k c22822k = new C22822k(this);
        Observable<R> flatMapMaybe = c24558d.flatMapMaybe(new InterfaceC23492o() { // from class: du2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m35557L;
                m35557L = C42401hu2.m35557L(Function1.this, obj);
                return m35557L;
            }
        });
        final C22823l c22823l = new C22823l(this);
        Observable doOnNext = flatMapMaybe.doOnNext(new InterfaceC23484g() { // from class: eu2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42401hu2.m35556M(Function1.this, obj);
            }
        });
        final C22824m c22824m = new C22824m(scopeProvider);
        Observable flatMapSingle = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: fu2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m35555N;
                m35555N = C42401hu2.m35555N(Function1.this, obj);
                return m35555N;
            }
        });
        final C22829n c22829n = C22829n.f86151g;
        Observable map = flatMapSingle.map(new InterfaceC23492o() { // from class: gu2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m35554O;
                m35554O = C42401hu2.m35554O(Function1.this, obj);
                return m35554O;
            }
        });
        final C22830o c22830o = new C22830o();
        Observable flatMapSingle2 = map.flatMapSingle(new InterfaceC23492o() { // from class: Ut2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m35553P;
                m35553P = C42401hu2.m35553P(Function1.this, obj);
                return m35553P;
            }
        });
        final C22833p c22833p = new C22833p();
        Observable observeOn = flatMapSingle2.doOnNext(new InterfaceC23484g() { // from class: Vt2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42401hu2.m35552Q(Function1.this, obj);
            }
        }).observeOn(C24542a.m31932c());
        final C22815e c22815e = new C22815e(scopeProvider);
        Observable doAfterNext = observeOn.doAfterNext(new InterfaceC23484g() { // from class: Wt2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42401hu2.m35563F(Function1.this, obj);
            }
        });
        final C22817f c22817f = C22817f.f86137b;
        Observable retry = doAfterNext.doOnError(new InterfaceC23484g() { // from class: Yt2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42401hu2.m35562G(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun onCreate(sc…sponse) }, Timber::e)\n  }");
        Object m33094as3 = retry.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22818g c22818g = new C22818g();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Zt2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42401hu2.m35561H(Function1.this, obj);
            }
        };
        final C22819h c22819h = C22819h.f86139b;
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: au2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42401hu2.m35560I(Function1.this, obj);
            }
        });
    }
}
