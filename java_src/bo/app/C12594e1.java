package bo.app;

import androidx.recyclerview.widget.C11925l;
import com.facebook.share.internal.C17296a;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0006B\u001b\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0011"}, m28432d2 = {"Lbo/app/e1;", "Lbo/app/t1;", "", "c", "", "normalSleepDurationMs", C17296a.f69688o, "", "b", "()Z", "isBackingOff", "()I", "newSleepDurationAfterFailure", "maxSleepDurationMs", "defaultNormalSleepDurationMs", "<init>", "(II)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.e1 */
/* loaded from: classes.dex */
public final class C12594e1 implements InterfaceC13144t1 {

    /* renamed from: e */
    public static final C12595a f58375e = new C12595a(null);

    /* renamed from: a */
    private final int f58376a;

    /* renamed from: b */
    private final int f58377b;

    /* renamed from: c */
    private final Random f58378c;

    /* renamed from: d */
    private int f58379d;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000bJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\b\b\u0010\t\u0012\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\u000e"}, m28432d2 = {"Lbo/app/e1$a;", "", "Ljava/util/Random;", "random", "", "valueA", "valueB", C17296a.f69688o, "minimumSleepTimeMs", "I", "getMinimumSleepTimeMs$annotations", "()V", "scaleFactor", "<init>", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.e1$a */
    /* loaded from: classes.dex */
    public static final class C12595a {
        public /* synthetic */ C12595a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final int m63817a(Random random, int i, int i2) {
            Intrinsics.checkNotNullParameter(random, "random");
            return random.nextInt(Math.abs(i - i2) + 1) + Math.min(i, i2);
        }

        private C12595a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.e1$b */
    /* loaded from: classes.dex */
    public static final class C12596b extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ Ref.IntRef f58380b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12596b(Ref.IntRef intRef) {
            super(0);
            this.f58380b = intRef;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Sleep time too small: " + this.f58380b.element + " increasing to 250";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.e1$c */
    /* loaded from: classes.dex */
    public static final class C12597c extends Lambda implements Function0<String> {
        public C12597c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Computing new sleep delay. Previous sleep delay: ", Integer.valueOf(C12594e1.this.f58379d));
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.e1$d */
    /* loaded from: classes.dex */
    public static final class C12598d extends Lambda implements Function0<String> {

        /* renamed from: c */
        final /* synthetic */ Ref.IntRef f58383c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12598d(Ref.IntRef intRef) {
            super(0);
            this.f58383c = intRef;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "New sleep duration: " + C12594e1.this.f58379d + " ms. Default sleep duration: " + this.f58383c.element + " ms. Max sleep: " + C12594e1.this.f58376a + " ms.";
        }
    }

    public C12594e1(int i, int i2) {
        this.f58376a = i;
        this.f58377b = i2;
        this.f58378c = new Random();
    }

    /* renamed from: c */
    public void m63818c() {
        this.f58379d = 0;
    }

    @Override // bo.app.InterfaceC13144t1
    /* renamed from: a */
    public int mo62925a() {
        return m63822a(this.f58377b);
    }

    /* renamed from: b */
    public boolean m63820b() {
        return this.f58379d != 0;
    }

    /* renamed from: a */
    public int m63822a(int i) {
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = i;
        if (i < 250) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12596b(intRef), 7, null);
            intRef.element = C11925l.AbstractC11930e.DEFAULT_SWIPE_ANIMATION_DURATION;
        }
        if (this.f58379d == 0) {
            this.f58379d = C11925l.AbstractC11930e.DEFAULT_SWIPE_ANIMATION_DURATION;
        }
        C43664k20 c43664k20 = C43664k20.f93782a;
        C43664k20.m29442e(c43664k20, this, null, null, false, new C12597c(), 7, null);
        this.f58379d = Math.min(this.f58376a, f58375e.m63817a(this.f58378c, Math.max(intRef.element, this.f58379d), this.f58379d * 3));
        C43664k20.m29442e(c43664k20, this, null, null, false, new C12598d(intRef), 7, null);
        return this.f58379d;
    }

    public /* synthetic */ C12594e1(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? (int) TimeUnit.SECONDS.toMillis(1L) : i2);
    }
}
