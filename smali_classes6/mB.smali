.class public abstract LmB;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAg2;


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lhh2;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LBg2;


# direct methods
.method public constructor <init>(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lhh2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LBg2;

    invoke-direct {v0}, LBg2;-><init>()V

    iput-object v0, p0, LmB;->b:LBg2;

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, LmB;->a:Ljava/util/Set;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The supported JWS algorithm set must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public c()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lhh2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LmB;->a:Ljava/util/Set;

    return-object v0
.end method

.method public getJCAContext()LBg2;
    .locals 1

    iget-object v0, p0, LmB;->b:LBg2;

    return-object v0
.end method
