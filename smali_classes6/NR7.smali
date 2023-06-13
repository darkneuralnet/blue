.class public final LNR7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM99;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LM99<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public constructor <init>(LdS7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, LNR7;->a:Ljava/lang/String;

    iput-object p3, p0, LNR7;->b:Ljava/lang/String;

    iput-object p4, p0, LNR7;->c:Ljava/lang/String;

    iput-object p5, p0, LNR7;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    return-void
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Ljava/lang/Void;

    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    iget-object v1, p0, LNR7;->b:Ljava/lang/String;

    aput-object v1, p1, v0

    const/4 v0, 0x1

    iget-object v1, p0, LNR7;->c:Ljava/lang/String;

    aput-object v1, p1, v0

    const/4 v0, 0x2

    iget-object v1, p0, LNR7;->d:Ljava/lang/String;

    aput-object v1, p1, v0

    const-string v0, "A session storage token (%s) is stored for key: %s:%s"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    return-void
.end method
