.class public Lzp0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LWO4;

.field public b:Ljava/lang/Boolean;

.field public c:Ljava/lang/Object;

.field public d:Z


# direct methods
.method public constructor <init>(LWO4;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lzp0;->b:Ljava/lang/Boolean;

    const/4 v0, 0x0

    iput-object v0, p0, Lzp0;->c:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lzp0;->d:Z

    iput-object p1, p0, Lzp0;->a:LWO4;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lzp0;->a:LWO4;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lzp0;->a:LWO4;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
