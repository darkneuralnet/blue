.class public final Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"

# interfaces
.implements LK14;
.implements LMN3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity$a;,
        Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002yzB\u0007\u00a2\u0006\u0004\u0008w\u0010xJ\u0008\u0010\u0005\u001a\u00020\u0004H\u0002J\u0008\u0010\u0006\u001a\u00020\u0004H\u0002JG\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\u00020\u00042\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00070\tH\u0002J6\u0010\u001b\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u00152\u0018\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00190\u00180\tH\u0002J&\u0010\"\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010!\u001a\u00020\u000cH\u0002J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0007H\u0002J\u0012\u0010\'\u001a\u00020\u00042\u0008\u0010&\u001a\u0004\u0018\u00010%H\u0014J\"\u0010-\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\u0008\u0010,\u001a\u0004\u0018\u00010+H\u0014J\u0008\u0010.\u001a\u00020\u0004H\u0014J\u0010\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020/H\u0016J\u0008\u00102\u001a\u00020\u0004H\u0016J\u000e\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u000403H\u0016J\u000e\u00106\u001a\u0008\u0012\u0004\u0012\u00020503H\u0016J\u0014\u00109\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002080703H\u0016J\u0010\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u00020(H\u0016J\u000e\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u000c03H\u0016J\u000e\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u000c03H\u0016J\u0014\u0010?\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020>0703H\u0016J\u000e\u0010@\u001a\u0008\u0012\u0004\u0012\u00020\u000403H\u0016J\u000e\u0010A\u001a\u0008\u0012\u0004\u0012\u00020\u000403H\u0016J\u0008\u0010B\u001a\u00020\u0004H\u0016J\u0012\u0010D\u001a\u00020\u00042\u0008\u0010C\u001a\u0004\u0018\u000108H\u0016R\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008F\u0010G\u001a\u0004\u0008H\u0010I\"\u0004\u0008J\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008N\u0010O\u001a\u0004\u0008P\u0010Q\"\u0004\u0008R\u0010SR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008V\u0010W\u001a\u0004\u0008X\u0010Y\"\u0004\u0008Z\u0010[R\u0016\u0010`\u001a\u00020]8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008b\u0010cR\"\u0010i\u001a\u0010\u0012\u000c\u0012\n f*\u0004\u0018\u000105050e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008g\u0010hR.\u0010k\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000208 f*\n\u0012\u0004\u0012\u000208\u0018\u000107070e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008j\u0010hR\"\u0010m\u001a\u0010\u0012\u000c\u0012\n f*\u0004\u0018\u00010\u00040\u00040e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008l\u0010hR\"\u0010o\u001a\u0010\u0012\u000c\u0012\n f*\u0004\u0018\u00010\u000c0\u000c0e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008n\u0010hR\"\u0010q\u001a\u0010\u0012\u000c\u0012\n f*\u0004\u0018\u00010\u000c0\u000c0e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008p\u0010hR\u0016\u0010s\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008r\u0010HR\u0016\u0010v\u001a\u0004\u0018\u00010\u000c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008t\u0010u\u00a8\u0006{"
    }
    d2 = {
        "Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "LK14;",
        "LMN3;",
        "",
        "k0",
        "U",
        "",
        "currency",
        "",
        "Lco/bird/api/response/ReloadOption;",
        "options",
        "",
        "includePayPerRidePlan",
        "includeAutoReloadSection",
        "autoReloadMandatory",
        "optionIdSelected",
        "m0",
        "(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/Boolean;Ljava/lang/String;)V",
        "disclaimers",
        "X",
        "",
        "",
        "metadata",
        "Lkotlin/Pair;",
        "",
        "lineItems",
        "Y",
        "LZg3;",
        "onPaymentMethodSelectedListener",
        "",
        "Lco/bird/android/model/constant/PaymentMethod;",
        "excludePaymentMethods",
        "autoReloadToggled",
        "i0",
        "token",
        "R",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "onActivityResult",
        "onResume",
        "LL14;",
        "state",
        "j0",
        "onBackPressed",
        "Lio/reactivex/Observable;",
        "J0",
        "LG10;",
        "m1",
        "Lco/bird/android/buava/Optional;",
        "Lcom/braintreepayments/api/models/PaymentMethodNonce;",
        "G1",
        "stringId",
        "u5",
        "x8",
        "m6",
        "LS04;",
        "E1",
        "u0",
        "O0",
        "S",
        "paymentMethodNonce",
        "i",
        "LY04;",
        "j",
        "LY04;",
        "Z",
        "()LY04;",
        "setConverter",
        "(LY04;)V",
        "converter",
        "LJ14;",
        "k",
        "LJ14;",
        "d0",
        "()LJ14;",
        "setPresenter",
        "(LJ14;)V",
        "presenter",
        "La14;",
        "l",
        "La14;",
        "b0",
        "()La14;",
        "setPaymentIntentDelegate",
        "(La14;)V",
        "paymentIntentDelegate",
        "LU2;",
        "m",
        "LU2;",
        "binding",
        "LW04;",
        "n",
        "LW04;",
        "adapter",
        "Lma4;",
        "kotlin.jvm.PlatformType",
        "o",
        "Lma4;",
        "braintreeFragmentRelay",
        "p",
        "braintreePaymentNonce",
        "q",
        "continueSubject",
        "r",
        "includePayPerRidePlanRelay",
        "s",
        "includeAutoReloadSectionRelay",
        "t",
        "isLoading",
        "U7",
        "()Ljava/lang/Boolean;",
        "autoReloadToggleEnabled",
        "<init>",
        "()V",
        "a",
        "b",
        "co.bird.android.feature.payment"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPreloadV2OptionsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadV2OptionsActivity.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,359:1\n44#2:360\n1#3:361\n199#4:362\n1855#5,2:363\n1855#5,2:365\n*S KotlinDebug\n*F\n+ 1 PreloadV2OptionsActivity.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity\n*L\n75#1:360\n239#1:362\n270#1:363,2\n309#1:365,2\n*E\n"
    }
.end annotation


# instance fields
.field public j:LY04;

.field public k:LJ14;

.field public l:La14;

.field public m:LU2;

.field public final n:LW04;

.field public final o:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "LG10;",
            ">;"
        }
    .end annotation
.end field

.field public final p:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lco/bird/android/buava/Optional<",
            "Lcom/braintreepayments/api/models/PaymentMethodNonce;",
            ">;>;"
        }
    .end annotation
.end field

.field public final q:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final r:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final s:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public t:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    new-instance v0, LW04;

    invoke-direct {v0}, LW04;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->n:LW04;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<BraintreeFragment>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->o:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Optional<PaymentMethodNonce>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->p:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Unit>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->q:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Boolean>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->r:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->s:Lma4;

    return-void
.end method

.method public static synthetic P(Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->f0(Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;)V

    return-void
.end method

.method public static synthetic Q(Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->h0(Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;)V

    return-void
.end method

.method public static final f0(Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->q:Lma4;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, v0}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public static final h0(Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->q:Lma4;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, v0}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public E1()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/buava/Optional<",
            "LS04;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->n:LW04;

    invoke-virtual {v0}, LW04;->w()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public G1()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/buava/Optional<",
            "Lcom/braintreepayments/api/models/PaymentMethodNonce;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->p:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "braintreePaymentNonce.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public J0()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->n:LW04;

    invoke-virtual {v0}, LW04;->J0()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public O0()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->m:LU2;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v0, v0, LU2;->g:Landroid/widget/TextView;

    const-string v2, "binding.paymentTerms"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v3, v4, v1}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final R(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->o:Lma4;

    invoke-static {p0, p1}, LG10;->sa(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;)LG10;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type com.braintreepayments.api.interfaces.BraintreeListener"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, LG10;->I9(LL10;)V

    invoke-virtual {v0, p1}, Lma4;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/braintreepayments/api/exceptions/InvalidArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "There was an issue with the authorization string."

    invoke-static {p1, v1, v0}, Lg46;->f(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public S()V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const-string v1, "ConfirmPurchaseBottomSheetDialog"

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->m0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    instance-of v1, v0, LHx0;

    if-eqz v1, :cond_0

    check-cast v0, LHx0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/material/bottomsheet/b;->dismiss()V

    :cond_1
    return-void
.end method

.method public final U()V
    .locals 6

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    sget-object v1, LCs;->d:LCs;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/SingleSubscribeProxy;

    invoke-interface {v0}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    return-void
.end method

.method public U7()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->n:LW04;

    invoke-virtual {v0}, LMy;->getItemCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->n:LW04;

    invoke-virtual {v0}, LW04;->v()Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final X(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    sget v0, Lnl4;->subject_to_bird_payment_terms:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(L.string.subject_to_bird_payment_terms)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    const-string v3, "binding"

    if-eqz v1, :cond_1

    iget-object p1, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->m:LU2;

    if-nez p1, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    iget-object p1, v2, LU2;->g:Landroid/widget/TextView;

    new-instance v1, Landroid/text/style/UnderlineSpan;

    invoke-direct {v1}, Landroid/text/style/UnderlineSpan;-><init>()V

    invoke-static {v0, v0, v1}, LmS5;->n(Ljava/lang/CharSequence;Ljava/lang/String;Landroid/text/style/CharacterStyle;)Landroid/text/SpannableString;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "\n"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->m:LU2;

    if-nez p1, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    move-object v2, p1

    :goto_2
    iget-object p1, v2, LU2;->g:Landroid/widget/TextView;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "builder.toString()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Landroid/text/style/UnderlineSpan;

    invoke-direct {v2}, Landroid/text/style/UnderlineSpan;-><init>()V

    invoke-static {v1, v0, v2}, LmS5;->n(Ljava/lang/CharSequence;Ljava/lang/String;Landroid/text/style/CharacterStyle;)Landroid/text/SpannableString;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_3
    return-void
.end method

.method public final Y(Ljava/util/Map;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;>;)V"
        }
    .end annotation

    new-instance v0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity$c;

    invoke-direct {v0, p0}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity$c;-><init>(Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;)V

    sget-object v1, LHx0;->g:LHx0$a;

    invoke-virtual {v1, p1, v0, p2}, LHx0$a;->a(Ljava/util/Map;LTx0;Ljava/util/List;)LHx0;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p2

    const-string v0, "ConfirmPurchaseBottomSheetDialog"

    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/c;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method

.method public final Z()LY04;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->j:LY04;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "converter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final b0()La14;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->l:La14;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "paymentIntentDelegate"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d0()LJ14;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->k:LJ14;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public i(Lcom/braintreepayments/api/models/PaymentMethodNonce;)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->p:Lma4;

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v1, p1}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-virtual {v0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public final i0(LZg3;Ljava/util/Set;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZg3;",
            "Ljava/util/Set<",
            "+",
            "Lco/bird/android/model/constant/PaymentMethod;",
            ">;Z)V"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lco/bird/android/model/constant/PaymentMethod;

    sget v1, Lnl4;->auto_reload_not_supported:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(L.string.auto_reload_not_supported)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sget-object p2, Lrd4;->e:Lrd4$a;

    invoke-virtual {p2, p1, v0}, Lrd4$a;->a(LZg3;Ljava/util/Map;)Lrd4;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p2

    const-string p3, "QuickPaymentBottomSheetDialog"

    invoke-virtual {p1, p2, p3}, Landroidx/fragment/app/c;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method

.method public j0(LL14;)V
    .locals 10

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Li04;

    const-string v1, "binding"

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Li04;

    invoke-virtual {p1}, Li04;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Li04;->g()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p1}, Li04;->e()Z

    move-result v6

    invoke-virtual {p1}, Li04;->d()Z

    move-result v7

    invoke-virtual {p1}, Li04;->b()Ljava/lang/Boolean;

    move-result-object v8

    invoke-virtual {p1}, Li04;->f()Ljava/lang/String;

    move-result-object v9

    move-object v3, p0

    invoke-virtual/range {v3 .. v9}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->m0(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/Boolean;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->m:LU2;

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    iget-object v0, v2, LU2;->b:Landroid/widget/Button;

    invoke-virtual {p1}, Li04;->b()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Li04;->d()Z

    move-result p1

    if-eqz p1, :cond_1

    sget p1, Lnl4;->continue_and_agree_to_auto_reload_titlecased:I

    goto :goto_1

    :cond_1
    sget p1, Lnl4;->general_continue:I

    :goto_1
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    :cond_2
    instance-of v0, p1, LU84;

    if-eqz v0, :cond_3

    check-cast p1, LU84;

    invoke-virtual {p1}, LU84;->c()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, LU84;->b()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->Y(Ljava/util/Map;Ljava/util/List;)V

    goto/16 :goto_2

    :cond_3
    instance-of v0, p1, LV84;

    if-eqz v0, :cond_5

    check-cast p1, LV84;

    invoke-virtual {p1}, LV84;->b()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    invoke-virtual {v0, p1}, LXC;->error(Ljava/lang/Throwable;)V

    :cond_4
    invoke-virtual {p0}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->S()V

    goto/16 :goto_2

    :cond_5
    instance-of v0, p1, Lig1;

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    check-cast p1, Lig1;

    invoke-virtual {p1}, Lig1;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LXC;->error(Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_6
    instance-of v0, p1, Lqg1;

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    check-cast p1, Lqg1;

    invoke-virtual {p1}, Lqg1;->b()I

    move-result p1

    invoke-virtual {v0, p1}, LXC;->error(I)V

    goto :goto_2

    :cond_7
    instance-of v0, p1, Lwg1;

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    check-cast p1, Lwg1;

    invoke-virtual {p1}, Lwg1;->b()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {v0, p1}, LXC;->error(Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_8
    instance-of v0, p1, LIt2;

    if-eqz v0, :cond_a

    check-cast p1, LIt2;

    invoke-virtual {p1}, LIt2;->b()Z

    move-result v0

    iput-boolean v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->t:Z

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->m:LU2;

    if-nez v0, :cond_9

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_9
    iget-object v0, v0, LU2;->f:Landroidx/constraintlayout/widget/Group;

    const-string v1, "binding.loadingViews"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LIt2;->b()Z

    move-result p1

    const/4 v1, 0x0

    const/4 v3, 0x2

    invoke-static {v0, p1, v1, v3, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    goto :goto_2

    :cond_a
    instance-of v0, p1, LyE0;

    if-eqz v0, :cond_b

    check-cast p1, LyE0;

    invoke-virtual {p1}, LyE0;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->R(Ljava/lang/String;)V

    goto :goto_2

    :cond_b
    instance-of v0, p1, LS84;

    if-eqz v0, :cond_c

    check-cast p1, LS84;

    invoke-virtual {p1}, LS84;->d()LZg3;

    move-result-object v0

    invoke-virtual {p1}, LS84;->c()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1}, LS84;->b()Z

    move-result p1

    invoke-virtual {p0, v0, v1, p1}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->i0(LZg3;Ljava/util/Set;Z)V

    goto :goto_2

    :cond_c
    instance-of p1, p1, LV41;

    if-eqz p1, :cond_d

    invoke-virtual {p0}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->U()V

    :cond_d
    :goto_2
    return-void
.end method

.method public final k0()V
    .locals 3

    sget v0, Lnl4;->subject_to_bird_payment_terms:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(L.string.subject_to_bird_payment_terms)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->m:LU2;

    if-nez v1, :cond_0

    const-string v1, "binding"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    iget-object v1, v1, LU2;->g:Landroid/widget/TextView;

    new-instance v2, Landroid/text/style/UnderlineSpan;

    invoke-direct {v2}, Landroid/text/style/UnderlineSpan;-><init>()V

    invoke-static {v0, v0, v2}, LmS5;->n(Ljava/lang/CharSequence;Ljava/lang/String;Landroid/text/style/CharacterStyle;)Landroid/text/SpannableString;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final m0(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/Boolean;Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lco/bird/api/response/ReloadOption;",
            ">;ZZ",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->Z()LY04;

    move-result-object v0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, LY04;->a(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/Boolean;Ljava/lang/String;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object p3, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->n:LW04;

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p3, p2}, LMy;->u(Ljava/util/Collection;)V

    invoke-virtual {p0, p1}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->X(Ljava/util/List;)V

    return-void
.end method

.method public m1()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LG10;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->o:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "braintreeFragmentRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public m6()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->r:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "includePayPerRidePlanRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 5

    invoke-virtual {p0}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->b0()La14;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, La14;->onActivityResult(IILandroid/content/Intent;)V

    const/16 v0, 0x272e

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eq p1, v0, :cond_4

    const/16 v0, 0x274f

    const-wide/16 v3, 0x1f4

    if-eq p1, v0, :cond_2

    const/16 v0, 0x2755

    if-eq p1, v0, :cond_0

    new-instance v0, LIt2;

    invoke-direct {v0, v2}, LIt2;-><init>(Z)V

    invoke-virtual {p0, v0}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->j0(LL14;)V

    invoke-super {p0, p1, p2, p3}, Lco/bird/android/core/base/BaseCoreActivity;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_0

    :cond_0
    if-ne p2, v1, :cond_1

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance p2, LU04;

    invoke-direct {p2, p0}, LU04;-><init>(Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;)V

    invoke-virtual {p1, p2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_1
    new-instance p1, LIt2;

    invoke-direct {p1, v2}, LIt2;-><init>(Z)V

    invoke-virtual {p0, p1}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->j0(LL14;)V

    goto :goto_0

    :cond_2
    if-ne p2, v1, :cond_3

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance p2, LT04;

    invoke-direct {p2, p0}, LT04;-><init>(Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;)V

    invoke-virtual {p1, p2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_3
    new-instance p1, LIt2;

    invoke-direct {p1, v2}, LIt2;-><init>(Z)V

    invoke-virtual {p0, p1}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->j0(LL14;)V

    goto :goto_0

    :cond_4
    if-ne p2, v1, :cond_5

    invoke-virtual {p0}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->d0()LJ14;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, LJ14;->R(ILandroid/content/Intent;)V

    goto :goto_0

    :cond_5
    new-instance p1, LIt2;

    invoke-direct {p1, v2}, LIt2;-><init>(Z)V

    invoke-virtual {p0, p1}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->j0(LL14;)V

    :goto_0
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->t:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onBackPressed()V

    invoke-virtual {p0}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->d0()LJ14;

    move-result-object v0

    invoke-virtual {v0}, LJ14;->X()V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    invoke-super {p0, p1}, Lco/bird/android/core/mrp/BaseActivityLite;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lco/bird/android/core/base/BaseCoreActivity;->D()V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, LU2;->c(Landroid/view/LayoutInflater;)LU2;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->m:LU2;

    const/4 v0, 0x0

    const-string v1, "binding"

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1}, LU2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-static {}, Lco/bird/android/feature/payment/preload/v2/options/a;->a()Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity$a$a;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->H()LlG2;

    move-result-object v2

    invoke-static {p0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v3

    const-string v4, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->m:LU2;

    if-nez v4, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v0

    :cond_1
    invoke-interface {p1, v2, p0, v3, v4}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity$a$a;->a(LlG2;Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;Lcom/uber/autodispose/ScopeProvider;LU2;)Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity$a;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity$a;->a(Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;)V

    iget-object p1, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->m:LU2;

    if-nez p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_2
    iget-object p1, p1, LU2;->b:Landroid/widget/Button;

    sget v2, Lnl4;->general_continue:I

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->m:LU2;

    if-nez p1, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_3
    iget-object p1, p1, LU2;->h:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->n:LW04;

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    iget-object p1, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->m:LU2;

    if-nez p1, :cond_4

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    move-object v0, p1

    :goto_0
    iget-object p1, v0, LU2;->h:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, LZ04;

    invoke-direct {v0}, LZ04;-><init>()V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    invoke-virtual {p0}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->k0()V

    invoke-virtual {p0}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->d0()LJ14;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "co.bird.android.context"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    const-string v0, "unknown"

    :cond_5
    invoke-virtual {p1, v0}, LJ14;->f0(Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->d0()LJ14;

    move-result-object p1

    invoke-virtual {p1, p0}, LJ14;->F(LK14;)V

    iget-object p1, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->r:Lma4;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "include_pay_per_ride_option"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Lma4;->accept(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->s:Lma4;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "include_auto_reload_section"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onResume()V

    new-instance v0, LIt2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LIt2;-><init>(Z)V

    invoke-virtual {p0, v0}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->j0(LL14;)V

    return-void
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LL14;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->j0(LL14;)V

    return-void
.end method

.method public u0()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->m:LU2;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v0, v0, LU2;->b:Landroid/widget/Button;

    const-string v2, "binding.action"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v3, v4, v1}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->q:Lma4;

    invoke-static {v0, v1}, Lio/reactivex/Observable;->merge(Lio/reactivex/B;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "merge(binding.action.cli\u2026ottle(), continueSubject)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public u5(I)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getString(stringId)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public x8()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->s:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "includeAutoReloadSectionRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
