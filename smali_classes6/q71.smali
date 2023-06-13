.class public abstract Lq71;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "LyC;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:LyC;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TS;"
        }
    .end annotation
.end field

.field public b:Lg71;


# direct methods
.method public constructor <init>(LyC;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq71;->a:LyC;

    return-void
.end method


# virtual methods
.method public abstract a(Landroid/graphics/Canvas;Landroid/graphics/Rect;F)V
.end method

.method public abstract b(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFI)V
.end method

.method public abstract c(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
.end method

.method public abstract d()I
.end method

.method public abstract e()I
.end method

.method public f(Lg71;)V
    .locals 0

    iput-object p1, p0, Lq71;->b:Lg71;

    return-void
.end method

.method public g(Landroid/graphics/Canvas;Landroid/graphics/Rect;F)V
    .locals 1

    iget-object v0, p0, Lq71;->a:LyC;

    invoke-virtual {v0}, LyC;->e()V

    invoke-virtual {p0, p1, p2, p3}, Lq71;->a(Landroid/graphics/Canvas;Landroid/graphics/Rect;F)V

    return-void
.end method
