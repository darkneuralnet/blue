.class public final Landroidx/camera/core/h$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation


# static fields
.field public static final a:Landroidx/camera/core/impl/i;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/camera/core/h$g;

    invoke-direct {v0}, Landroidx/camera/core/h$g;-><init>()V

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroidx/camera/core/h$g;->k(I)Landroidx/camera/core/h$g;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/camera/core/h$g;->l(I)Landroidx/camera/core/h$g;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/h$g;->g()Landroidx/camera/core/impl/i;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/h$h;->a:Landroidx/camera/core/impl/i;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroidx/camera/core/impl/i;
    .locals 1

    sget-object v0, Landroidx/camera/core/h$h;->a:Landroidx/camera/core/impl/i;

    return-object v0
.end method
