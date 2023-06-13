.class public final Lkd$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkd;-><init>(Ljava/lang/String;LG26;Ljava/util/List;Ljava/util/List;Lkw1$b;Lg01;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function4<",
        "Lkw1;",
        "LJw1;",
        "LEw1;",
        "LFw1;",
        "Landroid/graphics/Typeface;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n\u00a2\u0006\u0004\u0008\t\u0010\n"
    }
    d2 = {
        "Lkw1;",
        "fontFamily",
        "LJw1;",
        "fontWeight",
        "LEw1;",
        "fontStyle",
        "LFw1;",
        "fontSynthesis",
        "Landroid/graphics/Typeface;",
        "a",
        "(Lkw1;LJw1;II)Landroid/graphics/Typeface;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lkd;


# direct methods
.method public constructor <init>(Lkd;)V
    .locals 0

    iput-object p1, p0, Lkd$a;->g:Lkd;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkw1;LJw1;II)Landroid/graphics/Typeface;
    .locals 1

    const-string v0, "fontWeight"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkd$a;->g:Lkd;

    invoke-virtual {v0}, Lkd;->g()Lkw1$b;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, Lkw1$b;->a(Lkw1;LJw1;II)LsP5;

    move-result-object p1

    instance-of p2, p1, LCc6$b;

    if-nez p2, :cond_0

    new-instance p2, Lwc6;

    iget-object p3, p0, Lkd$a;->g:Lkd;

    invoke-static {p3}, Lkd;->d(Lkd;)Lwc6;

    move-result-object p3

    invoke-direct {p2, p1, p3}, Lwc6;-><init>(LsP5;Lwc6;)V

    iget-object p1, p0, Lkd$a;->g:Lkd;

    invoke-static {p1, p2}, Lkd;->e(Lkd;Lwc6;)V

    invoke-virtual {p2}, Lwc6;->a()Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type android.graphics.Typeface"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/graphics/Typeface;

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkw1;

    check-cast p2, LJw1;

    check-cast p3, LEw1;

    invoke-virtual {p3}, LEw1;->i()I

    move-result p3

    check-cast p4, LFw1;

    invoke-virtual {p4}, LFw1;->m()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lkd$a;->a(Lkw1;LJw1;II)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1
.end method
