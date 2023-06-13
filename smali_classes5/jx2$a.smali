.class public Ljx2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luj1$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljx2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Luj1$d<",
        "Ljx2<",
        "*>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljx2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljx2<",
            "*>;"
        }
    .end annotation

    new-instance v0, Ljx2;

    invoke-direct {v0}, Ljx2;-><init>()V

    return-object v0
.end method

.method public bridge synthetic create()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljx2$a;->a()Ljx2;

    move-result-object v0

    return-object v0
.end method
