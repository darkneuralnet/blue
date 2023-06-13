.class public final Lsw1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsw1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u000cB\u001b\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017JB\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006H\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0019"
    }
    d2 = {
        "Lsw1;",
        "",
        "LAc6;",
        "typefaceRequest",
        "LxV3;",
        "platformFontLoader",
        "Lkotlin/Function1;",
        "LCc6$b;",
        "",
        "onAsyncCompletion",
        "createDefaultTypeface",
        "LCc6;",
        "a",
        "Lmp;",
        "Lmp;",
        "asyncTypefaceCache",
        "LZC0;",
        "b",
        "LZC0;",
        "asyncLoadScope",
        "Lkotlin/coroutines/CoroutineContext;",
        "injectedContext",
        "<init>",
        "(Lmp;Lkotlin/coroutines/CoroutineContext;)V",
        "c",
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
        "SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,427:1\n35#2,3:428\n38#2,2:435\n40#2:438\n56#2,4:450\n60#2,3:458\n63#2:462\n33#3,4:431\n38#3:437\n151#3,3:439\n33#3,4:442\n154#3,2:446\n38#3:448\n156#3:449\n33#3,4:454\n38#3:461\n33#3,6:463\n49#4,4:469\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n*L\n68#1:428,3\n68#1:435,2\n68#1:438\n70#1:450,4\n70#1:458,3\n70#1:462\n68#1:431,4\n68#1:437\n69#1:439,3\n69#1:442,4\n69#1:446,2\n69#1:448\n69#1:449\n70#1:454,4\n70#1:461\n74#1:463,6\n155#1:469,4\n*E\n"
    }
.end annotation


# static fields
.field public static final c:Lsw1$a;

.field public static final d:Lvw1;

.field public static final e:LTC0;


# instance fields
.field public final a:Lmp;

.field public b:LZC0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsw1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsw1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lsw1;->c:Lsw1$a;

    new-instance v0, Lvw1;

    invoke-direct {v0}, Lvw1;-><init>()V

    sput-object v0, Lsw1;->d:Lvw1;

    sget-object v0, LTC0;->N:LTC0$a;

    new-instance v1, Lsw1$c;

    invoke-direct {v1, v0}, Lsw1$c;-><init>(LTC0$a;)V

    sput-object v1, Lsw1;->e:LTC0;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lsw1;-><init>(Lmp;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lmp;Lkotlin/coroutines/CoroutineContext;)V
    .locals 1

    const-string v0, "asyncTypefaceCache"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "injectedContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsw1;->a:Lmp;

    sget-object p1, Lsw1;->e:LTC0;

    invoke-interface {p1, p2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    sget-object v0, Lzh2;->a0:Lzh2$b;

    invoke-interface {p2, v0}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object p2

    check-cast p2, Lzh2;

    invoke-static {p2}, LXU5;->a(Lzh2;)Lms0;

    move-result-object p2

    invoke-interface {p1, p2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    invoke-static {p1}, LaD0;->a(Lkotlin/coroutines/CoroutineContext;)LZC0;

    move-result-object p1

    iput-object p1, p0, Lsw1;->b:LZC0;

    return-void
.end method

.method public synthetic constructor <init>(Lmp;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    new-instance p1, Lmp;

    invoke-direct {p1}, Lmp;-><init>()V

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    sget-object p2, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    :cond_1
    invoke-direct {p0, p1, p2}, Lsw1;-><init>(Lmp;Lkotlin/coroutines/CoroutineContext;)V

    return-void
.end method


# virtual methods
.method public a(LAc6;LxV3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)LCc6;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAc6;",
            "LxV3;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LCc6$b;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LAc6;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "LCc6;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    move-object/from16 v7, p2

    move-object/from16 v1, p4

    const-string v2, "typefaceRequest"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "platformFontLoader"

    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onAsyncCompletion"

    move-object/from16 v6, p3

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "createDefaultTypeface"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LAc6;->c()Lkw1;

    move-result-object v2

    instance-of v2, v2, Lrw1;

    const/4 v8, 0x0

    if-nez v2, :cond_0

    return-object v8

    :cond_0
    sget-object v2, Lsw1;->d:Lvw1;

    invoke-virtual/range {p1 .. p1}, LAc6;->c()Lkw1;

    move-result-object v3

    check-cast v3, Lrw1;

    invoke-virtual {v3}, Lrw1;->e()Ljava/util/List;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, LAc6;->f()LJw1;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, LAc6;->d()I

    move-result v9

    invoke-virtual {v2, v3, v5, v9}, Lvw1;->a(Ljava/util/List;LJw1;I)Ljava/util/List;

    move-result-object v2

    iget-object v3, v0, Lsw1;->a:Lmp;

    invoke-static {v2, v4, v3, v7, v1}, Ltw1;->a(Ljava/util/List;LAc6;Lmp;LxV3;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1

    new-instance v1, LCc6$b;

    const/4 v2, 0x0

    const/4 v4, 0x2

    invoke-direct {v1, v3, v2, v4, v8}, LCc6$b;-><init>(Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    new-instance v9, Lep;

    iget-object v5, v0, Lsw1;->a:Lmp;

    move-object v1, v9

    move-object/from16 v4, p1

    move-object/from16 v6, p3

    move-object/from16 v7, p2

    invoke-direct/range {v1 .. v7}, Lep;-><init>(Ljava/util/List;Ljava/lang/Object;LAc6;Lmp;Lkotlin/jvm/functions/Function1;LxV3;)V

    iget-object v10, v0, Lsw1;->b:LZC0;

    const/4 v11, 0x0

    sget-object v12, LbD0;->e:LbD0;

    new-instance v13, Lsw1$b;

    invoke-direct {v13, v9, v8}, Lsw1$b;-><init>(Lep;Lkotlin/coroutines/Continuation;)V

    const/4 v14, 0x1

    const/4 v15, 0x0

    invoke-static/range {v10 .. v15}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    new-instance v1, LCc6$a;

    invoke-direct {v1, v9}, LCc6$a;-><init>(Lep;)V

    return-object v1
.end method
