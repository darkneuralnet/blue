.class public LVt4;
.super LJ83;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LJ83;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LyB0;)LD83;
    .locals 2

    new-instance v0, LUt4;

    new-instance v1, Ly91;

    invoke-direct {v1}, Ly91;-><init>()V

    invoke-direct {v0, p1, v1}, LUt4;-><init>(LyB0;Lz91;)V

    return-object v0
.end method
