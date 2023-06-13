.class public final Lzd1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "HexColorValueUsage",
        "CatchGeneralException",
        "BadMethodUse-java.lang.String.length"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzd1$a;,
        Lzd1$b;,
        Lzd1$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00132\u00020\u0001:\u0003\u0016\u001a\u001eB\u0007\u00a2\u0006\u0004\u0008!\u0010\"J-\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJB\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J(\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0010H\u0002R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006#"
    }
    d2 = {
        "Lzd1;",
        "",
        "",
        "prefix",
        "Ljava/io/PrintWriter;",
        "writer",
        "",
        "args",
        "",
        "g",
        "(Ljava/lang/String;Ljava/io/PrintWriter;[Ljava/lang/String;)V",
        "Landroid/view/View;",
        "view",
        "",
        "leftOffset",
        "topOffset",
        "",
        "withWebView",
        "withProps",
        "f",
        "i",
        "LGd;",
        "a",
        "LGd;",
        "rootResolver",
        "LoA6;",
        "b",
        "LoA6;",
        "webViewDumpHelper",
        "Ljava/lang/reflect/Method;",
        "c",
        "Ljava/lang/reflect/Method;",
        "lithoViewToStringMethod",
        "<init>",
        "()V",
        "facebook-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static d:Lzd1;

.field public static e:Ljava/lang/reflect/Method;

.field public static final f:Lzd1$c;


# instance fields
.field public final a:LGd;

.field public final b:LoA6;

.field public c:Ljava/lang/reflect/Method;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzd1$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzd1$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzd1;->f:Lzd1$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LGd;

    invoke-direct {v0}, LGd;-><init>()V

    iput-object v0, p0, Lzd1;->a:LGd;

    new-instance v0, LoA6;

    invoke-direct {v0}, LoA6;-><init>()V

    iput-object v0, p0, Lzd1;->b:LoA6;

    return-void
.end method

.method public static final synthetic a(Lzd1;Ljava/lang/String;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lzd1;->g(Ljava/lang/String;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic b()Lzd1;
    .locals 1

    sget-object v0, Lzd1;->d:Lzd1;

    return-object v0
.end method

.method public static final synthetic c()Ljava/lang/reflect/Method;
    .locals 1

    sget-object v0, Lzd1;->e:Ljava/lang/reflect/Method;

    return-object v0
.end method

.method public static final synthetic d(Lzd1;)V
    .locals 0

    sput-object p0, Lzd1;->d:Lzd1;

    return-void
.end method

.method public static final synthetic e(Ljava/lang/reflect/Method;)V
    .locals 0

    sput-object p0, Lzd1;->e:Ljava/lang/reflect/Method;

    return-void
.end method

.method public static final h(Ljava/lang/String;Ljava/io/PrintWriter;[Ljava/lang/String;)Z
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lzd1;->f:Lzd1$c;

    invoke-virtual {v0, p0, p1, p2}, Lzd1$c;->n(Ljava/lang/String;Ljava/io/PrintWriter;[Ljava/lang/String;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final f(Ljava/lang/String;Ljava/io/PrintWriter;Landroid/view/View;IIZZ)V
    .locals 17

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    move-object/from16 v9, p2

    move-object/from16 v1, p3

    move/from16 v10, p7

    invoke-virtual {v9, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    if-nez v1, :cond_0

    const-string v0, "null"

    invoke-virtual {v9, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v2, "{"

    invoke-virtual {v9, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    sget-object v2, Lzd1;->f:Lzd1$c;

    invoke-static {v2, v9, v1}, Lzd1$c;->f(Lzd1$c;Ljava/io/PrintWriter;Landroid/view/View;)V

    move/from16 v3, p4

    move/from16 v4, p5

    invoke-static {v2, v9, v1, v3, v4}, Lzd1$c;->e(Lzd1$c;Ljava/io/PrintWriter;Landroid/view/View;II)V

    invoke-static {v2, v9, v1}, Lzd1$c;->g(Lzd1$c;Ljava/io/PrintWriter;Landroid/view/View;)V

    invoke-static {v2, v9, v1}, Lzd1$c;->h(Lzd1$c;Ljava/io/PrintWriter;Landroid/view/View;)V

    if-eqz v10, :cond_1

    sget-object v3, Lzd1$a;->b:Lzd1$a;

    invoke-virtual {v3, v9, v1}, Lzd1$a;->b(Ljava/io/PrintWriter;Landroid/view/View;)V

    :cond_1
    const-string v3, "}"

    invoke-virtual {v9, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-static {v2, v1}, Lzd1$c;->d(Lzd1$c;Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v8, v9, v1, v0, v10}, Lzd1;->i(Ljava/io/PrintWriter;Landroid/view/View;Ljava/lang/String;Z)V

    :cond_2
    if-eqz p6, :cond_3

    instance-of v2, v1, Landroid/webkit/WebView;

    if-eqz v2, :cond_3

    iget-object v2, v8, Lzd1;->b:LoA6;

    move-object v3, v1

    check-cast v3, Landroid/webkit/WebView;

    invoke-virtual {v2, v3}, LoA6;->c(Landroid/webkit/WebView;)V

    :cond_3
    instance-of v2, v1, Landroid/view/ViewGroup;

    if-nez v2, :cond_4

    return-void

    :cond_4
    move-object v11, v1

    check-cast v11, Landroid/view/ViewGroup;

    invoke-virtual {v11}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v12

    if-gtz v12, :cond_5

    return-void

    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "  "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    const/4 v0, 0x2

    new-array v14, v0, [I

    invoke-virtual {v1, v14}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v15, 0x0

    move v7, v15

    :goto_0
    if-ge v7, v12, :cond_6

    invoke-virtual {v11, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    aget v4, v14, v15

    const/4 v0, 0x1

    aget v5, v14, v0

    move-object/from16 v0, p0

    move-object v1, v13

    move-object/from16 v2, p2

    move/from16 v6, p6

    move/from16 v16, v7

    move/from16 v7, p7

    invoke-virtual/range {v0 .. v7}, Lzd1;->f(Ljava/lang/String;Ljava/io/PrintWriter;Landroid/view/View;IIZZ)V

    add-int/lit8 v7, v16, 0x1

    goto :goto_0

    :cond_6
    return-void
.end method

.method public final g(Ljava/lang/String;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 17

    move-object/from16 v9, p0

    move-object/from16 v0, p1

    move-object/from16 v10, p2

    move-object/from16 v1, p3

    invoke-virtual {v10, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v2, "Top Level Window View Hierarchy:"

    invoke-virtual {v10, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    sget-object v2, Lzd1;->f:Lzd1$c;

    const-string v3, "all-roots"

    invoke-static {v2, v1, v3}, Lzd1$c;->c(Lzd1$c;[Ljava/lang/String;Ljava/lang/String;)Z

    move-result v11

    const-string v3, "top-root"

    invoke-static {v2, v1, v3}, Lzd1$c;->c(Lzd1$c;[Ljava/lang/String;Ljava/lang/String;)Z

    move-result v12

    const-string v3, "webview"

    invoke-static {v2, v1, v3}, Lzd1$c;->c(Lzd1$c;[Ljava/lang/String;Ljava/lang/String;)Z

    move-result v13

    const-string v3, "props"

    invoke-static {v2, v1, v3}, Lzd1$c;->c(Lzd1$c;[Ljava/lang/String;Ljava/lang/String;)Z

    move-result v14

    :try_start_0
    iget-object v1, v9, Lzd1;->a:LGd;

    invoke-virtual {v1}, LGd;->b()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, LGd$b;

    if-eqz v16, :cond_1

    invoke-virtual/range {v16 .. v16}, LGd$b;->b()Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    if-nez v11, :cond_3

    if-eqz v1, :cond_3

    invoke-virtual/range {v16 .. v16}, LGd$b;->a()Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->type:I

    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->type:I

    sub-int/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    goto :goto_1

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, LGd$b;->b()Landroid/view/View;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move v7, v13

    move v8, v14

    invoke-virtual/range {v1 .. v8}, Lzd1;->f(Ljava/lang/String;Ljava/io/PrintWriter;Landroid/view/View;IIZZ)V

    invoke-virtual/range {v16 .. v16}, LGd$b;->a()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    if-eqz v12, :cond_1

    :cond_4
    :goto_1
    iget-object v0, v9, Lzd1;->b:LoA6;

    invoke-virtual {v0, v10}, LoA6;->b(Ljava/io/PrintWriter;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :cond_5
    :goto_2
    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failure in view hierarchy dump: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :goto_3
    return-void
.end method

.method public final i(Ljava/io/PrintWriter;Landroid/view/View;Ljava/lang/String;Z)V
    .locals 8

    :try_start_0
    iget-object v0, p0, Lzd1;->c:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-nez v0, :cond_0

    const-string v0, "com.facebook.litho.LithoViewTestHelper"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v5, "Class.forName(LITHO_VIEW_TEST_HELPER_CLASS)"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "viewToStringForE2E"

    new-array v6, v2, [Ljava/lang/Class;

    const-class v7, Landroid/view/View;

    aput-object v7, v6, v1

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v7, v6, v4

    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v7, v6, v3

    invoke-virtual {v0, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lzd1;->c:Ljava/lang/reflect/Method;

    :cond_0
    iget-object v0, p0, Lzd1;->c:Ljava/lang/reflect/Method;

    const/4 v5, 0x0

    if-eqz v0, :cond_1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p2, v2, v1

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p2

    div-int/2addr p2, v3

    add-int/2addr p2, v4

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v2, v4

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    aput-object p2, v2, v3

    invoke-virtual {v0, v5, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    :cond_1
    if-eqz v5, :cond_2

    check-cast v5, Ljava/lang/String;

    invoke-virtual {p1, v5}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object p2

    const-string p4, "writer.append(lithoViewDump)"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    new-instance p2, Ljava/lang/NullPointerException;

    const-string p4, "null cannot be cast to non-null type kotlin.String"

    invoke-direct {p2, p4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p2

    invoke-virtual {p1, p3}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object p1

    const-string p3, "Failed litho view sub hierarch dump: "

    invoke-virtual {p1, p3}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object p1

    sget-object p3, Lzd1;->f:Lzd1$c;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    const/16 p4, 0x64

    invoke-static {p3, p2, p4}, Lzd1$c;->b(Lzd1$c;Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/PrintWriter;->println()V

    :goto_0
    return-void
.end method
