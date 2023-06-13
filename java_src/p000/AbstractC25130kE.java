package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.BirdSummaryBody;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0004R\u001a\u0010\u000b\u001a\u00020\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"LkE;", "", "Lco/bird/android/model/BirdSummaryBody;", "birdSummary", "LH6;", "c", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: kE */
/* loaded from: classes4.dex */
public abstract class AbstractC25130kE {

    /* renamed from: a */
    public final Context f94101a;

    public AbstractC25130kE(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f94101a = context;
    }

    /* renamed from: c */
    public final C3023H6 m29186c(BirdSummaryBody birdSummary) {
        List mutableListOf;
        Intrinsics.checkNotNullParameter(birdSummary, "birdSummary");
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(C29888wT.toVehicleSummaryViewModel$default(birdSummary, this.f94101a, false, null, 6, null), C34740Nj4.item_vehicle_summary, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }
}
