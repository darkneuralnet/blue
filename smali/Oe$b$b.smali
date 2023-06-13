.class public final LOe$b$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOe$b;->f(LzO2;LvO2;J)LyO2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LF96$b<",
        "TS;>;",
        "Ltm1<",
        "LG52;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "S",
        "LF96$b;",
        "Ltm1;",
        "LG52;",
        "a",
        "(LF96$b;)Ltm1;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LOe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LOe<",
            "TS;>;"
        }
    .end annotation
.end field

.field public final synthetic h:LOe$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LOe<",
            "TS;>.b;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LOe;LOe$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LOe<",
            "TS;>;",
            "LOe<",
            "TS;>.b;)V"
        }
    .end annotation

    iput-object p1, p0, LOe$b$b;->g:LOe;

    iput-object p2, p0, LOe$b$b;->h:LOe$b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF96$b;)Ltm1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF96$b<",
            "TS;>;)",
            "Ltm1<",
            "LG52;",
            ">;"
        }
    .end annotation

    const-string v0, "$this$animate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LOe$b$b;->g:LOe;

    invoke-virtual {v0}, LOe;->g()Ljava/util/Map;

    move-result-object v0

    invoke-interface {p1}, LF96$b;->getInitialState()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LsP5;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LG52;

    invoke-virtual {v0}, LG52;->j()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    sget-object v0, LG52;->b:LG52$a;

    invoke-virtual {v0}, LG52$a;->a()J

    move-result-wide v0

    :goto_0
    iget-object v2, p0, LOe$b$b;->g:LOe;

    invoke-virtual {v2}, LOe;->g()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1}, LF96$b;->b()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LsP5;

    if-eqz p1, :cond_1

    invoke-interface {p1}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG52;

    invoke-virtual {p1}, LG52;->j()J

    move-result-wide v2

    goto :goto_1

    :cond_1
    sget-object p1, LG52;->b:LG52$a;

    invoke-virtual {p1}, LG52$a;->a()J

    move-result-wide v2

    :goto_1
    iget-object p1, p0, LOe$b$b;->h:LOe$b;

    invoke-virtual {p1}, LOe$b;->a()LsP5;

    move-result-object p1

    invoke-interface {p1}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LGB5;

    if-eqz p1, :cond_2

    invoke-interface {p1, v0, v1, v2, v3}, LGB5;->b(JJ)Ltm1;

    move-result-object p1

    if-nez p1, :cond_3

    :cond_2
    const/4 p1, 0x7

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v0, v1, p1, v1}, Lmf;->i(FFLjava/lang/Object;ILjava/lang/Object;)LjO5;

    move-result-object p1

    :cond_3
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF96$b;

    invoke-virtual {p0, p1}, LOe$b$b;->a(LF96$b;)Ltm1;

    move-result-object p1

    return-object p1
.end method
