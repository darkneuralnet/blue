.class public final LFm9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLD8;


# static fields
.field public static final c:LFm9;


# instance fields
.field public final b:LLD8;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LFm9;

    invoke-direct {v0}, LFm9;-><init>()V

    sput-object v0, LFm9;->c:LFm9;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, LRm9;

    invoke-direct {v0}, LRm9;-><init>()V

    invoke-static {v0}, LRE8;->b(Ljava/lang/Object;)LLD8;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, LRE8;->a(LLD8;)LLD8;

    move-result-object v0

    iput-object v0, p0, LFm9;->b:LLD8;

    return-void
.end method

.method public static b()Z
    .locals 1

    sget-object v0, LFm9;->c:LFm9;

    invoke-virtual {v0}, LFm9;->a()LLm9;

    move-result-object v0

    invoke-interface {v0}, LLm9;->zza()Z

    const/4 v0, 0x1

    return v0
.end method

.method public static c()Z
    .locals 1

    sget-object v0, LFm9;->c:LFm9;

    invoke-virtual {v0}, LFm9;->a()LLm9;

    move-result-object v0

    invoke-interface {v0}, LLm9;->zzb()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final a()LLm9;
    .locals 1

    iget-object v0, p0, LFm9;->b:LLD8;

    invoke-interface {v0}, LLD8;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLm9;

    return-object v0
.end method

.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LFm9;->a()LLm9;

    move-result-object v0

    return-object v0
.end method
