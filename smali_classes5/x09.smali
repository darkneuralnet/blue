.class public abstract Lx09;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;)Lo09;
    .locals 1

    new-instance p0, LKY8;

    invoke-direct {p0}, LKY8;-><init>()V

    const-string v0, "vision-common"

    invoke-virtual {p0, v0}, LKY8;->d(Ljava/lang/String;)Lo09;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo09;->a(Z)Lo09;

    invoke-virtual {p0, v0}, Lo09;->b(I)Lo09;

    return-object p0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()Z
.end method
