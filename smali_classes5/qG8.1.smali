.class public final LqG8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LVT8;

.field public final b:LGF8;

.field public final c:LzE8;


# direct methods
.method public synthetic constructor <init>(LSF8;LeG8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LSF8;->g(LSF8;)LVT8;

    move-result-object p2

    iput-object p2, p0, LqG8;->a:LVT8;

    invoke-static {p1}, LSF8;->b(LSF8;)LGF8;

    move-result-object p2

    iput-object p2, p0, LqG8;->b:LGF8;

    invoke-static {p1}, LSF8;->a(LSF8;)LzE8;

    move-result-object p1

    iput-object p1, p0, LqG8;->c:LzE8;

    return-void
.end method


# virtual methods
.method public final a()LzE8;
    .locals 1
    .annotation build Lin7;
        zza = 0x32
    .end annotation

    iget-object v0, p0, LqG8;->c:LzE8;

    return-object v0
.end method

.method public final b()LGF8;
    .locals 1
    .annotation build Lin7;
        zza = 0x2
    .end annotation

    iget-object v0, p0, LqG8;->b:LGF8;

    return-object v0
.end method

.method public final c()LVT8;
    .locals 1
    .annotation build Lin7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LqG8;->a:LVT8;

    return-object v0
.end method
