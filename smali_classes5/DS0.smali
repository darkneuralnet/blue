.class public LDS0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz41$b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DataType:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lz41$b;"
    }
.end annotation


# instance fields
.field public final a:Lmb1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmb1<",
            "TDataType;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TDataType;"
        }
    .end annotation
.end field

.field public final c:Lsy3;


# direct methods
.method public constructor <init>(Lmb1;Ljava/lang/Object;Lsy3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmb1<",
            "TDataType;>;TDataType;",
            "Lsy3;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDS0;->a:Lmb1;

    iput-object p2, p0, LDS0;->b:Ljava/lang/Object;

    iput-object p3, p0, LDS0;->c:Lsy3;

    return-void
.end method


# virtual methods
.method public a(Ljava/io/File;)Z
    .locals 3

    iget-object v0, p0, LDS0;->a:Lmb1;

    iget-object v1, p0, LDS0;->b:Ljava/lang/Object;

    iget-object v2, p0, LDS0;->c:Lsy3;

    invoke-interface {v0, v1, p1, v2}, Lmb1;->b(Ljava/lang/Object;Ljava/io/File;Lsy3;)Z

    move-result p1

    return p1
.end method
