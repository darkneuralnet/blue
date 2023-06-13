.class public final Lrw8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG08;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LG08<",
        "LFw8;",
        ">;"
    }
.end annotation


# static fields
.field public static final c:Lrw8;


# instance fields
.field public final b:LG08;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LG08<",
            "LFw8;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrw8;

    invoke-direct {v0}, Lrw8;-><init>()V

    sput-object v0, Lrw8;->c:Lrw8;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lfx8;

    invoke-direct {v0}, Lfx8;-><init>()V

    invoke-static {v0}, LL18;->b(Ljava/lang/Object;)LG08;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, LL18;->a(LG08;)LG08;

    move-result-object v0

    iput-object v0, p0, Lrw8;->b:LG08;

    return-void
.end method

.method public static a()Lew8;
    .locals 1

    sget-object v0, Lrw8;->c:Lrw8;

    invoke-virtual {v0}, Lrw8;->b()LFw8;

    move-result-object v0

    invoke-interface {v0}, LFw8;->zza()Lew8;

    move-result-object v0

    return-object v0
.end method

.method public static c()Z
    .locals 1

    sget-object v0, Lrw8;->c:Lrw8;

    invoke-virtual {v0}, Lrw8;->b()LFw8;

    move-result-object v0

    invoke-interface {v0}, LFw8;->zzb()Z

    move-result v0

    return v0
.end method

.method public static d()Z
    .locals 1

    sget-object v0, Lrw8;->c:Lrw8;

    invoke-virtual {v0}, Lrw8;->b()LFw8;

    move-result-object v0

    invoke-interface {v0}, LFw8;->zzc()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final b()LFw8;
    .locals 1

    iget-object v0, p0, Lrw8;->b:LG08;

    invoke-interface {v0}, LG08;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFw8;

    return-object v0
.end method

.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lrw8;->b()LFw8;

    move-result-object v0

    return-object v0
.end method
