.class final Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$9$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$9;->a(Lco/bird/android/buava/Optional;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;",
        "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;",
        "state",
        "a",
        "(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;)Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCoreInventoryScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$9$1\n+ 2 CoreInventoryScanState.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanStateKt\n*L\n1#1,261:1\n111#2,20:262\n*S KotlinDebug\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$9$1\n*L\n128#1:262,20\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/buava/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/Warehouse;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/buava/Optional;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/Warehouse;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$9$1;->g:Lco/bird/android/buava/Optional;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;)Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;
    .locals 22

    move-object/from16 v0, p1

    const-string v1, "state"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Lco/bird/android/feature/coreinventory/scan/ConfirmProcessing;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    instance-of v2, v0, Lco/bird/android/feature/coreinventory/scan/ConfirmProcessing;

    const/4 v3, 0x0

    if-nez v2, :cond_2

    invoke-static {v1}, Lkotlin/reflect/full/KClasses;->getPrimaryConstructor(Lkotlin/reflect/KClass;)Lkotlin/reflect/KFunction;

    move-result-object v1

    if-eqz v1, :cond_0

    const/16 v2, 0xf

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface/range {p1 .. p1}, LIx5;->c()Ljava/lang/Boolean;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v2, v5

    const/4 v4, 0x1

    invoke-interface/range {p1 .. p1}, LIx5;->g()Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v2, v4

    const/4 v4, 0x2

    invoke-interface/range {p1 .. p1}, LIx5;->j()Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v2, v4

    const/4 v4, 0x3

    invoke-interface/range {p1 .. p1}, LIx5;->h()Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v2, v4

    const/4 v4, 0x4

    invoke-interface/range {p1 .. p1}, LIx5;->e()Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v2, v4

    const/4 v4, 0x5

    invoke-interface/range {p1 .. p1}, LIx5;->k()Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v2, v4

    const/4 v4, 0x6

    invoke-interface/range {p1 .. p1}, LIx5;->i()Lco/bird/android/model/constant/PartKind;

    move-result-object v5

    aput-object v5, v2, v4

    const/4 v4, 0x7

    invoke-interface/range {p1 .. p1}, LIx5;->d()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v2, v4

    const/16 v4, 0x8

    invoke-interface/range {p1 .. p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;->getAction()Lco/bird/android/model/constant/VehicleInventoryAction;

    move-result-object v5

    aput-object v5, v2, v4

    const/16 v4, 0x9

    invoke-interface/range {p1 .. p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;->l()Ljava/util/List;

    move-result-object v5

    aput-object v5, v2, v4

    invoke-interface/range {p1 .. p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;->f()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const/16 v5, 0xa

    aput-object v4, v2, v5

    const/16 v4, 0xb

    invoke-interface/range {p1 .. p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;->a()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v2, v4

    invoke-interface/range {p1 .. p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;->m()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v5, 0xc

    aput-object v4, v2, v5

    invoke-interface/range {p1 .. p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;->b()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v5, 0xd

    aput-object v4, v2, v5

    const/16 v4, 0xe

    invoke-interface/range {p1 .. p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;->getError()Ljava/lang/Throwable;

    move-result-object v0

    aput-object v0, v2, v4

    invoke-interface {v1, v2}, Lkotlin/reflect/KCallable;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;

    goto :goto_0

    :cond_0
    move-object v0, v3

    :goto_0
    if-eqz v0, :cond_1

    check-cast v0, Lco/bird/android/feature/coreinventory/scan/ConfirmProcessing;

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type co.bird.android.feature.coreinventory.scan.ConfirmProcessing"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    move-object v4, v0

    check-cast v4, Lco/bird/android/feature/coreinventory/scan/ConfirmProcessing;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$9$1;->g:Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/Warehouse;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lco/bird/android/model/Warehouse;->getName()Ljava/lang/String;

    move-result-object v3

    :cond_3
    move-object/from16 v16, v3

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x77ff

    const/16 v21, 0x0

    invoke-static/range {v4 .. v21}, Lco/bird/android/feature/coreinventory/scan/ConfirmProcessing;->copy$default(Lco/bird/android/feature/coreinventory/scan/ConfirmProcessing;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;Lco/bird/android/model/constant/VehicleInventoryAction;Ljava/util/List;ZLjava/lang/String;IILjava/lang/Throwable;ILjava/lang/Object;)Lco/bird/android/feature/coreinventory/scan/ConfirmProcessing;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$9$1;->a(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;)Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;

    move-result-object p1

    return-object p1
.end method