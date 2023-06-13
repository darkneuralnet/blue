.class public Lph5$b;
.super Lph5$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lph5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lph5$e<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lph5$c;Lph5$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lph5$c<",
            "TK;TV;>;",
            "Lph5$c<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lph5$e;-><init>(Lph5$c;Lph5$c;)V

    return-void
.end method


# virtual methods
.method public b(Lph5$c;)Lph5$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lph5$c<",
            "TK;TV;>;)",
            "Lph5$c<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object p1, p1, Lph5$c;->d:Lph5$c;

    return-object p1
.end method

.method public c(Lph5$c;)Lph5$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lph5$c<",
            "TK;TV;>;)",
            "Lph5$c<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object p1, p1, Lph5$c;->e:Lph5$c;

    return-object p1
.end method
