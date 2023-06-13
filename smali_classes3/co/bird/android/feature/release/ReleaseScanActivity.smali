.class public final Lco/bird/android/feature/release/ReleaseScanActivity;
.super Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;
.source "SourceFile"

# interfaces
.implements LJv4;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity<",
        "LKv4;",
        ">;",
        "LJv4;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008Q\u0010RJ\u0012\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0008\u0010\u0008\u001a\u00020\u0006H\u0014J\"\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0014J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0016J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00160\u00120\u0011H\u0016J\u000e\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0011H\u0016J\u000e\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0011H\u0016J\u000e\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u0011H\u0016J\u000e\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0011H\u0016R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"\"\u0004\u0008#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00083\u00104\u001a\u0004\u00085\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00089\u00104\u001a\u0004\u0008:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008>\u00104\u001a\u0004\u0008?\u0010@R.\u0010F\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013 C*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00120B8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010ER.\u0010H\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013 C*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00120B8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008G\u0010ER.\u0010J\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0016 C*\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00120\u00120B8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010ER\"\u0010L\u001a\u0010\u0012\u000c\u0012\n C*\u0004\u0018\u00010\u00060\u00060B8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008K\u0010ER\"\u0010N\u001a\u0010\u0012\u000c\u0012\n C*\u0004\u0018\u00010\u001b0\u001b0B8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010ER\"\u0010P\u001a\u0010\u0012\u000c\u0012\n C*\u0004\u0018\u00010\u00060\u00060B8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010E\u00a8\u0006S"
    }
    d2 = {
        "Lco/bird/android/feature/release/ReleaseScanActivity;",
        "Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;",
        "LKv4;",
        "LJv4;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "onStart",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "onActivityResult",
        "state",
        "A0",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/buava/Optional;",
        "",
        "N",
        "z2",
        "",
        "t4",
        "V2",
        "Lco/bird/android/model/wire/ReleaseValidationResult;",
        "H1",
        "Ljava/io/File;",
        "e3",
        "n2",
        "LAv4;",
        "l",
        "LAv4;",
        "q0",
        "()LAv4;",
        "setPresenter",
        "(LAv4;)V",
        "presenter",
        "LWu4;",
        "m",
        "LWu4;",
        "n0",
        "()LWu4;",
        "setConverter",
        "(LWu4;)V",
        "converter",
        "LVu4;",
        "n",
        "LVu4;",
        "adapter",
        "LmX5;",
        "o",
        "Lkotlin/Lazy;",
        "t0",
        "()LmX5;",
        "swipeHelper",
        "Landroidx/recyclerview/widget/l;",
        "p",
        "o0",
        "()Landroidx/recyclerview/widget/l;",
        "itemTouchHelper",
        "LYP3;",
        "q",
        "p0",
        "()LYP3;",
        "peekHelper",
        "Lma4;",
        "kotlin.jvm.PlatformType",
        "r",
        "Lma4;",
        "nestIdRelay",
        "s",
        "warehouseIdRelay",
        "t",
        "lockTogglesRelay",
        "u",
        "releaseClicksRelay",
        "v",
        "photoSavedRelay",
        "w",
        "checkLocationSettingsRelay",
        "<init>",
        "()V",
        "release_release"
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
        "SMAP\nReleaseScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanActivity.kt\nco/bird/android/feature/release/ReleaseScanActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,277:1\n1#2:278\n199#3:279\n199#3:280\n237#3:281\n218#3:282\n199#3:283\n199#3:284\n*S KotlinDebug\n*F\n+ 1 ReleaseScanActivity.kt\nco/bird/android/feature/release/ReleaseScanActivity\n*L\n167#1:279\n192#1:280\n200#1:281\n216#1:282\n225#1:283\n242#1:284\n*E\n"
    }
.end annotation


# instance fields
.field public l:LAv4;

.field public m:LWu4;

.field public final n:LVu4;

.field public final o:Lkotlin/Lazy;

.field public final p:Lkotlin/Lazy;

.field public final q:Lkotlin/Lazy;

.field public final r:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public final s:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public final t:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field public final u:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final v:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field public final w:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;-><init>()V

    new-instance v0, LVu4;

    invoke-direct {v0}, LVu4;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->n:LVu4;

    new-instance v0, Lco/bird/android/feature/release/ReleaseScanActivity$o;

    invoke-direct {v0, p0}, Lco/bird/android/feature/release/ReleaseScanActivity$o;-><init>(Lco/bird/android/feature/release/ReleaseScanActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->o:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/release/ReleaseScanActivity$a;

    invoke-direct {v0, p0}, Lco/bird/android/feature/release/ReleaseScanActivity$a;-><init>(Lco/bird/android/feature/release/ReleaseScanActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->p:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/release/ReleaseScanActivity$h;

    invoke-direct {v0, p0}, Lco/bird/android/feature/release/ReleaseScanActivity$h;-><init>(Lco/bird/android/feature/release/ReleaseScanActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->q:Lkotlin/Lazy;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Optional<String>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->r:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->s:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Optional<Boolean>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->t:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v1, "create<Unit>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->u:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    const-string v2, "create<File>()"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->v:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->w:Lma4;

    return-void
.end method

.method public static final B0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final C0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final E0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final F0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method

.method public static final K0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final L0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final M0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LG6;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LG6;

    return-object p0
.end method

.method public static synthetic Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/release/ReleaseScanActivity;->B0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$getBinding(Lco/bird/android/feature/release/ReleaseScanActivity;)Lf00;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->U()Lf00;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCheckLocationSettingsRelay$p(Lco/bird/android/feature/release/ReleaseScanActivity;)Lma4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->w:Lma4;

    return-object p0
.end method

.method public static final synthetic access$getLockTogglesRelay$p(Lco/bird/android/feature/release/ReleaseScanActivity;)Lma4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->t:Lma4;

    return-object p0
.end method

.method public static final synthetic access$getReleaseClicksRelay$p(Lco/bird/android/feature/release/ReleaseScanActivity;)Lma4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->u:Lma4;

    return-object p0
.end method

.method public static final synthetic access$getSwipeHelper(Lco/bird/android/feature/release/ReleaseScanActivity;)LmX5;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/feature/release/ReleaseScanActivity;->t0()LmX5;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/release/ReleaseScanActivity;->F0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/release/ReleaseScanActivity;->x0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LG6;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/release/ReleaseScanActivity;->M0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LG6;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/release/ReleaseScanActivity;->E0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic i0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/release/ReleaseScanActivity;->K0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic j0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/release/ReleaseScanActivity;->C0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic k0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/release/ReleaseScanActivity;->w0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic m0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/release/ReleaseScanActivity;->L0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final w0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final x0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public A0(LKv4;)V
    .locals 11

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->render(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->U()Lf00;

    move-result-object v0

    iget-object v0, v0, Lf00;->f:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    const-string v1, "binding.progressBar"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LKv4;->q()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-virtual {p0}, Lco/bird/android/feature/release/ReleaseScanActivity;->n0()LWu4;

    move-result-object v5

    invoke-virtual {p1}, LKv4;->s()Lco/bird/android/model/wire/WireNest;

    move-result-object v6

    invoke-virtual {p1}, LKv4;->w()Z

    move-result v7

    invoke-virtual {p1}, LKv4;->x()Ljava/util/List;

    move-result-object v8

    invoke-virtual {p1}, LKv4;->u()Z

    move-result v9

    invoke-virtual {p1}, LKv4;->r()Z

    move-result v10

    invoke-virtual/range {v5 .. v10}, LWu4;->a(Lco/bird/android/model/wire/WireNest;ZLjava/util/List;ZZ)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->n:LVu4;

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v1, v0}, LVu4;->u(Ljava/util/Collection;)V

    invoke-virtual {p1}, LKv4;->t()Z

    move-result v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v2

    sget-object v3, Lp43;->d:Lp43;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/SingleSubscribeProxy;

    invoke-interface {v0}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    :cond_1
    invoke-virtual {p1}, LKv4;->v()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v3, Lwl5;

    invoke-direct {v3, v0}, Lwl5;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/CompletableSubscribeProxy;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/uber/autodispose/CompletableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    :cond_2
    invoke-virtual {p1}, LKv4;->p()Z

    move-result v0

    const-string v2, "override fun render(stat\u2026::displayError)\n    }\n  }"

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v3

    sget-object v4, LdZ3;->d:LdZ3;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    new-instance v3, Lco/bird/android/feature/release/ReleaseScanActivity$i;

    invoke-direct {v3, p0}, Lco/bird/android/feature/release/ReleaseScanActivity$i;-><init>(Lco/bird/android/feature/release/ReleaseScanActivity;)V

    new-instance v4, LLu4;

    invoke-direct {v4, v3}, LLu4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/F;->C(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/reactivex/p;->b(Lio/reactivex/q;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/MaybeSubscribeProxy;

    new-instance v3, Lco/bird/android/feature/release/ReleaseScanActivity$j;

    invoke-direct {v3, p0}, Lco/bird/android/feature/release/ReleaseScanActivity$j;-><init>(Lco/bird/android/feature/release/ReleaseScanActivity;)V

    new-instance v4, LMu4;

    invoke-direct {v4, v3}, LMu4;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v3, Lco/bird/android/feature/release/ReleaseScanActivity$k;->g:Lco/bird/android/feature/release/ReleaseScanActivity$k;

    new-instance v5, LNu4;

    invoke-direct {v5, v3}, LNu4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v4, v5}, Lcom/uber/autodispose/MaybeSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    :cond_3
    invoke-virtual {p1}, LKv4;->o()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v3

    sget-object v4, LXv2;->d:LXv2;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/SingleSubscribeProxy;

    new-instance v3, Lco/bird/android/feature/release/ReleaseScanActivity$l;

    invoke-direct {v3, p0}, Lco/bird/android/feature/release/ReleaseScanActivity$l;-><init>(Lco/bird/android/feature/release/ReleaseScanActivity;)V

    new-instance v4, LOu4;

    invoke-direct {v4, v3}, LOu4;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v3, Lco/bird/android/feature/release/ReleaseScanActivity$m;->g:Lco/bird/android/feature/release/ReleaseScanActivity$m;

    new-instance v5, LPu4;

    invoke-direct {v5, v3}, LPu4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v4, v5}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    :cond_4
    invoke-virtual {p1}, LKv4;->getError()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Lcom/google/android/gms/common/api/ApiException;

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v3

    sget-object v4, LJw2;->d:LJw2;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    new-instance v3, Lco/bird/android/feature/release/ReleaseScanActivity$n;

    invoke-direct {v3, p1, p0}, Lco/bird/android/feature/release/ReleaseScanActivity$n;-><init>(LKv4;Lco/bird/android/feature/release/ReleaseScanActivity;)V

    new-instance p1, LQu4;

    invoke-direct {p1, v3}, LQu4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/SingleSubscribeProxy;

    invoke-interface {p1}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    goto :goto_1

    :cond_5
    invoke-virtual {p1}, LKv4;->getError()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, LKv4;->getError()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v0

    invoke-static {v0, p1}, Lbg5;->c(LXC;Ljava/lang/Throwable;)V

    :cond_6
    :goto_1
    return-void
.end method

.method public H1()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/ReleaseValidationResult;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lco/bird/android/feature/release/ReleaseScanActivity;->t0()LmX5;

    move-result-object v0

    invoke-virtual {v0}, LmX5;->b()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/feature/release/ReleaseScanActivity$p;

    iget-object v2, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->n:LVu4;

    invoke-direct {v1, v2}, Lco/bird/android/feature/release/ReleaseScanActivity$p;-><init>(Ljava/lang/Object;)V

    new-instance v2, LRu4;

    invoke-direct {v2, v1}, LRu4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "swipeHelper.itemSwiped()\u2026(adapter::getAdapterItem)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lco/bird/android/feature/release/ReleaseScanActivity$q;->g:Lco/bird/android/feature/release/ReleaseScanActivity$q;

    invoke-static {v0, v1}, LYf5;->T(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public N()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->r:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "nestIdRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public V2()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->u:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "releaseClicksRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public e3()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->v:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "photoSavedRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final n0()LWu4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->m:LWu4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "converter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public n2()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->w:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "checkLocationSettingsRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final o0()Landroidx/recyclerview/widget/l;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->p:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/l;

    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lco/bird/android/core/base/BaseCoreActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 v0, 0x272a

    if-eq p1, v0, :cond_1

    const/16 p2, 0x276a

    if-eq p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 p1, 0x1f4

    sget-object p3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p1, p2, p3}, Lio/reactivex/F;->f0(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "timer(500L, TimeUnit.MILLISECONDS)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/SingleSubscribeProxy;

    new-instance p2, Lco/bird/android/feature/release/ReleaseScanActivity$b;

    invoke-direct {p2, p0}, Lco/bird/android/feature/release/ReleaseScanActivity$b;-><init>(Lco/bird/android/feature/release/ReleaseScanActivity;)V

    new-instance p3, LJu4;

    invoke-direct {p3, p2}, LJu4;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object p2, Lco/bird/android/feature/release/ReleaseScanActivity$c;->g:Lco/bird/android/feature/release/ReleaseScanActivity$c;

    new-instance v0, LKu4;

    invoke-direct {v0, p2}, LKu4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, p3, v0}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    if-ne p2, p1, :cond_2

    if-eqz p3, :cond_2

    const-string p1, "photo_saved_model"

    invoke-virtual {p3, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/PhotoSavedModel;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/PhotoSavedModel;->getPhotoPath()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance p2, Ljava/io/File;

    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->v:Lma4;

    invoke-virtual {p1, p2}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 20

    move-object/from16 v0, p0

    invoke-super/range {p0 .. p1}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-static {}, Lco/bird/android/feature/release/a;->a()Lco/bird/android/feature/release/b$a;

    move-result-object v1

    sget-object v2, LoG2;->a:LoG2;

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v3

    const-string v4, "application"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v2

    sget v3, Lrg4;->ic_capture_scooter:I

    sget v4, Lnl4;->lock_to_take_photo_title:I

    sget v5, Lnl4;->release_photo_overlay_message:I

    sget v6, LDf4;->birdNewRoad:I

    sget v7, Lnl4;->release_photo_confirmation_message:I

    new-instance v15, Lco/bird/android/model/PhotoBannerViewModel;

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/4 v3, 0x0

    const/16 v16, 0x0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    const/16 v18, 0xc3

    const/16 v19, 0x0

    move-object v8, v15

    move-object v4, v15

    move-object v15, v3

    invoke-direct/range {v8 .. v19}, Lco/bird/android/model/PhotoBannerViewModel;-><init>(Lco/bird/android/model/PhotoBannerContext;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mrp/BaseActivityLite;->x()LDQ3;

    move-result-object v3

    invoke-interface {v1, v2, v4, v0, v3}, Lco/bird/android/feature/release/b$a;->a(LlG2;Lco/bird/android/model/PhotoBannerViewModel;Landroid/app/Activity;LDQ3;)Lco/bird/android/feature/release/b;

    move-result-object v1

    invoke-interface {v1, v0}, Lco/bird/android/feature/release/b;->a(Lco/bird/android/feature/release/ReleaseScanActivity;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, LRk5;->gm(Z)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v1

    invoke-virtual {v1, v2}, LRk5;->sm(Z)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->U()Lf00;

    move-result-object v1

    iget-object v1, v1, Lf00;->i:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, v0, Lco/bird/android/feature/release/ReleaseScanActivity;->n:LVu4;

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->U()Lf00;

    move-result-object v1

    iget-object v1, v1, Lf00;->i:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->U()Lf00;

    move-result-object v1

    iget-object v1, v1, Lf00;->i:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Landroidx/recyclerview/widget/g;

    invoke-direct {v2}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/release/ReleaseScanActivity;->o0()Landroidx/recyclerview/widget/l;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->U()Lf00;

    move-result-object v2

    iget-object v2, v2, Lf00;->i:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/l;->g(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/release/ReleaseScanActivity;->p0()LYP3;

    move-result-object v1

    new-instance v2, Lco/bird/android/feature/release/ReleaseScanActivity$d;

    invoke-direct {v2, v0}, Lco/bird/android/feature/release/ReleaseScanActivity$d;-><init>(Lco/bird/android/feature/release/ReleaseScanActivity;)V

    invoke-virtual {v1, v2}, LYP3;->g(Lkotlin/jvm/functions/Function1;)V

    iget-object v1, v0, Lco/bird/android/feature/release/ReleaseScanActivity;->n:LVu4;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/release/ReleaseScanActivity;->p0()LYP3;

    move-result-object v2

    invoke-virtual {v1, v2}, LVu4;->A(LYP3;)V

    iget-object v1, v0, Lco/bird/android/feature/release/ReleaseScanActivity;->n:LVu4;

    new-instance v2, Lco/bird/android/feature/release/ReleaseScanActivity$e;

    invoke-direct {v2, v0}, Lco/bird/android/feature/release/ReleaseScanActivity$e;-><init>(Lco/bird/android/feature/release/ReleaseScanActivity;)V

    invoke-virtual {v1, v2}, LVu4;->x(Lkotlin/jvm/functions/Function0;)V

    iget-object v1, v0, Lco/bird/android/feature/release/ReleaseScanActivity;->n:LVu4;

    new-instance v2, Lco/bird/android/feature/release/ReleaseScanActivity$f;

    invoke-direct {v2, v0}, Lco/bird/android/feature/release/ReleaseScanActivity$f;-><init>(Lco/bird/android/feature/release/ReleaseScanActivity;)V

    invoke-virtual {v1, v2}, LVu4;->y(Lkotlin/jvm/functions/Function1;)V

    iget-object v1, v0, Lco/bird/android/feature/release/ReleaseScanActivity;->n:LVu4;

    new-instance v2, Lco/bird/android/feature/release/ReleaseScanActivity$g;

    invoke-direct {v2, v0}, Lco/bird/android/feature/release/ReleaseScanActivity$g;-><init>(Lco/bird/android/feature/release/ReleaseScanActivity;)V

    invoke-virtual {v1, v2}, LVu4;->w(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/release/ReleaseScanActivity;->q0()LAv4;

    move-result-object v1

    invoke-virtual {v1, v0}, LAv4;->V(LJv4;)V

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "nest_id"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lco/bird/android/buava/Optional;

    invoke-direct {v2, v1}, Lco/bird/android/buava/Optional;-><init>(Ljava/lang/Object;)V

    iget-object v1, v0, Lco/bird/android/feature/release/ReleaseScanActivity;->r:Lma4;

    invoke-virtual {v1, v2}, Lma4;->accept(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "warehouse_id"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lco/bird/android/feature/release/ReleaseScanActivity;->s:Lma4;

    sget-object v3, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v3, v1}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v4

    invoke-virtual {v2, v4}, Lma4;->accept(Ljava/lang/Object;)V

    iget-object v2, v0, Lco/bird/android/feature/release/ReleaseScanActivity;->t:Lma4;

    if-eqz v1, :cond_0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v3, v1}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v1

    invoke-virtual {v2, v1}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public onStart()V
    .locals 2

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStart()V

    iget-object v0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->w:Lma4;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public final p0()LYP3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->q:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYP3;

    return-object v0
.end method

.method public final q0()LAv4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->l:LAv4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LKv4;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/release/ReleaseScanActivity;->A0(LKv4;)V

    return-void
.end method

.method public final t0()LmX5;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->o:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LmX5;

    return-object v0
.end method

.method public t4()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->t:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "lockTogglesRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public z2()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/release/ReleaseScanActivity;->s:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "warehouseIdRelay.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
