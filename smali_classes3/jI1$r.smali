.class public final LjI1$r;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LjI1;->H()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Triple<",
        "+",
        "Lco/bird/android/model/wire/WireVehicleDiagnostics;",
        "+",
        "Ljava/util/List<",
        "+",
        "LH6;",
        ">;+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0008\u001a\u00020\u00072N\u0010\u0006\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*$\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lkotlin/Triple;",
        "Lco/bird/android/model/wire/WireVehicleDiagnostics;",
        "",
        "LH6;",
        "",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(Lkotlin/Triple;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LjI1;


# direct methods
.method public constructor <init>(LjI1;)V
    .locals 0

    iput-object p1, p0, LjI1$r;->g:LjI1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lco/bird/android/model/wire/WireVehicleDiagnostics;",
            "+",
            "Ljava/util/List<",
            "LH6;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireVehicleDiagnostics;

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    iget-object v2, p0, LjI1$r;->g:LjI1;

    invoke-static {v2}, LjI1;->access$getHealthCheckUi$p(LjI1;)LqI1;

    move-result-object v2

    const-string v3, "vehicleFaults"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, LqI1;->b(Ljava/util/List;)V

    iget-object v2, p0, LjI1$r;->g:LjI1;

    invoke-static {v2}, LjI1;->access$getHealthCheckUi$p(LjI1;)LqI1;

    move-result-object v2

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireVehicleDiagnostics;->getLastTrack()Lco/bird/android/model/wire/WireDisplayValue;

    move-result-object v0

    invoke-virtual {v2, v0}, LqI1;->h(Lco/bird/android/model/wire/WireDisplayValue;)V

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, LjI1$r;->g:LjI1;

    invoke-static {p1}, LjI1;->access$getHealthCheckUi$p(LjI1;)LqI1;

    move-result-object p1

    invoke-virtual {p1}, LqI1;->i()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LjI1$r;->g:LjI1;

    invoke-static {v0}, LjI1;->access$getHealthCheckUi$p(LjI1;)LqI1;

    move-result-object v0

    invoke-virtual {v0}, LqI1;->g()V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, LjI1$r;->g:LjI1;

    invoke-static {p1}, LjI1;->access$getHealthCheckUi$p(LjI1;)LqI1;

    move-result-object p1

    invoke-virtual {p1}, LqI1;->l()V

    goto :goto_0

    :cond_1
    iget-object p1, p0, LjI1$r;->g:LjI1;

    invoke-static {p1}, LjI1;->access$getHealthCheckUi$p(LjI1;)LqI1;

    move-result-object p1

    invoke-virtual {p1}, LqI1;->f()V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, LjI1$r;->a(Lkotlin/Triple;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
