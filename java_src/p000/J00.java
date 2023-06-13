package p000;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J$\u0010\u0012\u001a\u00020\b*\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0002¨\u0006\u0015"}, m28432d2 = {"LJ00;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDraw", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "Landroid/graphics/drawable/Drawable;", "", "children", "f", "<init>", "()V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBountyFlightSheetDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyFlightSheetDecoration.kt\nco/bird/android/flightsheet/BountyFlightSheetDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,86:1\n1549#2:87\n1620#2,3:88\n1477#2:91\n1502#2,3:92\n1505#2,3:102\n766#2:105\n857#2,2:106\n1855#2,2:108\n2333#2,14:110\n1963#2,14:124\n361#3,7:95\n*S KotlinDebug\n*F\n+ 1 BountyFlightSheetDecoration.kt\nco/bird/android/flightsheet/BountyFlightSheetDecoration\n*L\n19#1:87\n19#1:88,3\n20#1:91\n20#1:92,3\n20#1:102,3\n37#1:105\n37#1:106,2\n38#1:108,2\n72#1:110,14\n76#1:124,14\n20#1:95,7\n*E\n"})
/* renamed from: J00 */
/* loaded from: classes3.dex */
public final class J00 extends RecyclerView.AbstractC11854o {
    /* renamed from: f */
    public final void m101401f(Drawable drawable, Canvas canvas, List<? extends View> list) {
        Object next;
        int m12001b = (int) C49347td3.m12001b(12);
        int m12001b2 = (int) C49347td3.m12001b(16);
        List<? extends View> list2 = list;
        Iterator<T> it = list2.iterator();
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
        int top3 = view.getTop() - m12001b;
        int width = canvas.getWidth() - m12001b2;
        Iterator<T> it2 = list2.iterator();
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
                drawable.setBounds(m12001b2, top3, width, bottom3 + m12001b);
            }
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C11872z state) {
        boolean z;
        float m12001b;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Integer m40591a = C41207ft4.m40591a(parent, view);
        if (m40591a != null) {
            int intValue = m40591a.intValue();
            RecyclerView.AbstractC11843h adapter = parent.getAdapter();
            if (adapter != null) {
                int itemViewType = adapter.getItemViewType(intValue);
                int i = 0;
                if (itemViewType == C37548Zj4.item_bounty_flight_sheet_section_text) {
                    outRect.top = (int) C49347td3.m12001b(16);
                } else {
                    int i2 = C37548Zj4.item_bounty_flight_sheet_section_vehicle_list;
                    if (itemViewType == i2) {
                        outRect.top = (int) C49347td3.m12001b(28);
                    } else if (itemViewType == C37548Zj4.item_vehicle_involved) {
                        RecyclerView.AbstractC11843h adapter2 = parent.getAdapter();
                        if (adapter2 != null && adapter2.getItemViewType(intValue - 1) == i2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            m12001b = C49347td3.m12001b(10);
                        } else {
                            m12001b = C49347td3.m12001b(8);
                        }
                        outRect.top = (int) m12001b;
                    } else if (itemViewType == C37548Zj4.item_bounty_flight_sheet_section_photo_header) {
                        outRect.top = (int) C49347td3.m12001b(40);
                    } else if (itemViewType == C37548Zj4.item_bounty_flight_sheet_photo) {
                        outRect.top = (int) C49347td3.m12001b(20);
                    }
                }
                RecyclerView.AbstractC11843h adapter3 = parent.getAdapter();
                if (adapter3 != null) {
                    i = adapter3.getItemCount();
                }
                if (intValue == i - 1) {
                    outRect.bottom = (int) C49347td3.m12001b(92);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.C11872z state) {
        IntRange until;
        int collectionSizeOrDefault;
        Map map;
        boolean z;
        boolean z2;
        String str;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Drawable m94299e = NA0.m94299e(parent.getContext(), C33309Hg4.frame_rectangle_border_only_gray);
        until = RangesKt___RangesKt.until(0, parent.getChildCount());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(parent.getChildAt(((IntIterator) it).nextInt()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean z3 = true;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            View child = (View) next;
            Intrinsics.checkNotNullExpressionValue(child, "child");
            Integer m40591a = C41207ft4.m40591a(parent, child);
            String str2 = null;
            if (m40591a != null) {
                int intValue = m40591a.intValue();
                RecyclerView.AbstractC11843h adapter = parent.getAdapter();
                if (adapter != null) {
                    int itemViewType = adapter.getItemViewType(intValue);
                    if (itemViewType == C37548Zj4.item_bounty_flight_sheet_section_vehicle_list || itemViewType == C37548Zj4.item_vehicle_involved) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        str = "vehicle";
                    } else {
                        if (itemViewType != C37548Zj4.item_bounty_flight_sheet_section_photo_header && itemViewType != C37548Zj4.item_bounty_flight_sheet_photo) {
                            z3 = false;
                        }
                        str = z3 ? "photo" : "photo";
                    }
                    str2 = str;
                }
            }
            Object obj = linkedHashMap.get(str2);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(str2, obj);
            }
            ((List) obj).add(next);
        }
        map = MapsKt__MapsKt.toMap(linkedHashMap);
        Set entrySet = map.entrySet();
        ArrayList<Map.Entry> arrayList2 = new ArrayList();
        for (Object obj2 : entrySet) {
            if (((String) ((Map.Entry) obj2).getKey()) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList2.add(obj2);
            }
        }
        for (Map.Entry entry : arrayList2) {
            List<? extends View> list = (List) entry.getValue();
            if (m94299e != null) {
                m101401f(m94299e, c, list);
            }
        }
    }
}
