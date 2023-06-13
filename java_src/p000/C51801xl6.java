package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.BirdSummaryBody;
import co.bird.android.model.CommandCenterBody;
import co.bird.android.model.CommandCenterNotice;
import co.bird.android.model.MobilePartner;
import co.bird.android.model.wire.WireBird;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018JD\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000b0\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"Lxl6;", "LsA;", "Lvl6;", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/MobilePartner;", "partner", "Lco/bird/android/model/BirdSummaryBody;", "birdSummary", "Lco/bird/android/model/CommandCenterBody;", "commandCenter", "", "Lco/bird/android/model/CommandCenterNotice;", "notices", "Lio/reactivex/F;", "LH6;", "e", "LTq4;", "c", "LTq4;", "reactiveConfig", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(LTq4;Landroid/content/Context;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xl6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51801xl6 extends AbstractC28226sA implements InterfaceC50615vl6 {

    /* renamed from: c */
    public final C36207Tq4 f118076c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51801xl6(C36207Tq4 reactiveConfig, Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f118076c = reactiveConfig;
    }

    /* renamed from: x */
    public static final List m4734x(C51801xl6 this$0, BirdSummaryBody birdSummary, WireBird bird, MobilePartner mobilePartner, List notices, CommandCenterBody commandCenter) {
        List listOfNotNull;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(birdSummary, "$birdSummary");
        Intrinsics.checkNotNullParameter(bird, "$bird");
        Intrinsics.checkNotNullParameter(notices, "$notices");
        Intrinsics.checkNotNullParameter(commandCenter, "$commandCenter");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new C3023H6[]{this$0.m12963l(birdSummary, bird, mobilePartner), this$0.m14612u(notices), AbstractC28226sA.generateCommandSection$default(this$0, bird, false, false, false, 14, null), this$0.m14613t(commandCenter), this$0.m14614s(commandCenter)});
        return listOfNotNull;
    }

    @Override // p000.InterfaceC50615vl6
    /* renamed from: e */
    public AbstractC23442F<List<C3023H6>> mo4736e(final WireBird bird, final MobilePartner mobilePartner, final BirdSummaryBody birdSummary, final CommandCenterBody commandCenter, final List<CommandCenterNotice> notices) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(birdSummary, "birdSummary");
        Intrinsics.checkNotNullParameter(commandCenter, "commandCenter");
        Intrinsics.checkNotNullParameter(notices, "notices");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: wl6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m4734x;
                m4734x = C51801xl6.m4734x(C51801xl6.this, birdSummary, bird, mobilePartner, notices, commandCenter);
                return m4734x;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      lis…Schedulers.computation())");
        return m33142Y;
    }
}
