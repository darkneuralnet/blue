.class public final LxK2$q;
.super LxK2$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LxK2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "q"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LxK2$q$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "LxK2$c<",
        "TK;TV;",
        "LxK2$q<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public volatile d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;ILxK2$q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I",
            "LxK2$q<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, LxK2$c;-><init>(Ljava/lang/Object;ILxK2$i;)V

    const/4 p1, 0x0

    iput-object p1, p0, LxK2$q;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public d(LxK2$q;)LxK2$q;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxK2$q<",
            "TK;TV;>;)",
            "LxK2$q<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, LxK2$q;

    iget-object v1, p0, LxK2$c;->a:Ljava/lang/Object;

    iget v2, p0, LxK2$c;->b:I

    invoke-direct {v0, v1, v2, p1}, LxK2$q;-><init>(Ljava/lang/Object;ILxK2$q;)V

    iget-object p1, p0, LxK2$q;->d:Ljava/lang/Object;

    iput-object p1, v0, LxK2$q;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public e(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    iput-object p1, p0, LxK2$q;->d:Ljava/lang/Object;

    return-void
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    iget-object v0, p0, LxK2$q;->d:Ljava/lang/Object;

    return-object v0
.end method
