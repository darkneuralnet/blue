.class public final Ls16;
.super LuE;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LuE<",
        "Ls16;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B-\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001b\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008\u001f\u0010 J)\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0019\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u00a2\u0006\u0002\u0008\u0004J\u0006\u0010\u0008\u001a\u00020\u0000J\u0006\u0010\t\u001a\u00020\u0000J\u0014\u0010\r\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0012\u00a8\u0006!"
    }
    d2 = {
        "Ls16;",
        "LuE;",
        "Lkotlin/Function1;",
        "LN91;",
        "Lkotlin/ExtensionFunctionType;",
        "or",
        "",
        "a0",
        "e0",
        "d0",
        "Lj26;",
        "",
        "pagesAmount",
        "c0",
        "LF16;",
        "i",
        "LF16;",
        "getCurrentValue",
        "()LF16;",
        "currentValue",
        "j",
        "Lj26;",
        "getLayoutResultProxy",
        "()Lj26;",
        "layoutResultProxy",
        "b0",
        "value",
        "LHe3;",
        "offsetMapping",
        "Lr26;",
        "state",
        "<init>",
        "(LF16;LHe3;Lj26;Lr26;)V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/TextFieldPreparedSelection\n+ 2 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n74#2,5:433\n80#2:439\n74#2,7:440\n1#3:438\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/TextFieldPreparedSelection\n*L\n408#1:433,5\n408#1:439\n412#1:440,7\n*E\n"
    }
.end annotation


# instance fields
.field public final i:LF16;

.field public final j:Lj26;


# direct methods
.method public constructor <init>(LF16;LHe3;Lj26;Lr26;)V
    .locals 9

    const-string v0, "currentValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offsetMapping"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LF16;->e()LDf;

    move-result-object v2

    invoke-virtual {p1}, LF16;->g()J

    move-result-wide v3

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lj26;->i()Li26;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v5, v0

    const/4 v8, 0x0

    move-object v1, p0

    move-object v6, p2

    move-object v7, p4

    invoke-direct/range {v1 .. v8}, LuE;-><init>(LDf;JLi26;LHe3;Lr26;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Ls16;->i:LF16;

    iput-object p3, p0, Ls16;->j:Lj26;

    return-void
.end method


# virtual methods
.method public final a0(Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ls16;",
            "+",
            "LN91;",
            ">;)",
            "Ljava/util/List<",
            "LN91;",
            ">;"
        }
    .end annotation

    const-string v0, "or"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LuE;->w()J

    move-result-wide v0

    invoke-static {v0, v1}, Ls26;->h(J)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LN91;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    const/4 p1, 0x2

    new-array p1, p1, [LN91;

    new-instance v0, Lop0;

    const-string v1, ""

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lop0;-><init>(Ljava/lang/String;I)V

    aput-object v0, p1, v2

    new-instance v0, Law5;

    invoke-virtual {p0}, LuE;->w()J

    move-result-wide v1

    invoke-static {v1, v2}, Ls26;->l(J)I

    move-result v1

    invoke-virtual {p0}, LuE;->w()J

    move-result-wide v2

    invoke-static {v2, v3}, Ls26;->l(J)I

    move-result v2

    invoke-direct {v0, v1, v2}, Law5;-><init>(II)V

    const/4 v1, 0x1

    aput-object v0, p1, v1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final b0()LF16;
    .locals 7

    iget-object v0, p0, Ls16;->i:LF16;

    invoke-virtual {p0}, LuE;->e()LDf;

    move-result-object v1

    invoke-virtual {p0}, LuE;->w()J

    move-result-wide v2

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, LF16;->c(LF16;LDf;JLs26;ILjava/lang/Object;)LF16;

    move-result-object v0

    return-object v0
.end method

.method public final c0(Lj26;I)I
    .locals 5

    invoke-virtual {p1}, Lj26;->c()Lnm2;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lj26;->b()Lnm2;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v0, v3, v4, v2}, Lnm2;->f(Lnm2;Lnm2;ZILjava/lang/Object;)LOs4;

    move-result-object v2

    :cond_0
    if-nez v2, :cond_2

    :cond_1
    sget-object v0, LOs4;->e:LOs4$a;

    invoke-virtual {v0}, LOs4$a;->a()LOs4;

    move-result-object v2

    :cond_2
    invoke-virtual {p0}, LuE;->p()LHe3;

    move-result-object v0

    iget-object v1, p0, Ls16;->i:LF16;

    invoke-virtual {v1}, LF16;->g()J

    move-result-wide v3

    invoke-static {v3, v4}, Ls26;->i(J)I

    move-result v1

    invoke-interface {v0, v1}, LHe3;->originalToTransformed(I)I

    move-result v0

    invoke-virtual {p1}, Lj26;->i()Li26;

    move-result-object v1

    invoke-virtual {v1, v0}, Li26;->d(I)LOs4;

    move-result-object v0

    invoke-virtual {v0}, LOs4;->i()F

    move-result v1

    invoke-virtual {v0}, LOs4;->l()F

    move-result v0

    invoke-virtual {v2}, LOs4;->k()J

    move-result-wide v2

    invoke-static {v2, v3}, LxB5;->g(J)F

    move-result v2

    int-to-float p2, p2

    mul-float/2addr v2, p2

    add-float/2addr v0, v2

    invoke-virtual {p0}, LuE;->p()LHe3;

    move-result-object p2

    invoke-virtual {p1}, Lj26;->i()Li26;

    move-result-object p1

    invoke-static {v1, v0}, LGe3;->a(FF)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Li26;->w(J)I

    move-result p1

    invoke-interface {p2, p1}, LHe3;->transformedToOriginal(I)I

    move-result p1

    return p1
.end method

.method public final d0()Ls16;
    .locals 2

    invoke-virtual {p0}, LuE;->y()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Ls16;->j:Lj26;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0, v1}, Ls16;->c0(Lj26;I)I

    move-result v0

    invoke-virtual {p0, v0}, LuE;->V(I)V

    :cond_1
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final e0()Ls16;
    .locals 2

    invoke-virtual {p0}, LuE;->y()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Ls16;->j:Lj26;

    if-eqz v0, :cond_1

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Ls16;->c0(Lj26;I)I

    move-result v0

    invoke-virtual {p0, v0}, LuE;->V(I)V

    :cond_1
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
