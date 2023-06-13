.class public LSE2;
.super LTE2;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Le;

    new-instance v1, Lud6;

    invoke-direct {v1}, Lud6;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-direct {p0, v0}, LTE2;-><init>([Le;)V

    return-void
.end method
