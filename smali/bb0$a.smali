.class public final Lbb0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbb0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final E:LiW1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, LiW1;->a(Ljava/lang/Object;)LiW1;

    move-result-object v0

    iput-object v0, p0, Lbb0$a;->E:LiW1;

    return-void
.end method


# virtual methods
.method public B()Landroidx/camera/core/impl/f;
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/n;->S()Landroidx/camera/core/impl/n;

    move-result-object v0

    return-object v0
.end method

.method public v()LiW1;
    .locals 1

    iget-object v0, p0, Lbb0$a;->E:LiW1;

    return-object v0
.end method
