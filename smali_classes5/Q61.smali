.class public LQ61;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI96;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ61$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LI96<",
        "Landroid/graphics/drawable/Drawable;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Z

.field public c:LR61;


# direct methods
.method public constructor <init>(IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LQ61;->a:I

    iput-boolean p2, p0, LQ61;->b:Z

    return-void
.end method


# virtual methods
.method public a(LZS0;Z)LG96;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZS0;",
            "Z)",
            "LG96<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    sget-object p2, LZS0;->f:LZS0;

    if-ne p1, p2, :cond_0

    invoke-static {}, LC83;->b()LG96;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LQ61;->b()LG96;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final b()LG96;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LG96<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LQ61;->c:LR61;

    if-nez v0, :cond_0

    new-instance v0, LR61;

    iget v1, p0, LQ61;->a:I

    iget-boolean v2, p0, LQ61;->b:Z

    invoke-direct {v0, v1, v2}, LR61;-><init>(IZ)V

    iput-object v0, p0, LQ61;->c:LR61;

    :cond_0
    iget-object v0, p0, LQ61;->c:LR61;

    return-object v0
.end method
