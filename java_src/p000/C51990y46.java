package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.ServiceCenterRouteStationStatus;
import co.bird.android.model.wire.WireHydratedStation;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\u0013"}, m28432d2 = {"Ly46;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDraw", "Landroid/graphics/Paint;", "b", "Landroid/graphics/Paint;", "blackPaint", "greyPaint", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTimelineItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimelineItemDecoration.kt\nco/bird/android/feature/commandcenter/timeline/adapters/TimelineItemDecoration\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n*L\n1#1,127:1\n1#2:128\n9#3,4:129\n9#3,4:143\n1549#4:133\n1620#4,3:134\n1549#4:137\n1620#4,3:138\n288#4:141\n289#4:147\n1549#4:148\n1620#4,3:149\n288#4,2:152\n288#4,2:154\n18#5:142\n*S KotlinDebug\n*F\n+ 1 TimelineItemDecoration.kt\nco/bird/android/feature/commandcenter/timeline/adapters/TimelineItemDecoration\n*L\n45#1:129,4\n67#1:143,4\n57#1:133\n57#1:134,3\n61#1:137\n61#1:138,3\n64#1:141\n64#1:147\n72#1:148\n72#1:149,3\n73#1:152,2\n48#1:154,2\n67#1:142\n*E\n"})
/* renamed from: y46  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51990y46 extends RecyclerView.AbstractC11854o {

    /* renamed from: d */
    public static final C30415a f118714d = new C30415a(null);

    /* renamed from: e */
    public static final Set<Integer> f118715e;

    /* renamed from: b */
    public Paint f118716b;

    /* renamed from: c */
    public Paint f118717c;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, m28432d2 = {"Ly46$a;", "", "", "IMAGE_INTERNAL_VERTICAL_PADDING_DP", "I", "LEFT_LINE_MARGIN_DP", "LINE_WIDTH_DP", "", "TIMELINE_LAYOUT_IDS", "Ljava/util/Set;", "<init>", "()V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: y46$a */
    /* loaded from: classes3.dex */
    public static final class C30415a {
        public /* synthetic */ C30415a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C30415a() {
        }
    }

    static {
        Set<Integer> of;
        of = SetsKt__SetsKt.setOf((Object[]) new Integer[]{Integer.valueOf(C36369Ui4.item_timeline_route), Integer.valueOf(C36369Ui4.item_timeline_station)});
        f118715e = of;
    }

    /* renamed from: f */
    public static final View m4175f(Iterable<? extends View> iterable, RecyclerView recyclerView, AbstractC5440My<?> abstractC5440My) {
        View view;
        boolean z;
        Iterator<? extends View> it = iterable.iterator();
        while (true) {
            if (it.hasNext()) {
                view = it.next();
                Integer m40591a = C41207ft4.m40591a(recyclerView, view);
                if (m40591a != null) {
                    z = f118715e.contains(Integer.valueOf(abstractC5440My.getItemViewType(m40591a.intValue())));
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                view = null;
                break;
            }
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x012b A[LOOP:2: B:30:0x00ee->B:48:0x012b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012f A[EDGE_INSN: B:93:0x012f->B:50:0x012f ?: BREAK  , SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.C11872z state) {
        IntRange until;
        int collectionSizeOrDefault;
        IntProgression downTo;
        int collectionSizeOrDefault2;
        IntProgression downTo2;
        Integer num;
        IntRange until2;
        int collectionSizeOrDefault3;
        Object obj;
        float bottom;
        float bottom2;
        float top;
        boolean z;
        ServiceCenterRouteStationStatus status;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Paint paint = this.f118716b;
        if (paint == null) {
            paint = new Paint();
            paint.setColor(NA0.m94301c(parent.getContext(), C32364Df4.birdNewRoad));
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "parent.context");
            paint.setStrokeWidth(C49347td3.m12002a(2, context));
            this.f118716b = paint;
        }
        Paint paint2 = paint;
        Paint paint3 = this.f118717c;
        if (paint3 == null) {
            paint3 = new Paint();
            paint3.setColor(NA0.m94301c(parent.getContext(), C32364Df4.secondaryBG));
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
            paint3.setStrokeWidth(C49347td3.m12002a(2, context2));
            this.f118717c = paint3;
        }
        RecyclerView.AbstractC11843h adapter = parent.getAdapter();
        if (!(adapter instanceof AbstractC5440My)) {
            adapter = null;
        }
        AbstractC5440My abstractC5440My = (AbstractC5440My) adapter;
        if (abstractC5440My == null) {
            return;
        }
        until = RangesKt___RangesKt.until(0, parent.getChildCount());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(parent.getChildAt(((IntIterator) it).nextInt()));
        }
        View m4175f = m4175f(arrayList, parent, abstractC5440My);
        if (m4175f == null) {
            return;
        }
        downTo = RangesKt___RangesKt.downTo(parent.getChildCount() - 1, 0);
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(downTo, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        Iterator<Integer> it2 = downTo.iterator();
        while (it2.hasNext()) {
            arrayList2.add(parent.getChildAt(((IntIterator) it2).nextInt()));
        }
        View m4175f2 = m4175f(arrayList2, parent, abstractC5440My);
        if (m4175f2 == null) {
            return;
        }
        downTo2 = RangesKt___RangesKt.downTo(abstractC5440My.getItemCount() - 1, 0);
        Iterator<Integer> it3 = downTo2.iterator();
        while (true) {
            if (it3.hasNext()) {
                num = it3.next();
                int intValue = num.intValue();
                if (abstractC5440My.getItemViewType(intValue) == C36369Ui4.item_timeline_station) {
                    Object m105816c = abstractC5440My.m94544p(intValue).m105816c();
                    if (!(m105816c instanceof WireHydratedStation)) {
                        m105816c = null;
                    }
                    WireHydratedStation wireHydratedStation = (WireHydratedStation) m105816c;
                    if (wireHydratedStation != null && (status = wireHydratedStation.getStatus()) != null && status.isCompletedStatus()) {
                        z = true;
                        if (!z) {
                            break;
                        }
                    }
                }
                z = false;
                if (!z) {
                }
            } else {
                num = null;
                break;
            }
        }
        Integer num2 = num;
        until2 = RangesKt___RangesKt.until(0, parent.getChildCount());
        collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(until2, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault3);
        Iterator<Integer> it4 = until2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(parent.getChildAt(((IntIterator) it4).nextInt()));
        }
        Iterator it5 = arrayList3.iterator();
        while (true) {
            if (it5.hasNext()) {
                Object next = it5.next();
                View child = (View) next;
                Intrinsics.checkNotNullExpressionValue(child, "child");
                if (Intrinsics.areEqual(C41207ft4.m40591a(parent, child), num2)) {
                    obj = next;
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        View view = (View) obj;
        Integer m40591a = C41207ft4.m40591a(parent, m4175f);
        if (m40591a != null) {
            int intValue2 = m40591a.intValue();
            if (intValue2 != 0 && f118715e.contains(Integer.valueOf(abstractC5440My.getItemViewType(intValue2 - 1)))) {
                bottom = parent.getTop();
            } else {
                Context context3 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "parent.context");
                bottom = (((ImageView) m4175f.findViewById(C42273hh4.icon)).getBottom() + m4175f.getTop()) - C49347td3.m12002a(7, context3);
            }
            float f = bottom;
            if (view != null) {
                ImageView imageView = (ImageView) view.findViewById(C42273hh4.icon);
                if (imageView == null) {
                    imageView = (ImageView) view.findViewById(C42273hh4.arrow);
                }
                Context context4 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "parent.context");
                bottom2 = imageView.getTop() + view.getTop() + C49347td3.m12002a(7, context4);
            } else {
                bottom2 = parent.getBottom();
            }
            float f2 = bottom2;
            Integer m40591a2 = C41207ft4.m40591a(parent, m4175f2);
            if (m40591a2 != null) {
                int intValue3 = m40591a2.intValue();
                if (intValue3 != abstractC5440My.getItemCount() - 1 && f118715e.contains(Integer.valueOf(abstractC5440My.getItemViewType(intValue3 + 1)))) {
                    top = parent.getBottom();
                } else {
                    ImageView imageView2 = (ImageView) m4175f2.findViewById(C42273hh4.icon);
                    if (imageView2 == null) {
                        imageView2 = (ImageView) m4175f2.findViewById(C42273hh4.arrow);
                    }
                    Context context5 = parent.getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "parent.context");
                    top = imageView2.getTop() + m4175f2.getTop() + C49347td3.m12002a(7, context5);
                }
                Context context6 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "parent.context");
                float m12002a = C49347td3.m12002a(28, context6);
                Context context7 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "parent.context");
                c.drawLine(m12002a, f, C49347td3.m12002a(28, context7), f2, paint2);
                Context context8 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "parent.context");
                float m12002a2 = C49347td3.m12002a(28, context8);
                Context context9 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context9, "parent.context");
                c.drawLine(m12002a2, f2, C49347td3.m12002a(28, context9), top, paint3);
            }
        }
    }
}
