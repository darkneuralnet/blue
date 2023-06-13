package co.bird.android.feature.destination.rider;

import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.C11915i;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.destination.rider.DestinationSearchActivity;
import co.bird.android.feature.destination.rider.InterfaceC14790b;
import co.bird.android.model.AddressGuess;
import com.facebook.share.internal.C17296a;
import com.google.android.material.card.MaterialCardView;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C41318g46;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b \u0010!J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002R\"\u0010\u000f\u001a\u00020\b8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006$"}, m28432d2 = {"Lco/bird/android/feature/destination/rider/DestinationSearchActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "A0", "K0", "LO11;", "B", "LO11;", "x0", "()LO11;", "setViewModel$destination_rider_release", "(LO11;)V", "viewModel", "Le8;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Le8;", "t0", "()Le8;", "setAdapter$destination_rider_release", "(Le8;)V", "adapter", "Lv3;", "D", "Lv3;", "binding", "Lg46$b;", "w0", "()Lg46$b;", "logger", "<init>", "()V", "E", C17296a.f69688o, "destination-rider_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDestinationSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DestinationSearchActivity.kt\nco/bird/android/feature/destination/rider/DestinationSearchActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,111:1\n180#2:112\n180#2:113\n180#2:114\n180#2:115\n180#2:116\n180#2:117\n*S KotlinDebug\n*F\n+ 1 DestinationSearchActivity.kt\nco/bird/android/feature/destination/rider/DestinationSearchActivity\n*L\n52#1:112\n71#1:113\n76#1:114\n81#1:115\n87#1:116\n99#1:117\n*E\n"})
/* loaded from: classes3.dex */
public final class DestinationSearchActivity extends BaseActivity {

    /* renamed from: E */
    public static final C14778a f63905E = new C14778a(null);

    /* renamed from: B */
    public O11 f63906B;

    /* renamed from: C */
    public C19966e8 f63907C;

    /* renamed from: D */
    public C29403v3 f63908D;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/feature/destination/rider/DestinationSearchActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", C17296a.f69688o, "", "KEY_ADDRESS", "Ljava/lang/String;", "<init>", "()V", "destination-rider_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.destination.rider.DestinationSearchActivity$a */
    /* loaded from: classes3.dex */
    public static final class C14778a {
        public /* synthetic */ C14778a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Intent m58233a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, DestinationSearchActivity.class);
        }

        private C14778a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.destination.rider.DestinationSearchActivity$b */
    /* loaded from: classes3.dex */
    public static final class C14779b extends Lambda implements Function1<Unit, Unit> {
        public C14779b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C29403v3 c29403v3 = DestinationSearchActivity.this.f63908D;
            if (c29403v3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c29403v3 = null;
            }
            c29403v3.f113436e.setText((CharSequence) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "visible", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nDestinationSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DestinationSearchActivity.kt\nco/bird/android/feature/destination/rider/DestinationSearchActivity$initAddressInput$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,111:1\n262#2,2:112\n*S KotlinDebug\n*F\n+ 1 DestinationSearchActivity.kt\nco/bird/android/feature/destination/rider/DestinationSearchActivity$initAddressInput$2\n*L\n77#1:112,2\n*E\n"})
    /* renamed from: co.bird.android.feature.destination.rider.DestinationSearchActivity$c */
    /* loaded from: classes3.dex */
    public static final class C14780c extends Lambda implements Function1<Boolean, Unit> {
        public C14780c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean visible) {
            C29403v3 c29403v3 = DestinationSearchActivity.this.f63908D;
            if (c29403v3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c29403v3 = null;
            }
            FrameLayout frameLayout = c29403v3.f113435d;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.clearInputIconContainer");
            Intrinsics.checkNotNullExpressionValue(visible, "visible");
            frameLayout.setVisibility(visible.booleanValue() ? 0 : 8);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.destination.rider.DestinationSearchActivity$d */
    /* loaded from: classes3.dex */
    public static final class C14781d extends Lambda implements Function1<Unit, Unit> {
        public C14781d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C29403v3 c29403v3 = DestinationSearchActivity.this.f63908D;
            if (c29403v3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c29403v3 = null;
            }
            c29403v3.f113436e.requestFocus();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "query", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.destination.rider.DestinationSearchActivity$e */
    /* loaded from: classes3.dex */
    public static final class C14782e extends Lambda implements Function1<CharSequence, Unit> {
        public C14782e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            invoke2(charSequence);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(CharSequence charSequence) {
            DestinationSearchActivity.this.m58234x0().m92999l(charSequence.toString());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "addresses", "", "Lco/bird/android/model/AddressGuess;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.destination.rider.DestinationSearchActivity$f */
    /* loaded from: classes3.dex */
    public static final class C14783f extends Lambda implements Function1<List<? extends AddressGuess>, Unit> {
        public C14783f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends AddressGuess> list) {
            invoke2((List<AddressGuess>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<AddressGuess> list) {
            C41318g46.AbstractC20723b m58235w0 = DestinationSearchActivity.this.m58235w0();
            int size = list.size();
            m58235w0.mo7221o("Displaying " + size + " addresses.", new Object[0]);
            DestinationSearchActivity.this.m58236t0().submitList(list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.destination.rider.DestinationSearchActivity$g */
    /* loaded from: classes3.dex */
    public static final class C14784g extends Lambda implements Function1<Throwable, Unit> {
        public C14784g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            DestinationSearchActivity.this.m58235w0().mo7223j(th, "Unknown error occurred when observing suggested addresses", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", PaymentMethod.BillingDetails.PARAM_ADDRESS, "Landroid/location/Address;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.destination.rider.DestinationSearchActivity$h */
    /* loaded from: classes3.dex */
    public static final class C14785h extends Lambda implements Function1<Address, Unit> {
        public C14785h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Address address) {
            invoke2(address);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Address address) {
            C41318g46.AbstractC20723b m58235w0 = DestinationSearchActivity.this.m58235w0();
            m58235w0.mo7221o("Closing with a successful result: " + address, new Object[0]);
            DestinationSearchActivity.this.m59031A();
            DestinationSearchActivity destinationSearchActivity = DestinationSearchActivity.this;
            Intent intent = new Intent();
            Intrinsics.checkNotNull(address, "null cannot be cast to non-null type android.os.Parcelable");
            destinationSearchActivity.setResult(-1, intent.putExtra("key_address", address));
            DestinationSearchActivity.this.supportFinishAfterTransition();
        }
    }

    public DestinationSearchActivity() {
        super(true, null, null, 6, null);
    }

    /* renamed from: B0 */
    public static final void m58250B0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C0 */
    public static final void m58249C0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E0 */
    public static final void m58248E0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F0 */
    public static final void m58247F0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L0 */
    public static final void m58245L0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M0 */
    public static final void m58244M0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void onCreate$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A0 */
    public final void m58251A0() {
        C29403v3 c29403v3 = this.f63908D;
        C29403v3 c29403v32 = null;
        if (c29403v3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c29403v3 = null;
        }
        FrameLayout frameLayout = c29403v3.f113435d;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.clearInputIconContainer");
        Observable<Unit> observeOn = C45219mf5.m25214a(frameLayout).debounce(150L, TimeUnit.MILLISECONDS).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "binding.clearInputIconCo…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14779b c14779b = new C14779b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: D11
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                DestinationSearchActivity.m58250B0(Function1.this, obj);
            }
        });
        Object m33094as2 = m58234x0().m93004g().m33094as(AutoDispose.m45239a(this));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14780c c14780c = new C14780c();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: E11
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                DestinationSearchActivity.m58249C0(Function1.this, obj);
            }
        });
        C29403v3 c29403v33 = this.f63908D;
        if (c29403v33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c29403v33 = null;
        }
        MaterialCardView materialCardView = c29403v33.f113438g;
        Intrinsics.checkNotNullExpressionValue(materialCardView, "binding.searchInputContainer");
        Object m33094as3 = C44626lf5.clicksThrottle$default(materialCardView, 0L, 1, null).m33094as(AutoDispose.m45239a(this));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14781d c14781d = new C14781d();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: F11
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                DestinationSearchActivity.m58248E0(Function1.this, obj);
            }
        });
        C29403v3 c29403v34 = this.f63908D;
        if (c29403v34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c29403v32 = c29403v34;
        }
        EditText editText = c29403v32.f113436e;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.searchEt");
        Observable<CharSequence> skip = C40475ef5.m42643d(editText).skip(1L);
        Intrinsics.checkNotNullExpressionValue(skip, "binding.searchEt.textChanges()\n      .skip(1)");
        Object m33094as4 = skip.m33094as(AutoDispose.m45239a(this));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14782e c14782e = new C14782e();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: G11
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                DestinationSearchActivity.m58247F0(Function1.this, obj);
            }
        });
    }

    /* renamed from: K0 */
    public final void m58246K0() {
        C29403v3 c29403v3 = this.f63908D;
        C29403v3 c29403v32 = null;
        if (c29403v3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c29403v3 = null;
        }
        c29403v3.f113433b.setAdapter(m58236t0());
        C29403v3 c29403v33 = this.f63908D;
        if (c29403v33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c29403v32 = c29403v33;
        }
        c29403v32.f113433b.addItemDecoration(new C11915i(this, 1));
        Object m33094as = m58234x0().m93005f().m33094as(AutoDispose.m45239a(this));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14783f c14783f = new C14783f();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: H11
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                DestinationSearchActivity.m58245L0(Function1.this, obj);
            }
        };
        final C14784g c14784g = new C14784g();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: I11
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                DestinationSearchActivity.m58244M0(Function1.this, obj);
            }
        });
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C29403v3 m9272c = C29403v3.m9272c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m9272c, "inflate(layoutInflater)");
        this.f63908D = m9272c;
        C29403v3 c29403v3 = null;
        if (m9272c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m9272c = null;
        }
        setContentView(m9272c.getRoot());
        C29403v3 c29403v32 = this.f63908D;
        if (c29403v32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c29403v3 = c29403v32;
        }
        setSupportActionBar(c29403v3.f113439h);
        InterfaceC14790b.InterfaceC14791a m58232a = C14786a.m58232a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        m58232a.mo58227a(c46172oG2.m21419a(applicationContext), this).mo58228a(this);
        m58251A0();
        m58246K0();
        Observable<Address> observeOn = m58234x0().m93002i().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "viewModel.selectedAddres…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14785h c14785h = new C14785h();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: C11
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                DestinationSearchActivity.onCreate$lambda$0(Function1.this, obj);
            }
        });
    }

    /* renamed from: t0 */
    public final C19966e8 m58236t0() {
        C19966e8 c19966e8 = this.f63907C;
        if (c19966e8 != null) {
            return c19966e8;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    /* renamed from: w0 */
    public final C41318g46.AbstractC20723b m58235w0() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("destination-search-activity");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"destination-search-activity\")");
        return m40153k;
    }

    /* renamed from: x0 */
    public final O11 m58234x0() {
        O11 o11 = this.f63906B;
        if (o11 != null) {
            return o11;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }
}
