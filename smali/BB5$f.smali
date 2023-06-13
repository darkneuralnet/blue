.class public final LBB5$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBB5;->e(LK9;Z)LXG6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LG52;",
        "Lpm2;",
        "LA52;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LG52;",
        "size",
        "Lpm2;",
        "layoutDirection",
        "LA52;",
        "a",
        "(JLpm2;)J"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LK9;


# direct methods
.method public constructor <init>(LK9;)V
    .locals 0

    iput-object p1, p0, LBB5$f;->g:LK9;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(JLpm2;)J
    .locals 7

    const-string v0, "layoutDirection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LBB5$f;->g:LK9;

    sget-object v0, LG52;->b:LG52$a;

    invoke-virtual {v0}, LG52$a;->a()J

    move-result-wide v2

    move-wide v4, p1

    move-object v6, p3

    invoke-interface/range {v1 .. v6}, LK9;->a(JJLpm2;)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LG52;

    invoke-virtual {p1}, LG52;->j()J

    move-result-wide v0

    check-cast p2, Lpm2;

    invoke-virtual {p0, v0, v1, p2}, LBB5$f;->a(JLpm2;)J

    move-result-wide p1

    invoke-static {p1, p2}, LA52;->b(J)LA52;

    move-result-object p1

    return-object p1
.end method
