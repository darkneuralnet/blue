.class public Lb31;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:J

.field public d:J

.field public e:I

.field public final f:I

.field public final g:I

.field public h:[I

.field public final i:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJIII[ILjava/util/TreeMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJIII[I",
            "Ljava/util/TreeMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb31;->a:Ljava/lang/String;

    iput-object p2, p0, Lb31;->b:Ljava/lang/String;

    iput-wide p3, p0, Lb31;->c:J

    iput-wide p5, p0, Lb31;->d:J

    iput p7, p0, Lb31;->e:I

    iput p8, p0, Lb31;->f:I

    iput p9, p0, Lb31;->g:I

    iput-object p10, p0, Lb31;->h:[I

    iput-object p11, p0, Lb31;->i:Ljava/util/TreeMap;

    return-void
.end method
