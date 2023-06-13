.class public abstract Lyg1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/Object;)Lyg1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lyg1<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lyt;

    const/4 v1, 0x0

    sget-object v2, LN24;->b:LN24;

    invoke-direct {v0, v1, p0, v2}, Lyt;-><init>(Ljava/lang/Integer;Ljava/lang/Object;LN24;)V

    return-object v0
.end method

.method public static e(Ljava/lang/Object;)Lyg1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lyg1<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lyt;

    const/4 v1, 0x0

    sget-object v2, LN24;->c:LN24;

    invoke-direct {v0, v1, p0, v2}, Lyt;-><init>(Ljava/lang/Integer;Ljava/lang/Object;LN24;)V

    return-object v0
.end method

.method public static f(Ljava/lang/Object;)Lyg1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lyg1<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lyt;

    const/4 v1, 0x0

    sget-object v2, LN24;->d:LN24;

    invoke-direct {v0, v1, p0, v2}, Lyt;-><init>(Ljava/lang/Integer;Ljava/lang/Object;LN24;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/lang/Integer;
.end method

.method public abstract b()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public abstract c()LN24;
.end method
