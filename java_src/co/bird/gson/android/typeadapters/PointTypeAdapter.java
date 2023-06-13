package co.bird.gson.android.typeadapters;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.Point;
import com.facebook.share.internal.C17296a;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J&\u0010\u000e\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u0011"}, m28432d2 = {"Lco/bird/gson/android/typeadapters/PointTypeAdapter;", "Lvi2;", "Lco/bird/android/model/Point;", "Llj2;", "Lyi2;", "json", "Ljava/lang/reflect/Type;", "type", "Lui2;", CoreConstants.CONTEXT_SCOPE_VALUE, C17296a.f69688o, "src", "typeOfSrc", "Lkj2;", "b", "<init>", "()V", "gson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class PointTypeAdapter implements InterfaceC50581vi2<Point>, InterfaceC44663lj2<Point> {
    @Override // p000.InterfaceC50581vi2
    /* renamed from: a */
    public Point deserialize(AbstractC52360yi2 json, Type type, InterfaceC49989ui2 context) throws JsonParseException {
        double mo2887b;
        double mo2887b2;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        if (json.m2879u()) {
            mo2887b2 = json.m2885e().m83135y("latitude").mo2887b();
            mo2887b = json.m2885e().m83135y("longitude").mo2887b();
        } else {
            mo2887b = json.m2886c().m41011y(0).mo2887b();
            mo2887b2 = json.m2886c().m41011y(1).mo2887b();
        }
        return new Point(mo2887b, mo2887b2);
    }

    @Override // p000.InterfaceC44663lj2
    /* renamed from: b */
    public AbstractC52360yi2 serialize(Point point, Type type, InterfaceC44070kj2 interfaceC44070kj2) {
        Double d;
        C41095fi2 c41095fi2 = new C41095fi2();
        Double d2 = null;
        if (point != null) {
            d = Double.valueOf(point.f66611x);
        } else {
            d = null;
        }
        c41095fi2.m41012x(d);
        if (point != null) {
            d2 = Double.valueOf(point.f66612y);
        }
        c41095fi2.m41012x(d2);
        return c41095fi2;
    }
}
