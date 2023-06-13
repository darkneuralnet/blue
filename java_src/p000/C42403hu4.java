package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J8\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J \u0010\u0014\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\u00158\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"Lhu4;", "LOf0;", "LH6;", "section", "", "idx", "", "g", "Landroid/graphics/Rect;", "outRect", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "sectionSize", "sectionPosition", "adapterPosition", "viewType", "", "i", "Landroid/view/View;", "view", "j", "Lkotlin/Function1;", "Landroid/content/Context;", "l", "Lkotlin/jvm/functions/Function1;", "h", "()Lkotlin/jvm/functions/Function1;", "horizontalMargin", "<init>", "()V", "release-assignment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hu4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42403hu4 extends AbstractC34934Of0 {

    /* renamed from: l */
    public final Function1<Context, Integer> f86160l;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", "it", "", C17296a.f69688o, "(Landroid/content/Context;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hu4$a */
    /* loaded from: classes3.dex */
    public static final class C22836a extends Lambda implements Function1<Context, Integer> {

        /* renamed from: g */
        public static final C22836a f86161g = new C22836a();

        public C22836a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf((int) C49347td3.m12001b(16));
        }
    }

    public C42403hu4() {
        super(C39892dg4.card_bg);
        this.f86160l = C22836a.f86161g;
    }

    @Override // p000.AbstractC34934Of0
    /* renamed from: g */
    public boolean mo419g(C3023H6 section, int i) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(section, "section");
        C2637G6 m104409d = section.m104409d();
        if (m104409d != null && m104409d.m105817b() == C50001uj4.item_release_assignment) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        C2637G6 m104409d2 = section.m104409d();
        if (m104409d2 != null && m104409d2.m105817b() == C50001uj4.item_capped_zone_reservation_group_header) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC34934Of0
    /* renamed from: h */
    public Function1<Context, Integer> mo418h() {
        return this.f86160l;
    }

    @Override // p000.AbstractC34934Of0
    /* renamed from: i */
    public void mo417i(Rect outRect, RecyclerView parent, int i, int i2, int i3, int i4) {
        int i5;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i4 == C50001uj4.item_group_header) {
            outRect.top = (int) C49347td3.m12001b(24);
        } else if (i4 == C50001uj4.item_group_empty_text) {
            outRect.top = (int) C49347td3.m12001b(16);
        } else if (i4 == C50001uj4.item_release_assignment) {
            outRect.top = (int) C49347td3.m12001b(16);
        } else if (i4 == C50001uj4.item_capped_zone_reservation_group_header) {
            outRect.top = (int) C49347td3.m12001b(16);
        }
        if (i3 == 0) {
            outRect.top = (int) C49347td3.m12001b(16);
        }
        RecyclerView.AbstractC11843h adapter = parent.getAdapter();
        if (adapter != null) {
            i5 = adapter.getItemCount();
        } else {
            i5 = 0;
        }
        if (i3 == i5 - 1) {
            outRect.bottom += (int) C49347td3.m12001b(16);
        }
    }

    @Override // p000.AbstractC34934Of0
    /* renamed from: j */
    public void mo416j(Rect outRect, RecyclerView parent, View view) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        Integer m40591a = C41207ft4.m40591a(parent, view);
        if (m40591a != null) {
            int intValue = m40591a.intValue();
            RecyclerView.AbstractC11843h adapter = parent.getAdapter();
            if (adapter != null && adapter.getItemViewType(intValue) == C50001uj4.item_capped_zone_reservation) {
                Function1<Context, Integer> mo418h = mo418h();
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                outRect.left = mo418h.invoke(context).intValue();
                Function1<Context, Integer> mo418h2 = mo418h();
                Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "view.context");
                outRect.right = mo418h2.invoke(context2).intValue();
            }
        }
    }
}
