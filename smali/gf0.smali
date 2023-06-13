.class public Lgf0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lhf0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lhf0;

    invoke-static {v0}, LP21;->a(Ljava/lang/Class;)LSe4;

    move-result-object v0

    check-cast v0, Lhf0;

    iput-object v0, p0, Lgf0;->a:Lhf0;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lgf0;->a:Lhf0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lhf0;->d()I

    move-result v0

    :goto_0
    return v0
.end method
