.class public final LsI8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LhR8;

.field public final b:LIH8;

.field public final c:LEG8;

.field public final d:LWC8;


# direct methods
.method public synthetic constructor <init>(LUH8;LgI8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LUH8;->i(LUH8;)LhR8;

    move-result-object p2

    iput-object p2, p0, LsI8;->a:LhR8;

    invoke-static {p1}, LUH8;->c(LUH8;)LIH8;

    move-result-object p2

    iput-object p2, p0, LsI8;->b:LIH8;

    invoke-static {p1}, LUH8;->b(LUH8;)LEG8;

    move-result-object p2

    iput-object p2, p0, LsI8;->c:LEG8;

    invoke-static {p1}, LUH8;->a(LUH8;)LWC8;

    move-result-object p1

    iput-object p1, p0, LsI8;->d:LWC8;

    return-void
.end method


# virtual methods
.method public final a()LWC8;
    .locals 1
    .annotation build LHR7;
        zza = 0x3c
    .end annotation

    iget-object v0, p0, LsI8;->d:LWC8;

    return-object v0
.end method

.method public final b()LEG8;
    .locals 1
    .annotation build LHR7;
        zza = 0x3d
    .end annotation

    iget-object v0, p0, LsI8;->c:LEG8;

    return-object v0
.end method

.method public final c()LIH8;
    .locals 1
    .annotation build LHR7;
        zza = 0x2
    .end annotation

    iget-object v0, p0, LsI8;->b:LIH8;

    return-object v0
.end method

.method public final d()LhR8;
    .locals 1
    .annotation build LHR7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LsI8;->a:LhR8;

    return-object v0
.end method
