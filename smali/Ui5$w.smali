.class public final LUi5$w;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUi5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LTi5;",
        "LGN5;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LTi5;",
        "LGN5;",
        "it",
        "",
        "a",
        "(LTi5;LGN5;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LUi5$w;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LUi5$w;

    invoke-direct {v0}, LUi5$w;-><init>()V

    sput-object v0, LUi5$w;->g:LUi5$w;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LTi5;LGN5;)Ljava/lang/Object;
    .locals 6

    const-string v0, "$this$Saver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xe

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p2}, LGN5;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Lpm0;->i(J)Lpm0;

    move-result-object v1

    sget-object v2, Lpm0;->b:Lpm0$a;

    invoke-static {v2}, LUi5;->h(Lpm0$a;)LRi5;

    move-result-object v3

    invoke-static {v1, v3, p1}, LUi5;->u(Ljava/lang/Object;LRi5;LTi5;)Ljava/lang/Object;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    invoke-virtual {p2}, LGN5;->k()J

    move-result-wide v3

    invoke-static {v3, v4}, LM26;->b(J)LM26;

    move-result-object v1

    sget-object v3, LM26;->b:LM26$a;

    invoke-static {v3}, LUi5;->r(LM26$a;)LRi5;

    move-result-object v4

    invoke-static {v1, v4, p1}, LUi5;->u(Ljava/lang/Object;LRi5;LTi5;)Ljava/lang/Object;

    move-result-object v1

    const/4 v4, 0x1

    aput-object v1, v0, v4

    invoke-virtual {p2}, LGN5;->n()LJw1;

    move-result-object v1

    sget-object v4, LJw1;->c:LJw1$a;

    invoke-static {v4}, LUi5;->i(LJw1$a;)LRi5;

    move-result-object v4

    invoke-static {v1, v4, p1}, LUi5;->u(Ljava/lang/Object;LRi5;LTi5;)Ljava/lang/Object;

    move-result-object v1

    const/4 v4, 0x2

    aput-object v1, v0, v4

    invoke-virtual {p2}, LGN5;->l()LEw1;

    move-result-object v1

    invoke-static {v1}, LUi5;->t(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v4, 0x3

    aput-object v1, v0, v4

    invoke-virtual {p2}, LGN5;->m()LFw1;

    move-result-object v1

    invoke-static {v1}, LUi5;->t(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v4, 0x4

    aput-object v1, v0, v4

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, LUi5;->t(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v4, 0x5

    aput-object v1, v0, v4

    invoke-virtual {p2}, LGN5;->j()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LUi5;->t(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v4, 0x6

    aput-object v1, v0, v4

    invoke-virtual {p2}, LGN5;->o()J

    move-result-wide v4

    invoke-static {v4, v5}, LM26;->b(J)LM26;

    move-result-object v1

    invoke-static {v3}, LUi5;->r(LM26$a;)LRi5;

    move-result-object v3

    invoke-static {v1, v3, p1}, LUi5;->u(Ljava/lang/Object;LRi5;LTi5;)Ljava/lang/Object;

    move-result-object v1

    const/4 v3, 0x7

    aput-object v1, v0, v3

    invoke-virtual {p2}, LGN5;->e()LHE;

    move-result-object v1

    sget-object v3, LHE;->b:LHE$a;

    invoke-static {v3}, LUi5;->g(LHE$a;)LRi5;

    move-result-object v3

    invoke-static {v1, v3, p1}, LUi5;->u(Ljava/lang/Object;LRi5;LTi5;)Ljava/lang/Object;

    move-result-object v1

    const/16 v3, 0x8

    aput-object v1, v0, v3

    invoke-virtual {p2}, LGN5;->u()LL16;

    move-result-object v1

    sget-object v3, LL16;->c:LL16$a;

    invoke-static {v3}, LUi5;->o(LL16$a;)LRi5;

    move-result-object v3

    invoke-static {v1, v3, p1}, LUi5;->u(Ljava/lang/Object;LRi5;LTi5;)Ljava/lang/Object;

    move-result-object v1

    const/16 v3, 0x9

    aput-object v1, v0, v3

    invoke-virtual {p2}, LGN5;->p()Luv2;

    move-result-object v1

    sget-object v3, Luv2;->d:Luv2$a;

    invoke-static {v3}, LUi5;->k(Luv2$a;)LRi5;

    move-result-object v3

    invoke-static {v1, v3, p1}, LUi5;->u(Ljava/lang/Object;LRi5;LTi5;)Ljava/lang/Object;

    move-result-object v1

    const/16 v3, 0xa

    aput-object v1, v0, v3

    invoke-virtual {p2}, LGN5;->d()J

    move-result-wide v3

    invoke-static {v3, v4}, Lpm0;->i(J)Lpm0;

    move-result-object v1

    invoke-static {v2}, LUi5;->h(Lpm0$a;)LRi5;

    move-result-object v2

    invoke-static {v1, v2, p1}, LUi5;->u(Ljava/lang/Object;LRi5;LTi5;)Ljava/lang/Object;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    invoke-virtual {p2}, LGN5;->s()LR06;

    move-result-object v1

    sget-object v2, LR06;->b:LR06$a;

    invoke-static {v2}, LUi5;->n(LR06$a;)LRi5;

    move-result-object v2

    invoke-static {v1, v2, p1}, LUi5;->u(Ljava/lang/Object;LRi5;LTi5;)Ljava/lang/Object;

    move-result-object v1

    const/16 v2, 0xc

    aput-object v1, v0, v2

    invoke-virtual {p2}, LGN5;->r()LPx5;

    move-result-object p2

    sget-object v1, LPx5;->d:LPx5$a;

    invoke-static {v1}, LUi5;->m(LPx5$a;)LRi5;

    move-result-object v1

    invoke-static {p2, v1, p1}, LUi5;->u(Ljava/lang/Object;LRi5;LTi5;)Ljava/lang/Object;

    move-result-object p1

    const/16 p2, 0xd

    aput-object p1, v0, p2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->arrayListOf([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LTi5;

    check-cast p2, LGN5;

    invoke-virtual {p0, p1, p2}, LUi5$w;->a(LTi5;LGN5;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
