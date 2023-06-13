.class public final Lfo2$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfo2;->a(LgV2;LRn2;Ldo2;LEy3;ZZLEt0;I)LgV2;
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
.field public final synthetic g:Z

.field public final synthetic h:LZC0;

.field public final synthetic i:Ldo2;


# direct methods
.method public constructor <init>(ZLZC0;Ldo2;)V
    .locals 0

    iput-boolean p1, p0, Lfo2$e;->g:Z

    iput-object p2, p0, Lfo2$e;->h:LZC0;

    iput-object p3, p0, Lfo2$e;->i:Ldo2;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(FF)Ljava/lang/Boolean;
    .locals 6

    iget-boolean v0, p0, Lfo2$e;->g:Z

    if-eqz v0, :cond_0

    move p1, p2

    :cond_0
    iget-object v0, p0, Lfo2$e;->h:LZC0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lfo2$e$a;

    iget-object p2, p0, Lfo2$e;->i:Ldo2;

    const/4 v4, 0x0

    invoke-direct {v3, p2, p1, v4}, Lfo2$e$a;-><init>(Ldo2;FLkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lfo2$e;->a(FF)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
