.class public final Ldq5$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldq5;->a(LWp5;JI)J
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

.field public final synthetic h:I

.field public final synthetic i:LWp5;


# direct methods
.method public constructor <init>(Ldq5;ILWp5;)V
    .locals 0

    iput-object p1, p0, Ldq5$a;->g:Ldq5;

    iput p2, p0, Ldq5$a;->h:I

    iput-object p3, p0, Ldq5$a;->i:LWp5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 11

    iget-object v0, p0, Ldq5$a;->g:Ldq5;

    invoke-virtual {v0}, Ldq5;->d()LsP5;

    move-result-object v0

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LC43;

    iget v0, p0, Ldq5$a;->h:I

    invoke-virtual {v1, p1, p2, v0}, LC43;->d(JI)J

    move-result-wide v7

    invoke-static {p1, p2, v7, v8}, LCe3;->s(JJ)J

    move-result-wide p1

    iget-object v0, p0, Ldq5$a;->g:Ldq5;

    iget-object v2, p0, Ldq5$a;->i:LWp5;

    invoke-virtual {v0, p1, p2}, Ldq5;->k(J)J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Ldq5;->p(J)F

    move-result v3

    invoke-interface {v2, v3}, LWp5;->a(F)F

    move-result v2

    invoke-virtual {v0, v2}, Ldq5;->q(F)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ldq5;->k(J)J

    move-result-wide v9

    invoke-static {p1, p2, v9, v10}, LCe3;->s(JJ)J

    move-result-wide v4

    iget v6, p0, Ldq5$a;->h:I

    move-wide v2, v9

    invoke-virtual/range {v1 .. v6}, LC43;->b(JJI)J

    move-result-wide p1

    invoke-static {v7, v8, v9, v10}, LCe3;->t(JJ)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, LCe3;->t(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LCe3;

    invoke-virtual {p1}, LCe3;->x()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ldq5$a;->a(J)J

    move-result-wide v0

    invoke-static {v0, v1}, LCe3;->d(J)LCe3;

    move-result-object p1

    return-object p1
.end method
