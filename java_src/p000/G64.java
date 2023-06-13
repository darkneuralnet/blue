package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.Folder;
import co.bird.android.model.constant.TransferOrderDemandSource;
import co.bird.android.model.wire.WireContainerOrder;
import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireTransferOrder;
import co.bird.android.model.wire.WireTransferOrderLineItem;
import co.bird.android.retakeablephoto.RetakeablePhotoActivity;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24552a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.G64;
import p000.H31;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\b\b\u0001\u0010%\u001a\u00020\"¢\u0006\u0004\b/\u00100J\u0006\u0010\u0003\u001a\u00020\u0002J \u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010+\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010'0'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R.\u0010.\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\" (*\n\u0012\u0004\u0012\u00020\"\u0018\u00010,0,0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*¨\u00061"}, m28432d2 = {"LG64;", "", "", "l", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "k", "LL64;", C17296a.f69688o, "LL64;", "ui", "Lv64;", "b", "Lv64;", "converter", "Le13;", "c", "Le13;", "navigator", "LTq4;", DateTokenConverter.CONVERTER_KEY, "LTq4;", "reactiveConfig", "Lcom/uber/autodispose/ScopeProvider;", "e", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LO86;", "f", "LO86;", "transferOrderManager", "", "g", "Ljava/lang/String;", "containerOrderId", "Lio/reactivex/subjects/a;", "Lco/bird/android/model/wire/WireContainerOrder;", "kotlin.jvm.PlatformType", "h", "Lio/reactivex/subjects/a;", "containerOrderSubject", "", "i", "photosUploadedSubject", "<init>", "(LL64;Lv64;Le13;LTq4;Lcom/uber/autodispose/ScopeProvider;LO86;Ljava/lang/String;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nProcessContainerOrderPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessContainerOrderPresenter.kt\nco/bird/android/feature/transferorder/container/processing/ProcessContainerOrderPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,131:1\n180#2:132\n180#2:133\n199#2:134\n180#2:135\n180#2:136\n*S KotlinDebug\n*F\n+ 1 ProcessContainerOrderPresenter.kt\nco/bird/android/feature/transferorder/container/processing/ProcessContainerOrderPresenter\n*L\n45#1:132\n54#1:133\n59#1:134\n68#1:135\n109#1:136\n*E\n"})
/* renamed from: G64 */
/* loaded from: classes3.dex */
public final class G64 {

    /* renamed from: a */
    public final L64 f10960a;

    /* renamed from: b */
    public final C50229v64 f10961b;

    /* renamed from: c */
    public final InterfaceC40099e13 f10962c;

    /* renamed from: d */
    public final C36207Tq4 f10963d;

    /* renamed from: e */
    public final ScopeProvider f10964e;

    /* renamed from: f */
    public final O86 f10965f;

    /* renamed from: g */
    public final String f10966g;

    /* renamed from: h */
    public final C24552a<WireContainerOrder> f10967h;

    /* renamed from: i */
    public final C24552a<List<String>> f10968i;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/DialogResponse;", "Lco/bird/android/model/constant/TransferOrderDemandSource;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: G64$a */
    /* loaded from: classes3.dex */
    public static final class C2638a extends Lambda implements Function1<Pair<? extends DialogResponse, ? extends TransferOrderDemandSource>, Unit> {
        public C2638a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends DialogResponse, ? extends TransferOrderDemandSource> pair) {
            invoke2(pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends DialogResponse, ? extends TransferOrderDemandSource> pair) {
            DialogResponse component1 = pair.component1();
            if (pair.component2() == TransferOrderDemandSource.SCRAP_REMOVAL && component1 == DialogResponse.OK) {
                G64.this.f10962c.mo37150J(InterfaceC40099e13.EnumC19925b.RESULT_OK, new Pair[0]);
            } else if (component1 == DialogResponse.OK) {
                G64.this.f10962c.mo36919x0(G64.this.f10966g);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: G64$b */
    /* loaded from: classes3.dex */
    public static final class C2639b extends Lambda implements Function1<Unit, Unit> {
        public C2639b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToRetakeablePhoto$default(G64.this.f10962c, null, null, Folder.TRANSFER_ORDERS_BOL_PHOTOS, null, Boolean.valueOf(G64.this.f10963d.m82623f8().m73665a().getOperatorConfig().getFeatures().getTransferOrder().getOverrideUploadBOLViaSignedUrl()), false, 43, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: G64$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C2640c extends FunctionReferenceImpl implements Function1<List<? extends String>, Unit> {
        public C2640c(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
            invoke2((List<String>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<String> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: G64$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C2641d extends FunctionReferenceImpl implements Function1<WireContainerOrder, Unit> {
        public C2641d(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m105789a(WireContainerOrder p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireContainerOrder wireContainerOrder) {
            m105789a(wireContainerOrder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: G64$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C2642e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C2642e(Object obj) {
            super(1, obj, L64.class, "error", "error(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((L64) this.receiver).error(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\t\u001ar\u00122\b\u0001\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u0004\u0012\u00020\b \u0002*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u00000\u0000 \u0002*8\u00122\b\u0001\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u0004\u0012\u00020\b \u0002*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u00000\u0000\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireContainerOrder;", "kotlin.jvm.PlatformType", "", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LH6;", "", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: G64$f */
    /* loaded from: classes3.dex */
    public static final class C2643f extends Lambda implements Function1<Pair<? extends WireContainerOrder, ? extends List<? extends String>>, InterfaceC23447K<? extends Pair<? extends List<? extends C3023H6>, ? extends Boolean>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "LH6;", "it", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: G64$f$a */
        /* loaded from: classes3.dex */
        public static final class C2644a extends Lambda implements Function1<List<? extends C3023H6>, Pair<? extends List<? extends C3023H6>, ? extends Boolean>> {

            /* renamed from: g */
            public final /* synthetic */ List<String> f10972g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2644a(List<String> list) {
                super(1);
                this.f10972g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<List<C3023H6>, Boolean> invoke(List<C3023H6> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                List<String> photoUrl = this.f10972g;
                Intrinsics.checkNotNullExpressionValue(photoUrl, "photoUrl");
                return TuplesKt.m28425to(it, Boolean.valueOf(!photoUrl.isEmpty()));
            }
        }

        public C2643f() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<List<C3023H6>, Boolean>> invoke(Pair<WireContainerOrder, ? extends List<String>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireContainerOrder containerOrder = pair.component1();
            List<String> photoUrl = pair.component2();
            C50229v64 c50229v64 = G64.this.f10961b;
            Intrinsics.checkNotNullExpressionValue(containerOrder, "containerOrder");
            Intrinsics.checkNotNullExpressionValue(photoUrl, "photoUrl");
            AbstractC23442F<List<C3023H6>> m9186b = c50229v64.m9186b(containerOrder, photoUrl);
            final C2644a c2644a = new C2644a(photoUrl);
            return m9186b.m33157I(new InterfaceC23492o() { // from class: H64
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = G64.C2643f.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003 \u0004*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "LH6;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: G64$g */
    /* loaded from: classes3.dex */
    public static final class C2645g extends Lambda implements Function1<Pair<? extends List<? extends C3023H6>, ? extends Boolean>, Unit> {
        public C2645g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends C3023H6>, ? extends Boolean> pair) {
            invoke2((Pair<? extends List<C3023H6>, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<C3023H6>, Boolean> pair) {
            List<C3023H6> sections = pair.component1();
            boolean booleanValue = pair.component2().booleanValue();
            L64 l64 = G64.this.f10960a;
            Intrinsics.checkNotNullExpressionValue(sections, "sections");
            l64.m97765b(sections);
            G64.this.f10960a.m97768Rl(booleanValue);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireContainerOrder;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "c", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: G64$h */
    /* loaded from: classes3.dex */
    public static final class C2646h extends Lambda implements Function1<Pair<? extends Unit, ? extends WireContainerOrder>, InterfaceC24574u<? extends WireContainerOrder>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: G64$h$a */
        /* loaded from: classes3.dex */
        public static final class C2647a extends Lambda implements Function1<DialogResponse, Boolean> {

            /* renamed from: g */
            public static final C2647a f10975g = new C2647a();

            public C2647a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(DialogResponse response) {
                boolean z;
                Intrinsics.checkNotNullParameter(response, "response");
                if (response == DialogResponse.OK) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lco/bird/android/model/wire/WireContainerOrder;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lco/bird/android/model/wire/WireContainerOrder;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: G64$h$b */
        /* loaded from: classes3.dex */
        public static final class C2648b extends Lambda implements Function1<DialogResponse, WireContainerOrder> {

            /* renamed from: g */
            public final /* synthetic */ WireContainerOrder f10976g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2648b(WireContainerOrder wireContainerOrder) {
                super(1);
                this.f10976g = wireContainerOrder;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final WireContainerOrder invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f10976g;
            }
        }

        public C2646h() {
            super(1);
        }

        /* renamed from: d */
        public static final WireContainerOrder m105782d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (WireContainerOrder) tmp0.invoke(obj);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends WireContainerOrder> invoke(Pair<Unit, WireContainerOrder> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireContainerOrder containerOrder = pair.component2();
            O86 o86 = G64.this.f10965f;
            Intrinsics.checkNotNullExpressionValue(containerOrder, "containerOrder");
            if (!o86.mo80283s(containerOrder)) {
                return AbstractC24507p.m32068G(containerOrder);
            }
            AbstractC23442F birdDialog$default = H31.C3014a.birdDialog$default(G64.this.f10960a, C52284ya6.f119776d, false, false, 6, null);
            final C2647a c2647a = C2647a.f10975g;
            AbstractC24507p m33098z = birdDialog$default.m33098z(new InterfaceC23494q() { // from class: I64
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = G64.C2646h.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            final C2648b c2648b = new C2648b(containerOrder);
            return m33098z.m32067H(new InterfaceC23492o() { // from class: J64
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    WireContainerOrder m105782d;
                    m105782d = G64.C2646h.m105782d(Function1.this, obj);
                    return m105782d;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireContainerOrder;", "kotlin.jvm.PlatformType", "", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: G64$i */
    /* loaded from: classes3.dex */
    public static final class C2649i extends Lambda implements Function1<Pair<? extends WireContainerOrder, ? extends List<? extends String>>, InterfaceC23447K<? extends WireContainerOrder>> {
        public C2649i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends WireContainerOrder> invoke(Pair<WireContainerOrder, ? extends List<String>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireContainerOrder containerOrder = pair.component1();
            List<String> photoUrls = pair.component2();
            O86 o86 = G64.this.f10965f;
            Intrinsics.checkNotNullExpressionValue(containerOrder, "containerOrder");
            O86 o862 = G64.this.f10965f;
            String str = G64.this.f10966g;
            Intrinsics.checkNotNullExpressionValue(photoUrls, "photoUrls");
            return o862.mo80293k(str, photoUrls, !o86.mo80283s(containerOrder));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001ab\u0012*\b\u0001\u0012&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00030\u0003 \u0006*0\u0012*\b\u0001\u0012&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/wire/WireContainerOrder;", "containerOrder", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/model/DialogResponse;", "Lco/bird/android/model/constant/TransferOrderDemandSource;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WireContainerOrder;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: G64$j */
    /* loaded from: classes3.dex */
    public static final class C2650j extends Lambda implements Function1<WireContainerOrder, InterfaceC23447K<? extends Pair<? extends DialogResponse, ? extends TransferOrderDemandSource>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a&\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0003 \u0004*\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lkotlin/Pair;", "Lco/bird/android/model/constant/TransferOrderDemandSource;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: G64$j$a */
        /* loaded from: classes3.dex */
        public static final class C2651a extends Lambda implements Function1<DialogResponse, Pair<? extends DialogResponse, ? extends TransferOrderDemandSource>> {

            /* renamed from: g */
            public final /* synthetic */ TransferOrderDemandSource f10979g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2651a(TransferOrderDemandSource transferOrderDemandSource) {
                super(1);
                this.f10979g = transferOrderDemandSource;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<DialogResponse, TransferOrderDemandSource> invoke(DialogResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return TuplesKt.m28425to(response, this.f10979g);
            }
        }

        public C2650j() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<DialogResponse, TransferOrderDemandSource>> invoke(WireContainerOrder containerOrder) {
            Object firstOrNull;
            TransferOrderDemandSource transferOrderDemandSource;
            AbstractC23442F<DialogResponse> m97769Ql;
            WireTransferOrderLineItem transferOrderLineItem;
            WireTransferOrder transferOrder;
            Intrinsics.checkNotNullParameter(containerOrder, "containerOrder");
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) containerOrder.getSkuOrders());
            WireSkuOrder wireSkuOrder = (WireSkuOrder) firstOrNull;
            if (wireSkuOrder != null && (transferOrderLineItem = wireSkuOrder.getTransferOrderLineItem()) != null && (transferOrder = transferOrderLineItem.getTransferOrder()) != null) {
                transferOrderDemandSource = transferOrder.getDemandSource();
            } else {
                transferOrderDemandSource = null;
            }
            if (transferOrderDemandSource == TransferOrderDemandSource.SCRAP_REMOVAL) {
                m97769Ql = AbstractC23442F.m33158H(DialogResponse.OK);
            } else if (G64.this.f10965f.mo80283s(containerOrder)) {
                m97769Ql = G64.this.f10960a.m97770Pl();
            } else {
                m97769Ql = G64.this.f10960a.m97769Ql(G64.this.f10966g);
            }
            final C2651a c2651a = new C2651a(transferOrderDemandSource);
            return m97769Ql.m33157I(new InterfaceC23492o() { // from class: K64
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = G64.C2650j.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    public G64(L64 ui, C50229v64 converter, InterfaceC40099e13 navigator, C36207Tq4 reactiveConfig, ScopeProvider scopeProvider, O86 transferOrderManager, String containerOrderId) {
        List emptyList;
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(transferOrderManager, "transferOrderManager");
        Intrinsics.checkNotNullParameter(containerOrderId, "containerOrderId");
        this.f10960a = ui;
        this.f10961b = converter;
        this.f10962c = navigator;
        this.f10963d = reactiveConfig;
        this.f10964e = scopeProvider;
        this.f10965f = transferOrderManager;
        this.f10966g = containerOrderId;
        C24552a<WireContainerOrder> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<WireContainerOrder>()");
        this.f10967h = m31922e;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        C24552a<List<String>> m31921g = C24552a.m31921g(emptyList);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(listOf<String>())");
        this.f10968i = m31921g;
    }

    /* renamed from: m */
    public static final void m105799m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m105798n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m105797o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m105796p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final InterfaceC23447K m105795q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m105794r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final InterfaceC24574u m105793s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final InterfaceC23447K m105792t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final InterfaceC23447K m105791u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m105790v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public final void m105801k(int i, int i2, Intent intent) {
        String stringExtra;
        List<String> mutableListOf;
        if (i == C30906z6.m1823a(Reflection.getOrCreateKotlinClass(RetakeablePhotoActivity.class)) && i2 == -1 && intent != null && (stringExtra = intent.getStringExtra("photo_url")) != null) {
            mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(stringExtra);
            List<String> it = this.f10968i.getValue();
            if (it != null) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                mutableListOf.addAll(it);
            }
            this.f10968i.onNext(mutableListOf);
        }
    }

    /* renamed from: l */
    public final void m105800l() {
        Object m33094as = this.f10960a.m97764g().m33094as(AutoDispose.m45239a(this.f10964e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2639b c2639b = new C2639b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: w64
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                G64.m105799m(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f10960a.m97767Sl().m33094as(AutoDispose.m45239a(this.f10964e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2640c c2640c = new C2640c(this.f10968i);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: x64
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                G64.m105798n(Function1.this, obj);
            }
        });
        AbstractC23442F<WireContainerOrder> m33146T = this.f10965f.mo80297g(this.f10966g).m33146T(3L);
        Intrinsics.checkNotNullExpressionValue(m33146T, "transferOrderManager.get…rOrderId)\n      .retry(3)");
        Object m33135e = m33146T.m33135e(AutoDispose.m45239a(this.f10964e));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2641d c2641d = new C2641d(this.f10967h);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: y64
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                G64.m105797o(Function1.this, obj);
            }
        };
        final C2642e c2642e = new C2642e(this.f10960a);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: z64
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                G64.m105796p(Function1.this, obj);
            }
        });
        Observable m31954c = C24523e.f91168a.m31954c(this.f10967h, this.f10968i);
        final C2643f c2643f = new C2643f();
        Observable observeOn = m31954c.flatMapSingle(new InterfaceC23492o() { // from class: A64
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m105795q;
                m105795q = G64.m105795q(Function1.this, obj);
                return m105795q;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "fun onResume() {\n    ui.…Id)\n        }\n      }\n  }");
        Object m33094as3 = observeOn.m33094as(AutoDispose.m45239a(this.f10964e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2645g c2645g = new C2645g();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: B64
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                G64.m105794r(Function1.this, obj);
            }
        });
        Observable m31950a = C24527f.m31950a(this.f10960a.m97766Tl(), this.f10967h);
        final C2646h c2646h = new C2646h();
        Observable flatMapMaybe = m31950a.flatMapMaybe(new InterfaceC23492o() { // from class: C64
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m105793s;
                m105793s = G64.m105793s(Function1.this, obj);
                return m105793s;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "fun onResume() {\n    ui.…Id)\n        }\n      }\n  }");
        Observable m31950a2 = C24527f.m31950a(flatMapMaybe, this.f10968i);
        final C2649i c2649i = new C2649i();
        Observable observeOn2 = m31950a2.flatMapSingle(new InterfaceC23492o() { // from class: D64
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m105792t;
                m105792t = G64.m105792t(Function1.this, obj);
                return m105792t;
            }
        }).observeOn(C23454a.m33087a());
        final C2650j c2650j = new C2650j();
        Observable flatMapSingle = observeOn2.flatMapSingle(new InterfaceC23492o() { // from class: E64
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m105791u;
                m105791u = G64.m105791u(Function1.this, obj);
                return m105791u;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "fun onResume() {\n    ui.…Id)\n        }\n      }\n  }");
        Observable retry = C38689bg5.m64176e(flatMapSingle, this.f10960a).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "fun onResume() {\n    ui.…Id)\n        }\n      }\n  }");
        Object m33094as4 = retry.m33094as(AutoDispose.m45239a(this.f10964e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2638a c2638a = new C2638a();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: F64
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                G64.m105790v(Function1.this, obj);
            }
        });
    }
}
