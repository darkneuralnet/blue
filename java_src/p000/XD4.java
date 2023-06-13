package p000;

import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"LXD4;", "LWD4;", "Lco/bird/android/model/wire/WireBird;", "bird", "", C17296a.f69688o, "LYD4;", "LYD4;", "ui", "<init>", "(LYD4;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: XD4 */
/* loaded from: classes3.dex */
public final class XD4 implements WD4 {

    /* renamed from: a */
    public final YD4 f42900a;

    public XD4(YD4 ui) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f42900a = ui;
    }

    @Override // p000.WD4
    /* renamed from: a */
    public void mo77175a(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f42900a.mo71743sc(bird);
    }
}
