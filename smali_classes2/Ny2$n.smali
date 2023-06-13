.class public final LNy2$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNy2;->b(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LFQ3;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LFQ3;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(LFQ3;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LNy2;


# direct methods
.method public constructor <init>(LNy2;)V
    .locals 0

    iput-object p1, p0, LNy2$n;->g:LNy2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LFQ3;)V
    .locals 2

    invoke-virtual {p1}, LFQ3;->b()Lco/bird/android/model/constant/Permission;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/Permission;->CAMERA:Lco/bird/android/model/constant/Permission;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, LFQ3;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LNy2$n;->g:LNy2;

    invoke-static {p1}, LNy2;->access$getNavigator$p(LNy2;)Le13;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/BarcodeScanType;->RAW:Lco/bird/android/model/BarcodeScanType;

    sget v1, Lnl4;->login_scan_code:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Le13;->Y3(Lco/bird/android/model/BarcodeScanType;Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LFQ3;

    invoke-virtual {p0, p1}, LNy2$n;->a(LFQ3;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
