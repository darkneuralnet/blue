.class public abstract Lmf9;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;)Lef9;
    .locals 1

    new-instance p0, LWd9;

    invoke-direct {p0}, LWd9;-><init>()V

    const-string v0, "common"

    invoke-virtual {p0, v0}, LWd9;->d(Ljava/lang/String;)Lef9;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lef9;->a(Z)Lef9;

    invoke-virtual {p0, v0}, Lef9;->b(I)Lef9;

    return-object p0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()Z
.end method
