.class public final LuW5$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LuW5;->c(Lnf;Lef;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Long;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\u0008\u0000\u0010\u0000\"\u0008\u0008\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "T",
        "Lvf;",
        "V",
        "",
        "it",
        "",
        "a",
        "(J)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lkf<",
            "TT;TV;>;>;"
        }
    .end annotation
.end field

.field public final synthetic h:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final synthetic i:Lef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lef<",
            "TT;TV;>;"
        }
    .end annotation
.end field

.field public final synthetic j:Lvf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field public final synthetic k:Lnf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnf<",
            "TT;TV;>;"
        }
    .end annotation
.end field

.field public final synthetic l:F

.field public final synthetic m:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lkf<",
            "TT;TV;>;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/Object;Lef;Lvf;Lnf;FLkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lkf<",
            "TT;TV;>;>;TT;",
            "Lef<",
            "TT;TV;>;TV;",
            "Lnf<",
            "TT;TV;>;F",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkf<",
            "TT;TV;>;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LuW5$d;->g:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p2, p0, LuW5$d;->h:Ljava/lang/Object;

    iput-object p3, p0, LuW5$d;->i:Lef;

    iput-object p4, p0, LuW5$d;->j:Lvf;

    iput-object p5, p0, LuW5$d;->k:Lnf;

    iput p6, p0, LuW5$d;->l:F

    iput-object p7, p0, LuW5$d;->m:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 13

    iget-object v0, p0, LuW5$d;->g:Lkotlin/jvm/internal/Ref$ObjectRef;

    new-instance v12, Lkf;

    iget-object v2, p0, LuW5$d;->h:Ljava/lang/Object;

    iget-object v1, p0, LuW5$d;->i:Lef;

    invoke-interface {v1}, Lef;->d()Lwb6;

    move-result-object v3

    iget-object v4, p0, LuW5$d;->j:Lvf;

    iget-object v1, p0, LuW5$d;->i:Lef;

    invoke-interface {v1}, Lef;->f()Ljava/lang/Object;

    move-result-object v7

    const/4 v10, 0x1

    new-instance v11, LuW5$d$a;

    iget-object v1, p0, LuW5$d;->k:Lnf;

    invoke-direct {v11, v1}, LuW5$d$a;-><init>(Lnf;)V

    move-object v1, v12

    move-wide v5, p1

    move-wide v8, p1

    invoke-direct/range {v1 .. v11}, Lkf;-><init>(Ljava/lang/Object;Lwb6;Lvf;JLjava/lang/Object;JZLkotlin/jvm/functions/Function0;)V

    iget v4, p0, LuW5$d;->l:F

    iget-object v5, p0, LuW5$d;->i:Lef;

    iget-object v6, p0, LuW5$d;->k:Lnf;

    iget-object v7, p0, LuW5$d;->m:Lkotlin/jvm/functions/Function1;

    move-wide v2, p1

    invoke-static/range {v1 .. v7}, LuW5;->a(Lkf;JFLef;Lnf;Lkotlin/jvm/functions/Function1;)V

    iput-object v12, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LuW5$d;->a(J)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
