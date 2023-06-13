.class public Lzg2$c;
.super Lv96;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzg2;->u(Ljava/util/Iterator;LwA1;)Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv96<",
        "TF;TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic c:LwA1;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;LwA1;)V
    .locals 0

    iput-object p2, p0, Lzg2$c;->c:LwA1;

    invoke-direct {p0, p1}, Lv96;-><init>(Ljava/util/Iterator;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lzg2$c;->c:LwA1;

    invoke-interface {v0, p1}, LwA1;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
