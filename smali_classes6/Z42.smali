.class public abstract LZ42;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ42$a;,
        LZ42$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LZ42$a;
    .locals 1

    new-instance v0, LHt$b;

    invoke-direct {v0}, LHt$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Ls56;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()LZ42$b;
.end method

.method public abstract f()Ljava/lang/String;
.end method
