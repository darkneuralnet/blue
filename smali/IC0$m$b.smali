.class public final LIC0$m$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIC0$m;->invoke(Lss5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LDf;",
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
.field public final synthetic g:LC16;

.field public final synthetic h:Lss5;


# direct methods
.method public constructor <init>(LC16;Lss5;)V
    .locals 0

    iput-object p1, p0, LIC0$m$b;->g:LC16;

    iput-object p2, p0, LIC0$m$b;->h:Lss5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LDf;)Ljava/lang/Boolean;
    .locals 9

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LIC0$m$b;->g:LC16;

    invoke-virtual {v0}, LC16;->e()La26;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LIC0$m$b;->g:LC16;

    sget-object v2, Li16;->a:Li16$a;

    const/4 v3, 0x2

    new-array v3, v3, [LN91;

    new-instance v4, LUZ0;

    invoke-direct {v4}, LUZ0;-><init>()V

    const/4 v5, 0x0

    aput-object v4, v3, v5

    new-instance v4, Lop0;

    const/4 v5, 0x1

    invoke-direct {v4, p1, v5}, Lop0;-><init>(LDf;I)V

    aput-object v4, v3, v5

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1}, LC16;->k()LP91;

    move-result-object v4

    invoke-virtual {v1}, LC16;->j()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-virtual {v2, v3, v4, v1, v0}, Li16$a;->f(Ljava/util/List;LP91;Lkotlin/jvm/functions/Function1;La26;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, LIC0$m$b;->g:LC16;

    invoke-virtual {v0}, LC16;->j()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    new-instance v8, LF16;

    invoke-virtual {p1}, LDf;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LDf;->j()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {p1}, Lt26;->a(I)J

    move-result-wide v3

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, LF16;-><init>(Ljava/lang/String;JLs26;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LDf;

    invoke-virtual {p0, p1}, LIC0$m$b;->a(LDf;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
