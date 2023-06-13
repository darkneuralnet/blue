.class public final Lwj2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0008\u0010\u0004\u001a\u00020\u0002H\u0002J#\u0010\u0007\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0005H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0008\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0008\u0010\u000e\u001a\u00020\u0002H\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001e"
    }
    d2 = {
        "Lwj2;",
        "",
        "Lxi2;",
        "e",
        "h",
        "Lkotlin/DeepRecursiveScope;",
        "",
        "i",
        "(Lkotlin/DeepRecursiveScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "f",
        "",
        "isString",
        "LYi2;",
        "j",
        "g",
        "LC0;",
        "a",
        "LC0;",
        "lexer",
        "b",
        "Z",
        "isLenient",
        "",
        "c",
        "I",
        "stackDepth",
        "Lji2;",
        "configuration",
        "<init>",
        "(Lji2;LC0;)V",
        "kotlinx-serialization-json"
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
        "SMAP\nJsonTreeReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonTreeReader.kt\nkotlinx/serialization/json/internal/JsonTreeReader\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n1#1,118:1\n26#1,24:119\n26#1,24:143\n517#2,3:167\n*S KotlinDebug\n*F\n+ 1 JsonTreeReader.kt\nkotlinx/serialization/json/internal/JsonTreeReader\n*L\n18#1:119,24\n23#1:143,24\n62#1:167,3\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LC0;

.field public final b:Z

.field public c:I


# direct methods
.method public constructor <init>(Lji2;LC0;)V
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lexer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lwj2;->a:LC0;

    invoke-virtual {p1}, Lji2;->m()Z

    move-result p1

    iput-boolean p1, p0, Lwj2;->b:Z

    return-void
.end method

.method public static final synthetic a(Lwj2;)LC0;
    .locals 0

    iget-object p0, p0, Lwj2;->a:LC0;

    return-object p0
.end method

.method public static final synthetic b(Lwj2;)Lxi2;
    .locals 0

    invoke-virtual {p0}, Lwj2;->f()Lxi2;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lwj2;Lkotlin/DeepRecursiveScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lwj2;->i(Lkotlin/DeepRecursiveScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lwj2;Z)LYi2;
    .locals 0

    invoke-virtual {p0, p1}, Lwj2;->j(Z)LYi2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final e()Lxi2;
    .locals 7

    iget-object v0, p0, Lwj2;->a:LC0;

    invoke-virtual {v0}, LC0;->E()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, v1}, Lwj2;->j(Z)LYi2;

    move-result-object v0

    goto :goto_1

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lwj2;->j(Z)LYi2;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v2, 0x6

    if-ne v0, v2, :cond_3

    iget v0, p0, Lwj2;->c:I

    add-int/2addr v0, v1

    iput v0, p0, Lwj2;->c:I

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lwj2;->g()Lxi2;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lwj2;->h()Lxi2;

    move-result-object v0

    :goto_0
    iget v1, p0, Lwj2;->c:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lwj2;->c:I

    goto :goto_1

    :cond_3
    const/16 v1, 0x8

    if-ne v0, v1, :cond_4

    invoke-virtual {p0}, Lwj2;->f()Lxi2;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_4
    iget-object v1, p0, Lwj2;->a:LC0;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot begin reading element, unexpected token: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LC0;->y(LC0;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method public final f()Lxi2;
    .locals 11

    iget-object v0, p0, Lwj2;->a:LC0;

    invoke-virtual {v0}, LC0;->m()B

    move-result v0

    iget-object v1, p0, Lwj2;->a:LC0;

    invoke-virtual {v1}, LC0;->E()B

    move-result v1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_6

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    :goto_0
    iget-object v3, p0, Lwj2;->a:LC0;

    invoke-virtual {v3}, LC0;->f()Z

    move-result v3

    const/16 v4, 0x9

    if-eqz v3, :cond_3

    invoke-virtual {p0}, Lwj2;->e()Lxi2;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lwj2;->a:LC0;

    invoke-virtual {v0}, LC0;->m()B

    move-result v0

    if-eq v0, v2, :cond_0

    iget-object v5, p0, Lwj2;->a:LC0;

    if-ne v0, v4, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    invoke-static {v5}, LC0;->a(LC0;)I

    move-result v7

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    const-string v6, "Expected end of the array or comma"

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, LC0;->y(LC0;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_3
    const/16 v3, 0x8

    if-ne v0, v3, :cond_4

    iget-object v0, p0, Lwj2;->a:LC0;

    invoke-virtual {v0, v4}, LC0;->n(B)B

    goto :goto_2

    :cond_4
    if-eq v0, v2, :cond_5

    :goto_2
    new-instance v0, Lei2;

    invoke-direct {v0, v1}, Lei2;-><init>(Ljava/util/List;)V

    return-object v0

    :cond_5
    iget-object v2, p0, Lwj2;->a:LC0;

    const-string v3, "Unexpected trailing comma"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LC0;->y(LC0;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_6
    iget-object v1, p0, Lwj2;->a:LC0;

    const-string v2, "Unexpected leading comma"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LC0;->y(LC0;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method public final g()Lxi2;
    .locals 3

    new-instance v0, Lkotlin/DeepRecursiveFunction;

    new-instance v1, Lwj2$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lwj2$a;-><init>(Lwj2;Lkotlin/coroutines/Continuation;)V

    invoke-direct {v0, v1}, Lkotlin/DeepRecursiveFunction;-><init>(Lkotlin/jvm/functions/Function3;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0, v1}, Lkotlin/DeepRecursiveKt;->invoke(Lkotlin/DeepRecursiveFunction;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxi2;

    return-object v0
.end method

.method public final h()Lxi2;
    .locals 12

    iget-object v0, p0, Lwj2;->a:LC0;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, LC0;->n(B)B

    move-result v0

    iget-object v2, p0, Lwj2;->a:LC0;

    invoke-virtual {v2}, LC0;->E()B

    move-result v2

    const/4 v3, 0x4

    if-eq v2, v3, :cond_6

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    :cond_0
    iget-object v4, p0, Lwj2;->a:LC0;

    invoke-virtual {v4}, LC0;->f()Z

    move-result v4

    const/4 v5, 0x7

    if-eqz v4, :cond_3

    iget-boolean v0, p0, Lwj2;->b:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lwj2;->a:LC0;

    invoke-virtual {v0}, LC0;->s()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lwj2;->a:LC0;

    invoke-virtual {v0}, LC0;->q()Ljava/lang/String;

    move-result-object v0

    :goto_0
    iget-object v4, p0, Lwj2;->a:LC0;

    const/4 v6, 0x5

    invoke-virtual {v4, v6}, LC0;->n(B)B

    invoke-virtual {p0}, Lwj2;->e()Lxi2;

    move-result-object v4

    invoke-interface {v2, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lwj2;->a:LC0;

    invoke-virtual {v0}, LC0;->m()B

    move-result v0

    if-eq v0, v3, :cond_0

    if-ne v0, v5, :cond_2

    goto :goto_1

    :cond_2
    iget-object v6, p0, Lwj2;->a:LC0;

    const-string v7, "Expected end of the object or comma"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x6

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, LC0;->y(LC0;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_3
    :goto_1
    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lwj2;->a:LC0;

    invoke-virtual {v0, v5}, LC0;->n(B)B

    goto :goto_2

    :cond_4
    if-eq v0, v3, :cond_5

    :goto_2
    new-instance v0, LSi2;

    invoke-direct {v0, v2}, LSi2;-><init>(Ljava/util/Map;)V

    return-object v0

    :cond_5
    iget-object v3, p0, Lwj2;->a:LC0;

    const-string v4, "Unexpected trailing comma"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, LC0;->y(LC0;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_6
    iget-object v1, p0, Lwj2;->a:LC0;

    const-string v2, "Unexpected leading comma"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LC0;->y(LC0;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method public final i(Lkotlin/DeepRecursiveScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/DeepRecursiveScope<",
            "Lkotlin/Unit;",
            "Lxi2;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lxi2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lwj2$b;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lwj2$b;

    iget v3, v2, Lwj2$b;->n:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lwj2$b;->n:I

    goto :goto_0

    :cond_0
    new-instance v2, Lwj2$b;

    invoke-direct {v2, v0, v1}, Lwj2$b;-><init>(Lwj2;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v1, v2, Lwj2$b;->l:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, Lwj2$b;->n:I

    const/4 v5, 0x7

    const/4 v6, 0x6

    const/4 v7, 0x1

    const/4 v8, 0x4

    if-eqz v4, :cond_2

    if-ne v4, v7, :cond_1

    iget-object v4, v2, Lwj2$b;->k:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v9, v2, Lwj2$b;->j:Ljava/lang/Object;

    check-cast v9, Ljava/util/LinkedHashMap;

    iget-object v10, v2, Lwj2$b;->i:Ljava/lang/Object;

    check-cast v10, Lwj2;

    iget-object v11, v2, Lwj2$b;->h:Ljava/lang/Object;

    check-cast v11, Lkotlin/DeepRecursiveScope;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v18, v3

    move-object v3, v2

    move-object/from16 v2, v18

    goto :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v1, v0, Lwj2;->a:LC0;

    invoke-virtual {v1, v6}, LC0;->n(B)B

    move-result v1

    iget-object v4, v0, Lwj2;->a:LC0;

    invoke-virtual {v4}, LC0;->E()B

    move-result v4

    if-eq v4, v8, :cond_a

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    move-object v10, v0

    move-object v9, v4

    move-object v4, v3

    move-object v3, v2

    move v2, v1

    move-object/from16 v1, p1

    :goto_1
    iget-object v11, v10, Lwj2;->a:LC0;

    invoke-virtual {v11}, LC0;->f()Z

    move-result v11

    if-eqz v11, :cond_7

    iget-boolean v2, v10, Lwj2;->b:Z

    if-eqz v2, :cond_3

    iget-object v2, v10, Lwj2;->a:LC0;

    invoke-virtual {v2}, LC0;->s()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_3
    iget-object v2, v10, Lwj2;->a:LC0;

    invoke-virtual {v2}, LC0;->q()Ljava/lang/String;

    move-result-object v2

    :goto_2
    iget-object v11, v10, Lwj2;->a:LC0;

    const/4 v12, 0x5

    invoke-virtual {v11, v12}, LC0;->n(B)B

    sget-object v11, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    iput-object v1, v3, Lwj2$b;->h:Ljava/lang/Object;

    iput-object v10, v3, Lwj2$b;->i:Ljava/lang/Object;

    iput-object v9, v3, Lwj2$b;->j:Ljava/lang/Object;

    iput-object v2, v3, Lwj2$b;->k:Ljava/lang/Object;

    iput v7, v3, Lwj2$b;->n:I

    invoke-virtual {v1, v11, v3}, Lkotlin/DeepRecursiveScope;->callRecursive(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v4, :cond_4

    return-object v4

    :cond_4
    move-object/from16 v18, v11

    move-object v11, v1

    move-object/from16 v1, v18

    move-object/from16 v19, v4

    move-object v4, v2

    move-object/from16 v2, v19

    :goto_3
    check-cast v1, Lxi2;

    invoke-interface {v9, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v10, Lwj2;->a:LC0;

    invoke-virtual {v1}, LC0;->m()B

    move-result v1

    if-eq v1, v8, :cond_6

    if-ne v1, v5, :cond_5

    move v2, v1

    goto :goto_4

    :cond_5
    iget-object v12, v10, Lwj2;->a:LC0;

    const-string v13, "Expected end of the object or comma"

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x6

    const/16 v17, 0x0

    invoke-static/range {v12 .. v17}, LC0;->y(LC0;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v1, Lkotlin/KotlinNothingValueException;

    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v1

    :cond_6
    move-object v4, v2

    move v2, v1

    move-object v1, v11

    goto :goto_1

    :cond_7
    :goto_4
    if-ne v2, v6, :cond_8

    iget-object v1, v10, Lwj2;->a:LC0;

    invoke-virtual {v1, v5}, LC0;->n(B)B

    goto :goto_5

    :cond_8
    if-eq v2, v8, :cond_9

    :goto_5
    new-instance v1, LSi2;

    invoke-direct {v1, v9}, LSi2;-><init>(Ljava/util/Map;)V

    return-object v1

    :cond_9
    iget-object v2, v10, Lwj2;->a:LC0;

    const-string v3, "Unexpected trailing comma"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LC0;->y(LC0;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v1, Lkotlin/KotlinNothingValueException;

    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v1

    :cond_a
    iget-object v2, v0, Lwj2;->a:LC0;

    const-string v3, "Unexpected leading comma"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LC0;->y(LC0;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v1, Lkotlin/KotlinNothingValueException;

    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v1
.end method

.method public final j(Z)LYi2;
    .locals 7

    iget-boolean v0, p0, Lwj2;->b:Z

    if-nez v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lwj2;->a:LC0;

    invoke-virtual {v0}, LC0;->q()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lwj2;->a:LC0;

    invoke-virtual {v0}, LC0;->s()Ljava/lang/String;

    move-result-object v0

    :goto_1
    move-object v2, v0

    if-nez p1, :cond_2

    const-string v0, "null"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, LPi2;->INSTANCE:LPi2;

    return-object p1

    :cond_2
    new-instance v0, LKi2;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, v0

    move v3, p1

    invoke-direct/range {v1 .. v6}, LKi2;-><init>(Ljava/lang/Object;ZLMs5;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
