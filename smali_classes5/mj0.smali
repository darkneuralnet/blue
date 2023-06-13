.class public final Lmj0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmj0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B%\u0008\u0007\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0011\u0012\u0008\u0008\u0002\u0010$\u001a\u00020#\u00a2\u0006\u0004\u0008%\u0010&J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0006J+\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010!\u00a8\u0006\'"
    }
    d2 = {
        "Lmj0;",
        "",
        "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;",
        "transaction",
        "",
        "d",
        "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V",
        "e",
        "Landroid/content/Context;",
        "context",
        "",
        "startTimestamp",
        "Lyi1;",
        "exportFormat",
        "Landroid/net/Uri;",
        "f",
        "(Landroid/content/Context;Ljava/lang/Long;Lyi1;)Landroid/net/Uri;",
        "",
        "a",
        "Z",
        "c",
        "()Z",
        "setShowNotification",
        "(Z)V",
        "showNotification",
        "LKN4;",
        "b",
        "LKN4;",
        "retentionManager",
        "Lcom/chuckerteam/chucker/internal/support/a;",
        "Lcom/chuckerteam/chucker/internal/support/a;",
        "notificationHelper",
        "LZC0;",
        "LZC0;",
        "scope",
        "LKN4$b;",
        "retentionPeriod",
        "<init>",
        "(Landroid/content/Context;ZLKN4$b;)V",
        "com.github.ChuckerTeam.Chucker.library"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public a:Z

.field public final b:LKN4;

.field public final c:Lcom/chuckerteam/chucker/internal/support/a;

.field public final d:LZC0;


# direct methods
.method public constructor <init>(Landroid/content/Context;ZLKN4$b;)V
    .locals 1
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retentionPeriod"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lmj0;->a:Z

    new-instance p2, LKN4;

    invoke-direct {p2, p1, p3}, LKN4;-><init>(Landroid/content/Context;LKN4$b;)V

    iput-object p2, p0, Lmj0;->b:LKN4;

    new-instance p2, Lcom/chuckerteam/chucker/internal/support/a;

    invoke-direct {p2, p1}, Lcom/chuckerteam/chucker/internal/support/a;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lmj0;->c:Lcom/chuckerteam/chucker/internal/support/a;

    invoke-static {}, LaD0;->b()LZC0;

    move-result-object p2

    iput-object p2, p0, Lmj0;->d:LZC0;

    sget-object p2, LhI4;->a:LhI4;

    invoke-virtual {p2, p1}, LhI4;->a(Landroid/content/Context;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;ZLKN4$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x1

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    sget-object p3, LKN4$b;->d:LKN4$b;

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lmj0;-><init>(Landroid/content/Context;ZLKN4$b;)V

    return-void
.end method

.method public static final synthetic a(Lmj0;)Lcom/chuckerteam/chucker/internal/support/a;
    .locals 0

    iget-object p0, p0, Lmj0;->c:Lcom/chuckerteam/chucker/internal/support/a;

    return-object p0
.end method

.method public static final synthetic b(Lmj0;)LKN4;
    .locals 0

    iget-object p0, p0, Lmj0;->b:LKN4;

    return-object p0
.end method


# virtual methods
.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lmj0;->a:Z

    return v0
.end method

.method public final d(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V
    .locals 7

    const-string v0, "transaction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lmj0;->d:LZC0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lmj0$b;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lmj0$b;-><init>(Lmj0;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final e(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V
    .locals 7

    const-string v0, "transaction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lmj0;->d:LZC0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lmj0$c;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lmj0$c;-><init>(Lmj0;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final f(Landroid/content/Context;Ljava/lang/Long;Lyi1;)Landroid/net/Uri;
    .locals 10

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exportFormat"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LhI4;->a:LhI4;

    invoke-virtual {v0}, LhI4;->b()LNN1;

    move-result-object v0

    invoke-interface {v0, p2}, LNN1;->i(Ljava/lang/Long;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object v0, Lmj0$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    new-instance v0, LA66;

    sget-object v1, Lli2;->a:Lli2;

    invoke-virtual {v1}, Lli2;->b()LoE1;

    move-result-object v1

    sget-object v2, LZE1;->a:LZE1;

    new-instance v9, LGE0;

    sget v3, Lal4;->chucker_name:I

    invoke-virtual {p1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v3, "context.getString(R.string.chucker_name)"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v3, Lal4;->chucker_version:I

    invoke-virtual {p1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v3, "context.getString(R.string.chucker_version)"

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, LGE0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, p2, v9}, LZE1;->a(Ljava/util/List;LGE0;)LYE1;

    move-result-object p2

    invoke-virtual {v1, p2}, LoE1;->x(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v1, "JsonConverter.nonNullSer\u2026                        )"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p2}, LA66;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    new-instance v0, Lx76;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Lx76;-><init>(Ljava/util/List;Z)V

    :goto_0
    invoke-virtual {p3}, Lyi1;->b()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "api_transactions."

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p1, p2}, LGy5;->d(LFy5;Landroid/content/Context;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    return-object p1
.end method
