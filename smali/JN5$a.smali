.class public final LJN5$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJN5;->l(Landroid/text/Spannable;LG26;Ljava/util/List;Lkotlin/jvm/functions/Function4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LGN5;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "LGN5;",
        "spanStyle",
        "",
        "start",
        "end",
        "",
        "a",
        "(LGN5;II)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Landroid/text/Spannable;

.field public final synthetic h:Lkotlin/jvm/functions/Function4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function4<",
            "Lkw1;",
            "LJw1;",
            "LEw1;",
            "LFw1;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/text/Spannable;Lkotlin/jvm/functions/Function4;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/text/Spannable;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Lkw1;",
            "-",
            "LJw1;",
            "-",
            "LEw1;",
            "-",
            "LFw1;",
            "+",
            "Landroid/graphics/Typeface;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LJN5$a;->g:Landroid/text/Spannable;

    iput-object p2, p0, LJN5$a;->h:Lkotlin/jvm/functions/Function4;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LGN5;II)V
    .locals 6

    const-string v0, "spanStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LJN5$a;->g:Landroid/text/Spannable;

    new-instance v1, LDc6;

    iget-object v2, p0, LJN5$a;->h:Lkotlin/jvm/functions/Function4;

    invoke-virtual {p1}, LGN5;->i()Lkw1;

    move-result-object v3

    invoke-virtual {p1}, LGN5;->n()LJw1;

    move-result-object v4

    if-nez v4, :cond_0

    sget-object v4, LJw1;->c:LJw1$a;

    invoke-virtual {v4}, LJw1$a;->d()LJw1;

    move-result-object v4

    :cond_0
    invoke-virtual {p1}, LGN5;->l()LEw1;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, LEw1;->i()I

    move-result v5

    goto :goto_0

    :cond_1
    sget-object v5, LEw1;->b:LEw1$a;

    invoke-virtual {v5}, LEw1$a;->b()I

    move-result v5

    :goto_0
    invoke-static {v5}, LEw1;->c(I)LEw1;

    move-result-object v5

    invoke-virtual {p1}, LGN5;->m()LFw1;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LFw1;->m()I

    move-result p1

    goto :goto_1

    :cond_2
    sget-object p1, LFw1;->b:LFw1$a;

    invoke-virtual {p1}, LFw1$a;->a()I

    move-result p1

    :goto_1
    invoke-static {p1}, LFw1;->e(I)LFw1;

    move-result-object p1

    invoke-interface {v2, v3, v4, v5, p1}, Lkotlin/jvm/functions/Function4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Typeface;

    invoke-direct {v1, p1}, LDc6;-><init>(Landroid/graphics/Typeface;)V

    const/16 p1, 0x21

    invoke-interface {v0, v1, p2, p3, p1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LGN5;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LJN5$a;->a(LGN5;II)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
