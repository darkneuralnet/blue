.class public abstract LJy8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LPC8;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "LPC8;",
        ">",
        "Ljava/lang/Object;",
        "LPC8;"
    }
.end annotation


# instance fields
.field public final b:LPC8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/UUID;

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;LPC8;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LJy8;->d:Ljava/lang/String;

    iput-object p2, p0, LJy8;->b:LPC8;

    invoke-interface {p2}, LPC8;->zzc()Ljava/util/UUID;

    move-result-object p1

    iput-object p1, p0, LJy8;->c:Ljava/util/UUID;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/UUID;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LJy8;->d:Ljava/lang/String;

    const/4 p1, 0x0

    iput-object p1, p0, LJy8;->b:LPC8;

    iput-object p2, p0, LJy8;->c:Ljava/util/UUID;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    invoke-static {p0}, LFE8;->f(LPC8;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, LFE8;->d(LPC8;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()LPC8;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LJy8;->b:LPC8;

    return-object v0
.end method

.method public final zzb()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LJy8;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final zzc()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, LJy8;->c:Ljava/util/UUID;

    return-object v0
.end method
