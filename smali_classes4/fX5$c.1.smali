.class public final LfX5$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LfX5;-><init>(LaG6;LAb4;Lsu2;Le13;Lcom/uber/autodispose/ScopeProvider;LTq4;LiX5;LLW5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/QCInspection;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/QCInspection;",
        "kotlin.jvm.PlatformType",
        "qcInspection",
        "",
        "a",
        "(Lco/bird/android/model/QCInspection;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LfX5;


# direct methods
.method public constructor <init>(LfX5;)V
    .locals 0

    iput-object p1, p0, LfX5$c;->g:LfX5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/QCInspection;)V
    .locals 2

    iget-object v0, p0, LfX5$c;->g:LfX5;

    invoke-static {v0}, LfX5;->access$getUi$p(LfX5;)LiX5;

    move-result-object v0

    iget-object v1, p0, LfX5$c;->g:LfX5;

    invoke-virtual {p1}, Lco/bird/android/model/QCInspection;->getStatus()Lco/bird/android/model/constant/QCStatus;

    move-result-object p1

    invoke-static {v1, p1}, LfX5;->access$toBoolean(LfX5;Lco/bird/android/model/constant/QCStatus;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LiX5;->vj(Ljava/lang/Boolean;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/QCInspection;

    invoke-virtual {p0, p1}, LfX5$c;->a(Lco/bird/android/model/QCInspection;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
