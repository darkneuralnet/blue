package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.C11905h;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.CouponDisplayIcon;
import co.bird.android.model.wire.WireCouponDisplayView;
import co.bird.android.widget.RibbonTextView;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p000.C46693p84;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0003!\"\u000bB\u0011\b\u0007\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u000f0\u000f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u000f0\u000f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b¨\u0006#"}, m28432d2 = {"Lp84;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "layoutId", "Lw1;", "onCreateViewHolder", "LF6;", "r", "Lw84;", "c", "Lw84;", "freeRideViewHolderFactory", "Lio/reactivex/Observable;", "", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Lazy;", "v", "()Lio/reactivex/Observable;", "activateClicks", "e", "w", "addCodeEvents", "Lma4;", "kotlin.jvm.PlatformType", "f", "Lma4;", "mutableActivateClicks", "g", "mutableAddCodeEvents", "<init>", "(Lw84;)V", C17296a.f69688o, "b", "promotions_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: p84  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46693p84 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final InterfaceC50842w84 f103184c;

    /* renamed from: d */
    public final Lazy f103185d;

    /* renamed from: e */
    public final Lazy f103186e;

    /* renamed from: f */
    public final C45168ma4<String> f103187f;

    /* renamed from: g */
    public final C45168ma4<String> f103188g;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\n"}, m28432d2 = {"Lp84$a;", "Lw1;", "LKe2;", "b", "LKe2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lp84;Landroid/view/View;)V", "promotions_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: p84$a */
    /* loaded from: classes3.dex */
    public final class C27171a extends C29735w1 {

        /* renamed from: b */
        public final C33991Ke2 f103189b;

        /* renamed from: c */
        public final /* synthetic */ C46693p84 f103190c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27171a(final C46693p84 c46693p84, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f103190c = c46693p84;
            C33991Ke2 m98630a = C33991Ke2.m98630a(view);
            Intrinsics.checkNotNullExpressionValue(m98630a, "bind(view)");
            this.f103189b = m98630a;
            m98630a.f19960b.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o84
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    boolean m19885b;
                    m19885b = C46693p84.C27171a.m19885b(C46693p84.this, this, textView, i, keyEvent);
                    return m19885b;
                }
            });
        }

        /* renamed from: b */
        public static final boolean m19885b(C46693p84 this$0, C27171a this$1, TextView textView, int i, KeyEvent keyEvent) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this$0.f103188g.accept(textView.getText().toString());
            this$1.f103189b.f19960b.setText("");
            Context context = this$1.getContext();
            IBinder windowToken = this$1.f103189b.f19960b.getWindowToken();
            Intrinsics.checkNotNullExpressionValue(windowToken, "binding.code.windowToken");
            C40788fB0.m41768n(context, windowToken);
            return true;
        }
    }

    @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, m28432d2 = {"Lp84$b;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/model/constant/CouponDisplayIcon;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/drawable/Drawable;", "e", "LLe2;", "b", "LLe2;", "binding", "", "c", "Ljava/lang/String;", "couponId", "Landroid/view/View$OnClickListener;", DateTokenConverter.CONVERTER_KEY, "Landroid/view/View$OnClickListener;", "activateListener", "Landroid/view/View;", "view", "<init>", "(Lp84;Landroid/view/View;)V", "promotions_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPromotionsCenterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromotionsCenterAdapter.kt\nco/bird/android/feature/promotions/PromotionsCenterAdapter$CouponViewHolder\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n9#2,4:193\n1#3:197\n*S KotlinDebug\n*F\n+ 1 PromotionsCenterAdapter.kt\nco/bird/android/feature/promotions/PromotionsCenterAdapter$CouponViewHolder\n*L\n119#1:193,4\n*E\n"})
    /* renamed from: p84$b */
    /* loaded from: classes3.dex */
    public final class C27172b extends C29735w1 {

        /* renamed from: b */
        public final C34225Le2 f103191b;

        /* renamed from: c */
        public String f103192c;

        /* renamed from: d */
        public final View.OnClickListener f103193d;

        /* renamed from: e */
        public final /* synthetic */ C46693p84 f103194e;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: p84$b$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C27173a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CouponDisplayIcon.values().length];
                try {
                    iArr[CouponDisplayIcon.GIFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CouponDisplayIcon.TAG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CouponDisplayIcon.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27172b(final C46693p84 c46693p84, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f103194e = c46693p84;
            C34225Le2 m96521a = C34225Le2.m96521a(view);
            Intrinsics.checkNotNullExpressionValue(m96521a, "bind(view)");
            this.f103191b = m96521a;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: q84
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C46693p84.C27172b.m19883b(C46693p84.C27172b.this, c46693p84, view2);
                }
            };
            this.f103193d = onClickListener;
            m96521a.f21850b.setOnClickListener(onClickListener);
        }

        /* renamed from: b */
        public static final void m19883b(C27172b this$0, C46693p84 this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            String str = this$0.f103192c;
            if (str != null) {
                this$1.f103187f.accept(str);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00f8, code lost:
            if (r7 == null) goto L27;
         */
        @Override // p000.C29735w1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void bind(int i) {
            String string;
            int coerceAtLeast;
            boolean z;
            Object m105816c = this.f103194e.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof WireCouponDisplayView)) {
                m105816c = null;
            }
            WireCouponDisplayView wireCouponDisplayView = (WireCouponDisplayView) m105816c;
            if (wireCouponDisplayView == null) {
                return;
            }
            this.f103192c = wireCouponDisplayView.getCouponId();
            RibbonTextView ribbonTextView = this.f103191b.f21854f;
            Intrinsics.checkNotNullExpressionValue(ribbonTextView, "binding.ribbonTag");
            C49520tu6.setTextAndVisibility$default(ribbonTextView, wireCouponDisplayView.getFlagText(), 0, 2, null);
            if (wireCouponDisplayView.getIcon() == CouponDisplayIcon.NONE) {
                this.f103191b.f21853e.setVisibility(4);
            } else {
                this.f103191b.f21853e.setImageDrawable(m19882e(wireCouponDisplayView.getIcon(), getContext()));
                this.f103191b.f21853e.setVisibility(0);
            }
            this.f103191b.f21855g.setText(wireCouponDisplayView.getTitle());
            AppCompatTextView appCompatTextView = this.f103191b.f21851c;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.description");
            C49520tu6.setTextAndVisibility$default(appCompatTextView, wireCouponDisplayView.getBody(), 0, 2, null);
            DateTime expiresAt = wireCouponDisplayView.getExpiresAt();
            if (expiresAt != null) {
                LocalDate expiresAtLocalDate = expiresAt.minusHours(1).toLocalDate();
                coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(Days.daysBetween(DateTime.now(), expiresAt).getDays(), 0);
                if (coerceAtLeast == 0) {
                    string = getContext().getString(C45871nl4.promo_center_coupon_expires_today_at_time, C51916xx1.f118396a.m4392t(expiresAt));
                } else {
                    if (1 <= coerceAtLeast && coerceAtLeast < 7) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        int days = Days.daysBetween(DateTime.now().toLocalDate(), expiresAtLocalDate).getDays();
                        string = getContext().getResources().getQuantityString(C37089Xk4.promo_center_coupon_expires_in_number_of_days, days, Integer.valueOf(days));
                    } else {
                        Context context = getContext();
                        int i2 = C45871nl4.promo_center_coupon_expires_on_date;
                        C51916xx1 c51916xx1 = C51916xx1.f118396a;
                        Intrinsics.checkNotNullExpressionValue(expiresAtLocalDate, "expiresAtLocalDate");
                        string = context.getString(i2, c51916xx1.m4394r(expiresAtLocalDate));
                    }
                }
            }
            string = getContext().getString(C45871nl4.promo_center_coupon_no_expiration);
            Intrinsics.checkNotNullExpressionValue(string, "couponView.expiresAt?.le…on_no_expiration)\n      }");
            this.f103191b.f21852d.setText(string);
            AppCompatTextView appCompatTextView2 = this.f103191b.f21850b;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.activateButton");
            C49520tu6.m11239l(appCompatTextView2);
        }

        /* renamed from: e */
        public final Drawable m19882e(CouponDisplayIcon couponDisplayIcon, Context context) {
            int i = C27173a.$EnumSwitchMapping$0[couponDisplayIcon.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return NA0.m94299e(context, C48193rg4.ic_pricing);
            }
            return NA0.m94299e(context, C48193rg4.ic_gift_icon);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lp84$c;", "Lw1;", "", "position", "", "bind", "LNe2;", "b", "LNe2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lp84;Landroid/view/View;)V", "promotions_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPromotionsCenterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromotionsCenterAdapter.kt\nco/bird/android/feature/promotions/PromotionsCenterAdapter$HeaderViewHolder\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,192:1\n9#2,4:193\n*S KotlinDebug\n*F\n+ 1 PromotionsCenterAdapter.kt\nco/bird/android/feature/promotions/PromotionsCenterAdapter$HeaderViewHolder\n*L\n99#1:193,4\n*E\n"})
    /* renamed from: p84$c */
    /* loaded from: classes3.dex */
    public final class C27174c extends C29735w1 {

        /* renamed from: b */
        public final C34693Ne2 f103195b;

        /* renamed from: c */
        public final /* synthetic */ C46693p84 f103196c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27174c(C46693p84 c46693p84, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f103196c = c46693p84;
            C34693Ne2 m93611a = C34693Ne2.m93611a(view);
            Intrinsics.checkNotNullExpressionValue(m93611a, "bind(view)");
            this.f103195b = m93611a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f103196c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Integer)) {
                m105816c = null;
            }
            Integer num = (Integer) m105816c;
            if (num != null) {
                this.f103195b.f24940b.setText(getContext().getString(num.intValue()));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: p84$d */
    /* loaded from: classes3.dex */
    public static final class C27175d extends Lambda implements Function0<Observable<String>> {
        public C27175d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<String> invoke() {
            return C46693p84.this.f103187f.hide();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: p84$e */
    /* loaded from: classes3.dex */
    public static final class C27176e extends Lambda implements Function0<Observable<String>> {
        public C27176e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<String> invoke() {
            return C46693p84.this.f103188g.hide();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\n"}, m28432d2 = {"p84$f", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "promotions_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPromotionsCenterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromotionsCenterAdapter.kt\nco/bird/android/feature/promotions/PromotionsCenterAdapter$getDiffCallback$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,192:1\n18#2:193\n18#2:198\n9#3,4:194\n9#3,4:199\n*S KotlinDebug\n*F\n+ 1 PromotionsCenterAdapter.kt\nco/bird/android/feature/promotions/PromotionsCenterAdapter$getDiffCallback$1\n*L\n59#1:193\n60#1:198\n59#1:194,4\n60#1:199,4\n*E\n"})
    /* renamed from: p84$f */
    /* loaded from: classes3.dex */
    public static final class C27177f implements InterfaceC2152F6 {
        @Override // p000.InterfaceC2152F6
        /* renamed from: a */
        public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
            return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
        }

        @Override // p000.InterfaceC2152F6
        /* renamed from: b */
        public String mo29b(C2637G6 adapterItem) {
            String couponId;
            Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
            int m105817b = adapterItem.m105817b();
            Integer num = null;
            if (m105817b == C32166Cj4.item_promo_center_header) {
                Object m105816c = adapterItem.m105816c();
                if (m105816c instanceof Integer) {
                    num = m105816c;
                }
                Integer num2 = num;
                if (num2 == null || (couponId = num2.toString()) == null) {
                    return "";
                }
            } else if (m105817b == C32166Cj4.item_promo_center_coupon) {
                Object m105816c2 = adapterItem.m105816c();
                if (m105816c2 instanceof WireCouponDisplayView) {
                    num = m105816c2;
                }
                WireCouponDisplayView wireCouponDisplayView = num;
                if (wireCouponDisplayView == null || (couponId = wireCouponDisplayView.getCouponId()) == null) {
                    return "";
                }
            } else if (m105817b == C32166Cj4.item_promo_center_add_code) {
                return "add_code";
            } else {
                if (m105817b == C32166Cj4.item_promo_center_free_ride) {
                    return "free_ride";
                }
                return "footer";
            }
            return couponId;
        }

        @Override // p000.InterfaceC2152F6
        /* renamed from: c */
        public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            Object m105816c = oldItem.m105816c();
            Object m105816c2 = newItem.m105816c();
            if ((m105816c instanceof WireCouponDisplayView) && (m105816c2 instanceof WireCouponDisplayView)) {
                return !Intrinsics.areEqual(m105816c, m105816c2);
            }
            if ((m105816c instanceof Integer) && (m105816c2 instanceof Integer)) {
                return !Intrinsics.areEqual(m105816c, m105816c2);
            }
            return false;
        }
    }

    public C46693p84(InterfaceC50842w84 freeRideViewHolderFactory) {
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(freeRideViewHolderFactory, "freeRideViewHolderFactory");
        this.f103184c = freeRideViewHolderFactory;
        lazy = LazyKt__LazyJVMKt.lazy(new C27175d());
        this.f103185d = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C27176e());
        this.f103186e = lazy2;
        C45168ma4<String> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<String>()");
        this.f103187f = m25409g;
        C45168ma4<String> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<String>()");
        this.f103188g = m25409g2;
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C27177f();
    }

    /* renamed from: v */
    public final Observable<String> m19888v() {
        Object value = this.f103185d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-activateClicks>(...)");
        return (Observable) value;
    }

    /* renamed from: w */
    public final Observable<String> m19887w() {
        Object value = this.f103186e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-addCodeEvents>(...)");
        return (Observable) value;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C32166Cj4.item_promo_center_header ? new C27174c(this, m41761u) : i == C32166Cj4.item_promo_center_coupon ? new C27172b(this, m41761u) : i == C32166Cj4.item_promo_center_add_code ? new C27171a(this, m41761u) : i == C32166Cj4.item_promo_center_free_ride ? this.f103184c.mo5817a(m41761u) : new C29735w1(m41761u);
    }
}
