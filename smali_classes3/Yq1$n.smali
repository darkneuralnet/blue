.class public final LYq1$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYq1;->E(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LYq1;


# direct methods
.method public constructor <init>(LYq1;)V
    .locals 0

    iput-object p1, p0, LYq1$n;->g:LYq1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;)V
    .locals 0

    iget-object p1, p0, LYq1$n;->g:LYq1;

    invoke-static {p1}, LYq1;->access$getServerDrivenFilterManager$p(LYq1;)Lot5;

    move-result-object p1

    invoke-interface {p1}, Lot5;->d()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;

    invoke-virtual {p0, p1}, LYq1$n;->a(Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
