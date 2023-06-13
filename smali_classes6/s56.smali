.class public abstract Ls56;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls56$a;,
        Ls56$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ls56$a;
    .locals 3

    new-instance v0, Lpu$b;

    invoke-direct {v0}, Lpu$b;-><init>()V

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lpu$b;->d(J)Ls56$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract b()Ls56$b;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()J
.end method
