.class public final LIC0$m$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


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
        "Lkotlin/jvm/functions/Function3<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
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
.field public final synthetic g:LHe3;

.field public final synthetic h:Z

.field public final synthetic i:LF16;

.field public final synthetic j:Lx16;

.field public final synthetic k:LC16;


# direct methods
.method public constructor <init>(LHe3;ZLF16;Lx16;LC16;)V
    .locals 0

    iput-object p1, p0, LIC0$m$c;->g:LHe3;

    iput-boolean p2, p0, LIC0$m$c;->h:Z

    iput-object p3, p0, LIC0$m$c;->i:LF16;

    iput-object p4, p0, LIC0$m$c;->j:Lx16;

    iput-object p5, p0, LIC0$m$c;->k:LC16;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(IIZ)Ljava/lang/Boolean;
    .locals 8

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LIC0$m$c;->g:LHe3;

    invoke-interface {v0, p1}, LHe3;->transformedToOriginal(I)I

    move-result p1

    :goto_0
    if-eqz p3, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, LIC0$m$c;->g:LHe3;

    invoke-interface {v0, p2}, LHe3;->transformedToOriginal(I)I

    move-result p2

    :goto_1
    iget-boolean v0, p0, LIC0$m$c;->h:Z

    const/4 v1, 0x0

    if-nez v0, :cond_2

    goto :goto_4

    :cond_2
    iget-object v0, p0, LIC0$m$c;->i:LF16;

    invoke-virtual {v0}, LF16;->g()J

    move-result-wide v2

    invoke-static {v2, v3}, Ls26;->n(J)I

    move-result v0

    if-ne p1, v0, :cond_3

    iget-object v0, p0, LIC0$m$c;->i:LF16;

    invoke-virtual {v0}, LF16;->g()J

    move-result-wide v2

    invoke-static {v2, v3}, Ls26;->i(J)I

    move-result v0

    if-ne p2, v0, :cond_3

    goto :goto_4

    :cond_3
    invoke-static {p1, p2}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v0

    if-ltz v0, :cond_6

    invoke-static {p1, p2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    iget-object v2, p0, LIC0$m$c;->i:LF16;

    invoke-virtual {v2}, LF16;->e()LDf;

    move-result-object v2

    invoke-virtual {v2}, LDf;->length()I

    move-result v2

    if-gt v0, v2, :cond_6

    if-nez p3, :cond_5

    if-ne p1, p2, :cond_4

    goto :goto_2

    :cond_4
    iget-object p3, p0, LIC0$m$c;->j:Lx16;

    invoke-virtual {p3}, Lx16;->r()V

    goto :goto_3

    :cond_5
    :goto_2
    iget-object p3, p0, LIC0$m$c;->j:Lx16;

    invoke-virtual {p3}, Lx16;->s()V

    :goto_3
    iget-object p3, p0, LIC0$m$c;->k:LC16;

    invoke-virtual {p3}, LC16;->j()Lkotlin/jvm/functions/Function1;

    move-result-object p3

    new-instance v7, LF16;

    iget-object v0, p0, LIC0$m$c;->i:LF16;

    invoke-virtual {v0}, LF16;->e()LDf;

    move-result-object v1

    invoke-static {p1, p2}, Lt26;->b(II)J

    move-result-wide v2

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LF16;-><init>(LDf;JLs26;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p3, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x1

    goto :goto_4

    :cond_6
    iget-object p1, p0, LIC0$m$c;->j:Lx16;

    invoke-virtual {p1}, Lx16;->s()V

    :goto_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LIC0$m$c;->a(IIZ)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
