.class public abstract Le74$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le74;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Lf74;Landroidx/camera/core/i;)Le74$b;
    .locals 1

    new-instance v0, LYt;

    invoke-direct {v0, p0, p1}, LYt;-><init>(Lf74;Landroidx/camera/core/i;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Landroidx/camera/core/i;
.end method

.method public abstract b()Lf74;
.end method
