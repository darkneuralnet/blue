.class public final LOT$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG96;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LOT;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LG96<",
        "TR;>;"
    }
.end annotation


# instance fields
.field public final a:LG96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LG96<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic b:LOT;


# direct methods
.method public constructor <init>(LOT;LG96;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LG96<",
            "Landroid/graphics/drawable/Drawable;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LOT$a;->b:LOT;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LOT$a;->a:LG96;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;LG96$a;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;",
            "LG96$a;",
            ")Z"
        }
    .end annotation

    invoke-interface {p2}, LG96$a;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v2, p0, LOT$a;->b:LOT;

    invoke-virtual {v2, p1}, LOT;->b(Ljava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    iget-object p1, p0, LOT$a;->a:LG96;

    invoke-interface {p1, v1, p2}, LG96;->a(Ljava/lang/Object;LG96$a;)Z

    move-result p1

    return p1
.end method
