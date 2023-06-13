package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.ColoredBackgroundable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0002*\u001dB\u0007¢\u0006\u0004\b(\u0010)J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0002H\u0002J&\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J&\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001eR\"\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020$0#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006+"}, m28432d2 = {"LHs1;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDraw", "onDrawOver", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "", "viewType", "position", "i", "child", "canvas", "h", "", "LHs1$b;", "views", "g", "f", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/graphics/drawable/Drawable;", "divider", "campaignDivider", DateTokenConverter.CONVERTER_KEY, "campaignBackground", "", "Landroid/graphics/drawable/ColorDrawable;", "e", "Ljava/util/Map;", "colorDrawables", "<init>", "()V", C17296a.f69688o, "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlightSheetItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetItemDecoration.kt\nco/bird/android/flightsheet/common/adapters/FlightSheetItemDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,230:1\n1549#2:231\n1620#2,3:232\n1569#2,11:235\n1864#2,2:246\n1866#2:249\n1580#2:250\n1855#2,2:251\n1855#2,2:253\n2333#2,14:255\n1963#2,14:269\n1855#2:283\n1856#2:291\n1045#2:300\n1789#2,2:301\n288#2,2:303\n1791#2:305\n1855#2:306\n2333#2,14:307\n1963#2,14:321\n1856#2:336\n1#3:248\n1#3:335\n361#4,7:284\n361#4,7:293\n215#5:292\n216#5:337\n*S KotlinDebug\n*F\n+ 1 FlightSheetItemDecoration.kt\nco/bird/android/flightsheet/common/adapters/FlightSheetItemDecoration\n*L\n36#1:231\n36#1:232,3\n37#1:235,11\n37#1:246,2\n37#1:249\n37#1:250\n52#1:251,2\n128#1:253,2\n136#1:255,14\n140#1:269,14\n157#1:283\n157#1:291\n173#1:300\n174#1:301,2\n181#1:303,2\n174#1:305\n194#1:306\n196#1:307,14\n201#1:321,14\n194#1:336\n37#1:248\n161#1:284,7\n169#1:293,7\n167#1:292\n167#1:337\n*E\n"})
/* renamed from: Hs1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C33414Hs1 extends RecyclerView.AbstractC11854o {

    /* renamed from: f */
    public static final C3239a f13976f = new C3239a(null);

    /* renamed from: g */
    public static final Set<Integer> f13977g;

    /* renamed from: b */
    public Drawable f13978b;

    /* renamed from: c */
    public Drawable f13979c;

    /* renamed from: d */
    public Drawable f13980d;

    /* renamed from: e */
    public Map<Integer, ColorDrawable> f13981e = new LinkedHashMap();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"LHs1$a;", "", "", "", "DIVIDER_LAYOUT_TYPES", "Ljava/util/Set;", "<init>", "()V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Hs1$a */
    /* loaded from: classes3.dex */
    public static final class C3239a {
        public /* synthetic */ C3239a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3239a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"LHs1$b;", "", "Landroid/view/View;", C17296a.f69688o, "", "b", "c", "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Landroid/view/View;", "getChild", "()Landroid/view/View;", "child", "I", "getAdapterPosition", "()I", "adapterPosition", "getViewType", "viewType", "<init>", "(Landroid/view/View;II)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Hs1$b */
    /* loaded from: classes3.dex */
    public static final class C3240b {

        /* renamed from: a */
        public final View f13982a;

        /* renamed from: b */
        public final int f13983b;

        /* renamed from: c */
        public final int f13984c;

        public C3240b(View child, int i, int i2) {
            Intrinsics.checkNotNullParameter(child, "child");
            this.f13982a = child;
            this.f13983b = i;
            this.f13984c = i2;
        }

        /* renamed from: a */
        public final View m103369a() {
            return this.f13982a;
        }

        /* renamed from: b */
        public final int m103368b() {
            return this.f13983b;
        }

        /* renamed from: c */
        public final int m103367c() {
            return this.f13984c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C3240b) {
                C3240b c3240b = (C3240b) obj;
                return Intrinsics.areEqual(this.f13982a, c3240b.f13982a) && this.f13983b == c3240b.f13983b && this.f13984c == c3240b.f13984c;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f13982a.hashCode() * 31) + Integer.hashCode(this.f13983b)) * 31) + Integer.hashCode(this.f13984c);
        }

        public String toString() {
            View view = this.f13982a;
            int i = this.f13983b;
            int i2 = this.f13984c;
            return "OnDrawData(child=" + view + ", adapterPosition=" + i + ", viewType=" + i2 + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 FlightSheetItemDecoration.kt\nco/bird/android/flightsheet/common/adapters/FlightSheetItemDecoration\n*L\n1#1,328:1\n173#2:329\n*E\n"})
    /* renamed from: Hs1$c */
    /* loaded from: classes3.dex */
    public static final class C3241c<T> implements Comparator {

        /* renamed from: b */
        public final /* synthetic */ RecyclerView f13985b;

        public C3241c(RecyclerView recyclerView) {
            this.f13985b = recyclerView;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(C41207ft4.m40591a(this.f13985b, (View) t), C41207ft4.m40591a(this.f13985b, (View) t2));
            return compareValues;
        }
    }

    static {
        Set<Integer> of;
        of = SetsKt__SetsKt.setOf((Object[]) new Integer[]{Integer.valueOf(C37548Zj4.item_labeled_detail), Integer.valueOf(C37548Zj4.item_labeled_rating), Integer.valueOf(C45268mk4.item_white_button_with_end_chevron), Integer.valueOf(C37548Zj4.item_last_ride_photo)});
        f13977g = of;
    }

    /* renamed from: f */
    public final void m103373f(Canvas canvas, RecyclerView recyclerView, List<C3240b> list) {
        AbstractC52206yS0 abstractC52206yS0;
        List<View> sortedWith;
        Object next;
        Object next2;
        boolean z;
        View view;
        int m12001b;
        List mutableListOf;
        Object obj;
        List mutableListOf2;
        Object last;
        boolean z2;
        Object obj2;
        Object obj3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        RecyclerView.AbstractC11843h adapter = recyclerView.getAdapter();
        if (adapter instanceof AbstractC52206yS0) {
            abstractC52206yS0 = (AbstractC52206yS0) adapter;
        } else {
            abstractC52206yS0 = null;
        }
        if (abstractC52206yS0 == null) {
            return;
        }
        for (C3240b c3240b : list) {
            View m103369a = c3240b.m103369a();
            C3023H6 m94543q = abstractC52206yS0.m94543q(c3240b.m103368b());
            C2637G6 m104409d = m94543q.m104409d();
            if (m104409d != null) {
                obj2 = m104409d.m105816c();
            } else {
                obj2 = null;
            }
            if (obj2 instanceof ColoredBackgroundable) {
                C2637G6 m104409d2 = m94543q.m104409d();
                if (m104409d2 != null) {
                    obj3 = m104409d2.m105816c();
                } else {
                    obj3 = null;
                }
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type co.bird.android.model.ColoredBackgroundable");
                ThemedColors backgroundColor = ((ColoredBackgroundable) obj3).getBackgroundColor();
                if (backgroundColor != null) {
                    Integer valueOf = Integer.valueOf(backgroundColor.getLightMode());
                    Object obj4 = linkedHashMap.get(valueOf);
                    if (obj4 == null) {
                        obj4 = new ArrayList();
                        linkedHashMap.put(valueOf, obj4);
                    }
                    ((List) obj4).add(m103369a);
                }
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            List list2 = (List) entry.getValue();
            Map<Integer, ColorDrawable> map = this.f13981e;
            Integer valueOf2 = Integer.valueOf(intValue);
            ColorDrawable colorDrawable = map.get(valueOf2);
            if (colorDrawable == null) {
                colorDrawable = new ColorDrawable(intValue);
                map.put(valueOf2, colorDrawable);
            }
            ColorDrawable colorDrawable2 = colorDrawable;
            sortedWith = CollectionsKt___CollectionsKt.sortedWith(list2, new C3241c(recyclerView));
            ArrayList<List> arrayList = new ArrayList();
            for (View view2 : sortedWith) {
                if (arrayList.isEmpty()) {
                    mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(view2);
                    arrayList.add(mutableListOf);
                } else {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            last = CollectionsKt___CollectionsKt.last((List<? extends Object>) obj);
                            Integer m40591a = C41207ft4.m40591a(recyclerView, (View) last);
                            Intrinsics.checkNotNull(m40591a);
                            int intValue2 = m40591a.intValue() + 1;
                            Integer m40591a2 = C41207ft4.m40591a(recyclerView, view2);
                            Intrinsics.checkNotNull(m40591a2);
                            if (intValue2 == m40591a2.intValue()) {
                                z2 = true;
                                continue;
                            } else {
                                z2 = false;
                                continue;
                            }
                            if (z2) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    List list3 = (List) obj;
                    if (list3 != null) {
                        list3.add(view2);
                    } else {
                        mutableListOf2 = CollectionsKt__CollectionsKt.mutableListOf(view2);
                        arrayList.add(mutableListOf2);
                    }
                }
            }
            for (List list4 : arrayList) {
                Iterator it2 = list4.iterator();
                if (!it2.hasNext()) {
                    next = null;
                } else {
                    next = it2.next();
                    if (it2.hasNext()) {
                        int top = ((View) next).getTop();
                        do {
                            Object next3 = it2.next();
                            int top2 = ((View) next3).getTop();
                            if (top > top2) {
                                next = next3;
                                top = top2;
                            }
                        } while (it2.hasNext());
                    }
                }
                View view3 = (View) next;
                if (view3 != null) {
                    float top3 = view3.getTop() + view3.getTranslationY();
                    int measuredWidth = recyclerView.getMeasuredWidth();
                    Iterator it3 = list4.iterator();
                    if (!it3.hasNext()) {
                        next2 = null;
                    } else {
                        next2 = it3.next();
                        if (it3.hasNext()) {
                            int bottom = ((View) next2).getBottom();
                            while (true) {
                                Object next4 = it3.next();
                                int bottom2 = ((View) next4).getBottom();
                                if (bottom < bottom2) {
                                    next2 = next4;
                                    bottom = bottom2;
                                }
                                if (!it3.hasNext()) {
                                    break;
                                }
                            }
                        }
                    }
                    View view4 = (View) next2;
                    if (view4 != null) {
                        Integer valueOf3 = Integer.valueOf(recyclerView.indexOfChild(view4) + 1);
                        if (valueOf3.intValue() < recyclerView.getChildCount()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            valueOf3 = null;
                        }
                        if (valueOf3 != null) {
                            view = recyclerView.getChildAt(valueOf3.intValue());
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            m12001b = view.getTop() - view4.getBottom();
                        } else {
                            m12001b = (int) C49347td3.m12001b(80);
                        }
                        colorDrawable2.setBounds(0, (int) top3, measuredWidth, (int) (view3.getTranslationY() + view4.getBottom() + m12001b));
                        colorDrawable2.draw(canvas);
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public final void m103372g(Canvas canvas, RecyclerView recyclerView, List<C3240b> list) {
        Object next;
        Drawable drawable = this.f13980d;
        if (drawable == null) {
            drawable = NA0.m94299e(recyclerView.getContext(), C45228mg4.campaign_background);
        }
        ArrayList arrayList = new ArrayList();
        for (C3240b c3240b : list) {
            View m103369a = c3240b.m103369a();
            if (c3240b.m103367c() == C37548Zj4.item_flight_sheet_campaign) {
                arrayList.add(m103369a);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        Object obj = null;
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int top = ((View) next).getTop();
                do {
                    Object next2 = it.next();
                    int top2 = ((View) next2).getTop();
                    if (top > top2) {
                        next = next2;
                        top = top2;
                    }
                } while (it.hasNext());
            }
        }
        View view = (View) next;
        if (view == null) {
            return;
        }
        int left = view.getLeft();
        float top3 = view.getTop() + view.getTranslationY();
        int right = view.getRight();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            obj = it2.next();
            if (it2.hasNext()) {
                int bottom = ((View) obj).getBottom();
                do {
                    Object next3 = it2.next();
                    int bottom2 = ((View) next3).getBottom();
                    if (bottom < bottom2) {
                        obj = next3;
                        bottom = bottom2;
                    }
                } while (it2.hasNext());
            }
        }
        View view2 = (View) obj;
        if (view2 != null) {
            int bottom3 = view2.getBottom();
            if (drawable != null) {
                drawable.setBounds(left, (int) top3, right, bottom3);
            }
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C11872z state) {
        RecyclerView.AbstractC11843h adapter;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition != -1 && (adapter = parent.getAdapter()) != null) {
            m103370i(outRect, adapter.getItemViewType(childAdapterPosition), childAdapterPosition, parent);
        }
    }

    /* renamed from: h */
    public final void m103371h(View view, Canvas canvas) {
        int i;
        Drawable drawable;
        if (this.f13979c == null) {
            Drawable drawable2 = this.f13978b;
            if (drawable2 != null && (drawable = drawable2.mutate()) != null) {
                C42529i71.m34432a(drawable, NA0.m94301c(view.getContext(), C32364Df4.secondaryBG));
            } else {
                drawable = null;
            }
            this.f13979c = drawable;
        }
        int left = view.getLeft() + ((int) C49347td3.m12001b(1));
        int bottom = view.getBottom() + ((int) view.getTranslationY());
        int right = view.getRight() - ((int) C49347td3.m12001b(1));
        Drawable drawable3 = this.f13978b;
        if (drawable3 != null) {
            i = drawable3.getIntrinsicHeight();
        } else {
            i = 0;
        }
        int i2 = i + bottom;
        Drawable drawable4 = this.f13978b;
        if (drawable4 != null) {
            drawable4.setBounds(left, bottom, right, i2);
        }
        Drawable drawable5 = this.f13978b;
        if (drawable5 != null) {
            drawable5.draw(canvas);
        }
    }

    /* renamed from: i */
    public void m103370i(Rect outRect, int i, int i2, RecyclerView parent) {
        boolean z;
        boolean contains;
        RecyclerView.AbstractC11843h adapter;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i3 = 0;
        if (i == C37548Zj4.item_flight_sheet_status) {
            outRect.top = (int) C49347td3.m12001b(12);
            outRect.bottom = (int) C49347td3.m12001b(16);
        } else if (i == C37548Zj4.item_alert) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "parent.context");
            outRect.top = (int) C49347td3.m12002a(8, context);
        } else {
            int i4 = C45268mk4.item_button_secondary;
            if (i == i4) {
                Context context2 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
                outRect.top = (int) C49347td3.m12002a(8, context2);
            } else if (i == C37548Zj4.item_collapsable_header) {
                RecyclerView.AbstractC11843h adapter2 = parent.getAdapter();
                if (adapter2 != null && adapter2.getItemViewType(i2 - 1) == i4) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Context context3 = parent.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "parent.context");
                    outRect.top = (int) C49347td3.m12002a(12, context3);
                }
            } else if (i == C37548Zj4.item_last_ride_photo) {
                Context context4 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "parent.context");
                outRect.top = (int) C49347td3.m12002a(8, context4);
            } else if (i == C45268mk4.item_white_button_with_end_chevron) {
                Context context5 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "parent.context");
                outRect.top = (int) C49347td3.m12002a(16, context5);
            }
        }
        RecyclerView.AbstractC11843h adapter3 = parent.getAdapter();
        if (adapter3 != null) {
            i3 = adapter3.getItemCount();
        }
        if (i2 == i3 - 1) {
            Context context6 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "parent.context");
            outRect.bottom = (int) C49347td3.m12002a(80, context6);
        }
        Integer num = null;
        if (i2 > 0 && (adapter = parent.getAdapter()) != null) {
            num = Integer.valueOf(adapter.getItemViewType(i2 - 1));
        }
        if (i == C45268mk4.item_button_secondary) {
            contains = CollectionsKt___CollectionsKt.contains(f13977g, num);
            if (contains) {
                Context context7 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "parent.context");
                outRect.top = (int) C49347td3.m12002a(32, context7);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.C11872z state) {
        IntRange until;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int i = 0;
        until = RangesKt___RangesKt.until(0, parent.getChildCount());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(parent.getChildAt(((IntIterator) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            View child = (View) obj;
            Intrinsics.checkNotNullExpressionValue(child, "child");
            Integer m40591a = C41207ft4.m40591a(parent, child);
            C3240b c3240b = null;
            if (m40591a != null) {
                int intValue = m40591a.intValue();
                RecyclerView.AbstractC11843h adapter = parent.getAdapter();
                if (adapter != null) {
                    c3240b = new C3240b(child, intValue, adapter.getItemViewType(intValue));
                }
            }
            if (c3240b != null) {
                arrayList2.add(c3240b);
            }
            i = i2;
        }
        m103372g(c, parent, arrayList2);
        m103373f(c, parent, arrayList2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.C11872z state) {
        IntRange until;
        RecyclerView.AbstractC11843h adapter;
        boolean z;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f13978b == null) {
            this.f13978b = NA0.m94299e(parent.getContext(), C33309Hg4.divider_light_gray);
        }
        until = RangesKt___RangesKt.until(0, parent.getChildCount());
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            View child = parent.getChildAt(((IntIterator) it).nextInt());
            int childAdapterPosition = parent.getChildAdapterPosition(child);
            if (childAdapterPosition != -1 && (adapter = parent.getAdapter()) != null) {
                int itemViewType = adapter.getItemViewType(childAdapterPosition);
                int i = C37548Zj4.item_flight_sheet_campaign;
                if (itemViewType == i) {
                    RecyclerView.AbstractC11843h adapter2 = parent.getAdapter();
                    if (adapter2 != null && adapter2.getItemViewType(childAdapterPosition + 1) == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        Intrinsics.checkNotNullExpressionValue(child, "child");
                        m103371h(child, c);
                    }
                }
            }
        }
    }
}
