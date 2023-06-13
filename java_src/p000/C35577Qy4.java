package p000;

import android.content.Context;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\t\b\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016R&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R,\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00148\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017R,\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00148\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017¨\u0006 "}, m28432d2 = {"LQy4;", "LOf0;", "Landroid/graphics/Rect;", "outRect", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "", "sectionSize", "sectionPosition", "adapterPosition", "viewType", "", "i", "Lkotlin/Function1;", "Landroid/content/Context;", "l", "Lkotlin/jvm/functions/Function1;", "h", "()Lkotlin/jvm/functions/Function1;", "horizontalMargin", "Lkotlin/Function2;", "m", "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "verticalPaddingTop", "n", "k", "verticalPaddingBottom", "<init>", "()V", "o", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Qy4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35577Qy4 extends AbstractC34934Of0 {

    /* renamed from: o */
    public static final C7027a f31326o = new C7027a(null);

    /* renamed from: l */
    public final Function1<Context, Integer> f31327l;

    /* renamed from: m */
    public final Function2<Context, Integer, Integer> f31328m;

    /* renamed from: n */
    public final Function2<Context, Integer, Integer> f31329n;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, m28432d2 = {"LQy4$a;", "", "", "HORIZONTAL_MARGIN_DP", "I", "ITEM_SEPARATION_DP", "SECTION_SEPARATION_DP", "VERTICAL_PADDING_DP", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Qy4$a */
    /* loaded from: classes3.dex */
    public static final class C7027a {
        public /* synthetic */ C7027a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7027a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "(Landroid/content/Context;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qy4$b */
    /* loaded from: classes3.dex */
    public static final class C7028b extends Lambda implements Function1<Context, Integer> {

        /* renamed from: g */
        public static final C7028b f31330g = new C7028b();

        public C7028b() {
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
    /* renamed from: Qy4$c */
    /* loaded from: classes3.dex */
    public static final class C7029c extends Lambda implements Function2<Context, Integer, Integer> {

        /* renamed from: g */
        public static final C7029c f31331g = new C7029c();

        public C7029c() {
            super(2);
        }

        /* renamed from: a */
        public final Integer m87490a(Context context, int i) {
            Intrinsics.checkNotNullParameter(context, "context");
            return Integer.valueOf((int) C49347td3.m12002a(16, context));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Context context, Integer num) {
            return m87490a(context, num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "<anonymous parameter 1>", C17296a.f69688o, "(Landroid/content/Context;I)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qy4$d */
    /* loaded from: classes3.dex */
    public static final class C7030d extends Lambda implements Function2<Context, Integer, Integer> {

        /* renamed from: g */
        public static final C7030d f31332g = new C7030d();

        public C7030d() {
            super(2);
        }

        /* renamed from: a */
        public final Integer m87489a(Context context, int i) {
            Intrinsics.checkNotNullParameter(context, "context");
            return Integer.valueOf((int) C49347td3.m12002a(16, context));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Context context, Integer num) {
            return m87489a(context, num.intValue());
        }
    }

    public C35577Qy4() {
        super(C47600qg4.flat_card_bg);
        this.f31327l = C7028b.f31330g;
        this.f31328m = C7030d.f31332g;
        this.f31329n = C7029c.f31331g;
    }

    @Override // p000.AbstractC34934Of0
    /* renamed from: h */
    public Function1<Context, Integer> mo418h() {
        return this.f31327l;
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
            outRect.bottom = (int) C49347td3.m12002a(16, context3);
        }
    }

    @Override // p000.AbstractC34934Of0
    /* renamed from: k */
    public Function2<Context, Integer, Integer> mo415k() {
        return this.f31329n;
    }

    @Override // p000.AbstractC34934Of0
    /* renamed from: l */
    public Function2<Context, Integer, Integer> mo414l() {
        return this.f31328m;
    }
}
