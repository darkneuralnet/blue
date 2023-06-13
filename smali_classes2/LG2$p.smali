.class public final LLG2$p;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLG2;->F()V
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
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "e",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Ljava/lang/Throwable;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LLG2;


# direct methods
.method public constructor <init>(LLG2;)V
    .locals 0

    iput-object p1, p0, LLG2$p;->g:LLG2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LLG2;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, LLG2$p;->c(LLG2;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final c(LLG2;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LLG2;->access$getUi$p(LLG2;)LbH2;

    move-result-object p0

    invoke-interface {p0}, LbH2;->Qg()V

    throw p1
.end method


# virtual methods
.method public final b(Ljava/lang/Throwable;)Lio/reactivex/h;
    .locals 3

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lco/bird/api/error/RetrofitException;

    if-eqz v0, :cond_0

    iget-object v0, p0, LLG2$p;->g:LLG2;

    invoke-static {v0}, LLG2;->access$getUi$p(LLG2;)LbH2;

    move-result-object v0

    invoke-interface {v0}, LbH2;->Mc()Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, LLG2$p;->g:LLG2;

    new-instance v2, LVG2;

    invoke-direct {v2, v1, p1}, LVG2;-><init>(LLG2;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v2}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    return-object p1

    :cond_0
    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LLG2$p;->b(Ljava/lang/Throwable;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
