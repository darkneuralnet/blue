package p000;

import co.bird.android.model.persistence.BirdMapMarker;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B!\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0014J\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0014¨\u0006\u0017"}, m28432d2 = {"Lu83;", "LBB;", "Lco/bird/android/model/wire/WireBird;", "bird", "LmM2;", "r", "Lio/reactivex/F;", "LAA3;", "t", "Lco/bird/android/model/persistence/BirdMapMarker;", "birdMarker", "q", "s", "LsP2;", "mediaManager", "LB95;", "bitmapCache", "LEa;", "analyticsManager", "<init>", "(LsP2;LB95;LEa;)V", "j", C17296a.f69688o, "media_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: u83  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49656u83 extends AbstractC0544BB {

    /* renamed from: j */
    public static final C29065a f111788j = new C29065a(null);

    /* renamed from: k */
    public static final C45040mM2 f111789k = new C45040mM2("", false);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lu83$a;", "", "LmM2;", "MARKER_OVERRIDE", "LmM2;", "<init>", "()V", "media_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: u83$a */
    /* loaded from: classes4.dex */
    public static final class C29065a {
        public /* synthetic */ C29065a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C29065a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49656u83(InterfaceC48624sP2 mediaManager, B95 bitmapCache, InterfaceC1880Ea analyticsManager) {
        super(mediaManager, bitmapCache, analyticsManager);
        Intrinsics.checkNotNullParameter(mediaManager, "mediaManager");
        Intrinsics.checkNotNullParameter(bitmapCache, "bitmapCache");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
    }

    @Override // p000.AbstractC0544BB
    /* renamed from: q */
    public C45040mM2 mo10812q(BirdMapMarker birdMarker) {
        Intrinsics.checkNotNullParameter(birdMarker, "birdMarker");
        return f111789k;
    }

    @Override // p000.AbstractC0544BB
    /* renamed from: r */
    public C45040mM2 mo10811r(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return f111789k;
    }

    @Override // p000.AbstractC0544BB
    /* renamed from: s */
    public AbstractC23442F<AA3> mo10810s(BirdMapMarker birdMarker) {
        Intrinsics.checkNotNullParameter(birdMarker, "birdMarker");
        return null;
    }

    @Override // p000.AbstractC0544BB
    /* renamed from: t */
    public AbstractC23442F<AA3> mo10809t(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return null;
    }
}
