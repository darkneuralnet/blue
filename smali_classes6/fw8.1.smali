.class public abstract Lfw8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAn8;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "LNp9;",
        ">",
        "Ljava/lang/Object;",
        "LAn8<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(LNp9;Lsk9;)Lfw8;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "LNp9;",
            ">(TT;",
            "Lsk9;",
            ")",
            "Lfw8<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LSv8;

    invoke-direct {v0, p0, p1}, LSv8;-><init>(LNp9;Lsk9;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Lsk9;
.end method

.method public abstract b()LNp9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public bridge synthetic zza()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method
