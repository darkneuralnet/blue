package p000;

import co.bird.android.model.wire.WireItemScrapReason;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.functions.InterfaceC23484g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.full.KClasses;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, m28432d2 = {"LLo5;", "Lf1;", "LMo5;", "LNo5;", "renderer", "", "n", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrapOrderReasonPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderReasonPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/scrap/dialogs/ScrapOrderReasonPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,21:1\n199#2:22\n*S KotlinDebug\n*F\n+ 1 ScrapOrderReasonPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/scrap/dialogs/ScrapOrderReasonPresenter\n*L\n12#1:22\n*E\n"})
/* renamed from: Lo5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34318Lo5 extends AbstractC20169f1<InterfaceC34552Mo5, InterfaceC34786No5> {

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "reasons", "", "Lco/bird/android/model/wire/WireItemScrapReason;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Lo5$a */
    /* loaded from: classes3.dex */
    public static final class C5091a extends Lambda implements Function1<List<? extends WireItemScrapReason>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LNo5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LNo5;)LNo5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nScrapOrderReasonPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderReasonPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/scrap/dialogs/ScrapOrderReasonPresenter$consume$1$1\n+ 2 ScrapOrderReasonState.kt\nco/bird/android/feature/transferorder/scanner/outbound/scrap/dialogs/ScrapOrderReasonStateKt\n*L\n1#1,21:1\n21#2,8:22\n*S KotlinDebug\n*F\n+ 1 ScrapOrderReasonPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/scrap/dialogs/ScrapOrderReasonPresenter$consume$1$1\n*L\n15#1:22,8\n*E\n"})
        /* renamed from: Lo5$a$a */
        /* loaded from: classes3.dex */
        public static final class C5092a extends Lambda implements Function1<InterfaceC34786No5, InterfaceC34786No5> {

            /* renamed from: g */
            public final /* synthetic */ List<WireItemScrapReason> f22087g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5092a(List<WireItemScrapReason> list) {
                super(1);
                this.f22087g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC34786No5 invoke(InterfaceC34786No5 state) {
                InterfaceC34786No5 interfaceC34786No5;
                Intrinsics.checkNotNullParameter(state, "state");
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(C37037Xe6.class);
                if (!(state instanceof C37037Xe6)) {
                    KFunction primaryConstructor = KClasses.getPrimaryConstructor(orCreateKotlinClass);
                    if (primaryConstructor != null) {
                        interfaceC34786No5 = (InterfaceC34786No5) primaryConstructor.call(state.mo76738c(), state.mo76740a(), state.mo76739b());
                    } else {
                        interfaceC34786No5 = null;
                    }
                    if (interfaceC34786No5 != null) {
                        state = (C37037Xe6) interfaceC34786No5;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type co.bird.android.feature.transferorder.scanner.outbound.scrap.dialogs.UpdateUi");
                    }
                }
                List<WireItemScrapReason> reasons = this.f22087g;
                Intrinsics.checkNotNullExpressionValue(reasons, "reasons");
                return C37037Xe6.copy$default((C37037Xe6) state, null, reasons, null, 5, null);
            }
        }

        public C5091a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireItemScrapReason> list) {
            invoke2((List<WireItemScrapReason>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireItemScrapReason> list) {
            C34318Lo5.this.m42279i(new C5092a(list));
        }
    }

    public C34318Lo5() {
        super(new C37037Xe6(null, null, null, 7, null));
    }

    /* renamed from: f */
    public static final void m96330f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: n */
    public void consume(InterfaceC34552Mo5 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Object m33135e = renderer.mo94779O().m33135e(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5091a c5091a = new C5091a();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: Ko5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34318Lo5.m96330f(Function1.this, obj);
            }
        });
    }
}
