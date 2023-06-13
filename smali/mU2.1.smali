.class public abstract LmU2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LmU2$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)LmU2$a;
    .locals 1

    new-instance v0, LPt$b;

    invoke-direct {v0}, LPt$b;-><init>()V

    invoke-virtual {v0, p0}, LPt$b;->d(Ljava/lang/String;)LmU2$a;

    move-result-object p0

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, LmU2$a;->c(I)LmU2$a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b()Lyp6;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()I
.end method
