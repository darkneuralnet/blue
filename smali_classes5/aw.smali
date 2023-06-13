.class public final Law;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Law$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0012\u0010\u000b\u001a\u00020\u00082\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000cH\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J8\u0010\u0019\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u001b\u0010\u001b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001f"
    }
    d2 = {
        "Law;",
        "",
        "LwO1;",
        "inAppMessageToPrepare",
        "",
        "g",
        "LLO1;",
        "inAppMessageHtml",
        "",
        "j",
        "inAppMessage",
        "h",
        "LpZ1;",
        "i",
        "f",
        "",
        "localImageUrl",
        "LKO1;",
        "inAppMessageWithImage",
        "LeO1;",
        "imageLoader",
        "Landroid/content/Context;",
        "applicationContext",
        "Lw20;",
        "viewBounds",
        "e",
        "d",
        "c",
        "(LwO1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "<init>",
        "()V",
        "android-sdk-ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final a:Law;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Law;

    invoke-direct {v0}, Law;-><init>()V

    sput-object v0, Law;->a:Law;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Law;LwO1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Law;->c(LwO1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Law;LwO1;)LwO1;
    .locals 0

    invoke-virtual {p0, p1}, Law;->f(LwO1;)LwO1;

    move-result-object p0

    return-object p0
.end method

.method public static final g(LwO1;)V
    .locals 7
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "inAppMessageToPrepare"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LZ10;->b:LZ10;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Law$i;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Law$i;-><init>(LwO1;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public static final h(LwO1;)Z
    .locals 27
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    move-object/from16 v7, p0

    instance-of v0, v7, LKO1;

    const/4 v8, 0x0

    if-nez v0, :cond_0

    sget-object v9, Lk20;->a:Lk20;

    sget-object v10, Law;->a:Law;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    sget-object v14, Law$j;->g:Law$j;

    const/4 v15, 0x7

    const/16 v16, 0x0

    invoke-static/range {v9 .. v16}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return v8

    :cond_0
    move-object v9, v7

    check-cast v9, LKO1;

    invoke-interface {v9}, LKO1;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    const/4 v10, 0x1

    if-eqz v0, :cond_1

    sget-object v11, Lk20;->a:Lk20;

    sget-object v12, Law;->a:Law;

    sget-object v13, Lk20$a;->d:Lk20$a;

    const/4 v14, 0x0

    const/4 v15, 0x0

    sget-object v16, Law$k;->g:Law$k;

    const/16 v17, 0x6

    const/16 v18, 0x0

    invoke-static/range {v11 .. v18}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-interface {v9, v10}, LKO1;->x(Z)V

    return v10

    :cond_1
    sget-object v11, Law;->a:Law;

    invoke-virtual {v11, v7}, Law;->d(LwO1;)Lw20;

    move-result-object v12

    invoke-static {}, Li20;->s()Li20;

    move-result-object v0

    invoke-virtual {v0}, LwZ1;->b()Landroid/content/Context;

    move-result-object v13

    if-nez v13, :cond_2

    sget-object v0, Lk20;->a:Lk20;

    sget-object v2, Lk20$a;->g:Lk20$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, Law$l;->g:Law$l;

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, v11

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return v8

    :cond_2
    invoke-static {v13}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appboy/Appboy;->getImageLoader()LeO1;

    move-result-object v14

    invoke-interface {v9}, LKO1;->e()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    move v0, v8

    goto :goto_1

    :cond_4
    :goto_0
    move v0, v10

    :goto_1
    if-nez v0, :cond_5

    const-string v0, "imageLoader"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, v11

    move-object v2, v9

    move-object v3, v14

    move-object v4, v13

    move-object/from16 v5, p0

    move-object v6, v12

    invoke-virtual/range {v0 .. v6}, Law;->e(Ljava/lang/String;LKO1;LeO1;Landroid/content/Context;LwO1;Lw20;)Z

    move-result v0

    if-eqz v0, :cond_5

    return v10

    :cond_5
    invoke-interface {v9}, LKO1;->w()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_2

    :cond_6
    move v1, v8

    goto :goto_3

    :cond_7
    :goto_2
    move v1, v10

    :goto_3
    if-nez v1, :cond_9

    sget-object v19, Lk20;->a:Lk20;

    sget-object v21, Lk20$a;->d:Lk20$a;

    const/16 v22, 0x0

    const/16 v23, 0x0

    new-instance v1, Law$m;

    invoke-direct {v1, v0}, Law$m;-><init>(Ljava/lang/String;)V

    const/16 v25, 0x6

    const/16 v26, 0x0

    move-object/from16 v20, v11

    move-object/from16 v24, v1

    invoke-static/range {v19 .. v26}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-interface {v14, v13, v7, v0, v12}, LeO1;->b(Landroid/content/Context;LwO1;Ljava/lang/String;Lw20;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-interface {v9, v0}, LKO1;->y(Landroid/graphics/Bitmap;)V

    invoke-interface {v9}, LKO1;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-interface {v9, v10}, LKO1;->x(Z)V

    return v10

    :cond_8
    return v8

    :cond_9
    sget-object v12, Lk20;->a:Lk20;

    sget-object v13, Lk20$a;->g:Lk20$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, Law$n;->g:Law$n;

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v0, v12

    move-object v1, v11

    move-object v2, v13

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    instance-of v0, v9, LnZ1;

    if-eqz v0, :cond_a

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, Law$o;->g:Law$o;

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v0, v12

    move-object v1, v11

    move-object v2, v13

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return v8

    :cond_a
    return v10
.end method

.method public static final j(LLO1;)Z
    .locals 21
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "inAppMessageHtml"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p0 .. p0}, LyO1;->U()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    move v4, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v4, v3

    :goto_1
    if-nez v4, :cond_2

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v5, Lk20;->a:Lk20;

    sget-object v6, Law;->a:Law;

    sget-object v7, Lk20$a;->d:Lk20$a;

    const/4 v8, 0x0

    const/4 v9, 0x0

    new-instance v10, Law$r;

    invoke-direct {v10, v1}, Law$r;-><init>(Ljava/lang/String;)V

    const/4 v11, 0x6

    const/4 v12, 0x0

    invoke-static/range {v5 .. v12}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return v3

    :cond_2
    invoke-interface/range {p0 .. p0}, LLO1;->m0()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    move v4, v2

    goto :goto_3

    :cond_4
    :goto_2
    move v4, v3

    :goto_3
    if-eqz v4, :cond_5

    sget-object v5, Lk20;->a:Lk20;

    sget-object v6, Law;->a:Law;

    sget-object v7, Lk20$a;->d:Lk20$a;

    const/4 v8, 0x0

    const/4 v9, 0x0

    sget-object v10, Law$s;->g:Law$s;

    const/4 v11, 0x6

    const/4 v12, 0x0

    invoke-static/range {v5 .. v12}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return v3

    :cond_5
    invoke-static {}, Li20;->s()Li20;

    move-result-object v4

    invoke-virtual {v4}, LwZ1;->b()Landroid/content/Context;

    move-result-object v4

    if-nez v4, :cond_6

    sget-object v5, Lk20;->a:Lk20;

    sget-object v6, Law;->a:Law;

    sget-object v7, Lk20$a;->g:Lk20$a;

    const/4 v8, 0x0

    const/4 v9, 0x0

    sget-object v10, Law$t;->g:Law$t;

    const/4 v11, 0x6

    const/4 v12, 0x0

    invoke-static/range {v5 .. v12}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return v2

    :cond_6
    invoke-static {v4}, LWz6;->a(Landroid/content/Context;)Ljava/io/File;

    move-result-object v4

    invoke-static {v4, v1}, LWz6;->b(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_4

    :cond_7
    move v4, v2

    goto :goto_5

    :cond_8
    :goto_4
    move v4, v3

    :goto_5
    if-nez v4, :cond_9

    sget-object v5, Lk20;->a:Lk20;

    sget-object v6, Law;->a:Law;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    new-instance v10, Law$u;

    invoke-direct {v10, v1}, Law$u;-><init>(Ljava/lang/String;)V

    const/4 v11, 0x7

    const/4 v12, 0x0

    invoke-static/range {v5 .. v12}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-interface {v0, v1}, LyO1;->W(Ljava/lang/String;)V

    move v2, v3

    goto :goto_6

    :cond_9
    sget-object v13, Lk20;->a:Lk20;

    sget-object v14, Law;->a:Law;

    sget-object v15, Lk20$a;->g:Lk20$a;

    const/16 v16, 0x0

    const/16 v17, 0x0

    new-instance v3, Law$v;

    invoke-direct {v3, v0, v1}, Law$v;-><init>(LLO1;Ljava/lang/String;)V

    const/16 v19, 0x6

    const/16 v20, 0x0

    move-object/from16 v18, v3

    invoke-static/range {v13 .. v20}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_6
    return v2
.end method


# virtual methods
.method public final c(LwO1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LwO1;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {}, LT41;->c()LpG2;

    move-result-object v0

    new-instance v1, Law$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Law$b;-><init>(Law;LwO1;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1, p2}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final d(LwO1;)Lw20;
    .locals 1

    invoke-interface {p1}, LwO1;->h0()LzT2;

    move-result-object p1

    sget-object v0, Law$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    sget-object p1, Lw20;->k:Lw20;

    goto :goto_0

    :cond_0
    sget-object p1, Lw20;->i:Lw20;

    goto :goto_0

    :cond_1
    sget-object p1, Lw20;->j:Lw20;

    :goto_0
    return-object p1
.end method

.method public final e(Ljava/lang/String;LKO1;LeO1;Landroid/content/Context;LwO1;Lw20;)Z
    .locals 9

    sget-object v8, Lk20;->a:Lk20;

    sget-object v2, Lk20$a;->d:Lk20$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Law$c;

    invoke-direct {v5, p1}, Law$c;-><init>(Ljava/lang/String;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-interface {p3, p4, p5, p1, p6}, LeO1;->b(Landroid/content/Context;LwO1;Ljava/lang/String;Lw20;)Landroid/graphics/Bitmap;

    move-result-object p3

    invoke-interface {p2, p3}, LKO1;->y(Landroid/graphics/Bitmap;)V

    invoke-interface {p2}, LKO1;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p3

    if-eqz p3, :cond_0

    const/4 p1, 0x1

    invoke-interface {p2, p1}, LKO1;->x(Z)V

    return p1

    :cond_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Law$d;

    invoke-direct {v5, p1}, Law$d;-><init>(Ljava/lang/String;)V

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    const/4 p1, 0x0

    invoke-interface {p2, p1}, LKO1;->b(Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final f(LwO1;)LwO1;
    .locals 18

    move-object/from16 v0, p1

    invoke-interface/range {p1 .. p1}, LwO1;->isControl()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v2, Lk20;->a:Lk20;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    sget-object v7, Law$e;->g:Law$e;

    const/4 v8, 0x7

    const/4 v9, 0x0

    move-object/from16 v3, p0

    invoke-static/range {v2 .. v9}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-object v0

    :cond_0
    sget-object v1, Lk20;->a:Lk20;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    sget-object v15, Law$f;->g:Law$f;

    const/16 v16, 0x7

    const/16 v17, 0x0

    move-object v10, v1

    move-object/from16 v11, p0

    invoke-static/range {v10 .. v17}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-interface/range {p1 .. p1}, LwO1;->h0()LzT2;

    move-result-object v2

    sget-object v3, Law$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v2, v3, :cond_3

    const/4 v3, 0x2

    if-eq v2, v3, :cond_2

    invoke-static/range {p1 .. p1}, Law;->h(LwO1;)Z

    move-result v2

    if-nez v2, :cond_1

    sget-object v12, Lk20$a;->g:Lk20$a;

    const/4 v13, 0x0

    const/4 v14, 0x0

    sget-object v15, Law$h;->g:Law$h;

    const/16 v16, 0x6

    const/16 v17, 0x0

    move-object v10, v1

    move-object/from16 v11, p0

    invoke-static/range {v10 .. v17}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    sget-object v1, LmZ1;->b:LmZ1;

    invoke-interface {v0, v1}, LwO1;->T(LmZ1;)Z

    return-object v4

    :cond_1
    move-object/from16 v2, p0

    goto :goto_0

    :cond_2
    move-object v1, v0

    check-cast v1, LpZ1;

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Law;->i(LpZ1;)V

    goto :goto_0

    :cond_3
    move-object/from16 v2, p0

    move-object v3, v0

    check-cast v3, LLO1;

    invoke-static {v3}, Law;->j(LLO1;)Z

    move-result v3

    if-nez v3, :cond_4

    sget-object v12, Lk20$a;->g:Lk20$a;

    const/4 v13, 0x0

    const/4 v14, 0x0

    sget-object v15, Law$g;->g:Law$g;

    const/16 v16, 0x6

    const/16 v17, 0x0

    move-object v10, v1

    move-object/from16 v11, p0

    invoke-static/range {v10 .. v17}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    sget-object v1, LmZ1;->d:LmZ1;

    invoke-interface {v0, v1}, LwO1;->T(LmZ1;)Z

    return-object v4

    :cond_4
    :goto_0
    return-object v0
.end method

.method public final i(LpZ1;)V
    .locals 9

    const-string v0, "inAppMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LpZ1;->u0()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v1, Lk20;->a:Lk20;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, Law$p;->g:Law$p;

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p1}, LhZ1;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v1, Lk20;->a:Lk20;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, Law$q;->g:Law$q;

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void

    :cond_1
    invoke-virtual {p1}, LpZ1;->u0()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, LWz6;->c(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, LhZ1;->i0(Ljava/lang/String;)V

    return-void
.end method
