.class public abstract Lsp;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LDV5;ILandroid/util/Size;Landroid/util/Range;)Lsp;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDV5;",
            "I",
            "Landroid/util/Size;",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lsp;"
        }
    .end annotation

    new-instance v0, Ldt;

    invoke-direct {v0, p0, p1, p2, p3}, Ldt;-><init>(LDV5;ILandroid/util/Size;Landroid/util/Range;)V

    return-object v0
.end method


# virtual methods
.method public abstract b()I
.end method

.method public abstract c()Landroid/util/Size;
.end method

.method public abstract d()LDV5;
.end method

.method public abstract e()Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method
