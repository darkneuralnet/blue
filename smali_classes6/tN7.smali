.class public final synthetic LtN7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYH8;


# instance fields
.field public final synthetic a:LOU7;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic c:Lz18;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LOU7;Ljava/util/concurrent/atomic/AtomicReference;Lz18;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LtN7;->a:LOU7;

    iput-object p2, p0, LtN7;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, LtN7;->c:Lz18;

    iput-object p4, p0, LtN7;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LtN7;->a:LOU7;

    iget-object v1, p0, LtN7;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v2, p0, LtN7;->c:Lz18;

    iget-object v3, p0, LtN7;->d:Ljava/lang/String;

    check-cast p1, Lq28;

    invoke-virtual {p1}, Lq28;->E()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, LZP8;->y(Ljava/util/Collection;)LZP8;

    move-result-object v4

    invoke-virtual {p1}, Lq28;->B()Lsu9;

    move-result-object v5

    invoke-static {v4, v5}, LAT7;->c(LZP8;Lsu9;)LAT7;

    move-result-object v4

    invoke-virtual {v0, v4}, LOU7;->c(LAT7;)V

    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-virtual {v2}, LEm9;->q()Lbm9;

    move-result-object v0

    check-cast v0, LH08;

    invoke-virtual {v0, v3, p1}, LH08;->A(Ljava/lang/String;Lq28;)LH08;

    invoke-virtual {v0}, Lbm9;->q()LEm9;

    move-result-object p1

    check-cast p1, Lz18;

    return-object p1
.end method
