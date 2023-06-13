.class public abstract Luo7;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;)Lto7;
    .locals 1

    new-instance v0, Lpo7;

    invoke-direct {v0}, Lpo7;-><init>()V

    invoke-virtual {v0, p0}, Lpo7;->d(Ljava/lang/String;)Lto7;

    const/4 p0, 0x1

    invoke-virtual {v0, p0}, Lto7;->a(Z)Lto7;

    invoke-virtual {v0, p0}, Lto7;->b(I)Lto7;

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()Z
.end method
