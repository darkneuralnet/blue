.class public final LUi5$s;
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
        "LDE3;",
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
        "LDE3;",
        "it",
        "",
        "a",
        "(LTi5;LDE3;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LUi5$s;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LUi5$s;

    invoke-direct {v0}, LUi5$s;-><init>()V

    sput-object v0, LUi5$s;->g:LUi5$s;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LTi5;LDE3;)Ljava/lang/Object;
    .locals 3

    const-string v0, "$this$Saver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p2}, LDE3;->j()Lr06;

    move-result-object v1

    invoke-static {v1}, LUi5;->t(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p2}, LDE3;->l()LW06;

    move-result-object v1

    invoke-static {v1}, LUi5;->t(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p2}, LDE3;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, LM26;->b(J)LM26;

    move-result-object v1

    sget-object v2, LM26;->b:LM26$a;

    invoke-static {v2}, LUi5;->r(LM26$a;)LRi5;

    move-result-object v2

    invoke-static {v1, v2, p1}, LUi5;->u(Ljava/lang/Object;LRi5;LTi5;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-virtual {p2}, LDE3;->m()LN16;

    move-result-object p2

    sget-object v1, LN16;->c:LN16$a;

    invoke-static {v1}, LUi5;->p(LN16$a;)LRi5;

    move-result-object v1

    invoke-static {p2, v1, p1}, LUi5;->u(Ljava/lang/Object;LRi5;LTi5;)Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v0, p2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->arrayListOf([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LTi5;

    check-cast p2, LDE3;

    invoke-virtual {p0, p1, p2}, LUi5$s;->a(LTi5;LDE3;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
