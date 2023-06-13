.class public abstract LL29;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;)LB29;
    .locals 1

    new-instance v0, LX19;

    invoke-direct {v0}, LX19;-><init>()V

    invoke-virtual {v0, p0}, LX19;->d(Ljava/lang/String;)LB29;

    const/4 p0, 0x1

    invoke-virtual {v0, p0}, LB29;->a(Z)LB29;

    invoke-virtual {v0, p0}, LB29;->b(I)LB29;

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()Z
.end method
