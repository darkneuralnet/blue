.class public final LOY8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LvY8;

.field public final b:Ljava/lang/Float;

.field public final c:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(LmY8;LEY8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LmY8;->d(LmY8;)LvY8;

    move-result-object p2

    iput-object p2, p0, LOY8;->a:LvY8;

    invoke-static {p1}, LmY8;->f(LmY8;)Ljava/lang/Float;

    move-result-object p2

    iput-object p2, p0, LOY8;->b:Ljava/lang/Float;

    invoke-static {p1}, LmY8;->g(LmY8;)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LOY8;->c:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final a()LvY8;
    .locals 1
    .annotation build LfR7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LOY8;->a:LvY8;

    return-object v0
.end method

.method public final b()Ljava/lang/Float;
    .locals 1
    .annotation build LfR7;
        zza = 0x2
    .end annotation

    iget-object v0, p0, LOY8;->b:Ljava/lang/Float;

    return-object v0
.end method

.method public final c()Ljava/lang/Integer;
    .locals 1
    .annotation build LfR7;
        zza = 0x3
    .end annotation

    iget-object v0, p0, LOY8;->c:Ljava/lang/Integer;

    return-object v0
.end method
