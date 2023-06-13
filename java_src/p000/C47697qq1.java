package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J \u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016R&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u00108\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R,\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00178\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, m28432d2 = {"Lqq1;", "LOf0;", "Landroid/graphics/Rect;", "outRect", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "", "sectionSize", "sectionPosition", "adapterPosition", "viewType", "", "i", "Landroid/view/View;", "view", "j", "Lkotlin/Function1;", "Landroid/content/Context;", "l", "Lkotlin/jvm/functions/Function1;", "h", "()Lkotlin/jvm/functions/Function1;", "horizontalMargin", "Lkotlin/Function2;", "m", "Lkotlin/jvm/functions/Function2;", "k", "()Lkotlin/jvm/functions/Function2;", "verticalPaddingBottom", "<init>", "()V", "n", C17296a.f69688o, "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qq1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47697qq1 extends AbstractC34934Of0 {

    /* renamed from: n */
    public static final C27706a f105905n = new C27706a(null);

    /* renamed from: l */
    public final Function1<Context, Integer> f105906l;

    /* renamed from: m */
    public final Function2<Context, Integer, Integer> f105907m;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, m28432d2 = {"Lqq1$a;", "", "", "HORIZONTAL_MARGIN_DP", "I", "ITEM_SEPARATION_DP", "SECTION_SEPARATION_DP", "SUBSTATE_VERTICAL_PADDING_DP", "<init>", "()V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: qq1$a */
    /* loaded from: classes3.dex */
    public static final class C27706a {
        public /* synthetic */ C27706a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C27706a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "(Landroid/content/Context;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: qq1$b */
    /* loaded from: classes3.dex */
    public static final class C27707b extends Lambda implements Function1<Context, Integer> {

        /* renamed from: g */
        public static final C27707b f105908g = new C27707b();

        public C27707b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return Integer.valueOf((int) C49347td3.m12002a(16, context));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "viewType", C17296a.f69688o, "(Landroid/content/Context;I)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: qq1$c */
    /* loaded from: classes3.dex */
    public static final class C27708c extends Lambda implements Function2<Context, Integer, Integer> {

        /* renamed from: g */
        public static final C27708c f105909g = new C27708c();

        public C27708c() {
            super(2);
        }

        /* renamed from: a */
        public final Integer m16930a(Context context, int i) {
            int m12002a;
            Intrinsics.checkNotNullParameter(context, "context");
            if (i != C38125aj4.item_fleet_substate && i != C38125aj4.item_fleet_rating_group) {
                m12002a = 0;
            } else {
                m12002a = (int) C49347td3.m12002a(16, context);
            }
            return Integer.valueOf(m12002a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Context context, Integer num) {
            return m16930a(context, num.intValue());
        }
    }

    public C47697qq1() {
        super(C47600qg4.flat_card_bg);
        this.f105906l = C27707b.f105908g;
        this.f105907m = C27708c.f105909g;
    }

    @Override // p000.AbstractC34934Of0
    /* renamed from: h */
    public Function1<Context, Integer> mo418h() {
        return this.f105906l;
    }

    @Override // p000.AbstractC34934Of0
    /* renamed from: i */
    public void mo417i(Rect outRect, RecyclerView parent, int i, int i2, int i3, int i4) {
        int i5;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i2 == 0) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "parent.context");
            outRect.top = (int) C49347td3.m12002a(12, context);
        } else {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
            outRect.top = (int) C49347td3.m12002a(8, context2);
        }
        RecyclerView.AbstractC11843h adapter = parent.getAdapter();
        if (adapter != null) {
            i5 = adapter.getItemCount();
        } else {
            i5 = 0;
        }
        if (i3 == i5 - 1) {
            Context context3 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "parent.context");
            outRect.bottom = (int) C49347td3.m12002a(12, context3);
        }
    }

    @Override // p000.AbstractC34934Of0
    /* renamed from: j */
    public void mo416j(Rect outRect, RecyclerView parent, View view) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        if (Intrinsics.areEqual(view.getTag(), Integer.valueOf(C38125aj4.item_fleet_substate)) || Intrinsics.areEqual(view.getTag(), Integer.valueOf(C38125aj4.item_fleet_rating_group))) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "parent.context");
            outRect.top = (int) C49347td3.m12002a(8, context);
        }
    }

    @Override // p000.AbstractC34934Of0
    /* renamed from: k */
    public Function2<Context, Integer, Integer> mo415k() {
        return this.f105907m;
    }
}
