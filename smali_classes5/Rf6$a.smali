.class public LRf6$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXU2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LRf6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LXU2<",
        "Landroid/net/Uri;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LQW2;)LWU2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LQW2;",
            ")",
            "LWU2<",
            "Landroid/net/Uri;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    new-instance v0, LRf6;

    const-class v1, LOC1;

    const-class v2, Ljava/io/InputStream;

    invoke-virtual {p1, v1, v2}, LQW2;->d(Ljava/lang/Class;Ljava/lang/Class;)LWU2;

    move-result-object p1

    invoke-direct {v0, p1}, LRf6;-><init>(LWU2;)V

    return-object v0
.end method
