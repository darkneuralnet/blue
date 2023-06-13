.class public final LQe$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQe;->a(LOY2;LJY2;LgV2;LK9;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LOe<",
        "LAY2;",
        ">;",
        "LHA0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LLe;

.field public final synthetic h:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "LOe<",
            "LAY2;",
            ">;",
            "LZe1;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "LOe<",
            "LAY2;",
            ">;",
            "Lgi1;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/util/List<",
            "LAY2;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LLe;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LsP5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLe;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LOe<",
            "LAY2;",
            ">;+",
            "LZe1;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LOe<",
            "LAY2;",
            ">;+",
            "Lgi1;",
            ">;",
            "LsP5<",
            "+",
            "Ljava/util/List<",
            "LAY2;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, LQe$g;->g:LLe;

    iput-object p2, p0, LQe$g;->h:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, LQe$g;->i:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, LQe$g;->j:LsP5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LOe;)LHA0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LOe<",
            "LAY2;",
            ">;)",
            "LHA0;"
        }
    .end annotation

    const-string v0, "$this$AnimatedContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LQe$g;->g:LLe;

    invoke-virtual {v0}, LLe;->m()LEX2;

    move-result-object v0

    invoke-interface {v0}, LEX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LQe$g;->j:LsP5;

    invoke-static {v0}, LQe;->d(LsP5;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, LOe;->getInitialState()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LQe$g;->j:LsP5;

    invoke-static {v0}, LQe;->d(LsP5;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, LOe;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    int-to-float v0, v0

    move v4, v0

    iget-object v0, p0, LQe$g;->j:LsP5;

    invoke-static {v0}, LQe;->d(LsP5;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, LOe;->getInitialState()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, LHA0;

    iget-object v1, p0, LQe$g;->h:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LZe1;

    iget-object v1, p0, LQe$g;->i:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lgi1;

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, LHA0;-><init>(LZe1;Lgi1;FLGB5;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    sget-object p1, LZe1;->a:LZe1$a;

    invoke-virtual {p1}, LZe1$a;->a()LZe1;

    move-result-object p1

    sget-object v0, Lgi1;->a:Lgi1$a;

    invoke-virtual {v0}, Lgi1$a;->a()Lgi1;

    move-result-object v0

    invoke-static {p1, v0}, LMe;->d(LZe1;Lgi1;)LHA0;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LOe;

    invoke-virtual {p0, p1}, LQe$g;->a(LOe;)LHA0;

    move-result-object p1

    return-object p1
.end method
