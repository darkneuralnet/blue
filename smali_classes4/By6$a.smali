.class public final LBy6$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBy6;->p(LTx6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/WarehouseValidationResponse;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/WarehouseValidationResponse;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(Lco/bird/api/response/WarehouseValidationResponse;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LBy6;


# direct methods
.method public constructor <init>(LBy6;)V
    .locals 0

    iput-object p1, p0, LBy6$a;->g:LBy6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/WarehouseValidationResponse;)V
    .locals 2

    invoke-virtual {p1}, Lco/bird/api/response/WarehouseValidationResponse;->component1()Z

    move-result v0

    invoke-virtual {p1}, Lco/bird/api/response/WarehouseValidationResponse;->component2()Lco/bird/android/model/Warehouse;

    move-result-object p1

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    iget-object v0, p0, LBy6$a;->g:LBy6;

    new-instance v1, LBy6$a$a;

    invoke-direct {v1, p1}, LBy6$a$a;-><init>(Lco/bird/android/model/Warehouse;)V

    invoke-virtual {v0, v1}, LBy6;->F(Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/WarehouseValidationResponse;

    invoke-virtual {p0, p1}, LBy6$a;->a(Lco/bird/api/response/WarehouseValidationResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
