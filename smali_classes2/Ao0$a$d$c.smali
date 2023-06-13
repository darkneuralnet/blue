.class public final LAo0$a$d$c;
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
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "e",
        "",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LAo0;

.field public final synthetic h:Lco/bird/android/model/VehicleCommand;


# direct methods
.method public constructor <init>(LAo0;Lco/bird/android/model/VehicleCommand;)V
    .locals 0

    iput-object p1, p0, LAo0$a$d$c;->g:LAo0;

    iput-object p2, p0, LAo0$a$d$c;->h:Lco/bird/android/model/VehicleCommand;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LAo0$a$d$c;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 2

    new-instance v0, Lco/bird/android/command/errors/VehicleCommandException;

    const-string v1, "e"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Lco/bird/android/command/errors/VehicleCommandException;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0}, Lg46;->e(Ljava/lang/Throwable;)V

    iget-object p1, p0, LAo0$a$d$c;->g:LAo0;

    invoke-static {p1}, LAo0;->access$getUi$p(LAo0;)Llp0;

    move-result-object p1

    iget-object v0, p0, LAo0$a$d$c;->h:Lco/bird/android/model/VehicleCommand;

    invoke-interface {p1, v0}, Llp0;->Jd(Lco/bird/android/model/VehicleCommand;)V

    iget-object p1, p0, LAo0$a$d$c;->g:LAo0;

    invoke-static {p1}, LAo0;->access$getUi$p(LAo0;)Llp0;

    move-result-object p1

    iget-object v0, p0, LAo0$a$d$c;->h:Lco/bird/android/model/VehicleCommand;

    invoke-interface {p1, v0}, Llp0;->M3(Lco/bird/android/model/VehicleCommand;)V

    iget-object p1, p0, LAo0$a$d$c;->g:LAo0;

    invoke-static {p1}, LAo0;->access$getUi$p(LAo0;)Llp0;

    move-result-object p1

    const-wide/16 v0, 0x3e8

    invoke-interface {p1, v0, v1}, LLo6;->vibrate(J)V

    return-void
.end method
