.class public final LfE5$b$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LfE5$b;->a(LOU3$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LXe1;",
        "LA52;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LXe1;",
        "it",
        "LA52;",
        "a",
        "(LXe1;)J"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LfE5;

.field public final synthetic h:J


# direct methods
.method public constructor <init>(LfE5;J)V
    .locals 0

    iput-object p1, p0, LfE5$b$a;->g:LfE5;

    iput-wide p2, p0, LfE5$b$a;->h:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LXe1;)J
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LfE5$b$a;->g:LfE5;

    iget-wide v1, p0, LfE5$b$a;->h:J

    invoke-virtual {v0, p1, v1, v2}, LfE5;->j(LXe1;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LXe1;

    invoke-virtual {p0, p1}, LfE5$b$a;->a(LXe1;)J

    move-result-wide v0

    invoke-static {v0, v1}, LA52;->b(J)LA52;

    move-result-object p1

    return-object p1
.end method
