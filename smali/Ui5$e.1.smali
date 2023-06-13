.class public final LUi5$e;
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

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LUi5$e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LTi5;",
        "LDf$b<",
        "+",
        "Ljava/lang/Object;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LTi5;",
        "LDf$b;",
        "",
        "it",
        "a",
        "(LTi5;LDf$b;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LUi5$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LUi5$e;

    invoke-direct {v0}, LUi5$e;-><init>()V

    sput-object v0, LUi5$e;->g:LUi5$e;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LTi5;LDf$b;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LTi5;",
            "LDf$b<",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "$this$Saver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LDf$b;->e()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LDE3;

    if-eqz v1, :cond_0

    sget-object v0, LGf;->b:LGf;

    goto :goto_0

    :cond_0
    instance-of v1, v0, LGN5;

    if-eqz v1, :cond_1

    sget-object v0, LGf;->c:LGf;

    goto :goto_0

    :cond_1
    instance-of v1, v0, LAo6;

    if-eqz v1, :cond_2

    sget-object v0, LGf;->d:LGf;

    goto :goto_0

    :cond_2
    instance-of v0, v0, LKf6;

    if-eqz v0, :cond_3

    sget-object v0, LGf;->e:LGf;

    goto :goto_0

    :cond_3
    sget-object v0, LGf;->f:LGf;

    :goto_0
    sget-object v1, LUi5$e$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eq v1, v6, :cond_8

    if-eq v1, v5, :cond_7

    if-eq v1, v4, :cond_6

    if-eq v1, v3, :cond_5

    if-ne v1, v2, :cond_4

    invoke-virtual {p2}, LDf$b;->e()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LUi5;->t(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    invoke-virtual {p2}, LDf$b;->e()Ljava/lang/Object;

    move-result-object v1

    const-string v7, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LKf6;

    invoke-static {}, LUi5;->c()LRi5;

    move-result-object v7

    invoke-static {v1, v7, p1}, LUi5;->u(Ljava/lang/Object;LRi5;LTi5;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_6
    invoke-virtual {p2}, LDf$b;->e()Ljava/lang/Object;

    move-result-object v1

    const-string v7, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LAo6;

    invoke-static {}, LUi5;->d()LRi5;

    move-result-object v7

    invoke-static {v1, v7, p1}, LUi5;->u(Ljava/lang/Object;LRi5;LTi5;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_7
    invoke-virtual {p2}, LDf$b;->e()Ljava/lang/Object;

    move-result-object v1

    const-string v7, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LGN5;

    invoke-static {}, LUi5;->s()LRi5;

    move-result-object v7

    invoke-static {v1, v7, p1}, LUi5;->u(Ljava/lang/Object;LRi5;LTi5;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_8
    invoke-virtual {p2}, LDf$b;->e()Ljava/lang/Object;

    move-result-object v1

    const-string v7, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LDE3;

    invoke-static {}, LUi5;->f()LRi5;

    move-result-object v7

    invoke-static {v1, v7, p1}, LUi5;->u(Ljava/lang/Object;LRi5;LTi5;)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    new-array v1, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v0}, LUi5;->t(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v2

    aput-object p1, v1, v6

    invoke-virtual {p2}, LDf$b;->f()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, LUi5;->t(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    aput-object p1, v1, v5

    invoke-virtual {p2}, LDf$b;->d()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, LUi5;->t(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    aput-object p1, v1, v4

    invoke-virtual {p2}, LDf$b;->g()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LUi5;->t(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    aput-object p1, v1, v3

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->arrayListOf([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LTi5;

    check-cast p2, LDf$b;

    invoke-virtual {p0, p1, p2}, LUi5$e;->a(LTi5;LDf$b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
