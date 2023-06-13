package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR(\u0010\u0016\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, m28432d2 = {"La04;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "", "LH6;", "sections", "", "u", "c", "I", "positionSelected", "Lc04;", "<set-?>", DateTokenConverter.CONVERTER_KEY, "Lc04;", "v", "()Lc04;", "selectedPreloadAmount", "<init>", "()V", "e", C17296a.f69688o, "b", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: a04  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37701a04 extends AbstractC52206yS0 {

    /* renamed from: e */
    public static final C10486a f49633e = new C10486a(null);

    /* renamed from: f */
    public static final int f49634f = C33309Hg4.frame_rectangle_primary_border_rounded_gray_background;

    /* renamed from: g */
    public static final int f49635g = C33309Hg4.frame_rectangle_gray_border_rounded_gray_background;

    /* renamed from: c */
    public int f49636c;

    /* renamed from: d */
    public C38887c04 f49637d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"La04$a;", "", "", "selectedBg", "I", "unselectedBg", "<init>", "()V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: a04$a */
    /* loaded from: classes3.dex */
    public static final class C10486a {
        public /* synthetic */ C10486a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C10486a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"La04$b;", "Lw1;", "", "position", "", "bind", "LDe2;", "b", "LDe2;", "binding", "Landroid/view/View;", "view", "<init>", "(La04;Landroid/view/View;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPreloadAmountAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadAmountAdapter.kt\nco/bird/android/feature/payment/adapters/PreloadAmountAdapter$PreloadAmountViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,74:1\n18#2:75\n9#3,4:76\n*S KotlinDebug\n*F\n+ 1 PreloadAmountAdapter.kt\nco/bird/android/feature/payment/adapters/PreloadAmountAdapter$PreloadAmountViewHolder\n*L\n58#1:75\n58#1:76,4\n*E\n"})
    /* renamed from: a04$b */
    /* loaded from: classes3.dex */
    public final class C10487b extends C29735w1 {

        /* renamed from: b */
        public final C32353De2 f49638b;

        /* renamed from: c */
        public final /* synthetic */ C37701a04 f49639c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nPreloadAmountAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadAmountAdapter.kt\nco/bird/android/feature/payment/adapters/PreloadAmountAdapter$PreloadAmountViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,74:1\n18#2:75\n9#3,4:76\n*S KotlinDebug\n*F\n+ 1 PreloadAmountAdapter.kt\nco/bird/android/feature/payment/adapters/PreloadAmountAdapter$PreloadAmountViewHolder$1\n*L\n44#1:75\n44#1:76,4\n*E\n"})
        /* renamed from: a04$b$a */
        /* loaded from: classes3.dex */
        public static final class C10488a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C37701a04 f49640g;

            /* renamed from: h */
            public final /* synthetic */ C10487b f49641h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10488a(C37701a04 c37701a04, C10487b c10487b) {
                super(1);
                this.f49640g = c37701a04;
                this.f49641h = c10487b;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object m105816c = this.f49640g.m94545o().m109397e(this.f49641h.getAbsoluteAdapterPosition()).m105816c();
                if (!(m105816c instanceof C38887c04)) {
                    m105816c = null;
                }
                if (((C38887c04) m105816c) != null) {
                    C37701a04 c37701a04 = this.f49640g;
                    C10487b c10487b = this.f49641h;
                    if (c37701a04.f49636c != c10487b.getAbsoluteAdapterPosition()) {
                        int i = c37701a04.f49636c;
                        c37701a04.f49636c = c10487b.getAbsoluteAdapterPosition();
                        c37701a04.notifyItemChanged(i);
                        c37701a04.notifyItemChanged(c37701a04.f49636c);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10487b(C37701a04 c37701a04, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f49639c = c37701a04;
            C32353De2 m110071a = C32353De2.m110071a(view);
            Intrinsics.checkNotNullExpressionValue(m110071a, "bind(view)");
            this.f49638b = m110071a;
            FrameLayout root = m110071a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C10488a(c37701a04, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            int i2;
            Object m105816c = this.f49639c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C38887c04)) {
                m105816c = null;
            }
            C38887c04 c38887c04 = (C38887c04) m105816c;
            if (c38887c04 != null) {
                C37701a04 c37701a04 = this.f49639c;
                if (i == c37701a04.f49636c) {
                    z = true;
                } else {
                    z = false;
                }
                this.f49638b.f6126b.setText(c38887c04.m62036c());
                this.f49638b.f6126b.setChecked(z);
                if (z) {
                    i2 = C37701a04.f49634f;
                } else {
                    i2 = C37701a04.f49635g;
                }
                this.f49638b.getRoot().setBackgroundResource(i2);
                if (z) {
                    c37701a04.f49637d = c38887c04;
                }
            }
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: u */
    public void mo24871u(Collection<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        super.mo24871u(sections);
        this.f49636c = m94545o().m109394h().size() / 2;
    }

    /* renamed from: v */
    public final C38887c04 m72132v() {
        return this.f49637d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C31932Bj4.item_preload_amount ? new C10487b(this, m41761u) : new C29735w1(m41761u);
    }
}
