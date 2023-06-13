.class public abstract LwW8;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;)LkW8;
    .locals 1

    new-instance p0, LHV8;

    invoke-direct {p0}, LHV8;-><init>()V

    const-string v0, "optional-module-face"

    invoke-virtual {p0, v0}, LHV8;->d(Ljava/lang/String;)LkW8;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LkW8;->a(Z)LkW8;

    invoke-virtual {p0, v0}, LkW8;->b(I)LkW8;

    return-object p0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()Z
.end method
