.class public Landroidx/fragment/app/b$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/b;->x(Ljava/util/List;Ljava/util/List;ZLandroidx/fragment/app/o$e;Landroidx/fragment/app/o$e;)Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:LCy1;

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:Landroid/graphics/Rect;

.field public final synthetic e:Landroidx/fragment/app/b;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/b;LCy1;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/b$h;->e:Landroidx/fragment/app/b;

    iput-object p2, p0, Landroidx/fragment/app/b$h;->b:LCy1;

    iput-object p3, p0, Landroidx/fragment/app/b$h;->c:Landroid/view/View;

    iput-object p4, p0, Landroidx/fragment/app/b$h;->d:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/b$h;->b:LCy1;

    iget-object v1, p0, Landroidx/fragment/app/b$h;->c:Landroid/view/View;

    iget-object v2, p0, Landroidx/fragment/app/b$h;->d:Landroid/graphics/Rect;

    invoke-virtual {v0, v1, v2}, LCy1;->h(Landroid/view/View;Landroid/graphics/Rect;)V

    return-void
.end method
