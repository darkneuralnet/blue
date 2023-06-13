.class public final LL39;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LFU8;

.field public final b:LmT8;

.field public final c:LX29;

.field public final d:Lbw7;


# direct methods
.method public synthetic constructor <init>(Lt39;LC39;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lt39;->c(Lt39;)LFU8;

    move-result-object p2

    iput-object p2, p0, LL39;->a:LFU8;

    invoke-static {p1}, Lt39;->b(Lt39;)LmT8;

    move-result-object p2

    iput-object p2, p0, LL39;->b:LmT8;

    invoke-static {p1}, Lt39;->d(Lt39;)LX29;

    move-result-object p2

    iput-object p2, p0, LL39;->c:LX29;

    invoke-static {p1}, Lt39;->a(Lt39;)Lbw7;

    move-result-object p1

    iput-object p1, p0, LL39;->d:Lbw7;

    return-void
.end method


# virtual methods
.method public final a()Lbw7;
    .locals 1
    .annotation build LfR7;
        zza = 0x4
    .end annotation

    iget-object v0, p0, LL39;->d:Lbw7;

    return-object v0
.end method

.method public final b()LmT8;
    .locals 1
    .annotation build LfR7;
        zza = 0x2
    .end annotation

    iget-object v0, p0, LL39;->b:LmT8;

    return-object v0
.end method

.method public final c()LFU8;
    .locals 1
    .annotation build LfR7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LL39;->a:LFU8;

    return-object v0
.end method

.method public final d()LX29;
    .locals 1
    .annotation build LfR7;
        zza = 0x3
    .end annotation

    iget-object v0, p0, LL39;->c:LX29;

    return-object v0
.end method
