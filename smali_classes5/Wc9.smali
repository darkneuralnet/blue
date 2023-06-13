.class public final LWc9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLD8;


# static fields
.field public static final c:LWc9;


# instance fields
.field public final b:LLD8;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LWc9;

    invoke-direct {v0}, LWc9;-><init>()V

    sput-object v0, LWc9;->c:LWc9;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, LNd9;

    invoke-direct {v0}, LNd9;-><init>()V

    invoke-static {v0}, LRE8;->b(Ljava/lang/Object;)LLD8;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, LRE8;->a(LLD8;)LLD8;

    move-result-object v0

    iput-object v0, p0, LWc9;->b:LLD8;

    return-void
.end method

.method public static b()Z
    .locals 1

    sget-object v0, LWc9;->c:LWc9;

    invoke-virtual {v0}, LWc9;->a()Ldd9;

    move-result-object v0

    invoke-interface {v0}, Ldd9;->zza()Z

    const/4 v0, 0x1

    return v0
.end method

.method public static c()Z
    .locals 1

    sget-object v0, LWc9;->c:LWc9;

    invoke-virtual {v0}, LWc9;->a()Ldd9;

    move-result-object v0

    invoke-interface {v0}, Ldd9;->zzb()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final a()Ldd9;
    .locals 1

    iget-object v0, p0, LWc9;->b:LLD8;

    invoke-interface {v0}, LLD8;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldd9;

    return-object v0
.end method

.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LWc9;->a()Ldd9;

    move-result-object v0

    return-object v0
.end method
