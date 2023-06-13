.class public final Lso$a;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lso;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractSet<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lso;


# direct methods
.method public constructor <init>(Lso;)V
    .locals 0

    iput-object p1, p0, Lso$a;->b:Lso;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lso$d;

    iget-object v1, p0, Lso$a;->b:Lso;

    invoke-direct {v0, v1}, Lso$d;-><init>(Lso;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lso$a;->b:Lso;

    iget v0, v0, LNA5;->d:I

    return v0
.end method
