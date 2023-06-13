package p000;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import p000.PQ5;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, m28432d2 = {"Lam2;", "LPQ5;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDrawOver", "o", "l", "m", "Landroid/widget/FrameLayout;", "frameLayout", "n", "LQQ5;", DateTokenConverter.CONVERTER_KEY, "LQQ5;", "provider", "e", "Landroid/widget/FrameLayout;", "LPQ5$a;", "f", "LPQ5$a;", "footerViewHolder", "Landroid/graphics/drawable/Drawable;", "g", "Landroid/graphics/drawable/Drawable;", "divider", "<init>", "(LQQ5;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLandingItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingItemDecoration.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingItemDecoration\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,226:1\n1#2:227\n288#3,2:228\n1549#3:230\n1620#3,3:231\n1855#3,2:234\n*S KotlinDebug\n*F\n+ 1 LandingItemDecoration.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingItemDecoration\n*L\n97#1:228,2\n145#1:230\n145#1:231,3\n146#1:234,2\n*E\n"})
/* renamed from: am2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38153am2 extends PQ5 {

    /* renamed from: d */
    public final QQ5 f51203d;

    /* renamed from: e */
    public FrameLayout f51204e;

    /* renamed from: f */
    public PQ5.C6353a f51205f;

    /* renamed from: g */
    public Drawable f51206g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38153am2(QQ5 provider) {
        super(provider);
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f51203d = provider;
    }

    /* renamed from: l */
    public final void m70770l(Canvas canvas, RecyclerView recyclerView) {
        IntRange until;
        int collectionSizeOrDefault;
        Drawable drawable = this.f51206g;
        if (drawable == null) {
            drawable = NA0.m94299e(recyclerView.getContext(), C33309Hg4.divider_light_gray);
            this.f51206g = drawable;
            if (drawable == null) {
                return;
            }
        }
        until = RangesKt___RangesKt.until(0, recyclerView.getChildCount());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList<View> arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(recyclerView.getChildAt(((IntIterator) it).nextInt()));
        }
        for (View view : arrayList) {
            int itemViewType = recyclerView.getChildViewHolder(view).getItemViewType();
            if (itemViewType == C35442Qj4.item_order_item_header) {
                int top = view.getTop() + ((int) view.getTranslationY());
                drawable.setBounds(0, top - drawable.getIntrinsicHeight(), recyclerView.getWidth(), top);
                drawable.draw(canvas);
            } else if (itemViewType == C35442Qj4.item_order_item_date_subheader) {
                int bottom = view.getBottom() + ((int) view.getTranslationY());
                drawable.setBounds(0, bottom, recyclerView.getWidth(), drawable.getIntrinsicHeight() + bottom);
                drawable.draw(canvas);
            }
        }
    }

    /* renamed from: m */
    public final void m70769m(Canvas canvas) {
        View m90306a;
        int i;
        int i2;
        PQ5.C6353a c6353a = this.f51205f;
        if (c6353a != null && (m90306a = c6353a.m90306a()) != null) {
            C49520tu6.show$default(m90306a, true, 0, 2, null);
            float bottom = m90306a.getBottom();
            Drawable drawable = this.f51206g;
            if (drawable != null) {
                i = drawable.getIntrinsicHeight();
            } else {
                i = 0;
            }
            m90306a.setTranslationY(bottom + i);
            int top = m90306a.getTop() + ((int) m90306a.getTranslationY());
            Drawable drawable2 = this.f51206g;
            if (drawable2 != null) {
                i2 = drawable2.getIntrinsicHeight();
            } else {
                i2 = 0;
            }
            int i3 = top - i2;
            int width = m90306a.getWidth();
            Drawable drawable3 = this.f51206g;
            if (drawable3 != null) {
                drawable3.setBounds(0, i3, width, top);
            }
            Drawable drawable4 = this.f51206g;
            if (drawable4 != null) {
                drawable4.draw(canvas);
            }
        }
    }

    /* renamed from: n */
    public final void m70768n(FrameLayout frameLayout, Canvas canvas) {
        View m90306a;
        int i;
        PQ5.C6353a c6353a = this.f51205f;
        if (c6353a != null && (m90306a = c6353a.m90306a()) != null) {
            C49520tu6.show$default(m90306a, true, 0, 2, null);
            m90306a.setTranslationY(frameLayout.getHeight() - m90306a.getHeight());
            int top = m90306a.getTop() + ((int) m90306a.getTranslationY());
            Drawable drawable = this.f51206g;
            if (drawable != null) {
                i = drawable.getIntrinsicHeight();
            } else {
                i = 0;
            }
            int i2 = top - i;
            int width = m90306a.getWidth();
            Drawable drawable2 = this.f51206g;
            if (drawable2 != null) {
                drawable2.setBounds(0, i2, width, top);
            }
            Drawable drawable3 = this.f51206g;
            if (drawable3 != null) {
                drawable3.draw(canvas);
            }
        }
    }

    /* renamed from: o */
    public final void m70767o(Canvas canvas, RecyclerView recyclerView) {
        int i;
        boolean z;
        LinearLayoutManager linearLayoutManager;
        boolean z2;
        View m90306a;
        View m90306a2;
        View m90306a3;
        View view;
        int i2;
        IntRange until;
        Integer num;
        Integer mo79454n;
        View m90306a4;
        View m90306a5;
        boolean z3;
        Integer m40591a;
        View m90306a6;
        int i3;
        View m90306a7;
        ViewGroup viewGroup;
        FrameLayout frameLayout = this.f51204e;
        int i4 = -1;
        if (frameLayout == null) {
            frameLayout = new FrameLayout(recyclerView.getContext());
            frameLayout.setLayoutParams(recyclerView.getLayoutParams());
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.removeView(recyclerView);
                recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(recyclerView);
                viewGroup.addView(frameLayout);
            }
            this.f51204e = frameLayout;
        }
        RecyclerView.AbstractC11843h adapter = recyclerView.getAdapter();
        if (adapter != null) {
            i = adapter.getItemCount();
        } else {
            i = 0;
        }
        if (i == 0) {
            return;
        }
        boolean z4 = true;
        Integer mo79454n2 = this.f51203d.mo79454n(1);
        if (mo79454n2 != null) {
            int intValue = mo79454n2.intValue();
            PQ5.C6353a m90310h = m90310h();
            int mo79456j = this.f51203d.mo79456j(intValue);
            if (m90310h != null && m90310h.m90305b() == mo79456j) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f51203d.mo79457i(m90310h.m90306a(), intValue);
            }
            RecyclerView.AbstractC11855p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            if (linearLayoutManager == null) {
                return;
            }
            if (linearLayoutManager.m66711n2() <= intValue) {
                PQ5.C6353a m90310h2 = m90310h();
                if (m90310h2 != null && (m90306a7 = m90310h2.m90306a()) != null) {
                    C49520tu6.show$default(m90306a7, false, 0, 2, null);
                }
            } else {
                PQ5.C6353a m90310h3 = m90310h();
                if (m90310h3 != null && m90310h3.m90305b() == mo79456j) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    PQ5.C6353a m90310h4 = m90310h();
                    if (m90310h4 != null && (m90306a3 = m90310h4.m90306a()) != null) {
                        frameLayout.removeView(m90306a3);
                    }
                    m90307k(new PQ5.C6353a(m90309i(intValue, frameLayout), mo79456j));
                    PQ5.C6353a m90310h5 = m90310h();
                    if (m90310h5 != null && (m90306a2 = m90310h5.m90306a()) != null) {
                        frameLayout.addView(m90306a2);
                    }
                }
                PQ5.C6353a m90310h6 = m90310h();
                if (m90310h6 != null && (m90306a = m90310h6.m90306a()) != null) {
                    C49520tu6.show$default(m90306a, true, 0, 2, null);
                }
            }
            PQ5.C6353a m90310h7 = m90310h();
            if (m90310h7 != null && (m90306a6 = m90310h7.m90306a()) != null) {
                int bottom = m90306a6.getBottom();
                Drawable drawable = this.f51206g;
                if (drawable != null) {
                    i3 = drawable.getIntrinsicHeight();
                } else {
                    i3 = 0;
                }
                view = m90311g(recyclerView, bottom + i3);
            } else {
                view = null;
            }
            if (view != null && (m40591a = C41207ft4.m40591a(recyclerView, view)) != null) {
                i4 = m40591a.intValue();
            }
            RecyclerView.AbstractC11843h adapter2 = recyclerView.getAdapter();
            if (adapter2 != null) {
                i2 = adapter2.getItemCount();
            } else {
                i2 = 0;
            }
            until = RangesKt___RangesKt.until(intValue, i2);
            Iterator<Integer> it = until.iterator();
            while (true) {
                if (it.hasNext()) {
                    num = it.next();
                    Integer mo79454n3 = this.f51203d.mo79454n(num.intValue());
                    if (mo79454n3 == null || mo79454n3.intValue() != intValue) {
                        z3 = true;
                        continue;
                    } else {
                        z3 = false;
                        continue;
                    }
                    if (z3) {
                        break;
                    }
                } else {
                    num = null;
                    break;
                }
            }
            Integer num2 = num;
            if (num2 != null && (mo79454n = this.f51203d.mo79454n(num2.intValue())) != null) {
                int intValue2 = mo79454n.intValue();
                PQ5.C6353a c6353a = this.f51205f;
                int mo79456j2 = this.f51203d.mo79456j(intValue2);
                if (c6353a == null || c6353a.m90305b() != mo79456j2) {
                    z4 = false;
                }
                if (!z4) {
                    PQ5.C6353a c6353a2 = this.f51205f;
                    if (c6353a2 != null && (m90306a5 = c6353a2.m90306a()) != null) {
                        frameLayout.removeView(m90306a5);
                    }
                    PQ5.C6353a c6353a3 = new PQ5.C6353a(m90309i(intValue2, frameLayout), mo79456j2);
                    this.f51205f = c6353a3;
                    View m90306a8 = c6353a3.m90306a();
                    if (m90306a8 != null) {
                        frameLayout.addView(m90306a8);
                    }
                } else {
                    this.f51203d.mo79457i(c6353a.m90306a(), intValue2);
                }
                if (i4 >= intValue2) {
                    m70769m(canvas);
                } else if (linearLayoutManager.m66706s2() >= intValue2) {
                    if (c6353a != null && (m90306a4 = c6353a.m90306a()) != null) {
                        C49520tu6.show$default(m90306a4, false, 0, 2, null);
                    }
                } else {
                    m70768n(frameLayout, canvas);
                }
            }
        }
    }

    @Override // p000.PQ5, androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.C11872z state) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        m70767o(c, parent);
        m70770l(c, parent);
    }
}
