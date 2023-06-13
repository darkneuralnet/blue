.class public abstract LXh2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXh2;
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

.method public static c(LMD3;Landroidx/camera/core/h$n;)LXh2$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMD3<",
            "[B>;",
            "Landroidx/camera/core/h$n;",
            ")",
            "LXh2$a;"
        }
    .end annotation

    new-instance v0, LJt;

    invoke-direct {v0, p0, p1}, LJt;-><init>(LMD3;Landroidx/camera/core/h$n;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Landroidx/camera/core/h$n;
.end method

.method public abstract b()LMD3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LMD3<",
            "[B>;"
        }
    .end annotation
.end method
