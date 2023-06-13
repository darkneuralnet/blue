package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 &2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b$\u0010%J8\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J \u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0006H\u0016R&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u00158\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR,\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001c8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0017\u0010\u001fR,\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001c8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010\u001f¨\u0006("}, m28432d2 = {"Lzo1;", "LOf0;", "Landroid/graphics/Rect;", "outRect", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "", "sectionSize", "sectionPosition", "adapterPosition", "viewType", "", "i", "Landroid/view/View;", "view", "j", "LH6;", "section", "idx", "", "g", "Lkotlin/Function1;", "Landroid/content/Context;", "l", "Lkotlin/jvm/functions/Function1;", "h", "()Lkotlin/jvm/functions/Function1;", "horizontalMargin", "Lkotlin/Function2;", "m", "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "verticalPaddingTop", "n", "k", "verticalPaddingBottom", "<init>", "()V", "o", C17296a.f69688o, "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetListItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetListItemDecoration.kt\nco/bird/android/feature/fleetstatus/common/fleets/adapters/FleetListItemDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n2624#2,3:54\n*S KotlinDebug\n*F\n+ 1 FleetListItemDecoration.kt\nco/bird/android/feature/fleetstatus/common/fleets/adapters/FleetListItemDecoration\n*L\n50#1:54,3\n*E\n"})
/* renamed from: zo1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C53012zo1 extends AbstractC34934Of0 {

    /* renamed from: o */
    public static final C31507a f122250o = new C31507a(null);

    /* renamed from: l */
    public final Function1<Context, Integer> f122251l;

    /* renamed from: m */
    public final Function2<Context, Integer, Integer> f122252m;

    /* renamed from: n */
    public final Function2<Context, Integer, Integer> f122253n;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, m28432d2 = {"Lzo1$a;", "", "", "HORIZONTAL_MARGIN_DP", "I", "SECTION_SEPARATION_DP", "VEHICLE_ITEM_VERTICAL_SEPARATION_DP", "VERTICAL_PADDING_DP", "<init>", "()V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: zo1$a */
    /* loaded from: classes3.dex */
    public static final class C31507a {
        public /* synthetic */ C31507a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C31507a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "(Landroid/content/Context;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zo1$b */
    /* loaded from: classes3.dex */
    public static final class C31508b extends Lambda implements Function1<Context, Integer> {

        /* renamed from: g */
        public static final C31508b f122254g = new C31508b();

        public C31508b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return Integer.valueOf((int) C49347td3.m12002a(16, context));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "<anonymous parameter 1>", C17296a.f69688o, "(Landroid/content/Context;I)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zo1$c */
    /* loaded from: classes3.dex */
    public static final class C31509c extends Lambda implements Function2<Context, Integer, Integer> {

        /* renamed from: g */
        public static final C31509c f122255g = new C31509c();

        public C31509c() {
            super(2);
        }

        /* renamed from: a */
        public final Integer m412a(Context context, int i) {
            Intrinsics.checkNotNullParameter(context, "context");
            return Integer.valueOf((int) C49347td3.m12002a(16, context));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Context context, Integer num) {
            return m412a(context, num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "<anonymous parameter 1>", C17296a.f69688o, "(Landroid/content/Context;I)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zo1$d */
    /* loaded from: classes3.dex */
    public static final class C31510d extends Lambda implements Function2<Context, Integer, Integer> {

        /* renamed from: g */
        public static final C31510d f122256g = new C31510d();

        public C31510d() {
            super(2);
        }

        /* renamed from: a */
        public final Integer m411a(Context context, int i) {
            Intrinsics.checkNotNullParameter(context, "context");
            return Integer.valueOf((int) C49347td3.m12002a(16, context));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Context context, Integer num) {
            return m411a(context, num.intValue());
        }
    }

    public C53012zo1() {
        super(C47600qg4.flat_card_bg);
        this.f122251l = C31508b.f122254g;
        this.f122252m = C31510d.f122256g;
        this.f122253n = C31509c.f122255g;
    }

    @Override // p000.AbstractC34934Of0
    /* renamed from: g */
    public boolean mo419g(C3023H6 section, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(section, "section");
        List<C2637G6> m104408e = section.m104408e();
        if ((m104408e instanceof Collection) && m104408e.isEmpty()) {
            return true;
        }
        for (C2637G6 c2637g6 : m104408e) {
            if (c2637g6.m105817b() == C38125aj4.item_fleet_list_message) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.AbstractC34934Of0
    /* renamed from: h */
    public Function1<Context, Integer> mo418h() {
        return this.f122251l;
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
            outRect.top = (int) C49347td3.m12002a(16, context);
        } else if (i4 == C38125aj4.item_fleet_list_vehicle) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
            outRect.top = (int) C49347td3.m12002a(12, context2);
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
            outRect.bottom = (int) C49347td3.m12002a(16, context3);
        }
    }

    @Override // p000.AbstractC34934Of0
    /* renamed from: j */
    public void mo416j(Rect outRect, RecyclerView parent, View view) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        Object tag = view.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) tag).intValue();
        if (intValue == C38125aj4.item_fleet_list_message) {
            outRect.left = 0;
            outRect.right = 0;
        } else if (intValue == C38125aj4.item_fleet_list_vehicle) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "parent.context");
            outRect.top = (int) C49347td3.m12002a(12, context);
        }
    }

    @Override // p000.AbstractC34934Of0
    /* renamed from: k */
    public Function2<Context, Integer, Integer> mo415k() {
        return this.f122253n;
    }

    @Override // p000.AbstractC34934Of0
    /* renamed from: l */
    public Function2<Context, Integer, Integer> mo414l() {
        return this.f122252m;
    }
}
