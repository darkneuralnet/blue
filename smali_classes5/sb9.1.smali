.class public final Lsb9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLD8;


# static fields
.field public static final c:Lsb9;


# instance fields
.field public final b:LLD8;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsb9;

    invoke-direct {v0}, Lsb9;-><init>()V

    sput-object v0, Lsb9;->c:Lsb9;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, LGb9;

    invoke-direct {v0}, LGb9;-><init>()V

    invoke-static {v0}, LRE8;->b(Ljava/lang/Object;)LLD8;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, LRE8;->a(LLD8;)LLD8;

    move-result-object v0

    iput-object v0, p0, Lsb9;->b:LLD8;

    return-void
.end method

.method public static a()J
    .locals 2

    sget-object v0, Lsb9;->c:Lsb9;

    invoke-virtual {v0}, Lsb9;->b()Lzb9;

    move-result-object v0

    invoke-interface {v0}, Lzb9;->zza()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final b()Lzb9;
    .locals 1

    iget-object v0, p0, Lsb9;->b:LLD8;

    invoke-interface {v0}, LLD8;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzb9;

    return-object v0
.end method

.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lsb9;->b()Lzb9;

    move-result-object v0

    return-object v0
.end method
