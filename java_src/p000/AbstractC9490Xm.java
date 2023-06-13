package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.Area;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
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
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J$\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H'J\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\bH'J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH'J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0013\u001a\u00020\fH'J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u00102\u0006\u0010\u0003\u001a\u00020\u0002H'J\"\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\bH'J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0017\"\u00020\tH%¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0017\"\u00020\tH%¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\bH%J#\u0010!\u001a\u00020\u001c2\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0017\"\u00020\tH\u0017¢\u0006\u0004\b!\u0010\u001e¨\u0006$"}, m28432d2 = {"LXm;", "", "", "role", "Lio/reactivex/k;", "", "e", "offset", "", "Lco/bird/android/model/persistence/Area;", C17296a.f69688o, "retainedAreaIds", "Lio/reactivex/c;", "i", "Lorg/joda/time/DateTime;", "before", "Lio/reactivex/F;", "j", DateTokenConverter.CONVERTER_KEY, "c", "f", "ids", "b", "", "areas", "", "h", "([Lco/bird/android/model/persistence/Area;)Ljava/util/List;", "", "k", "([Lco/bird/android/model/persistence/Area;)V", "rowids", "g", "l", "<init>", "()V", "co.bird.android.lib.persistence.area.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Xm */
/* loaded from: classes4.dex */
public abstract class AbstractC9490Xm {

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "chunkedAreas", "", "Lco/bird/android/model/persistence/Area;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAreaDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaDao.kt\nco/bird/android/persistence/area/api/AreaDao$upsertAreas$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n37#2,2:69\n37#2,2:74\n819#3:71\n847#3,2:72\n*S KotlinDebug\n*F\n+ 1 AreaDao.kt\nco/bird/android/persistence/area/api/AreaDao$upsertAreas$1\n*L\n61#1:69,2\n64#1:74,2\n63#1:71\n63#1:72,2\n*E\n"})
    /* renamed from: Xm$a */
    /* loaded from: classes4.dex */
    public static final class C9491a extends Lambda implements Function1<List<? extends Area>, Unit> {
        public C9491a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Area> list) {
            invoke2((List<Area>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<Area> chunkedAreas) {
            Intrinsics.checkNotNullParameter(chunkedAreas, "chunkedAreas");
            AbstractC9490Xm abstractC9490Xm = AbstractC9490Xm.this;
            Area[] areaArr = (Area[]) chunkedAreas.toArray(new Area[0]);
            List<String> mo74306g = AbstractC9490Xm.this.mo74306g(abstractC9490Xm.mo74305h((Area[]) Arrays.copyOf(areaArr, areaArr.length)));
            ArrayList arrayList = new ArrayList();
            for (Object obj : chunkedAreas) {
                if (!mo74306g.contains(((Area) obj).getId())) {
                    arrayList.add(obj);
                }
            }
            AbstractC9490Xm abstractC9490Xm2 = AbstractC9490Xm.this;
            Area[] areaArr2 = (Area[]) arrayList.toArray(new Area[0]);
            abstractC9490Xm2.mo74302k((Area[]) Arrays.copyOf(areaArr2, areaArr2.length));
        }
    }

    /* renamed from: a */
    public abstract AbstractC24490k<List<Area>> mo74312a(String str, int i);

    /* renamed from: b */
    public abstract AbstractC23442F<List<Area>> mo74311b(List<String> list);

    /* renamed from: c */
    public abstract AbstractC23461c mo74310c();

    /* renamed from: d */
    public abstract AbstractC23461c mo74309d(String str);

    /* renamed from: e */
    public abstract AbstractC24490k<Integer> mo74308e(String str);

    /* renamed from: f */
    public abstract AbstractC23442F<List<String>> mo74307f(String str);

    /* renamed from: g */
    public abstract List<String> mo74306g(List<Long> list);

    /* renamed from: h */
    public abstract List<Long> mo74305h(Area... areaArr);

    /* renamed from: i */
    public abstract AbstractC23461c mo74304i(String str, List<String> list);

    /* renamed from: j */
    public abstract AbstractC23442F<Integer> mo74303j(String str, DateTime dateTime);

    /* renamed from: k */
    public abstract void mo74302k(Area... areaArr);

    /* renamed from: l */
    public void mo74301l(Area... areas) {
        List list;
        Intrinsics.checkNotNullParameter(areas, "areas");
        list = ArraysKt___ArraysKt.toList(areas);
        CollectionsKt___CollectionsKt.chunked(list, 999, new C9491a());
    }
}
