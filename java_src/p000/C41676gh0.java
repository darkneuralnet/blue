package p000;

import android.widget.Button;
import android.widget.CheckBox;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m28432d2 = {"Lgh0;", "LxE;", "Leh0;", "Lio/reactivex/Observable;", "", "Z5", "", "birdId", "m", "Li3;", "b", "Li3;", "binding", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Li3;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: gh0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C41676gh0 extends AbstractC30071xE implements InterfaceC40490eh0 {

    /* renamed from: b */
    public final C23106i3 f84036b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gh0$a */
    /* loaded from: classes2.dex */
    public static final class C22411a extends Lambda implements Function1<Boolean, Unit> {
        public C22411a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean it) {
            Button button = C41676gh0.this.f84036b.f86651c;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            button.setEnabled(it.booleanValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41676gh0(BaseActivity activity, C23106i3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f84036b = binding;
        CheckBox checkBox = binding.f86652d;
        Intrinsics.checkNotNullExpressionValue(checkBox, "binding.certifyCheckBox");
        AbstractC49595u22<Boolean> m96513a = C34228Le5.m96513a(checkBox);
        final C22411a c22411a = new C22411a();
        m96513a.subscribe(new InterfaceC23484g() { // from class: fh0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41676gh0._init_$lambda$0(Function1.this, obj);
            }
        });
    }

    public static final void _init_$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC40490eh0
    /* renamed from: Z5 */
    public Observable<Unit> mo37906Z5() {
        Button button = this.f84036b.f86651c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.certifyButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC40490eh0
    /* renamed from: m */
    public void mo37905m(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.f84036b.f86650b.setText(birdId);
    }
}
