.class public abstract LQC8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()LQC8;
    .locals 1

    sget-object v0, LVB8;->b:LVB8;

    return-object v0
.end method

.method public static d(Ljava/lang/Object;)LQC8;
    .locals 1

    new-instance v0, LnD8;

    invoke-direct {v0, p0}, LnD8;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/lang/Object;
.end method

.method public abstract b()Z
.end method
