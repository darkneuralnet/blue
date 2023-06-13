.class public final LUS1$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUS1;->d(Landroidx/camera/core/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LUS1$b<",
        "Lp06;",
        ">;",
        "LUS1$b<",
        "Ljava/util/List<",
        "Ldj1;",
        ">;>;",
        "LUS1$b<",
        "Ljava/util/List<",
        "LU11;",
        ">;>;",
        "LUS1$c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\t\u001a\u00020\u00082\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u00002\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00030\u0000H\n\u00a2\u0006\u0004\u0008\t\u0010\n"
    }
    d2 = {
        "LUS1$b;",
        "Lp06;",
        "text",
        "",
        "Ldj1;",
        "faces",
        "LU11;",
        "objects",
        "LUS1$c;",
        "a",
        "(LUS1$b;LUS1$b;LUS1$b;)LUS1$c;"
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

.field public final synthetic h:LUS1;


# direct methods
.method public constructor <init>(Lg32;LUS1;)V
    .locals 0

    iput-object p1, p0, LUS1$e;->g:Lg32;

    iput-object p2, p0, LUS1$e;->h:LUS1;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LUS1$b;LUS1$b;LUS1$b;)LUS1$c;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LUS1$b<",
            "Lp06;",
            ">;",
            "LUS1$b<",
            "Ljava/util/List<",
            "Ldj1;",
            ">;>;",
            "LUS1$b<",
            "Ljava/util/List<",
            "LU11;",
            ">;>;)",
            "LUS1$c;"
        }
    .end annotation

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "faces"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "objects"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Landroid/graphics/Rect;

    iget-object v0, p0, LUS1$e;->g:Lg32;

    invoke-virtual {v0}, Lg32;->l()I

    move-result v0

    iget-object v1, p0, LUS1$e;->g:Lg32;

    invoke-virtual {v1}, Lg32;->h()I

    move-result v1

    const/4 v3, 0x0

    invoke-direct {v2, v3, v3, v0, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {p2}, LUS1$b;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    :cond_0
    move-object v4, p2

    invoke-virtual {p1}, LUS1$b;->a()Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lp06;

    new-instance p1, LUS1$c;

    invoke-virtual {p3}, LUS1$b;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    :cond_1
    move-object v3, p2

    iget-object p2, p0, LUS1$e;->h:LUS1;

    invoke-static {p2, v2, v4, v5}, LUS1;->access$processLandmarkWidthRatio(LUS1;Landroid/graphics/Rect;Ljava/util/List;Lp06;)Ljava/lang/Float;

    move-result-object v6

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, LUS1$c;-><init>(Landroid/graphics/Rect;Ljava/util/List;Ljava/util/List;Lp06;Ljava/lang/Float;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LUS1$b;

    check-cast p2, LUS1$b;

    check-cast p3, LUS1$b;

    invoke-virtual {p0, p1, p2, p3}, LUS1$e;->a(LUS1$b;LUS1$b;LUS1$b;)LUS1$c;

    move-result-object p1

    return-object p1
.end method
