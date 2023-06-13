.class public Lyg2$a;
.super Lnv1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyg2;->j(Ljava/lang/Iterable;LwA1;)Ljava/lang/Iterable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnv1<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic c:Ljava/lang/Iterable;

.field public final synthetic d:LwA1;


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;LwA1;)V
    .locals 0

    iput-object p1, p0, Lyg2$a;->c:Ljava/lang/Iterable;

    iput-object p2, p0, Lyg2$a;->d:LwA1;

    invoke-direct {p0}, Lnv1;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lyg2$a;->c:Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iget-object v1, p0, Lyg2$a;->d:LwA1;

    invoke-static {v0, v1}, Lzg2;->u(Ljava/util/Iterator;LwA1;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
