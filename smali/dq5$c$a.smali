.class public final Ldq5$c$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldq5$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LCe3;",
        "LCe3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LCe3;",
        "delta",
        "a",
        "(J)J"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Ldq5;

.field public final synthetic h:LWp5;


# direct methods
.method public constructor <init>(Ldq5;LWp5;)V
    .locals 0

    iput-object p1, p0, Ldq5$c$a;->g:Ldq5;

    iput-object p2, p0, Ldq5$c$a;->h:LWp5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 3

    iget-object v0, p0, Ldq5$c$a;->g:Ldq5;

    iget-object v1, p0, Ldq5$c$a;->h:LWp5;

    invoke-virtual {v0, p1, p2}, Ldq5;->k(J)J

    move-result-wide p1

    sget-object v2, LH43;->a:LH43$a;

    invoke-virtual {v2}, LH43$a;->b()I

    move-result v2

    invoke-virtual {v0, v1, p1, p2, v2}, Ldq5;->a(LWp5;JI)J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Ldq5;->k(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LCe3;

    invoke-virtual {p1}, LCe3;->x()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ldq5$c$a;->a(J)J

    move-result-wide v0

    invoke-static {v0, v1}, LCe3;->d(J)LCe3;

    move-result-object p1

    return-object p1
.end method
