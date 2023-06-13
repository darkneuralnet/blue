.class public final Lcom/chuckerteam/chucker/internal/support/ClearDatabaseService;
.super Landroidx/core/app/JobIntentService;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/chuckerteam/chucker/internal/support/ClearDatabaseService$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 \u000c2\u00020\u0001:\u0001\rB\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/chuckerteam/chucker/internal/support/ClearDatabaseService;",
        "Landroidx/core/app/JobIntentService;",
        "Landroid/content/Intent;",
        "intent",
        "",
        "g",
        "LZC0;",
        "k",
        "LZC0;",
        "scope",
        "<init>",
        "()V",
        "l",
        "a",
        "com.github.ChuckerTeam.Chucker.library"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final l:Lcom/chuckerteam/chucker/internal/support/ClearDatabaseService$a;


# instance fields
.field public final k:LZC0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/chuckerteam/chucker/internal/support/ClearDatabaseService$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/chuckerteam/chucker/internal/support/ClearDatabaseService$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/chuckerteam/chucker/internal/support/ClearDatabaseService;->l:Lcom/chuckerteam/chucker/internal/support/ClearDatabaseService$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/core/app/JobIntentService;-><init>()V

    invoke-static {}, LaD0;->b()LZC0;

    move-result-object v0

    iput-object v0, p0, Lcom/chuckerteam/chucker/internal/support/ClearDatabaseService;->k:LZC0;

    return-void
.end method


# virtual methods
.method public g(Landroid/content/Intent;)V
    .locals 8

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, LhI4;->a:LhI4;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "applicationContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, LhI4;->a(Landroid/content/Context;)V

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/support/ClearDatabaseService;->k:LZC0;

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lcom/chuckerteam/chucker/internal/support/ClearDatabaseService$b;

    const/4 p1, 0x0

    invoke-direct {v5, p0, p1}, Lcom/chuckerteam/chucker/internal/support/ClearDatabaseService$b;-><init>(Lcom/chuckerteam/chucker/internal/support/ClearDatabaseService;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method
