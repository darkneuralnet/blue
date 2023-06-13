.class public LAR5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/s;
.implements Landroidx/camera/core/impl/k;
.implements Lu36;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/camera/core/impl/s<",
        "LyR5;",
        ">;",
        "Landroidx/camera/core/impl/k;",
        "Lu36;"
    }
.end annotation


# instance fields
.field public final E:Landroidx/camera/core/impl/n;


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAR5;->E:Landroidx/camera/core/impl/n;

    return-void
.end method


# virtual methods
.method public B()Landroidx/camera/core/impl/f;
    .locals 1

    iget-object v0, p0, LAR5;->E:Landroidx/camera/core/impl/n;

    return-object v0
.end method
