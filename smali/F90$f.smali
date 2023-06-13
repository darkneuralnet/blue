.class public final LF90$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/CameraControlInternal$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF90;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "f"
.end annotation


# instance fields
.field public final synthetic a:LF90;


# direct methods
.method public constructor <init>(LF90;)V
    .locals 0

    iput-object p1, p0, LF90$f;->a:LF90;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/d;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LF90$f;->a:LF90;

    invoke-static {p1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {v0, p1}, LF90;->n0(Ljava/util/List;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, LF90$f;->a:LF90;

    invoke-virtual {v0}, LF90;->t0()V

    return-void
.end method
