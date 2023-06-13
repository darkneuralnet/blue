.class public final LAo0$a$d$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAo0$a$d;->invoke(Lkotlin/Pair;)Lio/reactivex/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/DialogResponse;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/DialogResponse;",
        "response",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LAo0;

.field public final synthetic h:Lco/bird/android/model/persistence/Bird;

.field public final synthetic i:Lco/bird/android/model/VehicleCommand;

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public constructor <init>(LAo0;Lco/bird/android/model/persistence/Bird;Lco/bird/android/model/VehicleCommand;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LAo0$a$d$b;->g:LAo0;

    iput-object p2, p0, LAo0$a$d$b;->h:Lco/bird/android/model/persistence/Bird;

    iput-object p3, p0, LAo0$a$d$b;->i:Lco/bird/android/model/VehicleCommand;

    iput-object p4, p0, LAo0$a$d$b;->j:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/DialogResponse;)Lio/reactivex/h;
    .locals 4

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/model/DialogResponse;->OK:Lco/bird/android/model/DialogResponse;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LAo0$a$d$b;->g:LAo0;

    invoke-static {p1}, LAo0;->access$getCommandManager$p(LAo0;)LTo0;

    move-result-object p1

    iget-object v0, p0, LAo0$a$d$b;->h:Lco/bird/android/model/persistence/Bird;

    const-string v1, "bird"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LAo0$a$d$b;->i:Lco/bird/android/model/VehicleCommand;

    invoke-virtual {v1}, Lco/bird/android/model/VehicleCommand;->getMethod()Lco/bird/android/model/CommandMethod;

    move-result-object v1

    invoke-static {v1}, Lco/bird/android/model/VehicleCommandKt;->isBluetooth(Lco/bird/android/model/CommandMethod;)Z

    move-result v1

    iget-object v2, p0, LAo0$a$d$b;->j:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, v0, v3, v1, v2}, LTo0;->e(Lco/bird/android/model/persistence/Bird;ZZLjava/lang/String;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LAo0$a$d$b;->g:LAo0;

    invoke-static {p1}, LAo0;->access$getUi$p(LAo0;)Llp0;

    move-result-object p1

    iget-object v0, p0, LAo0$a$d$b;->i:Lco/bird/android/model/VehicleCommand;

    invoke-interface {p1, v0}, Llp0;->Jd(Lco/bird/android/model/VehicleCommand;)V

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/DialogResponse;

    invoke-virtual {p0, p1}, LAo0$a$d$b;->a(Lco/bird/android/model/DialogResponse;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
