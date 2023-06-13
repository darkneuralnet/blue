.class public Landroidx/camera/core/k$a;
.super Lpa0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/camera/core/k;


# direct methods
.method public constructor <init>(Landroidx/camera/core/k;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/k$a;->a:Landroidx/camera/core/k;

    invoke-direct {p0}, Lpa0;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lxa0;)V
    .locals 1

    invoke-super {p0, p1}, Lpa0;->b(Lxa0;)V

    iget-object v0, p0, Landroidx/camera/core/k$a;->a:Landroidx/camera/core/k;

    invoke-virtual {v0, p1}, Landroidx/camera/core/k;->t(Lxa0;)V

    return-void
.end method
