.class public abstract Ljm9;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;)Ldm9;
    .locals 1

    new-instance v0, LXk9;

    invoke-direct {v0}, LXk9;-><init>()V

    invoke-virtual {v0, p0}, LXk9;->d(Ljava/lang/String;)Ldm9;

    const/4 p0, 0x1

    invoke-virtual {v0, p0}, Ldm9;->a(Z)Ldm9;

    invoke-virtual {v0, p0}, Ldm9;->b(I)Ldm9;

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()Z
.end method
