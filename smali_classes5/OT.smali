.class public abstract LOT;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI96;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LOT$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LI96<",
        "TR;>;"
    }
.end annotation


# instance fields
.field public final a:LI96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LI96<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LI96;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LI96<",
            "Landroid/graphics/drawable/Drawable;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOT;->a:LI96;

    return-void
.end method


# virtual methods
.method public a(LZS0;Z)LG96;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZS0;",
            "Z)",
            "LG96<",
            "TR;>;"
        }
    .end annotation

    iget-object v0, p0, LOT;->a:LI96;

    invoke-interface {v0, p1, p2}, LI96;->a(LZS0;Z)LG96;

    move-result-object p1

    new-instance p2, LOT$a;

    invoke-direct {p2, p0, p1}, LOT$a;-><init>(LOT;LG96;)V

    return-object p2
.end method

.method public abstract b(Ljava/lang/Object;)Landroid/graphics/Bitmap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)",
            "Landroid/graphics/Bitmap;"
        }
    .end annotation
.end method
