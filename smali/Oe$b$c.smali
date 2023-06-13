.class public final LOe$b$c;
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
        "TS;",
        "LG52;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "S",
        "it",
        "LG52;",
        "b",
        "(Ljava/lang/Object;)J"
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


# direct methods
.method public constructor <init>(LOe;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LOe<",
            "TS;>;)V"
        }
    .end annotation

    iput-object p1, p0, LOe$b$c;->g:LOe;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;)J"
        }
    .end annotation

    iget-object v0, p0, LOe$b$c;->g:LOe;

    invoke-virtual {v0}, LOe;->g()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LsP5;

    if-eqz p1, :cond_0

    invoke-interface {p1}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG52;

    invoke-virtual {p1}, LG52;->j()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    sget-object p1, LG52;->b:LG52$a;

    invoke-virtual {p1}, LG52$a;->a()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0, p1}, LOe$b$c;->b(Ljava/lang/Object;)J

    move-result-wide v0

    invoke-static {v0, v1}, LG52;->b(J)LG52;

    move-result-object p1

    return-object p1
.end method
