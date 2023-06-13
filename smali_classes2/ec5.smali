.class public Lec5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LzA0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LGe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGe<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;LGe;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LGe<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lec5;->a:Ljava/lang/String;

    iput-object p2, p0, Lec5;->b:LGe;

    return-void
.end method


# virtual methods
.method public a(LRD2;LrD2;LqB;)LVz0;
    .locals 0

    new-instance p2, Lfc5;

    invoke-direct {p2, p1, p3, p0}, Lfc5;-><init>(LRD2;LqB;Lec5;)V

    return-object p2
.end method

.method public b()LGe;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LGe<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lec5;->b:LGe;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lec5;->a:Ljava/lang/String;

    return-object v0
.end method
