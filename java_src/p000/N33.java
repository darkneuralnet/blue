package p000;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0010"}, m28432d2 = {"LN33;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "getItemOffsets", "<init>", "()V", "b", C17296a.f69688o, "nest-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestFlightSheetItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlightSheetItemDecoration.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetItemDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n223#2,2:108\n*S KotlinDebug\n*F\n+ 1 NestFlightSheetItemDecoration.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetItemDecoration\n*L\n33#1:108,2\n*E\n"})
/* renamed from: N33 */
/* loaded from: classes3.dex */
public final class N33 extends RecyclerView.AbstractC11854o {

    /* renamed from: b */
    public static final C5471a f24067b = new C5471a(null);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LN33$a;", "", "", "BIRDLE_ICON_SIZE_DP", "I", "<init>", "()V", "nest-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: N33$a */
    /* loaded from: classes3.dex */
    public static final class C5471a {
        public /* synthetic */ C5471a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C5471a() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C11872z state) {
        IntRange until;
        Object[] objArr;
        int i;
        int m12001b;
        int i2;
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
                if (itemViewType == C48223rj4.item_nest_flight_sheet_summary) {
                    outRect.top = (int) C49347td3.m12001b(20);
                } else {
                    Integer num = null;
                    if (itemViewType == C48223rj4.item_nest_flight_sheet_birdle_icon) {
                        RecyclerView.AbstractC11843h adapter2 = parent.getAdapter();
                        until = RangesKt___RangesKt.until(0, adapter2 != null ? adapter2.getItemCount() : 0);
                        Iterator<Integer> it = until.iterator();
                        while (it.hasNext()) {
                            int nextInt = ((IntIterator) it).nextInt();
                            RecyclerView.AbstractC11843h adapter3 = parent.getAdapter();
                            if (adapter3 == null || adapter3.getItemViewType(nextInt) != C48223rj4.item_nest_flight_sheet_birdle_icon) {
                                objArr = null;
                                continue;
                            } else {
                                objArr = 1;
                                continue;
                            }
                            if (objArr != null) {
                                RecyclerView.AbstractC11855p layoutManager = parent.getLayoutManager();
                                GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                                if (gridLayoutManager == null) {
                                    return;
                                }
                                int m66769o3 = gridLayoutManager.m66769o3();
                                outRect.top = (int) C49347td3.m12001b(intValue - nextInt < m66769o3 ? 12 : 6);
                                outRect.left = (int) ((((((parent.getMeasuredWidth() - m12001b) - ((int) C49347td3.m12001b(24))) - ((parent.getMeasuredWidth() * i2) / m66769o3)) - m12001b) * ((i % m66769o3) / (m66769o3 - 1))) + ((int) C49347td3.m12001b(24)));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    } else if (itemViewType == C48223rj4.item_nest_flight_sheet_status) {
                        outRect.top = (int) C49347td3.m12001b(12);
                        outRect.bottom = (int) C49347td3.m12001b(16);
                    } else if (itemViewType != C48223rj4.item_nest_flight_sheet_images) {
                        if (((itemViewType == C38728bk4.item_formatted_flight_sheet_detail_short || itemViewType == C38728bk4.item_formatted_flight_sheet_detail_long) ? 1 : null) != null) {
                            outRect.top = (int) C49347td3.m12001b(24);
                        } else if (itemViewType == C48223rj4.item_nest_flight_sheet_vehicle_header) {
                            outRect.top = (int) C49347td3.m12001b(40);
                        } else if (itemViewType == C48223rj4.item_nest_flight_sheet_vehicle) {
                            outRect.top = (int) C49347td3.m12001b(10);
                        } else {
                            int i3 = C48223rj4.item_nest_flight_sheet_button;
                            if (itemViewType == i3) {
                                RecyclerView.AbstractC11843h adapter4 = parent.getAdapter();
                                Integer valueOf = adapter4 != null ? Integer.valueOf(adapter4.getItemViewType(intValue - 1)) : null;
                                if (valueOf == null || valueOf.intValue() != i3) {
                                    outRect.top = (int) C49347td3.m12001b(16);
                                } else {
                                    outRect.top = (int) C49347td3.m12001b(12);
                                }
                                try {
                                    RecyclerView.AbstractC11843h adapter5 = parent.getAdapter();
                                    if (adapter5 != null) {
                                        num = Integer.valueOf(adapter5.getItemViewType(intValue + 1));
                                    }
                                } catch (IndexOutOfBoundsException unused) {
                                    num = -1;
                                }
                                int i4 = C48223rj4.item_nest_flight_sheet_button;
                                if (num == null || num.intValue() != i4) {
                                    outRect.bottom = (int) C49347td3.m12001b(16);
                                }
                            } else if (itemViewType == C48223rj4.item_nest_flight_sheet_allowed_vehicles) {
                                outRect.top = (int) C49347td3.m12001b(40);
                            }
                        }
                    }
                }
                RecyclerView.AbstractC11843h adapter6 = parent.getAdapter();
                if (intValue == (adapter6 != null ? adapter6.getItemCount() : 0) - 1) {
                    outRect.bottom += (int) C49347td3.m12001b(80);
                }
            }
        }
    }
}
