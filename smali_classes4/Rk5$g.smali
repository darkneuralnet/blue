.class public final LRk5$g;
.super Landroid/view/ViewOutlineProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRk5;->gm(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Rk5$g",
        "Landroid/view/ViewOutlineProvider;",
        "Landroid/view/View;",
        "view",
        "Landroid/graphics/Outline;",
        "outline",
        "",
        "getOutline",
        "vehiclescanner_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:LRk5;


# direct methods
.method public constructor <init>(ZLRk5;)V
    .locals 0

    iput-boolean p1, p0, LRk5$g;->a:Z

    iput-object p2, p0, LRk5$g;->b:LRk5;

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 7

    if-eqz p2, :cond_3

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v0

    :goto_0
    const/16 v4, 0xa

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    move v5, v0

    goto :goto_2

    :cond_1
    iget-boolean v5, p0, LRk5$g;->a:Z

    if-eqz v5, :cond_2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget-object v6, p0, LRk5$g;->b:LRk5;

    invoke-virtual {v6}, LRk5;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v6

    invoke-static {v5, v6}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v5

    float-to-int v5, v5

    goto :goto_1

    :cond_2
    move v5, v0

    :goto_1
    add-int/2addr v5, v0

    :goto_2
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v4, p0, LRk5$g;->b:LRk5;

    invoke-virtual {v4}, LRk5;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v4

    invoke-static {v0, v4}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v6

    move-object v0, p2

    move v4, v5

    move v5, v6

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    :cond_3
    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/view/View;->setClipToOutline(Z)V

    :goto_3
    return-void
.end method
