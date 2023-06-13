.class public abstract LKT$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKT;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(LMD3;I)LKT$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMD3<",
            "Landroid/graphics/Bitmap;",
            ">;I)",
            "LKT$a;"
        }
    .end annotation

    new-instance v0, Llt;

    invoke-direct {v0, p0, p1}, Llt;-><init>(LMD3;I)V

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()LMD3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LMD3<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end method
