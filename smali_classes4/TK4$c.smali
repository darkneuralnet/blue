.class public final LTK4$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTK4;-><init>(LxK4;Lgl;LYR4;LpU4;LpM3;LRh6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/Reservation;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/Reservation;",
        "kotlin.jvm.PlatformType",
        "reservation",
        "",
        "a",
        "(Lco/bird/android/model/Reservation;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LTK4;


# direct methods
.method public constructor <init>(LTK4;)V
    .locals 0

    iput-object p1, p0, LTK4$c;->g:LTK4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/Reservation;)V
    .locals 3

    iget-object v0, p0, LTK4$c;->g:LTK4;

    invoke-static {v0}, LTK4;->access$getMutableReservation$p(LTK4;)La94;

    move-result-object v0

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    const-string v2, "reservation"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v1

    invoke-virtual {v0, v1}, La94;->accept(Ljava/lang/Object;)V

    iget-object v0, p0, LTK4$c;->g:LTK4;

    invoke-static {v0}, LTK4;->access$getPreference$p(LTK4;)Lgl;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/Reservation;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgl;->f2(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/Reservation;

    invoke-virtual {p0, p1}, LTK4$c;->a(Lco/bird/android/model/Reservation;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
