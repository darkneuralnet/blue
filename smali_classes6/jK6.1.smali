.class public abstract LjK6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:LaO6;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LaO6<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LjK6;->b:LaO6;

    return-void
.end method

.method public constructor <init>(LaO6;)V
    .locals 0
    .param p1    # LaO6;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LaO6<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LjK6;->b:LaO6;

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, LjK6;->b:LaO6;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LaO6;->d(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public final c()LaO6;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LaO6<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, LjK6;->b:LaO6;

    return-object v0
.end method

.method public final run()V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, LjK6;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, LjK6;->b(Ljava/lang/Exception;)V

    return-void
.end method
