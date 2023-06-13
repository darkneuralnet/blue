.class public final LP91;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0014\u0010\u000b\u001a\u00020\u00022\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008J\u0006\u0010\u000c\u001a\u00020\u0002J \u0010\u000f\u001a\u00020\u000e2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0008\u0010\r\u001a\u0004\u0018\u00010\tH\u0002J\u000c\u0010\u0010\u001a\u00020\u000e*\u00020\tH\u0002R$\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00028\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R$\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00178\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001e"
    }
    d2 = {
        "LP91;",
        "",
        "LF16;",
        "value",
        "La26;",
        "textInputSession",
        "",
        "d",
        "",
        "LN91;",
        "editCommands",
        "b",
        "f",
        "failedCommand",
        "",
        "c",
        "e",
        "<set-?>",
        "a",
        "LF16;",
        "getMBufferState$ui_text_release",
        "()LF16;",
        "mBufferState",
        "LS91;",
        "LS91;",
        "getMBuffer$ui_text_release",
        "()LS91;",
        "mBuffer",
        "<init>",
        "()V",
        "ui-text_release"
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
        "SMAP\nEditProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,173:1\n33#2,6:174\n*S KotlinDebug\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n*L\n112#1:174,6\n*E\n"
    }
.end annotation


# instance fields
.field public a:LF16;

.field public b:LS91;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v6, LF16;

    invoke-static {}, LEf;->g()LDf;

    move-result-object v1

    sget-object v0, Ls26;->b:Ls26$a;

    invoke-virtual {v0}, Ls26$a;->a()J

    move-result-wide v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LF16;-><init>(LDf;JLs26;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v6, p0, LP91;->a:LF16;

    new-instance v0, LS91;

    iget-object v1, p0, LP91;->a:LF16;

    invoke-virtual {v1}, LF16;->e()LDf;

    move-result-object v1

    iget-object v2, p0, LP91;->a:LF16;

    invoke-virtual {v2}, LF16;->g()J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3, v4}, LS91;-><init>(LDf;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, LP91;->b:LS91;

    return-void
.end method

.method public static final synthetic a(LP91;LN91;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, LP91;->e(LN91;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/util/List;)LF16;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "LN91;",
            ">;)",
            "LF16;"
        }
    .end annotation

    const-string v0, "editCommands"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LN91;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-object v0, p0, LP91;->b:LS91;

    invoke-interface {v3, v0}, LN91;->a(LS91;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    add-int/lit8 v2, v2, 0x1

    move-object v0, v3

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    new-instance p1, LF16;

    iget-object v0, p0, LP91;->b:LS91;

    invoke-virtual {v0}, LS91;->s()LDf;

    move-result-object v3

    iget-object v0, p0, LP91;->b:LS91;

    invoke-virtual {v0}, LS91;->i()J

    move-result-wide v4

    iget-object v0, p0, LP91;->b:LS91;

    invoke-virtual {v0}, LS91;->d()Ls26;

    move-result-object v6

    const/4 v7, 0x0

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, LF16;-><init>(LDf;JLs26;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LP91;->a:LF16;

    return-object p1

    :catch_1
    move-exception v1

    move-object v3, v0

    move-object v0, v1

    :goto_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {p0, p1, v3}, LP91;->c(Ljava/util/List;LN91;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final c(Ljava/util/List;LN91;)Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "LN91;",
            ">;",
            "LN91;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error while applying EditCommand batch to buffer (length="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LP91;->b:LS91;

    invoke-virtual {v1}, LS91;->h()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", composition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LP91;->b:LS91;

    invoke-virtual {v1}, LS91;->d()Ls26;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", selection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LP91;->b:LS91;

    invoke-virtual {v1}, LS91;->i()J

    move-result-wide v1

    invoke-static {v1, v2}, Ls26;->q(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "):"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "append(value)"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xa

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "append(\'\\n\')"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    const-string v2, "\n"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    new-instance v7, LP91$a;

    invoke-direct {v7, p2, p0}, LP91$a;-><init>(LN91;LP91;)V

    const/16 v8, 0x3c

    const/4 v9, 0x0

    move-object v1, v10

    invoke-static/range {v0 .. v9}, Lkotlin/collections/CollectionsKt;->joinTo$default(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/Appendable;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final d(LF16;La26;)V
    .locals 9

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LF16;->f()Ls26;

    move-result-object v0

    iget-object v1, p0, LP91;->b:LS91;

    invoke-virtual {v1}, LS91;->d()Ls26;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iget-object v2, p0, LP91;->a:LF16;

    invoke-virtual {v2}, LF16;->e()LDf;

    move-result-object v2

    invoke-virtual {p1}, LF16;->e()LDf;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    new-instance v2, LS91;

    invoke-virtual {p1}, LF16;->e()LDf;

    move-result-object v4

    invoke-virtual {p1}, LF16;->g()J

    move-result-wide v5

    const/4 v7, 0x0

    invoke-direct {v2, v4, v5, v6, v7}, LS91;-><init>(LDf;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, p0, LP91;->b:LS91;

    goto :goto_0

    :cond_0
    iget-object v2, p0, LP91;->a:LF16;

    invoke-virtual {v2}, LF16;->g()J

    move-result-wide v4

    invoke-virtual {p1}, LF16;->g()J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, Ls26;->g(JJ)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, LP91;->b:LS91;

    invoke-virtual {p1}, LF16;->g()J

    move-result-wide v4

    invoke-static {v4, v5}, Ls26;->l(J)I

    move-result v4

    invoke-virtual {p1}, LF16;->g()J

    move-result-wide v5

    invoke-static {v5, v6}, Ls26;->k(J)I

    move-result v5

    invoke-virtual {v2, v4, v5}, LS91;->p(II)V

    move v8, v3

    move v3, v1

    move v1, v8

    goto :goto_0

    :cond_1
    move v1, v3

    :goto_0
    invoke-virtual {p1}, LF16;->f()Ls26;

    move-result-object v2

    if-nez v2, :cond_2

    iget-object v2, p0, LP91;->b:LS91;

    invoke-virtual {v2}, LS91;->a()V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, LF16;->f()Ls26;

    move-result-object v2

    invoke-virtual {v2}, Ls26;->r()J

    move-result-wide v4

    invoke-static {v4, v5}, Ls26;->h(J)Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, LP91;->b:LS91;

    invoke-virtual {p1}, LF16;->f()Ls26;

    move-result-object v4

    invoke-virtual {v4}, Ls26;->r()J

    move-result-wide v4

    invoke-static {v4, v5}, Ls26;->l(J)I

    move-result v4

    invoke-virtual {p1}, LF16;->f()Ls26;

    move-result-object v5

    invoke-virtual {v5}, Ls26;->r()J

    move-result-wide v5

    invoke-static {v5, v6}, Ls26;->k(J)I

    move-result v5

    invoke-virtual {v2, v4, v5}, LS91;->n(II)V

    :cond_3
    :goto_1
    if-nez v1, :cond_4

    if-nez v3, :cond_5

    if-eqz v0, :cond_5

    :cond_4
    iget-object v0, p0, LP91;->b:LS91;

    invoke-virtual {v0}, LS91;->a()V

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LF16;->c(LF16;LDf;JLs26;ILjava/lang/Object;)LF16;

    move-result-object p1

    :cond_5
    iget-object v0, p0, LP91;->a:LF16;

    iput-object p1, p0, LP91;->a:LF16;

    if-eqz p2, :cond_6

    invoke-virtual {p2, v0, p1}, La26;->f(LF16;LF16;)Z

    :cond_6
    return-void
.end method

.method public final e(LN91;)Ljava/lang/String;
    .locals 4

    instance-of v0, p1, Lop0;

    const/16 v1, 0x29

    const-string v2, ", newCursorPosition="

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CommitTextCommand(text.length="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast p1, Lop0;

    invoke-virtual {p1}, Lop0;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lop0;->b()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_0

    :cond_0
    instance-of v0, p1, LPv5;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SetComposingTextCommand(text.length="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast p1, LPv5;

    invoke-virtual {p1}, LPv5;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LPv5;->b()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, LOv5;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    instance-of v0, p1, LYZ0;

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_3
    instance-of v0, p1, LZZ0;

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_4
    instance-of v0, p1, Law5;

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_5
    instance-of v0, p1, Lpm1;

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_6
    instance-of v0, p1, Lhw;

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_7
    instance-of v0, p1, LUZ0;

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown EditCommand: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_9

    const-string p1, "{anonymous EditCommand}"

    :cond_9
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final f()LF16;
    .locals 1

    iget-object v0, p0, LP91;->a:LF16;

    return-object v0
.end method
