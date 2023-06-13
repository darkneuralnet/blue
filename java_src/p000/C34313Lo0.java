package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireBird;
import io.reactivex.AbstractC23442F;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J \u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0015"}, m28432d2 = {"LLo0;", "LtA;", "LJo0;", "Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/F;", "", "LH6;", DateTokenConverter.CONVERTER_KEY, "", "showLockCommand", "showAlarmCommand", "showSleepCommand", "", "c", "b", "Z", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.lib.command"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Lo0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C34313Lo0 extends AbstractC28540tA implements InterfaceC33845Jo0 {

    /* renamed from: b */
    public boolean f22079b;

    /* renamed from: c */
    public boolean f22080c;

    /* renamed from: d */
    public boolean f22081d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34313Lo0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f22079b = true;
        this.f22080c = true;
        this.f22081d = true;
    }

    /* renamed from: s */
    public static final List m96332s(C34313Lo0 this$0, WireBird bird) {
        List listOf;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bird, "$bird");
        listOf = CollectionsKt__CollectionsJVMKt.listOf(this$0.m12967h(bird, new C2637G6(this$0.m12962m().getString(C45871nl4.command_center_command_title), C45851nj4.item_work_order_command_header, false, 4, null), this$0.f22079b, this$0.f22080c, this$0.f22081d));
        return listOf;
    }

    @Override // p000.InterfaceC33845Jo0
    /* renamed from: c */
    public void mo96335c(boolean z, boolean z2, boolean z3) {
        this.f22079b = z;
        this.f22080c = z2;
        this.f22081d = z3;
    }

    @Override // p000.InterfaceC33845Jo0
    /* renamed from: d */
    public AbstractC23442F<List<C3023H6>> mo96334d(final WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: Ko0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m96332s;
                m96332s = C34313Lo0.m96332s(C34313Lo0.this, bird);
                return m96332s;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      val…tOf(commandSection)\n    }");
        return m33161E;
    }
}
