package co.bird.android.app.feature.map.presenter;

import co.bird.android.model.constant.MapMode;
import co.bird.android.model.persistence.Area;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/persistence/Area;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class MapPresenterImpl$listenForAreaUpdates$1 extends Lambda implements Function1<List<? extends Area>, Boolean> {
    final /* synthetic */ MapPresenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapPresenterImpl$listenForAreaUpdates$1(MapPresenterImpl mapPresenterImpl) {
        super(1);
        this.this$0 = mapPresenterImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(List<? extends Area> list) {
        return invoke2((List<Area>) list);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2(List<Area> it) {
        C36207Tq4 c36207Tq4;
        boolean z;
        C22454gl c22454gl;
        Intrinsics.checkNotNullParameter(it, "it");
        c36207Tq4 = this.this$0.reactiveConfig;
        if (c36207Tq4.m82623f8().m73665a().getOperatorConfig().getFeatures().getZoneMap().getEnable()) {
            c22454gl = this.this$0.preference;
            if (c22454gl.m37571t0() == MapMode.OPERATOR) {
                z = false;
                return Boolean.valueOf(z);
            }
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
