package p000;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.FlightBanner;
import co.bird.android.model.FlightBannerNode;
import co.bird.android.model.persistence.Area;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"Lb85;", "Lco/bird/android/model/FlightBanner;", "", "onBannerShown", "Lbn;", C17296a.f69688o, "Lbn;", "areaManager", "LTq4;", "b", "LTq4;", "reactiveConfig", "Landroid/content/Context;", "c", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/FlightBannerNode$RiderBarType;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/FlightBannerNode$RiderBarType;", "riderBarType", "Landroid/view/View;", "e", "Landroid/view/View;", "riderBar", "", "f", "Z", "isInRide", "<init>", "(Lbn;LTq4;Landroid/content/Context;Lco/bird/android/model/FlightBannerNode$RiderBarType;Landroid/view/View;Z)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: b85  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38375b85 implements FlightBanner {

    /* renamed from: a */
    public final InterfaceC12495bn f56969a;

    /* renamed from: b */
    public final C36207Tq4 f56970b;

    /* renamed from: c */
    public final Context f56971c;

    /* renamed from: d */
    public final FlightBannerNode.RiderBarType f56972d;

    /* renamed from: e */
    public final View f56973e;

    /* renamed from: f */
    public final boolean f56974f;

    public C38375b85(InterfaceC12495bn areaManager, C36207Tq4 reactiveConfig, Context context, FlightBannerNode.RiderBarType riderBarType, View riderBar, boolean z) {
        Intrinsics.checkNotNullParameter(areaManager, "areaManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(riderBarType, "riderBarType");
        Intrinsics.checkNotNullParameter(riderBar, "riderBar");
        this.f56969a = areaManager;
        this.f56970b = reactiveConfig;
        this.f56971c = context;
        this.f56972d = riderBarType;
        this.f56973e = riderBar;
        this.f56974f = z;
    }

    @Override // co.bird.android.model.FlightBanner
    public Observable<Unit> closeImmediately() {
        return FlightBanner.DefaultImpls.closeImmediately(this);
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerRemoved() {
        FlightBanner.DefaultImpls.onBannerRemoved(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
        if (r3 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
        r0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
        if (r3 == null) goto L18;
     */
    @Override // co.bird.android.model.FlightBanner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBannerShown() {
        boolean z;
        boolean z2;
        Area m59035e;
        String riderBarNotInRideMessageBody;
        FlightBannerNode.RiderBarType riderBarType = this.f56972d;
        Integer iconRes = riderBarType.getIconRes();
        String string = this.f56971c.getString(riderBarType.getTitleText());
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(type.titleText)");
        String string2 = this.f56971c.getString(riderBarType.getBodyText());
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(type.bodyText)");
        if (this.f56970b.m82623f8().getValue().getEnableAreaSpecificRiderBarMessages() && (m59035e = this.f56969a.mo63992x().getValue().m59035e()) != null) {
            if (this.f56974f) {
                iconRes = C10854an.m70749b(m59035e.getRiderBarInRideMessageIconType());
                String riderBarInRideMessageTitle = m59035e.getRiderBarInRideMessageTitle();
                if (riderBarInRideMessageTitle != null) {
                    string = riderBarInRideMessageTitle;
                }
                riderBarNotInRideMessageBody = m59035e.getRiderBarInRideMessageBody();
            } else {
                iconRes = C10854an.m70749b(m59035e.getRiderBarNotInRideMessageIconType());
                String riderBarNotInRideMessageTitle = m59035e.getRiderBarNotInRideMessageTitle();
                if (riderBarNotInRideMessageTitle != null) {
                    string = riderBarNotInRideMessageTitle;
                }
                riderBarNotInRideMessageBody = m59035e.getRiderBarNotInRideMessageBody();
            }
        }
        View view = this.f56973e;
        int i = C52955zi4.riderBarIcon;
        View findViewById = view.findViewById(i);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById<ImageView>(R.id.riderBarIcon)");
        boolean z3 = true;
        if (iconRes != null) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(findViewById, z, 0, 2, null);
        if (iconRes != null) {
            ((ImageView) view.findViewById(i)).setImageResource(iconRes.intValue());
        }
        ((TextView) view.findViewById(C52955zi4.riderBarTitle)).setText(string);
        ((TextView) view.findViewById(C52955zi4.riderBarBody)).setText(string2);
        if (string != null && string.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            if (string2 != null && string2.length() != 0) {
                z3 = false;
            }
            if (z3) {
                C49520tu6.m11239l(this.f56973e);
            }
        }
    }
}
