.class public final Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;
.super Lf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf1<",
        "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;",
        "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\u0008\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u00a2\u0006\u0004\u0008)\u0010*J1\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\u0008\u0000\u0010\u0004*\u0008\u0012\u0004\u0012\u00028\u00000\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fRJ\u0010(\u001a8\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010\u00060# %*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010\u00060#\u0018\u00010\"0\"0!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'\u00a8\u0006+"
    }
    d2 = {
        "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;",
        "Lf1;",
        "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;",
        "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;",
        "T",
        "Lio/reactivex/F;",
        "",
        "processEnabled",
        "d0",
        "(Lio/reactivex/F;Ljava/lang/Boolean;)Lio/reactivex/F;",
        "renderer",
        "",
        "J",
        "LTB0;",
        "e",
        "LTB0;",
        "coreInventoryManager",
        "Llh6;",
        "f",
        "Llh6;",
        "userManager",
        "LSy6;",
        "g",
        "LSy6;",
        "warehouseManager",
        "LTq4;",
        "h",
        "LTq4;",
        "reactiveConfig",
        "Le13;",
        "i",
        "Le13;",
        "navigator",
        "Lma4;",
        "",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/wire/WireVehicleInventoryScan;",
        "kotlin.jvm.PlatformType",
        "j",
        "Lma4;",
        "coreInventoryRelay",
        "<init>",
        "(LTB0;Llh6;LSy6;LTq4;Le13;)V",
        "core-inventory_release"
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
        "SMAP\nCoreInventoryScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n*L\n1#1,261:1\n52#2,2:262\n52#2,2:265\n180#3:264\n180#3:267\n180#3:268\n180#3:269\n180#3:271\n180#3:272\n180#3:273\n180#3:274\n180#3:275\n180#3:276\n233#4:270\n*S KotlinDebug\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter\n*L\n34#1:262,2\n49#1:265,2\n38#1:264\n53#1:267\n95#1:268\n125#1:269\n139#1:271\n191#1:272\n200#1:273\n213#1:274\n222#1:275\n238#1:276\n136#1:270\n*E\n"
    }
.end annotation


# instance fields
.field public final e:LTB0;

.field public final f:Llh6;

.field public final g:LSy6;

.field public final h:LTq4;

.field public final i:Le13;

.field public final j:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireVehicleInventoryScan;",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LTB0;Llh6;LSy6;LTq4;Le13;)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    const-string v6, "coreInventoryManager"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "userManager"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "warehouseManager"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "reactiveConfig"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "navigator"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lco/bird/android/feature/coreinventory/scan/UpdateUi;

    move-object v7, v6

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x7fff

    const/16 v24, 0x0

    invoke-direct/range {v7 .. v24}, Lco/bird/android/feature/coreinventory/scan/UpdateUi;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;Lco/bird/android/model/constant/VehicleInventoryAction;Ljava/util/List;ZLjava/lang/String;IILjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v6}, Lf1;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->e:LTB0;

    iput-object v2, v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->f:Llh6;

    iput-object v3, v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->g:LSy6;

    iput-object v4, v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->h:LTq4;

    iput-object v5, v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->i:Le13;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v1

    const-string v2, "create<List<Pair<WireVeh\u2026entoryScan, Boolean?>>>()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->j:Lma4;

    return-void
.end method

.method public static synthetic A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->V(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic B(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->c0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic C(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic D(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->X(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->b0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic F(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->M(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic H(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->S(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic I(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->K(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final K(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final L(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final M(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static final N(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final O(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final P(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static final Q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final R(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static final S(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final T(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    return-object p0
.end method

.method public static final U(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final V(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final W(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final X(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static final Y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final a0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final synthetic access$getCoreInventoryManager$p(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)LTB0;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->e:LTB0;

    return-object p0
.end method

.method public static final synthetic access$getNavigator$p(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)Le13;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->i:Le13;

    return-object p0
.end method

.method public static final synthetic access$getUserManager$p(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)Llh6;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->f:Llh6;

    return-object p0
.end method

.method public static final synthetic access$getWarehouseManager$p(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)LSy6;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->g:LSy6;

    return-object p0
.end method

.method public static final synthetic access$progress(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;Lio/reactivex/F;Ljava/lang/Boolean;)Lio/reactivex/F;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->d0(Lio/reactivex/F;Ljava/lang/Boolean;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final b0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final c0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic e0(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;Lio/reactivex/F;Ljava/lang/Boolean;ILjava/lang/Object;)Lio/reactivex/F;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->d0(Lio/reactivex/F;Ljava/lang/Boolean;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->Q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->Y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->U(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->L(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->Z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->N(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->O(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->a0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->R(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->T(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->W(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->P(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public J(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;)V
    .locals 6

    const-string v0, "renderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lf1;->consume(Lrx4;)V

    sget-object v0, Lee3;->a:Lee3;

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->h:LTq4;

    invoke-virtual {v0}, LTq4;->f4()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->h:LTq4;

    invoke-virtual {v1}, LTq4;->Z5()Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$$inlined$combineLatest$1;->a:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$$inlined$combineLatest$1;

    invoke-static {v0, v1, v2}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "combineLatest(source1, s\u2026, t2: T2 -> (t1 to t2) })"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v2

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v3, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$1;

    invoke-direct {v3, p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$1;-><init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)V

    new-instance v4, LlC0;

    invoke-direct {v4, v3}, LlC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v4}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->j:Lma4;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->startWith(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v3, "coreInventoryRelay.start\u2026entoryScan, Boolean?>>())"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;->K1()Lio/reactivex/Observable;

    move-result-object v4

    sget-object v5, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$$inlined$combineLatest$2;->a:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$$inlined$combineLatest$2;

    invoke-static {v0, v4, v5}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v1

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$2;

    invoke-direct {v1, p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$2;-><init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)V

    new-instance v4, LnC0;

    invoke-direct {v4, v1}, LnC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v4}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface {p1}, Lco/bird/android/vehiclescanner/common/mrp/a;->T()Lio/reactivex/Observable;

    move-result-object v0

    invoke-interface {p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;->K1()Lio/reactivex/Observable;

    move-result-object v1

    invoke-static {v0, v1}, Lio/reactivex/rxkotlin/f;->a(Lio/reactivex/Observable;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$3;

    invoke-direct {v1, p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$3;-><init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)V

    new-instance v4, LpC0;

    invoke-direct {v4, v1}, LpC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "override fun consume(ren\u2026{ navigator.close() }\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->j:Lma4;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v4, v5}, Lio/reactivex/Observable;->startWith(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v4}, Lio/reactivex/rxkotlin/f;->a(Lio/reactivex/Observable;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v4, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$4;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$4;

    new-instance v5, LqC0;

    invoke-direct {v5, v4}, LqC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v5}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v4, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$5;

    invoke-direct {v4, p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$5;-><init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)V

    new-instance v5, LrC0;

    invoke-direct {v5, v4}, LrC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v5}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v4

    invoke-static {v4}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v4

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v4, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$6;

    iget-object v5, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->j:Lma4;

    invoke-direct {v4, v5}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$6;-><init>(Ljava/lang/Object;)V

    new-instance v5, LsC0;

    invoke-direct {v5, v4}, LsC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v5}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface {p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;->c1()Lio/reactivex/Observable;

    move-result-object v0

    invoke-interface {p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;->K1()Lio/reactivex/Observable;

    move-result-object v4

    invoke-static {v0, v4}, Lio/reactivex/rxkotlin/f;->a(Lio/reactivex/Observable;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v4, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7;

    invoke-direct {v4, p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7;-><init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)V

    new-instance v5, LtC0;

    invoke-direct {v5, v4}, LtC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v5}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v4, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$8;

    invoke-direct {v4, p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$8;-><init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)V

    new-instance v5, LuC0;

    invoke-direct {v5, v4}, LuC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v5}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v4

    invoke-static {v4}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v4

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v4, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$9;

    invoke-direct {v4, p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$9;-><init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)V

    new-instance v5, LvC0;

    invoke-direct {v5, v4}, LvC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v5}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface {p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;->I2()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v4, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->j:Lma4;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v4, v5}, Lio/reactivex/Observable;->startWith(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$$inlined$withLatestFrom$1;

    invoke-direct {v5}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$$inlined$withLatestFrom$1;-><init>()V

    invoke-virtual {v0, v4, v5}, Lio/reactivex/Observable;->withLatestFrom(Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v4, "withLatestFrom(other, Bi\u2026 combiner.invoke(t, u) })"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v4

    invoke-static {v4}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v4

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v4, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$11;

    invoke-direct {v4, p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$11;-><init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)V

    new-instance v5, LxC0;

    invoke-direct {v5, v4}, LxC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v5}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface {p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;->b8()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v4, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->j:Lma4;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v4, v5}, Lio/reactivex/Observable;->startWith(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;->K1()Lio/reactivex/Observable;

    move-result-object v5

    invoke-static {v0, v4, v5}, Lio/reactivex/rxkotlin/f;->b(Lio/reactivex/Observable;Lio/reactivex/B;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v4, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$12;

    invoke-direct {v4, p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$12;-><init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)V

    new-instance v5, LwC0;

    invoke-direct {v5, v4}, LwC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v5}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v4, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$13;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$13;

    new-instance v5, LAC0;

    invoke-direct {v5, v4}, LAC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v5}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v4, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$14;

    invoke-direct {v4, p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$14;-><init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)V

    new-instance v5, LBC0;

    invoke-direct {v5, v4}, LBC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v5}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v1

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$15;

    iget-object v4, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->j:Lma4;

    invoke-direct {v1, v4}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$15;-><init>(Ljava/lang/Object;)V

    new-instance v4, LCC0;

    invoke-direct {v4, v1}, LCC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v4}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface {p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;->A1()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->j:Lma4;

    invoke-static {v0, v1}, Lio/reactivex/rxkotlin/f;->a(Lio/reactivex/Observable;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$16;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$16;

    new-instance v4, LDC0;

    invoke-direct {v4, v1}, LDC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "renderer.itemSwiped()\n  \u2026.scanIdentifier }\n      }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v1

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$17;

    iget-object v4, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->j:Lma4;

    invoke-direct {v1, v4}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$17;-><init>(Ljava/lang/Object;)V

    new-instance v4, LEC0;

    invoke-direct {v4, v1}, LEC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v4}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface {p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;->V()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->j:Lma4;

    invoke-static {v0, v1}, Lio/reactivex/rxkotlin/f;->a(Lio/reactivex/Observable;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$18;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$18;

    new-instance v4, LFC0;

    invoke-direct {v4, v1}, LFC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "renderer.undoDeleteClick\u2026Array()\n        )\n      }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v1

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$19;

    iget-object v4, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->j:Lma4;

    invoke-direct {v1, v4}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$19;-><init>(Ljava/lang/Object;)V

    new-instance v4, LGC0;

    invoke-direct {v4, v1}, LGC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v4}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface {p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;->z1()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->j:Lma4;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1, v4}, Lio/reactivex/Observable;->startWith(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lio/reactivex/rxkotlin/f;->a(Lio/reactivex/Observable;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$20;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$20;

    new-instance v3, LHC0;

    invoke-direct {v3, v1}, LHC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "renderer.backPresses()\n \u2026cle not processed\n      }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v1

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$21;

    invoke-direct {v1, p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$21;-><init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)V

    new-instance v3, LmC0;

    invoke-direct {v3, v1}, LmC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface {p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;->W()Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v0

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$22;

    invoke-direct {v0, p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$22;-><init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)V

    new-instance v1, LoC0;

    invoke-direct {v1, v0}, LoC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public bridge synthetic consume(Lrx4;)V
    .locals 0

    check-cast p1, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->J(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;)V

    return-void
.end method

.method public final d0(Lio/reactivex/F;Ljava/lang/Boolean;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/F<",
            "TT;>;",
            "Ljava/lang/Boolean;",
            ")",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$progress$1;

    invoke-direct {v0, p0, p2}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$progress$1;-><init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;Ljava/lang/Boolean;)V

    new-instance p2, LyC0;

    invoke-direct {p2, v0}, LyC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p2}, Lio/reactivex/F;->v(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    new-instance p2, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$progress$2;

    invoke-direct {p2, p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$progress$2;-><init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)V

    new-instance v0, LzC0;

    invoke-direct {v0, p2}, LzC0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "private fun <T>Single<T>\u2026  )\n        }\n      }\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
