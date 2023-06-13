.class public final Ly28;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LU18;

.field public final b:Ljava/lang/Integer;

.field public final c:LfI8;


# direct methods
.method public synthetic constructor <init>(Le18;Li28;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Le18;->d(Le18;)LU18;

    move-result-object p2

    iput-object p2, p0, Ly28;->a:LU18;

    invoke-static {p1}, Le18;->g(Le18;)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, Ly28;->b:Ljava/lang/Integer;

    invoke-static {p1}, Le18;->f(Le18;)LfI8;

    move-result-object p1

    iput-object p1, p0, Ly28;->c:LfI8;

    return-void
.end method


# virtual methods
.method public final a()LU18;
    .locals 1
    .annotation build LmW7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Ly28;->a:LU18;

    return-object v0
.end method

.method public final b()LfI8;
    .locals 1
    .annotation build LmW7;
        zza = 0x3
    .end annotation

    iget-object v0, p0, Ly28;->c:LfI8;

    return-object v0
.end method

.method public final c()Ljava/lang/Integer;
    .locals 1
    .annotation build LmW7;
        zza = 0x2
    .end annotation

    iget-object v0, p0, Ly28;->b:Ljava/lang/Integer;

    return-object v0
.end method
