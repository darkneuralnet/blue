.class public final LUp5$c$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUp5$c$a;->invoke(Lss5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/Float;",
        "Ljava/lang/Float;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LZC0;

.field public final synthetic h:Z

.field public final synthetic i:LXp5;


# direct methods
.method public constructor <init>(LZC0;ZLXp5;)V
    .locals 0

    iput-object p1, p0, LUp5$c$a$a;->g:LZC0;

    iput-boolean p2, p0, LUp5$c$a$a;->h:Z

    iput-object p3, p0, LUp5$c$a$a;->i:LXp5;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(FF)Ljava/lang/Boolean;
    .locals 10

    iget-object v0, p0, LUp5$c$a$a;->g:LZC0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v9, LUp5$c$a$a$a;

    iget-boolean v4, p0, LUp5$c$a$a;->h:Z

    iget-object v5, p0, LUp5$c$a$a;->i:LXp5;

    const/4 v8, 0x0

    move-object v3, v9

    move v6, p2

    move v7, p1

    invoke-direct/range {v3 .. v8}, LUp5$c$a$a$a;-><init>(ZLXp5;FFLkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-virtual {p0, p1, p2}, LUp5$c$a$a;->a(FF)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
