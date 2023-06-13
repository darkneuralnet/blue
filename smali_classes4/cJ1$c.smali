.class public final LcJ1$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LcJ1;->d(Landroidx/camera/core/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LcJ1$a<",
        "Ljava/util/List<",
        "+",
        "LBx;",
        ">;>;",
        "LcJ1$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "LcJ1$a;",
        "",
        "LBx;",
        "barcodes",
        "LcJ1$b;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LcJ1$a;)LcJ1$b;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lg32;


# direct methods
.method public constructor <init>(Lg32;)V
    .locals 0

    iput-object p1, p0, LcJ1$c;->g:Lg32;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LcJ1$a;)LcJ1$b;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LcJ1$a<",
            "Ljava/util/List<",
            "LBx;",
            ">;>;)",
            "LcJ1$b;"
        }
    .end annotation

    const-string v0, "barcodes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LcJ1$b;

    new-instance v1, Landroid/graphics/Rect;

    iget-object v2, p0, LcJ1$c;->g:Lg32;

    invoke-virtual {v2}, Lg32;->l()I

    move-result v2

    iget-object v3, p0, LcJ1$c;->g:Lg32;

    invoke-virtual {v3}, Lg32;->h()I

    move-result v3

    const/4 v4, 0x0

    invoke-direct {v1, v4, v4, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {p1}, LcJ1$a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_0
    invoke-direct {v0, v1, p1}, LcJ1$b;-><init>(Landroid/graphics/Rect;Ljava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LcJ1$a;

    invoke-virtual {p0, p1}, LcJ1$c;->a(LcJ1$a;)LcJ1$b;

    move-result-object p1

    return-object p1
.end method
