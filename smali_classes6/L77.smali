.class public abstract LL77;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(ILandroid/os/RemoteException;)LL77;
    .locals 1

    new-instance v0, LoY6;

    invoke-static {p1}, LI57;->e(Ljava/lang/Object;)LI57;

    move-result-object p1

    invoke-direct {v0, p0, p1}, LoY6;-><init>(ILI57;)V

    return-object v0
.end method

.method public static d()LL77;
    .locals 3

    new-instance v0, LoY6;

    const/4 v1, 0x0

    invoke-static {}, LI57;->d()LI57;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LoY6;-><init>(ILI57;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()LI57;
.end method

.method public final e()Z
    .locals 1

    invoke-virtual {p0}, LL77;->b()LI57;

    move-result-object v0

    invoke-virtual {v0}, LI57;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
