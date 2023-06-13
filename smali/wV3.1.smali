.class public final LwV3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011JB\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006H\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000e\u00a8\u0006\u0012"
    }
    d2 = {
        "LwV3;",
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
        "LmW3;",
        "LmW3;",
        "platformTypefaceResolver",
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


# instance fields
.field public final a:LmW3;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LpW3;->a()LmW3;

    move-result-object v0

    iput-object v0, p0, LwV3;->a:LmW3;

    return-void
.end method


# virtual methods
.method public a(LAc6;LxV3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)LCc6;
    .locals 1
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

    const-string v0, "typefaceRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "platformFontLoader"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "onAsyncCompletion"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "createDefaultTypeface"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LAc6;->c()Lkw1;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    instance-of p3, p2, LmX0;

    :goto_0
    const/4 p4, 0x0

    if-eqz p3, :cond_1

    iget-object p2, p0, LwV3;->a:LmW3;

    invoke-virtual {p1}, LAc6;->f()LJw1;

    move-result-object p3

    invoke-virtual {p1}, LAc6;->d()I

    move-result p1

    invoke-interface {p2, p3, p1}, LmW3;->a(LJw1;I)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_1

    :cond_1
    instance-of p3, p2, LtB1;

    if-eqz p3, :cond_2

    iget-object p2, p0, LwV3;->a:LmW3;

    invoke-virtual {p1}, LAc6;->c()Lkw1;

    move-result-object p3

    check-cast p3, LtB1;

    invoke-virtual {p1}, LAc6;->f()LJw1;

    move-result-object v0

    invoke-virtual {p1}, LAc6;->d()I

    move-result p1

    invoke-interface {p2, p3, v0, p1}, LmW3;->b(LtB1;LJw1;I)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_1

    :cond_2
    instance-of p2, p2, Lqt2;

    if-eqz p2, :cond_3

    invoke-virtual {p1}, LAc6;->c()Lkw1;

    move-result-object p2

    check-cast p2, Lqt2;

    invoke-virtual {p2}, Lqt2;->b()LIb6;

    move-result-object p2

    const-string p3, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, LVd;

    invoke-virtual {p1}, LAc6;->f()LJw1;

    move-result-object p3

    invoke-virtual {p1}, LAc6;->d()I

    move-result v0

    invoke-virtual {p1}, LAc6;->e()I

    move-result p1

    invoke-interface {p2, p3, v0, p1}, LVd;->a(LJw1;II)Landroid/graphics/Typeface;

    move-result-object p1

    :goto_1
    new-instance p2, LCc6$b;

    const/4 p3, 0x0

    const/4 v0, 0x2

    invoke-direct {p2, p1, p3, v0, p4}, LCc6$b;-><init>(Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p2

    :cond_3
    return-object p4
.end method
