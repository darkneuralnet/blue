.class public final LNb9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLD8;


# static fields
.field public static final c:LNb9;


# instance fields
.field public final b:LLD8;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LNb9;

    invoke-direct {v0}, LNb9;-><init>()V

    sput-object v0, LNb9;->c:LNb9;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lbc9;

    invoke-direct {v0}, Lbc9;-><init>()V

    invoke-static {v0}, LRE8;->b(Ljava/lang/Object;)LLD8;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, LRE8;->a(LLD8;)LLD8;

    move-result-object v0

    iput-object v0, p0, LNb9;->b:LLD8;

    return-void
.end method

.method public static b()Z
    .locals 1

    sget-object v0, LNb9;->c:LNb9;

    invoke-virtual {v0}, LNb9;->a()LUb9;

    move-result-object v0

    invoke-interface {v0}, LUb9;->zza()Z

    const/4 v0, 0x1

    return v0
.end method

.method public static c()Z
    .locals 1

    sget-object v0, LNb9;->c:LNb9;

    invoke-virtual {v0}, LNb9;->a()LUb9;

    move-result-object v0

    invoke-interface {v0}, LUb9;->zzb()Z

    move-result v0

    return v0
.end method

.method public static d()Z
    .locals 1

    sget-object v0, LNb9;->c:LNb9;

    invoke-virtual {v0}, LNb9;->a()LUb9;

    move-result-object v0

    invoke-interface {v0}, LUb9;->zzc()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final a()LUb9;
    .locals 1

    iget-object v0, p0, LNb9;->b:LLD8;

    invoke-interface {v0}, LLD8;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LUb9;

    return-object v0
.end method

.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LNb9;->a()LUb9;

    move-result-object v0

    return-object v0
.end method
