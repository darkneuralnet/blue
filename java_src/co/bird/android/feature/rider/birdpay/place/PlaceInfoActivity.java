package co.bird.android.feature.rider.birdpay.place;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.rider.birdpay.place.InterfaceC15477b;
import co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity;
import co.bird.android.model.Trigger;
import co.bird.android.model.wire.WireMerchantAction;
import co.bird.android.model.wire.WireMerchantSite;
import com.facebook.share.internal.C17296a;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C41318g46;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 52\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b3\u00104J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0016\u0010\u0015\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0016\u0010\u0016\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00067"}, m28432d2 = {"Lco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "F0", "R0", "K0", "", "phoneNumber", "B0", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantAction;", "actionButtonOptional", "f1", "h1", "LoU3;", "B", "LoU3;", "E0", "()LoU3;", "setViewModel", "(LoU3;)V", "viewModel", "LN4;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LN4;", "binding", "LA2;", "D", "LA2;", "actionAdapter", "LZT3;", "E", "LZT3;", "imageAdapter", "Loe3;", "F", "Loe3;", "offerAdapter", "Lg46$b;", "C0", "()Lg46$b;", "logger", "<init>", "()V", "G", C17296a.f69688o, "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPlaceInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceInfoActivity.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,375:1\n44#2:376\n44#2:378\n44#2:380\n44#2:382\n44#2:384\n44#2:386\n44#2:389\n44#2:391\n44#2:393\n44#2:395\n44#2:397\n44#2:399\n44#2:401\n44#2:403\n44#2:405\n44#2:407\n44#2:409\n44#2:411\n44#2:413\n44#2:415\n44#2:417\n44#2:419\n44#2:421\n180#3:377\n180#3:379\n180#3:381\n180#3:383\n180#3:385\n180#3:387\n199#3:388\n180#3:390\n180#3:392\n180#3:394\n180#3:396\n180#3:398\n180#3:400\n180#3:402\n180#3:404\n180#3:406\n180#3:408\n180#3:410\n180#3:412\n180#3:414\n180#3:416\n180#3:418\n180#3:420\n180#3:422\n*S KotlinDebug\n*F\n+ 1 PlaceInfoActivity.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity\n*L\n97#1:376\n101#1:378\n106#1:380\n115#1:382\n120#1:384\n127#1:386\n148#1:389\n163#1:391\n173#1:393\n183#1:395\n196#1:397\n206#1:399\n216#1:401\n226#1:403\n236#1:405\n246#1:407\n256#1:409\n274#1:411\n284#1:413\n294#1:415\n304#1:417\n314#1:419\n334#1:421\n97#1:377\n101#1:379\n106#1:381\n115#1:383\n120#1:385\n127#1:387\n134#1:388\n148#1:390\n163#1:392\n173#1:394\n183#1:396\n196#1:398\n206#1:400\n216#1:402\n226#1:404\n236#1:406\n246#1:408\n256#1:410\n274#1:412\n284#1:414\n294#1:416\n304#1:418\n314#1:420\n334#1:422\n*E\n"})
/* loaded from: classes3.dex */
public final class PlaceInfoActivity extends BaseActivity {

    /* renamed from: G */
    public static final C15442a f65048G = new C15442a(null);

    /* renamed from: B */
    public InterfaceC46299oU3 f65049B;

    /* renamed from: C */
    public C5472N4 f65050C;

    /* renamed from: D */
    public final C0008A2 f65051D;

    /* renamed from: E */
    public final ZT3 f65052E;

    /* renamed from: F */
    public final C46393oe3 f65053F;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$A */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15423A extends FunctionReferenceImpl implements Function1<List<C45800ne3>, Unit> {
        public C15423A(Object obj) {
            super(1, obj, C46393oe3.class, "submitList", "submitList(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<C45800ne3> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C45800ne3> list) {
            ((C46393oe3) this.receiver).submitList(list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$B */
    /* loaded from: classes3.dex */
    public static final class C15424B extends Lambda implements Function1<Throwable, Unit> {
        public C15424B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            PlaceInfoActivity.this.m57147C0().mo7212z(throwable, "Error occurred while tapping on action button", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062b\u0010\u0005\u001a^\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004 \u0002*.\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/wire/WireMerchantAction;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/wire/WireMerchantSite;", "", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$C */
    /* loaded from: classes3.dex */
    public static final class C15425C extends Lambda implements Function1<Triple<? extends WireMerchantAction, ? extends WireMerchantSite, ? extends String>, Unit> {
        public C15425C() {
            super(1);
        }

        /* renamed from: a */
        public final void m57119a(Triple<WireMerchantAction, WireMerchantSite, String> triple) {
            WireMerchantSite component2 = triple.component2();
            triple.component3();
            PlaceInfoActivity.this.m58975F().mo55905y(new DQ2(null, null, null, component2.getMerchant().getId(), component2.getId(), component2.getMerchant().getName(), triple.component1().getUri(), 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends WireMerchantAction, ? extends WireMerchantSite, ? extends String> triple) {
            m57119a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$D */
    /* loaded from: classes3.dex */
    public static final class C15426D extends Lambda implements Function1<Throwable, Unit> {
        public C15426D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            PlaceInfoActivity.this.m57147C0().mo7212z(throwable, "Error occurred while tapping on action button", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062b\u0010\u0005\u001a^\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004 \u0002*.\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/wire/WireMerchantAction;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/wire/WireMerchantSite;", "", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$E */
    /* loaded from: classes3.dex */
    public static final class C15427E extends Lambda implements Function1<Triple<? extends WireMerchantAction, ? extends WireMerchantSite, ? extends String>, Unit> {
        public C15427E() {
            super(1);
        }

        /* renamed from: a */
        public final void m57118a(Triple<WireMerchantAction, WireMerchantSite, String> triple) {
            String title = triple.component3();
            InterfaceC46299oU3 m57146E0 = PlaceInfoActivity.this.m57146E0();
            String uri = triple.component1().getUri();
            Intrinsics.checkNotNullExpressionValue(title, "title");
            m57146E0.mo20992y0(uri, title);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends WireMerchantAction, ? extends WireMerchantSite, ? extends String> triple) {
            m57118a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$F */
    /* loaded from: classes3.dex */
    public static final class C15428F extends Lambda implements Function1<Throwable, Unit> {
        public C15428F() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            PlaceInfoActivity.this.m57147C0().mo7212z(throwable, "Error occurred while observing title changes", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "title", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$G */
    /* loaded from: classes3.dex */
    public static final class C15429G extends Lambda implements Function1<String, Unit> {
        public C15429G() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C5472N4 c5472n4 = PlaceInfoActivity.this.f65050C;
            if (c5472n4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c5472n4 = null;
            }
            c5472n4.f24094v.setText(str);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$H */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15430H extends FunctionReferenceImpl implements Function1<List<XT3>, Unit> {
        public C15430H(Object obj) {
            super(1, obj, ZT3.class, "submitList", "submitList(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<XT3> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<XT3> list) {
            ((ZT3) this.receiver).submitList(list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$I */
    /* loaded from: classes3.dex */
    public static final class C15431I extends Lambda implements Function1<Throwable, Unit> {
        public C15431I() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            PlaceInfoActivity.this.m57147C0().mo7212z(throwable, "Error occurred while observing asset urls", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$J */
    /* loaded from: classes3.dex */
    public static final class C15432J extends Lambda implements Function1<Throwable, Unit> {
        public C15432J() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            PlaceInfoActivity.this.m57147C0().mo7212z(throwable, "Error occurred while observing description visibility changes", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "visible", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPlaceInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceInfoActivity.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity$observeViewModel$8\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,375:1\n262#2,2:376\n*S KotlinDebug\n*F\n+ 1 PlaceInfoActivity.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity$observeViewModel$8\n*L\n185#1:376,2\n*E\n"})
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$K */
    /* loaded from: classes3.dex */
    public static final class C15433K extends Lambda implements Function1<Boolean, Unit> {
        public C15433K() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean visible) {
            C5472N4 c5472n4 = PlaceInfoActivity.this.f65050C;
            if (c5472n4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c5472n4 = null;
            }
            TextView textView = c5472n4.f24076d;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.descriptionTv");
            Intrinsics.checkNotNullExpressionValue(visible, "visible");
            textView.setVisibility(visible.booleanValue() ? 0 : 8);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$L */
    /* loaded from: classes3.dex */
    public static final class C15434L extends Lambda implements Function1<Throwable, Unit> {
        public C15434L() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            PlaceInfoActivity.this.m57147C0().mo7212z(throwable, "Error occurred while observing description changes", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$M */
    /* loaded from: classes3.dex */
    public static final class C15435M extends Lambda implements Function1<Unit, Unit> {
        public C15435M() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            PlaceInfoActivity.this.m57146E0().mo21005F0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$N */
    /* loaded from: classes3.dex */
    public static final class C15436N extends Lambda implements Function1<Unit, Unit> {
        public C15436N() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            PlaceInfoActivity.this.m57146E0().mo21009B0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062N\u0010\u0005\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*$\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "", "LXT3;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPlaceInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceInfoActivity.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity$setupViewModel$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,375:1\n1549#2:376\n1620#2,3:377\n*S KotlinDebug\n*F\n+ 1 PlaceInfoActivity.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity$setupViewModel$3\n*L\n109#1:376\n109#1:377,3\n*E\n"})
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$O */
    /* loaded from: classes3.dex */
    public static final class C15437O extends Lambda implements Function1<Pair<? extends Integer, ? extends List<? extends XT3>>, Unit> {
        public C15437O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Integer, ? extends List<? extends XT3>> pair) {
            invoke2((Pair<Integer, ? extends List<XT3>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Integer, ? extends List<XT3>> pair) {
            int collectionSizeOrDefault;
            int intValue = pair.component1().intValue();
            List<XT3> images = pair.component2();
            InterfaceC40099e13 mo58957w = PlaceInfoActivity.this.mo58957w();
            Intrinsics.checkNotNullExpressionValue(images, "images");
            List<XT3> list = images;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (XT3 xt3 : list) {
                arrayList.add(TuplesKt.m28425to(xt3.m76969c(), xt3.m76970b()));
            }
            mo58957w.mo37143K0(arrayList, intValue);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$P */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15438P extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C15438P(Object obj) {
            super(1, obj, InterfaceC46299oU3.class, "onOfferAccepted", "onOfferAccepted(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC46299oU3) this.receiver).mo21004G0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*$\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantAction;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$Q */
    /* loaded from: classes3.dex */
    public static final class C15439Q extends Lambda implements Function1<Pair<? extends Unit, ? extends Optional<WireMerchantAction>>, Unit> {
        public C15439Q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends Optional<WireMerchantAction>> pair) {
            invoke2((Pair<Unit, Optional<WireMerchantAction>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, Optional<WireMerchantAction>> pair) {
            Optional<WireMerchantAction> component2 = pair.component2();
            if (component2.m59037c()) {
                PlaceInfoActivity.this.m57146E0().mo20998M0(component2.m59038b());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*$\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantAction;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$R */
    /* loaded from: classes3.dex */
    public static final class C15440R extends Lambda implements Function1<Pair<? extends Unit, ? extends Optional<WireMerchantAction>>, Unit> {
        public C15440R() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends Optional<WireMerchantAction>> pair) {
            invoke2((Pair<Unit, Optional<WireMerchantAction>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, Optional<WireMerchantAction>> pair) {
            Optional<WireMerchantAction> component2 = pair.component2();
            if (component2.m59037c()) {
                PlaceInfoActivity.this.m57146E0().mo20998M0(component2.m59038b());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "site", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPlaceInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceInfoActivity.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity$setupViewModel$7\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,375:1\n260#2:376\n*S KotlinDebug\n*F\n+ 1 PlaceInfoActivity.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity$setupViewModel$7\n*L\n139#1:376\n*E\n"})
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$S */
    /* loaded from: classes3.dex */
    public static final class C15441S extends Lambda implements Function1<WireMerchantSite, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Trigger f65070h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15441S(Trigger trigger) {
            super(1);
            this.f65070h = trigger;
        }

        /* renamed from: a */
        public final void m57117a(WireMerchantSite wireMerchantSite) {
            boolean z;
            String str;
            String name;
            InterfaceC1880Ea m58975F = PlaceInfoActivity.this.m58975F();
            String id = wireMerchantSite.getMerchant().getId();
            String id2 = wireMerchantSite.getId();
            C5472N4 c5472n4 = PlaceInfoActivity.this.f65050C;
            if (c5472n4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c5472n4 = null;
            }
            Button button = c5472n4.f24071A;
            Intrinsics.checkNotNullExpressionValue(button, "binding.secondaryActionButton");
            if (button.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z;
            Trigger trigger = this.f65070h;
            if (trigger != null && (name = trigger.name()) != null) {
                String lowerCase = name.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                str = lowerCase;
            } else {
                str = null;
            }
            m58975F.mo55905y(new C26929oO(null, null, null, str, id, id2, z2, 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireMerchantSite wireMerchantSite) {
            m57117a(wireMerchantSite);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "siteId", "Lco/bird/android/model/Trigger;", "trigger", "", C17296a.f69688o, "KEY_SITE_ID", "Ljava/lang/String;", "TRIGGER", "<init>", "()V", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$a */
    /* loaded from: classes3.dex */
    public static final class C15442a {
        public /* synthetic */ C15442a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void m57116a(Context context, String siteId, Trigger trigger) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(siteId, "siteId");
            Intent intent = new Intent(context, PlaceInfoActivity.class);
            intent.putExtra("site_id", siteId);
            intent.putExtra("trigger", trigger);
            context.startActivity(intent);
        }

        private C15442a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "description", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$b */
    /* loaded from: classes3.dex */
    public static final class C15443b extends Lambda implements Function1<String, Unit> {
        public C15443b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C5472N4 c5472n4 = PlaceInfoActivity.this.f65050C;
            if (c5472n4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c5472n4 = null;
            }
            c5472n4.f24076d.setText(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$c */
    /* loaded from: classes3.dex */
    public static final class C15444c extends Lambda implements Function1<Throwable, Unit> {
        public C15444c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            PlaceInfoActivity.this.m57147C0().mo7212z(throwable, "Error occurred while observing address visibility changes", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "visible", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPlaceInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceInfoActivity.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity$observeViewModel$12\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,375:1\n262#2,2:376\n*S KotlinDebug\n*F\n+ 1 PlaceInfoActivity.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity$observeViewModel$12\n*L\n208#1:376,2\n*E\n"})
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$d */
    /* loaded from: classes3.dex */
    public static final class C15445d extends Lambda implements Function1<Boolean, Unit> {
        public C15445d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean visible) {
            C5472N4 c5472n4 = PlaceInfoActivity.this.f65050C;
            if (c5472n4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c5472n4 = null;
            }
            ConstraintLayout constraintLayout = c5472n4.f24086n;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.locationContainer");
            Intrinsics.checkNotNullExpressionValue(visible, "visible");
            constraintLayout.setVisibility(visible.booleanValue() ? 0 : 8);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$e */
    /* loaded from: classes3.dex */
    public static final class C15446e extends Lambda implements Function1<Throwable, Unit> {
        public C15446e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            PlaceInfoActivity.this.m57147C0().mo7212z(throwable, "Error occurred while observing address changes", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", PaymentMethod.BillingDetails.PARAM_ADDRESS, "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$f */
    /* loaded from: classes3.dex */
    public static final class C15447f extends Lambda implements Function1<String, Unit> {
        public C15447f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C5472N4 c5472n4 = PlaceInfoActivity.this.f65050C;
            if (c5472n4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c5472n4 = null;
            }
            c5472n4.f24088p.setText(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$g */
    /* loaded from: classes3.dex */
    public static final class C15448g extends Lambda implements Function1<Throwable, Unit> {
        public C15448g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            PlaceInfoActivity.this.m57147C0().mo7212z(throwable, "Error occurred while observing hours visibility changes", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "visible", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPlaceInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceInfoActivity.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity$observeViewModel$16\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,375:1\n262#2,2:376\n*S KotlinDebug\n*F\n+ 1 PlaceInfoActivity.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity$observeViewModel$16\n*L\n228#1:376,2\n*E\n"})
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$h */
    /* loaded from: classes3.dex */
    public static final class C15449h extends Lambda implements Function1<Boolean, Unit> {
        public C15449h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean visible) {
            C5472N4 c5472n4 = PlaceInfoActivity.this.f65050C;
            if (c5472n4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c5472n4 = null;
            }
            ConstraintLayout constraintLayout = c5472n4.f24080h;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.hoursContainer");
            Intrinsics.checkNotNullExpressionValue(visible, "visible");
            constraintLayout.setVisibility(visible.booleanValue() ? 0 : 8);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$i */
    /* loaded from: classes3.dex */
    public static final class C15450i extends Lambda implements Function1<Throwable, Unit> {
        public C15450i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            PlaceInfoActivity.this.m57147C0().mo7212z(throwable, "Error occurred while observing hours changes", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "hours", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$j */
    /* loaded from: classes3.dex */
    public static final class C15451j extends Lambda implements Function1<String, Unit> {
        public C15451j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C5472N4 c5472n4 = PlaceInfoActivity.this.f65050C;
            if (c5472n4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c5472n4 = null;
            }
            c5472n4.f24082j.setText(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$k */
    /* loaded from: classes3.dex */
    public static final class C15452k extends Lambda implements Function1<Throwable, Unit> {
        public C15452k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            PlaceInfoActivity.this.m57147C0().mo7212z(throwable, "Error occurred while observing phone visibility changes", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$l */
    /* loaded from: classes3.dex */
    public static final class C15453l extends Lambda implements Function1<Throwable, Unit> {
        public C15453l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            PlaceInfoActivity.this.m57147C0().mo7212z(throwable, "Error occurred while observing toolbar title changes", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "visible", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPlaceInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceInfoActivity.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity$observeViewModel$20\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,375:1\n262#2,2:376\n*S KotlinDebug\n*F\n+ 1 PlaceInfoActivity.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity$observeViewModel$20\n*L\n248#1:376,2\n*E\n"})
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$m */
    /* loaded from: classes3.dex */
    public static final class C15454m extends Lambda implements Function1<Boolean, Unit> {
        public C15454m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean visible) {
            C5472N4 c5472n4 = PlaceInfoActivity.this.f65050C;
            if (c5472n4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c5472n4 = null;
            }
            ConstraintLayout constraintLayout = c5472n4.f24091s;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.phoneContainer");
            Intrinsics.checkNotNullExpressionValue(visible, "visible");
            constraintLayout.setVisibility(visible.booleanValue() ? 0 : 8);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$n */
    /* loaded from: classes3.dex */
    public static final class C15455n extends Lambda implements Function1<Throwable, Unit> {
        public C15455n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            PlaceInfoActivity.this.m57147C0().mo7212z(throwable, "Error occurred while observing phone changes", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", PaymentMethod.BillingDetails.PARAM_PHONE, "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$o */
    /* loaded from: classes3.dex */
    public static final class C15456o extends Lambda implements Function1<String, Unit> {
        public C15456o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C5472N4 c5472n4 = PlaceInfoActivity.this.f65050C;
            if (c5472n4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c5472n4 = null;
            }
            c5472n4.f24093u.setText(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$p */
    /* loaded from: classes3.dex */
    public static final class C15457p extends Lambda implements Function1<Pair<? extends String, ? extends WireMerchantSite>, Unit> {
        public C15457p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends WireMerchantSite> pair) {
            invoke2((Pair<String, WireMerchantSite>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<String, WireMerchantSite> pair) {
            WireMerchantSite component2 = pair.component2();
            PlaceInfoActivity.this.m58975F().mo55905y(new C26467nO(null, null, null, component2.getMerchant().getId(), component2.getId(), 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Pair;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$q */
    /* loaded from: classes3.dex */
    public static final class C15458q extends Lambda implements Function1<Pair<? extends String, ? extends WireMerchantSite>, String> {

        /* renamed from: g */
        public static final C15458q f65086g = new C15458q();

        public C15458q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Pair<String, WireMerchantSite> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return pair.component1();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$r */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15459r extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C15459r(Object obj) {
            super(1, obj, PlaceInfoActivity.class, "dialNumber", "dialNumber(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PlaceInfoActivity) this.receiver).m57148B0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$s */
    /* loaded from: classes3.dex */
    public static final class C15460s extends Lambda implements Function1<Throwable, Unit> {
        public C15460s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            PlaceInfoActivity.this.m57147C0().mo7212z(throwable, "Error occurred while observing attempt-call events", new Object[0]);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$t */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15461t extends FunctionReferenceImpl implements Function1<Optional<WireMerchantAction>, Unit> {
        public C15461t(Object obj) {
            super(1, obj, PlaceInfoActivity.class, "showPrimaryAction", "showPrimaryAction(Lco/bird/android/buava/Optional;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<WireMerchantAction> optional) {
            invoke2(optional);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Optional<WireMerchantAction> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PlaceInfoActivity) this.receiver).m57131f1(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$u */
    /* loaded from: classes3.dex */
    public static final class C15462u extends Lambda implements Function1<Throwable, Unit> {
        public C15462u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            PlaceInfoActivity.this.m57147C0().mo7212z(throwable, "Error occurred while observing footerPrimaryActionButton", new Object[0]);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$v */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15463v extends FunctionReferenceImpl implements Function1<Optional<WireMerchantAction>, Unit> {
        public C15463v(Object obj) {
            super(1, obj, PlaceInfoActivity.class, "showSecondaryAction", "showSecondaryAction(Lco/bird/android/buava/Optional;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<WireMerchantAction> optional) {
            invoke2(optional);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Optional<WireMerchantAction> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PlaceInfoActivity) this.receiver).m57130h1(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "title", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$w */
    /* loaded from: classes3.dex */
    public static final class C15464w extends Lambda implements Function1<String, Unit> {
        public C15464w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke2(String str) {
            boolean z;
            boolean isBlank;
            C5472N4 c5472n4 = PlaceInfoActivity.this.f65050C;
            if (c5472n4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c5472n4 = null;
            }
            MaterialToolbar materialToolbar = c5472n4.f24072B;
            if (str != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(str);
                if (!isBlank) {
                    z = false;
                    if (z) {
                        str = PlaceInfoActivity.this.getString(C45871nl4.merchant_info_activity_title);
                    }
                    materialToolbar.setTitle(str);
                }
            }
            z = true;
            if (z) {
            }
            materialToolbar.setTitle(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$x */
    /* loaded from: classes3.dex */
    public static final class C15465x extends Lambda implements Function1<Throwable, Unit> {
        public C15465x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            PlaceInfoActivity.this.m57147C0().mo7212z(throwable, "Error occurred while observing footerSecondaryActionButton", new Object[0]);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$y */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15466y extends FunctionReferenceImpl implements Function1<List<WireMerchantAction>, Unit> {
        public C15466y(Object obj) {
            super(1, obj, C0008A2.class, "submitList", "submitList(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<WireMerchantAction> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireMerchantAction> list) {
            ((C0008A2) this.receiver).submitList(list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity$z */
    /* loaded from: classes3.dex */
    public static final class C15467z extends Lambda implements Function1<Throwable, Unit> {
        public C15467z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            PlaceInfoActivity.this.m57147C0().mo7212z(throwable, "Error occurred while observing listActionButtons", new Object[0]);
        }
    }

    public PlaceInfoActivity() {
        super(true, null, null, 6, null);
        this.f65051D = new C0008A2();
        this.f65052E = new ZT3();
        this.f65053F = new C46393oe3();
    }

    /* renamed from: L0 */
    public static final String m57143L0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: M0 */
    public static final void m57142M0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N0 */
    public static final void m57141N0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q0 */
    public static final void m57140Q0(PlaceInfoActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    /* renamed from: S0 */
    public static final void m57138S0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U0 */
    public static final void m57137U0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V0 */
    public static final void m57136V0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X0 */
    public static final void m57135X0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y0 */
    public static final void m57134Y0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z0 */
    public static final void m57133Z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a1 */
    public static final void m57132a1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B0 */
    public final void m57148B0(String str) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:" + str));
        startActivity(intent);
    }

    /* renamed from: C0 */
    public final C41318g46.AbstractC20723b m57147C0() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("merchant-info-activity");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"merchant-info-activity\")");
        return m40153k;
    }

    /* renamed from: E0 */
    public final InterfaceC46299oU3 m57146E0() {
        InterfaceC46299oU3 interfaceC46299oU3 = this.f65049B;
        if (interfaceC46299oU3 != null) {
            return interfaceC46299oU3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    /* renamed from: F0 */
    public final void m57145F0() {
        InterfaceC15477b.InterfaceC15478a m57114a = C15468a.m57114a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        m57114a.mo57104a(c46172oG2.m21419a(applicationContext)).mo57105a(this);
    }

    /* renamed from: K0 */
    public final void m57144K0() {
        Observable<String> observeOn = m57146E0().mo21006E0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "viewModel.toolbarTitle\n …dSchedulers.mainThread())");
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m45197b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        C44606ld5.subscribeBy$default((ObservableSubscribeProxy) m33094as, new C15453l(), null, new C15464w(), 2, null);
        Observable<String> observeOn2 = m57146E0().getTitle().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "viewModel.title\n      .o…dSchedulers.mainThread())");
        AndroidLifecycleScopeProvider m45197b2 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b2, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(m45197b2));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        C44606ld5.subscribeBy$default((ObservableSubscribeProxy) m33094as2, new C15428F(), null, new C15429G(), 2, null);
        Observable<List<XT3>> observeOn3 = m57146E0().mo20996O0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "viewModel.images\n      .…dSchedulers.mainThread())");
        AndroidLifecycleScopeProvider m45197b3 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b3, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(m45197b3));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        C44606ld5.subscribeBy$default((ObservableSubscribeProxy) m33094as3, new C15431I(), null, new C15430H(this.f65052E), 2, null);
        Observable<Boolean> observeOn4 = m57146E0().mo21003H0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "viewModel.descriptionVis…dSchedulers.mainThread())");
        AndroidLifecycleScopeProvider m45197b4 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b4, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(m45197b4));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        C44606ld5.subscribeBy$default((ObservableSubscribeProxy) m33094as4, new C15432J(), null, new C15433K(), 2, null);
        Observable<String> observeOn5 = m57146E0().getDescription().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn5, "viewModel.description\n  …dSchedulers.mainThread())");
        AndroidLifecycleScopeProvider m45197b5 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b5, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as5 = observeOn5.m33094as(AutoDispose.m45239a(m45197b5));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        C44606ld5.subscribeBy$default((ObservableSubscribeProxy) m33094as5, new C15434L(), null, new C15443b(), 2, null);
        Observable<Boolean> observeOn6 = m57146E0().mo21007D0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn6, "viewModel.addressVisible…dSchedulers.mainThread())");
        AndroidLifecycleScopeProvider m45197b6 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b6, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as6 = observeOn6.m33094as(AutoDispose.m45239a(m45197b6));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        C44606ld5.subscribeBy$default((ObservableSubscribeProxy) m33094as6, new C15444c(), null, new C15445d(), 2, null);
        Observable<String> observeOn7 = m57146E0().getAddress().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn7, "viewModel.address\n      …dSchedulers.mainThread())");
        AndroidLifecycleScopeProvider m45197b7 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b7, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as7 = observeOn7.m33094as(AutoDispose.m45239a(m45197b7));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        C44606ld5.subscribeBy$default((ObservableSubscribeProxy) m33094as7, new C15446e(), null, new C15447f(), 2, null);
        Observable<Boolean> observeOn8 = m57146E0().mo21002I0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn8, "viewModel.hoursVisible\n …dSchedulers.mainThread())");
        AndroidLifecycleScopeProvider m45197b8 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b8, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as8 = observeOn8.m33094as(AutoDispose.m45239a(m45197b8));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        C44606ld5.subscribeBy$default((ObservableSubscribeProxy) m33094as8, new C15448g(), null, new C15449h(), 2, null);
        Observable<String> observeOn9 = m57146E0().getHours().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn9, "viewModel.hours\n      .o…dSchedulers.mainThread())");
        AndroidLifecycleScopeProvider m45197b9 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b9, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as9 = observeOn9.m33094as(AutoDispose.m45239a(m45197b9));
        Intrinsics.checkExpressionValueIsNotNull(m33094as9, "this.`as`(AutoDispose.autoDisposable(provider))");
        C44606ld5.subscribeBy$default((ObservableSubscribeProxy) m33094as9, new C15450i(), null, new C15451j(), 2, null);
        Observable<Boolean> observeOn10 = m57146E0().mo20999L0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn10, "viewModel.phoneVisible\n …dSchedulers.mainThread())");
        AndroidLifecycleScopeProvider m45197b10 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b10, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as10 = observeOn10.m33094as(AutoDispose.m45239a(m45197b10));
        Intrinsics.checkExpressionValueIsNotNull(m33094as10, "this.`as`(AutoDispose.autoDisposable(provider))");
        C44606ld5.subscribeBy$default((ObservableSubscribeProxy) m33094as10, new C15452k(), null, new C15454m(), 2, null);
        Observable<String> observeOn11 = m57146E0().mo20993x0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn11, "viewModel.phone\n      .o…dSchedulers.mainThread())");
        AndroidLifecycleScopeProvider m45197b11 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b11, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as11 = observeOn11.m33094as(AutoDispose.m45239a(m45197b11));
        Intrinsics.checkExpressionValueIsNotNull(m33094as11, "this.`as`(AutoDispose.autoDisposable(provider))");
        C44606ld5.subscribeBy$default((ObservableSubscribeProxy) m33094as11, new C15455n(), null, new C15456o(), 2, null);
        Observable m31950a = C24527f.m31950a(m57146E0().mo21000K0(), m57146E0().mo21010A0());
        final C15457p c15457p = new C15457p();
        Observable doOnNext = m31950a.doOnNext(new InterfaceC23484g() { // from class: kU3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                PlaceInfoActivity.m57141N0(Function1.this, obj);
            }
        });
        final C15458q c15458q = C15458q.f65086g;
        Observable observeOn12 = doOnNext.map(new InterfaceC23492o() { // from class: lU3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m57143L0;
                m57143L0 = PlaceInfoActivity.m57143L0(Function1.this, obj);
                return m57143L0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn12, "private fun observeViewM…n\")\n        }\n      )\n  }");
        AndroidLifecycleScopeProvider m45197b12 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b12, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as12 = observeOn12.m33094as(AutoDispose.m45239a(m45197b12));
        Intrinsics.checkExpressionValueIsNotNull(m33094as12, "this.`as`(AutoDispose.autoDisposable(provider))");
        C44606ld5.subscribeBy$default((ObservableSubscribeProxy) m33094as12, new C15460s(), null, new C15459r(this), 2, null);
        Observable<Optional<WireMerchantAction>> observeOn13 = m57146E0().mo21008C0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn13, "viewModel.footerPrimaryA…dSchedulers.mainThread())");
        AndroidLifecycleScopeProvider m45197b13 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b13, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as13 = observeOn13.m33094as(AutoDispose.m45239a(m45197b13));
        Intrinsics.checkExpressionValueIsNotNull(m33094as13, "this.`as`(AutoDispose.autoDisposable(provider))");
        C44606ld5.subscribeBy$default((ObservableSubscribeProxy) m33094as13, new C15462u(), null, new C15461t(this), 2, null);
        Observable<Optional<WireMerchantAction>> observeOn14 = m57146E0().mo21001J0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn14, "viewModel.footerSecondar…dSchedulers.mainThread())");
        AndroidLifecycleScopeProvider m45197b14 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b14, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as14 = observeOn14.m33094as(AutoDispose.m45239a(m45197b14));
        Intrinsics.checkExpressionValueIsNotNull(m33094as14, "this.`as`(AutoDispose.autoDisposable(provider))");
        C44606ld5.subscribeBy$default((ObservableSubscribeProxy) m33094as14, new C15465x(), null, new C15463v(this), 2, null);
        Observable<List<WireMerchantAction>> observeOn15 = m57146E0().mo20997N0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn15, "viewModel.listActionButt…dSchedulers.mainThread())");
        AndroidLifecycleScopeProvider m45197b15 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b15, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as15 = observeOn15.m33094as(AutoDispose.m45239a(m45197b15));
        Intrinsics.checkExpressionValueIsNotNull(m33094as15, "this.`as`(AutoDispose.autoDisposable(provider))");
        C44606ld5.subscribeBy$default((ObservableSubscribeProxy) m33094as15, new C15467z(), null, new C15466y(this.f65051D), 2, null);
        Observable<List<C45800ne3>> observeOn16 = m57146E0().mo20995a().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn16, "viewModel.offers\n      .…dSchedulers.mainThread())");
        AndroidLifecycleScopeProvider m45197b16 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b16, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as16 = observeOn16.m33094as(AutoDispose.m45239a(m45197b16));
        Intrinsics.checkExpressionValueIsNotNull(m33094as16, "this.`as`(AutoDispose.autoDisposable(provider))");
        C44606ld5.subscribeBy$default((ObservableSubscribeProxy) m33094as16, new C15424B(), null, new C15423A(this.f65053F), 2, null);
        Observable merge = Observable.merge(m57146E0().mo20994b(), this.f65051D.m116184o());
        Intrinsics.checkNotNullExpressionValue(merge, "merge(viewModel.actionBu…tionAdapter.actionClicks)");
        Observable observeOn17 = C24527f.m31949b(merge, m57146E0().mo21010A0(), m57146E0().getTitle()).observeOn(C23454a.m33087a());
        final C15425C c15425c = new C15425C();
        Observable doOnNext2 = observeOn17.doOnNext(new InterfaceC23484g() { // from class: cU3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                PlaceInfoActivity.m57142M0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext2, "private fun observeViewM…n\")\n        }\n      )\n  }");
        AndroidLifecycleScopeProvider m45197b17 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b17, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as17 = doOnNext2.m33094as(AutoDispose.m45239a(m45197b17));
        Intrinsics.checkExpressionValueIsNotNull(m33094as17, "this.`as`(AutoDispose.autoDisposable(provider))");
        C44606ld5.subscribeBy$default((ObservableSubscribeProxy) m33094as17, new C15426D(), null, new C15427E(), 2, null);
    }

    /* renamed from: R0 */
    public final void m57139R0() {
        String stringExtra = getIntent().getStringExtra("site_id");
        Serializable serializableExtra = getIntent().getSerializableExtra("trigger");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type co.bird.android.model.Trigger");
        Trigger trigger = (Trigger) serializableExtra;
        InterfaceC46299oU3 m57146E0 = m57146E0();
        Intrinsics.checkNotNull(stringExtra);
        m57146E0.mo20991z0(stringExtra);
        C5472N4 c5472n4 = this.f65050C;
        if (c5472n4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5472n4 = null;
        }
        ConstraintLayout constraintLayout = c5472n4.f24086n;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.locationContainer");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(constraintLayout, 0L, 1, null);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as = clicksThrottle$default.m33094as(AutoDispose.m45239a(m45197b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15435M c15435m = new C15435M();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: dU3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                PlaceInfoActivity.m57138S0(Function1.this, obj);
            }
        });
        C5472N4 c5472n42 = this.f65050C;
        if (c5472n42 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5472n42 = null;
        }
        ConstraintLayout constraintLayout2 = c5472n42.f24091s;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.phoneContainer");
        Observable clicksThrottle$default2 = C44626lf5.clicksThrottle$default(constraintLayout2, 0L, 1, null);
        AndroidLifecycleScopeProvider m45197b2 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b2, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as2 = clicksThrottle$default2.m33094as(AutoDispose.m45239a(m45197b2));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15436N c15436n = new C15436N();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: eU3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                PlaceInfoActivity.m57137U0(Function1.this, obj);
            }
        });
        Observable m31950a = C24527f.m31950a(this.f65052E.m73021p(), m57146E0().mo20996O0());
        AndroidLifecycleScopeProvider m45197b3 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b3, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as3 = m31950a.m33094as(AutoDispose.m45239a(m45197b3));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15437O c15437o = new C15437O();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: fU3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                PlaceInfoActivity.m57136V0(Function1.this, obj);
            }
        });
        Observable<String> m20714p = this.f65053F.m20714p();
        AndroidLifecycleScopeProvider m45197b4 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b4, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as4 = m20714p.m33094as(AutoDispose.m45239a(m45197b4));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15438P c15438p = new C15438P(m57146E0());
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: gU3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                PlaceInfoActivity.m57135X0(Function1.this, obj);
            }
        });
        C5472N4 c5472n43 = this.f65050C;
        if (c5472n43 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5472n43 = null;
        }
        FrameLayout frameLayout = c5472n43.f24096x;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.primaryActionButtonContainer");
        Observable m31950a2 = C24527f.m31950a(C44626lf5.clicksThrottle$default(frameLayout, 0L, 1, null), m57146E0().mo21008C0());
        AndroidLifecycleScopeProvider m45197b5 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b5, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as5 = m31950a2.m33094as(AutoDispose.m45239a(m45197b5));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15439Q c15439q = new C15439Q();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: hU3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                PlaceInfoActivity.m57134Y0(Function1.this, obj);
            }
        });
        C5472N4 c5472n44 = this.f65050C;
        if (c5472n44 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5472n44 = null;
        }
        Button button = c5472n44.f24071A;
        Intrinsics.checkNotNullExpressionValue(button, "binding.secondaryActionButton");
        Observable m31950a3 = C24527f.m31950a(C44626lf5.clicksThrottle$default(button, 0L, 1, null), m57146E0().mo21001J0());
        AndroidLifecycleScopeProvider m45197b6 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b6, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as6 = m31950a3.m33094as(AutoDispose.m45239a(m45197b6));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15440R c15440r = new C15440R();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: iU3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                PlaceInfoActivity.m57133Z0(Function1.this, obj);
            }
        });
        AbstractC23442F<WireMerchantSite> firstOrError = m57146E0().mo21010A0().firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "viewModel.merchantSite\n      .firstOrError()");
        Object m33135e = firstOrError.m33135e(AutoDispose.m45239a(m58963Z()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15441S c15441s = new C15441S(trigger);
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: jU3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                PlaceInfoActivity.m57132a1(Function1.this, obj);
            }
        });
    }

    /* renamed from: f1 */
    public final void m57131f1(Optional<WireMerchantAction> optional) {
        boolean z;
        boolean z2;
        if (optional.m59037c()) {
            C5472N4 c5472n4 = this.f65050C;
            C5472N4 c5472n42 = null;
            if (c5472n4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c5472n4 = null;
            }
            MaterialCardView materialCardView = c5472n4.f24077e;
            Intrinsics.checkNotNullExpressionValue(materialCardView, "binding.footerContainer");
            C49520tu6.m11233r(materialCardView);
            WireMerchantAction m59038b = optional.m59038b();
            C5472N4 c5472n43 = this.f65050C;
            if (c5472n43 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c5472n43 = null;
            }
            TextView textView = c5472n43.f24098z;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.primaryActionTitle");
            boolean z3 = true;
            if (m59038b.getTitle() != null) {
                z = true;
            } else {
                z = false;
            }
            C49520tu6.show$default(textView, z, 0, 2, null);
            C5472N4 c5472n44 = this.f65050C;
            if (c5472n44 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c5472n44 = null;
            }
            c5472n44.f24098z.setText(m59038b.getTitle());
            C5472N4 c5472n45 = this.f65050C;
            if (c5472n45 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c5472n45 = null;
            }
            TextView textView2 = c5472n45.f24097y;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.primaryActionSubtitle");
            if (m59038b.getSubtitle() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C49520tu6.show$default(textView2, z2, 0, 2, null);
            C5472N4 c5472n46 = this.f65050C;
            if (c5472n46 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c5472n46 = null;
            }
            c5472n46.f24097y.setText(m59038b.getSubtitle());
            C5472N4 c5472n47 = this.f65050C;
            if (c5472n47 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c5472n47 = null;
            }
            FrameLayout frameLayout = c5472n47.f24096x;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.primaryActionButtonContainer");
            if (m59038b.getButtonTitle() == null) {
                z3 = false;
            }
            C49520tu6.show$default(frameLayout, z3, 0, 2, null);
            C5472N4 c5472n48 = this.f65050C;
            if (c5472n48 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c5472n42 = c5472n48;
            }
            c5472n42.f24095w.setText(m59038b.getButtonTitle());
        }
    }

    /* renamed from: h1 */
    public final void m57130h1(Optional<WireMerchantAction> optional) {
        boolean z;
        if (optional.m59037c()) {
            C5472N4 c5472n4 = this.f65050C;
            C5472N4 c5472n42 = null;
            if (c5472n4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c5472n4 = null;
            }
            MaterialCardView materialCardView = c5472n4.f24077e;
            Intrinsics.checkNotNullExpressionValue(materialCardView, "binding.footerContainer");
            C49520tu6.m11233r(materialCardView);
            WireMerchantAction m59038b = optional.m59038b();
            C5472N4 c5472n43 = this.f65050C;
            if (c5472n43 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c5472n43 = null;
            }
            Button button = c5472n43.f24071A;
            Intrinsics.checkNotNullExpressionValue(button, "binding.secondaryActionButton");
            if (m59038b.getButtonTitle() != null) {
                z = true;
            } else {
                z = false;
            }
            C49520tu6.show$default(button, z, 0, 2, null);
            C5472N4 c5472n44 = this.f65050C;
            if (c5472n44 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c5472n42 = c5472n44;
            }
            c5472n42.f24071A.setText(m59038b.getButtonTitle());
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Integer num;
        int intValue;
        super.onActivityResult(i, i2, intent);
        if (i == 10033) {
            C5472N4 c5472n4 = null;
            if (intent != null) {
                num = Integer.valueOf(intent.getIntExtra("item_index", -1));
            } else {
                num = null;
            }
            if (num != null && (intValue = num.intValue()) >= 0 && intValue < this.f65052E.getItemCount()) {
                C5472N4 c5472n42 = this.f65050C;
                if (c5472n42 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    c5472n4 = c5472n42;
                }
                c5472n4.f24083k.setCurrentItem(intValue, false);
            }
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5472N4 m94400c = C5472N4.m94400c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m94400c, "inflate(layoutInflater)");
        this.f65050C = m94400c;
        C5472N4 c5472n4 = null;
        if (m94400c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m94400c = null;
        }
        setContentView(m94400c.getRoot());
        m57145F0();
        C5472N4 c5472n42 = this.f65050C;
        if (c5472n42 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5472n42 = null;
        }
        c5472n42.f24072B.setNavigationOnClickListener(new View.OnClickListener() { // from class: bU3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlaceInfoActivity.m57140Q0(PlaceInfoActivity.this, view);
            }
        });
        C5472N4 c5472n43 = this.f65050C;
        if (c5472n43 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5472n43 = null;
        }
        c5472n43.f24083k.setAdapter(this.f65052E);
        C5472N4 c5472n44 = this.f65050C;
        if (c5472n44 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5472n44 = null;
        }
        c5472n44.f24089q.setAdapter(this.f65053F);
        C5472N4 c5472n45 = this.f65050C;
        if (c5472n45 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c5472n4 = c5472n45;
        }
        c5472n4.f24074b.setAdapter(this.f65051D);
        m57139R0();
        m57144K0();
    }
}
