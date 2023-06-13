package co.bird.android.widget.scan;

import android.content.Context;
import android.util.AttributeSet;
import androidx.camera.core.C11154e;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.buava.Optional;
import co.bird.android.widget.scan.CreditCardScanView;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import io.reactivex.functions.InterfaceC23492o;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import p000.C46615p06;
import p000.Z84;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u001b\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0016\u0010\u001aB#\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0016\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0005H\u0016J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0006H\u0002R\u001c\u0010\u000f\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006 "}, m28432d2 = {"Lco/bird/android/widget/scan/CreditCardScanView;", "Lco/bird/android/widget/scan/ScanView;", "LHE0;", "Landroidx/camera/core/e;", "m", "LZ84;", "Lco/bird/android/buava/Optional;", "t", "Lp06;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "x", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "h", "Ljava/util/concurrent/ExecutorService;", "executor", "Lzd3;", "i", "Lzd3;", "analyzer", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "j", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCreditCardScanView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreditCardScanView.kt\nco/bird/android/widget/scan/CreditCardScanView\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,67:1\n32#2,2:68\n*S KotlinDebug\n*F\n+ 1 CreditCardScanView.kt\nco/bird/android/widget/scan/CreditCardScanView\n*L\n57#1:68,2\n*E\n"})
/* loaded from: classes4.dex */
public final class CreditCardScanView extends ScanView<HE0> {

    /* renamed from: j */
    public static final C16668a f68042j = new C16668a(null);

    /* renamed from: k */
    public static final String f68043k = "(?:(?<visa>4[0-9]{12}(?:[0-9]{3})?)|(?<mastercard>5[1-5][0-9]{14})|(?<discover>6(?:011|5[0-9]{2})[0-9]{12})|(?<amex>3[47][0-9]{13})|(?<diners>3(?:0[0-5]|[68][0-9])?[0-9]{11})|(?<jcb>(?:2131|1800|35[0-9]{3})[0-9]{11}))";

    /* renamed from: h */
    public final ExecutorService f68044h;

    /* renamed from: i */
    public final C52904zd3 f68045i;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lco/bird/android/widget/scan/CreditCardScanView$a;", "", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.scan.CreditCardScanView$a */
    /* loaded from: classes4.dex */
    public static final class C16668a {
        public /* synthetic */ C16668a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16668a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.scan.CreditCardScanView$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16669b extends FunctionReferenceImpl implements Function1<Optional<C46615p06>, Optional<HE0>> {
        public C16669b(Object obj) {
            super(1, obj, CreditCardScanView.class, "mapper", "mapper(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<HE0> invoke(Optional<C46615p06> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((CreditCardScanView) this.receiver).m54033x(p0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardScanView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f68044h = Executors.newSingleThreadExecutor();
        this.f68045i = new C52904zd3();
    }

    /* renamed from: y */
    public static final Optional m54032y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    @Override // co.bird.android.widget.scan.ScanView
    /* renamed from: m */
    public C11154e mo53994m() {
        C11154e m69617e = new C11154e.C11157c().m69614h(0).m69617e();
        Intrinsics.checkNotNullExpressionValue(m69617e, "Builder()\n      .setBack…LY_LATEST)\n      .build()");
        m69617e.m69623i0(this.f68044h, this.f68045i);
        return m69617e;
    }

    @Override // co.bird.android.widget.scan.ScanView
    /* renamed from: t */
    public Z84<Optional<HE0>> mo53987t() {
        Z84.C10119a c10119a = Z84.f47888d;
        Z84<Optional<C46615p06>> m959m = this.f68045i.m959m();
        final C16669b c16669b = new C16669b(this);
        Object map = m959m.map(new InterfaceC23492o() { // from class: IE0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m54032y;
                m54032y = CreditCardScanView.m54032y(Function1.this, obj);
                return m54032y;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "analyzer.results.map(::mapper)");
        return c10119a.m73662c(map, Optional.f63040c.m59034a());
    }

    /* renamed from: x */
    public final Optional<HE0> m54033x(Optional<C46615p06> optional) {
        Set of;
        String value;
        C46615p06 m59035e = optional.m59035e();
        if (m59035e == null) {
            return Optional.f63040c.m59034a();
        }
        String str = f68043k;
        of = SetsKt__SetsKt.setOf((Object[]) new RegexOption[]{RegexOption.IGNORE_CASE, RegexOption.COMMENTS});
        Regex regex = new Regex(str, of);
        for (C46615p06.C27123e c27123e : m59035e.m20166b()) {
            String m20160e = c27123e.m20160e();
            Intrinsics.checkNotNullExpressionValue(m20160e, "textBlock.text");
            if (regex.containsMatchIn(C45097mS5.m25594l(m20160e))) {
                String m20160e2 = c27123e.m20160e();
                Intrinsics.checkNotNullExpressionValue(m20160e2, "textBlock.text");
                MatchResult find$default = Regex.find$default(regex, m20160e2, 0, 2, null);
                if (find$default != null && (value = find$default.getValue()) != null) {
                    return Optional.f63040c.m59032c(new HE0(value));
                }
            }
        }
        return Optional.f63040c.m59034a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardScanView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f68044h = Executors.newSingleThreadExecutor();
        this.f68045i = new C52904zd3();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardScanView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f68044h = Executors.newSingleThreadExecutor();
        this.f68045i = new C52904zd3();
    }
}
