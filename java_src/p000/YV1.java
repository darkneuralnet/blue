package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"LYV1;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDrawOver", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/graphics/drawable/Drawable;", "divider", "", "I", "horizontalMargin", "<init>", "()V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdentificationSelectorItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationSelectorItemDecoration.kt\nco/bird/android/feature/identification/adapters/IdentificationSelectorItemDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n1549#2:91\n1620#2,3:92\n1855#2,2:95\n*S KotlinDebug\n*F\n+ 1 IdentificationSelectorItemDecoration.kt\nco/bird/android/feature/identification/adapters/IdentificationSelectorItemDecoration\n*L\n24#1:91\n24#1:92,3\n25#1:95,2\n*E\n"})
/* renamed from: YV1 */
/* loaded from: classes3.dex */
public final class YV1 extends RecyclerView.AbstractC11854o {

    /* renamed from: b */
    public Drawable f45940b;

    /* renamed from: c */
    public int f45941c;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C11872z state) {
        RecyclerView.AbstractC11843h adapter;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition != -1 && (adapter = parent.getAdapter()) != null) {
            int itemViewType = adapter.getItemViewType(childAdapterPosition);
            if (itemViewType == C42293hj4.item_selector_header) {
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "parent.context");
                outRect.top = (int) C49347td3.m12002a(16, context);
                Context context2 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
                outRect.bottom = (int) C49347td3.m12002a(8, context2);
            } else if (itemViewType == C42293hj4.item_debug_header || itemViewType == C42293hj4.item_debug) {
                Context context3 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "parent.context");
                outRect.top = (int) C49347td3.m12002a(16, context3);
                Context context4 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "parent.context");
                outRect.bottom = (int) C49347td3.m12002a(16, context4);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.C11872z state) {
        IntRange until;
        int collectionSizeOrDefault;
        Integer num;
        int roundToInt;
        int roundToInt2;
        int roundToInt3;
        int i;
        int i2;
        int roundToInt4;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f45940b == null) {
            this.f45940b = NA0.m94299e(parent.getContext(), C33309Hg4.divider_light_gray);
        }
        until = RangesKt___RangesKt.until(0, parent.getChildCount());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList<View> arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(parent.getChildAt(((IntIterator) it).nextInt()));
        }
        for (View view : arrayList) {
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (childAdapterPosition != -1) {
                RecyclerView.AbstractC11843h adapter = parent.getAdapter();
                if (adapter != null) {
                    num = Integer.valueOf(adapter.getItemViewType(childAdapterPosition));
                } else {
                    num = null;
                }
                int i6 = C42293hj4.item_selector;
                if (num == null || num.intValue() != i6) {
                    int i7 = C42293hj4.item_manual_entry_selector;
                    if (num == null || num.intValue() != i7) {
                        int i8 = C42293hj4.item_debug;
                        if (num == null || num.intValue() != i8) {
                            int i9 = C42293hj4.item_debug_header;
                            if ((num == null || num.intValue() != i9) && childAdapterPosition != 0) {
                                int i10 = C42293hj4.item_document_type;
                                if (num != null && num.intValue() == i10) {
                                    int i11 = this.f45941c;
                                    Context context = parent.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "parent.context");
                                    roundToInt = MathKt__MathJVMKt.roundToInt(C49347td3.m12002a(8, context));
                                    int i12 = i11 + roundToInt;
                                    int right = parent.getRight();
                                    Context context2 = parent.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
                                    roundToInt2 = MathKt__MathJVMKt.roundToInt(C49347td3.m12002a(8, context2));
                                    int i13 = right - roundToInt2;
                                    int bottom = view.getBottom();
                                    Context context3 = parent.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "parent.context");
                                    roundToInt3 = MathKt__MathJVMKt.roundToInt(C49347td3.m12002a(2, context3));
                                    int i14 = bottom + roundToInt3;
                                    Drawable drawable = this.f45940b;
                                    if (drawable != null) {
                                        i = drawable.getIntrinsicHeight();
                                    } else {
                                        i = 0;
                                    }
                                    int i15 = i14 - i;
                                    Drawable drawable2 = this.f45940b;
                                    if (drawable2 != null) {
                                        drawable2.setBounds(i12, i15, i13, i14);
                                    }
                                    Drawable drawable3 = this.f45940b;
                                    if (drawable3 != null) {
                                        drawable3.draw(c);
                                    }
                                }
                            }
                        }
                        int i16 = this.f45941c;
                        if (num != null && num.intValue() == i8) {
                            Context context4 = parent.getContext();
                            Intrinsics.checkNotNullExpressionValue(context4, "parent.context");
                            i2 = MathKt__MathJVMKt.roundToInt(C49347td3.m12002a(16, context4));
                        } else {
                            i2 = 0;
                        }
                        int i17 = i16 + i2;
                        int right2 = parent.getRight();
                        int bottom2 = view.getBottom();
                        Context context5 = parent.getContext();
                        Intrinsics.checkNotNullExpressionValue(context5, "parent.context");
                        roundToInt4 = MathKt__MathJVMKt.roundToInt(C49347td3.m12002a(16, context5));
                        int i18 = bottom2 + roundToInt4;
                        Drawable drawable4 = this.f45940b;
                        if (drawable4 != null) {
                            i3 = drawable4.getIntrinsicHeight();
                        } else {
                            i3 = 0;
                        }
                        int i19 = i18 - i3;
                        Drawable drawable5 = this.f45940b;
                        if (drawable5 != null) {
                            drawable5.setBounds(i17, i19, right2, i18);
                        }
                        Drawable drawable6 = this.f45940b;
                        if (drawable6 != null) {
                            drawable6.draw(c);
                        }
                    }
                }
                int i20 = this.f45941c;
                int right3 = parent.getRight();
                int bottom3 = view.getBottom();
                Drawable drawable7 = this.f45940b;
                if (drawable7 != null) {
                    i4 = drawable7.getIntrinsicHeight();
                } else {
                    i4 = 0;
                }
                int i21 = bottom3 - i4;
                Drawable drawable8 = this.f45940b;
                if (drawable8 != null) {
                    drawable8.setBounds(i20, i21, right3, bottom3);
                }
                Drawable drawable9 = this.f45940b;
                if (drawable9 != null) {
                    drawable9.draw(c);
                }
                int top = view.getTop();
                Drawable drawable10 = this.f45940b;
                if (drawable10 != null) {
                    i5 = drawable10.getIntrinsicHeight();
                } else {
                    i5 = 0;
                }
                int i22 = top - i5;
                Drawable drawable11 = this.f45940b;
                if (drawable11 != null) {
                    drawable11.setBounds(i20, i22, right3, top);
                }
                Drawable drawable12 = this.f45940b;
                if (drawable12 != null) {
                    drawable12.draw(c);
                }
            }
        }
    }
}
