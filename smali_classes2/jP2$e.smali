.class public final LjP2$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LjP2;->Q()V
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
        "it",
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
.field public final synthetic g:LjP2;


# direct methods
.method public constructor <init>(LjP2;)V
    .locals 0

    iput-object p1, p0, LjP2$e;->g:LjP2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LjP2;)V
    .locals 0

    invoke-static {p0}, LjP2$e;->b(LjP2;)V

    return-void
.end method

.method public static final b(LjP2;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LjP2;->access$getNavigator$p(LjP2;)Le13;

    move-result-object p0

    invoke-interface {p0}, Le13;->e3()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LjP2$e;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 5

    iget-object v0, p0, LjP2$e;->g:LjP2;

    invoke-static {v0}, LjP2;->access$getUi$p(LjP2;)LlP2;

    move-result-object v0

    sget v1, Lnl4;->add_inspection_jobs_error_message:I

    invoke-interface {v0, v1}, LaM5;->error(I)V

    iget-object v0, p0, LjP2$e;->g:LjP2;

    invoke-static {v0}, LjP2;->access$getHandler$p(LjP2;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, LjP2$e;->g:LjP2;

    new-instance v2, LkP2;

    invoke-direct {v2, v1}, LkP2;-><init>(LjP2;)V

    const-wide/16 v3, 0x7d0

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-static {p1}, Lg46;->e(Ljava/lang/Throwable;)V

    return-void
.end method
