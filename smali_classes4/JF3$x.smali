.class public final LJF3$x;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJF3;->u0(Lf13;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WireRide;Z)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lco/bird/android/model/wire/configs/Config;",
        "Lco/bird/android/model/wire/WireRide;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/Config;",
        "config",
        "Lco/bird/android/model/wire/WireRide;",
        "ride",
        "",
        "a",
        "(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WireRide;)Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LJF3;

.field public final synthetic h:Z

.field public final synthetic i:Lf13;


# direct methods
.method public constructor <init>(LJF3;ZLf13;)V
    .locals 0

    iput-object p1, p0, LJF3$x;->g:LJF3;

    iput-boolean p2, p0, LJF3$x;->h:Z

    iput-object p3, p0, LJF3$x;->i:Lf13;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WireRide;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "ride"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LJF3$x;->g:LJF3;

    invoke-static {p1}, LJF3;->access$getArManager$p(LJF3;)Ltm;

    move-result-object p1

    iget-boolean p2, p0, LJF3$x;->h:Z

    if-eqz p2, :cond_0

    const-string p2, "optional_parking_dialog"

    goto :goto_0

    :cond_0
    const-string p2, "mandatory"

    :goto_0
    invoke-interface {p1, p2}, Ltm;->d(Ljava/lang/String;)V

    iget-object p1, p0, LJF3$x;->i:Lf13;

    iget-object p2, p0, LJF3$x;->g:LJF3;

    new-instance v0, LJF3$x$b;

    invoke-direct {v0, p2}, LJF3$x$b;-><init>(LJF3;)V

    invoke-interface {p1, p2, v0}, Lf13;->f(LA5;Lkotlin/jvm/functions/Function1;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    iget-object p1, p0, LJF3$x;->i:Lf13;

    iget-object p2, p0, LJF3$x;->g:LJF3;

    new-instance v0, LJF3$x$a;

    invoke-direct {v0, p2}, LJF3$x$a;-><init>(LJF3;)V

    invoke-interface {p1, p2, v0}, Lf13;->h(LA5;Lkotlin/jvm/functions/Function1;)V

    :goto_1
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    check-cast p2, Lco/bird/android/model/wire/WireRide;

    invoke-virtual {p0, p1, p2}, LJF3$x;->a(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WireRide;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
