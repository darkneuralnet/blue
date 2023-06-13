.class public final LYd5$o;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYd5;->t0(Lio/reactivex/c;ZLKY;LbE5;Ljava/lang/Integer;)Lio/reactivex/c;
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
.field public final synthetic g:LYd5;

.field public final synthetic h:Z

.field public final synthetic i:LKY;

.field public final synthetic j:LbE5;

.field public final synthetic k:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(LYd5;ZLKY;LbE5;Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, LYd5$o;->g:LYd5;

    iput-boolean p2, p0, LYd5$o;->h:Z

    iput-object p3, p0, LYd5$o;->i:LKY;

    iput-object p4, p0, LYd5$o;->j:LbE5;

    iput-object p5, p0, LYd5$o;->k:Ljava/lang/Integer;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LYd5$o;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 6

    iget-object v0, p0, LYd5$o;->g:LYd5;

    iget-boolean v1, p0, LYd5$o;->h:Z

    iget-object v2, p0, LYd5$o;->i:LKY;

    iget-object v3, p0, LYd5$o;->j:LbE5;

    iget-object v4, p0, LYd5$o;->k:Ljava/lang/Integer;

    const-string v5, "it"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, LYd5;->access$bluetoothErrorType(LYd5;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v5

    invoke-static/range {v0 .. v5}, LYd5;->access$logDeepSleepFailedEvent(LYd5;ZLKY;LbE5;Ljava/lang/Integer;Ljava/lang/String;)V

    return-void
.end method
