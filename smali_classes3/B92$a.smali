.class public final LB92$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRx6;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB92;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0004\u001a\u00020\u0002H\u0016\u00a8\u0006\u0005"
    }
    d2 = {
        "B92$a",
        "LRx6;",
        "",
        "b",
        "a",
        "servicecenter_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:LB92;


# direct methods
.method public constructor <init>(LB92;)V
    .locals 0

    iput-object p1, p0, LB92$a;->a:LB92;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, LB92$a;->a:LB92;

    invoke-static {v0}, LB92;->access$getUi$p(LB92;)LD92;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, LD92;->A9(Z)V

    return-void
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, LB92$a;->a:LB92;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LB92;->g(Z)V

    iget-object v0, p0, LB92$a;->a:LB92;

    invoke-virtual {v0}, LB92;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LB92$a;->a:LB92;

    invoke-virtual {v0, v1}, LB92;->f(Z)V

    iget-object v0, p0, LB92$a;->a:LB92;

    invoke-static {v0}, LB92;->access$getNavigator$p(LB92;)Le13;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/BarcodeScanType;->RAW:Lco/bird/android/model/BarcodeScanType;

    sget v2, Lnl4;->inventory:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Le13;->Y3(Lco/bird/android/model/BarcodeScanType;Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method
