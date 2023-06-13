package co.bird.android.app.feature.map.modelmanager;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C41318g46;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "id", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class BirdModelManager$onBirdFilterDirty$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ BirdModelManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirdModelManager$onBirdFilterDirty$1(BirdModelManager birdModelManager) {
        super(1);
        this.this$0 = birdModelManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String id) {
        C41318g46.AbstractC20723b logger;
        Intrinsics.checkNotNullParameter(id, "id");
        logger = this.this$0.getLogger();
        logger.mo7221o("Bird filter: " + id + " has been marked dirty.", new Object[0]);
        this.this$0.render();
    }
}
