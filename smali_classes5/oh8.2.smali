.class public final Loh8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LJg8;

.field public final b:Ljava/lang/Integer;

.field public final c:LZR8;


# direct methods
.method public synthetic constructor <init>(LOf8;LYg8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LOf8;->d(LOf8;)LJg8;

    move-result-object p2

    iput-object p2, p0, Loh8;->a:LJg8;

    invoke-static {p1}, LOf8;->g(LOf8;)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, Loh8;->b:Ljava/lang/Integer;

    invoke-static {p1}, LOf8;->f(LOf8;)LZR8;

    move-result-object p1

    iput-object p1, p0, Loh8;->c:LZR8;

    return-void
.end method


# virtual methods
.method public final a()LJg8;
    .locals 1
    .annotation build LfR7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Loh8;->a:LJg8;

    return-object v0
.end method

.method public final b()LZR8;
    .locals 1
    .annotation build LfR7;
        zza = 0x3
    .end annotation

    iget-object v0, p0, Loh8;->c:LZR8;

    return-object v0
.end method

.method public final c()Ljava/lang/Integer;
    .locals 1
    .annotation build LfR7;
        zza = 0x2
    .end annotation

    iget-object v0, p0, Loh8;->b:Ljava/lang/Integer;

    return-object v0
.end method
