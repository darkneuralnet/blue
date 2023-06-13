.class public final synthetic LOp5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/PixelCopy$OnPixelCopyFinishedListener;


# instance fields
.field public final synthetic a:Lio/reactivex/H;

.field public final synthetic b:Landroid/graphics/Bitmap;


# direct methods
.method public synthetic constructor <init>(Lio/reactivex/H;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOp5;->a:Lio/reactivex/H;

    iput-object p2, p0, LOp5;->b:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public final onPixelCopyFinished(I)V
    .locals 2

    iget-object v0, p0, LOp5;->a:Lio/reactivex/H;

    iget-object v1, p0, LOp5;->b:Landroid/graphics/Bitmap;

    invoke-static {v0, v1, p1}, LPp5$a;->a(Lio/reactivex/H;Landroid/graphics/Bitmap;I)V

    return-void
.end method
