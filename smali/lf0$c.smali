.class public abstract Llf0$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llf0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(I)Llf0$c;
    .locals 3

    new-instance v0, Lrt;

    new-instance v1, Ls91;

    invoke-direct {v1}, Ls91;-><init>()V

    new-instance v2, Ls91;

    invoke-direct {v2}, Ls91;-><init>()V

    invoke-direct {v0, v1, v2, p0}, Lrt;-><init>(Ls91;Ls91;I)V

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()Ls91;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ls91<",
            "Landroidx/camera/core/i;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c()Ls91;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ls91<",
            "Lf74;",
            ">;"
        }
    .end annotation
.end method
