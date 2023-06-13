.class public LVT2$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVT2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/camera/core/impl/s<",
        "Landroidx/camera/core/p;",
        ">;"
    }
.end annotation


# instance fields
.field public final E:Landroidx/camera/core/impl/f;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/camera/core/impl/m;->V()Landroidx/camera/core/impl/m;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/s;->x:Landroidx/camera/core/impl/f$a;

    new-instance v2, Lla0;

    invoke-direct {v2}, Lla0;-><init>()V

    invoke-virtual {v0, v1, v2}, Landroidx/camera/core/impl/m;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    iput-object v0, p0, LVT2$b;->E:Landroidx/camera/core/impl/f;

    return-void
.end method


# virtual methods
.method public B()Landroidx/camera/core/impl/f;
    .locals 1

    iget-object v0, p0, LVT2$b;->E:Landroidx/camera/core/impl/f;

    return-object v0
.end method
