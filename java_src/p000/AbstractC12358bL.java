package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.update.BirdMapMarkerUpdate;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0006H'J\"\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H'J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H'J\u0016\u0010\u000f\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'J#\u0010\u0013\u001a\u00020\r2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\rH'J\u0016\u0010\u0017\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H'J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0010\"\u00020\u0004H%¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0010\"\u00020\u0004H%¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u0003H%J#\u0010!\u001a\u00020\u001c2\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0010\"\u00020\u0004H\u0017¢\u0006\u0004\b!\u0010\u001e¨\u0006$"}, m28432d2 = {"LbL;", "", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/Bird;", "h", "", "id", C17296a.f69688o, "ids", "Lio/reactivex/k;", "b", "bird", "Lio/reactivex/c;", "f", "g", "", "Lco/bird/android/model/persistence/update/BirdMapMarkerUpdate;", "markerUpdates", "k", "([Lco/bird/android/model/persistence/update/BirdMapMarkerUpdate;)Lio/reactivex/c;", "c", "birdIds", "i", "birds", "", "e", "([Lco/bird/android/model/persistence/Bird;)Ljava/util/List;", "", "j", "([Lco/bird/android/model/persistence/Bird;)V", "rowids", DateTokenConverter.CONVERTER_KEY, "l", "<init>", "()V", "co.bird.android.lib.persistence.bird.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bL */
/* loaded from: classes4.dex */
public abstract class AbstractC12358bL {

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "chunkedBirds", "", "Lco/bird/android/model/persistence/Bird;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nBirdDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdDao.kt\nco/bird/android/persistence/bird/api/BirdDao$upsertBird$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n37#2,2:77\n37#2,2:82\n819#3:79\n847#3,2:80\n*S KotlinDebug\n*F\n+ 1 BirdDao.kt\nco/bird/android/persistence/bird/api/BirdDao$upsertBird$1\n*L\n69#1:77,2\n72#1:82,2\n71#1:79\n71#1:80,2\n*E\n"})
    /* renamed from: bL$a */
    /* loaded from: classes4.dex */
    public static final class C12359a extends Lambda implements Function1<List<? extends Bird>, Unit> {
        public C12359a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Bird> list) {
            invoke2((List<Bird>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<Bird> chunkedBirds) {
            Intrinsics.checkNotNullParameter(chunkedBirds, "chunkedBirds");
            AbstractC12358bL abstractC12358bL = AbstractC12358bL.this;
            Bird[] birdArr = (Bird[]) chunkedBirds.toArray(new Bird[0]);
            List<String> mo61576d = AbstractC12358bL.this.mo61576d(abstractC12358bL.mo61575e((Bird[]) Arrays.copyOf(birdArr, birdArr.length)));
            ArrayList arrayList = new ArrayList();
            for (Object obj : chunkedBirds) {
                if (!mo61576d.contains(((Bird) obj).getId())) {
                    arrayList.add(obj);
                }
            }
            AbstractC12358bL abstractC12358bL2 = AbstractC12358bL.this;
            Bird[] birdArr2 = (Bird[]) arrayList.toArray(new Bird[0]);
            abstractC12358bL2.mo61570j((Bird[]) Arrays.copyOf(birdArr2, birdArr2.length));
        }
    }

    /* renamed from: a */
    public abstract Observable<Bird> mo61579a(String str);

    /* renamed from: b */
    public abstract AbstractC24490k<List<Bird>> mo61578b(List<String> list);

    /* renamed from: c */
    public abstract AbstractC23461c mo61577c();

    /* renamed from: d */
    public abstract List<String> mo61576d(List<Long> list);

    /* renamed from: e */
    public abstract List<Long> mo61575e(Bird... birdArr);

    /* renamed from: f */
    public abstract AbstractC23461c mo61574f(Bird bird);

    /* renamed from: g */
    public abstract AbstractC23461c mo61573g(List<Bird> list);

    /* renamed from: h */
    public abstract Observable<List<Bird>> mo61572h();

    /* renamed from: i */
    public abstract AbstractC23461c mo61571i(List<String> list);

    /* renamed from: j */
    public abstract void mo61570j(Bird... birdArr);

    /* renamed from: k */
    public abstract AbstractC23461c mo61569k(BirdMapMarkerUpdate... birdMapMarkerUpdateArr);

    /* renamed from: l */
    public void mo61568l(Bird... birds) {
        List list;
        Intrinsics.checkNotNullParameter(birds, "birds");
        list = ArraysKt___ArraysKt.toList(birds);
        CollectionsKt___CollectionsKt.chunked(list, 999, new C12359a());
    }
}
