.class public LY83$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOW3$a;
.implements LDl0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY83;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "LEl0;",
        ">",
        "Ljava/lang/Object;",
        "LOW3$a;",
        "LDl0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:LEl0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final b:LGW3;

.field public final c:Lcom/google/android/gms/maps/model/LatLng;

.field public d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LEl0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY83$a;->a:LEl0;

    invoke-interface {p1}, LEl0;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    iput-object v0, p0, LY83$a;->c:Lcom/google/android/gms/maps/model/LatLng;

    invoke-static {}, LY83;->a()LQN5;

    move-result-object v1

    invoke-virtual {v1, v0}, LQN5;->b(Lcom/google/android/gms/maps/model/LatLng;)LEW3;

    move-result-object v0

    iput-object v0, p0, LY83$a;->b:LGW3;

    invoke-static {p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, LY83$a;->d:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(LEl0;LX83;)V
    .locals 0

    invoke-direct {p0, p1}, LY83$a;-><init>(LEl0;)V

    return-void
.end method

.method public static bridge synthetic d(LY83$a;)LEl0;
    .locals 0

    iget-object p0, p0, LY83$a;->a:LEl0;

    return-object p0
.end method


# virtual methods
.method public a()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic b()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LY83$a;->e()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public c()LGW3;
    .locals 1

    iget-object v0, p0, LY83$a;->b:LGW3;

    return-object v0
.end method

.method public e()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LY83$a;->d:Ljava/util/Set;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LY83$a;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, LY83$a;

    iget-object p1, p1, LY83$a;->a:LEl0;

    iget-object v0, p0, LY83$a;->a:LEl0;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getPosition()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    iget-object v0, p0, LY83$a;->c:Lcom/google/android/gms/maps/model/LatLng;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LY83$a;->a:LEl0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
