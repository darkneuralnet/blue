package p000;

import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, m28432d2 = {"Lox;", "LxE;", "Lco/bird/android/core/mvp/BaseActivity;", "Sl", "", "throwable", "Lio/reactivex/F;", "", "Ql", "Lh4;", "b", "Lh4;", "binding", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lh4;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBankRedirectLaunchUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BankRedirectLaunchUi.kt\nco/bird/android/feature/payment/bankredirect/BankRedirectLaunchUi\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
/* renamed from: ox */
/* loaded from: classes3.dex */
public final class C27107ox extends AbstractC30071xE {

    /* renamed from: b */
    public final C22546h4 f102793b;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ox$a */
    /* loaded from: classes3.dex */
    public static final class C27108a extends Lambda implements Function1<DialogResponse, Unit> {

        /* renamed from: g */
        public static final C27108a f102794g = new C27108a();

        public C27108a() {
            super(1);
        }

        /* renamed from: a */
        public final void m20246a(DialogResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23442F.m33158H(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m20246a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27107ox(BaseActivity activity, C22546h4 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f102793b = binding;
    }

    /* renamed from: Rl */
    public static final Unit m20248Rl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* renamed from: Ql */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC23442F<Unit> m20249Ql(Throwable throwable) {
        boolean z;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        String message = throwable.getMessage();
        if (message != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(message);
            if (!isBlank) {
                z = true;
                if (!z) {
                    message = null;
                }
                if (message == null) {
                    message = getActivity().getResources().getString(C45871nl4.error_generic_body);
                    Intrinsics.checkNotNullExpressionValue(message, "activity.resources.getSt…tring.error_generic_body)");
                }
                AbstractC23442F<DialogResponse> birdDialog = birdDialog(new JL3(message), false, true);
                final C27108a c27108a = C27108a.f102794g;
                AbstractC23442F m33157I = birdDialog.m33157I(new InterfaceC23492o() { // from class: nx
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Unit m20248Rl;
                        m20248Rl = C27107ox.m20248Rl(Function1.this, obj);
                        return m20248Rl;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m33157I, "birdDialog(\n      alert …map { Single.just(Unit) }");
                return m33157I;
            }
        }
        z = false;
        if (!z) {
        }
        if (message == null) {
        }
        AbstractC23442F<DialogResponse> birdDialog2 = birdDialog(new JL3(message), false, true);
        final Function1 c27108a2 = C27108a.f102794g;
        AbstractC23442F m33157I2 = birdDialog2.m33157I(new InterfaceC23492o() { // from class: nx
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit m20248Rl;
                m20248Rl = C27107ox.m20248Rl(Function1.this, obj);
                return m20248Rl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I2, "birdDialog(\n      alert …map { Single.just(Unit) }");
        return m33157I2;
    }

    /* renamed from: Sl */
    public final BaseActivity m20247Sl() {
        return getActivity();
    }
}
