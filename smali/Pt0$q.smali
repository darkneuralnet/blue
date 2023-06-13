.class public final LPt0$q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPt0;->J0(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Llm<",
        "*>;",
        "LqE5;",
        "LOv4;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\u0008\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Llm;",
        "<anonymous parameter 0>",
        "LqE5;",
        "slots",
        "LOv4;",
        "<anonymous parameter 2>",
        "",
        "a",
        "(Llm;LqE5;LOv4;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$4\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4528:1\n33#2,6:4529\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$4\n*L\n3156#1:4529,6\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LiW2;

.field public final synthetic h:LPt0;

.field public final synthetic i:LjW2;

.field public final synthetic j:LjW2;


# direct methods
.method public constructor <init>(LiW2;LPt0;LjW2;LjW2;)V
    .locals 0

    iput-object p1, p0, LPt0$q;->g:LiW2;

    iput-object p2, p0, LPt0$q;->h:LPt0;

    iput-object p3, p0, LPt0$q;->i:LjW2;

    iput-object p4, p0, LPt0$q;->j:LjW2;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Llm;LqE5;LOv4;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llm<",
            "*>;",
            "LqE5;",
            "LOv4;",
            ")V"
        }
    .end annotation

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "slots"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "<anonymous parameter 2>"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LPt0$q;->g:LiW2;

    if-nez p1, :cond_1

    iget-object p1, p0, LPt0$q;->h:LPt0;

    invoke-static {p1}, LPt0;->X(LPt0;)LYt0;

    move-result-object p1

    iget-object p3, p0, LPt0$q;->i:LjW2;

    invoke-virtual {p1, p3}, LYt0;->k(LjW2;)LiW2;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "Could not resolve state for movable content"

    invoke-static {p1}, LQt0;->x(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p1}, LiW2;->a()LnE5;

    move-result-object p1

    const/4 p3, 0x2

    const/4 v0, 0x1

    invoke-virtual {p2, v0, p1, p3}, LqE5;->r0(ILnE5;I)Ljava/util/List;

    move-result-object p1

    move-object p3, p1

    check-cast p3, Ljava/util/Collection;

    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result p3

    xor-int/2addr p3, v0

    if-eqz p3, :cond_4

    iget-object p3, p0, LPt0$q;->j:LjW2;

    invoke-virtual {p3}, LjW2;->b()LnB0;

    move-result-object p3

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lcu0;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_1
    if-ge v2, v0, :cond_4

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldb;

    invoke-virtual {p2, v3, v1}, LqE5;->Q0(Ldb;I)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Los4;

    if-eqz v4, :cond_2

    check-cast v3, Los4;

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    if-eqz v3, :cond_3

    invoke-virtual {v3, p3}, Los4;->g(Lcu0;)V

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Llm;

    check-cast p2, LqE5;

    check-cast p3, LOv4;

    invoke-virtual {p0, p1, p2, p3}, LPt0$q;->a(Llm;LqE5;LOv4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
