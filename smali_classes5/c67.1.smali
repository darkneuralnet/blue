.class public final Lc67;
.super Lj67;
.source "SourceFile"


# instance fields
.field public final synthetic c:Ld67;


# direct methods
.method public constructor <init>(Ld67;Ljava/util/ListIterator;)V
    .locals 0

    iput-object p1, p0, Lc67;->c:Ld67;

    invoke-direct {p0, p2}, Lj67;-><init>(Ljava/util/ListIterator;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lc67;->c:Ld67;

    iget-object v0, v0, Ld67;->c:LF57;

    invoke-interface {v0, p1}, LF57;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
