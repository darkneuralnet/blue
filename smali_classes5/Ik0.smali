.class public abstract LIk0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LIk0$a;,
        LIk0$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LIk0$a;
    .locals 1

    new-instance v0, Lst$b;

    invoke-direct {v0}, Lst$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lcc;
.end method

.method public abstract c()LIk0$b;
.end method
