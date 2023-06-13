package p000;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.VehicleScrapRequest;
import co.bird.android.model.constant.ScrapRequestReason;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J@\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00060\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u0010\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0016\u0010\u0011\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u001a\u0010\u0012\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\n\u001a\u00020\tH\u0002R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015¨\u0006\u001a"}, m28432d2 = {"Ltn5;", "Lrn5;", "Lco/bird/android/model/constant/ScrapRequestReason;", "selectedReason", "", "details", "", "Landroid/net/Uri;", "photos", "Lco/bird/android/model/VehicleScrapRequest;", "scrapRequest", "Lio/reactivex/F;", "LH6;", C17296a.f69688o, "", "enabled", "f", "e", DateTokenConverter.CONVERTER_KEY, "g", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "b", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrapConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapConverter.kt\nco/bird/android/feature/scrap/adapters/ScrapConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,129:1\n1603#2,9:130\n1855#2:139\n1856#2:141\n1612#2:142\n1549#2:144\n1620#2,3:145\n1#3:140\n1#3:143\n37#4,2:148\n*S KotlinDebug\n*F\n+ 1 ScrapConverter.kt\nco/bird/android/feature/scrap/adapters/ScrapConverterImpl\n*L\n55#1:130,9\n55#1:139\n55#1:141\n55#1:142\n106#1:144\n106#1:145,3\n55#1:140\n46#1:148,2\n*E\n"})
/* renamed from: tn5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49449tn5 implements InterfaceC48264rn5 {

    /* renamed from: b */
    public static final C28819a f111013b = new C28819a(null);

    /* renamed from: c */
    public static final List<ScrapRequestReason> f111014c;

    /* renamed from: d */
    public static final SimpleDateFormat f111015d;

    /* renamed from: a */
    public final Context f111016a;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"Ltn5$a;", "", "Ljava/text/SimpleDateFormat;", "DATE_FORMATTER", "Ljava/text/SimpleDateFormat;", "", "Lco/bird/android/model/constant/ScrapRequestReason;", "SELECTABLE_REASONS", "Ljava/util/List;", "<init>", "()V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: tn5$a */
    /* loaded from: classes3.dex */
    public static final class C28819a {
        public /* synthetic */ C28819a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C28819a() {
        }
    }

    static {
        List<ScrapRequestReason> listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new ScrapRequestReason[]{ScrapRequestReason.SUBMERGED, ScrapRequestReason.THERMAL_EVENT, ScrapRequestReason.CHASSIS_DAMAGE, ScrapRequestReason.GRAFFITI, ScrapRequestReason.MISSING_BATTERY});
        f111014c = listOf;
        f111015d = new SimpleDateFormat("MMM. dd, yyyy", Locale.getDefault());
    }

    public C49449tn5(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f111016a = context;
    }

    /* renamed from: c */
    public static final List m11776c(C49449tn5 this$0, ScrapRequestReason scrapRequestReason, List photos, String str, VehicleScrapRequest vehicleScrapRequest) {
        List<C3023H6> emptyList;
        List listOf;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(photos, "$photos");
        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
        spreadBuilder.add(this$0.m11773f(scrapRequestReason, true));
        spreadBuilder.add(this$0.m11774e(photos));
        spreadBuilder.add(this$0.m11775d(str, true));
        if (vehicleScrapRequest == null || (emptyList = this$0.m11772g(vehicleScrapRequest)) == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        spreadBuilder.addSpread(emptyList.toArray(new C3023H6[0]));
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new C3023H6[spreadBuilder.size()]));
        return listOf;
    }

    @Override // p000.InterfaceC48264rn5
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo11778a(final ScrapRequestReason scrapRequestReason, final String str, final List<? extends Uri> photos, final VehicleScrapRequest vehicleScrapRequest) {
        Intrinsics.checkNotNullParameter(photos, "photos");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: sn5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m11776c;
                m11776c = C49449tn5.m11776c(C49449tn5.this, scrapRequestReason, photos, str, vehicleScrapRequest);
                return m11776c;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      lis…Schedulers.computation())");
        return m33142Y;
    }

    /* renamed from: d */
    public final C3023H6 m11775d(String str, boolean z) {
        List mutableListOf;
        C2637G6 c2637g6 = new C2637G6(this.f111016a.getString(C45871nl4.scrap_header_details), C34272Lj4.item_scrap_header, false, 4, null);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(TuplesKt.m28425to(str, Boolean.valueOf(z)), C34272Lj4.item_scrap_details, false, 4, null));
        return new C3023H6(mutableListOf, c2637g6, null, 4, null);
    }

    /* renamed from: e */
    public final C3023H6 m11774e(List<? extends Uri> list) {
        List mutableListOf;
        C2637G6 c2637g6 = new C2637G6(this.f111016a.getString(C45871nl4.scrap_header_photo), C34272Lj4.item_scrap_header, false, 4, null);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(list, C34272Lj4.item_scrap_image_upload_bar, false, 4, null));
        return new C3023H6(mutableListOf, c2637g6, null, 4, null);
    }

    /* renamed from: f */
    public final C3023H6 m11773f(ScrapRequestReason scrapRequestReason, boolean z) {
        List mutableList;
        String m9767a;
        boolean z2;
        C2637G6 c2637g6;
        C2637G6 c2637g62 = new C2637G6(this.f111016a.getString(C45871nl4.scrap_header_reason), C34272Lj4.item_scrap_header, false, 4, null);
        ArrayList arrayList = new ArrayList();
        for (ScrapRequestReason scrapRequestReason2 : f111014c) {
            m9767a = C50042un5.m9767a(scrapRequestReason2, this.f111016a);
            if (m9767a == null) {
                c2637g6 = null;
            } else {
                if (scrapRequestReason2 == scrapRequestReason) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c2637g6 = new C2637G6(new C33391Hp5(scrapRequestReason2, m9767a, z2, z), C34272Lj4.item_scrap_reason, false, 4, null);
            }
            if (c2637g6 != null) {
                arrayList.add(c2637g6);
            }
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, c2637g62, null, 4, null);
    }

    /* renamed from: g */
    public final List<C3023H6> m11772g(VehicleScrapRequest vehicleScrapRequest) {
        String str;
        List mutableListOf;
        List mutableListOf2;
        int collectionSizeOrDefault;
        List mutableList;
        List listOfNotNull;
        List<C3023H6> mutableList2;
        Date date;
        SimpleDateFormat simpleDateFormat = f111015d;
        String format = simpleDateFormat.format(vehicleScrapRequest.getCreatedAt().toDate());
        DateTime reviewedAt = vehicleScrapRequest.getReviewedAt();
        if (reviewedAt != null && (date = reviewedAt.toDate()) != null) {
            str = simpleDateFormat.format(date);
        } else {
            str = null;
        }
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new C33157Gp5(vehicleScrapRequest.getRejectionReason(), vehicleScrapRequest.getRejectionReasonMessage(), str), C45268mk4.item_scrap_rejection, false, 4, null));
        C3023H6 c3023h6 = new C3023H6(mutableListOf, null, null, 6, null);
        mutableListOf2 = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(this.f111016a.getString(C45871nl4.scrap_rejection_date_format, format), C34272Lj4.item_scrap_submitted_date, false, 4, null));
        C3023H6 c3023h62 = new C3023H6(mutableListOf2, null, null, 6, null);
        C3023H6 m11773f = m11773f(vehicleScrapRequest.getRequestReason(), false);
        List<String> imageAssetIds = vehicleScrapRequest.getImageAssetIds();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(imageAssetIds, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (String str2 : imageAssetIds) {
            arrayList.add(new C2637G6(str2, C34272Lj4.item_scrap_request_photo, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new C3023H6[]{c3023h6, c3023h62, m11773f, new C3023H6(mutableList, new C2637G6(this.f111016a.getString(C45871nl4.scrap_header_photo), C34272Lj4.item_scrap_header, false, 4, null), null, 4, null), m11775d(vehicleScrapRequest.getRequestDetails(), false)});
        mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) listOfNotNull);
        return mutableList2;
    }
}
