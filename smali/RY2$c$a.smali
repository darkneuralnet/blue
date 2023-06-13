.class public final LRY2$c$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRY2$c;->invoke(Ljava/lang/String;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lm51;",
        "Ll51;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/util/List<",
            "LAY2;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic i:Lzt0;


# direct methods
.method public constructor <init>(LEX2;LsP5;Lzt0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;",
            "LsP5<",
            "+",
            "Ljava/util/List<",
            "LAY2;",
            ">;>;",
            "Lzt0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LRY2$c$a;->g:LEX2;

    iput-object p2, p0, LRY2$c$a;->h:LsP5;

    iput-object p3, p0, LRY2$c$a;->i:Lzt0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm51;

    invoke-virtual {p0, p1}, LRY2$c$a;->invoke(Lm51;)Ll51;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lm51;)Ll51;
    .locals 2

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LRY2$c$a;->g:LEX2;

    invoke-static {p1}, LRY2;->g(LEX2;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LRY2$c$a;->h:LsP5;

    invoke-static {p1}, LRY2;->f(LsP5;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, LRY2$c$a;->i:Lzt0;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LAY2;

    invoke-virtual {v0, v1}, Lzt0;->m(LAY2;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LRY2$c$a;->g:LEX2;

    const/4 v0, 0x0

    invoke-static {p1, v0}, LRY2;->h(LEX2;Z)V

    :cond_1
    iget-object p1, p0, LRY2$c$a;->h:LsP5;

    iget-object v0, p0, LRY2$c$a;->i:Lzt0;

    new-instance v1, LRY2$c$a$a;

    invoke-direct {v1, p1, v0}, LRY2$c$a$a;-><init>(LsP5;Lzt0;)V

    return-object v1
.end method
